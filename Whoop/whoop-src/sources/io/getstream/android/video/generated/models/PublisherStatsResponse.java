package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/android/video/generated/models/PublisherStatsResponse;", "", "total", "", "unique", "byTrack", "", "Lio/getstream/android/video/generated/models/TrackStatsResponse;", "(IILjava/util/List;)V", "getByTrack", "()Ljava/util/List;", "getTotal", "()I", "getUnique", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class PublisherStatsResponse {
    private final List<TrackStatsResponse> byTrack;
    private final int total;
    private final int unique;

    public PublisherStatsResponse(@InterfaceC30731q(name = "total") int i13, @InterfaceC30731q(name = "unique") int i14, @InterfaceC30731q(name = "by_track") List<TrackStatsResponse> list) {
        this.total = i13;
        this.unique = i14;
        this.byTrack = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublisherStatsResponse copy$default(PublisherStatsResponse publisherStatsResponse, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = publisherStatsResponse.total;
        }
        if ((i15 & 2) != 0) {
            i14 = publisherStatsResponse.unique;
        }
        if ((i15 & 4) != 0) {
            list = publisherStatsResponse.byTrack;
        }
        return publisherStatsResponse.copy(i13, i14, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnique() {
        return this.unique;
    }

    public final List<TrackStatsResponse> component3() {
        return this.byTrack;
    }

    public final PublisherStatsResponse copy(@InterfaceC30731q(name = "total") int total, @InterfaceC30731q(name = "unique") int unique, @InterfaceC30731q(name = "by_track") List<TrackStatsResponse> byTrack) {
        return new PublisherStatsResponse(total, unique, byTrack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherStatsResponse)) {
            return false;
        }
        PublisherStatsResponse publisherStatsResponse = (PublisherStatsResponse) other;
        return this.total == publisherStatsResponse.total && this.unique == publisherStatsResponse.unique && AbstractC22676k.m65745e(this.byTrack, publisherStatsResponse.byTrack);
    }

    public final List<TrackStatsResponse> getByTrack() {
        return this.byTrack;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getUnique() {
        return this.unique;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.unique, Integer.hashCode(this.total) * 31, 31);
        List<TrackStatsResponse> list = this.byTrack;
        return iM30448b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        int i13 = this.total;
        int i14 = this.unique;
        return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "PublisherStatsResponse(total=", ", unique=", ", byTrack="), this.byTrack, ")");
    }

    public /* synthetic */ PublisherStatsResponse(int i13, int i14, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i15 & 4) != 0 ? C25271y.f99162w : list);
    }
}
