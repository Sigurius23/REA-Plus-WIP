package io.getstream.chat.android.client.api2.optimisation.hash;

import io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;", "", "channelType", "", "channelId", "queryKey", "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V", "getChannelType", "()Ljava/lang/String;", "getChannelId", "getQueryKey", "()Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelQueryKey {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String channelId;
    private final String channelType;
    private final QueryChannelRequest queryKey;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;", "", "<init>", "()V", "from", "Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;", "channelType", "", "channelId", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelQueryKey from(String channelType, String channelId, io.getstream.chat.android.client.api.models.QueryChannelRequest query) {
            AbstractC22676k.m65750j(channelType, "channelType");
            AbstractC22676k.m65750j(channelId, "channelId");
            AbstractC22676k.m65750j(query, "query");
            return new ChannelQueryKey(channelType, channelId, new QueryChannelRequest(query.getState(), query.getWatch(), query.getPresence(), query.getMessages(), query.getWatchers(), query.getMembers(), query.getData()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelQueryKey(String channelType, String channelId, QueryChannelRequest queryKey) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(queryKey, "queryKey");
        this.channelType = channelType;
        this.channelId = channelId;
        this.queryKey = queryKey;
    }

    public static /* synthetic */ ChannelQueryKey copy$default(ChannelQueryKey channelQueryKey, String str, String str2, QueryChannelRequest queryChannelRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelQueryKey.channelType;
        }
        if ((i13 & 2) != 0) {
            str2 = channelQueryKey.channelId;
        }
        if ((i13 & 4) != 0) {
            queryChannelRequest = channelQueryKey.queryKey;
        }
        return channelQueryKey.copy(str, str2, queryChannelRequest);
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
    public final QueryChannelRequest getQueryKey() {
        return this.queryKey;
    }

    public final ChannelQueryKey copy(String channelType, String channelId, QueryChannelRequest queryKey) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(queryKey, "queryKey");
        return new ChannelQueryKey(channelType, channelId, queryKey);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelQueryKey)) {
            return false;
        }
        ChannelQueryKey channelQueryKey = (ChannelQueryKey) other;
        return AbstractC22676k.m65745e(this.channelType, channelQueryKey.channelType) && AbstractC22676k.m65745e(this.channelId, channelQueryKey.channelId) && AbstractC22676k.m65745e(this.queryKey, channelQueryKey.queryKey);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final QueryChannelRequest getQueryKey() {
        return this.queryKey;
    }

    public final int hashCode() {
        return this.queryKey.hashCode() + AbstractC11266d.m30450d(this.channelType.hashCode() * 31, 31, this.channelId);
    }

    public final String toString() {
        String str = this.channelType;
        String str2 = this.channelId;
        QueryChannelRequest queryChannelRequest = this.queryKey;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelQueryKey(channelType=", str, ", channelId=", str2, ", queryKey=");
        sbM32001t.append(queryChannelRequest);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
