package io.getstream.chat.android.client.api.models;

import io.getstream.chat.android.client.api.models.ChannelRequest;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b`\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J\r\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\r\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\r\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\r\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\r\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/ChannelRequest;", "T", "", "state", "", "getState", "()Z", "setState", "(Z)V", "watch", "getWatch", "setWatch", "presence", "getPresence", "setPresence", "withWatch", "()Lio/getstream/chat/android/client/api/models/ChannelRequest;", "withState", "noWatch", "noState", "withPresence", "noPresence", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelRequest<T extends ChannelRequest<T>> {
    boolean getPresence();

    boolean getState();

    boolean getWatch();

    default T noPresence() {
        setPresence(false);
        return this;
    }

    default T noState() {
        setState(false);
        return this;
    }

    default T noWatch() {
        setWatch(false);
        return this;
    }

    void setPresence(boolean z4);

    void setState(boolean z4);

    void setWatch(boolean z4);

    default T withPresence() {
        setPresence(true);
        return this;
    }

    default T withState() {
        setState(true);
        return this;
    }

    default T withWatch() {
        setWatch(true);
        return this;
    }
}
