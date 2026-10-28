package p710im1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import fl1.AbstractC14569b;
import i91.AbstractC18249c;
import ih1.C18518b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15079m3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.C21084j;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: im1.f0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "title", "description", "primaryCtaText", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18669f0 {
    /* JADX WARN: Code duplicated, block: B:101:0x029d  */
    /* JADX WARN: Code duplicated, block: B:104:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0 A[PHI: r0 r2 r3 r4
      0x00b0: PHI (r0v10 java.lang.String) = (r0v5 java.lang.String), (r0v3 java.lang.String), (r0v3 java.lang.String) binds: [B:76:0x00d7, B:64:0x00ac, B:65:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r2v16 int) = (r2v10 int), (r2v18 int), (r2v19 int) binds: [B:76:0x00d7, B:64:0x00ac, B:65:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r3v12 java.lang.String) = (r3v5 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:76:0x00d7, B:64:0x00ac, B:65:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r4v11 java.lang.String) = (r4v5 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:76:0x00d7, B:64:0x00ac, B:65:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01af  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x026d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0277  */
    /* JADX INFO: renamed from: e */
    public static final void m54194e(String str, String str2, String str3, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        String strM92103Y;
        int i15;
        String strM92103Y2;
        String strM92103Y3;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        String str4;
        String str5;
        String str6;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Object objM87133R;
        String str7;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-708848341);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                strM92103Y = str;
                int i17 = c28655q.m87153g(strM92103Y) ? 4 : 2;
                i15 = i17 | i13;
            } else {
                strM92103Y = str;
            }
            i15 = i17 | i13;
        } else {
            strM92103Y = str;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                strM92103Y2 = str2;
                int i18 = c28655q.m87153g(strM92103Y2) ? 32 : 16;
                i15 |= i18;
            } else {
                strM92103Y2 = str2;
            }
            i15 |= i18;
        } else {
            strM92103Y2 = str2;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                strM92103Y3 = str3;
                int i19 = c28655q.m87153g(strM92103Y3) ? 256 : 128;
                i15 |= i19;
            } else {
                strM92103Y3 = str3;
            }
            i15 |= i19;
        } else {
            strM92103Y3 = str3;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53587u);
                        i15 &= -15;
                    }
                    if ((i14 & 2) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53585s);
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53586t);
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18518b(26);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        str7 = strM92103Y;
                        interfaceC4339a4 = interfaceC4339a5;
                    }
                    c28655q.m87175r();
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C17909s c17909s = AbstractC17911t.f69612b;
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    Modifier modifierM52565c = AbstractC18249c.m52565c(modifierM3407d, AbstractC18249c.m52570h(C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i25).getBlack20()), new C17919x(c38072d.m121949b(c28655q, i25).getBlack70()), new C17919x(c38072d.m121949b(c28655q, i25).getBrandBlack())), 0L, 0L, 14)));
                    C21084j c21084j = new C21084j();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18518b(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f13 = 8;
                    float f14 = ((float) 4.5d) * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3360e(modifierM52565c, c21084j, null, false, null, (InterfaceC4339a) objM87133R2, 28), f14, 0.0f, f14, 12 * f13, 2);
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(3 * 4, C2299e.f9109L), C2299e.f9110M, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                    int i26 = C2886a.f11498d << 18;
                    String str8 = strM92103Y2;
                    String str9 = strM92103Y3;
                    AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getT2(), null, c28655q, i15 & 14, i26, 196602);
                    String str10 = str7;
                    AbstractC30795n.m94707h(str8, null, c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, (i15 >> 3) & 14, i26, 196602);
                    c28655q = c28655q;
                    EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                    long jM125377a = c38072d.m121949b(c28655q, i25).getAccentAction();
                    z13 = (i15 & 7168) == 2048;
                    objM87133R3 = c28655q.m87133R();
                    if (z13 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C18701v0(interfaceC4339a4, 3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27282u.m82292h(null, enumC27284v, str9, false, jM125377a, null, false, (InterfaceC4339a) objM87133R3, c28655q, (i15 & 896) | 48, 105);
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a4;
                    str6 = str9;
                    str5 = str8;
                    str4 = str10;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                }
                str7 = strM92103Y;
                interfaceC4339a4 = interfaceC4339a2;
                c28655q.m87175r();
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C17909s c17909s2 = AbstractC17911t.f69612b;
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                Modifier modifierM52565c2 = AbstractC18249c.m52565c(modifierM3407d2, AbstractC18249c.m52570h(C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i27).getBlack20()), new C17919x(c38072d2.m121949b(c28655q, i27).getBlack70()), new C17919x(c38072d2.m121949b(c28655q, i27).getBrandBlack())), 0L, 0L, 14)));
                C21084j c21084j2 = new C21084j();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18518b(27);
                    c28655q.m87172p0(objM87133R2);
                }
                float f15 = 8;
                float f16 = ((float) 4.5d) * f15;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(modifierM52565c2, c21084j2, null, false, null, (InterfaceC4339a) objM87133R2, 28), f16, 0.0f, f16, 12 * f15, 2);
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(3 * 4, C2299e.f9109L), C2299e.f9110M, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
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
                int i28 = C2886a.f11498d << 18;
                String str11 = strM92103Y2;
                String str12 = strM92103Y3;
                AbstractC30795n.m94707h(str7, null, c38072d2.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getT2(), null, c28655q, i15 & 14, i28, 196602);
                String str13 = str7;
                AbstractC30795n.m94707h(str11, null, c38072d2.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getB1(), null, c28655q, (i15 >> 3) & 14, i28, 196602);
                c28655q = c28655q;
                EnumC27284v enumC27284v2 = EnumC27284v.TextMedium;
                long jM125377a2 = c38072d2.m121949b(c28655q, i27).getAccentAction();
                if ((i15 & 7168) == 2048) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z13) {
                    objM87133R3 = new C18701v0(interfaceC4339a4, 3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C18701v0(interfaceC4339a4, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27282u.m82292h(null, enumC27284v2, str12, false, jM125377a2, null, false, (InterfaceC4339a) objM87133R3, c28655q, (i15 & 896) | 48, 105);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
                str6 = str12;
                str5 = str11;
                str4 = str13;
            } else {
                c28655q.m87138X();
                str4 = strM92103Y;
                str5 = strM92103Y2;
                str6 = strM92103Y3;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(str4, str5, str6, interfaceC4339a3, i13, i14, 15);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if ((i14 & 1) != 0) {
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53587u);
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53585s);
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53586t);
                    i15 &= -897;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18518b(26);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    str7 = strM92103Y;
                    interfaceC4339a4 = interfaceC4339a6;
                } else {
                    str7 = strM92103Y;
                    interfaceC4339a4 = interfaceC4339a2;
                }
            } else {
                if ((i14 & 1) != 0) {
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53587u);
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53585s);
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC14569b.f53586t);
                    i15 &= -897;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18518b(26);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    str7 = strM92103Y;
                    interfaceC4339a4 = interfaceC4339a7;
                } else {
                    str7 = strM92103Y;
                    interfaceC4339a4 = interfaceC4339a2;
                }
            }
            c28655q.m87175r();
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C17909s c17909s3 = AbstractC17911t.f69612b;
            C38072d c38072d3 = C38072d.f163053a;
            int i29 = C38072d.f163054b;
            Modifier modifierM52565c3 = AbstractC18249c.m52565c(modifierM3407d3, AbstractC18249c.m52570h(C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(new C17919x(c38072d3.m121949b(c28655q, i29).getBlack20()), new C17919x(c38072d3.m121949b(c28655q, i29).getBlack70()), new C17919x(c38072d3.m121949b(c28655q, i29).getBrandBlack())), 0L, 0L, 14)));
            C21084j c21084j3 = new C21084j();
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C18518b(27);
                c28655q.m87172p0(objM87133R2);
            }
            float f17 = 8;
            float f18 = ((float) 4.5d) * f17;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1092a.m3360e(modifierM52565c3, c21084j3, null, false, null, (InterfaceC4339a) objM87133R2, 28), f18, 0.0f, f18, 12 * f17, 2);
            C22949e c22949e3 = AbstractC22977m.f90650a;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(3 * 4, C2299e.f9109L), C2299e.f9110M, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
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
            int i210 = C2886a.f11498d << 18;
            String str14 = strM92103Y2;
            String str15 = strM92103Y3;
            AbstractC30795n.m94707h(str7, null, c38072d3.m121949b(c28655q, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getT2(), null, c28655q, i15 & 14, i210, 196602);
            String str16 = str7;
            AbstractC30795n.m94707h(str14, null, c38072d3.m121949b(c28655q, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getB1(), null, c28655q, (i15 >> 3) & 14, i210, 196602);
            c28655q = c28655q;
            EnumC27284v enumC27284v3 = EnumC27284v.TextMedium;
            long jM125377a3 = c38072d3.m121949b(c28655q, i29).getAccentAction();
            if ((i15 & 7168) == 2048) {
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new C18701v0(interfaceC4339a4, 3);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C18701v0(interfaceC4339a4, 3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27282u.m82292h(null, enumC27284v3, str15, false, jM125377a3, null, false, (InterfaceC4339a) objM87133R3, c28655q, (i15 & 896) | 48, 105);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
            str6 = str15;
            str5 = str14;
            str4 = str16;
        } else {
            c28655q.m87138X();
            str4 = strM92103Y;
            str5 = strM92103Y2;
            str6 = strM92103Y3;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(str4, str5, str6, interfaceC4339a3, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m54195f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m54196g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m54197h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m54198i(String str, String str2, String str3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m54194e(str, str2, str3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
