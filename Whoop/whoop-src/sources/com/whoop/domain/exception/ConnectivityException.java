package com.whoop.domain.exception;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/domain/exception/ConnectivityException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorMessage", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConnectivityException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityException(String errorMessage, Throwable th3) {
        super(errorMessage, th3);
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
    }

    public /* synthetic */ ConnectivityException(String str, Throwable th3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : th3);
    }
}
