package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsMapPublishers;", "", "publishers", "", "Lio/getstream/android/video/generated/models/CallStatsMapPublisher;", "(Ljava/util/List;)V", "getPublishers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsMapPublishers {
    private final List<CallStatsMapPublisher> publishers;

    /* JADX WARN: Multi-variable type inference failed */
    public CallStatsMapPublishers() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallStatsMapPublishers copy$default(CallStatsMapPublishers callStatsMapPublishers, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = callStatsMapPublishers.publishers;
        }
        return callStatsMapPublishers.copy(list);
    }

    public final List<CallStatsMapPublisher> component1() {
        return this.publishers;
    }

    public final CallStatsMapPublishers copy(@InterfaceC30731q(name = "publishers") List<CallStatsMapPublisher> publishers) {
        AbstractC22676k.m65750j(publishers, "publishers");
        return new CallStatsMapPublishers(publishers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallStatsMapPublishers) && AbstractC22676k.m65745e(this.publishers, ((CallStatsMapPublishers) other).publishers);
    }

    public final List<CallStatsMapPublisher> getPublishers() {
        return this.publishers;
    }

    public int hashCode() {
        return this.publishers.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("CallStatsMapPublishers(publishers=", ")", this.publishers);
    }

    public CallStatsMapPublishers(@InterfaceC30731q(name = "publishers") List<CallStatsMapPublisher> publishers) {
        AbstractC22676k.m65750j(publishers, "publishers");
        this.publishers = publishers;
    }

    public /* synthetic */ CallStatsMapPublishers(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
