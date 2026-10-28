package d21;

import a61.C0468a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import com.whoop.domain.model.UnitSystem;
import e93.AbstractC12889b;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u31.AbstractC34504e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d21.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ld21/g;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onHeightChanged", "Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "itemHeight", "Lb91/a;", "textStyle", "", "ignoreFirstValue", "e", "(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11508f {
    /* JADX WARN: Code duplicated, block: B:100:0x01be  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x0214  */
    /* JADX WARN: Code duplicated, block: B:112:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:120:0x0249  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:124:0x025a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0266  */
    /* JADX WARN: Code duplicated, block: B:130:0x026b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0330  */
    /* JADX WARN: Code duplicated, block: B:153:0x0357 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0359  */
    /* JADX WARN: Code duplicated, block: B:157:0x038c  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:164:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:166:0x03db  */
    /* JADX WARN: Code duplicated, block: B:169:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:177:0x0432  */
    /* JADX WARN: Code duplicated, block: B:180:0x043e  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2 A[PHI: r0 r4 r8 r10
      0x00e2: PHI (r0v45 b91.a) = (r0v2 b91.a), (r0v0 b91.a), (r0v0 b91.a) binds: [B:84:0x0103, B:74:0x00de, B:75:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r4v36 int) = (r4v14 int), (r4v11 int), (r4v37 int) binds: [B:84:0x0103, B:74:0x00de, B:75:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r8v18 androidx.compose.ui.Modifier) = (r8v5 androidx.compose.ui.Modifier), (r8v2 androidx.compose.ui.Modifier), (r8v2 androidx.compose.ui.Modifier) binds: [B:84:0x0103, B:74:0x00de, B:75:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r10v34 float) = (r10v4 float), (r10v2 float), (r10v2 float) binds: [B:84:0x0103, B:74:0x00de, B:75:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX INFO: renamed from: e */
    public static final void m30953e(C11509g state, Function1 onHeightChanged, Modifier modifier, float f13, C2886a c2886a, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        float f14;
        int i17;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        C2886a c2886a2;
        float f15;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i24;
        C2314t c2314t;
        C2886a c2886a3;
        Modifier modifier3;
        float f16;
        boolean z16;
        UnitSystem unitSystem;
        UnitSystem unitSystem2;
        C23016z c23016z;
        C28676v0 c28676v0;
        int i25;
        boolean zM87153g;
        Object objM87133R;
        int i26;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        Object objM87133R2;
        C11503a c11503a;
        int iIntValue;
        boolean zM87153g2;
        Object objM87133R3;
        boolean zM87153g3;
        Object objM87133R4;
        int i27;
        List list;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        List list2;
        int iHashCode3;
        int size;
        int i28;
        boolean z18;
        boolean zM87149e;
        Object objM87133R5;
        C28676v0 c28676v1;
        int iHashCode4;
        boolean z19;
        boolean zM87149e2;
        Object objM87133R6;
        int i29;
        boolean zM87157i;
        C2886a n13 = c2886a;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onHeightChanged, "onHeightChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-177223571);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onHeightChanged) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) != 0) {
                        i29 = DfuBaseService.ERROR_REMOTE_MASK;
                    } else {
                        if ((32768 & i13) == 0) {
                            zM87157i = c28655q.m87153g(n13);
                        } else {
                            zM87157i = c28655q.m87157i(n13);
                        }
                        if (zM87157i) {
                            i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i29 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                    }
                    i15 |= i29;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        z13 = z4;
                        if (c28655q.m87155h(z13)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        c28655q.m87140Z();
                        i24 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i24 != 0 || c28655q.m87118C()) {
                            if (i34 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                f14 = 60;
                            }
                            if ((i14 & 16) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                                i15 &= -57345;
                            }
                            if (i18 != 0) {
                                c2886a3 = n13;
                                modifier3 = modifier2;
                                f16 = f14;
                                z16 = true;
                            }
                            c28655q.m87175r();
                            unitSystem = state.getUnitSystem();
                            unitSystem2 = UnitSystem.IMPERIAL;
                            c23016z = C23016z.f90757a;
                            c28676v0 = C28635l.f115821a;
                            if (unitSystem == unitSystem2) {
                                c28655q.m87150e0(-1152230300);
                                c11503a = C11503a.f37005a;
                                C23465k c23465kM30922k = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                                iIntValue = ((Number) c23465kM30922k.f92937w).intValue();
                                int iIntValue2 = ((Number) c23465kM30922k.f92938x).intValue();
                                zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                                objM87133R3 = c28655q.m87133R();
                                if (zM87153g2 || objM87133R3 == c28676v0) {
                                    objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                                    c28655q.m87172p0(objM87133R3);
                                }
                                List list3 = (List) objM87133R3;
                                zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                                objM87133R4 = c28655q.m87133R();
                                if (!zM87153g3 || objM87133R4 == c28676v0) {
                                    i27 = 57344;
                                    objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    i27 = 57344;
                                }
                                list = (List) objM87133R4;
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                                InterfaceC0221l.f734a.getClass();
                                c0213j2 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                C0209i c0209i3 = C0217k.f729g;
                                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
                                C0209i c0209i4 = C0217k.f728f;
                                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                                c0209i2 = C0217k.f732j;
                                int i35 = i15;
                                if (c28655q.f115903S) {
                                    list2 = list;
                                } else {
                                    list2 = list;
                                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    }
                                    C0209i c0209i5 = C0217k.f726d;
                                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                                    C22957g c22957g = AbstractC22977m.f90652c;
                                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                    Modifier modifier4 = modifier3;
                                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j2);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                                    int i36 = iIntValue - state.getFeetRange().f71133w;
                                    size = list3.size() - 1;
                                    if (size < 0) {
                                        size = 0;
                                    }
                                    int iM36284n = AbstractC12889b.m36284n(i36, 0, size);
                                    C2305k c2305k2 = C2299e.f9112O;
                                    i28 = i35 & 112;
                                    if (i28 == 32) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    zM87149e = z18 | c28655q.m87149e(iIntValue2);
                                    objM87133R5 = c28655q.m87133R();
                                    if (zM87149e) {
                                        c28676v1 = c28676v0;
                                    } else {
                                        c28676v1 = c28676v0;
                                        if (objM87133R5 == c28676v1) {
                                        }
                                        int i37 = i35 << 3;
                                        int i38 = ((i35 >> 3) & 7168) | 12582918 | (i37 & i27) | (i37 & 3670016);
                                        AbstractC34504e.m109045j(c23016z, list3, iM36284n, c2886a3, f16, 0, z16, c2305k2, false, false, null, (Function1) objM87133R5, c28655q, i38, 0, 912);
                                        c28655q.m87173q(true);
                                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                                        c28655q.m87158i0();
                                        if (c28655q.f115903S) {
                                            c28655q.m87163l(c0213j2);
                                        } else {
                                            c28655q.m87178s0();
                                        }
                                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                        }
                                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                                        if (i28 == 32) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                        objM87133R6 = c28655q.m87133R();
                                        if (zM87149e2 || objM87133R6 == c28676v1) {
                                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                            c28655q.m87172p0(objM87133R6);
                                        }
                                        boolean z24 = z16;
                                        C2886a c2886a4 = c2886a3;
                                        float f17 = f16;
                                        AbstractC34504e.m109045j(c23016z, list2, iIntValue2, c2886a4, f17, 0, z24, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i38, 0, 912);
                                        c2886a3 = c2886a4;
                                        z16 = z24;
                                        f16 = f17;
                                        AbstractC25012a.m73392y(c28655q, true, true, false);
                                        modifier2 = modifier4;
                                    }
                                    objM87133R5 = new C11506d(onHeightChanged, iIntValue2, 0);
                                    c28655q.m87172p0(objM87133R5);
                                    int i39 = i35 << 3;
                                    int i310 = ((i35 >> 3) & 7168) | 12582918 | (i39 & i27) | (i39 & 3670016);
                                    AbstractC34504e.m109045j(c23016z, list3, iM36284n, c2886a3, f16, 0, z16, c2305k2, false, false, null, (Function1) objM87133R5, c28655q, i310, 0, 912);
                                    c28655q.m87173q(true);
                                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j2);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
                                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                                    if (i28 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                    objM87133R6 = c28655q.m87133R();
                                    if (zM87149e2) {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    } else {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    boolean z25 = z16;
                                    C2886a c2886a5 = c2886a3;
                                    float f18 = f16;
                                    AbstractC34504e.m109045j(c23016z, list2, iIntValue2, c2886a5, f18, 0, z25, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i310, 0, 912);
                                    c2886a3 = c2886a5;
                                    z16 = z25;
                                    f16 = f18;
                                    AbstractC25012a.m73392y(c28655q, true, true, false);
                                    modifier2 = modifier4;
                                }
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                                C0209i c0209i6 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                                C22957g c22957g2 = AbstractC22977m.f90652c;
                                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                                Modifier modifier5 = modifier3;
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
                                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
                                int i311 = iIntValue - state.getFeetRange().f71133w;
                                size = list3.size() - 1;
                                if (size < 0) {
                                    size = 0;
                                }
                                int iM36284n2 = AbstractC12889b.m36284n(i311, 0, size);
                                C2305k c2305k3 = C2299e.f9112O;
                                i28 = i35 & 112;
                                if (i28 == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zM87149e = z18 | c28655q.m87149e(iIntValue2);
                                objM87133R5 = c28655q.m87133R();
                                if (zM87149e) {
                                    c28676v1 = c28676v0;
                                    if (objM87133R5 == c28676v1) {
                                    }
                                    int i312 = i35 << 3;
                                    int i313 = ((i35 >> 3) & 7168) | 12582918 | (i312 & i27) | (i312 & 3670016);
                                    AbstractC34504e.m109045j(c23016z, list3, iM36284n2, c2886a3, f16, 0, z16, c2305k3, false, false, null, (Function1) objM87133R5, c28655q, i313, 0, 912);
                                    c28655q.m87173q(true);
                                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
                                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j2);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a5);
                                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N6);
                                    if (i28 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                    objM87133R6 = c28655q.m87133R();
                                    if (zM87149e2) {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    } else {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    boolean z26 = z16;
                                    C2886a c2886a6 = c2886a3;
                                    float f19 = f16;
                                    AbstractC34504e.m109045j(c23016z, list2, iIntValue2, c2886a6, f19, 0, z26, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i313, 0, 912);
                                    c2886a3 = c2886a6;
                                    z16 = z26;
                                    f16 = f19;
                                    AbstractC25012a.m73392y(c28655q, true, true, false);
                                    modifier2 = modifier5;
                                } else {
                                    c28676v1 = c28676v0;
                                }
                                objM87133R5 = new C11506d(onHeightChanged, iIntValue2, 0);
                                c28655q.m87172p0(objM87133R5);
                                int i314 = i35 << 3;
                                int i315 = ((i35 >> 3) & 7168) | 12582918 | (i314 & i27) | (i314 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list3, iM36284n2, c2886a3, f16, 0, z16, c2305k3, false, false, null, (Function1) objM87133R5, c28655q, i315, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a6);
                                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m7);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N7);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z27 = z16;
                                C2886a c2886a7 = c2886a3;
                                float f110 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue2, c2886a7, f110, 0, z27, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i315, 0, 912);
                                c2886a3 = c2886a7;
                                z16 = z27;
                                f16 = f110;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier5;
                            } else {
                                Modifier modifier6 = modifier3;
                                i25 = i15;
                                c28655q.m87150e0(-1150181417);
                                zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                                objM87133R = c28655q.m87133R();
                                if (zM87153g || objM87133R == c28676v0) {
                                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                    c28655q.m87172p0(objM87133R);
                                }
                                List list4 = (List) objM87133R;
                                i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                                int heightInCentimeters = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                                if (i26 < 0) {
                                    i26 = 0;
                                }
                                int iM36284n3 = AbstractC12889b.m36284n(heightInCentimeters, 0, i26);
                                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                                modifier2 = modifier6;
                                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifier2);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                                if ((i25 & 112) == 32) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z17 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C0468a(onHeightChanged, 25);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i44 = i25 << 3;
                                AbstractC34504e.m109045j(c23016z, list4, iM36284n3, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i44 & 57344) | (i44 & 3670016), 0, 976);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c2886a2 = c2886a3;
                            f15 = f16;
                            z15 = z16;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 16) != 0) {
                                i15 &= -57345;
                            }
                        }
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                        c28655q.m87175r();
                        unitSystem = state.getUnitSystem();
                        unitSystem2 = UnitSystem.IMPERIAL;
                        c23016z = C23016z.f90757a;
                        c28676v0 = C28635l.f115821a;
                        if (unitSystem == unitSystem2) {
                            c28655q.m87150e0(-1152230300);
                            c11503a = C11503a.f37005a;
                            C23465k c23465kM30922k2 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                            iIntValue = ((Number) c23465kM30922k2.f92937w).intValue();
                            int iIntValue3 = ((Number) c23465kM30922k2.f92938x).intValue();
                            zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                                c28655q.m87172p0(objM87133R3);
                            }
                            List list5 = (List) objM87133R3;
                            zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                i27 = 57344;
                                objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                i27 = 57344;
                                objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                                c28655q.m87172p0(objM87133R4);
                            }
                            list = (List) objM87133R4;
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifier3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            C0209i c0209i7 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a2);
                            C0209i c0209i8 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m9);
                            c0209i2 = C0217k.f732j;
                            int i316 = i15;
                            if (c28655q.f115903S) {
                                list2 = list;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                }
                                C0209i c0209i9 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
                                C22957g c22957g3 = AbstractC22977m.f90652c;
                                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q, 0);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                                Modifier modifier7 = modifier3;
                                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a8);
                                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m10);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
                                int i317 = iIntValue - state.getFeetRange().f71133w;
                                size = list5.size() - 1;
                                if (size < 0) {
                                    size = 0;
                                }
                                int iM36284n4 = AbstractC12889b.m36284n(i317, 0, size);
                                C2305k c2305k4 = C2299e.f9112O;
                                i28 = i316 & 112;
                                if (i28 == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zM87149e = z18 | c28655q.m87149e(iIntValue3);
                                objM87133R5 = c28655q.m87133R();
                                if (zM87149e) {
                                    c28676v1 = c28676v0;
                                    if (objM87133R5 == c28676v1) {
                                    }
                                    int i318 = i316 << 3;
                                    int i319 = ((i316 >> 3) & 7168) | 12582918 | (i318 & i27) | (i318 & 3670016);
                                    AbstractC34504e.m109045j(c23016z, list5, iM36284n4, c2886a3, f16, 0, z16, c2305k4, false, false, null, (Function1) objM87133R5, c28655q, i319, 0, 912);
                                    c28655q.m87173q(true);
                                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q, 0);
                                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j2);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a9);
                                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m11);
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N11);
                                    if (i28 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                    objM87133R6 = c28655q.m87133R();
                                    if (zM87149e2) {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    } else {
                                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    boolean z28 = z16;
                                    C2886a c2886a8 = c2886a3;
                                    float f111 = f16;
                                    AbstractC34504e.m109045j(c23016z, list2, iIntValue3, c2886a8, f111, 0, z28, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i319, 0, 912);
                                    c2886a3 = c2886a8;
                                    z16 = z28;
                                    f16 = f111;
                                    AbstractC25012a.m73392y(c28655q, true, true, false);
                                    modifier2 = modifier7;
                                } else {
                                    c28676v1 = c28676v0;
                                }
                                objM87133R5 = new C11506d(onHeightChanged, iIntValue3, 0);
                                c28655q.m87172p0(objM87133R5);
                                int i3110 = i316 << 3;
                                int i3111 = ((i316 >> 3) & 7168) | 12582918 | (i3110 & i27) | (i3110 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list5, iM36284n4, c2886a3, f16, 0, z16, c2305k4, false, false, null, (Function1) objM87133R5, c28655q, i3111, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a10);
                                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m12);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N12);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z29 = z16;
                                C2886a c2886a9 = c2886a3;
                                float f112 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue3, c2886a9, f112, 0, z29, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111, 0, 912);
                                c2886a3 = c2886a9;
                                z16 = z29;
                                f16 = f112;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier7;
                            } else {
                                list2 = list;
                            }
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            C0209i c0209i10 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                            C22957g c22957g4 = AbstractC22977m.f90652c;
                            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                            Modifier modifier8 = modifier3;
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a11);
                            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m13);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N13);
                            int i3112 = iIntValue - state.getFeetRange().f71133w;
                            size = list5.size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int iM36284n5 = AbstractC12889b.m36284n(i3112, 0, size);
                            C2305k c2305k5 = C2299e.f9112O;
                            i28 = i316 & 112;
                            if (i28 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87149e = z18 | c28655q.m87149e(iIntValue3);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v1 = c28676v0;
                                if (objM87133R5 == c28676v1) {
                                }
                                int i3113 = i316 << 3;
                                int i3114 = ((i316 >> 3) & 7168) | 12582918 | (i3113 & i27) | (i3113 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list5, iM36284n5, c2886a3, f16, 0, z16, c2305k5, false, false, null, (Function1) objM87133R5, c28655q, i3114, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a12);
                                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m14);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N14);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z210 = z16;
                                C2886a c2886a10 = c2886a3;
                                float f113 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue3, c2886a10, f113, 0, z210, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3114, 0, 912);
                                c2886a3 = c2886a10;
                                z16 = z210;
                                f16 = f113;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier8;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R5 = new C11506d(onHeightChanged, iIntValue3, 0);
                            c28655q.m87172p0(objM87133R5);
                            int i3115 = i316 << 3;
                            int i3116 = ((i316 >> 3) & 7168) | 12582918 | (i3115 & i27) | (i3115 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list5, iM36284n5, c2886a3, f16, 0, z16, c2305k5, false, false, null, (Function1) objM87133R5, c28655q, i3116, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a13);
                            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m15);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N15);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z211 = z16;
                            C2886a c2886a11 = c2886a3;
                            float f114 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue3, c2886a11, f114, 0, z211, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3116, 0, 912);
                            c2886a3 = c2886a11;
                            z16 = z211;
                            f16 = f114;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier8;
                        } else {
                            Modifier modifier9 = modifier3;
                            i25 = i15;
                            c28655q.m87150e0(-1150181417);
                            zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                            objM87133R = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                c28655q.m87172p0(objM87133R);
                            }
                            List list6 = (List) objM87133R;
                            i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                            int heightInCentimeters2 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                            if (i26 < 0) {
                                i26 = 0;
                            }
                            int iM36284n6 = AbstractC12889b.m36284n(heightInCentimeters2, 0, i26);
                            C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                            modifier2 = modifier9;
                            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                            if ((i25 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C0468a(onHeightChanged, 25);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C0468a(onHeightChanged, 25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i45 = i25 << 3;
                            AbstractC34504e.m109045j(c23016z, list6, iM36284n6, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i45 & 57344) | (i45 & 3670016), 0, 976);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c2886a2 = c2886a3;
                        f15 = f16;
                        z15 = z16;
                    } else {
                        c28655q.m87138X();
                        c2886a2 = n13;
                        f15 = f14;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    }
                    c28655q.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    c28676v0 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q.m87150e0(-1152230300);
                        c11503a = C11503a.f37005a;
                        C23465k c23465kM30922k3 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                        iIntValue = ((Number) c23465kM30922k3.f92937w).intValue();
                        int iIntValue4 = ((Number) c23465kM30922k3.f92938x).intValue();
                        zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        }
                        List list7 = (List) objM87133R3;
                        zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        }
                        list = (List) objM87133R4;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i11 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a3);
                        C0209i c0209i12 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m17);
                        c0209i2 = C0217k.f732j;
                        int i3117 = i15;
                        if (c28655q.f115903S) {
                            list2 = list;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            }
                            C0209i c0209i13 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N17);
                            C22957g c22957g5 = AbstractC22977m.f90652c;
                            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g5, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                            Modifier modifier10 = modifier3;
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a15);
                            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m18);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N18);
                            int i3118 = iIntValue - state.getFeetRange().f71133w;
                            size = list7.size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int iM36284n7 = AbstractC12889b.m36284n(i3118, 0, size);
                            C2305k c2305k6 = C2299e.f9112O;
                            i28 = i3117 & 112;
                            if (i28 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87149e = z18 | c28655q.m87149e(iIntValue4);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v1 = c28676v0;
                                if (objM87133R5 == c28676v1) {
                                }
                                int i3119 = i3117 << 3;
                                int i31110 = ((i3117 >> 3) & 7168) | 12582918 | (i3119 & i27) | (i3119 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list7, iM36284n7, c2886a3, f16, 0, z16, c2305k6, false, false, null, (Function1) objM87133R5, c28655q, i31110, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g5, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a16);
                                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m19);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N19);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z212 = z16;
                                C2886a c2886a12 = c2886a3;
                                float f115 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue4, c2886a12, f115, 0, z212, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31110, 0, 912);
                                c2886a3 = c2886a12;
                                z16 = z212;
                                f16 = f115;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier10;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R5 = new C11506d(onHeightChanged, iIntValue4, 0);
                            c28655q.m87172p0(objM87133R5);
                            int i31111 = i3117 << 3;
                            int i31112 = ((i3117 >> 3) & 7168) | 12582918 | (i31111 & i27) | (i31111 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list7, iM36284n7, c2886a3, f16, 0, z16, c2305k6, false, false, null, (Function1) objM87133R5, c28655q, i31112, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g5, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a17);
                            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m110);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N110);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z213 = z16;
                            C2886a c2886a13 = c2886a3;
                            float f116 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue4, c2886a13, f116, 0, z213, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31112, 0, 912);
                            c2886a3 = c2886a13;
                            z16 = z213;
                            f16 = f116;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier10;
                        } else {
                            list2 = list;
                        }
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        C0209i c0209i14 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N17);
                        C22957g c22957g6 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g6, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        Modifier modifier11 = modifier3;
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a18);
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m111);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N111);
                        int i31113 = iIntValue - state.getFeetRange().f71133w;
                        size = list7.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n8 = AbstractC12889b.m36284n(i31113, 0, size);
                        C2305k c2305k7 = C2299e.f9112O;
                        i28 = i3117 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue4);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i31114 = i3117 << 3;
                            int i31115 = ((i3117 >> 3) & 7168) | 12582918 | (i31114 & i27) | (i31114 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list7, iM36284n8, c2886a3, f16, 0, z16, c2305k7, false, false, null, (Function1) objM87133R5, c28655q, i31115, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g6, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a19);
                            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N112);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z214 = z16;
                            C2886a c2886a14 = c2886a3;
                            float f117 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue4, c2886a14, f117, 0, z214, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31115, 0, 912);
                            c2886a3 = c2886a14;
                            z16 = z214;
                            f16 = f117;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier11;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue4, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i31116 = i3117 << 3;
                        int i31117 = ((i3117 >> 3) & 7168) | 12582918 | (i31116 & i27) | (i31116 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list7, iM36284n8, c2886a3, f16, 0, z16, c2305k7, false, false, null, (Function1) objM87133R5, c28655q, i31117, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g6, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a110);
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N113);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z215 = z16;
                        C2886a c2886a15 = c2886a3;
                        float f118 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue4, c2886a15, f118, 0, z215, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31117, 0, 912);
                        c2886a3 = c2886a15;
                        z16 = z215;
                        f16 = f118;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier11;
                    } else {
                        Modifier modifier12 = modifier3;
                        i25 = i15;
                        c28655q.m87150e0(-1150181417);
                        zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        }
                        List list8 = (List) objM87133R;
                        i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int heightInCentimeters3 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n9 = AbstractC12889b.m36284n(heightInCentimeters3, 0, i26);
                        C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                        modifier2 = modifier12;
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a111);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m114);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N114);
                        if ((i25 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i46 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list8, iM36284n9, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i46 & 57344) | (i46 & 3670016), 0, 976);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    c2886a2 = n13;
                    f15 = f14;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
                }
            }
            i15 |= 3072;
            f14 = f13;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q.m87153g(n13);
                    } else {
                        zM87157i = c28655q.m87157i(n13);
                    }
                    if (zM87157i) {
                        i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i29 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i15 |= i29;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    }
                    c28655q.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    c28676v0 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q.m87150e0(-1152230300);
                        c11503a = C11503a.f37005a;
                        C23465k c23465kM30922k4 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                        iIntValue = ((Number) c23465kM30922k4.f92937w).intValue();
                        int iIntValue5 = ((Number) c23465kM30922k4.f92938x).intValue();
                        zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        }
                        List list9 = (List) objM87133R3;
                        zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        }
                        list = (List) objM87133R4;
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i15 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i15, c22994r1M66759a4);
                        C0209i c0209i16 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m115);
                        c0209i2 = C0217k.f732j;
                        int i31118 = i15;
                        if (c28655q.f115903S) {
                            list2 = list;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            }
                            C0209i c0209i17 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N115);
                            C22957g c22957g7 = AbstractC22977m.f90652c;
                            C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g7, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                            Modifier modifier13 = modifier3;
                            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a112);
                            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m116);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N116);
                            int i31119 = iIntValue - state.getFeetRange().f71133w;
                            size = list9.size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int iM36284n10 = AbstractC12889b.m36284n(i31119, 0, size);
                            C2305k c2305k8 = C2299e.f9112O;
                            i28 = i31118 & 112;
                            if (i28 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87149e = z18 | c28655q.m87149e(iIntValue5);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v1 = c28676v0;
                                if (objM87133R5 == c28676v1) {
                                }
                                int i311110 = i31118 << 3;
                                int i311111 = ((i31118 >> 3) & 7168) | 12582918 | (i311110 & i27) | (i311110 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list9, iM36284n10, c2886a3, f16, 0, z16, c2305k8, false, false, null, (Function1) objM87133R5, c28655q, i311111, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g7, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a113);
                                AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m117);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N117);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z216 = z16;
                                C2886a c2886a16 = c2886a3;
                                float f119 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue5, c2886a16, f119, 0, z216, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311111, 0, 912);
                                c2886a3 = c2886a16;
                                z16 = z216;
                                f16 = f119;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier13;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R5 = new C11506d(onHeightChanged, iIntValue5, 0);
                            c28655q.m87172p0(objM87133R5);
                            int i311112 = i31118 << 3;
                            int i311113 = ((i31118 >> 3) & 7168) | 12582918 | (i311112 & i27) | (i311112 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list9, iM36284n10, c2886a3, f16, 0, z16, c2305k8, false, false, null, (Function1) objM87133R5, c28655q, i311113, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g7, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a114);
                            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m118);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N118);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z217 = z16;
                            C2886a c2886a17 = c2886a3;
                            float f1110 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue5, c2886a17, f1110, 0, z217, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311113, 0, 912);
                            c2886a3 = c2886a17;
                            z16 = z217;
                            f16 = f1110;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier13;
                        } else {
                            list2 = list;
                        }
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        C0209i c0209i18 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N115);
                        C22957g c22957g8 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(c22957g8, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                        Modifier modifier14 = modifier3;
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a115);
                        AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m119);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N119);
                        int i311114 = iIntValue - state.getFeetRange().f71133w;
                        size = list9.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n11 = AbstractC12889b.m36284n(i311114, 0, size);
                        C2305k c2305k9 = C2299e.f9112O;
                        i28 = i31118 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue5);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i311115 = i31118 << 3;
                            int i311116 = ((i31118 >> 3) & 7168) | 12582918 | (i311115 & i27) | (i311115 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list9, iM36284n11, c2886a3, f16, 0, z16, c2305k9, false, false, null, (Function1) objM87133R5, c28655q, i311116, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a116 = AbstractC23007w.m66775a(c22957g8, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a116);
                            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m1110);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N1110);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z218 = z16;
                            C2886a c2886a18 = c2886a3;
                            float f1111 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue5, c2886a18, f1111, 0, z218, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311116, 0, 912);
                            c2886a3 = c2886a18;
                            z16 = z218;
                            f16 = f1111;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier14;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue5, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i311117 = i31118 << 3;
                        int i311118 = ((i31118 >> 3) & 7168) | 12582918 | (i311117 & i27) | (i311117 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list9, iM36284n11, c2886a3, f16, 0, z16, c2305k9, false, false, null, (Function1) objM87133R5, c28655q, i311118, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a117 = AbstractC23007w.m66775a(c22957g8, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a117);
                        AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m1111);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N1111);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z219 = z16;
                        C2886a c2886a19 = c2886a3;
                        float f1112 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue5, c2886a19, f1112, 0, z219, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311118, 0, 912);
                        c2886a3 = c2886a19;
                        z16 = z219;
                        f16 = f1112;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier14;
                    } else {
                        Modifier modifier15 = modifier3;
                        i25 = i15;
                        c28655q.m87150e0(-1150181417);
                        zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        }
                        List list10 = (List) objM87133R;
                        i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int heightInCentimeters4 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n12 = AbstractC12889b.m36284n(heightInCentimeters4, 0, i26);
                        C23010x c23010xM66775a118 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        modifier2 = modifier15;
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a118);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1112);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1112);
                        if ((i25 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i47 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list10, iM36284n12, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i47 & 57344) | (i47 & 3670016), 0, 976);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    c2886a2 = n13;
                    f15 = f14;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                c28676v0 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q.m87150e0(-1152230300);
                    c11503a = C11503a.f37005a;
                    C23465k c23465kM30922k5 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                    iIntValue = ((Number) c23465kM30922k5.f92937w).intValue();
                    int iIntValue6 = ((Number) c23465kM30922k5.f92938x).intValue();
                    zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    }
                    List list11 = (List) objM87133R3;
                    zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    }
                    list = (List) objM87133R4;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i19 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a5);
                    C0209i c0209i110 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1113);
                    c0209i2 = C0217k.f732j;
                    int i311119 = i15;
                    if (c28655q.f115903S) {
                        list2 = list;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N1113);
                        C22957g c22957g9 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a119 = AbstractC23007w.m66775a(c22957g9, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                        Modifier modifier16 = modifier3;
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a119);
                        AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N1114);
                        int i3111110 = iIntValue - state.getFeetRange().f71133w;
                        size = list11.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n13 = AbstractC12889b.m36284n(i3111110, 0, size);
                        C2305k c2305k10 = C2299e.f9112O;
                        i28 = i311119 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue6);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i3111111 = i311119 << 3;
                            int i3111112 = ((i311119 >> 3) & 7168) | 12582918 | (i3111111 & i27) | (i3111111 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list11, iM36284n13, c2886a3, f16, 0, z16, c2305k10, false, false, null, (Function1) objM87133R5, c28655q, i3111112, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(c22957g9, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                            Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a1110);
                            AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1115);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N1115);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z2110 = z16;
                            C2886a c2886a110 = c2886a3;
                            float f1113 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue6, c2886a110, f1113, 0, z2110, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111112, 0, 912);
                            c2886a3 = c2886a110;
                            z16 = z2110;
                            f16 = f1113;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier16;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue6, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i3111113 = i311119 << 3;
                        int i3111114 = ((i311119 >> 3) & 7168) | 12582918 | (i3111113 & i27) | (i3111113 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list11, iM36284n13, c2886a3, f16, 0, z16, c2305k10, false, false, null, (Function1) objM87133R5, c28655q, i3111114, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(c22957g9, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a1111);
                        AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1116);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N1116);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z2111 = z16;
                        C2886a c2886a111 = c2886a3;
                        float f1114 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue6, c2886a111, f1114, 0, z2111, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111114, 0, 912);
                        c2886a3 = c2886a111;
                        z16 = z2111;
                        f16 = f1114;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier16;
                    } else {
                        list2 = list;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    C0209i c0209i112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1113);
                    C22957g c22957g10 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(c22957g10, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifier17 = modifier3;
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a1112);
                    AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1117);
                    int i3111115 = iIntValue - state.getFeetRange().f71133w;
                    size = list11.size() - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    int iM36284n14 = AbstractC12889b.m36284n(i3111115, 0, size);
                    C2305k c2305k11 = C2299e.f9112O;
                    i28 = i311119 & 112;
                    if (i28 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87149e = z18 | c28655q.m87149e(iIntValue6);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                        }
                        int i3111116 = i311119 << 3;
                        int i3111117 = ((i311119 >> 3) & 7168) | 12582918 | (i3111116 & i27) | (i3111116 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list11, iM36284n14, c2886a3, f16, 0, z16, c2305k11, false, false, null, (Function1) objM87133R5, c28655q, i3111117, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a1113 = AbstractC23007w.m66775a(c22957g10, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a1113);
                        AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1118);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z2112 = z16;
                        C2886a c2886a112 = c2886a3;
                        float f1115 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue6, c2886a112, f1115, 0, z2112, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111117, 0, 912);
                        c2886a3 = c2886a112;
                        z16 = z2112;
                        f16 = f1115;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier17;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R5 = new C11506d(onHeightChanged, iIntValue6, 0);
                    c28655q.m87172p0(objM87133R5);
                    int i3111118 = i311119 << 3;
                    int i3111119 = ((i311119 >> 3) & 7168) | 12582918 | (i3111118 & i27) | (i3111118 & 3670016);
                    AbstractC34504e.m109045j(c23016z, list11, iM36284n14, c2886a3, f16, 0, z16, c2305k11, false, false, null, (Function1) objM87133R5, c28655q, i3111119, 0, 912);
                    c28655q.m87173q(true);
                    C23010x c23010xM66775a1114 = AbstractC23007w.m66775a(c22957g10, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a1114);
                    AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m1119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N1119);
                    if (i28 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87149e2) {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    boolean z2113 = z16;
                    C2886a c2886a113 = c2886a3;
                    float f1116 = f16;
                    AbstractC34504e.m109045j(c23016z, list2, iIntValue6, c2886a113, f1116, 0, z2113, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111119, 0, 912);
                    c2886a3 = c2886a113;
                    z16 = z2113;
                    f16 = f1116;
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                    modifier2 = modifier17;
                } else {
                    Modifier modifier18 = modifier3;
                    i25 = i15;
                    c28655q.m87150e0(-1150181417);
                    zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    }
                    List list12 = (List) objM87133R;
                    i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int heightInCentimeters5 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n15 = AbstractC12889b.m36284n(heightInCentimeters5, 0, i26);
                    C23010x c23010xM66775a1115 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                    modifier2 = modifier18;
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a1115);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11110);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11110);
                    if ((i25 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i48 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list12, iM36284n15, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i48 & 57344) | (i48 & 3670016), 0, 976);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c2886a2 = c2886a3;
                f15 = f16;
                z15 = z16;
            } else {
                c28655q.m87138X();
                c2886a2 = n13;
                f15 = f14;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q.m87153g(n13);
                    } else {
                        zM87157i = c28655q.m87157i(n13);
                    }
                    if (zM87157i) {
                        i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i29 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i15 |= i29;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = true;
                        } else {
                            c2886a3 = n13;
                            modifier3 = modifier2;
                            f16 = f14;
                            z16 = z13;
                        }
                    }
                    c28655q.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    c28676v0 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q.m87150e0(-1152230300);
                        c11503a = C11503a.f37005a;
                        C23465k c23465kM30922k6 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                        iIntValue = ((Number) c23465kM30922k6.f92937w).intValue();
                        int iIntValue7 = ((Number) c23465kM30922k6.f92938x).intValue();
                        zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                            c28655q.m87172p0(objM87133R3);
                        }
                        List list13 = (List) objM87133R3;
                        zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            i27 = 57344;
                            objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                            c28655q.m87172p0(objM87133R4);
                        }
                        list = (List) objM87133R4;
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                        Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i113 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a6);
                        C0209i c0209i114 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11111);
                        c0209i2 = C0217k.f732j;
                        int i3111120 = i15;
                        if (c28655q.f115903S) {
                            list2 = list;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            }
                            C0209i c0209i115 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N11111);
                            C22957g c22957g11 = AbstractC22977m.f90652c;
                            C23010x c23010xM66775a1116 = AbstractC23007w.m66775a(c22957g11, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                            Modifier modifier19 = modifier3;
                            Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a1116);
                            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N11112);
                            int i31111110 = iIntValue - state.getFeetRange().f71133w;
                            size = list13.size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int iM36284n16 = AbstractC12889b.m36284n(i31111110, 0, size);
                            C2305k c2305k12 = C2299e.f9112O;
                            i28 = i3111120 & 112;
                            if (i28 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87149e = z18 | c28655q.m87149e(iIntValue7);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v1 = c28676v0;
                                if (objM87133R5 == c28676v1) {
                                }
                                int i31111111 = i3111120 << 3;
                                int i31111112 = ((i3111120 >> 3) & 7168) | 12582918 | (i31111111 & i27) | (i31111111 & 3670016);
                                AbstractC34504e.m109045j(c23016z, list13, iM36284n16, c2886a3, f16, 0, z16, c2305k12, false, false, null, (Function1) objM87133R5, c28655q, i31111112, 0, 912);
                                c28655q.m87173q(true);
                                C23010x c23010xM66775a1117 = AbstractC23007w.m66775a(c22957g11, c2305k, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a1117);
                                AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11113);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N11113);
                                if (i28 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87149e2) {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                boolean z2114 = z16;
                                C2886a c2886a114 = c2886a3;
                                float f1117 = f16;
                                AbstractC34504e.m109045j(c23016z, list2, iIntValue7, c2886a114, f1117, 0, z2114, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111112, 0, 912);
                                c2886a3 = c2886a114;
                                z16 = z2114;
                                f16 = f1117;
                                AbstractC25012a.m73392y(c28655q, true, true, false);
                                modifier2 = modifier19;
                            } else {
                                c28676v1 = c28676v0;
                            }
                            objM87133R5 = new C11506d(onHeightChanged, iIntValue7, 0);
                            c28655q.m87172p0(objM87133R5);
                            int i31111113 = i3111120 << 3;
                            int i31111114 = ((i3111120 >> 3) & 7168) | 12582918 | (i31111113 & i27) | (i31111113 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list13, iM36284n16, c2886a3, f16, 0, z16, c2305k12, false, false, null, (Function1) objM87133R5, c28655q, i31111114, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a1118 = AbstractC23007w.m66775a(c22957g11, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                            Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a1118);
                            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11114);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N11114);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z2115 = z16;
                            C2886a c2886a115 = c2886a3;
                            float f1118 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue7, c2886a115, f1118, 0, z2115, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111114, 0, 912);
                            c2886a3 = c2886a115;
                            z16 = z2115;
                            f16 = f1118;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier19;
                        } else {
                            list2 = list;
                        }
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        C0209i c0209i116 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N11111);
                        C22957g c22957g12 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a1119 = AbstractC23007w.m66775a(c22957g12, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                        Modifier modifier110 = modifier3;
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a1119);
                        AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N11115);
                        int i31111115 = iIntValue - state.getFeetRange().f71133w;
                        size = list13.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n17 = AbstractC12889b.m36284n(i31111115, 0, size);
                        C2305k c2305k13 = C2299e.f9112O;
                        i28 = i3111120 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue7);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i31111116 = i3111120 << 3;
                            int i31111117 = ((i3111120 >> 3) & 7168) | 12582918 | (i31111116 & i27) | (i31111116 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list13, iM36284n17, c2886a3, f16, 0, z16, c2305k13, false, false, null, (Function1) objM87133R5, c28655q, i31111117, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a11110 = AbstractC23007w.m66775a(c22957g12, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                            Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a11110);
                            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11116);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N11116);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z2116 = z16;
                            C2886a c2886a116 = c2886a3;
                            float f1119 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue7, c2886a116, f1119, 0, z2116, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111117, 0, 912);
                            c2886a3 = c2886a116;
                            z16 = z2116;
                            f16 = f1119;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier110;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue7, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i31111118 = i3111120 << 3;
                        int i31111119 = ((i3111120 >> 3) & 7168) | 12582918 | (i31111118 & i27) | (i31111118 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list13, iM36284n17, c2886a3, f16, 0, z16, c2305k13, false, false, null, (Function1) objM87133R5, c28655q, i31111119, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a11111 = AbstractC23007w.m66775a(c22957g12, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                        Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a11111);
                        AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m11117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N11117);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z2117 = z16;
                        C2886a c2886a117 = c2886a3;
                        float f11110 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue7, c2886a117, f11110, 0, z2117, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111119, 0, 912);
                        c2886a3 = c2886a117;
                        z16 = z2117;
                        f16 = f11110;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier110;
                    } else {
                        Modifier modifier111 = modifier3;
                        i25 = i15;
                        c28655q.m87150e0(-1150181417);
                        zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q.m87172p0(objM87133R);
                        }
                        List list14 = (List) objM87133R;
                        i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int heightInCentimeters6 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n18 = AbstractC12889b.m36284n(heightInCentimeters6, 0, i26);
                        C23010x c23010xM66775a11112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                        modifier2 = modifier111;
                        Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11112);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11118);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11118);
                        if ((i25 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C0468a(onHeightChanged, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i49 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list14, iM36284n18, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i49 & 57344) | (i49 & 3670016), 0, 976);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    c2886a2 = n13;
                    f15 = f14;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                c28676v0 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q.m87150e0(-1152230300);
                    c11503a = C11503a.f37005a;
                    C23465k c23465kM30922k7 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                    iIntValue = ((Number) c23465kM30922k7.f92937w).intValue();
                    int iIntValue8 = ((Number) c23465kM30922k7.f92938x).intValue();
                    zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    }
                    List list15 = (List) objM87133R3;
                    zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    }
                    list = (List) objM87133R4;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i117 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i117, c22994r1M66759a7);
                    C0209i c0209i118 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m11119);
                    c0209i2 = C0217k.f732j;
                    int i3111121 = i15;
                    if (c28655q.f115903S) {
                        list2 = list;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        C0209i c0209i119 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N11119);
                        C22957g c22957g13 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a11113 = AbstractC23007w.m66775a(c22957g13, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
                        Modifier modifier112 = modifier3;
                        Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11113);
                        AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N111110);
                        int i311111110 = iIntValue - state.getFeetRange().f71133w;
                        size = list15.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n19 = AbstractC12889b.m36284n(i311111110, 0, size);
                        C2305k c2305k14 = C2299e.f9112O;
                        i28 = i3111121 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue8);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i311111111 = i3111121 << 3;
                            int i311111112 = ((i3111121 >> 3) & 7168) | 12582918 | (i311111111 & i27) | (i311111111 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list15, iM36284n19, c2886a3, f16, 0, z16, c2305k14, false, false, null, (Function1) objM87133R5, c28655q, i311111112, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a11114 = AbstractC23007w.m66775a(c22957g13, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
                            Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11114);
                            AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111111);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N111111);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z2118 = z16;
                            C2886a c2886a118 = c2886a3;
                            float f11111 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue8, c2886a118, f11111, 0, z2118, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311111112, 0, 912);
                            c2886a3 = c2886a118;
                            z16 = z2118;
                            f16 = f11111;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier112;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue8, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i311111113 = i3111121 << 3;
                        int i311111114 = ((i3111121 >> 3) & 7168) | 12582918 | (i311111113 & i27) | (i311111113 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list15, iM36284n19, c2886a3, f16, 0, z16, c2305k14, false, false, null, (Function1) objM87133R5, c28655q, i311111114, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a11115 = AbstractC23007w.m66775a(c22957g13, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                        Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11115);
                        AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N111112);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z2119 = z16;
                        C2886a c2886a119 = c2886a3;
                        float f11112 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue8, c2886a119, f11112, 0, z2119, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311111114, 0, 912);
                        c2886a3 = c2886a119;
                        z16 = z2119;
                        f16 = f11112;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier112;
                    } else {
                        list2 = list;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    C0209i c0209i1110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N11119);
                    C22957g c22957g14 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a11116 = AbstractC23007w.m66775a(c22957g14, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
                    Modifier modifier113 = modifier3;
                    Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11116);
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N111113);
                    int i311111115 = iIntValue - state.getFeetRange().f71133w;
                    size = list15.size() - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    int iM36284n110 = AbstractC12889b.m36284n(i311111115, 0, size);
                    C2305k c2305k15 = C2299e.f9112O;
                    i28 = i3111121 & 112;
                    if (i28 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87149e = z18 | c28655q.m87149e(iIntValue8);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                        }
                        int i311111116 = i3111121 << 3;
                        int i311111117 = ((i3111121 >> 3) & 7168) | 12582918 | (i311111116 & i27) | (i311111116 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list15, iM36284n110, c2886a3, f16, 0, z16, c2305k15, false, false, null, (Function1) objM87133R5, c28655q, i311111117, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a11117 = AbstractC23007w.m66775a(c22957g14, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
                        Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11117);
                        AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N111114);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z21110 = z16;
                        C2886a c2886a1110 = c2886a3;
                        float f11113 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue8, c2886a1110, f11113, 0, z21110, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311111117, 0, 912);
                        c2886a3 = c2886a1110;
                        z16 = z21110;
                        f16 = f11113;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier113;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R5 = new C11506d(onHeightChanged, iIntValue8, 0);
                    c28655q.m87172p0(objM87133R5);
                    int i311111118 = i3111121 << 3;
                    int i311111119 = ((i3111121 >> 3) & 7168) | 12582918 | (i311111118 & i27) | (i311111118 & 3670016);
                    AbstractC34504e.m109045j(c23016z, list15, iM36284n110, c2886a3, f16, 0, z16, c2305k15, false, false, null, (Function1) objM87133R5, c28655q, i311111119, 0, 912);
                    c28655q.m87173q(true);
                    C23010x c23010xM66775a11118 = AbstractC23007w.m66775a(c22957g14, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
                    Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i117, c23010xM66775a11118);
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N111115);
                    if (i28 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87149e2) {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    boolean z21111 = z16;
                    C2886a c2886a1111 = c2886a3;
                    float f11114 = f16;
                    AbstractC34504e.m109045j(c23016z, list2, iIntValue8, c2886a1111, f11114, 0, z21111, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i311111119, 0, 912);
                    c2886a3 = c2886a1111;
                    z16 = z21111;
                    f16 = f11114;
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                    modifier2 = modifier113;
                } else {
                    Modifier modifier114 = modifier3;
                    i25 = i15;
                    c28655q.m87150e0(-1150181417);
                    zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    }
                    List list16 = (List) objM87133R;
                    i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int heightInCentimeters7 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n111 = AbstractC12889b.m36284n(heightInCentimeters7, 0, i26);
                    C23010x c23010xM66775a11119 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                    modifier2 = modifier114;
                    Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11119);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111116);
                    if ((i25 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i410 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list16, iM36284n111, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i410 & 57344) | (i410 & 3670016), 0, 976);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c2886a2 = c2886a3;
                f15 = f16;
                z15 = z16;
            } else {
                c28655q.m87138X();
                c2886a2 = n13;
                f15 = f14;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(n13);
                } else {
                    zM87157i = c28655q.m87157i(n13);
                }
                if (zM87157i) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i15 |= i29;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = true;
                    } else {
                        c2886a3 = n13;
                        modifier3 = modifier2;
                        f16 = f14;
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                c28676v0 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q.m87150e0(-1152230300);
                    c11503a = C11503a.f37005a;
                    C23465k c23465kM30922k8 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                    iIntValue = ((Number) c23465kM30922k8.f92937w).intValue();
                    int iIntValue9 = ((Number) c23465kM30922k8.f92938x).intValue();
                    zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                        c28655q.m87172p0(objM87133R3);
                    }
                    List list17 = (List) objM87133R3;
                    zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        i27 = 57344;
                        objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                        c28655q.m87172p0(objM87133R4);
                    }
                    list = (List) objM87133R4;
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q.m87165m();
                    Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1111 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1111, c22994r1M66759a8);
                    C0209i c0209i1112 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m111117);
                    c0209i2 = C0217k.f732j;
                    int i3111122 = i15;
                    if (c28655q.f115903S) {
                        list2 = list;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        C0209i c0209i1113 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N111117);
                        C22957g c22957g15 = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a111110 = AbstractC23007w.m66775a(c22957g15, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q.m87165m();
                        Modifier modifier115 = modifier3;
                        Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111110);
                        AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m111118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N111118);
                        int i3111111110 = iIntValue - state.getFeetRange().f71133w;
                        size = list17.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int iM36284n112 = AbstractC12889b.m36284n(i3111111110, 0, size);
                        C2305k c2305k16 = C2299e.f9112O;
                        i28 = i3111122 & 112;
                        if (i28 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87149e = z18 | c28655q.m87149e(iIntValue9);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                            }
                            int i3111111111 = i3111122 << 3;
                            int i3111111112 = ((i3111122 >> 3) & 7168) | 12582918 | (i3111111111 & i27) | (i3111111111 & 3670016);
                            AbstractC34504e.m109045j(c23016z, list17, iM36284n112, c2886a3, f16, 0, z16, c2305k16, false, false, null, (Function1) objM87133R5, c28655q, i3111111112, 0, 912);
                            c28655q.m87173q(true);
                            C23010x c23010xM66775a111111 = AbstractC23007w.m66775a(c22957g15, c2305k, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q.m87165m();
                            Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111111);
                            AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m111119);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N111119);
                            if (i28 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87149e2) {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            boolean z21112 = z16;
                            C2886a c2886a1112 = c2886a3;
                            float f11115 = f16;
                            AbstractC34504e.m109045j(c23016z, list2, iIntValue9, c2886a1112, f11115, 0, z21112, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111111112, 0, 912);
                            c2886a3 = c2886a1112;
                            z16 = z21112;
                            f16 = f11115;
                            AbstractC25012a.m73392y(c28655q, true, true, false);
                            modifier2 = modifier115;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R5 = new C11506d(onHeightChanged, iIntValue9, 0);
                        c28655q.m87172p0(objM87133R5);
                        int i3111111113 = i3111122 << 3;
                        int i3111111114 = ((i3111122 >> 3) & 7168) | 12582918 | (i3111111113 & i27) | (i3111111113 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list17, iM36284n112, c2886a3, f16, 0, z16, c2305k16, false, false, null, (Function1) objM87133R5, c28655q, i3111111114, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a111112 = AbstractC23007w.m66775a(c22957g15, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q.m87165m();
                        Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111112);
                        AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m1111110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1111110);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z21113 = z16;
                        C2886a c2886a1113 = c2886a3;
                        float f11116 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue9, c2886a1113, f11116, 0, z21113, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111111114, 0, 912);
                        c2886a3 = c2886a1113;
                        z16 = z21113;
                        f16 = f11116;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier115;
                    } else {
                        list2 = list;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    C0209i c0209i1114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111117);
                    C22957g c22957g16 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a111113 = AbstractC23007w.m66775a(c22957g16, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q.m87165m();
                    Modifier modifier116 = modifier3;
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111113);
                    AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m1111111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N1111111);
                    int i3111111115 = iIntValue - state.getFeetRange().f71133w;
                    size = list17.size() - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    int iM36284n113 = AbstractC12889b.m36284n(i3111111115, 0, size);
                    C2305k c2305k17 = C2299e.f9112O;
                    i28 = i3111122 & 112;
                    if (i28 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87149e = z18 | c28655q.m87149e(iIntValue9);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                        }
                        int i3111111116 = i3111122 << 3;
                        int i3111111117 = ((i3111122 >> 3) & 7168) | 12582918 | (i3111111116 & i27) | (i3111111116 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list17, iM36284n113, c2886a3, f16, 0, z16, c2305k17, false, false, null, (Function1) objM87133R5, c28655q, i3111111117, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a111114 = AbstractC23007w.m66775a(c22957g16, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111114);
                        AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m1111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N1111112);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z21114 = z16;
                        C2886a c2886a1114 = c2886a3;
                        float f11117 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue9, c2886a1114, f11117, 0, z21114, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111111117, 0, 912);
                        c2886a3 = c2886a1114;
                        z16 = z21114;
                        f16 = f11117;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier116;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R5 = new C11506d(onHeightChanged, iIntValue9, 0);
                    c28655q.m87172p0(objM87133R5);
                    int i3111111118 = i3111122 << 3;
                    int i3111111119 = ((i3111122 >> 3) & 7168) | 12582918 | (i3111111118 & i27) | (i3111111118 & 3670016);
                    AbstractC34504e.m109045j(c23016z, list17, iM36284n113, c2886a3, f16, 0, z16, c2305k17, false, false, null, (Function1) objM87133R5, c28655q, i3111111119, 0, 912);
                    c28655q.m87173q(true);
                    C23010x c23010xM66775a111115 = AbstractC23007w.m66775a(c22957g16, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q.m87165m();
                    Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111, c23010xM66775a111115);
                    AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m1111113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N1111113);
                    if (i28 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87149e2) {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    boolean z21115 = z16;
                    C2886a c2886a1115 = c2886a3;
                    float f11118 = f16;
                    AbstractC34504e.m109045j(c23016z, list2, iIntValue9, c2886a1115, f11118, 0, z21115, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i3111111119, 0, 912);
                    c2886a3 = c2886a1115;
                    z16 = z21115;
                    f16 = f11118;
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                    modifier2 = modifier116;
                } else {
                    Modifier modifier117 = modifier3;
                    i25 = i15;
                    c28655q.m87150e0(-1150181417);
                    zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q.m87172p0(objM87133R);
                    }
                    List list18 = (List) objM87133R;
                    i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int heightInCentimeters8 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n114 = AbstractC12889b.m36284n(heightInCentimeters8, 0, i26);
                    C23010x c23010xM66775a111116 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q.m87165m();
                    modifier2 = modifier117;
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a111116);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1111114);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1111114);
                    if ((i25 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0468a(onHeightChanged, 25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i411 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list18, iM36284n114, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i411 & 57344) | (i411 & 3670016), 0, 976);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c2886a2 = c2886a3;
                f15 = f16;
                z15 = z16;
            } else {
                c28655q.m87138X();
                c2886a2 = n13;
                f15 = f14;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                if (i34 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    f14 = 60;
                }
                if ((i14 & 16) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    i15 &= -57345;
                }
                if (i18 != 0) {
                    c2886a3 = n13;
                    modifier3 = modifier2;
                    f16 = f14;
                    z16 = true;
                } else {
                    c2886a3 = n13;
                    modifier3 = modifier2;
                    f16 = f14;
                    z16 = z13;
                }
            } else {
                if (i34 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    f14 = 60;
                }
                if ((i14 & 16) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    i15 &= -57345;
                }
                if (i18 != 0) {
                    c2886a3 = n13;
                    modifier3 = modifier2;
                    f16 = f14;
                    z16 = true;
                } else {
                    c2886a3 = n13;
                    modifier3 = modifier2;
                    f16 = f14;
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            unitSystem = state.getUnitSystem();
            unitSystem2 = UnitSystem.IMPERIAL;
            c23016z = C23016z.f90757a;
            c28676v0 = C28635l.f115821a;
            if (unitSystem == unitSystem2) {
                c28655q.m87150e0(-1152230300);
                c11503a = C11503a.f37005a;
                C23465k c23465kM30922k9 = c11503a.m30922k(c11503a.m30912a(state.getHeightInCentimeters()));
                iIntValue = ((Number) c23465kM30922k9.f92937w).intValue();
                int iIntValue10 = ((Number) c23465kM30922k9.f92938x).intValue();
                zM87153g2 = c28655q.m87153g(state.getFeetLabel()) | c28655q.m87153g(state.getFeetRange());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = c11503a.m30918g(AbstractC25265s.m74093D1(state.getFeetRange()), state.getFeetLabel());
                    c28655q.m87172p0(objM87133R3);
                }
                List list19 = (List) objM87133R3;
                zM87153g3 = c28655q.m87153g(state.getInchesLabel());
                objM87133R4 = c28655q.m87133R();
                if (zM87153g3) {
                    i27 = 57344;
                    objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                    c28655q.m87172p0(objM87133R4);
                } else {
                    i27 = 57344;
                    objM87133R4 = c11503a.m30917f(0, 11, state.getInchesLabel());
                    c28655q.m87172p0(objM87133R4);
                }
                list = (List) objM87133R4;
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q.m87165m();
                Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1115 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1115, c22994r1M66759a9);
                C0209i c0209i1116 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m1111115);
                c0209i2 = C0217k.f732j;
                int i3111123 = i15;
                if (c28655q.f115903S) {
                    list2 = list;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    }
                    C0209i c0209i1117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N1111115);
                    C22957g c22957g17 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a111117 = AbstractC23007w.m66775a(c22957g17, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q.m87165m();
                    Modifier modifier118 = modifier3;
                    Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a111117);
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m1111116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N1111116);
                    int i31111111110 = iIntValue - state.getFeetRange().f71133w;
                    size = list19.size() - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    int iM36284n115 = AbstractC12889b.m36284n(i31111111110, 0, size);
                    C2305k c2305k18 = C2299e.f9112O;
                    i28 = i3111123 & 112;
                    if (i28 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87149e = z18 | c28655q.m87149e(iIntValue10);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                        }
                        int i31111111111 = i3111123 << 3;
                        int i31111111112 = ((i3111123 >> 3) & 7168) | 12582918 | (i31111111111 & i27) | (i31111111111 & 3670016);
                        AbstractC34504e.m109045j(c23016z, list19, iM36284n115, c2886a3, f16, 0, z16, c2305k18, false, false, null, (Function1) objM87133R5, c28655q, i31111111112, 0, 912);
                        c28655q.m87173q(true);
                        C23010x c23010xM66775a111118 = AbstractC23007w.m66775a(c22957g17, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q.m87165m();
                        Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a111118);
                        AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m1111117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N1111117);
                        if (i28 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87149e2) {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        boolean z21116 = z16;
                        C2886a c2886a1116 = c2886a3;
                        float f11119 = f16;
                        AbstractC34504e.m109045j(c23016z, list2, iIntValue10, c2886a1116, f11119, 0, z21116, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111111112, 0, 912);
                        c2886a3 = c2886a1116;
                        z16 = z21116;
                        f16 = f11119;
                        AbstractC25012a.m73392y(c28655q, true, true, false);
                        modifier2 = modifier118;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R5 = new C11506d(onHeightChanged, iIntValue10, 0);
                    c28655q.m87172p0(objM87133R5);
                    int i31111111113 = i3111123 << 3;
                    int i31111111114 = ((i3111123 >> 3) & 7168) | 12582918 | (i31111111113 & i27) | (i31111111113 & 3670016);
                    AbstractC34504e.m109045j(c23016z, list19, iM36284n115, c2886a3, f16, 0, z16, c2305k18, false, false, null, (Function1) objM87133R5, c28655q, i31111111114, 0, 912);
                    c28655q.m87173q(true);
                    C23010x c23010xM66775a111119 = AbstractC23007w.m66775a(c22957g17, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q.m87165m();
                    Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a111119);
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m1111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N1111118);
                    if (i28 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87149e2) {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    boolean z21117 = z16;
                    C2886a c2886a1117 = c2886a3;
                    float f111110 = f16;
                    AbstractC34504e.m109045j(c23016z, list2, iIntValue10, c2886a1117, f111110, 0, z21117, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111111114, 0, 912);
                    c2886a3 = c2886a1117;
                    z16 = z21117;
                    f16 = f111110;
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                    modifier2 = modifier118;
                } else {
                    list2 = list;
                }
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                C0209i c0209i1118 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N1111115);
                C22957g c22957g18 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a1111110 = AbstractC23007w.m66775a(c22957g18, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q.m87165m();
                Modifier modifier119 = modifier3;
                Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a1111110);
                AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m1111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N1111119);
                int i31111111115 = iIntValue - state.getFeetRange().f71133w;
                size = list19.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                int iM36284n116 = AbstractC12889b.m36284n(i31111111115, 0, size);
                C2305k c2305k19 = C2299e.f9112O;
                i28 = i3111123 & 112;
                if (i28 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87149e = z18 | c28655q.m87149e(iIntValue10);
                objM87133R5 = c28655q.m87133R();
                if (zM87149e) {
                    c28676v1 = c28676v0;
                    if (objM87133R5 == c28676v1) {
                    }
                    int i31111111116 = i3111123 << 3;
                    int i31111111117 = ((i3111123 >> 3) & 7168) | 12582918 | (i31111111116 & i27) | (i31111111116 & 3670016);
                    AbstractC34504e.m109045j(c23016z, list19, iM36284n116, c2886a3, f16, 0, z16, c2305k19, false, false, null, (Function1) objM87133R5, c28655q, i31111111117, 0, 912);
                    c28655q.m87173q(true);
                    C23010x c23010xM66775a1111111 = AbstractC23007w.m66775a(c22957g18, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q.m87165m();
                    Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a1111111);
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m11111110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N11111110);
                    if (i28 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87149e2) {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    boolean z21118 = z16;
                    C2886a c2886a1118 = c2886a3;
                    float f111111 = f16;
                    AbstractC34504e.m109045j(c23016z, list2, iIntValue10, c2886a1118, f111111, 0, z21118, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111111117, 0, 912);
                    c2886a3 = c2886a1118;
                    z16 = z21118;
                    f16 = f111111;
                    AbstractC25012a.m73392y(c28655q, true, true, false);
                    modifier2 = modifier119;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R5 = new C11506d(onHeightChanged, iIntValue10, 0);
                c28655q.m87172p0(objM87133R5);
                int i31111111118 = i3111123 << 3;
                int i31111111119 = ((i3111123 >> 3) & 7168) | 12582918 | (i31111111118 & i27) | (i31111111118 & 3670016);
                AbstractC34504e.m109045j(c23016z, list19, iM36284n116, c2886a3, f16, 0, z16, c2305k19, false, false, null, (Function1) objM87133R5, c28655q, i31111111119, 0, 912);
                c28655q.m87173q(true);
                C23010x c23010xM66775a1111112 = AbstractC23007w.m66775a(c22957g18, c2305k, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q.m87165m();
                Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a1111112);
                AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m11111111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N11111111);
                if (i28 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87149e2 = z19 | c28655q.m87149e(iIntValue);
                objM87133R6 = c28655q.m87133R();
                if (zM87149e2) {
                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C11506d(onHeightChanged, iIntValue, 1);
                    c28655q.m87172p0(objM87133R6);
                }
                boolean z21119 = z16;
                C2886a c2886a1119 = c2886a3;
                float f111112 = f16;
                AbstractC34504e.m109045j(c23016z, list2, iIntValue10, c2886a1119, f111112, 0, z21119, c2305k, false, false, null, (Function1) objM87133R6, c28655q, i31111111119, 0, 912);
                c2886a3 = c2886a1119;
                z16 = z21119;
                f16 = f111112;
                AbstractC25012a.m73392y(c28655q, true, true, false);
                modifier2 = modifier119;
            } else {
                Modifier modifier1110 = modifier3;
                i25 = i15;
                c28655q.m87150e0(-1150181417);
                zM87153g = c28655q.m87153g(state.getCentimetersRange()) | c28655q.m87153g(state.getCentimetersLabel());
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                    c28655q.m87172p0(objM87133R);
                }
                List list110 = (List) objM87133R;
                i26 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                int heightInCentimeters9 = state.getHeightInCentimeters() - state.getCentimetersRange().f71133w;
                if (i26 < 0) {
                    i26 = 0;
                }
                int iM36284n117 = AbstractC12889b.m36284n(heightInCentimeters9, 0, i26);
                C23010x c23010xM66775a1111113 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q.m87165m();
                modifier2 = modifier1110;
                Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a1111113);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11111112);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11111112);
                if ((i25 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C0468a(onHeightChanged, 25);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0468a(onHeightChanged, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                int i412 = i25 << 3;
                AbstractC34504e.m109045j(c23016z, list110, iM36284n117, c2886a3, f16, 0, z16, null, false, false, null, (Function1) objM87133R2, c28655q, ((i25 >> 3) & 7168) | 6 | (i412 & 57344) | (i412 & 3670016), 0, 976);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c2886a2 = c2886a3;
            f15 = f16;
            z15 = z16;
        } else {
            c28655q.m87138X();
            c2886a2 = n13;
            f15 = f14;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11507e(state, onHeightChanged, modifier2, f15, c2886a2, z15, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m30954f(Function1 function1, int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        C11503a c11503a = C11503a.f37005a;
        function1.invoke(Integer.valueOf(c11503a.m30913b(c11503a.m30929r(value), i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m30955g(Function1 function1, int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        C11503a c11503a = C11503a.f37005a;
        function1.invoke(Integer.valueOf(c11503a.m30913b(i13, c11503a.m30929r(value))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m30956h(Function1 function1, String value) {
        AbstractC22676k.m65750j(value, "value");
        function1.invoke(Integer.valueOf(C11503a.f37005a.m30929r(value)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m30957i(C11509g c11509g, Function1 function1, Modifier modifier, float f13, C2886a c2886a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m30953e(c11509g, function1, modifier, f13, c2886a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
