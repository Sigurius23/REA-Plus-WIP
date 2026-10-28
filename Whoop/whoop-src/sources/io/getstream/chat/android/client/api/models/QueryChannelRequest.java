package io.getstream.chat.android.client.api.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u001b\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u001dJ\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010/R\"\u00103\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010/R(\u00106\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u0010,\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010/R(\u0010:\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010,\u0012\u0004\b<\u0010\u0003\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010/R(\u0010=\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010,\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010/R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR#\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bI\u0010D¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "Lio/getstream/chat/android/client/api/models/ChannelRequest;", "<init>", "()V", "", "", "", "data", "withData", "(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "", "limit", "offset", "withMembers", "(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "withWatchers", "withMessages", "(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "Lio/getstream/chat/android/client/api/models/Pagination;", "direction", "messageId", "(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "", "isFilteringNewerMessages", "()Z", "filteringOlderMessages", "isFilteringAroundIdMessages", "isFilteringMessages", "watchersOffset", "()I", "membersOffset", "messagesLimit", "watchersLimit", "membersLimit", "Ll83/k;", "pagination", "()Ll83/k;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "state", "Z", "getState", "setState", "(Z)V", "watch", "getWatch", "setWatch", "presence", "getPresence", "setPresence", "shouldRefresh", "getShouldRefresh", "setShouldRefresh", "getShouldRefresh$annotations", "isWatchChannel", "setWatchChannel", "isWatchChannel$annotations", "isNotificationUpdate", "setNotificationUpdate", "isNotificationUpdate$annotations", "", "messages", "Ljava/util/Map;", "getMessages", "()Ljava/util/Map;", "watchers", "getWatchers", QueryChannelRequest.KEY_MEMBERS, "getMembers", "getData", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class QueryChannelRequest implements ChannelRequest<QueryChannelRequest> {
    private static final String KEY_LIMIT = "limit";
    public static final String KEY_MEMBERS = "members";
    private static final String KEY_OFFSET = "offset";
    private boolean isNotificationUpdate;
    private boolean isWatchChannel;
    private boolean presence;
    private boolean shouldRefresh;
    private boolean state;
    private boolean watch;
    private final Map<String, Object> messages = new LinkedHashMap();
    private final Map<String, Object> watchers = new LinkedHashMap();
    private final Map<String, Object> members = new LinkedHashMap();
    private final Map<String, Object> data = new LinkedHashMap();

    @InternalStreamChatApi
    public static /* synthetic */ void getShouldRefresh$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void isNotificationUpdate$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void isWatchChannel$annotations() {
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelRequest)) {
            return false;
        }
        QueryChannelRequest queryChannelRequest = (QueryChannelRequest) other;
        return this.state == queryChannelRequest.state && this.watch == queryChannelRequest.watch && this.presence == queryChannelRequest.presence && this.shouldRefresh == queryChannelRequest.shouldRefresh && AbstractC22676k.m65745e(this.messages, queryChannelRequest.messages) && AbstractC22676k.m65745e(this.watchers, queryChannelRequest.watchers) && AbstractC22676k.m65745e(this.members, queryChannelRequest.members) && AbstractC22676k.m65745e(this.data, queryChannelRequest.data) && this.isNotificationUpdate == queryChannelRequest.isNotificationUpdate;
    }

    public final boolean filteringOlderMessages() {
        if (this.messages.isEmpty()) {
            return false;
        }
        Set<String> setKeySet = this.messages.keySet();
        return setKeySet.contains(Pagination.LESS_THAN.getValue()) || setKeySet.contains(Pagination.LESS_THAN_OR_EQUAL.getValue());
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final Map<String, Object> getMembers() {
        return this.members;
    }

    public final Map<String, Object> getMessages() {
        return this.messages;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getPresence() {
        return this.presence;
    }

    public final boolean getShouldRefresh() {
        return this.shouldRefresh;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getState() {
        return this.state;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getWatch() {
        return this.watch;
    }

    public final Map<String, Object> getWatchers() {
        return this.watchers;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isNotificationUpdate) + AbstractC3855a.m11821e(this.data, AbstractC3855a.m11821e(this.members, AbstractC3855a.m11821e(this.watchers, AbstractC3855a.m11821e(this.messages, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.state) * 31, 31, this.watch), 31, this.presence), 31, this.shouldRefresh), 31), 31), 31), 31);
    }

    public final boolean isFilteringAroundIdMessages() {
        if (this.messages.isEmpty()) {
            return false;
        }
        return this.messages.keySet().contains(Pagination.AROUND_ID.getValue());
    }

    public final boolean isFilteringMessages() {
        Pagination[] paginationArrValues = Pagination.values();
        ArrayList arrayList = new ArrayList(paginationArrValues.length);
        for (Pagination pagination : paginationArrValues) {
            arrayList.add(pagination.getValue());
        }
        return !AbstractC25265s.m74106K0(arrayList, this.messages.keySet()).isEmpty();
    }

    public final boolean isFilteringNewerMessages() {
        if (this.messages.isEmpty()) {
            return false;
        }
        Set<String> setKeySet = this.messages.keySet();
        return setKeySet.contains(Pagination.GREATER_THAN.getValue()) || setKeySet.contains(Pagination.GREATER_THAN_OR_EQUAL.getValue());
    }

    /* JADX INFO: renamed from: isNotificationUpdate, reason: from getter */
    public final boolean getIsNotificationUpdate() {
        return this.isNotificationUpdate;
    }

    /* JADX INFO: renamed from: isWatchChannel, reason: from getter */
    public final boolean getIsWatchChannel() {
        return this.isWatchChannel;
    }

    public final int membersLimit() {
        Object obj = this.messages.get("limit");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int membersOffset() {
        Object obj = this.watchers.get("offset");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int messagesLimit() {
        Object obj = this.messages.get("limit");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final C23465k pagination() {
        Pagination pagination;
        if (this.messages.isEmpty()) {
            return null;
        }
        Set<String> setKeySet = this.messages.keySet();
        Pagination[] paginationArrValues = Pagination.values();
        int length = paginationArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                pagination = null;
                break;
            }
            pagination = paginationArrValues[i13];
            if (setKeySet.contains(pagination.getValue())) {
                break;
            }
            i13++;
        }
        if (pagination == null) {
            return null;
        }
        Object obj = this.messages.get(pagination.getValue());
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        return new C23465k(pagination, str);
    }

    public final void setNotificationUpdate(boolean z4) {
        this.isNotificationUpdate = z4;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setPresence(boolean z4) {
        this.presence = z4;
    }

    public final void setShouldRefresh(boolean z4) {
        this.shouldRefresh = z4;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setState(boolean z4) {
        this.state = z4;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setWatch(boolean z4) {
        this.watch = z4;
    }

    public final void setWatchChannel(boolean z4) {
        this.isWatchChannel = z4;
    }

    public final String toString() {
        boolean z4 = this.state;
        boolean z13 = this.watch;
        boolean z14 = this.presence;
        boolean z15 = this.shouldRefresh;
        boolean z16 = this.isWatchChannel;
        boolean z17 = this.isNotificationUpdate;
        Map<String, Object> map = this.messages;
        Map<String, Object> map2 = this.watchers;
        Map<String, Object> map3 = this.members;
        Map<String, Object> map4 = this.data;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("QueryChannelRequest(state=", ", watch=", ", presence=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", shouldRefresh=", z15, ", isWatchChannel=");
        AbstractC38963t7.m124392v(sbM32002u, z16, ", isNotificationUpdate=", z17, ", messages=");
        AbstractC3855a.m11840x(sbM32002u, map, ", watchers=", map2, ", members=");
        return AbstractC30802r.m94765n(sbM32002u, map3, ", data=", map4, ")");
    }

    public final int watchersLimit() {
        Object obj = this.watchers.get("limit");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int watchersOffset() {
        Object obj = this.watchers.get("offset");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public QueryChannelRequest withData(Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(data, "data");
        this.data.putAll(data);
        return this;
    }

    public QueryChannelRequest withMembers(int limit, int offset) {
        this.state = true;
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(limit));
        map.put("offset", Integer.valueOf(offset));
        this.members.putAll(map);
        return this;
    }

    public QueryChannelRequest withMessages(int limit) {
        this.state = true;
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(limit));
        this.messages.putAll(map);
        return this;
    }

    public QueryChannelRequest withWatchers(int limit, int offset) {
        this.state = true;
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(limit));
        map.put("offset", Integer.valueOf(offset));
        this.watchers.putAll(map);
        return this;
    }

    public QueryChannelRequest withMessages(Pagination direction, String messageId, int limit) {
        AbstractC22676k.m65750j(direction, "direction");
        AbstractC22676k.m65750j(messageId, "messageId");
        this.state = true;
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(limit));
        map.put(direction.getValue(), messageId);
        this.messages.putAll(map);
        return this;
    }
}
