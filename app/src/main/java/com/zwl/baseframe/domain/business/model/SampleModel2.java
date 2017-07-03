package com.zwl.baseframe.domain.business.model;

/**
 * @author velen
 * @date 2017/3/27
 */
public class SampleModel2 {
    private String name;
    private String email;

    public SampleModel2(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
