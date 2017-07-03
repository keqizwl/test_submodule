package com.zwl.baseframe.implementz.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author velen
 * @date 2017/3/23
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface AppScope {
}
