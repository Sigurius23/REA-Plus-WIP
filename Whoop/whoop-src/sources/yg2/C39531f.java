package yg2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yg2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lyg2/f;", "", "", "chargePercent", "", "chargePercentLabel", "color", "", "isPuffinReady", "<init>", "(ILjava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39531f {

    /* JADX INFO: renamed from: e */
    public static final int f170077e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int chargePercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String chargePercentLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isPuffinReady;

    public C39531f(int i13, String chargePercentLabel, int i14, boolean z4) {
        AbstractC22676k.m65750j(chargePercentLabel, "chargePercentLabel");
        this.chargePercent = i13;
        this.chargePercentLabel = chargePercentLabel;
        this.color = i14;
        this.isPuffinReady = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getChargePercent() {
        return this.chargePercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChargePercentLabel() {
        return this.chargePercentLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPuffinReady() {
        return this.isPuffinReady;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39531f)) {
            return false;
        }
        C39531f c39531f = (C39531f) other;
        return this.chargePercent == c39531f.chargePercent && AbstractC22676k.m65745e(this.chargePercentLabel, c39531f.chargePercentLabel) && this.color == c39531f.color && this.isPuffinReady == c39531f.isPuffinReady;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPuffinReady) + AbstractC11266d.m30448b(this.color, AbstractC11266d.m30450d(Integer.hashCode(this.chargePercent) * 31, 31, this.chargePercentLabel), 31);
    }

    public String toString() {
        int i13 = this.chargePercent;
        String str = this.chargePercentLabel;
        int i14 = this.color;
        boolean z4 = this.isPuffinReady;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "PuffinBatteryPackIndicatorViewState(chargePercent=", ", chargePercentLabel=", str, ", color=");
        sbM53373n.append(i14);
        sbM53373n.append(", isPuffinReady=");
        sbM53373n.append(z4);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ C39531f(int i13, String str, int i14, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? false : z4);
    }
}
