package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\u007f\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "", "state", "", "watch", "presence", "messages", "", "", "watchers", io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, "data", "<init>", "(ZZZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getState", "()Z", "getWatch", "getPresence", "getMessages", "()Ljava/util/Map;", "getWatchers", "getMembers", "getData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelRequest {
    private final Map<String, Object> data;
    private final Map<String, Object> members;
    private final Map<String, Object> messages;
    private final boolean presence;
    private final boolean state;
    private final boolean watch;
    private final Map<String, Object> watchers;

    public QueryChannelRequest(boolean z4, boolean z13, boolean z14, Map<String, ? extends Object> messages, Map<String, ? extends Object> watchers, Map<String, ? extends Object> members, Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(data, "data");
        this.state = z4;
        this.watch = z13;
        this.presence = z14;
        this.messages = messages;
        this.watchers = watchers;
        this.members = members;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelRequest copy$default(QueryChannelRequest queryChannelRequest, boolean z4, boolean z13, boolean z14, Map map, Map map2, Map map3, Map map4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = queryChannelRequest.state;
        }
        if ((i13 & 2) != 0) {
            z13 = queryChannelRequest.watch;
        }
        if ((i13 & 4) != 0) {
            z14 = queryChannelRequest.presence;
        }
        if ((i13 & 8) != 0) {
            map = queryChannelRequest.messages;
        }
        if ((i13 & 16) != 0) {
            map2 = queryChannelRequest.watchers;
        }
        if ((i13 & 32) != 0) {
            map3 = queryChannelRequest.members;
        }
        if ((i13 & 64) != 0) {
            map4 = queryChannelRequest.data;
        }
        Map map5 = map3;
        Map map6 = map4;
        Map map7 = map2;
        boolean z15 = z14;
        return queryChannelRequest.copy(z4, z13, z15, map, map7, map5, map6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPresence() {
        return this.presence;
    }

    public final Map<String, Object> component4() {
        return this.messages;
    }

    public final Map<String, Object> component5() {
        return this.watchers;
    }

    public final Map<String, Object> component6() {
        return this.members;
    }

    public final Map<String, Object> component7() {
        return this.data;
    }

    public final QueryChannelRequest copy(boolean state, boolean watch, boolean presence, Map<String, ? extends Object> messages, Map<String, ? extends Object> watchers, Map<String, ? extends Object> members, Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(data, "data");
        return new QueryChannelRequest(state, watch, presence, messages, watchers, members, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelRequest)) {
            return false;
        }
        QueryChannelRequest queryChannelRequest = (QueryChannelRequest) other;
        return this.state == queryChannelRequest.state && this.watch == queryChannelRequest.watch && this.presence == queryChannelRequest.presence && AbstractC22676k.m65745e(this.messages, queryChannelRequest.messages) && AbstractC22676k.m65745e(this.watchers, queryChannelRequest.watchers) && AbstractC22676k.m65745e(this.members, queryChannelRequest.members) && AbstractC22676k.m65745e(this.data, queryChannelRequest.data);
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

    public final boolean getPresence() {
        return this.presence;
    }

    public final boolean getState() {
        return this.state;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public final Map<String, Object> getWatchers() {
        return this.watchers;
    }

    public int hashCode() {
        return this.data.hashCode() + AbstractC3855a.m11821e(this.members, AbstractC3855a.m11821e(this.watchers, AbstractC3855a.m11821e(this.messages, AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.state) * 31, 31, this.watch), 31, this.presence), 31), 31), 31);
    }

    public String toString() {
        boolean z4 = this.state;
        boolean z13 = this.watch;
        boolean z14 = this.presence;
        Map<String, Object> map = this.messages;
        Map<String, Object> map2 = this.watchers;
        Map<String, Object> map3 = this.members;
        Map<String, Object> map4 = this.data;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("QueryChannelRequest(state=", ", watch=", ", presence=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", messages=");
        sbM32002u.append(map);
        sbM32002u.append(", watchers=");
        AbstractC3855a.m11840x(sbM32002u, map2, ", members=", map3, ", data=");
        return AbstractC13673n.m38565l(sbM32002u, map4, ")");
    }
}
