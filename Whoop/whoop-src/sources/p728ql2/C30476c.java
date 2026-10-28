package p728ql2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ql2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lql2/c;", "", "", "hasFineLocation", "hasBackgroundLocation", "showBackgroundLocationDialog", "isLoading", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "d", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30476c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasFineLocation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasBackgroundLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showBackgroundLocationDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoading;

    public C30476c(boolean z4, boolean z13, boolean z14, boolean z15) {
        this.hasFineLocation = z4;
        this.hasBackgroundLocation = z13;
        this.showBackgroundLocationDialog = z14;
        this.isLoading = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasBackgroundLocation() {
        return this.hasBackgroundLocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasFineLocation() {
        return this.hasFineLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowBackgroundLocationDialog() {
        return this.showBackgroundLocationDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30476c)) {
            return false;
        }
        C30476c c30476c = (C30476c) other;
        return this.hasFineLocation == c30476c.hasFineLocation && this.hasBackgroundLocation == c30476c.hasBackgroundLocation && this.showBackgroundLocationDialog == c30476c.showBackgroundLocationDialog && this.isLoading == c30476c.isLoading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.hasFineLocation) * 31, 31, this.hasBackgroundLocation), 31, this.showBackgroundLocationDialog);
    }

    public String toString() {
        boolean z4 = this.hasFineLocation;
        boolean z13 = this.hasBackgroundLocation;
        return AbstractC36095b.m114682j(AbstractC11895b.m32002u("LocationSettingsViewState(hasFineLocation=", ", hasBackgroundLocation=", ", showBackgroundLocationDialog=", z4, z13), this.showBackgroundLocationDialog, ", isLoading=", this.isLoading, ")");
    }

    public /* synthetic */ C30476c(boolean z4, boolean z13, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
