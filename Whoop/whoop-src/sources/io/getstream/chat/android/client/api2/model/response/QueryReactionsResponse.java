package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC30802r;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;", "", "reactions", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "next", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getReactions", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryReactionsResponse {
    private final String next;
    private final List<DownstreamReactionDto> reactions;

    public QueryReactionsResponse(List<DownstreamReactionDto> reactions, String str) {
        AbstractC22676k.m65750j(reactions, "reactions");
        this.reactions = reactions;
        this.next = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryReactionsResponse copy$default(QueryReactionsResponse queryReactionsResponse, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryReactionsResponse.reactions;
        }
        if ((i13 & 2) != 0) {
            str = queryReactionsResponse.next;
        }
        return queryReactionsResponse.copy(list, str);
    }

    public final List<DownstreamReactionDto> component1() {
        return this.reactions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryReactionsResponse copy(List<DownstreamReactionDto> reactions, String next) {
        AbstractC22676k.m65750j(reactions, "reactions");
        return new QueryReactionsResponse(reactions, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryReactionsResponse)) {
            return false;
        }
        QueryReactionsResponse queryReactionsResponse = (QueryReactionsResponse) other;
        return AbstractC22676k.m65745e(this.reactions, queryReactionsResponse.reactions) && AbstractC22676k.m65745e(this.next, queryReactionsResponse.next);
    }

    public final String getNext() {
        return this.next;
    }

    public final List<DownstreamReactionDto> getReactions() {
        return this.reactions;
    }

    public int hashCode() {
        int iHashCode = this.reactions.hashCode() * 31;
        String str = this.next;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("QueryReactionsResponse(reactions=", ", next=", this.next, ")", this.reactions);
    }
}
