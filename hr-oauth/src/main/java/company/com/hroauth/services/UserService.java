package company.com.hroauth.services;

import company.com.hroauth.entities.User;
import company.com.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        User user = userFeignClient.findByEmail(email).getBody();
        if(user == null){
            logger.error("email not found " + email);
            throw new IllegalArgumentException("Email not found!");
        }
        logger.info("email found " + email);
        return user;
    }
}
