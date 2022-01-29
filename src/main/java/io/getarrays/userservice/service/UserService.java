package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleRoUser(String username, String roleName);
    User getUser(String username);
    // 보통 모든 유저를 돌려받지 않고 페이지별로 유저를 response한다.
    List<User> getUsers();
}
