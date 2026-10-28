package androidx.media3.common;

import ih0.AbstractC18489d0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: w */
    public final boolean f6363w;

    /* JADX INFO: renamed from: x */
    public final int f6364x;

    public ParserException(String str, Throwable th3, boolean z4, int i13) {
        super(str, th3);
        this.f6363w = z4;
        this.f6364x = i13;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m5049a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m5050b(Exception exc, String str) {
        return new ParserException(str, exc, true, 4);
    }

    /* JADX INFO: renamed from: c */
    public static ParserException m5051c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(message != null ? message.concat(" ") : "");
        sb4.append("{contentIsMalformed=");
        sb4.append(this.f6363w);
        sb4.append(", dataType=");
        return AbstractC18489d0.m53371l(sb4, this.f6364x, "}");
    }
}
