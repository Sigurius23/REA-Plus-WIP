package io.getstream.chat.android.client.api2.optimisation.hash;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;", "", "channelType", "", "channelId", MapboxMap.QFE_LIMIT, "", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "pagination", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)V", "getChannelType", "()Ljava/lang/String;", "getChannelId", "getLimit", "()I", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getPagination", "()Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GetPinnedMessagesHash {
    private final String channelId;
    private final String channelType;
    private final int limit;
    private final PinnedMessagesPagination pagination;
    private final QuerySorter<Message> sort;

    public GetPinnedMessagesHash(String channelType, String channelId, int i13, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        this.channelType = channelType;
        this.channelId = channelId;
        this.limit = i13;
        this.sort = sort;
        this.pagination = pagination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPinnedMessagesHash copy$default(GetPinnedMessagesHash getPinnedMessagesHash, String str, String str2, int i13, QuerySorter querySorter, PinnedMessagesPagination pinnedMessagesPagination, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = getPinnedMessagesHash.channelType;
        }
        if ((i14 & 2) != 0) {
            str2 = getPinnedMessagesHash.channelId;
        }
        if ((i14 & 4) != 0) {
            i13 = getPinnedMessagesHash.limit;
        }
        if ((i14 & 8) != 0) {
            querySorter = getPinnedMessagesHash.sort;
        }
        if ((i14 & 16) != 0) {
            pinnedMessagesPagination = getPinnedMessagesHash.pagination;
        }
        PinnedMessagesPagination pinnedMessagesPagination2 = pinnedMessagesPagination;
        int i15 = i13;
        return getPinnedMessagesHash.copy(str, str2, i15, querySorter, pinnedMessagesPagination2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final QuerySorter<Message> component4() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PinnedMessagesPagination getPagination() {
        return this.pagination;
    }

    public final GetPinnedMessagesHash copy(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return new GetPinnedMessagesHash(channelType, channelId, limit, sort, pagination);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPinnedMessagesHash)) {
            return false;
        }
        GetPinnedMessagesHash getPinnedMessagesHash = (GetPinnedMessagesHash) other;
        return AbstractC22676k.m65745e(this.channelType, getPinnedMessagesHash.channelType) && AbstractC22676k.m65745e(this.channelId, getPinnedMessagesHash.channelId) && this.limit == getPinnedMessagesHash.limit && AbstractC22676k.m65745e(this.sort, getPinnedMessagesHash.sort) && AbstractC22676k.m65745e(this.pagination, getPinnedMessagesHash.pagination);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final PinnedMessagesPagination getPagination() {
        return this.pagination;
    }

    public final QuerySorter<Message> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        return this.pagination.hashCode() + ((this.sort.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30450d(this.channelType.hashCode() * 31, 31, this.channelId), 31)) * 31);
    }

    public final String toString() {
        String str = this.channelType;
        String str2 = this.channelId;
        int i13 = this.limit;
        QuerySorter<Message> querySorter = this.sort;
        PinnedMessagesPagination pinnedMessagesPagination = this.pagination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GetPinnedMessagesHash(channelType=", str, ", channelId=", str2, ", limit=");
        sbM32001t.append(i13);
        sbM32001t.append(", sort=");
        sbM32001t.append(querySorter);
        sbM32001t.append(", pagination=");
        sbM32001t.append(pinnedMessagesPagination);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
