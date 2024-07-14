package com.heydiecode.demojsf2;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Date;

@RequestScoped
@Named
public class AjaxBean extends HelloBean{

    public String getNow() {
        return new Date().toString();
    }
}
