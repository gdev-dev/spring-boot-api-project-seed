package dev.gdev.cloud.service.impl;

import dev.gdev.cloud.dao.UserMapper;
import dev.gdev.cloud.model.User;
import dev.gdev.cloud.service.UserService;
import dev.gdev.cloud.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/02.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
