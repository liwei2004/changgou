package com.changgou.test;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class TestBcrypt {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            //获取盐
            String gensalt = BCrypt.gensalt();
            System.out.println("盐:"+gensalt);  //随机字符串，长度29

            //基于当前的盐对密码进行加密
            String saltPassword = BCrypt.hashpw("123456", gensalt);
            System.out.println("加密后的密文:"+saltPassword);


            //解密  会将“123456”进行加密，然后和saltPassword进行比较返回布尔值
            boolean checkpw = BCrypt.checkpw("123456", saltPassword);
            System.out.println("密码校验结果:"+checkpw);
        }

    }
}
