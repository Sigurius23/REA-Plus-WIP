package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsMapLocation;", "", "count", "", "liveCount", "location", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "(IILio/getstream/android/video/generated/models/CallStatsLocation;)V", "getCount", "()I", "getLiveCount", "getLocation", "()Lio/getstream/android/video/generated/models/CallStatsLocation;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsMapLocation {
    private final int count;
    private final int liveCount;
    private final CallStatsLocation location;

    public CallStatsMapLocation(@InterfaceC30731q(name = "count") int i13, @InterfaceC30731q(name = "live_count") int i14, @InterfaceC30731q(name = "location") CallStatsLocation callStatsLocation) {
        this.count = i13;
        this.liveCount = i14;
        this.location = callStatsLocation;
    }

    public static /* synthetic */ CallStatsMapLocation copy$default(CallStatsMapLocation callStatsMapLocation, int i13, int i14, CallStatsLocation callStatsLocation, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = callStatsMapLocation.count;
        }
        if ((i15 & 2) != 0) {
            i14 = callStatsMapLocation.liveCount;
        }
        if ((i15 & 4) != 0) {
            callStatsLocation = callStatsMapLocation.location;
        }
        return callStatsMapLocation.copy(i13, i14, callStatsLocation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLiveCount() {
        return this.liveCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final CallStatsMapLocation copy(@InterfaceC30731q(name = "count") int count, @InterfaceC30731q(name = "live_count") int liveCount, @InterfaceC30731q(name = "location") CallStatsLocation location) {
        return new CallStatsMapLocation(count, liveCount, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsMapLocation)) {
            return false;
        }
        CallStatsMapLocation callStatsMapLocation = (CallStatsMapLocation) other;
        return this.count == callStatsMapLocation.count && this.liveCount == callStatsMapLocation.liveCount && AbstractC22676k.m65745e(this.location, callStatsMapLocation.location);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getLiveCount() {
        return this.liveCount;
    }

    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.liveCount, Integer.hashCode(this.count) * 31, 31);
        CallStatsLocation callStatsLocation = this.location;
        return iM30448b + (callStatsLocation == null ? 0 : callStatsLocation.hashCode());
    }

    public String toString() {
        int i13 = this.count;
        int i14 = this.liveCount;
        CallStatsLocation callStatsLocation = this.location;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "CallStatsMapLocation(count=", ", liveCount=", ", location=");
        sbM30465s.append(callStatsLocation);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ CallStatsMapLocation(int i13, int i14, CallStatsLocation callStatsLocation, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i15 & 4) != 0 ? null : callStatsLocation);
    }
}
