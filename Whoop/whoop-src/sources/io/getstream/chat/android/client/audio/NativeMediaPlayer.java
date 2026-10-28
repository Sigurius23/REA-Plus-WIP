package io.getstream.chat.android.client.audio;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.io.IOException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\bJ\u001d\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H&¢\u0006\u0004\b\u001a\u0010\u0015R\u001c\u0010 \u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/NativeMediaPlayer;", "", "", "path", "Ll83/a0;", "setDataSource", "(Ljava/lang/String;)V", "prepareAsync", "()V", "", "msec", "seekTo", "(I)V", "start", "pause", "stop", "reset", "release", "Lkotlin/Function0;", "listener", "setOnCompletionListener", "(Lc93/a;)V", "Lkotlin/Function1;", "", "setOnErrorListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnPreparedListener", "", "getSpeed", "()F", "setSpeed", "(F)V", "speed", "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "getState", "()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "state", "getCurrentPosition", "()I", "currentPosition", "getDuration", AttachmentExtensionsKt.EXTRA_DURATION, "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface NativeMediaPlayer {
    int getCurrentPosition();

    int getDuration();

    float getSpeed() throws IllegalStateException;

    NativeMediaPlayerState getState();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(int msec) throws IllegalStateException;

    void setDataSource(String path) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setOnCompletionListener(InterfaceC4339a listener);

    void setOnErrorListener(Function1 listener);

    void setOnPreparedListener(InterfaceC4339a listener);

    void setSpeed(float f13) throws IllegalStateException, IllegalArgumentException;

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;
}
