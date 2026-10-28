package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import hn.C17504l;
import p309lo.AbstractC24567y;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, C17504l c17504l) {
        String strValueOf = String.valueOf(c17504l == null ? null : c17504l.f67657a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), illegalStateException);
        if (AbstractC24567y.f95875a < 21 || !(illegalStateException instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
    }
}
