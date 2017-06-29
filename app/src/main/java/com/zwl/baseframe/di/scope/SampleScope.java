package com.zwl.baseframe.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author velen
 * @date 2017/3/23
 */
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface SampleScope {
}
