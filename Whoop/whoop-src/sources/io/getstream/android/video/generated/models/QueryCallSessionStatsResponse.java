package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallSessionStatsResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "callStats", "", "Lio/getstream/android/video/generated/models/CallStatsSessionResponse;", "next", "prev", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCallStats", "()Ljava/util/List;", "getDuration", "()Ljava/lang/String;", "getNext", "getPrev", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallSessionStatsResponse {
    private final List<CallStatsSessionResponse> callStats;
    private final String duration;
    private final String next;
    private final String prev;

    public QueryCallSessionStatsResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "call_stats") List<CallStatsSessionResponse> callStats, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(callStats, "callStats");
        this.duration = duration;
        this.callStats = callStats;
        this.next = str;
        this.prev = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallSessionStatsResponse copy$default(QueryCallSessionStatsResponse queryCallSessionStatsResponse, String str, List list, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryCallSessionStatsResponse.duration;
        }
        if ((i13 & 2) != 0) {
            list = queryCallSessionStatsResponse.callStats;
        }
        if ((i13 & 4) != 0) {
            str2 = queryCallSessionStatsResponse.next;
        }
        if ((i13 & 8) != 0) {
            str3 = queryCallSessionStatsResponse.prev;
        }
        return queryCallSessionStatsResponse.copy(str, list, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<CallStatsSessionResponse> component2() {
        return this.callStats;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final QueryCallSessionStatsResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "call_stats") List<CallStatsSessionResponse> callStats, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(callStats, "callStats");
        return new QueryCallSessionStatsResponse(duration, callStats, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallSessionStatsResponse)) {
            return false;
        }
        QueryCallSessionStatsResponse queryCallSessionStatsResponse = (QueryCallSessionStatsResponse) other;
        return AbstractC22676k.m65745e(this.duration, queryCallSessionStatsResponse.duration) && AbstractC22676k.m65745e(this.callStats, queryCallSessionStatsResponse.callStats) && AbstractC22676k.m65745e(this.next, queryCallSessionStatsResponse.next) && AbstractC22676k.m65745e(this.prev, queryCallSessionStatsResponse.prev);
    }

    public final List<CallStatsSessionResponse> getCallStats() {
        return this.callStats;
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

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.duration.hashCode() * 31, 31, this.callStats);
        String str = this.next;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.duration;
        List<CallStatsSessionResponse> list = this.callStats;
        return AbstractC11266d.m30464r(AbstractC30802r.m94766o("QueryCallSessionStatsResponse(duration=", str, ", callStats=", ", next=", list), this.next, ", prev=", this.prev, ")");
    }

    public /* synthetic */ QueryCallSessionStatsResponse(String str, List list, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
