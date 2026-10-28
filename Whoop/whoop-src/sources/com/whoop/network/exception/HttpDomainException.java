package com.whoop.network.exception;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/network/exception/HttpDomainException;", "Lcom/whoop/network/exception/DomainException;", "exception", "Lretrofit2/HttpException;", "<init>", "(Lretrofit2/HttpException;)V", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HttpDomainException extends DomainException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpDomainException(HttpException exception) {
        super(DomainException.EnumC9607c.HTTP_ERROR, exception);
        AbstractC22676k.m65750j(exception, "exception");
    }
}
