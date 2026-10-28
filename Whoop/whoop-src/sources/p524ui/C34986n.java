package p524ui;

import p000.AbstractC30802r;
import p426qi.C30387i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ui.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C34986n extends AbstractC34987o {

    /* JADX INFO: renamed from: a */
    public final float f148041a;

    /* JADX INFO: renamed from: b */
    public final float f148042b;

    public C34986n(float f13, float f14) {
        this.f148041a = f13;
        this.f148042b = f14;
    }

    @Override // p524ui.AbstractC34987o
    /* JADX INFO: renamed from: a */
    public final float mo110477a(C30387i composition) {
        AbstractC22676k.m65750j(composition, "composition");
        return this.f148042b;
    }

    @Override // p524ui.AbstractC34987o
    /* JADX INFO: renamed from: b */
    public final float mo110478b(C30387i composition) {
        AbstractC22676k.m65750j(composition, "composition");
        return this.f148041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34986n)) {
            return false;
        }
        C34986n c34986n = (C34986n) obj;
        return Float.compare(this.f148041a, c34986n.f148041a) == 0 && Float.compare(this.f148042b, c34986n.f148042b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f148042b) + (Float.hashCode(this.f148041a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Progress(min=");
        sb4.append(this.f148041a);
        sb4.append(", max=");
        return AbstractC30802r.m94763l(sb4, this.f148042b, ')');
    }
}
