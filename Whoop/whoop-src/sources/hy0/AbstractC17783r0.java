package hy0;

import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b01.C2190k;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hy0.r0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ln2/a;", "painter", "", "revealStartRatio", "Ly3/f;", "blurRadius", "Landroidx/compose/ui/Modifier;", "modifier", "Ly2/k;", "contentScale", "Ll83/a0;", "c", "(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17783r0 {
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x0166  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m51101c(AbstractC26165a painter, float f13, float f14, Modifier modifier, InterfaceC39105k interfaceC39105k, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC39105k interfaceC39105k2;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        InterfaceC39105k interfaceC39105k3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R;
        AbstractC22676k.m65750j(painter, "painter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(219166017);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(painter) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC39105k2 = interfaceC39105k;
                    if (c28655q.m87153g(interfaceC39105k2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC39105k3 = C39102j.f168199a;
                    } else {
                        interfaceC39105k3 = interfaceC39105k2;
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    C1100b c1100b = C1100b.f4583a;
                    Modifier modifier5 = modifier4;
                    int i24 = (i18 & 14) | 48 | (57344 & i18);
                    AbstractC29125c.m88522c(painter, null, c1100b.mo3401b(c2314t), null, interfaceC39105k3, 0.0f, null, c28655q, i24, 104);
                    Modifier modifierM3488c = AbstractC1127a.m3488c(c1100b.mo3401b(c2314t), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                    if ((i18 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C2190k(f13, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC29125c.m88522c(painter, null, AbstractC12313p.m34301s(f14, AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R)), null, interfaceC39105k3, 0.0f, null, c28655q, i24, 104);
                    c28655q.m87173q(true);
                    interfaceC39105k2 = interfaceC39105k3;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17780q0(painter, f13, f14, modifier3, interfaceC39105k2, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC39105k2 = interfaceC39105k;
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168199a;
                } else {
                    interfaceC39105k3 = interfaceC39105k2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C1100b c1100b2 = C1100b.f4583a;
                Modifier modifier6 = modifier4;
                int i25 = (i18 & 14) | 48 | (57344 & i18);
                AbstractC29125c.m88522c(painter, null, c1100b2.mo3401b(c2314t), null, interfaceC39105k3, 0.0f, null, c28655q, i25, 104);
                Modifier modifierM3488c2 = AbstractC1127a.m3488c(c1100b2.mo3401b(c2314t), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                if ((i18 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C2190k(f13, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2190k(f13, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC29125c.m88522c(painter, null, AbstractC12313p.m34301s(f14, AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R)), null, interfaceC39105k3, 0.0f, null, c28655q, i25, 104);
                c28655q.m87173q(true);
                interfaceC39105k2 = interfaceC39105k3;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17780q0(painter, f13, f14, modifier3, interfaceC39105k2, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC39105k2 = interfaceC39105k;
                if (c28655q.m87153g(interfaceC39105k2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168199a;
                } else {
                    interfaceC39105k3 = interfaceC39105k2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                C1100b c1100b3 = C1100b.f4583a;
                Modifier modifier7 = modifier4;
                int i26 = (i18 & 14) | 48 | (57344 & i18);
                AbstractC29125c.m88522c(painter, null, c1100b3.mo3401b(c2314t), null, interfaceC39105k3, 0.0f, null, c28655q, i26, 104);
                Modifier modifierM3488c3 = AbstractC1127a.m3488c(c1100b3.mo3401b(c2314t), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                if ((i18 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C2190k(f13, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2190k(f13, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC29125c.m88522c(painter, null, AbstractC12313p.m34301s(f14, AbstractC1125a.m3480c(modifierM3488c3, (Function1) objM87133R)), null, interfaceC39105k3, 0.0f, null, c28655q, i26, 104);
                c28655q.m87173q(true);
                interfaceC39105k2 = interfaceC39105k3;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17780q0(painter, f13, f14, modifier3, interfaceC39105k2, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC39105k2 = interfaceC39105k;
        i18 = i15;
        if ((i18 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                interfaceC39105k3 = C39102j.f168199a;
            } else {
                interfaceC39105k3 = interfaceC39105k2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            C1100b c1100b4 = C1100b.f4583a;
            Modifier modifier8 = modifier4;
            int i27 = (i18 & 14) | 48 | (57344 & i18);
            AbstractC29125c.m88522c(painter, null, c1100b4.mo3401b(c2314t), null, interfaceC39105k3, 0.0f, null, c28655q, i27, 104);
            Modifier modifierM3488c4 = AbstractC1127a.m3488c(c1100b4.mo3401b(c2314t), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            if ((i18 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C2190k(f13, 4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2190k(f13, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29125c.m88522c(painter, null, AbstractC12313p.m34301s(f14, AbstractC1125a.m3480c(modifierM3488c4, (Function1) objM87133R)), null, interfaceC39105k3, 0.0f, null, c28655q, i27, 104);
            c28655q.m87173q(true);
            interfaceC39105k2 = interfaceC39105k3;
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17780q0(painter, f13, f14, modifier3, interfaceC39105k2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m51102d(float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69636m;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(j7)), new C23465k(Float.valueOf(f13), new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69625b))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m51103e(AbstractC26165a abstractC26165a, float f13, float f14, Modifier modifier, InterfaceC39105k interfaceC39105k, int i13, int i14, Composer composer, int i15) {
        m51101c(abstractC26165a, f13, f14, modifier, interfaceC39105k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
