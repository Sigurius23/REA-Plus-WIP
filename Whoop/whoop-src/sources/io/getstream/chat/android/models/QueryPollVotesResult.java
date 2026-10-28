package io.getstream.chat.android.models;

import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/QueryPollVotesResult;", "", "votes", "", "Lio/getstream/chat/android/models/Vote;", "next", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getVotes", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryPollVotesResult {
    private final String next;
    private final List<Vote> votes;

    public QueryPollVotesResult(List<Vote> votes, String str) {
        AbstractC22676k.m65750j(votes, "votes");
        this.votes = votes;
        this.next = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryPollVotesResult copy$default(QueryPollVotesResult queryPollVotesResult, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryPollVotesResult.votes;
        }
        if ((i13 & 2) != 0) {
            str = queryPollVotesResult.next;
        }
        return queryPollVotesResult.copy(list, str);
    }

    public final List<Vote> component1() {
        return this.votes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryPollVotesResult copy(List<Vote> votes, String next) {
        AbstractC22676k.m65750j(votes, "votes");
        return new QueryPollVotesResult(votes, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPollVotesResult)) {
            return false;
        }
        QueryPollVotesResult queryPollVotesResult = (QueryPollVotesResult) other;
        return AbstractC22676k.m65745e(this.votes, queryPollVotesResult.votes) && AbstractC22676k.m65745e(this.next, queryPollVotesResult.next);
    }

    public final String getNext() {
        return this.next;
    }

    public final List<Vote> getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int iHashCode = this.votes.hashCode() * 31;
        String str = this.next;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("QueryPollVotesResult(votes=", ", next=", this.next, ")", this.votes);
    }
}
