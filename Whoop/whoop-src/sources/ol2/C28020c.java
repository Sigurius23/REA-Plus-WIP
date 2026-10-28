package ol2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ol2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lol2/c;", "", "", "hasFineLocation", "hasBackgroundLocation", "Lol2/a;", "currentDialogType", "<init>", "(ZZLol2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lol2/a;", "()Lol2/a;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28020c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasFineLocation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasBackgroundLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28018a currentDialogType;

    public C28020c(boolean z4, boolean z13, InterfaceC28018a interfaceC28018a) {
        this.hasFineLocation = z4;
        this.hasBackgroundLocation = z13;
        this.currentDialogType = interfaceC28018a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC28018a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasBackgroundLocation() {
        return this.hasBackgroundLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasFineLocation() {
        return this.hasFineLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28020c)) {
            return false;
        }
        C28020c c28020c = (C28020c) other;
        return this.hasFineLocation == c28020c.hasFineLocation && this.hasBackgroundLocation == c28020c.hasBackgroundLocation && AbstractC22676k.m65745e(this.currentDialogType, c28020c.currentDialogType);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.hasFineLocation) * 31, 31, this.hasBackgroundLocation);
        InterfaceC28018a interfaceC28018a = this.currentDialogType;
        return iM8289b + (interfaceC28018a == null ? 0 : interfaceC28018a.hashCode());
    }

    public String toString() {
        boolean z4 = this.hasFineLocation;
        boolean z13 = this.hasBackgroundLocation;
        InterfaceC28018a interfaceC28018a = this.currentDialogType;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("LocationSettingsDomainState(hasFineLocation=", ", hasBackgroundLocation=", ", currentDialogType=", z4, z13);
        sbM32002u.append(interfaceC28018a);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C28020c(boolean z4, boolean z13, InterfaceC28018a interfaceC28018a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : interfaceC28018a);
    }
}
