package o11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import ep1.C13421p;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o11.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isSuperset", "showSupersetDragHandle", "supersetRowModifier", "Lkotlin/Function1;", "Ll0/y;", "Ll83/a0;", "content", "e", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "showDragHandle", "Li2/x;", "supersetColor", "c", "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27413s {
    /* JADX INFO: renamed from: c */
    public static final void m82776c(Modifier modifier, final boolean z4, long j7, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        long white50;
        final Modifier modifier3;
        final long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(348304471);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                white50 = j7;
                int i17 = c28655q.m87151f(white50) ? 256 : 128;
                i15 |= i17;
            } else {
                white50 = j7;
            }
            i15 |= i17;
        } else {
            white50 = j7;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            int i18 = i13 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i18 == 0 || c28655q.m87118C()) {
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    i15 &= -897;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
            }
            int i19 = i15;
            long j14 = white50;
            c28655q.m87175r();
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier2), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            float f14 = 4;
            int i24 = (i19 << 3) & 7168;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getStrain().getSuperset(), c28655q, 6), null, AbstractC1102d.m3419p(5 * f14, c2314t), j14, c28655q, i24 | 432, 0);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62385u2);
            C2886a sh4 = c38072d.m121952e(c28655q, 6).getSh4();
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * f13, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM92103Y, AbstractC11895b.m31988g(modifierM3396r, true, 1.0f), j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, i19 & 896, 0, 196600);
            c28655q = c28655q;
            if (z4) {
                c28655q.m87150e0(1121687041);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getDrag(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62315d0), AbstractC1102d.m3419p(7 * f14, c2314t), j14, c28655q, i24 | 384, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1121969575);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier2;
            j13 = j14;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            j13 = white50;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.r
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27413s.m82777d(modifier3, z4, j13, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m82777d(Modifier modifier, boolean z4, long j7, int i13, int i14, Composer composer, int i15) {
        m82776c(modifier, z4, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m82778e(Modifier modifier, boolean z4, boolean z13, Modifier modifier2, Function3 content, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        boolean z14;
        int i16;
        Modifier modifier4;
        int i17;
        boolean z15;
        Modifier modifier5;
        Modifier modifier6;
        boolean z16;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier7;
        long white50;
        Modifier modifierM3394p;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-931795563);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z13;
                i15 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    modifier4 = modifier2;
                    if (c28655q.m87153g(modifier4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i25 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    if (z4) {
                        float f13 = 1;
                        modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC15751g.m44455h(modifier3, f13, white50, AbstractC33253j.m105489e(4 * f13)));
                    } else {
                        modifierM3394p = modifier3;
                    }
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (z4) {
                        c28655q.m87150e0(893459123);
                        i18 = 6;
                        m82776c(modifier7, z14, 0L, c28655q, ((i15 >> 9) & 14) | ((i15 >> 3) & 112), 4);
                        c28655q.m87173q(false);
                    } else {
                        i18 = 6;
                        c28655q.m87150e0(893536003);
                        c28655q.m87173q(false);
                    }
                    content.invoke(C23016z.f90757a, c28655q, Integer.valueOf(i18 | ((i15 >> 9) & 112)));
                    c28655q.m87173q(true);
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier4;
                }
                modifier6 = modifier3;
                z16 = z14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier6, z4, z16, modifier5, content, i13, i14, 11);
                }
            }
            i15 |= 3072;
            modifier4 = modifier2;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                }
                if (i25 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                if (z4) {
                    float f14 = 1;
                    modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC15751g.m44455h(modifier3, f14, white50, AbstractC33253j.m105489e(4 * f14)));
                } else {
                    modifierM3394p = modifier3;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (z4) {
                    c28655q.m87150e0(893459123);
                    i18 = 6;
                    m82776c(modifier7, z14, 0L, c28655q, ((i15 >> 9) & 14) | ((i15 >> 3) & 112), 4);
                    c28655q.m87173q(false);
                } else {
                    i18 = 6;
                    c28655q.m87150e0(893536003);
                    c28655q.m87173q(false);
                }
                content.invoke(C23016z.f90757a, c28655q, Integer.valueOf(i18 | ((i15 >> 9) & 112)));
                c28655q.m87173q(true);
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                modifier5 = modifier4;
            }
            modifier6 = modifier3;
            z16 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier6, z4, z16, modifier5, content, i13, i14, 11);
            }
        }
        i15 |= 384;
        z14 = z13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                modifier4 = modifier2;
                if (c28655q.m87153g(modifier4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                }
                if (i25 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                if (z4) {
                    float f15 = 1;
                    modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC15751g.m44455h(modifier3, f15, white50, AbstractC33253j.m105489e(4 * f15)));
                } else {
                    modifierM3394p = modifier3;
                }
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (z4) {
                    c28655q.m87150e0(893459123);
                    i18 = 6;
                    m82776c(modifier7, z14, 0L, c28655q, ((i15 >> 9) & 14) | ((i15 >> 3) & 112), 4);
                    c28655q.m87173q(false);
                } else {
                    i18 = 6;
                    c28655q.m87150e0(893536003);
                    c28655q.m87173q(false);
                }
                content.invoke(C23016z.f90757a, c28655q, Integer.valueOf(i18 | ((i15 >> 9) & 112)));
                c28655q.m87173q(true);
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                modifier5 = modifier4;
            }
            modifier6 = modifier3;
            z16 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier6, z4, z16, modifier5, content, i13, i14, 11);
            }
        }
        i15 |= 3072;
        modifier4 = modifier2;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(content)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            }
            if (i25 != 0) {
                z14 = false;
            }
            if (i16 != 0) {
                modifier7 = c2314t;
            } else {
                modifier7 = modifier4;
            }
            white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
            if (z4) {
                float f16 = 1;
                modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC15751g.m44455h(modifier3, f16, white50, AbstractC33253j.m105489e(4 * f16)));
            } else {
                modifierM3394p = modifier3;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (z4) {
                c28655q.m87150e0(893459123);
                i18 = 6;
                m82776c(modifier7, z14, 0L, c28655q, ((i15 >> 9) & 14) | ((i15 >> 3) & 112), 4);
                c28655q.m87173q(false);
            } else {
                i18 = 6;
                c28655q.m87150e0(893536003);
                c28655q.m87173q(false);
            }
            content.invoke(C23016z.f90757a, c28655q, Integer.valueOf(i18 | ((i15 >> 9) & 112)));
            c28655q.m87173q(true);
            modifier5 = modifier7;
        } else {
            c28655q.m87138X();
            modifier5 = modifier4;
        }
        modifier6 = modifier3;
        z16 = z14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(modifier6, z4, z16, modifier5, content, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82779f(Modifier modifier, boolean z4, boolean z13, Modifier modifier2, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m82778e(modifier, z4, z13, modifier2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
