package com.example.tobispring.오브젝트와의존관계.test;

import com.example.tobispring.오브젝트와의존관계.dao.UserDao;
import com.example.tobispring.오브젝트와의존관계.domain.User;
import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("hello");
        user.setName("sangyunpark");
        user.setPassword("123123");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
    }
}
