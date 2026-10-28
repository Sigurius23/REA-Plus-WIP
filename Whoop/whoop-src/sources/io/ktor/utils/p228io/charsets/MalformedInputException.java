package io.ktor.utils.p228io.charsets;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lio/ktor/utils/io/charsets/MalformedInputException;", "Ljava/nio/charset/MalformedInputException;", "ktor-io"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    /* JADX INFO: renamed from: w */
    public final String f75004w;

    public MalformedInputException(String str) {
        super(0);
        this.f75004w = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f75004w;
    }
}
