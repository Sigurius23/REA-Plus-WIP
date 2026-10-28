package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamThreadDto;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;", "", "threads", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", AttachmentExtensionsKt.EXTRA_DURATION, "", "prev", "next", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThreads", "()Ljava/util/List;", "getDuration", "()Ljava/lang/String;", "getPrev", "getNext", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryThreadsResponse {
    private final String duration;
    private final String next;
    private final String prev;
    private final List<DownstreamThreadDto> threads;

    public QueryThreadsResponse(List<DownstreamThreadDto> threads, String duration, String str, String str2) {
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(duration, "duration");
        this.threads = threads;
        this.duration = duration;
        this.prev = str;
        this.next = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryThreadsResponse copy$default(QueryThreadsResponse queryThreadsResponse, List list, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryThreadsResponse.threads;
        }
        if ((i13 & 2) != 0) {
            str = queryThreadsResponse.duration;
        }
        if ((i13 & 4) != 0) {
            str2 = queryThreadsResponse.prev;
        }
        if ((i13 & 8) != 0) {
            str3 = queryThreadsResponse.next;
        }
        return queryThreadsResponse.copy(list, str, str2, str3);
    }

    public final List<DownstreamThreadDto> component1() {
        return this.threads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryThreadsResponse copy(List<DownstreamThreadDto> threads, String duration, String prev, String next) {
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(duration, "duration");
        return new QueryThreadsResponse(threads, duration, prev, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryThreadsResponse)) {
            return false;
        }
        QueryThreadsResponse queryThreadsResponse = (QueryThreadsResponse) other;
        return AbstractC22676k.m65745e(this.threads, queryThreadsResponse.threads) && AbstractC22676k.m65745e(this.duration, queryThreadsResponse.duration) && AbstractC22676k.m65745e(this.prev, queryThreadsResponse.prev) && AbstractC22676k.m65745e(this.next, queryThreadsResponse.next);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<DownstreamThreadDto> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.threads.hashCode() * 31, 31, this.duration);
        String str = this.prev;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.next;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<DownstreamThreadDto> list = this.threads;
        String str = this.duration;
        return AbstractC11266d.m30464r(AbstractC26725a.m79507k("QueryThreadsResponse(threads=", ", duration=", str, ", prev=", list), this.prev, ", next=", this.next, ")");
    }
}
