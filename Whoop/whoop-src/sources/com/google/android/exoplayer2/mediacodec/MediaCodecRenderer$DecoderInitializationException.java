package com.google.android.exoplayer2.mediacodec;

import hn.C17504l;
import p465rm.C31521c0;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final String f20382w;

    /* JADX INFO: renamed from: x */
    public final boolean f20383x;

    /* JADX INFO: renamed from: y */
    public final C17504l f20384y;

    /* JADX INFO: renamed from: z */
    public final String f20385z;

    public MediaCodecRenderer$DecoderInitializationException(C31521c0 c31521c0, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z4, int i13) {
        String strValueOf = String.valueOf(c31521c0);
        StringBuilder sb4 = new StringBuilder(strValueOf.length() + 36);
        sb4.append("Decoder init failed: [");
        sb4.append(i13);
        sb4.append("], ");
        sb4.append(strValueOf);
        String string = sb4.toString();
        String str = c31521c0.f130077L;
        String str2 = i13 < 0 ? "neg_" : "";
        int iAbs = Math.abs(i13);
        StringBuilder sb5 = new StringBuilder(str2.length() + 71);
        sb5.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
        sb5.append(str2);
        sb5.append(iAbs);
        this(string, mediaCodecUtil$DecoderQueryException, str, z4, null, sb5.toString());
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th3, String str2, boolean z4, C17504l c17504l, String str3) {
        super(str, th3);
        this.f20382w = str2;
        this.f20383x = z4;
        this.f20384y = c17504l;
        this.f20385z = str3;
    }
}
