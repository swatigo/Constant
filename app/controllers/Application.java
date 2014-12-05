package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static site index() {
        System.out.print("hello");
        System.out.print("where are you");
        return ok(index.render("Your new application is ready."));
    }

}
