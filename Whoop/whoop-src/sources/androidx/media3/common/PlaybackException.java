package androidx.media3.common;

import p607x8.AbstractC38065t;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes5.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: w */
    public final int f6365w;

    /* JADX INFO: renamed from: x */
    public final long f6366x;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC38065t.m121892F(5);
    }

    public PlaybackException(String str, Throwable th3, int i13, long j7) {
        super(str, th3);
        this.f6365w = i13;
        this.f6366x = j7;
    }
}
