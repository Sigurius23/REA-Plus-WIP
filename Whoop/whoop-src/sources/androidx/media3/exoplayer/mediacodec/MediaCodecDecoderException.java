package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p215i9.C18237m;
import p607x8.AbstractC38065t;

/* JADX INFO: loaded from: classes5.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: w */
    public final int f6393w;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, C18237m c18237m) {
        StringBuilder sb4 = new StringBuilder("Decoder failed: ");
        sb4.append(c18237m == null ? null : c18237m.f70948a);
        super(sb4.toString(), illegalStateException);
        boolean z4 = illegalStateException instanceof MediaCodec.CodecException;
        this.f6393w = AbstractC38065t.f163031a >= 23 ? z4 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC38065t.m121927t(z4 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
