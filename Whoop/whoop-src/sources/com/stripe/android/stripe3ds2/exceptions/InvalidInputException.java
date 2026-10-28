package com.stripe.android.stripe3ds2.exceptions;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class InvalidInputException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidInputException(String message) {
        super(message, null);
        AbstractC22676k.m65750j(message, "message");
    }
}
