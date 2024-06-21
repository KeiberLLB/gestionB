package com.gestionBiblioteca.gestionB.infrastructure.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestionBiblioteca.gestionB.infrastructure.abstract_services.IBookService;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BookService implements IBookService {

}
