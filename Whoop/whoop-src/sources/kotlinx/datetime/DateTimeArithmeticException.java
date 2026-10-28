package kotlinx.datetime;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlinx/datetime/DateTimeArithmeticException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class DateTimeArithmeticException extends RuntimeException {
    public DateTimeArithmeticException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeArithmeticException(Exception exc, String message) {
        super(message, exc);
        AbstractC22676k.m65750j(message, "message");
    }
}
