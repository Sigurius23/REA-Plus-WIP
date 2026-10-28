package io.getstream.chat.android.client.api.models;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JX\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "channelFilter", "Lio/getstream/chat/android/models/FilterObject;", "messageFilter", "next", "", "querySort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getChannelFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getMessageFilter", "getNext", "()Ljava/lang/String;", "getQuerySort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "", "", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/models/SearchMessagesRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchMessagesRequest {
    private final FilterObject channelFilter;
    private final Integer limit;
    private final FilterObject messageFilter;
    private final String next;
    private final Integer offset;
    private final QuerySorter<Message> querySort;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMessagesRequest(Integer num, Integer num2, FilterObject channelFilter, FilterObject messageFilter) {
        this(num, num2, channelFilter, messageFilter, null, null, 48, null);
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMessagesRequest copy$default(SearchMessagesRequest searchMessagesRequest, Integer num, Integer num2, FilterObject filterObject, FilterObject filterObject2, String str, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = searchMessagesRequest.offset;
        }
        if ((i13 & 2) != 0) {
            num2 = searchMessagesRequest.limit;
        }
        if ((i13 & 4) != 0) {
            filterObject = searchMessagesRequest.channelFilter;
        }
        if ((i13 & 8) != 0) {
            filterObject2 = searchMessagesRequest.messageFilter;
        }
        if ((i13 & 16) != 0) {
            str = searchMessagesRequest.next;
        }
        if ((i13 & 32) != 0) {
            querySorter = searchMessagesRequest.querySort;
        }
        String str2 = str;
        QuerySorter querySorter2 = querySorter;
        return searchMessagesRequest.copy(num, num2, filterObject, filterObject2, str2, querySorter2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FilterObject getChannelFilter() {
        return this.channelFilter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FilterObject getMessageFilter() {
        return this.messageFilter;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QuerySorter<Message> component6() {
        return this.querySort;
    }

    public final SearchMessagesRequest copy(Integer offset, Integer limit, FilterObject channelFilter, FilterObject messageFilter, String next, QuerySorter<Message> querySort) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        return new SearchMessagesRequest(offset, limit, channelFilter, messageFilter, next, querySort);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMessagesRequest)) {
            return false;
        }
        SearchMessagesRequest searchMessagesRequest = (SearchMessagesRequest) other;
        return AbstractC22676k.m65745e(this.offset, searchMessagesRequest.offset) && AbstractC22676k.m65745e(this.limit, searchMessagesRequest.limit) && AbstractC22676k.m65745e(this.channelFilter, searchMessagesRequest.channelFilter) && AbstractC22676k.m65745e(this.messageFilter, searchMessagesRequest.messageFilter) && AbstractC22676k.m65745e(this.next, searchMessagesRequest.next) && AbstractC22676k.m65745e(this.querySort, searchMessagesRequest.querySort);
    }

    public final FilterObject getChannelFilter() {
        return this.channelFilter;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final FilterObject getMessageFilter() {
        return this.messageFilter;
    }

    public final String getNext() {
        return this.next;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final QuerySorter<Message> getQuerySort() {
        return this.querySort;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        Integer num = this.offset;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.limit;
        int iHashCode2 = (this.messageFilter.hashCode() + ((this.channelFilter.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
        String str = this.next;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        QuerySorter<Message> querySorter = this.querySort;
        return iHashCode3 + (querySorter != null ? querySorter.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.offset;
        Integer num2 = this.limit;
        FilterObject filterObject = this.channelFilter;
        FilterObject filterObject2 = this.messageFilter;
        String str = this.next;
        QuerySorter<Message> querySorter = this.querySort;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("SearchMessagesRequest(offset=", num, ", limit=", num2, ", channelFilter=");
        sbM114684l.append(filterObject);
        sbM114684l.append(", messageFilter=");
        sbM114684l.append(filterObject2);
        sbM114684l.append(", next=");
        sbM114684l.append(str);
        sbM114684l.append(", querySort=");
        sbM114684l.append(querySorter);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMessagesRequest(Integer num, Integer num2, FilterObject channelFilter, FilterObject messageFilter, String str) {
        this(num, num2, channelFilter, messageFilter, str, null, 32, null);
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
    }

    public SearchMessagesRequest(Integer num, Integer num2, FilterObject channelFilter, FilterObject messageFilter, String str, QuerySorter<Message> querySorter) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        this.offset = num;
        this.limit = num2;
        this.channelFilter = channelFilter;
        this.messageFilter = messageFilter;
        this.next = str;
        this.querySort = querySorter;
        this.sort = querySorter != null ? querySorter.toDto() : null;
    }

    public /* synthetic */ SearchMessagesRequest(Integer num, Integer num2, FilterObject filterObject, FilterObject filterObject2, String str, QuerySorter querySorter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, filterObject, filterObject2, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : querySorter);
    }
}
