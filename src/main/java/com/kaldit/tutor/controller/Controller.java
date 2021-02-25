package com.kaldit.tutor.controller;

import java.util.List;

public interface Controller<T,t> {
    T create(T t);
    List<T> readAll();
}
