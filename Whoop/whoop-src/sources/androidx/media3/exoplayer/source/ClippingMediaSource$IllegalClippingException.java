package androidx.media3.exoplayer.source;

import java.io.IOException;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes5.dex */
public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public ClippingMediaSource$IllegalClippingException(int i13) {
        this(i13, -9223372036854775807L, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(int i13, long j7, long j13) {
        String str;
        StringBuilder sb4 = new StringBuilder("Illegal clipping: ");
        if (i13 != 0) {
            if (i13 == 1) {
                str = "not seekable to start";
            } else if (i13 != 2) {
                str = "unknown";
            } else {
                AbstractC35849g.m113807i((j7 == -9223372036854775807L || j13 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j7 + ", End time: " + j13;
            }
        } else {
            str = "invalid period count";
        }
        sb4.append(str);
        super(sb4.toString());
    }
}
