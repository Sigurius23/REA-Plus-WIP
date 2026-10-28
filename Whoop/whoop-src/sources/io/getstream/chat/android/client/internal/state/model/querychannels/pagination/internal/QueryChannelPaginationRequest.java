package io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal;

import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.WatchChannelRequest;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0005R \u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005R \u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\u0005R \u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\u0005¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "messageLimit", "", "<init>", "(I)V", "getMessageLimit", "()I", "setMessageLimit", "messageFilterDirection", "Lio/getstream/chat/android/client/api/models/Pagination;", "getMessageFilterDirection", "()Lio/getstream/chat/android/client/api/models/Pagination;", "setMessageFilterDirection", "(Lio/getstream/chat/android/client/api/models/Pagination;)V", "messageFilterValue", "", "getMessageFilterValue", "()Ljava/lang/String;", "setMessageFilterValue", "(Ljava/lang/String;)V", "memberLimit", "getMemberLimit$annotations", "()V", "getMemberLimit", "setMemberLimit", "memberOffset", "getMemberOffset$annotations", "getMemberOffset", "setMemberOffset", "watcherLimit", "getWatcherLimit$annotations", "getWatcherLimit", "setWatcherLimit", "watcherOffset", "getWatcherOffset$annotations", "getWatcherOffset", "setWatcherOffset", "hasFilter", "", "isFirstPage", "toAnyChannelPaginationRequest", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "toAnyChannelPaginationRequest$stream_chat_android_client_release", "toWatchChannelRequest", "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "userPresence", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelPaginationRequest extends QueryChannelRequest {
    private int memberLimit;
    private int memberOffset;
    private Pagination messageFilterDirection;
    private String messageFilterValue;
    private int messageLimit;
    private int watcherLimit;
    private int watcherOffset;

    public QueryChannelPaginationRequest() {
        this(0, 1, null);
    }

    public static /* synthetic */ void getMemberLimit$annotations() {
    }

    public static /* synthetic */ void getMemberOffset$annotations() {
    }

    public static /* synthetic */ void getWatcherLimit$annotations() {
    }

    public static /* synthetic */ void getWatcherOffset$annotations() {
    }

    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final int getMemberOffset() {
        return this.memberOffset;
    }

    public final Pagination getMessageFilterDirection() {
        return this.messageFilterDirection;
    }

    public final String getMessageFilterValue() {
        return this.messageFilterValue;
    }

    public final int getMessageLimit() {
        return this.messageLimit;
    }

    public final int getWatcherLimit() {
        return this.watcherLimit;
    }

    public final int getWatcherOffset() {
        return this.watcherOffset;
    }

    public final boolean hasFilter() {
        return this.messageFilterDirection != null;
    }

    public final boolean isFirstPage() {
        return this.messageFilterDirection == null;
    }

    public final void setMemberLimit(int i13) {
        this.memberLimit = i13;
    }

    public final void setMemberOffset(int i13) {
        this.memberOffset = i13;
    }

    public final void setMessageFilterDirection(Pagination pagination) {
        this.messageFilterDirection = pagination;
    }

    public final void setMessageFilterValue(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.messageFilterValue = str;
    }

    public final void setMessageLimit(int i13) {
        this.messageLimit = i13;
    }

    public final void setWatcherLimit(int i13) {
        this.watcherLimit = i13;
    }

    public final void setWatcherOffset(int i13) {
        this.watcherOffset = i13;
    }

    public final AnyChannelPaginationRequest toAnyChannelPaginationRequest$stream_chat_android_client_release() {
        AnyChannelPaginationRequest anyChannelPaginationRequest = new AnyChannelPaginationRequest(0, 1, null);
        anyChannelPaginationRequest.setMessageLimit(this.messageLimit);
        anyChannelPaginationRequest.setMessageFilterDirection(this.messageFilterDirection);
        anyChannelPaginationRequest.setMemberLimit(this.memberLimit);
        anyChannelPaginationRequest.setMemberOffset(this.memberOffset);
        anyChannelPaginationRequest.setWatcherLimit(this.watcherLimit);
        anyChannelPaginationRequest.setWatcherOffset(this.watcherOffset);
        anyChannelPaginationRequest.setChannelLimit(1);
        return anyChannelPaginationRequest;
    }

    public final WatchChannelRequest toWatchChannelRequest(boolean userPresence) {
        WatchChannelRequest watchChannelRequest = new WatchChannelRequest();
        watchChannelRequest.withMessages(this.messageLimit);
        if (userPresence) {
            watchChannelRequest.setPresence(true);
        }
        if (hasFilter()) {
            Pagination pagination = this.messageFilterDirection;
            AbstractC22676k.m65747g(pagination);
            watchChannelRequest.withMessages(pagination, this.messageFilterValue, this.messageLimit);
        }
        watchChannelRequest.withMembers(this.memberLimit, this.memberOffset);
        watchChannelRequest.withWatchers(this.watcherLimit, this.watcherOffset);
        return watchChannelRequest;
    }

    public QueryChannelPaginationRequest(int i13) {
        this.messageLimit = i13;
        this.messageFilterValue = "";
        this.memberLimit = 30;
        this.watcherLimit = 30;
    }

    public /* synthetic */ QueryChannelPaginationRequest(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 30 : i13);
    }
}
