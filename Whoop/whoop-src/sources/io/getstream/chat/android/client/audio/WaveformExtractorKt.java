package io.getstream.chat.android.client.audio;

import android.media.MediaCodec;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"isEof", "", "Landroid/media/MediaCodec$BufferInfo;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class WaveformExtractorKt {
    public static final boolean isEof(MediaCodec.BufferInfo bufferInfo) {
        AbstractC22676k.m65750j(bufferInfo, "<this>");
        return (bufferInfo.flags & 4) != 0;
    }
}
