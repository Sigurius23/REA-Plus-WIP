package ep1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2161b;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ej1.C13228a;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ep1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "icon", "skipTitle", "Lkotlin/Function0;", "Ll83/a0;", "onSkipClick", "onLeftButtonClick", "e", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13424s {
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:105:0x0187  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:125:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:131:0x030d  */
    /* JADX WARN: Code duplicated, block: B:134:0x031e  */
    /* JADX WARN: Code duplicated, block: B:136:0x032a  */
    /* JADX WARN: Code duplicated, block: B:137:0x032c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0333  */
    /* JADX WARN: Code duplicated, block: B:144:0x033b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0376  */
    /* JADX WARN: Code duplicated, block: B:148:0x0391  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX INFO: renamed from: e */
    public static final void m38062e(TextResource title, TextResource subtitle, int i13, TextResource textResource, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i14, int i15) {
        int i16;
        int iM53357C;
        int i17;
        InterfaceC4339a interfaceC4339a3;
        int i18;
        boolean z4;
        TextResource textResource2;
        InterfaceC4339a interfaceC4339a4;
        TextResource textResource3;
        int i19;
        InterfaceC4339a interfaceC4339a5;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        int i25;
        InterfaceC4339a interfaceC4339a8;
        Object objM87133R;
        Object objM87133R2;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResource4;
        int i26;
        float f13;
        int i27;
        InterfaceC4339a interfaceC4339a9;
        boolean z13;
        int iHashCode2;
        int i28;
        C38072d c38072d;
        int i29;
        int i34;
        TextResource textResource5;
        boolean z14;
        Object objM87133R3;
        TextResource textResource6 = textResource;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(716706171);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q.m87153g(subtitle) : c28655q.m87157i(subtitle) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                iM53357C = i13;
                int i35 = c28655q.m87149e(iM53357C) ? 256 : 128;
                i16 |= i35;
            } else {
                iM53357C = i13;
            }
            i16 |= i35;
        } else {
            iM53357C = i13;
        }
        int i36 = i15 & 8;
        if (i36 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? c28655q.m87153g(textResource6) : c28655q.m87157i(textResource6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i37 = i15 & 16;
        if (i37 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    interfaceC4339a3 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                if ((74899 & i16) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0 || c28655q.m87118C()) {
                        if ((i15 & 4) != 0) {
                            iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                            i16 &= -897;
                        }
                        if (i36 != 0) {
                            textResource6 = null;
                        }
                        if (i37 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13228a(16);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C13228a(17);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        i25 = i16;
                        interfaceC4339a8 = interfaceC4339a6;
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                        }
                        iM53357C = iM53357C;
                        interfaceC4339a7 = interfaceC4339a3;
                        i25 = i16;
                        interfaceC4339a8 = interfaceC4339a;
                    }
                    c28655q.m87175r();
                    c2314t = C2314t.f9131w;
                    float f14 = 4;
                    float f15 = ((float) 1.5d) * f14;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, 6 * 8, f15, 0.0f, 8);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    textResource4 = textResource6;
                    if (c28655q.f115903S) {
                        i26 = i25;
                    } else {
                        i26 = i25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        f13 = 12 * f14;
                        int i38 = iM53357C;
                        i27 = i26 >> 3;
                        interfaceC4339a9 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                        InterfaceC4339a interfaceC4339a10 = interfaceC4339a7;
                        if (1.0f > 0.0d) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        i28 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                        c38072d = C38072d.f163053a;
                        i29 = C38072d.f163054b;
                        long brandWhite = c38072d.m121949b(c28655q, i29).getBrandWhite();
                        C2886a c2886aM8437r = c38072d.m121952e(c28655q, i29).getH4();
                        i34 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i34, 196602);
                        c28655q = c28655q;
                        if (AbstractC8693b.m21270d(subtitle)) {
                            c28655q.m87150e0(1453879494);
                            textResource2 = subtitle;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            textResource2 = subtitle;
                            c28655q.m87150e0(1454089953);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (textResource4 != null) {
                            c28655q.m87150e0(-1605019865);
                            if ((i26 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (!z14 || objM87133R3 == c28676v0) {
                                interfaceC4339a4 = interfaceC4339a9;
                                objM87133R3 = new C2161b(interfaceC4339a4, 20);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                interfaceC4339a4 = interfaceC4339a9;
                            }
                            C28655q c28655q2 = c28655q;
                            textResource5 = textResource4;
                            AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q2, (i28 << 6) | (i27 & 896), 0, 4091);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a9;
                            textResource5 = textResource4;
                            AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        textResource3 = textResource5;
                        i19 = i38;
                        interfaceC4339a5 = interfaceC4339a10;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    f13 = 12 * f14;
                    int i39 = iM53357C;
                    i27 = i26 >> 3;
                    interfaceC4339a9 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                    InterfaceC4339a interfaceC4339a11 = interfaceC4339a7;
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    i28 = TextResource.$stable;
                    String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    long brandWhite2 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                    C2886a c2886aM8437r2 = c38072d.m121952e(c28655q, i29).getH4();
                    i34 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    if (AbstractC8693b.m21270d(subtitle)) {
                        c28655q.m87150e0(1453879494);
                        textResource2 = subtitle;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        textResource2 = subtitle;
                        c28655q.m87150e0(1454089953);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (textResource4 != null) {
                        c28655q.m87150e0(-1605019865);
                        if ((i26 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z14) {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q3 = c28655q;
                        textResource5 = textResource4;
                        AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q3, (i28 << 6) | (i27 & 896), 0, 4091);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        textResource5 = textResource4;
                        AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    textResource3 = textResource5;
                    i19 = i39;
                    interfaceC4339a5 = interfaceC4339a11;
                } else {
                    textResource2 = subtitle;
                    c28655q.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    textResource3 = textResource6;
                    i19 = iM53357C;
                    interfaceC4339a5 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13423r(title, textResource2, i19, textResource3, interfaceC4339a4, interfaceC4339a5, i14, i15, 0);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a3 = interfaceC4339a2;
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i15 & 4) != 0) {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                        i16 &= -897;
                    }
                    if (i36 != 0) {
                        textResource6 = null;
                    }
                    if (i37 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13228a(16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C13228a(17);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    i25 = i16;
                    interfaceC4339a8 = interfaceC4339a6;
                } else {
                    if ((i15 & 4) != 0) {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                        i16 &= -897;
                    }
                    if (i36 != 0) {
                        textResource6 = null;
                    }
                    if (i37 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13228a(16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C13228a(17);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    i25 = i16;
                    interfaceC4339a8 = interfaceC4339a6;
                }
                c28655q.m87175r();
                c2314t = C2314t.f9131w;
                float f16 = 4;
                float f17 = ((float) 1.5d) * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, 6 * 8, f17, 0.0f, 8);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                textResource4 = textResource6;
                if (c28655q.f115903S) {
                    i26 = i25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    f13 = 12 * f16;
                    int i310 = iM53357C;
                    i27 = i26 >> 3;
                    interfaceC4339a9 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a7;
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    i28 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    long brandWhite3 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                    C2886a c2886aM8437r3 = c38072d.m121952e(c28655q, i29).getH4();
                    i34 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r3, null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    if (AbstractC8693b.m21270d(subtitle)) {
                        c28655q.m87150e0(1453879494);
                        textResource2 = subtitle;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        textResource2 = subtitle;
                        c28655q.m87150e0(1454089953);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (textResource4 != null) {
                        c28655q.m87150e0(-1605019865);
                        if ((i26 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z14) {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q4 = c28655q;
                        textResource5 = textResource4;
                        AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q4, (i28 << 6) | (i27 & 896), 0, 4091);
                        c28655q = c28655q4;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        textResource5 = textResource4;
                        AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    textResource3 = textResource5;
                    i19 = i310;
                    interfaceC4339a5 = interfaceC4339a12;
                } else {
                    i26 = i25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                f13 = 12 * f16;
                int i311 = iM53357C;
                i27 = i26 >> 3;
                interfaceC4339a9 = interfaceC4339a8;
                AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                i28 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                long brandWhite4 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                C2886a c2886aM8437r4 = c38072d.m121952e(c28655q, i29).getH4();
                i34 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r4, null, c28655q, 0, i34, 196602);
                c28655q = c28655q;
                if (AbstractC8693b.m21270d(subtitle)) {
                    c28655q.m87150e0(1453879494);
                    textResource2 = subtitle;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    textResource2 = subtitle;
                    c28655q.m87150e0(1454089953);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (textResource4 != null) {
                    c28655q.m87150e0(-1605019865);
                    if ((i26 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q5 = c28655q;
                    textResource5 = textResource4;
                    AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q5, (i28 << 6) | (i27 & 896), 0, 4091);
                    c28655q = c28655q5;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a9;
                    textResource5 = textResource4;
                    AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                textResource3 = textResource5;
                i19 = i311;
                interfaceC4339a5 = interfaceC4339a13;
            } else {
                textResource2 = subtitle;
                c28655q.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                textResource3 = textResource6;
                i19 = iM53357C;
                interfaceC4339a5 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13423r(title, textResource2, i19, textResource3, interfaceC4339a4, interfaceC4339a5, i14, i15, 0);
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                interfaceC4339a3 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i15 & 4) != 0) {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                        i16 &= -897;
                    }
                    if (i36 != 0) {
                        textResource6 = null;
                    }
                    if (i37 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13228a(16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C13228a(17);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    i25 = i16;
                    interfaceC4339a8 = interfaceC4339a6;
                } else {
                    if ((i15 & 4) != 0) {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                        i16 &= -897;
                    }
                    if (i36 != 0) {
                        textResource6 = null;
                    }
                    if (i37 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13228a(16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C13228a(17);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    i25 = i16;
                    interfaceC4339a8 = interfaceC4339a6;
                }
                c28655q.m87175r();
                c2314t = C2314t.f9131w;
                float f18 = 4;
                float f19 = ((float) 1.5d) * f18;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f19, 6 * 8, f19, 0.0f, 8);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                textResource4 = textResource6;
                if (c28655q.f115903S) {
                    i26 = i25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    f13 = 12 * f18;
                    int i312 = iM53357C;
                    i27 = i26 >> 3;
                    interfaceC4339a9 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    i28 = TextResource.$stable;
                    String strM21274h5 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    long brandWhite5 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                    C2886a c2886aM8437r5 = c38072d.m121952e(c28655q, i29).getH4();
                    i34 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h5, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r5, null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    if (AbstractC8693b.m21270d(subtitle)) {
                        c28655q.m87150e0(1453879494);
                        textResource2 = subtitle;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        textResource2 = subtitle;
                        c28655q.m87150e0(1454089953);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (textResource4 != null) {
                        c28655q.m87150e0(-1605019865);
                        if ((i26 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z14) {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC4339a4 = interfaceC4339a9;
                            objM87133R3 = new C2161b(interfaceC4339a4, 20);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q6 = c28655q;
                        textResource5 = textResource4;
                        AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q6, (i28 << 6) | (i27 & 896), 0, 4091);
                        c28655q = c28655q6;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        textResource5 = textResource4;
                        AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    textResource3 = textResource5;
                    i19 = i312;
                    interfaceC4339a5 = interfaceC4339a14;
                } else {
                    i26 = i25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                f13 = 12 * f18;
                int i313 = iM53357C;
                i27 = i26 >> 3;
                interfaceC4339a9 = interfaceC4339a8;
                AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a7;
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                i28 = TextResource.$stable;
                String strM21274h6 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                long brandWhite6 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                C2886a c2886aM8437r6 = c38072d.m121952e(c28655q, i29).getH4();
                i34 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h6, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r6, null, c28655q, 0, i34, 196602);
                c28655q = c28655q;
                if (AbstractC8693b.m21270d(subtitle)) {
                    c28655q.m87150e0(1453879494);
                    textResource2 = subtitle;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    textResource2 = subtitle;
                    c28655q.m87150e0(1454089953);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (textResource4 != null) {
                    c28655q.m87150e0(-1605019865);
                    if ((i26 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q7 = c28655q;
                    textResource5 = textResource4;
                    AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q7, (i28 << 6) | (i27 & 896), 0, 4091);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a9;
                    textResource5 = textResource4;
                    AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                textResource3 = textResource5;
                i19 = i313;
                interfaceC4339a5 = interfaceC4339a15;
            } else {
                textResource2 = subtitle;
                c28655q.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                textResource3 = textResource6;
                i19 = iM53357C;
                interfaceC4339a5 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13423r(title, textResource2, i19, textResource3, interfaceC4339a4, interfaceC4339a5, i14, i15, 0);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a3 = interfaceC4339a2;
        if ((74899 & i16) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            i24 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                if ((i15 & 4) != 0) {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                    i16 &= -897;
                }
                if (i36 != 0) {
                    textResource6 = null;
                }
                if (i37 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13228a(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C13228a(17);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                i25 = i16;
                interfaceC4339a8 = interfaceC4339a6;
            } else {
                if ((i15 & 4) != 0) {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                    i16 &= -897;
                }
                if (i36 != 0) {
                    textResource6 = null;
                }
                if (i37 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13228a(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C13228a(17);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                i25 = i16;
                interfaceC4339a8 = interfaceC4339a6;
            }
            c28655q.m87175r();
            c2314t = C2314t.f9131w;
            float f110 = 4;
            float f111 = ((float) 1.5d) * f110;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f111, 6 * 8, f111, 0.0f, 8);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            textResource4 = textResource6;
            if (c28655q.f115903S) {
                i26 = i25;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                f13 = 12 * f110;
                int i314 = iM53357C;
                i27 = i26 >> 3;
                interfaceC4339a9 = interfaceC4339a8;
                AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
                InterfaceC4339a interfaceC4339a16 = interfaceC4339a7;
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                i28 = TextResource.$stable;
                String strM21274h7 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                long brandWhite7 = c38072d.m121949b(c28655q, i29).getBrandWhite();
                C2886a c2886aM8437r7 = c38072d.m121952e(c28655q, i29).getH4();
                i34 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h7, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r7, null, c28655q, 0, i34, 196602);
                c28655q = c28655q;
                if (AbstractC8693b.m21270d(subtitle)) {
                    c28655q.m87150e0(1453879494);
                    textResource2 = subtitle;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    textResource2 = subtitle;
                    c28655q.m87150e0(1454089953);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (textResource4 != null) {
                    c28655q.m87150e0(-1605019865);
                    if ((i26 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC4339a4 = interfaceC4339a9;
                        objM87133R3 = new C2161b(interfaceC4339a4, 20);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q8 = c28655q;
                    textResource5 = textResource4;
                    AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q8, (i28 << 6) | (i27 & 896), 0, 4091);
                    c28655q = c28655q8;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a9;
                    textResource5 = textResource4;
                    AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                textResource3 = textResource5;
                i19 = i314;
                interfaceC4339a5 = interfaceC4339a16;
            } else {
                i26 = i25;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            f13 = 12 * f110;
            int i315 = iM53357C;
            i27 = i26 >> 3;
            interfaceC4339a9 = interfaceC4339a8;
            AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, iM53357C, null, null, null, false, false, false, 0.0f, false, 1020, null), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), AbstractC1102d.m3419p(f13, c2314t), null, interfaceC4339a7, c28655q, (i27 & 57344) | C27270o.f109105k | 384, 8);
            InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
            if (1.0f > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            i28 = TextResource.$stable;
            String strM21274h8 = AbstractC8693b.m21274h(title, c28655q, (i26 & 14) | i28);
            c38072d = C38072d.f163053a;
            i29 = C38072d.f163054b;
            long brandWhite8 = c38072d.m121949b(c28655q, i29).getBrandWhite();
            C2886a c2886aM8437r8 = c38072d.m121952e(c28655q, i29).getH4();
            i34 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h8, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r8, null, c28655q, 0, i34, 196602);
            c28655q = c28655q;
            if (AbstractC8693b.m21270d(subtitle)) {
                c28655q.m87150e0(1453879494);
                textResource2 = subtitle;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i27 & 14) | i28), null, c38072d.m121949b(c28655q, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getH5(), null, c28655q, 0, i34, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                textResource2 = subtitle;
                c28655q.m87150e0(1454089953);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (textResource4 != null) {
                c28655q.m87150e0(-1605019865);
                if ((i26 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    interfaceC4339a4 = interfaceC4339a9;
                    objM87133R3 = new C2161b(interfaceC4339a4, 20);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC4339a4 = interfaceC4339a9;
                    objM87133R3 = new C2161b(interfaceC4339a4, 20);
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q9 = c28655q;
                textResource5 = textResource4;
                AbstractC27265l0.m82217i(null, null, textResource5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q9, (i28 << 6) | (i27 & 896), 0, 4091);
                c28655q = c28655q9;
                c28655q.m87173q(false);
            } else {
                interfaceC4339a4 = interfaceC4339a9;
                textResource5 = textResource4;
                AbstractC31061c.m95623C(c28655q, -1604884984, c2314t, f13, c28655q);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            textResource3 = textResource5;
            i19 = i315;
            interfaceC4339a5 = interfaceC4339a17;
        } else {
            textResource2 = subtitle;
            c28655q.m87138X();
            interfaceC4339a4 = interfaceC4339a;
            textResource3 = textResource6;
            i19 = iM53357C;
            interfaceC4339a5 = interfaceC4339a3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13423r(title, textResource2, i19, textResource3, interfaceC4339a4, interfaceC4339a5, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m38063f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m38064g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m38065h(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m38066i(TextResource textResource, TextResource textResource2, int i13, TextResource textResource3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i14, int i15, Composer composer, int i16) {
        m38062e(textResource, textResource2, i13, textResource3, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
