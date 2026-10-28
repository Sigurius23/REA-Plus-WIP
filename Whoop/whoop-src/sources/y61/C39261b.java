package y61;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: y61.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ly61/b;", "", "", "widthPercent", "xPercent", "Ly81/e;", "color", "<init>", "(FFLy81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "c", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39261b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float widthPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    public C39261b(float f13, float f14, InterfaceC39332e color) {
        AbstractC22676k.m65750j(color, "color");
        this.widthPercent = f13;
        this.xPercent = f14;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getWidthPercent() {
        return this.widthPercent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39261b)) {
            return false;
        }
        C39261b c39261b = (C39261b) other;
        return Float.compare(this.widthPercent, c39261b.widthPercent) == 0 && Float.compare(this.xPercent, c39261b.xPercent) == 0 && AbstractC22676k.m65745e(this.color, c39261b.color);
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC11266d.m30447a(this.xPercent, Float.hashCode(this.widthPercent) * 31, 31);
    }

    public String toString() {
        float f13 = this.widthPercent;
        float f14 = this.xPercent;
        InterfaceC39332e interfaceC39332e = this.color;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("OverlayBarState(widthPercent=", f13, ", xPercent=", f14, ", color=");
        sbM8307t.append(interfaceC39332e);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
