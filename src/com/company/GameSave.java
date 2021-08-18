package com.company;


import java.util.List;

public interface GameSave {
    List<String> save();
    void saveParameter(List<String> values);
}
