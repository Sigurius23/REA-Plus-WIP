package com.google.android.exoplayer2;

import p465rm.InterfaceC31529f;

/* JADX INFO: loaded from: classes6.dex */
public class PlaybackException extends Exception implements InterfaceC31529f {

    /* JADX INFO: renamed from: w */
    public final int f20374w;

    /* JADX INFO: renamed from: x */
    public final long f20375x;

    public PlaybackException(String str, Throwable th3, int i13, long j7) {
        super(str, th3);
        this.f20374w = i13;
        this.f20375x = j7;
    }
}
