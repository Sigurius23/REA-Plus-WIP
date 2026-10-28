package io.getstream.android.video.generated.models;

import jg3.C21682i;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CountByMinuteResponse;", "", "", "count", "Ljg3/i;", "startTs", "<init>", "(ILjg3/i;)V", "component1", "()I", "component2", "()Ljg3/i;", "copy", "(ILjg3/i;)Lio/getstream/android/video/generated/models/CountByMinuteResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Ljg3/i;", "getStartTs", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CountByMinuteResponse {
    private final int count;
    private final C21682i startTs;

    public CountByMinuteResponse(@InterfaceC30731q(name = "count") int i13, @InterfaceC30731q(name = "start_ts") C21682i startTs) {
        AbstractC22676k.m65750j(startTs, "startTs");
        this.count = i13;
        this.startTs = startTs;
    }

    public static /* synthetic */ CountByMinuteResponse copy$default(CountByMinuteResponse countByMinuteResponse, int i13, C21682i c21682i, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = countByMinuteResponse.count;
        }
        if ((i14 & 2) != 0) {
            c21682i = countByMinuteResponse.startTs;
        }
        return countByMinuteResponse.copy(i13, c21682i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getStartTs() {
        return this.startTs;
    }

    public final CountByMinuteResponse copy(@InterfaceC30731q(name = "count") int count, @InterfaceC30731q(name = "start_ts") C21682i startTs) {
        AbstractC22676k.m65750j(startTs, "startTs");
        return new CountByMinuteResponse(count, startTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountByMinuteResponse)) {
            return false;
        }
        CountByMinuteResponse countByMinuteResponse = (CountByMinuteResponse) other;
        return this.count == countByMinuteResponse.count && AbstractC22676k.m65745e(this.startTs, countByMinuteResponse.startTs);
    }

    public final int getCount() {
        return this.count;
    }

    public final C21682i getStartTs() {
        return this.startTs;
    }

    public int hashCode() {
        return this.startTs.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public String toString() {
        return "CountByMinuteResponse(count=" + this.count + ", startTs=" + this.startTs + ")";
    }
}
