package com.tejas.ipl.repository;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {
  List<Match> getByTeam1OrTeam2OrderByDateDesc(
    String teamName1,
    String teamName2,
    PageRequest pageable
  );

  List<com.tejas.ipl.model.Match> getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc(
    String teamName1,
    LocalDate date1,
    LocalDate date2,
    String TeamName2,
    LocalDate date3,
    LocalDate date4
  );

  default List<Match> findLatestMatchesbyTeam(String teamName, int count) {
    return getByTeam1OrTeam2OrderByDateDesc(
      teamName,
      teamName,
      PageRequest.of(0, count)
    );
  }
}
