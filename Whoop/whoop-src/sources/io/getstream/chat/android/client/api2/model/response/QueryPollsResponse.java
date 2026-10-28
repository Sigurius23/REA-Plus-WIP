package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;", "", "polls", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "next", "", "prev", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getPolls", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "getPrev", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryPollsResponse {
    private final String next;
    private final List<DownstreamPollDto> polls;
    private final String prev;

    public QueryPollsResponse(List<DownstreamPollDto> polls, String str, String str2) {
        AbstractC22676k.m65750j(polls, "polls");
        this.polls = polls;
        this.next = str;
        this.prev = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryPollsResponse copy$default(QueryPollsResponse queryPollsResponse, List list, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryPollsResponse.polls;
        }
        if ((i13 & 2) != 0) {
            str = queryPollsResponse.next;
        }
        if ((i13 & 4) != 0) {
            str2 = queryPollsResponse.prev;
        }
        return queryPollsResponse.copy(list, str, str2);
    }

    public final List<DownstreamPollDto> component1() {
        return this.polls;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final QueryPollsResponse copy(List<DownstreamPollDto> polls, String next, String prev) {
        AbstractC22676k.m65750j(polls, "polls");
        return new QueryPollsResponse(polls, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPollsResponse)) {
            return false;
        }
        QueryPollsResponse queryPollsResponse = (QueryPollsResponse) other;
        return AbstractC22676k.m65745e(this.polls, queryPollsResponse.polls) && AbstractC22676k.m65745e(this.next, queryPollsResponse.next) && AbstractC22676k.m65745e(this.prev, queryPollsResponse.prev);
    }

    public final String getNext() {
        return this.next;
    }

    public final List<DownstreamPollDto> getPolls() {
        return this.polls;
    }

    public final String getPrev() {
        return this.prev;
    }

    public int hashCode() {
        int iHashCode = this.polls.hashCode() * 31;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<DownstreamPollDto> list = this.polls;
        return AbstractC25012a.m73376i(this.prev, ")", AbstractC26725a.m79507k("QueryPollsResponse(polls=", ", next=", this.next, ", prev=", list));
    }
}
