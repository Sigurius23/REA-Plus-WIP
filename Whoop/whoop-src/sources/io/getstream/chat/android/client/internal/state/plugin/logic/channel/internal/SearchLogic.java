package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "mutableState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;)V", "", "isInsideSearch", "Ll83/a0;", "updateSearchState", "(Z)V", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "noMoreMessages", "handleMessageBounds", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "Z", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchLogic {
    private boolean isInsideSearch;
    private final ChannelStateLegacyImpl mutableState;

    public SearchLogic(ChannelStateLegacyImpl mutableState) {
        AbstractC22676k.m65750j(mutableState, "mutableState");
        this.mutableState = mutableState;
    }

    private final void updateSearchState(boolean isInsideSearch) {
        this.isInsideSearch = isInsideSearch;
        this.mutableState.setInsideSearch(isInsideSearch);
    }

    public final void handleMessageBounds(QueryChannelRequest request, boolean noMoreMessages) {
        AbstractC22676k.m65750j(request, "request");
        if (!this.isInsideSearch && request.isFilteringAroundIdMessages()) {
            updateSearchState(true);
            return;
        }
        if (this.isInsideSearch && request.isFilteringNewerMessages() && noMoreMessages) {
            updateSearchState(false);
        } else {
            if (request.getIsNotificationUpdate() || request.isFilteringMessages() || request.messagesLimit() == 0) {
                return;
            }
            updateSearchState(false);
        }
    }
}
