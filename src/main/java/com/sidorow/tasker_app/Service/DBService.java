//package com.sidorow.tasker_app.Service;
//
//import com.sidorow.tasker_app.Repository.Model.User;
//import com.sidorow.tasker_app.Repository.UserRepository;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DBService {
//
//    private final UserService userService;
//    private final UserRepository userRepository;
//
//    public DBService(UserService userService, UserRepository userRepository) {
//        this.userService = userService;
//        this.userRepository = userRepository;
//    }
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB() {
//        User emp1 = new User("warton@gmail.com","John", "Warton", "admin");
//        User emp2 = new User("lanister@gmail.com","Mike", "Lanister", "admin");
//        User emp3 = new User("Reeves@gmail.com","Steve", "Reeves","admin" );
//        User emp4 = new User("connor@gmail.com","Ronald", "Connor", "admin");
//        User emp5 = new User("Sal@gmail.com","Jim", "Salvator", "admin");
//        User emp6 = new User("henley@gmail.com","Peter", "Henley", "admin");
//        User emp7 = new User("carson@gmail.com","Richard", "Carson", "admin");
//        User emp8 = new User("miles@gmail.com","Honor", "Miles", "admin");
//        User emp9 = new User("roggers@gmail.com","Tony", "Roggers", "admin");
//        User emp10 = new User("admin@mail.com","admin", "admin", "admin");
//        User emp11 = new User("user@mail.com","user", "user", "user");
//
//        userService.createAdmin(emp10);
//        userService.createAdmin(emp2);
//        userService.createUser(emp11);
//        userService.createUser(emp3);
//        userRepository.save(emp1);
//    }
//}
