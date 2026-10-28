package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import p031b9.AbstractC2875y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import q63.AbstractC30007c;
import sn.C32759t;

/* JADX INFO: loaded from: classes6.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: E */
    public final int f20365E;

    /* JADX INFO: renamed from: F */
    public final C31521c0 f20366F;

    /* JADX INFO: renamed from: G */
    public final int f20367G;

    /* JADX INFO: renamed from: H */
    public final C32759t f20368H;

    /* JADX INFO: renamed from: I */
    public final boolean f20369I;

    /* JADX INFO: renamed from: y */
    public final int f20370y;

    /* JADX INFO: renamed from: z */
    public final String f20371z;

    public ExoPlaybackException(int i13, Exception exc, int i14) {
        this(i13, exc, i14, null, -1, null, 4, false);
    }

    /* JADX INFO: renamed from: a */
    public final ExoPlaybackException m15561a(C32759t c32759t) {
        String message = getMessage();
        int i13 = AbstractC24567y.f95875a;
        return new ExoPlaybackException(message, getCause(), this.f20374w, this.f20370y, this.f20371z, this.f20365E, this.f20366F, this.f20367G, c32759t, this.f20375x, this.f20369I);
    }

    public ExoPlaybackException(String str, Throwable th3, int i13, int i14, String str2, int i15, C31521c0 c31521c0, int i16, C32759t c32759t, long j7, boolean z4) {
        super(str, th3, i13, j7);
        AbstractC24543a.m71569e(!z4 || i14 == 1);
        AbstractC24543a.m71569e(th3 != null || i14 == 3);
        this.f20370y = i14;
        this.f20371z = str2;
        this.f20365E = i15;
        this.f20366F = c31521c0;
        this.f20367G = i16;
        this.f20368H = c32759t;
        this.f20369I = z4;
    }

    public ExoPlaybackException(int i13, Throwable th3, int i14, String str, int i15, C31521c0 c31521c0, int i16, boolean z4) {
        int i17;
        String string;
        String str2;
        if (i13 == 0) {
            i17 = i15;
            string = "Source error";
        } else if (i13 != 1) {
            if (i13 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            i17 = i15;
        } else {
            String strValueOf = String.valueOf(c31521c0);
            int i18 = AbstractC24567y.f95875a;
            if (i16 == 0) {
                str2 = "NO";
            } else if (i16 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i16 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i16 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i16 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            StringBuilder sb4 = new StringBuilder(str2.length() + strValueOf.length() + AbstractC30007c.m91832b(53, str));
            sb4.append(str);
            sb4.append(" error, index=");
            i17 = i15;
            sb4.append(i17);
            sb4.append(", format=");
            string = AbstractC2875y.m8304q(sb4, strValueOf, ", format_supported=", str2);
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb5 = new StringBuilder("null".length() + strValueOf2.length() + 2);
            sb5.append(strValueOf2);
            sb5.append(": null");
            string = sb5.toString();
        }
        this(string, th3, i14, i13, str, i17, c31521c0, i16, null, SystemClock.elapsedRealtime(), z4);
    }
}
