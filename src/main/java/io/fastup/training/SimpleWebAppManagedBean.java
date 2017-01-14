package io.fastup.training;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.Serializable;

@Named
@RequestScoped
public class SimpleWebAppManagedBean implements Serializable {
    private String name;
    private Part file;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        name = "FastUp!!";
    }

    public Part getFile() {
        return file;
    }

    public void upload() {
        final String submittedFileName = file.getSubmittedFileName();
        System.out.println(submittedFileName);
    }

    public void setFile(Part file) {
        this.file = file;
    }
}