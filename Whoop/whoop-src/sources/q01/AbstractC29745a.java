package q01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import com.whoop.domain.model.UnitSystem;
import d21.C11503a;
import d21.C11507e;
import e93.AbstractC12889b;
import java.util.List;
import l83.C23454a0;
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
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p90.C29000h;
import u31.AbstractC34504e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lq01/b;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onCircumferenceChanged", "Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "itemHeight", "Lb91/a;", "textStyle", "", "ignoreFirstValue", "d", "(Lq01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29745a {
    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01db  */
    /* JADX WARN: Code duplicated, block: B:116:0x021c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0242  */
    /* JADX WARN: Code duplicated, block: B:122:0x0274  */
    /* JADX WARN: Code duplicated, block: B:125:0x029f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x031c  */
    /* JADX WARN: Code duplicated, block: B:145:0x032d  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de A[PHI: r0 r5 r9 r11
      0x00de: PHI (r0v21 b91.a) = (r0v2 b91.a), (r0v0 b91.a), (r0v0 b91.a) binds: [B:85:0x00ff, B:74:0x00da, B:75:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r5v21 int) = (r5v14 int), (r5v11 int), (r5v22 int) binds: [B:85:0x00ff, B:74:0x00da, B:75:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r9v23 androidx.compose.ui.Modifier) = (r9v4 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier) binds: [B:85:0x00ff, B:74:0x00da, B:75:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r11v6 float) = (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:85:0x00ff, B:74:0x00da, B:75:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0174  */
    /* JADX INFO: renamed from: d */
    public static final void m91189d(C29746b state, Function1 onCircumferenceChanged, Modifier modifier, float f13, C2886a c2886a, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        float f14;
        int i17;
        int i18;
        int i19;
        boolean z13;
        C2886a c2886a2;
        C28655q c28655q;
        Modifier modifier3;
        float f15;
        boolean z14;
        C28677v1 c28677v1M87180u;
        float f16;
        boolean z15;
        C2886a c2886a3;
        Modifier modifier4;
        UnitSystem unitSystem;
        UnitSystem unitSystem2;
        C23016z c23016z;
        C28655q c28655q2;
        boolean zM87153g;
        Object objM87133R;
        int i24;
        int i25;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        Object objM87133R2;
        boolean zM87153g2;
        Object objM87133R3;
        int i26;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z17;
        Object objM87133R4;
        int i27;
        boolean zM87157i;
        C2886a n13 = c2886a;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onCircumferenceChanged, "onCircumferenceChanged");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-2062809259);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onCircumferenceChanged) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q3.m87147d(f14)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) != 0) {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    } else {
                        if ((32768 & i13) == 0) {
                            zM87157i = c28655q3.m87153g(n13);
                        } else {
                            zM87157i = c28655q3.m87157i(n13);
                        }
                        if (zM87157i) {
                            i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                    }
                    i15 |= i27;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q3.m87155h(z4)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q3.m87135U(i15 & 1, z13)) {
                        c28655q3.m87140Z();
                        if ((i13 & 1) != 0 || c28655q3.m87118C()) {
                            if (i28 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i16 != 0) {
                                f14 = 60;
                            }
                            if ((i14 & 16) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                                i15 &= -57345;
                            }
                            if (i18 != 0) {
                                f16 = f14;
                                z15 = true;
                            }
                            c2886a3 = n13;
                            modifier4 = modifier2;
                            c28655q3.m87175r();
                            unitSystem = state.getUnitSystem();
                            unitSystem2 = UnitSystem.IMPERIAL;
                            c23016z = C23016z.f90757a;
                            C28676v0 c28676v0 = C28635l.f115821a;
                            if (unitSystem == unitSystem2) {
                                c28655q3.m87150e0(-758209338);
                                zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                                objM87133R3 = c28655q3.m87133R();
                                if (zM87153g2 || objM87133R3 == c28676v0) {
                                    objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                                    c28655q3.m87172p0(objM87133R3);
                                }
                                List list = (List) objM87133R3;
                                int iM30912a = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                                i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                                int i29 = iM30912a - state.getInchesRange().f71133w;
                                if (i26 < 0) {
                                    i26 = 0;
                                }
                                int iM36284n = AbstractC12889b.m36284n(i29, 0, i26);
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                                boolean z18 = z15;
                                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier4);
                                InterfaceC0221l.f734a.getClass();
                                c0213j2 = C0217k.f724b;
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(c0213j2);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                                c0209i2 = C0217k.f732j;
                                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                                if ((i15 & 112) == 32) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R4 = c28655q3.m87133R();
                                if (z17 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                                    c28655q3.m87172p0(objM87133R4);
                                }
                                Function1 function1 = (Function1) objM87133R4;
                                int i34 = i15 << 3;
                                z15 = z18;
                                AbstractC34504e.m109045j(c23016z, list, iM36284n, c2886a3, f16, 0, z15, null, false, false, null, function1, c28655q3, 6 | ((i15 >> 3) & 7168) | (i34 & 57344) | (i34 & 3670016), 0, 976);
                                c28655q2 = c28655q3;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q3;
                                c28655q2.m87150e0(-757184447);
                                zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                                objM87133R = c28655q2.m87133R();
                                if (zM87153g || objM87133R == c28676v0) {
                                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                    c28655q2.m87172p0(objM87133R);
                                }
                                List list2 = (List) objM87133R;
                                i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                                int circumferenceInCentimeters = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                                if (i24 < 0) {
                                    i24 = 0;
                                }
                                int iM36284n2 = AbstractC12889b.m36284n(circumferenceInCentimeters, 0, i24);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                                i25 = i15;
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier4);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                                if ((i25 & 112) == 32) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z16 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                int i35 = i25 << 3;
                                AbstractC34504e.m109045j(c23016z, list2, iM36284n2, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i35 & 57344) | (i35 & 3670016), 0, 976);
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            modifier3 = modifier4;
                            c28655q = c28655q2;
                            c2886a2 = c2886a3;
                            f15 = f16;
                            z14 = z15;
                        } else {
                            c28655q3.m87138X();
                            if ((i14 & 16) != 0) {
                                i15 &= -57345;
                            }
                        }
                        z15 = z4;
                        f16 = f14;
                        c2886a3 = n13;
                        modifier4 = modifier2;
                        c28655q3.m87175r();
                        unitSystem = state.getUnitSystem();
                        unitSystem2 = UnitSystem.IMPERIAL;
                        c23016z = C23016z.f90757a;
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (unitSystem == unitSystem2) {
                            c28655q3.m87150e0(-758209338);
                            zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                            objM87133R3 = c28655q3.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                                c28655q3.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                                c28655q3.m87172p0(objM87133R3);
                            }
                            List list3 = (List) objM87133R3;
                            int iM30912a2 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                            i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                            int i210 = iM30912a2 - state.getInchesRange().f71133w;
                            if (i26 < 0) {
                                i26 = 0;
                            }
                            int iM36284n3 = AbstractC12889b.m36284n(i210, 0, i26);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                            boolean z19 = z15;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifier4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i2 = C0217k.f732j;
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                            if ((i15 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            if (z17) {
                                objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                                c28655q3.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            Function1 function2 = (Function1) objM87133R4;
                            int i36 = i15 << 3;
                            z15 = z19;
                            AbstractC34504e.m109045j(c23016z, list3, iM36284n3, c2886a3, f16, 0, z15, null, false, false, null, function2, c28655q3, 6 | ((i15 >> 3) & 7168) | (i36 & 57344) | (i36 & 3670016), 0, 976);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q3;
                            c28655q2.m87150e0(-757184447);
                            zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                            objM87133R = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                                c28655q2.m87172p0(objM87133R);
                            }
                            List list4 = (List) objM87133R;
                            i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                            int circumferenceInCentimeters2 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                            if (i24 < 0) {
                                i24 = 0;
                            }
                            int iM36284n4 = AbstractC12889b.m36284n(circumferenceInCentimeters2, 0, i24);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            i25 = i15;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifier4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                            if ((i25 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z16) {
                                objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            int i37 = i25 << 3;
                            AbstractC34504e.m109045j(c23016z, list4, iM36284n4, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i37 & 57344) | (i37 & 3670016), 0, 976);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        modifier3 = modifier4;
                        c28655q = c28655q2;
                        c2886a2 = c2886a3;
                        f15 = f16;
                        z14 = z15;
                    } else {
                        c28655q3.m87138X();
                        c2886a2 = n13;
                        c28655q = c28655q3;
                        modifier3 = modifier2;
                        f15 = f14;
                        z14 = z4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    } else {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    }
                    c2886a3 = n13;
                    modifier4 = modifier2;
                    c28655q3.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q3.m87150e0(-758209338);
                        zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        }
                        List list5 = (List) objM87133R3;
                        int iM30912a3 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                        i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                        int i211 = iM30912a3 - state.getInchesRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n5 = AbstractC12889b.m36284n(i211, 0, i26);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                        boolean z110 = z15;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z17) {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function3 = (Function1) objM87133R4;
                        int i38 = i15 << 3;
                        z15 = z110;
                        AbstractC34504e.m109045j(c23016z, list5, iM36284n5, c2886a3, f16, 0, z15, null, false, false, null, function3, c28655q3, 6 | ((i15 >> 3) & 7168) | (i38 & 57344) | (i38 & 3670016), 0, 976);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q3;
                        c28655q2.m87150e0(-757184447);
                        zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        }
                        List list6 = (List) objM87133R;
                        i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int circumferenceInCentimeters3 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        int iM36284n6 = AbstractC12889b.m36284n(circumferenceInCentimeters3, 0, i24);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        i25 = i15;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                        if ((i25 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z16) {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        int i39 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list6, iM36284n6, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i39 & 57344) | (i39 & 3670016), 0, 976);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier4;
                    c28655q = c28655q2;
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z14 = z15;
                } else {
                    c28655q3.m87138X();
                    c2886a2 = n13;
                    c28655q = c28655q3;
                    modifier3 = modifier2;
                    f15 = f14;
                    z14 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
                }
            }
            i15 |= 3072;
            f14 = f13;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q3.m87153g(n13);
                    } else {
                        zM87157i = c28655q3.m87157i(n13);
                    }
                    if (zM87157i) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q3.m87155h(z4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    } else {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    }
                    c2886a3 = n13;
                    modifier4 = modifier2;
                    c28655q3.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    C28676v0 c28676v3 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q3.m87150e0(-758209338);
                        zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        }
                        List list7 = (List) objM87133R3;
                        int iM30912a4 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                        i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                        int i212 = iM30912a4 - state.getInchesRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n7 = AbstractC12889b.m36284n(i212, 0, i26);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                        boolean z111 = z15;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z17) {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function4 = (Function1) objM87133R4;
                        int i310 = i15 << 3;
                        z15 = z111;
                        AbstractC34504e.m109045j(c23016z, list7, iM36284n7, c2886a3, f16, 0, z15, null, false, false, null, function4, c28655q3, 6 | ((i15 >> 3) & 7168) | (i310 & 57344) | (i310 & 3670016), 0, 976);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q3;
                        c28655q2.m87150e0(-757184447);
                        zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        }
                        List list8 = (List) objM87133R;
                        i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int circumferenceInCentimeters4 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        int iM36284n8 = AbstractC12889b.m36284n(circumferenceInCentimeters4, 0, i24);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        i25 = i15;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                        if ((i25 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z16) {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        int i311 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list8, iM36284n8, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i311 & 57344) | (i311 & 3670016), 0, 976);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier4;
                    c28655q = c28655q2;
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z14 = z15;
                } else {
                    c28655q3.m87138X();
                    c2886a2 = n13;
                    c28655q = c28655q3;
                    modifier3 = modifier2;
                    f15 = f14;
                    z14 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                } else {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                }
                c2886a3 = n13;
                modifier4 = modifier2;
                c28655q3.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                C28676v0 c28676v4 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q3.m87150e0(-758209338);
                    zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    }
                    List list9 = (List) objM87133R3;
                    int iM30912a5 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                    i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                    int i213 = iM30912a5 - state.getInchesRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n9 = AbstractC12889b.m36284n(i213, 0, i26);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                    boolean z112 = z15;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m9);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N9);
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function5 = (Function1) objM87133R4;
                    int i312 = i15 << 3;
                    z15 = z112;
                    AbstractC34504e.m109045j(c23016z, list9, iM36284n9, c2886a3, f16, 0, z15, null, false, false, null, function5, c28655q3, 6 | ((i15 >> 3) & 7168) | (i312 & 57344) | (i312 & 3670016), 0, 976);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-757184447);
                    zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    }
                    List list10 = (List) objM87133R;
                    i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int circumferenceInCentimeters5 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i24 < 0) {
                        i24 = 0;
                    }
                    int iM36284n10 = AbstractC12889b.m36284n(circumferenceInCentimeters5, 0, i24);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    i25 = i15;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                    if ((i25 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i313 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list10, iM36284n10, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i313 & 57344) | (i313 & 3670016), 0, 976);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier4;
                c28655q = c28655q2;
                c2886a2 = c2886a3;
                f15 = f16;
                z14 = z15;
            } else {
                c28655q3.m87138X();
                c2886a2 = n13;
                c28655q = c28655q3;
                modifier3 = modifier2;
                f15 = f14;
                z14 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                if (c28655q3.m87147d(f14)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q3.m87153g(n13);
                    } else {
                        zM87157i = c28655q3.m87157i(n13);
                    }
                    if (zM87157i) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i15 |= i27;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q3.m87155h(z4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    } else {
                        if (i28 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            f14 = 60;
                        }
                        if ((i14 & 16) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                            i15 &= -57345;
                        }
                        if (i18 != 0) {
                            f16 = f14;
                            z15 = true;
                        } else {
                            z15 = z4;
                            f16 = f14;
                        }
                    }
                    c2886a3 = n13;
                    modifier4 = modifier2;
                    c28655q3.m87175r();
                    unitSystem = state.getUnitSystem();
                    unitSystem2 = UnitSystem.IMPERIAL;
                    c23016z = C23016z.f90757a;
                    C28676v0 c28676v5 = C28635l.f115821a;
                    if (unitSystem == unitSystem2) {
                        c28655q3.m87150e0(-758209338);
                        zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                            c28655q3.m87172p0(objM87133R3);
                        }
                        List list11 = (List) objM87133R3;
                        int iM30912a6 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                        i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                        int i214 = iM30912a6 - state.getInchesRange().f71133w;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iM36284n11 = AbstractC12889b.m36284n(i214, 0, i26);
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                        boolean z113 = z15;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11);
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z17) {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function6 = (Function1) objM87133R4;
                        int i314 = i15 << 3;
                        z15 = z113;
                        AbstractC34504e.m109045j(c23016z, list11, iM36284n11, c2886a3, f16, 0, z15, null, false, false, null, function6, c28655q3, 6 | ((i15 >> 3) & 7168) | (i314 & 57344) | (i314 & 3670016), 0, 976);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q3;
                        c28655q2.m87150e0(-757184447);
                        zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                            c28655q2.m87172p0(objM87133R);
                        }
                        List list12 = (List) objM87133R;
                        i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                        int circumferenceInCentimeters6 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        int iM36284n12 = AbstractC12889b.m36284n(circumferenceInCentimeters6, 0, i24);
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        i25 = i15;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a12);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                        if ((i25 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z16) {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        int i315 = i25 << 3;
                        AbstractC34504e.m109045j(c23016z, list12, iM36284n12, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i315 & 57344) | (i315 & 3670016), 0, 976);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier4;
                    c28655q = c28655q2;
                    c2886a2 = c2886a3;
                    f15 = f16;
                    z14 = z15;
                } else {
                    c28655q3.m87138X();
                    c2886a2 = n13;
                    c28655q = c28655q3;
                    modifier3 = modifier2;
                    f15 = f14;
                    z14 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                } else {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                }
                c2886a3 = n13;
                modifier4 = modifier2;
                c28655q3.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                C28676v0 c28676v6 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q3.m87150e0(-758209338);
                    zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    }
                    List list13 = (List) objM87133R3;
                    int iM30912a7 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                    i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                    int i215 = iM30912a7 - state.getInchesRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n13 = AbstractC12889b.m36284n(i215, 0, i26);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                    boolean z114 = z15;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N13);
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function7 = (Function1) objM87133R4;
                    int i316 = i15 << 3;
                    z15 = z114;
                    AbstractC34504e.m109045j(c23016z, list13, iM36284n13, c2886a3, f16, 0, z15, null, false, false, null, function7, c28655q3, 6 | ((i15 >> 3) & 7168) | (i316 & 57344) | (i316 & 3670016), 0, 976);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-757184447);
                    zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    }
                    List list14 = (List) objM87133R;
                    i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int circumferenceInCentimeters7 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i24 < 0) {
                        i24 = 0;
                    }
                    int iM36284n14 = AbstractC12889b.m36284n(circumferenceInCentimeters7, 0, i24);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    i25 = i15;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                    if ((i25 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i317 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list14, iM36284n14, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i317 & 57344) | (i317 & 3670016), 0, 976);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier4;
                c28655q = c28655q2;
                c2886a2 = c2886a3;
                f15 = f16;
                z14 = z15;
            } else {
                c28655q3.m87138X();
                c2886a2 = n13;
                c28655q = c28655q3;
                modifier3 = modifier2;
                f15 = f14;
                z14 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q3.m87153g(n13);
                } else {
                    zM87157i = c28655q3.m87157i(n13);
                }
                if (zM87157i) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i15 |= i27;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q3.m87155h(z4)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                } else {
                    if (i28 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        f14 = 60;
                    }
                    if ((i14 & 16) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                        i15 &= -57345;
                    }
                    if (i18 != 0) {
                        f16 = f14;
                        z15 = true;
                    } else {
                        z15 = z4;
                        f16 = f14;
                    }
                }
                c2886a3 = n13;
                modifier4 = modifier2;
                c28655q3.m87175r();
                unitSystem = state.getUnitSystem();
                unitSystem2 = UnitSystem.IMPERIAL;
                c23016z = C23016z.f90757a;
                C28676v0 c28676v7 = C28635l.f115821a;
                if (unitSystem == unitSystem2) {
                    c28655q3.m87150e0(-758209338);
                    zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                        c28655q3.m87172p0(objM87133R3);
                    }
                    List list15 = (List) objM87133R3;
                    int iM30912a8 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                    i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                    int i216 = iM30912a8 - state.getInchesRange().f71133w;
                    if (i26 < 0) {
                        i26 = 0;
                    }
                    int iM36284n15 = AbstractC12889b.m36284n(i216, 0, i26);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                    boolean z115 = z15;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N15);
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function8 = (Function1) objM87133R4;
                    int i318 = i15 << 3;
                    z15 = z115;
                    AbstractC34504e.m109045j(c23016z, list15, iM36284n15, c2886a3, f16, 0, z15, null, false, false, null, function8, c28655q3, 6 | ((i15 >> 3) & 7168) | (i318 & 57344) | (i318 & 3670016), 0, 976);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-757184447);
                    zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                        c28655q2.m87172p0(objM87133R);
                    }
                    List list16 = (List) objM87133R;
                    i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                    int circumferenceInCentimeters8 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                    if (i24 < 0) {
                        i24 = 0;
                    }
                    int iM36284n16 = AbstractC12889b.m36284n(circumferenceInCentimeters8, 0, i24);
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    i25 = i15;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a16);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
                    if ((i25 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i319 = i25 << 3;
                    AbstractC34504e.m109045j(c23016z, list16, iM36284n16, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i319 & 57344) | (i319 & 3670016), 0, 976);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier4;
                c28655q = c28655q2;
                c2886a2 = c2886a3;
                f15 = f16;
                z14 = z15;
            } else {
                c28655q3.m87138X();
                c2886a2 = n13;
                c28655q = c28655q3;
                modifier3 = modifier2;
                f15 = f14;
                z14 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z13)) {
            c28655q3.m87140Z();
            if ((i13 & 1) != 0) {
                if (i28 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    f14 = 60;
                }
                if ((i14 & 16) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                    i15 &= -57345;
                }
                if (i18 != 0) {
                    f16 = f14;
                    z15 = true;
                } else {
                    z15 = z4;
                    f16 = f14;
                }
            } else {
                if (i28 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    f14 = 60;
                }
                if ((i14 & 16) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q3, 6).getN7();
                    i15 &= -57345;
                }
                if (i18 != 0) {
                    f16 = f14;
                    z15 = true;
                } else {
                    z15 = z4;
                    f16 = f14;
                }
            }
            c2886a3 = n13;
            modifier4 = modifier2;
            c28655q3.m87175r();
            unitSystem = state.getUnitSystem();
            unitSystem2 = UnitSystem.IMPERIAL;
            c23016z = C23016z.f90757a;
            C28676v0 c28676v8 = C28635l.f115821a;
            if (unitSystem == unitSystem2) {
                c28655q3.m87150e0(-758209338);
                zM87153g2 = c28655q3.m87153g(state.getInchesRange()) | c28655q3.m87153g(state.getInchesLabel());
                objM87133R3 = c28655q3.m87133R();
                if (zM87153g2) {
                    objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getInchesRange()), state.getInchesLabel());
                    c28655q3.m87172p0(objM87133R3);
                }
                List list17 = (List) objM87133R3;
                int iM30912a9 = C11503a.f37005a.m30912a(state.getCircumferenceInCentimeters());
                i26 = state.getInchesRange().f71134x - state.getInchesRange().f71133w;
                int i217 = iM30912a9 - state.getInchesRange().f71133w;
                if (i26 < 0) {
                    i26 = 0;
                }
                int iM36284n17 = AbstractC12889b.m36284n(i217, 0, i26);
                C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                boolean z116 = z15;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a17);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m17);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N17);
                if ((i15 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z17) {
                    objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C29000h(onCircumferenceChanged, 12);
                    c28655q3.m87172p0(objM87133R4);
                }
                Function1 function9 = (Function1) objM87133R4;
                int i3110 = i15 << 3;
                z15 = z116;
                AbstractC34504e.m109045j(c23016z, list17, iM36284n17, c2886a3, f16, 0, z15, null, false, false, null, function9, c28655q3, 6 | ((i15 >> 3) & 7168) | (i3110 & 57344) | (i3110 & 3670016), 0, 976);
                c28655q2 = c28655q3;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            } else {
                c28655q2 = c28655q3;
                c28655q2.m87150e0(-757184447);
                zM87153g = c28655q2.m87153g(state.getCentimetersRange()) | c28655q2.m87153g(state.getCentimetersLabel());
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = C11503a.f37005a.m30918g(AbstractC25265s.m74093D1(state.getCentimetersRange()), state.getCentimetersLabel());
                    c28655q2.m87172p0(objM87133R);
                }
                List list18 = (List) objM87133R;
                i24 = state.getCentimetersRange().f71134x - state.getCentimetersRange().f71133w;
                int circumferenceInCentimeters9 = state.getCircumferenceInCentimeters() - state.getCentimetersRange().f71133w;
                if (i24 < 0) {
                    i24 = 0;
                }
                int iM36284n18 = AbstractC12889b.m36284n(circumferenceInCentimeters9, 0, i24);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                i25 = i15;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m18);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N18);
                if ((i25 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z16) {
                    objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C29000h(onCircumferenceChanged, 13);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i3111 = i25 << 3;
                AbstractC34504e.m109045j(c23016z, list18, iM36284n18, c2886a3, f16, 0, z15, null, false, false, null, (Function1) objM87133R2, c28655q2, 6 | ((i25 >> 3) & 7168) | (i3111 & 57344) | (i3111 & 3670016), 0, 976);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            modifier3 = modifier4;
            c28655q = c28655q2;
            c2886a2 = c2886a3;
            f15 = f16;
            z14 = z15;
        } else {
            c28655q3.m87138X();
            c2886a2 = n13;
            c28655q = c28655q3;
            modifier3 = modifier2;
            f15 = f14;
            z14 = z4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11507e(state, onCircumferenceChanged, modifier3, f15, c2886a2, z14, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m91190e(Function1 function1, String value) {
        AbstractC22676k.m65750j(value, "value");
        C11503a c11503a = C11503a.f37005a;
        function1.invoke(Integer.valueOf(c11503a.m30921j(c11503a.m30929r(value))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m91191f(Function1 function1, String value) {
        AbstractC22676k.m65750j(value, "value");
        function1.invoke(Integer.valueOf(C11503a.f37005a.m30929r(value)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91192g(C29746b c29746b, Function1 function1, Modifier modifier, float f13, C2886a c2886a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m91189d(c29746b, function1, modifier, f13, c2886a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
