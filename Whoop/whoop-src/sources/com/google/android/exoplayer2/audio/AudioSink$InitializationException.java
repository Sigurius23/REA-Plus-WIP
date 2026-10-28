package com.google.android.exoplayer2.audio;

import p319m4.AbstractC25012a;
import p465rm.C31521c0;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioSink$InitializationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final boolean f20377w;

    /* JADX INFO: renamed from: x */
    public final C31521c0 f20378x;

    public AudioSink$InitializationException(int i13, int i14, int i15, int i16, C31521c0 c31521c0, boolean z4, RuntimeException runtimeException) {
        String str = z4 ? " (recoverable)" : "";
        StringBuilder sb4 = new StringBuilder(str.length() + 80);
        sb4.append("AudioTrack init failed ");
        sb4.append(i13);
        sb4.append(" Config(");
        sb4.append(i14);
        sb4.append(", ");
        sb4.append(i15);
        sb4.append(", ");
        sb4.append(i16);
        super(AbstractC25012a.m73376i(")", str, sb4), runtimeException);
        this.f20377w = z4;
        this.f20378x = c31521c0;
    }
}
