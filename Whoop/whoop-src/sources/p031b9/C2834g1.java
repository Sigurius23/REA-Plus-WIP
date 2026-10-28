package p031b9;

import p299l9.AbstractC23523r;
import p516u8.AbstractC34609o0;
import p516u8.C34582b;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34620u;
import p516u8.C34626x;

/* JADX INFO: renamed from: b9.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2834g1 extends AbstractC23523r {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f11181c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f11182d;

    public C2834g1(AbstractC34609o0 abstractC34609o0, C34626x c34626x) {
        super(abstractC34609o0);
        this.f11182d = c34626x;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        switch (this.f11181c) {
            case 0:
                AbstractC34609o0 abstractC34609o0 = this.f93108b;
                C34605m0 c34605m0Mo8128f = abstractC34609o0.mo8128f(i13, c34605m0, z4);
                if (abstractC34609o0.mo8129m(c34605m0Mo8128f.f145693c, (C34607n0) this.f11182d, 0L).m109401a()) {
                    c34605m0Mo8128f.m109399h(c34605m0.f145691a, c34605m0.f145692b, c34605m0.f145693c, c34605m0.f145694d, c34605m0.f145695e, C34582b.f145636c, true);
                } else {
                    c34605m0Mo8128f.f145696f = true;
                }
                return c34605m0Mo8128f;
            default:
                return super.mo8128f(i13, c34605m0, z4);
        }
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        switch (this.f11181c) {
            case 1:
                super.mo8129m(i13, c34607n0, j7);
                C34626x c34626x = (C34626x) this.f11182d;
                c34607n0.f145703c = c34626x;
                C34620u c34620u = c34626x.f145867b;
                c34607n0.getClass();
                return c34607n0;
            default:
                return super.mo8129m(i13, c34607n0, j7);
        }
    }

    public C2834g1(AbstractC34609o0 abstractC34609o0) {
        super(abstractC34609o0);
        this.f11182d = new C34607n0();
    }
}
