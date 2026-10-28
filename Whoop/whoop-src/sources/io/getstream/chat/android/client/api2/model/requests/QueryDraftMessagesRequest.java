package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryDraftMessagesRequest {
    private final Integer limit;
    private final Integer offset;

    public QueryDraftMessagesRequest(Integer num, Integer num2) {
        this.offset = num;
        this.limit = num2;
    }

    public static /* synthetic */ QueryDraftMessagesRequest copy$default(QueryDraftMessagesRequest queryDraftMessagesRequest, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = queryDraftMessagesRequest.offset;
        }
        if ((i13 & 2) != 0) {
            num2 = queryDraftMessagesRequest.limit;
        }
        return queryDraftMessagesRequest.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final QueryDraftMessagesRequest copy(Integer offset, Integer limit) {
        return new QueryDraftMessagesRequest(offset, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryDraftMessagesRequest)) {
            return false;
        }
        QueryDraftMessagesRequest queryDraftMessagesRequest = (QueryDraftMessagesRequest) other;
        return AbstractC22676k.m65745e(this.offset, queryDraftMessagesRequest.offset) && AbstractC22676k.m65745e(this.limit, queryDraftMessagesRequest.limit);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        Integer num = this.offset;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.limit;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "QueryDraftMessagesRequest(offset=" + this.offset + ", limit=" + this.limit + ")";
    }
}
