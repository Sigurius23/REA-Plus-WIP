package p516u8;

import p508ty.C34249c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C34586d {

    /* JADX INFO: renamed from: c */
    public static final C34586d f145642c = new C34586d(0);

    /* JADX INFO: renamed from: a */
    public final int f145643a;

    /* JADX INFO: renamed from: b */
    public C34249c f145644b;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
    }

    public C34586d(int i13) {
        this.f145643a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C34249c m109367a() {
        if (this.f145644b == null) {
            this.f145644b = new C34249c(this);
        }
        return this.f145644b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C34586d.class == obj.getClass() && this.f145643a == ((C34586d) obj).f145643a;
    }

    public final int hashCode() {
        return (((((527 + this.f145643a) * 961) + 1) * 31) + 1) * 31;
    }
}
