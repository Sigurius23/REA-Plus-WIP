package io.getstream.chat.android.client.api.models;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "", "channels", "", "Lio/getstream/chat/android/models/Channel;", "predefinedFilter", "Lio/getstream/chat/android/client/api/models/PredefinedFilter;", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api/models/PredefinedFilter;)V", "getChannels", "()Ljava/util/List;", "getPredefinedFilter", "()Lio/getstream/chat/android/client/api/models/PredefinedFilter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsResult {
    private final List<Channel> channels;
    private final PredefinedFilter predefinedFilter;

    public QueryChannelsResult(List<Channel> channels, PredefinedFilter predefinedFilter) {
        AbstractC22676k.m65750j(channels, "channels");
        this.channels = channels;
        this.predefinedFilter = predefinedFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsResult copy$default(QueryChannelsResult queryChannelsResult, List list, PredefinedFilter predefinedFilter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryChannelsResult.channels;
        }
        if ((i13 & 2) != 0) {
            predefinedFilter = queryChannelsResult.predefinedFilter;
        }
        return queryChannelsResult.copy(list, predefinedFilter);
    }

    public final List<Channel> component1() {
        return this.channels;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PredefinedFilter getPredefinedFilter() {
        return this.predefinedFilter;
    }

    public final QueryChannelsResult copy(List<Channel> channels, PredefinedFilter predefinedFilter) {
        AbstractC22676k.m65750j(channels, "channels");
        return new QueryChannelsResult(channels, predefinedFilter);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsResult)) {
            return false;
        }
        QueryChannelsResult queryChannelsResult = (QueryChannelsResult) other;
        return AbstractC22676k.m65745e(this.channels, queryChannelsResult.channels) && AbstractC22676k.m65745e(this.predefinedFilter, queryChannelsResult.predefinedFilter);
    }

    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final PredefinedFilter getPredefinedFilter() {
        return this.predefinedFilter;
    }

    public final int hashCode() {
        int iHashCode = this.channels.hashCode() * 31;
        PredefinedFilter predefinedFilter = this.predefinedFilter;
        return iHashCode + (predefinedFilter == null ? 0 : predefinedFilter.hashCode());
    }

    public final String toString() {
        return "QueryChannelsResult(channels=" + this.channels + ", predefinedFilter=" + this.predefinedFilter + ")";
    }
}
