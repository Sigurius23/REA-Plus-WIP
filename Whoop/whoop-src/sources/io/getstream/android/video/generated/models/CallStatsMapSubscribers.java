package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;", "", "locations", "", "Lio/getstream/android/video/generated/models/CallStatsMapLocation;", "participants", "Lio/getstream/android/video/generated/models/CallStatsMapSubscriber;", "(Ljava/util/List;Ljava/util/List;)V", "getLocations", "()Ljava/util/List;", "getParticipants", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsMapSubscribers {
    private final List<CallStatsMapLocation> locations;
    private final List<CallStatsMapSubscriber> participants;

    /* JADX WARN: Multi-variable type inference failed */
    public CallStatsMapSubscribers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallStatsMapSubscribers copy$default(CallStatsMapSubscribers callStatsMapSubscribers, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = callStatsMapSubscribers.locations;
        }
        if ((i13 & 2) != 0) {
            list2 = callStatsMapSubscribers.participants;
        }
        return callStatsMapSubscribers.copy(list, list2);
    }

    public final List<CallStatsMapLocation> component1() {
        return this.locations;
    }

    public final List<CallStatsMapSubscriber> component2() {
        return this.participants;
    }

    public final CallStatsMapSubscribers copy(@InterfaceC30731q(name = "locations") List<CallStatsMapLocation> locations, @InterfaceC30731q(name = "participants") List<CallStatsMapSubscriber> participants) {
        AbstractC22676k.m65750j(locations, "locations");
        return new CallStatsMapSubscribers(locations, participants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsMapSubscribers)) {
            return false;
        }
        CallStatsMapSubscribers callStatsMapSubscribers = (CallStatsMapSubscribers) other;
        return AbstractC22676k.m65745e(this.locations, callStatsMapSubscribers.locations) && AbstractC22676k.m65745e(this.participants, callStatsMapSubscribers.participants);
    }

    public final List<CallStatsMapLocation> getLocations() {
        return this.locations;
    }

    public final List<CallStatsMapSubscriber> getParticipants() {
        return this.participants;
    }

    public int hashCode() {
        int iHashCode = this.locations.hashCode() * 31;
        List<CallStatsMapSubscriber> list = this.participants;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return AbstractC13673n.m38562i("CallStatsMapSubscribers(locations=", ", participants=", this.locations, ")", this.participants);
    }

    public CallStatsMapSubscribers(@InterfaceC30731q(name = "locations") List<CallStatsMapLocation> locations, @InterfaceC30731q(name = "participants") List<CallStatsMapSubscriber> list) {
        AbstractC22676k.m65750j(locations, "locations");
        this.locations = locations;
        this.participants = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallStatsMapSubscribers(List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2);
    }
}
