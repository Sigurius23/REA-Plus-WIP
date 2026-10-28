package io.getstream.chat.android.client.api.state;

import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0005R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u001e\u0010&\u001a\u0004\u0018\u00010!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "", "Lec3/f2;", "", "getRecoveryNeeded", "()Lec3/f2;", "recoveryNeeded", "Lio/getstream/chat/android/models/FilterObject;", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "getCurrentRequest", "currentRequest", "getNextPageRequest", "nextPageRequest", "getLoading", "loading", "getLoadingMore", "loadingMore", "getEndOfChannels", "endOfChannels", "", "getChannels", "channels", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "getChannelsStateData", "channelsStateData", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "getChatEventHandlerFactory", "()Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "setChatEventHandlerFactory", "(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V", "chatEventHandlerFactory", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QueryChannelsState {
    InterfaceC13037f2 getChannels();

    InterfaceC13037f2 getChannelsStateData();

    ChatEventHandlerFactory getChatEventHandlerFactory();

    InterfaceC13037f2 getCurrentRequest();

    InterfaceC13037f2 getEndOfChannels();

    FilterObject getFilter();

    InterfaceC13037f2 getLoading();

    InterfaceC13037f2 getLoadingMore();

    InterfaceC13037f2 getNextPageRequest();

    InterfaceC13037f2 getRecoveryNeeded();

    QuerySorter<Channel> getSort();

    void setChatEventHandlerFactory(ChatEventHandlerFactory chatEventHandlerFactory);
}
