package p361o9;

import p031b9.AbstractC2829f;
import p516u8.C34610p;
import p516u8.C34611p0;

/* JADX INFO: renamed from: o9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C27667g extends AbstractC27675o implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f111363E;

    /* JADX INFO: renamed from: F */
    public final int f111364F;

    public C27667g(int i13, C34611p0 c34611p0, int i14, C27670j c27670j, int i15) {
        int i16;
        super(i13, c34611p0, i14);
        this.f111363E = AbstractC2829f.m8056m(i15, c27670j.f111385z) ? 1 : 0;
        C34610p c34610p = this.f111403z;
        int i17 = c34610p.f145790u;
        int i18 = -1;
        if (i17 != -1 && (i16 = c34610p.f145791v) != -1) {
            i18 = i17 * i16;
        }
        this.f111364F = i18;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: a */
    public final int mo83659a() {
        return this.f111363E;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo83660b(AbstractC27675o abstractC27675o) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f111364F, ((C27667g) obj).f111364F);
    }
}
