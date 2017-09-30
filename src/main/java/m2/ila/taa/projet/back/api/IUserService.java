package m2.ila.taa.projet.back.api;

import org.springframework.transaction.annotation.Transactional;

import m2.ila.taa.projet.back.model.User;

@Transactional
public interface IUserService extends IService<User> {

}