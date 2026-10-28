package androidx.media3.exoplayer.mediacodec;

import p215i9.C18237m;
import p516u8.C34610p;

/* JADX INFO: loaded from: classes5.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final String f6394w;

    /* JADX INFO: renamed from: x */
    public final boolean f6395x;

    /* JADX INFO: renamed from: y */
    public final C18237m f6396y;

    /* JADX INFO: renamed from: z */
    public final String f6397z;

    public MediaCodecRenderer$DecoderInitializationException(C34610p c34610p, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z4, int i13) {
        this("Decoder init failed: [" + i13 + "], " + c34610p, mediaCodecUtil$DecoderQueryException, c34610p.f145783n, z4, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i13 < 0 ? "neg_" : "") + Math.abs(i13));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th3, String str2, boolean z4, C18237m c18237m, String str3) {
        super(str, th3);
        this.f6394w = str2;
        this.f6395x = z4;
        this.f6396y = c18237m;
        this.f6397z = str3;
    }
}
