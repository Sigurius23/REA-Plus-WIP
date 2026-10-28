package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001d\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u000bHÆ\u0003Jt\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;", "", "filter_conditions", "", "message_filter_conditions", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "next", "", "sort", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getFilter_conditions", "()Ljava/util/Map;", "getMessage_filter_conditions", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getNext", "()Ljava/lang/String;", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchMessagesRequest {
    private final Map<?, ?> filter_conditions;
    private final Integer limit;
    private final Map<?, ?> message_filter_conditions;
    private final String next;
    private final Integer offset;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMessagesRequest(Map<?, ?> filter_conditions, Map<?, ?> message_filter_conditions, Integer num, Integer num2, String str, List<? extends Map<String, ? extends Object>> list) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(message_filter_conditions, "message_filter_conditions");
        this.filter_conditions = filter_conditions;
        this.message_filter_conditions = message_filter_conditions;
        this.offset = num;
        this.limit = num2;
        this.next = str;
        this.sort = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMessagesRequest copy$default(SearchMessagesRequest searchMessagesRequest, Map map, Map map2, Integer num, Integer num2, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = searchMessagesRequest.filter_conditions;
        }
        if ((i13 & 2) != 0) {
            map2 = searchMessagesRequest.message_filter_conditions;
        }
        if ((i13 & 4) != 0) {
            num = searchMessagesRequest.offset;
        }
        if ((i13 & 8) != 0) {
            num2 = searchMessagesRequest.limit;
        }
        if ((i13 & 16) != 0) {
            str = searchMessagesRequest.next;
        }
        if ((i13 & 32) != 0) {
            list = searchMessagesRequest.sort;
        }
        String str2 = str;
        List list2 = list;
        return searchMessagesRequest.copy(map, map2, num, num2, str2, list2);
    }

    public final Map<?, ?> component1() {
        return this.filter_conditions;
    }

    public final Map<?, ?> component2() {
        return this.message_filter_conditions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final List<Map<String, Object>> component6() {
        return this.sort;
    }

    public final SearchMessagesRequest copy(Map<?, ?> filter_conditions, Map<?, ?> message_filter_conditions, Integer offset, Integer limit, String next, List<? extends Map<String, ? extends Object>> sort) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(message_filter_conditions, "message_filter_conditions");
        return new SearchMessagesRequest(filter_conditions, message_filter_conditions, offset, limit, next, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMessagesRequest)) {
            return false;
        }
        SearchMessagesRequest searchMessagesRequest = (SearchMessagesRequest) other;
        return AbstractC22676k.m65745e(this.filter_conditions, searchMessagesRequest.filter_conditions) && AbstractC22676k.m65745e(this.message_filter_conditions, searchMessagesRequest.message_filter_conditions) && AbstractC22676k.m65745e(this.offset, searchMessagesRequest.offset) && AbstractC22676k.m65745e(this.limit, searchMessagesRequest.limit) && AbstractC22676k.m65745e(this.next, searchMessagesRequest.next) && AbstractC22676k.m65745e(this.sort, searchMessagesRequest.sort);
    }

    public final Map<?, ?> getFilter_conditions() {
        return this.filter_conditions;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Map<?, ?> getMessage_filter_conditions() {
        return this.message_filter_conditions;
    }

    public final String getNext() {
        return this.next;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.message_filter_conditions, this.filter_conditions.hashCode() * 31, 31);
        Integer num = this.offset;
        int iHashCode = (iM11821e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.next;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Map<String, Object>> list = this.sort;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Map<?, ?> map = this.filter_conditions;
        Map<?, ?> map2 = this.message_filter_conditions;
        Integer num = this.offset;
        Integer num2 = this.limit;
        String str = this.next;
        List<Map<String, Object>> list = this.sort;
        StringBuilder sb4 = new StringBuilder("SearchMessagesRequest(filter_conditions=");
        sb4.append(map);
        sb4.append(", message_filter_conditions=");
        sb4.append(map2);
        sb4.append(", offset=");
        AbstractC31061c.m95621A(sb4, num, ", limit=", num2, ", next=");
        return AbstractC30007c.m91840j(str, ", sort=", ")", sb4, list);
    }
}
