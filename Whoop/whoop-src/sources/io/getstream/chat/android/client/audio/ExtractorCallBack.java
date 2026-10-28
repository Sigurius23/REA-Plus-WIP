package io.getstream.chat.android.client.audio;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/ExtractorCallBack;", "", "Lio/getstream/chat/android/client/audio/WaveformExtractor;", "extractor", "", "value", "Ll83/a0;", "onProgress", "(Lio/getstream/chat/android/client/audio/WaveformExtractor;F)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ExtractorCallBack {
    void onProgress(WaveformExtractor extractor, float value);
}
