package f71;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lf71/e;", "", "", "xPercent", "Lf71/f;", "markerType", "", "label", "subLabel", "<init>", "(FLf71/f;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "d", "()F", "b", "Lf71/f;", "()Lf71/f;", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14224e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC14225f markerType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subLabel;

    public C14224e(float f13, EnumC14225f markerType, String label, String subLabel) {
        AbstractC22676k.m65750j(markerType, "markerType");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(subLabel, "subLabel");
        this.xPercent = f13;
        this.markerType = markerType;
        this.label = label;
        this.subLabel = subLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC14225f getMarkerType() {
        return this.markerType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14224e)) {
            return false;
        }
        C14224e c14224e = (C14224e) other;
        return Float.compare(this.xPercent, c14224e.xPercent) == 0 && this.markerType == c14224e.markerType && AbstractC22676k.m65745e(this.label, c14224e.label) && AbstractC22676k.m65745e(this.subLabel, c14224e.subLabel);
    }

    public int hashCode() {
        return this.subLabel.hashCode() + AbstractC11266d.m30450d((this.markerType.hashCode() + (Float.hashCode(this.xPercent) * 31)) * 31, 31, this.label);
    }

    public String toString() {
        float f13 = this.xPercent;
        EnumC14225f enumC14225f = this.markerType;
        String str = this.label;
        String str2 = this.subLabel;
        StringBuilder sb4 = new StringBuilder("VerticalMarkerState(xPercent=");
        sb4.append(f13);
        sb4.append(", markerType=");
        sb4.append(enumC14225f);
        sb4.append(", label=");
        return AbstractC11266d.m30464r(sb4, str, ", subLabel=", str2, ")");
    }
}
