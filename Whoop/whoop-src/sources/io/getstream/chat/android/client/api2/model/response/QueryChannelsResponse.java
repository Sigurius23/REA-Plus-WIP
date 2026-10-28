package io.getstream.chat.android.client.api2.model.response;

import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;", "", "channels", "", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "predefined_filter", "Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;)V", "getChannels", "()Ljava/util/List;", "getPredefined_filter", "()Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsResponse {
    private final List<ChannelResponse> channels;
    private final ParsedPredefinedFilterResponse predefined_filter;

    public QueryChannelsResponse(List<ChannelResponse> channels, ParsedPredefinedFilterResponse parsedPredefinedFilterResponse) {
        AbstractC22676k.m65750j(channels, "channels");
        this.channels = channels;
        this.predefined_filter = parsedPredefinedFilterResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsResponse copy$default(QueryChannelsResponse queryChannelsResponse, List list, ParsedPredefinedFilterResponse parsedPredefinedFilterResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryChannelsResponse.channels;
        }
        if ((i13 & 2) != 0) {
            parsedPredefinedFilterResponse = queryChannelsResponse.predefined_filter;
        }
        return queryChannelsResponse.copy(list, parsedPredefinedFilterResponse);
    }

    public final List<ChannelResponse> component1() {
        return this.channels;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ParsedPredefinedFilterResponse getPredefined_filter() {
        return this.predefined_filter;
    }

    public final QueryChannelsResponse copy(List<ChannelResponse> channels, ParsedPredefinedFilterResponse predefined_filter) {
        AbstractC22676k.m65750j(channels, "channels");
        return new QueryChannelsResponse(channels, predefined_filter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsResponse)) {
            return false;
        }
        QueryChannelsResponse queryChannelsResponse = (QueryChannelsResponse) other;
        return AbstractC22676k.m65745e(this.channels, queryChannelsResponse.channels) && AbstractC22676k.m65745e(this.predefined_filter, queryChannelsResponse.predefined_filter);
    }

    public final List<ChannelResponse> getChannels() {
        return this.channels;
    }

    public final ParsedPredefinedFilterResponse getPredefined_filter() {
        return this.predefined_filter;
    }

    public int hashCode() {
        int iHashCode = this.channels.hashCode() * 31;
        ParsedPredefinedFilterResponse parsedPredefinedFilterResponse = this.predefined_filter;
        return iHashCode + (parsedPredefinedFilterResponse == null ? 0 : parsedPredefinedFilterResponse.hashCode());
    }

    public String toString() {
        return "QueryChannelsResponse(channels=" + this.channels + ", predefined_filter=" + this.predefined_filter + ")";
    }

    public /* synthetic */ QueryChannelsResponse(List list, ParsedPredefinedFilterResponse parsedPredefinedFilterResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : parsedPredefinedFilterResponse);
    }
}
