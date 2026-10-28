package p390p1;

import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: p1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C28591a {

    /* JADX INFO: renamed from: a */
    public int f115705a;

    public C28591a(int i13) {
        this.f115705a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86976a() {
        return this.f115705a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("{ location = ");
        return AbstractC18489d0.m53371l(sb4, this.f115705a, " }");
    }
}
