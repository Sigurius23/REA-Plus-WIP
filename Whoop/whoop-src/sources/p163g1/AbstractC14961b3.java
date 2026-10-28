package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d30.C11552o;
import fq2.C14686c;
import hg3.AbstractC17269i;
import hy0.C17751h2;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p003a1.C0109h;
import p077d0.C11376m;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p490t0.AbstractC33247d;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: g1.b3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14961b3 {

    /* JADX INFO: renamed from: a */
    public static final float f55827a = 56;

    /* JADX WARN: Code duplicated, block: B:102:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f5  */
    /* JADX INFO: renamed from: a */
    public static final void m43085a(InterfaceC4339a interfaceC4339a, Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, C15147t1 c15147t1, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC17869a1 interfaceC17869a1M105478b;
        C15147t1 c15147t2;
        InterfaceC17869a1 interfaceC17869a2;
        C15147t1 c15147t3;
        C15147t1 c15147t4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC21083i interfaceC21083i;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        C15208z2 c15208z2;
        boolean z4;
        Object objM87133R4;
        boolean zM87153g2;
        Object objM87133R5;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-482679837);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(null) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                interfaceC17869a1M105478b = interfaceC17869a1;
                if (c28655q.m87153g(interfaceC17869a1M105478b)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                interfaceC17869a1M105478b = interfaceC17869a1;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            interfaceC17869a1M105478b = interfaceC17869a1;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87151f(j13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                c15147t2 = c15147t1;
                int i17 = c28655q.m87153g(c15147t2) ? 1048576 : 524288;
                i15 |= i17;
            } else {
                c15147t2 = c15147t1;
            }
            i15 |= i17;
        } else {
            c15147t2 = c15147t1;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(c37816b) ? 8388608 : 4194304;
        }
        boolean z13 = true;
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 8) != 0) {
                    interfaceC17869a1M105478b = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56427a.m105478b(AbstractC33247d.m105484a(50));
                    i15 &= -7169;
                }
                if ((i14 & 64) != 0) {
                    float f13 = 6;
                    float f14 = 12;
                    float f15 = 8;
                    float f16 = 8;
                    boolean zM87147d = c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(f15) | c28655q.m87147d(f16);
                    Object objM87133R6 = c28655q.m87133R();
                    if (zM87147d || objM87133R6 == C28635l.f115821a) {
                        objM87133R6 = new C15147t1(f13, f14, f15, f16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    c15147t4 = (C15147t1) objM87133R6;
                    i15 &= -3670017;
                }
                c28655q.m87175r();
                c28655q.m87150e0(36083320);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q.m87173q(false);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14686c(23);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R2);
                int i18 = i15 >> 15;
                int i19 = i18 & 112;
                c15147t4.getClass();
                c28655q.m87150e0(-478475335);
                zM87153g = c28655q.m87153g(interfaceC21083i);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C15208z2(c15147t4.f56810a, c15147t4.f56811b, c15147t4.f56812c, c15147t4.f56813d);
                    c28655q.m87172p0(objM87133R3);
                }
                c15208z2 = (C15208z2) objM87133R3;
                boolean zM87157i = c28655q.m87157i(c15208z2);
                if (((i19 ^ 48) > 32 || !c28655q.m87153g(c15147t4)) && (i18 & 48) != 32) {
                }
                z4 = zM87157i | z13;
                objM87133R4 = c28655q.m87133R();
                if (z4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C11552o(c15208z2, c15147t4, null, 16);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c15147t4);
                zM87153g2 = c28655q.m87153g(interfaceC21083i) | c28655q.m87157i(c15208z2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C0109h(interfaceC21083i, c15208z2, (InterfaceC30057d) null, 28);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC21083i);
                C11376m c11376m = c15208z2.f57103e.f36343c;
                c28655q.m87173q(false);
                InterfaceC17869a1 interfaceC17869a3 = interfaceC17869a1M105478b;
                AbstractC17269i.m48900l(interfaceC4339a, modifierM51775c, false, interfaceC17869a3, j7, j13, null, ((C39174f) c11376m.f36471x.getValue()).f168413w, interfaceC21083i, AbstractC37817c.m121344e(-1823447062, c28655q, new C14950a3(j13, c37816b, 0)), c28655q, 805306368 | (i15 & 14) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 68);
                c15147t3 = c15147t4;
                interfaceC17869a2 = interfaceC17869a3;
            } else {
                c28655q.m87138X();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
            }
            c15147t4 = c15147t2;
            c28655q.m87175r();
            c28655q.m87150e0(36083320);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q.m87173q(false);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C14686c(23);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R2);
            int i110 = i15 >> 15;
            int i111 = i110 & 112;
            c15147t4.getClass();
            c28655q.m87150e0(-478475335);
            zM87153g = c28655q.m87153g(interfaceC21083i);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C15208z2(c15147t4.f56810a, c15147t4.f56811b, c15147t4.f56812c, c15147t4.f56813d);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C15208z2(c15147t4.f56810a, c15147t4.f56811b, c15147t4.f56812c, c15147t4.f56813d);
                c28655q.m87172p0(objM87133R3);
            }
            c15208z2 = (C15208z2) objM87133R3;
            boolean zM87157i2 = c28655q.m87157i(c15208z2);
            z13 = (i111 ^ 48) > 32 ? false : false;
            z4 = zM87157i2 | z13;
            objM87133R4 = c28655q.m87133R();
            if (z4) {
                objM87133R4 = new C11552o(c15208z2, c15147t4, null, 16);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C11552o(c15208z2, c15147t4, null, 16);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c15147t4);
            zM87153g2 = c28655q.m87153g(interfaceC21083i) | c28655q.m87157i(c15208z2);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R5 = new C0109h(interfaceC21083i, c15208z2, (InterfaceC30057d) null, 28);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C0109h(interfaceC21083i, c15208z2, (InterfaceC30057d) null, 28);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC21083i);
            C11376m c11376m2 = c15208z2.f57103e.f36343c;
            c28655q.m87173q(false);
            InterfaceC17869a1 interfaceC17869a4 = interfaceC17869a1M105478b;
            AbstractC17269i.m48900l(interfaceC4339a, modifierM51775c2, false, interfaceC17869a4, j7, j13, null, ((C39174f) c11376m2.f36471x.getValue()).f168413w, interfaceC21083i, AbstractC37817c.m121344e(-1823447062, c28655q, new C14950a3(j13, c37816b, 0)), c28655q, 805306368 | (i15 & 14) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 68);
            c15147t3 = c15147t4;
            interfaceC17869a2 = interfaceC17869a4;
        } else {
            c28655q.m87138X();
            interfaceC17869a2 = interfaceC17869a1M105478b;
            c15147t3 = c15147t2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17751h2(interfaceC4339a, modifier, interfaceC17869a2, j7, j13, c15147t3, c37816b, i13, i14);
        }
    }
}
