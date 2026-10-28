package androidx.media3.exoplayer.audio;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p516u8.C34610p;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSink$InitializationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final int f6379w;

    /* JADX INFO: renamed from: x */
    public final boolean f6380x;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i13, int i14, int i15, int i16, C34610p c34610p, boolean z4, RuntimeException runtimeException) {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "AudioTrack init failed ", " Config(", ", ");
        AbstractC30802r.m94773v(sbM30465s, i15, ", ", i16, ") ");
        sbM30465s.append(c34610p);
        sbM30465s.append(z4 ? " (recoverable)" : "");
        super(sbM30465s.toString(), runtimeException);
        this.f6379w = i13;
        this.f6380x = z4;
    }
}
