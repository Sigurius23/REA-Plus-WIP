package jy0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jy0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aY\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"", "isEmpty", "emptyTile", "Li91/a;", "pillBackground", "Li2/x;", "backgroundColor", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "secondaryText", "Lgz0/m0;", "secondaryIcon", "Ll83/a0;", "b", "(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V", "emptyPill", "d", "(ZZJLandroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22046b {
    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0190  */
    /* JADX WARN: Code duplicated, block: B:117:0x0197  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0209  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x029b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX INFO: renamed from: b */
    public static final void m63097b(boolean z4, boolean z13, AbstractC18247a abstractC18247a, long j7, final AbstractC22403o icon, TextResource textResource, EnumC16313m0 enumC16313m0, Composer composer, final int i13, final int i14) {
        int i15;
        boolean z14;
        int i16;
        AbstractC18247a abstractC18247a2;
        int i17;
        long black20;
        int i18;
        TextResource textResource2;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        boolean z15;
        C28655q c28655q;
        final boolean z16;
        final EnumC16313m0 enumC16313m1;
        final boolean z17;
        final AbstractC18247a abstractC18247a3;
        final long j13;
        final TextResource textResource3;
        C28677v1 c28677v1M87180u;
        boolean z18;
        EnumC16313m0 enumC16313m2;
        int i26;
        AbstractC18247a abstractC18247a4;
        long j14;
        boolean z19;
        boolean z24;
        TextResource textResource4;
        long jM63099d;
        C2314t c2314t;
        AbstractC18247a abstractC18247aM52577o;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f14;
        TextResource textResource5;
        C38072d c38072d;
        TextResource textResource6;
        boolean z25;
        int i27;
        int i28;
        AbstractC22676k.m65750j(icon, "icon");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(319628901);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z13;
                i15 |= c28655q2.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    abstractC18247a2 = abstractC18247a;
                    if (c28655q2.m87153g(abstractC18247a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if ((i14 & 8) == 0) {
                        black20 = j7;
                        if (c28655q2.m87151f(black20)) {
                            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i15 |= i28;
                    } else {
                        black20 = j7;
                    }
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    i15 |= i28;
                } else {
                    black20 = j7;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87153g(icon)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        textResource2 = textResource;
                        if (c28655q2.m87153g(textResource2)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (enumC16313m0 == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC16313m0.ordinal();
                        }
                        if (c28655q2.m87149e(iOrdinal)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    if ((599187 & i15) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z15)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                            if (i29 != 0) {
                                z18 = false;
                            } else {
                                z18 = z4;
                            }
                            if (i34 != 0) {
                                z14 = false;
                            }
                            if (i16 != 0) {
                                abstractC18247a2 = null;
                            }
                            if ((i14 & 8) != 0) {
                                black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                                i15 &= -7169;
                            }
                            if (i18 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            i26 = i15;
                            abstractC18247a4 = abstractC18247a2;
                            j14 = black20;
                            z19 = z18;
                            z24 = z14;
                            textResource4 = textResource2;
                        } else {
                            c28655q2.m87138X();
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            enumC16313m2 = enumC16313m0;
                            i26 = i15;
                            abstractC18247a4 = abstractC18247a2;
                            j14 = black20;
                            textResource4 = textResource2;
                            z19 = z4;
                            z24 = z14;
                        }
                        c28655q2.m87175r();
                        if (abstractC18247a4 != null) {
                            c28655q2.m87150e0(122481744);
                            jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(122534227);
                            int i35 = i26 >> 3;
                            jM63099d = m63099d(z24, z19, j14, c28655q2, (i35 & 14) | ((i26 << 3) & 112) | (i35 & 896));
                            c28655q2.m87173q(false);
                        }
                        C33252i c33252iM64090c = C22411w.f87680a.m64536b().m64090c();
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, c33252iM64090c);
                        if (abstractC18247a4 == null) {
                            abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                        } else {
                            abstractC18247aM52577o = abstractC18247a4;
                        }
                        float f15 = 1;
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f15 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r, abstractC18247aM52577o, c33252iM64090c, null, 4, null), f15, jM63099d, c33252iM64090c));
                        f13 = 4;
                        Modifier modifierM3424u = AbstractC1102d.m3424u(21 * f13, modifierM3394p);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3424u);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        f14 = 6 * f13;
                        Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c2314t);
                        textResource5 = textResource4;
                        AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                        c28655q = c28655q2;
                        c38072d = C38072d.f163053a;
                        AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        if (z19 == 0 || textResource5 == null) {
                            textResource6 = textResource5;
                            if (enumC16313m2 != null) {
                                c28655q.m87150e0(1145494192);
                                AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                                z25 = true;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                                c28655q.m87173q(false);
                            } else {
                                z25 = true;
                                c28655q.m87150e0(1145818049);
                                c28655q.m87173q(false);
                            }
                        } else {
                            c28655q.m87150e0(1145209798);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            textResource6 = textResource5;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, (i26 >> 15) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                            c28655q.m87173q(false);
                            z25 = true;
                        }
                        c28655q.m87173q(z25);
                        abstractC18247a3 = abstractC18247a4;
                        enumC16313m1 = enumC16313m2;
                        z17 = z24;
                        z16 = z19;
                        j13 = j14;
                        textResource3 = textResource6;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z16 = z4;
                        enumC16313m1 = enumC16313m0;
                        z17 = z14;
                        abstractC18247a3 = abstractC18247a2;
                        j13 = black20;
                        textResource3 = textResource2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                textResource2 = textResource;
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (enumC16313m0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC16313m0.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    } else {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    }
                    c28655q2.m87175r();
                    if (abstractC18247a4 != null) {
                        c28655q2.m87150e0(122481744);
                        jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(122534227);
                        int i36 = i26 >> 3;
                        jM63099d = m63099d(z24, z19, j14, c28655q2, (i36 & 14) | ((i26 << 3) & 112) | (i36 & 896));
                        c28655q2.m87173q(false);
                    }
                    C33252i c33252iM64090c2 = C22411w.f87680a.m64536b().m64090c();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(c2314t, c33252iM64090c2);
                    if (abstractC18247a4 == null) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                    } else {
                        abstractC18247aM52577o = abstractC18247a4;
                    }
                    float f16 = 1;
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r2, abstractC18247aM52577o, c33252iM64090c2, null, 4, null), f16, jM63099d, c33252iM64090c2));
                    f13 = 4;
                    Modifier modifierM3424u2 = AbstractC1102d.m3424u(21 * f13, modifierM3394p2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3424u2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    f14 = 6 * f13;
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14, c2314t);
                    textResource5 = textResource4;
                    AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                    c28655q = c28655q2;
                    c38072d = C38072d.f163053a;
                    AbstractC15005f3.m43107a(abstractC26165aM64500i2, null, modifierM3419p2, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    if (z19 == 0) {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    } else {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(z25);
                    abstractC18247a3 = abstractC18247a4;
                    enumC16313m1 = enumC16313m2;
                    z17 = z24;
                    z16 = z19;
                    j13 = j14;
                    textResource3 = textResource6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z16 = z4;
                    enumC16313m1 = enumC16313m0;
                    z17 = z14;
                    abstractC18247a3 = abstractC18247a2;
                    j13 = black20;
                    textResource3 = textResource2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 384;
            abstractC18247a2 = abstractC18247a;
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    black20 = j7;
                    if (c28655q2.m87151f(black20)) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i28;
                } else {
                    black20 = j7;
                }
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i28;
            } else {
                black20 = j7;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87153g(icon)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    textResource2 = textResource;
                    if (c28655q2.m87153g(textResource2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (enumC16313m0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC16313m0.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    } else {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    }
                    c28655q2.m87175r();
                    if (abstractC18247a4 != null) {
                        c28655q2.m87150e0(122481744);
                        jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(122534227);
                        int i37 = i26 >> 3;
                        jM63099d = m63099d(z24, z19, j14, c28655q2, (i37 & 14) | ((i26 << 3) & 112) | (i37 & 896));
                        c28655q2.m87173q(false);
                    }
                    C33252i c33252iM64090c3 = C22411w.f87680a.m64536b().m64090c();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(c2314t, c33252iM64090c3);
                    if (abstractC18247a4 == null) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                    } else {
                        abstractC18247aM52577o = abstractC18247a4;
                    }
                    float f17 = 1;
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(f17 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r3, abstractC18247aM52577o, c33252iM64090c3, null, 4, null), f17, jM63099d, c33252iM64090c3));
                    f13 = 4;
                    Modifier modifierM3424u3 = AbstractC1102d.m3424u(21 * f13, modifierM3394p3);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3424u3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    f14 = 6 * f13;
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(f14, c2314t);
                    textResource5 = textResource4;
                    AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                    c28655q = c28655q2;
                    c38072d = C38072d.f163053a;
                    AbstractC15005f3.m43107a(abstractC26165aM64500i3, null, modifierM3419p3, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    if (z19 == 0) {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    } else {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(z25);
                    abstractC18247a3 = abstractC18247a4;
                    enumC16313m1 = enumC16313m2;
                    z17 = z24;
                    z16 = z19;
                    j13 = j14;
                    textResource3 = textResource6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z16 = z4;
                    enumC16313m1 = enumC16313m0;
                    z17 = z14;
                    abstractC18247a3 = abstractC18247a2;
                    j13 = black20;
                    textResource3 = textResource2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            textResource2 = textResource;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                } else {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                }
                c28655q2.m87175r();
                if (abstractC18247a4 != null) {
                    c28655q2.m87150e0(122481744);
                    jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(122534227);
                    int i38 = i26 >> 3;
                    jM63099d = m63099d(z24, z19, j14, c28655q2, (i38 & 14) | ((i26 << 3) & 112) | (i38 & 896));
                    c28655q2.m87173q(false);
                }
                C33252i c33252iM64090c4 = C22411w.f87680a.m64536b().m64090c();
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(c2314t, c33252iM64090c4);
                if (abstractC18247a4 == null) {
                    abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                } else {
                    abstractC18247aM52577o = abstractC18247a4;
                }
                float f18 = 1;
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(f18 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r4, abstractC18247aM52577o, c33252iM64090c4, null, 4, null), f18, jM63099d, c33252iM64090c4));
                f13 = 4;
                Modifier modifierM3424u4 = AbstractC1102d.m3424u(21 * f13, modifierM3394p4);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3424u4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                f14 = 6 * f13;
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(f14, c2314t);
                textResource5 = textResource4;
                AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                c28655q = c28655q2;
                c38072d = C38072d.f163053a;
                AbstractC15005f3.m43107a(abstractC26165aM64500i4, null, modifierM3419p4, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                if (z19 == 0) {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                } else {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z25);
                abstractC18247a3 = abstractC18247a4;
                enumC16313m1 = enumC16313m2;
                z17 = z24;
                z16 = z19;
                j13 = j14;
                textResource3 = textResource6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z4;
                enumC16313m1 = enumC16313m0;
                z17 = z14;
                abstractC18247a3 = abstractC18247a2;
                j13 = black20;
                textResource3 = textResource2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        z14 = z13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                abstractC18247a2 = abstractC18247a;
                if (c28655q2.m87153g(abstractC18247a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    black20 = j7;
                    if (c28655q2.m87151f(black20)) {
                        i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i28;
                } else {
                    black20 = j7;
                }
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i28;
            } else {
                black20 = j7;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87153g(icon)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    textResource2 = textResource;
                    if (c28655q2.m87153g(textResource2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (enumC16313m0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC16313m0.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    } else {
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i34 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            abstractC18247a2 = null;
                        }
                        if ((i14 & 8) != 0) {
                            black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                            i15 &= -7169;
                        }
                        if (i18 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        i26 = i15;
                        abstractC18247a4 = abstractC18247a2;
                        j14 = black20;
                        z19 = z18;
                        z24 = z14;
                        textResource4 = textResource2;
                    }
                    c28655q2.m87175r();
                    if (abstractC18247a4 != null) {
                        c28655q2.m87150e0(122481744);
                        jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(122534227);
                        int i39 = i26 >> 3;
                        jM63099d = m63099d(z24, z19, j14, c28655q2, (i39 & 14) | ((i26 << 3) & 112) | (i39 & 896));
                        c28655q2.m87173q(false);
                    }
                    C33252i c33252iM64090c5 = C22411w.f87680a.m64536b().m64090c();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r5 = AbstractC37056f.m118994r(c2314t, c33252iM64090c5);
                    if (abstractC18247a4 == null) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                    } else {
                        abstractC18247aM52577o = abstractC18247a4;
                    }
                    float f19 = 1;
                    Modifier modifierM3394p5 = AbstractC1099a.m3394p(f19 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r5, abstractC18247aM52577o, c33252iM64090c5, null, 4, null), f19, jM63099d, c33252iM64090c5));
                    f13 = 4;
                    Modifier modifierM3424u5 = AbstractC1102d.m3424u(21 * f13, modifierM3394p5);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3424u5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    f14 = 6 * f13;
                    Modifier modifierM3419p5 = AbstractC1102d.m3419p(f14, c2314t);
                    textResource5 = textResource4;
                    AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                    c28655q = c28655q2;
                    c38072d = C38072d.f163053a;
                    AbstractC15005f3.m43107a(abstractC26165aM64500i5, null, modifierM3419p5, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    if (z19 == 0) {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    } else {
                        textResource6 = textResource5;
                        if (enumC16313m2 != null) {
                            c28655q.m87150e0(1145494192);
                            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                            z25 = true;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            z25 = true;
                            c28655q.m87150e0(1145818049);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(z25);
                    abstractC18247a3 = abstractC18247a4;
                    enumC16313m1 = enumC16313m2;
                    z17 = z24;
                    z16 = z19;
                    j13 = j14;
                    textResource3 = textResource6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z16 = z4;
                    enumC16313m1 = enumC16313m0;
                    z17 = z14;
                    abstractC18247a3 = abstractC18247a2;
                    j13 = black20;
                    textResource3 = textResource2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            textResource2 = textResource;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                } else {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                }
                c28655q2.m87175r();
                if (abstractC18247a4 != null) {
                    c28655q2.m87150e0(122481744);
                    jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(122534227);
                    int i310 = i26 >> 3;
                    jM63099d = m63099d(z24, z19, j14, c28655q2, (i310 & 14) | ((i26 << 3) & 112) | (i310 & 896));
                    c28655q2.m87173q(false);
                }
                C33252i c33252iM64090c6 = C22411w.f87680a.m64536b().m64090c();
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r6 = AbstractC37056f.m118994r(c2314t, c33252iM64090c6);
                if (abstractC18247a4 == null) {
                    abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                } else {
                    abstractC18247aM52577o = abstractC18247a4;
                }
                float f110 = 1;
                Modifier modifierM3394p6 = AbstractC1099a.m3394p(f110 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r6, abstractC18247aM52577o, c33252iM64090c6, null, 4, null), f110, jM63099d, c33252iM64090c6));
                f13 = 4;
                Modifier modifierM3424u6 = AbstractC1102d.m3424u(21 * f13, modifierM3394p6);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3424u6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                f14 = 6 * f13;
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(f14, c2314t);
                textResource5 = textResource4;
                AbstractC26165a abstractC26165aM64500i6 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                c28655q = c28655q2;
                c38072d = C38072d.f163053a;
                AbstractC15005f3.m43107a(abstractC26165aM64500i6, null, modifierM3419p6, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                if (z19 == 0) {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                } else {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z25);
                abstractC18247a3 = abstractC18247a4;
                enumC16313m1 = enumC16313m2;
                z17 = z24;
                z16 = z19;
                j13 = j14;
                textResource3 = textResource6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z4;
                enumC16313m1 = enumC16313m0;
                z17 = z14;
                abstractC18247a3 = abstractC18247a2;
                j13 = black20;
                textResource3 = textResource2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        abstractC18247a2 = abstractC18247a;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                black20 = j7;
                if (c28655q2.m87151f(black20)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i28;
            } else {
                black20 = j7;
            }
            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i28;
        } else {
            black20 = j7;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87153g(icon)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                textResource2 = textResource;
                if (c28655q2.m87153g(textResource2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                } else {
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i34 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        abstractC18247a2 = null;
                    }
                    if ((i14 & 8) != 0) {
                        black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                        i15 &= -7169;
                    }
                    if (i18 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    i26 = i15;
                    abstractC18247a4 = abstractC18247a2;
                    j14 = black20;
                    z19 = z18;
                    z24 = z14;
                    textResource4 = textResource2;
                }
                c28655q2.m87175r();
                if (abstractC18247a4 != null) {
                    c28655q2.m87150e0(122481744);
                    jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(122534227);
                    int i311 = i26 >> 3;
                    jM63099d = m63099d(z24, z19, j14, c28655q2, (i311 & 14) | ((i26 << 3) & 112) | (i311 & 896));
                    c28655q2.m87173q(false);
                }
                C33252i c33252iM64090c7 = C22411w.f87680a.m64536b().m64090c();
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r7 = AbstractC37056f.m118994r(c2314t, c33252iM64090c7);
                if (abstractC18247a4 == null) {
                    abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
                } else {
                    abstractC18247aM52577o = abstractC18247a4;
                }
                float f111 = 1;
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(f111 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r7, abstractC18247aM52577o, c33252iM64090c7, null, 4, null), f111, jM63099d, c33252iM64090c7));
                f13 = 4;
                Modifier modifierM3424u7 = AbstractC1102d.m3424u(21 * f13, modifierM3394p7);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3424u7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                f14 = 6 * f13;
                Modifier modifierM3419p7 = AbstractC1102d.m3419p(f14, c2314t);
                textResource5 = textResource4;
                AbstractC26165a abstractC26165aM64500i7 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
                c28655q = c28655q2;
                c38072d = C38072d.f163053a;
                AbstractC15005f3.m43107a(abstractC26165aM64500i7, null, modifierM3419p7, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                if (z19 == 0) {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                } else {
                    textResource6 = textResource5;
                    if (enumC16313m2 != null) {
                        c28655q.m87150e0(1145494192);
                        AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                        z25 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1145818049);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z25);
                abstractC18247a3 = abstractC18247a4;
                enumC16313m1 = enumC16313m2;
                z17 = z24;
                z16 = z19;
                j13 = j14;
                textResource3 = textResource6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z4;
                enumC16313m1 = enumC16313m0;
                z17 = z14;
                abstractC18247a3 = abstractC18247a2;
                j13 = black20;
                textResource3 = textResource2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        textResource2 = textResource;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (enumC16313m0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16313m0.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        if ((599187 & i15) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i34 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    abstractC18247a2 = null;
                }
                if ((i14 & 8) != 0) {
                    black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                    i15 &= -7169;
                }
                if (i18 != 0) {
                    textResource2 = null;
                }
                if (i24 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                i26 = i15;
                abstractC18247a4 = abstractC18247a2;
                j14 = black20;
                z19 = z18;
                z24 = z14;
                textResource4 = textResource2;
            } else {
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i34 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    abstractC18247a2 = null;
                }
                if ((i14 & 8) != 0) {
                    black20 = C38072d.f163053a.m121949b(c28655q2, 6).getBlack20();
                    i15 &= -7169;
                }
                if (i18 != 0) {
                    textResource2 = null;
                }
                if (i24 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                i26 = i15;
                abstractC18247a4 = abstractC18247a2;
                j14 = black20;
                z19 = z18;
                z24 = z14;
                textResource4 = textResource2;
            }
            c28655q2.m87175r();
            if (abstractC18247a4 != null) {
                c28655q2.m87150e0(122481744);
                jM63099d = C38072d.f163053a.m121949b(c28655q2, 6).getTransparent();
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(122534227);
                int i312 = i26 >> 3;
                jM63099d = m63099d(z24, z19, j14, c28655q2, (i312 & 14) | ((i26 << 3) & 112) | (i312 & 896));
                c28655q2.m87173q(false);
            }
            C33252i c33252iM64090c8 = C22411w.f87680a.m64536b().m64090c();
            c2314t = C2314t.f9131w;
            Modifier modifierM118994r8 = AbstractC37056f.m118994r(c2314t, c33252iM64090c8);
            if (abstractC18247a4 == null) {
                abstractC18247aM52577o = AbstractC18249c.m52577o(j14);
            } else {
                abstractC18247aM52577o = abstractC18247a4;
            }
            float f112 = 1;
            Modifier modifierM3394p8 = AbstractC1099a.m3394p(f112 * 8, AbstractC15751g.m44455h(AbstractC18249c.m52567e(modifierM118994r8, abstractC18247aM52577o, c33252iM64090c8, null, 4, null), f112, jM63099d, c33252iM64090c8));
            f13 = 4;
            Modifier modifierM3424u8 = AbstractC1102d.m3424u(21 * f13, modifierM3394p8);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3424u8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            f14 = 6 * f13;
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(f14, c2314t);
            textResource5 = textResource4;
            AbstractC26165a abstractC26165aM64500i8 = AbstractC22404p.m64500i(icon, null, null, c28655q2, (i26 >> 12) & 14, 3);
            c28655q = c28655q2;
            c38072d = C38072d.f163053a;
            AbstractC15005f3.m43107a(abstractC26165aM64500i8, null, modifierM3419p8, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            if (z19 == 0) {
                textResource6 = textResource5;
                if (enumC16313m2 != null) {
                    c28655q.m87150e0(1145494192);
                    AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                    z25 = true;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    z25 = true;
                    c28655q.m87150e0(1145818049);
                    c28655q.m87173q(false);
                }
            } else {
                textResource6 = textResource5;
                if (enumC16313m2 != null) {
                    c28655q.m87150e0(1145494192);
                    AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
                    z25 = true;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m2.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    z25 = true;
                    c28655q.m87150e0(1145818049);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z25);
            abstractC18247a3 = abstractC18247a4;
            enumC16313m1 = enumC16313m2;
            z17 = z24;
            z16 = z19;
            j13 = j14;
            textResource3 = textResource6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z16 = z4;
            enumC16313m1 = enumC16313m0;
            z17 = z14;
            abstractC18247a3 = abstractC18247a2;
            j13 = black20;
            textResource3 = textResource2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jy0.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22046b.m63098c(z16, z17, abstractC18247a3, j13, icon, textResource3, enumC16313m1, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m63098c(boolean z4, boolean z13, AbstractC18247a abstractC18247a, long j7, AbstractC22403o abstractC22403o, TextResource textResource, EnumC16313m0 enumC16313m0, int i13, int i14, Composer composer, int i15) {
        m63097b(z4, z13, abstractC18247a, j7, abstractC22403o, textResource, enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final long m63099d(boolean z4, boolean z13, long j7, Composer composer, int i13) {
        long jM51541c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(776899825);
        if (!z13 || z4) {
            c28655q.m87150e0(-955882188);
            c28655q.m87173q(false);
            jM51541c = C17919x.m51541c(z4 ? 0.0f : 1.0f, j7);
        } else {
            c28655q.m87150e0(-955942018);
            jM51541c = C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack();
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return jM51541c;
    }
}
