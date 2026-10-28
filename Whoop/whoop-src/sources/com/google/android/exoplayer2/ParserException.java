package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: w */
    public final boolean f20372w;

    /* JADX INFO: renamed from: x */
    public final int f20373x;

    public ParserException(String str, Throwable th3, boolean z4, int i13) {
        super(str, th3);
        this.f20372w = z4;
        this.f20373x = i13;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m15562a(Exception exc, String str) {
        return new ParserException(str, exc, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m15563b(String str) {
        return new ParserException(str, null, true, 4);
    }

    /* JADX INFO: renamed from: c */
    public static ParserException m15564c(String str) {
        return new ParserException(str, null, false, 1);
    }
}
