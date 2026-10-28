package d91;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c51.C4224b;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p291l0.InterfaceC22974l;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: d91.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "switchAt", "Landroidx/compose/ui/Modifier;", "modifier", "Ld91/c;", "initial", "whenConditionMet", "Lkotlin/Function0;", "Ll83/a0;", "content", "b", "(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11816d {
    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x0155  */
    /* JADX WARN: Code duplicated, block: B:97:0x0165  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    /* JADX INFO: renamed from: b */
    public static final void m31681b(float f13, Modifier modifier, InterfaceC11815c interfaceC11815c, InterfaceC11815c interfaceC11815c2, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        InterfaceC11815c interfaceC11815c3;
        InterfaceC11815c interfaceC11815c4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC11815c interfaceC11815c5;
        C39174f spacing;
        InterfaceC22974l interfaceC22974lM66746i;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C39174f spacing2;
        InterfaceC22965i interfaceC22965iM66746i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        boolean zM87157i2;
        InterfaceC11815c aVar = interfaceC11815c;
        InterfaceC11815c bVar = interfaceC11815c2;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(348697716);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) != 0) {
                    i18 = 128;
                } else {
                    if ((i13 & 512) == 0) {
                        zM87157i2 = c28655q.m87153g(aVar);
                    } else {
                        zM87157i2 = c28655q.m87157i(aVar);
                    }
                    if (zM87157i2) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                }
                i15 |= i18;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) != 0) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if ((i13 & 4096) == 0) {
                        zM87157i = c28655q.m87153g(bVar);
                    } else {
                        zM87157i = c28655q.m87157i(bVar);
                    }
                    if (zM87157i) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i19 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        aVar = new InterfaceC11815c.a(null, null, 3, null);
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        bVar = new InterfaceC11815c.b(null, null, 3, null);
                        i15 &= -7169;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                c28655q.m87175r();
                if (((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getFontScale() >= f13) {
                    interfaceC11815c5 = bVar;
                } else {
                    interfaceC11815c5 = aVar;
                }
                if (interfaceC11815c5 instanceof InterfaceC11815c.a) {
                    c28655q.m87150e0(91068555);
                    InterfaceC11815c.a aVar2 = (InterfaceC11815c.a) interfaceC11815c5;
                    spacing2 = aVar2.getSpacing();
                    if (spacing2 != null) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(spacing2.f168413w);
                    } else {
                        interfaceC22965iM66746i = AbstractC22977m.f90650a;
                    }
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965iM66746i, aVar2.getAlignment(), c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC11895b.m31978A((i15 >> 12) & 14, content, c28655q, true, false);
                } else {
                    if (interfaceC11815c5 instanceof InterfaceC11815c.b) {
                        throw AbstractC11895b.m32003v(91067172, c28655q, false);
                    }
                    c28655q.m87150e0(91076652);
                    InterfaceC11815c.b bVar2 = (InterfaceC11815c.b) interfaceC11815c5;
                    spacing = bVar2.getSpacing();
                    if (spacing != null) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(spacing.f168413w);
                    } else {
                        interfaceC22974lM66746i = AbstractC22977m.f90652c;
                    }
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(interfaceC22974lM66746i, bVar2.getAlignment(), c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    AbstractC11895b.m31978A((i15 >> 12) & 14, content, c28655q, true, false);
                }
            } else {
                c28655q.m87138X();
            }
            interfaceC11815c3 = aVar;
            interfaceC11815c4 = bVar;
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(f13, modifier3, interfaceC11815c3, interfaceC11815c4, content, i13, i14, 1);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i18 = 128;
            } else {
                if ((i13 & 512) == 0) {
                    zM87157i2 = c28655q.m87153g(aVar);
                } else {
                    zM87157i2 = c28655q.m87157i(aVar);
                }
                if (zM87157i2) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
            }
            i15 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0) {
                    zM87157i = c28655q.m87153g(bVar);
                } else {
                    zM87157i = c28655q.m87157i(bVar);
                }
                if (zM87157i) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(content)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    aVar = new InterfaceC11815c.a(null, null, 3, null);
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    bVar = new InterfaceC11815c.b(null, null, 3, null);
                    i15 &= -7169;
                }
            } else {
                if (i19 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    aVar = new InterfaceC11815c.a(null, null, 3, null);
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    bVar = new InterfaceC11815c.b(null, null, 3, null);
                    i15 &= -7169;
                }
            }
            c28655q.m87175r();
            if (((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getFontScale() >= f13) {
                interfaceC11815c5 = bVar;
            } else {
                interfaceC11815c5 = aVar;
            }
            if (interfaceC11815c5 instanceof InterfaceC11815c.a) {
                c28655q.m87150e0(91068555);
                InterfaceC11815c.a aVar3 = (InterfaceC11815c.a) interfaceC11815c5;
                spacing2 = aVar3.getSpacing();
                if (spacing2 != null) {
                    interfaceC22965iM66746i = AbstractC22977m.m66746i(spacing2.f168413w);
                } else {
                    interfaceC22965iM66746i = AbstractC22977m.f90650a;
                }
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(interfaceC22965iM66746i, aVar3.getAlignment(), c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC11895b.m31978A((i15 >> 12) & 14, content, c28655q, true, false);
            } else {
                if (interfaceC11815c5 instanceof InterfaceC11815c.b) {
                    throw AbstractC11895b.m32003v(91067172, c28655q, false);
                }
                c28655q.m87150e0(91076652);
                InterfaceC11815c.b bVar3 = (InterfaceC11815c.b) interfaceC11815c5;
                spacing = bVar3.getSpacing();
                if (spacing != null) {
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(spacing.f168413w);
                } else {
                    interfaceC22974lM66746i = AbstractC22977m.f90652c;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(interfaceC22974lM66746i, bVar3.getAlignment(), c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                AbstractC11895b.m31978A((i15 >> 12) & 14, content, c28655q, true, false);
            }
        } else {
            c28655q.m87138X();
        }
        interfaceC11815c3 = aVar;
        interfaceC11815c4 = bVar;
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(f13, modifier3, interfaceC11815c3, interfaceC11815c4, content, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m31682c(float f13, Modifier modifier, InterfaceC11815c interfaceC11815c, InterfaceC11815c interfaceC11815c2, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m31681b(f13, modifier, interfaceC11815c, interfaceC11815c2, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
