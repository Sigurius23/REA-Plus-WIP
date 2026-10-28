package io.getstream.android.video.generated.models;

import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GroupedStatsResponse;", "", "name", "", "unique", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getUnique", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GroupedStatsResponse {
    private final String name;
    private final int unique;

    public GroupedStatsResponse(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "unique") int i13) {
        AbstractC22676k.m65750j(name, "name");
        this.name = name;
        this.unique = i13;
    }

    public static /* synthetic */ GroupedStatsResponse copy$default(GroupedStatsResponse groupedStatsResponse, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = groupedStatsResponse.name;
        }
        if ((i14 & 2) != 0) {
            i13 = groupedStatsResponse.unique;
        }
        return groupedStatsResponse.copy(str, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnique() {
        return this.unique;
    }

    public final GroupedStatsResponse copy(@InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "unique") int unique) {
        AbstractC22676k.m65750j(name, "name");
        return new GroupedStatsResponse(name, unique);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedStatsResponse)) {
            return false;
        }
        GroupedStatsResponse groupedStatsResponse = (GroupedStatsResponse) other;
        return AbstractC22676k.m65745e(this.name, groupedStatsResponse.name) && this.unique == groupedStatsResponse.unique;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUnique() {
        return this.unique;
    }

    public int hashCode() {
        return Integer.hashCode(this.unique) + (this.name.hashCode() * 31);
    }

    public String toString() {
        return AbstractC11895b.m31993l(this.unique, "GroupedStatsResponse(name=", this.name, ", unique=", ")");
    }
}
