package com.mapbox.maps;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/maps/SnapshotOverlayOptions;", "", "showLogo", "", "showAttributes", "(ZZ)V", "getShowAttributes", "()Z", "getShowLogo", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class SnapshotOverlayOptions {
    private final boolean showAttributes;
    private final boolean showLogo;

    /* JADX WARN: Illegal instructions before constructor call */
    public SnapshotOverlayOptions() {
        boolean z4 = false;
        this(z4, z4, 3, null);
    }

    public static /* synthetic */ SnapshotOverlayOptions copy$default(SnapshotOverlayOptions snapshotOverlayOptions, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = snapshotOverlayOptions.showLogo;
        }
        if ((i13 & 2) != 0) {
            z13 = snapshotOverlayOptions.showAttributes;
        }
        return snapshotOverlayOptions.copy(z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final SnapshotOverlayOptions copy(boolean showLogo, boolean showAttributes) {
        return new SnapshotOverlayOptions(showLogo, showAttributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotOverlayOptions)) {
            return false;
        }
        SnapshotOverlayOptions snapshotOverlayOptions = (SnapshotOverlayOptions) other;
        return this.showLogo == snapshotOverlayOptions.showLogo && this.showAttributes == snapshotOverlayOptions.showAttributes;
    }

    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z4 = this.showLogo;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = r10 * 31;
        boolean z13 = this.showAttributes;
        return i13 + (z13 ? 1 : z13);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SnapshotOverlayOptions(showLogo=");
        sb4.append(this.showLogo);
        sb4.append(", showAttributes=");
        return AbstractC2875y.m8305r(sb4, this.showAttributes, ')');
    }

    public SnapshotOverlayOptions(boolean z4) {
        this(z4, false, 2, null);
    }

    public SnapshotOverlayOptions(boolean z4, boolean z13) {
        this.showLogo = z4;
        this.showAttributes = z13;
    }

    public /* synthetic */ SnapshotOverlayOptions(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? true : z13);
    }
}
