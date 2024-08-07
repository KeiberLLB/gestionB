package com.gestionBiblioteca.gestionB.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.gestionBiblioteca.gestionB.api.dto.request.UserRQ;
import com.gestionBiblioteca.gestionB.api.dto.response.UserResponse;
import com.gestionBiblioteca.gestionB.domain.entities.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(target = "id", ignore = true)
  UserEntity toUSer(UserRQ userRequest);
  UserResponse toUserResponse(UserEntity userEntity);
  void updateUser(UserRQ userRequest, @MappingTarget UserEntity userEntity);
}
