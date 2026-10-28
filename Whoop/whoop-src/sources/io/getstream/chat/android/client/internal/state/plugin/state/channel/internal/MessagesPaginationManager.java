package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.Message;
import n23.AbstractC26205h;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;", "", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Ll83/a0;", "begin", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "end", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V", "Lio/getstream/chat/android/models/Message;", "message", "setOldestMessage", "(Lio/getstream/chat/android/models/Message;)V", "setNewestMessage", "", "hasLoadedAll", "setEndOfOlderMessages", "(Z)V", "setEndOfNewerMessages", "reset", "()V", "Lec3/f2;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;", "getState", "()Lec3/f2;", "state", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessagesPaginationManager {
    void begin(QueryChannelRequest query);

    void end(QueryChannelRequest query, AbstractC26205h result);

    InterfaceC13037f2 getState();

    void reset();

    void setEndOfNewerMessages(boolean hasLoadedAll);

    void setEndOfOlderMessages(boolean hasLoadedAll);

    void setNewestMessage(Message message);

    void setOldestMessage(Message message);
}
