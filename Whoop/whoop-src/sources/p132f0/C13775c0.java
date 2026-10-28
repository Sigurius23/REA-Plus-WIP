package p132f0;

import a20.C0162b;
import android.view.KeyEvent;
import bc3.AbstractC3006f0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import java.util.concurrent.CancellationException;
import p002a0.AbstractC0058w;
import p002a0.C0035k0;
import p003a1.C0107f;
import p078d1.C11456i;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p477s2.AbstractC32073e;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;

/* JADX INFO: renamed from: f0.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13775c0 extends AbstractC13789h {

    /* JADX INFO: renamed from: k0 */
    public InterfaceC4339a f49145k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f49146l0;

    /* JADX INFO: renamed from: m0 */
    public final C0035k0 f49147m0;

    /* JADX INFO: renamed from: n0 */
    public final C0035k0 f49148n0;

    public C13775c0(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC21083i interfaceC21083i) {
        super(interfaceC21083i, null, false, true, null, null, interfaceC4339a);
        this.f49145k0 = interfaceC4339a2;
        this.f49146l0 = true;
        C0035k0 c0035k0 = AbstractC0058w.f176a;
        this.f49147m0 = new C0035k0();
        this.f49148n0 = new C0035k0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        m39135k1();
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: a1 */
    public final void mo39130a1(InterfaceC18044z interfaceC18044z) {
        if (this.f49145k0 != null) {
            C11456i c11456i = new C11456i(this, 17);
            InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
            ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69956c, new C18017a(null, c11456i));
        }
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: b1 */
    public final C34462h0 mo39131b1() {
        return AbstractC34452c0.m108902a(new C0107f(this, 2));
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: g1 */
    public final void mo39132g1() {
        m39135k1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: h1 */
    public final boolean mo39133h1(KeyEvent keyEvent) {
        boolean z4;
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        if (this.f49145k0 != null) {
            C0035k0 c0035k0 = this.f49147m0;
            if (c0035k0.m81e(jM99714D) == null) {
                c0035k0.m84h(jM99714D, AbstractC3006f0.m8732z(m7158L0(), null, null, new C0162b(this, null, 15), 3));
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: i1 */
    public final void mo39134i1(KeyEvent keyEvent) {
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        C0035k0 c0035k0 = this.f49147m0;
        boolean z4 = false;
        if (c0035k0.m81e(jM99714D) != null) {
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c0035k0.m81e(jM99714D);
            if (interfaceC3027k1 != null) {
                if (interfaceC3027k1.isActive()) {
                    interfaceC3027k1.cancel((CancellationException) null);
                } else {
                    z4 = true;
                }
            }
            c0035k0.m83g(jM99714D);
        }
        if (z4) {
            return;
        }
        this.f49202W.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[LOOP:2: B:24:0x007f->B:35:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[EDGE_INSN: B:44:0x00b2->B:36:0x00b2 BREAK  A[LOOP:2: B:24:0x007f->B:35:0x00af], SYNTHETIC] */
    /* JADX INFO: renamed from: k1 */
    public final void m39135k1() {
        char c3;
        long j7;
        long j13;
        long j14;
        C0035k0 c0035k0 = this.f49147m0;
        Object[] objArr = c0035k0.f101c;
        long[] jArr = c0035k0.f99a;
        int length = jArr.length - 2;
        char c7 = 7;
        long j15 = -9187201950435737472L;
        if (length >= 0) {
            int i13 = 0;
            j13 = 128;
            while (true) {
                long j16 = jArr[i13];
                j14 = 255;
                if ((((~j16) << c7) & j16 & j15) != j15) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j16 & 255) < 128) {
                            ((InterfaceC3027k1) objArr[(i13 << 3) + i15]).cancel((CancellationException) null);
                        }
                        j16 >>= 8;
                        i15++;
                        c7 = c7;
                        j15 = j15;
                    }
                    c3 = c7;
                    j7 = j15;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    c3 = c7;
                    j7 = j15;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c7 = c3;
                j15 = j7;
            }
        } else {
            c3 = 7;
            j7 = -9187201950435737472L;
            j13 = 128;
            j14 = 255;
        }
        c0035k0.m77a();
        C0035k0 c0035k1 = this.f49148n0;
        Object[] objArr2 = c0035k1.f101c;
        long[] jArr2 = c0035k1.f99a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j17 = jArr2[i16];
                if ((((~j17) << c3) & j17 & j7) == j7) {
                    if (i16 != length2) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j17 & j14) < j13) {
                            ((AbstractC13839z) objArr2[(i16 << 3) + i18]).getClass();
                            throw null;
                        }
                        j17 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    } else if (i16 != length2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        }
        c0035k1.m77a();
    }
}
