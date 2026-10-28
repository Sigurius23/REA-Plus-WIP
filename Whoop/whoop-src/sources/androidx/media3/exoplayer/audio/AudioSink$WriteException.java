package androidx.media3.exoplayer.audio;

import p031b9.AbstractC2875y;
import p516u8.C34610p;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSink$WriteException extends Exception {

    /* JADX INFO: renamed from: w */
    public final int f6381w;

    /* JADX INFO: renamed from: x */
    public final boolean f6382x;

    /* JADX INFO: renamed from: y */
    public final C34610p f6383y;

    public AudioSink$WriteException(int i13, C34610p c34610p, boolean z4) {
        super(AbstractC2875y.m8295h(i13, "AudioTrack write failed: "));
        this.f6382x = z4;
        this.f6381w = i13;
        this.f6383y = c34610p;
    }
}
