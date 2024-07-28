package DIO.WB.Santander_API_REST.service;

import DIO.WB.Santander_API_REST.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}