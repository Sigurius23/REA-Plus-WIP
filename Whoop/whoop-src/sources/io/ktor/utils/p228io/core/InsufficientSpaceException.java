package io.ktor.utils.p228io.core;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/utils/io/core/InsufficientSpaceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-io"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class InsufficientSpaceException extends Exception {
    public InsufficientSpaceException() {
        this("Not enough free space");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String message) {
        super(message);
        AbstractC22676k.m65750j(message, "message");
    }

    public InsufficientSpaceException(String str, int i13, int i14) {
        this(AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "Not enough free space to write ", str, " of ", " bytes, available "), i14, " bytes."));
    }
}
