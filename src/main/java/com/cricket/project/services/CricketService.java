package com.cricket.project.services;

import com.cricket.project.entities.Cricket;

import java.util.List;
import java.util.Map;

public interface CricketService {
    List<Cricket> getAllMatches();
    List<Cricket> getLiveMatches();
    List<List<String>> getPointTable();
}
