package d40;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p291l0.C22976l1;

/* JADX INFO: renamed from: d40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C11662g {

    /* JADX INFO: renamed from: a */
    public final float f37644a;

    /* JADX INFO: renamed from: b */
    public final float f37645b;

    /* JADX INFO: renamed from: c */
    public final float f37646c;

    /* JADX INFO: renamed from: d */
    public final float f37647d;

    public C11662g(float f13, float f14, float f15, float f16) {
        this.f37644a = f13;
        this.f37645b = f14;
        this.f37646c = f15;
        this.f37647d = f16;
    }

    /* JADX INFO: renamed from: a */
    public final C22976l1 m31070a() {
        return new C22976l1(this.f37644a, this.f37645b, this.f37646c, this.f37647d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11662g)) {
            return false;
        }
        C11662g c11662g = (C11662g) obj;
        return Float.compare(this.f37644a, c11662g.f37644a) == 0 && Float.compare(this.f37645b, c11662g.f37645b) == 0 && Float.compare(this.f37646c, c11662g.f37646c) == 0 && Float.compare(this.f37647d, c11662g.f37647d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37647d) + AbstractC11266d.m30447a(this.f37646c, AbstractC11266d.m30447a(this.f37645b, Float.hashCode(this.f37644a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM8307t = AbstractC2875y.m8307t("FormInsets(start=", this.f37644a, ", top=", this.f37645b, ", end=");
        sbM8307t.append(this.f37646c);
        sbM8307t.append(", bottom=");
        sbM8307t.append(this.f37647d);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
