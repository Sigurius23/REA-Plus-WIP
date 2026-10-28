package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import p031b9.AbstractC2875y;
import p299l9.C23488c0;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes5.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: E */
    public final int f6371E;

    /* JADX INFO: renamed from: F */
    public final C34610p f6372F;

    /* JADX INFO: renamed from: G */
    public final int f6373G;

    /* JADX INFO: renamed from: H */
    public final C23488c0 f6374H;

    /* JADX INFO: renamed from: I */
    public final boolean f6375I;

    /* JADX INFO: renamed from: y */
    public final int f6376y;

    /* JADX INFO: renamed from: z */
    public final String f6377z;

    public ExoPlaybackException(int i13, Exception exc, int i14) {
        this(i13, exc, i14, null, -1, null, 4, false);
    }

    /* JADX INFO: renamed from: a */
    public final ExoPlaybackException m5054a(C23488c0 c23488c0) {
        String message = getMessage();
        int i13 = AbstractC38065t.f163031a;
        return new ExoPlaybackException(message, getCause(), this.f6365w, this.f6376y, this.f6377z, this.f6371E, this.f6372F, this.f6373G, c23488c0, this.f6366x, this.f6375I);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th3, int i13, int i14, String str2, int i15, C34610p c34610p, int i16, C23488c0 c23488c0, long j7, boolean z4) {
        super(str, th3, i13, j7);
        Bundle bundle = Bundle.EMPTY;
        AbstractC35849g.m113802d(!z4 || i14 == 1);
        AbstractC35849g.m113802d(th3 != null || i14 == 3);
        this.f6376y = i14;
        this.f6377z = str2;
        this.f6371E = i15;
        this.f6372F = c34610p;
        this.f6373G = i16;
        this.f6374H = c23488c0;
        this.f6375I = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i13, Exception exc, int i14, String str, int i15, C34610p c34610p, int i16, boolean z4) {
        String str2;
        int i17;
        C34610p c34610p2;
        String string;
        String str3;
        if (i13 == 0) {
            str2 = str;
            i17 = i15;
            c34610p2 = c34610p;
            string = "Source error";
        } else if (i13 != 1) {
            if (i13 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i17 = i15;
            c34610p2 = c34610p;
        } else {
            StringBuilder sb4 = new StringBuilder();
            str2 = str;
            sb4.append(str2);
            sb4.append(" error, index=");
            i17 = i15;
            sb4.append(i17);
            sb4.append(", format=");
            c34610p2 = c34610p;
            sb4.append(c34610p2);
            sb4.append(", format_supported=");
            int i18 = AbstractC38065t.f163031a;
            if (i16 == 0) {
                str3 = "NO";
            } else if (i16 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i16 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i16 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i16 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb4.append(str3);
            string = sb4.toString();
        }
        this(TextUtils.isEmpty(null) ? string : AbstractC2875y.m8299l(string, ": null"), exc, i14, i13, str2, i17, c34610p2, i16, null, SystemClock.elapsedRealtime(), z4);
    }
}
