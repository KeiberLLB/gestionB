package com.gestionBiblioteca.gestionB.infrastructure.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestionBiblioteca.gestionB.infrastructure.abstract_services.ILoanService;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class LoanService implements ILoanService {
  
}
