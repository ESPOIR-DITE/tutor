package com.kaldit.tutor.service;

import java.util.List;

public interface Service <T,t>{
    T create(T t);
    List<T> realdAll();
}
