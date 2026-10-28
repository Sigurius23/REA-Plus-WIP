package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes6.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable th3) {
        String simpleName = th3.getClass().getSimpleName();
        String message = th3.getMessage();
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(simpleName.length() + 13, message));
        sb4.append("Unexpected ");
        sb4.append(simpleName);
        sb4.append(": ");
        sb4.append(message);
        super(sb4.toString(), th3);
    }
}
