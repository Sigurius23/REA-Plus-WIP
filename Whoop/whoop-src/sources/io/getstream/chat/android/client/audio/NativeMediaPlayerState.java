package io.getstream.chat.android.client.audio;

import ge3.AbstractC15751g;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "INITIALIZED", "PREPARING", "PREPARED", "STARTED", "PAUSED", "STOPPED", "PLAYBACK_COMPLETED", "END", "ERROR", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public enum NativeMediaPlayerState {
    IDLE,
    INITIALIZED,
    PREPARING,
    PREPARED,
    STARTED,
    PAUSED,
    STOPPED,
    PLAYBACK_COMPLETED,
    END,
    ERROR;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
