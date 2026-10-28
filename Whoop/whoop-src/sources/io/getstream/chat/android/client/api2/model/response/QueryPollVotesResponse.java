package io.getstream.chat.android.client.api2.model.response;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api2.model.dto.DownstreamVoteDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;", "", "next", "", "prev", "votes", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getNext", "()Ljava/lang/String;", "getPrev", "getVotes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryPollVotesResponse {
    private final String next;
    private final String prev;
    private final List<DownstreamVoteDto> votes;

    public QueryPollVotesResponse(String str, String str2, List<DownstreamVoteDto> votes) {
        AbstractC22676k.m65750j(votes, "votes");
        this.next = str;
        this.prev = str2;
        this.votes = votes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryPollVotesResponse copy$default(QueryPollVotesResponse queryPollVotesResponse, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryPollVotesResponse.next;
        }
        if ((i13 & 2) != 0) {
            str2 = queryPollVotesResponse.prev;
        }
        if ((i13 & 4) != 0) {
            list = queryPollVotesResponse.votes;
        }
        return queryPollVotesResponse.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final List<DownstreamVoteDto> component3() {
        return this.votes;
    }

    public final QueryPollVotesResponse copy(String next, String prev, List<DownstreamVoteDto> votes) {
        AbstractC22676k.m65750j(votes, "votes");
        return new QueryPollVotesResponse(next, prev, votes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPollVotesResponse)) {
            return false;
        }
        QueryPollVotesResponse queryPollVotesResponse = (QueryPollVotesResponse) other;
        return AbstractC22676k.m65745e(this.next, queryPollVotesResponse.next) && AbstractC22676k.m65745e(this.prev, queryPollVotesResponse.prev) && AbstractC22676k.m65745e(this.votes, queryPollVotesResponse.votes);
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<DownstreamVoteDto> getVotes() {
        return this.votes;
    }

    public int hashCode() {
        String str = this.next;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prev;
        return this.votes.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.next;
        String str2 = this.prev;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("QueryPollVotesResponse(next=", str, ", prev=", str2, ", votes="), this.votes, ")");
    }
}
