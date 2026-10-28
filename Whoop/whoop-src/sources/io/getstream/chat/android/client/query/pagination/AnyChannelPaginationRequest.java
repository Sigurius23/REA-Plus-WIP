package io.getstream.chat.android.client.query.pagination;

import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u0005R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\u0005R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\u0005R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\u0005R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\u0005R\u001a\u0010+\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\u0005¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "", "messageLimit", "", "<init>", "(I)V", "getMessageLimit", "()I", "setMessageLimit", "messageFilterDirection", "Lio/getstream/chat/android/client/api/models/Pagination;", "getMessageFilterDirection", "()Lio/getstream/chat/android/client/api/models/Pagination;", "setMessageFilterDirection", "(Lio/getstream/chat/android/client/api/models/Pagination;)V", "messageFilterValue", "", "getMessageFilterValue", "()Ljava/lang/String;", "setMessageFilterValue", "(Ljava/lang/String;)V", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "setSort", "(Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "channelLimit", "getChannelLimit", "setChannelLimit", "channelOffset", "getChannelOffset", "setChannelOffset", "memberLimit", "getMemberLimit", "setMemberLimit", "memberOffset", "getMemberOffset", "setMemberOffset", "watcherLimit", "getWatcherLimit", "setWatcherLimit", "watcherOffset", "getWatcherOffset", "setWatcherOffset", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AnyChannelPaginationRequest {
    private int channelLimit;
    private int channelOffset;
    private int memberLimit;
    private int memberOffset;
    private Pagination messageFilterDirection;
    private String messageFilterValue;
    private int messageLimit;
    private QuerySorter<Channel> sort;
    private int watcherLimit;
    private int watcherOffset;

    public AnyChannelPaginationRequest() {
        this(0, 1, null);
    }

    public final int getChannelLimit() {
        return this.channelLimit;
    }

    public final int getChannelOffset() {
        return this.channelOffset;
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

    public final QuerySorter<Channel> getSort() {
        return this.sort;
    }

    public final int getWatcherLimit() {
        return this.watcherLimit;
    }

    public final int getWatcherOffset() {
        return this.watcherOffset;
    }

    public final void setChannelLimit(int i13) {
        this.channelLimit = i13;
    }

    public final void setChannelOffset(int i13) {
        this.channelOffset = i13;
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

    public final void setSort(QuerySorter<Channel> querySorter) {
        AbstractC22676k.m65750j(querySorter, "<set-?>");
        this.sort = querySorter;
    }

    public final void setWatcherLimit(int i13) {
        this.watcherLimit = i13;
    }

    public final void setWatcherOffset(int i13) {
        this.watcherOffset = i13;
    }

    public AnyChannelPaginationRequest(int i13) {
        this.messageLimit = i13;
        this.messageFilterValue = "";
        this.sort = new QuerySortByField();
        this.channelLimit = 30;
        this.memberLimit = 30;
        this.watcherLimit = 30;
    }

    public /* synthetic */ AnyChannelPaginationRequest(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 30 : i13);
    }
}
