package v01;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import java.util.Iterator;
import java.util.List;
import kotlin.C2026r;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p739ui0.C35015q;
import p745y81.EnumC39333f;
import pp1.C29433f;
import q12.C29802c;
import qx0.C30745a;
import qz0.AbstractC30795n;
import t80.C33592b;
import uf0.C34904e;
import uk2.C35051a;
import v41.AbstractC35662e;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001am\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lv01/a;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "q", "(Lv01/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedPeriod", "selectedSort", "onPeriodSelect", "onSortSelect", "B", "(Lv01/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "", "Lv01/d;", "options", "selectedValue", "onSelect", "I", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35501c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m112566A(C35499a c35499a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112595q(c35499a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0172  */
    /* JADX WARN: Code duplicated, block: B:110:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x0193  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0205  */
    /* JADX WARN: Code duplicated, block: B:118:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x0210  */
    /* JADX WARN: Code duplicated, block: B:123:0x0216  */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x023a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0253  */
    /* JADX WARN: Code duplicated, block: B:142:0x0268  */
    /* JADX WARN: Code duplicated, block: B:145:0x0276  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0 A[PHI: r0 r2 r4 r8 r10
      0x00e0: PHI (r0v27 int) = (r0v15 int), (r0v28 int), (r0v29 int) binds: [B:99:0x0129, B:80:0x00dc, B:81:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r2v8 java.lang.String) = (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:99:0x0129, B:80:0x00dc, B:81:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r4v10 java.lang.String) = (r4v5 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:99:0x0129, B:80:0x00dc, B:81:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r8v13 kotlin.jvm.functions.Function1) = (r8v4 kotlin.jvm.functions.Function1), (r8v2 kotlin.jvm.functions.Function1), (r8v2 kotlin.jvm.functions.Function1) binds: [B:99:0x0129, B:80:0x00dc, B:81:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r10v15 kotlin.jvm.functions.Function1) = (r10v3 kotlin.jvm.functions.Function1), (r10v2 kotlin.jvm.functions.Function1), (r10v2 kotlin.jvm.functions.Function1) binds: [B:99:0x0129, B:80:0x00dc, B:81:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX INFO: renamed from: B */
    public static final void m112567B(C35499a state, String str, String str2, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        String strM112621a;
        String strM112621a2;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        int i19;
        boolean z4;
        Function1 function6;
        String str3;
        Function1 function7;
        Function1 function8;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        Object objM87133R;
        Function1 function9;
        Object objM87133R2;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        C25306o c25306oM112561a;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1318336990);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                strM112621a = str;
                int i26 = c28655q.m87153g(strM112621a) ? 32 : 16;
                i15 |= i26;
            } else {
                strM112621a = str;
            }
            i15 |= i26;
        } else {
            strM112621a = str;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                strM112621a2 = str2;
                int i27 = c28655q.m87153g(strM112621a2) ? 256 : 128;
                i15 |= i27;
            } else {
                strM112621a2 = str2;
            }
            i15 |= i27;
        } else {
            strM112621a2 = str2;
        }
        int i28 = i14 & 8;
        if (i28 == 0) {
            if ((i13 & 3072) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        i24 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0 || c28655q.m87118C()) {
                            if ((i14 & 2) != 0) {
                                strM112621a = AbstractC35506h.m112621a(state.m112562b());
                                i15 &= -113;
                            }
                            if ((i14 & 4) != 0) {
                                strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                                i15 &= -897;
                            }
                            if (i28 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35051a(25);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function4 = (Function1) objM87133R3;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35051a(26);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35051a(27);
                                    c28655q.m87172p0(objM87133R);
                                }
                                function9 = (Function1) objM87133R;
                            }
                            c28655q.m87175r();
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            Function1 function10 = function5;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                            Function1 function11 = function4;
                            m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function11, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                            float f13 = 5 * 8;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                            i25 = i15 & 896;
                            m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function10, c28655q, ((i15 >> 3) & 7168) | i25);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                            c25306oM112561a = state.getCta();
                            if (c25306oM112561a != null) {
                                c28655q.m87150e0(1571063976);
                                C30745a c30745a = new C30745a(22);
                                if ((458752 & i15) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                                objM87133R4 = c28655q.m87133R();
                                if (z15 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                z13 = true;
                                AbstractC25303l.m74290q(c25306oM112561a, null, c30745a, (Function1) objM87133R4, c28655q, 0, 2);
                                c28655q.m87173q(false);
                            } else {
                                z13 = true;
                                c28655q.m87150e0(1571346510);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z13);
                            String str4 = strM112621a2;
                            function7 = function11;
                            str3 = str4;
                            function6 = function9;
                            function8 = function10;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 2) != 0) {
                                i15 &= -113;
                            }
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                        }
                        function9 = function3;
                        c28655q.m87175r();
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        Function1 function12 = function5;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
                        Function1 function13 = function4;
                        m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function13, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                        float f14 = 5 * 8;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                        i25 = i15 & 896;
                        m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function12, c28655q, ((i15 >> 3) & 7168) | i25);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                        c25306oM112561a = state.getCta();
                        if (c25306oM112561a != null) {
                            c28655q.m87150e0(1571063976);
                            C30745a c30745a2 = new C30745a(22);
                            if ((458752 & i15) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                            objM87133R4 = c28655q.m87133R();
                            if (z15) {
                                objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                                c28655q.m87172p0(objM87133R4);
                            }
                            z13 = true;
                            AbstractC25303l.m74290q(c25306oM112561a, null, c30745a2, (Function1) objM87133R4, c28655q, 0, 2);
                            c28655q.m87173q(false);
                        } else {
                            z13 = true;
                            c28655q.m87150e0(1571346510);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z13);
                        String str5 = strM112621a2;
                        function7 = function13;
                        str3 = str5;
                        function6 = function9;
                        function8 = function12;
                    } else {
                        c28655q.m87138X();
                        function6 = function3;
                        str3 = strM112621a2;
                        function7 = function4;
                        function8 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    }
                    c28655q.m87175r();
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Function1 function14 = function5;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
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
                    Function1 function15 = function4;
                    m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function15, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                    float f15 = 5 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t3));
                    i25 = i15 & 896;
                    m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function14, c28655q, ((i15 >> 3) & 7168) | i25);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t3));
                    c25306oM112561a = state.getCta();
                    if (c25306oM112561a != null) {
                        c28655q.m87150e0(1571063976);
                        C30745a c30745a3 = new C30745a(22);
                        if ((458752 & i15) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        }
                        z13 = true;
                        AbstractC25303l.m74290q(c25306oM112561a, null, c30745a3, (Function1) objM87133R4, c28655q, 0, 2);
                        c28655q.m87173q(false);
                    } else {
                        z13 = true;
                        c28655q.m87150e0(1571346510);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    String str6 = strM112621a2;
                    function7 = function15;
                    str3 = str6;
                    function6 = function9;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function6 = function3;
                    str3 = strM112621a2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
                }
            }
            i15 |= 24576;
            function5 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    }
                    c28655q.m87175r();
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Function1 function16 = function5;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
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
                    Function1 function17 = function4;
                    m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function17, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                    float f16 = 5 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t4));
                    i25 = i15 & 896;
                    m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function16, c28655q, ((i15 >> 3) & 7168) | i25);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t4));
                    c25306oM112561a = state.getCta();
                    if (c25306oM112561a != null) {
                        c28655q.m87150e0(1571063976);
                        C30745a c30745a4 = new C30745a(22);
                        if ((458752 & i15) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        }
                        z13 = true;
                        AbstractC25303l.m74290q(c25306oM112561a, null, c30745a4, (Function1) objM87133R4, c28655q, 0, 2);
                        c28655q.m87173q(false);
                    } else {
                        z13 = true;
                        c28655q.m87150e0(1571346510);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    String str7 = strM112621a2;
                    function7 = function17;
                    str3 = str7;
                    function6 = function9;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    function6 = function3;
                    str3 = strM112621a2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                }
                c28655q.m87175r();
                C2314t c2314t5 = C2314t.f9131w;
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t5);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Function1 function18 = function5;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                Function1 function19 = function4;
                m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function19, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                float f17 = 5 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t5));
                i25 = i15 & 896;
                m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function18, c28655q, ((i15 >> 3) & 7168) | i25);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t5));
                c25306oM112561a = state.getCta();
                if (c25306oM112561a != null) {
                    c28655q.m87150e0(1571063976);
                    C30745a c30745a5 = new C30745a(22);
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                    objM87133R4 = c28655q.m87133R();
                    if (z15) {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    }
                    z13 = true;
                    AbstractC25303l.m74290q(c25306oM112561a, null, c30745a5, (Function1) objM87133R4, c28655q, 0, 2);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(1571346510);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                String str8 = strM112621a2;
                function7 = function19;
                str3 = str8;
                function6 = function9;
                function8 = function18;
            } else {
                c28655q.m87138X();
                function6 = function3;
                str3 = strM112621a2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            strM112621a = AbstractC35506h.m112621a(state.m112562b());
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                            i15 &= -897;
                        }
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35051a(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35051a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35051a(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            function9 = (Function1) objM87133R;
                        } else {
                            function9 = function3;
                        }
                    }
                    c28655q.m87175r();
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Function1 function110 = function5;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    Function1 function111 = function4;
                    m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function111, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                    float f18 = 5 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t6));
                    i25 = i15 & 896;
                    m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function110, c28655q, ((i15 >> 3) & 7168) | i25);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t6));
                    c25306oM112561a = state.getCta();
                    if (c25306oM112561a != null) {
                        c28655q.m87150e0(1571063976);
                        C30745a c30745a6 = new C30745a(22);
                        if ((458752 & i15) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                            c28655q.m87172p0(objM87133R4);
                        }
                        z13 = true;
                        AbstractC25303l.m74290q(c25306oM112561a, null, c30745a6, (Function1) objM87133R4, c28655q, 0, 2);
                        c28655q.m87173q(false);
                    } else {
                        z13 = true;
                        c28655q.m87150e0(1571346510);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    String str9 = strM112621a2;
                    function7 = function111;
                    str3 = str9;
                    function6 = function9;
                    function8 = function110;
                } else {
                    c28655q.m87138X();
                    function6 = function3;
                    str3 = strM112621a2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                }
                c28655q.m87175r();
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t7);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Function1 function112 = function5;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                Function1 function113 = function4;
                m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function113, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                float f19 = 5 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t7));
                i25 = i15 & 896;
                m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function112, c28655q, ((i15 >> 3) & 7168) | i25);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t7));
                c25306oM112561a = state.getCta();
                if (c25306oM112561a != null) {
                    c28655q.m87150e0(1571063976);
                    C30745a c30745a7 = new C30745a(22);
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                    objM87133R4 = c28655q.m87133R();
                    if (z15) {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    }
                    z13 = true;
                    AbstractC25303l.m74290q(c25306oM112561a, null, c30745a7, (Function1) objM87133R4, c28655q, 0, 2);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(1571346510);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                String str10 = strM112621a2;
                function7 = function113;
                str3 = str10;
                function6 = function9;
                function8 = function112;
            } else {
                c28655q.m87138X();
                function6 = function3;
                str3 = strM112621a2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
            }
        }
        i15 |= 24576;
        function5 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function3)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        strM112621a = AbstractC35506h.m112621a(state.m112562b());
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                        i15 &= -897;
                    }
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35051a(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35051a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35051a(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        function9 = (Function1) objM87133R;
                    } else {
                        function9 = function3;
                    }
                }
                c28655q.m87175r();
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t8);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Function1 function114 = function5;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                Function1 function115 = function4;
                m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function115, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
                float f110 = 5 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t8));
                i25 = i15 & 896;
                m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function114, c28655q, ((i15 >> 3) & 7168) | i25);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t8));
                c25306oM112561a = state.getCta();
                if (c25306oM112561a != null) {
                    c28655q.m87150e0(1571063976);
                    C30745a c30745a8 = new C30745a(22);
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                    objM87133R4 = c28655q.m87133R();
                    if (z15) {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                        c28655q.m87172p0(objM87133R4);
                    }
                    z13 = true;
                    AbstractC25303l.m74290q(c25306oM112561a, null, c30745a8, (Function1) objM87133R4, c28655q, 0, 2);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(1571346510);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                String str11 = strM112621a2;
                function7 = function115;
                str3 = str11;
                function6 = function9;
                function8 = function114;
            } else {
                c28655q.m87138X();
                function6 = function3;
                str3 = strM112621a2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                if ((i14 & 2) != 0) {
                    strM112621a = AbstractC35506h.m112621a(state.m112562b());
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                    i15 &= -897;
                }
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35051a(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35051a(26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35051a(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    function9 = (Function1) objM87133R;
                } else {
                    function9 = function3;
                }
            } else {
                if ((i14 & 2) != 0) {
                    strM112621a = AbstractC35506h.m112621a(state.m112562b());
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    strM112621a2 = AbstractC35506h.m112621a(state.m112564d());
                    i15 &= -897;
                }
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35051a(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35051a(26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35051a(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    function9 = (Function1) objM87133R;
                } else {
                    function9 = function3;
                }
            }
            c28655q.m87175r();
            C2314t c2314t9 = C2314t.f9131w;
            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t9);
            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            Function1 function116 = function5;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
            Function1 function117 = function4;
            m112574I(state.getFiltersTitle(), state.m112562b(), strM112621a, function117, c28655q, ((i15 << 3) & 896) | (i15 & 7168));
            float f111 = 5 * 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t9));
            i25 = i15 & 896;
            m112574I(state.getSortsTitle(), state.m112564d(), strM112621a2, function116, c28655q, ((i15 >> 3) & 7168) | i25);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t9));
            c25306oM112561a = state.getCta();
            if (c25306oM112561a != null) {
                c28655q.m87150e0(1571063976);
                C30745a c30745a9 = new C30745a(22);
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = (((i25 ^ 384) <= 256 && c28655q.m87153g(strM112621a2)) || (i15 & 384) == 256) | z14 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87153g(strM112621a)) || (i15 & 48) == 32);
                objM87133R4 = c28655q.m87133R();
                if (z15) {
                    objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C29433f(1, strM112621a, strM112621a2, function9);
                    c28655q.m87172p0(objM87133R4);
                }
                z13 = true;
                AbstractC25303l.m74290q(c25306oM112561a, null, c30745a9, (Function1) objM87133R4, c28655q, 0, 2);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(1571346510);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            String str12 = strM112621a2;
            function7 = function117;
            str3 = str12;
            function6 = function9;
            function8 = function116;
        } else {
            c28655q.m87138X();
            function6 = function3;
            str3 = strM112621a2;
            function7 = function4;
            function8 = function5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(state, strM112621a, str3, function7, function8, function6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m112568C(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m112569D(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m112570E(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Modifier m112571F(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1519977407);
        Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), EnumC22935a1.f90537w);
        c28655q.m87173q(false);
        return modifierM3388j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m112572G(Function1 function1, String str, String str2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC35503e.a(str, str2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m112573H(C35499a c35499a, String str, String str2, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m112567B(c35499a, str, str2, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final void m112574I(final TextResource textResource, final List<C35502d> list, final String str, final Function1 function1, Composer composer, final int i13) {
        int i14;
        List<C35502d> list2;
        String str2;
        Function1 function2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1478588977);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            if (list.isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i15 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: v01.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i15) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35501c.m112575J(textResource, list, str, function1, i13, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC35501c.m112578M(textResource, list, str, function1, i13, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i14 & 14);
                C38072d c38072d = C38072d.f163053a;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getT3(), null, c28655q, 0, 0, 196602);
                float f13 = 8;
                AbstractC11266d.m30469w((float) 2.5d, f13, C2314t.f9131w, c28655q);
                float f14 = 1 * f13;
                list2 = list;
                str2 = str;
                function2 = function1;
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, AbstractC37817c.m121344e(-1079319380, c28655q, new C26949h(str2, list2, function2)), c28655q, 1573296, 57);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        list2 = list;
        str2 = str;
        function2 = function1;
        c28655q = c28655q2;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i16 = 1;
            final List<C35502d> list3 = list2;
            final String str3 = str2;
            final Function1 function3 = function2;
            interfaceC4351m = new InterfaceC4351m() { // from class: v01.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35501c.m112575J(textResource, list3, str3, function3, i13, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC35501c.m112578M(textResource, list3, str3, function3, i13, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m112575J(TextResource textResource, List list, String str, Function1 function1, int i13, Composer composer, int i14) {
        m112574I(textResource, list, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m112576K(List list, String str, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C35502d c35502d = (C35502d) it.next();
                boolean zM65745e = AbstractC22676k.m65745e(c35502d.getValue(), str);
                float f13 = 8;
                C17750h1 c17750h1 = new C17750h1(c35502d.getTitle(), null, zM65745e ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_10, null, zM65745e ? EnumC39333f.BRAND_BLACK : EnumC39333f.BRAND_WHITE, null, null, EnumC17775o1.CONTEXT_CARD, false, AbstractC33253j.m105489e(3 * 4), 1 * f13, ((float) 1.5d) * f13, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4190570, null);
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c35502d);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35015q(6, function1, c35502d);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC17746g1.m50872h(c17750h1, null, (InterfaceC4339a) objM87133R, c28655q, 0, 2);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m112577L(Function1 function1, C35502d c35502d) {
        function1.invoke(c35502d.getValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m112578M(TextResource textResource, List list, String str, Function1 function1, int i13, Composer composer, int i14) {
        m112574I(textResource, list, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static final void m112595q(C35499a state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87153g2;
        Object objM87133R2;
        boolean z13;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1167794959);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35051a(28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q, 2);
                zM87153g = c28655q.m87153g(state.m112562b());
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112562b()));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87153g2 = c28655q.m87153g(state.m112564d());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112564d()));
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                z13 = (i15 & 112) == 32;
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C34904e(function4, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function5 = function4;
                AbstractC35662e.m112943g(null, c23196w3M67125g, c35666g, null, null, null, (InterfaceC4339a) objM87133R3, null, false, null, null, false, AbstractC37817c.m121344e(-1934109749, c28655q, new C2026r((Object) state, (Object) interfaceC28601c1, (Object) interfaceC28601c2, function5, 25)), c28655q, 0, 384, 4025);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(state, i13, function3, i14, 12);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C35051a(28);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            C23196w3 c23196w3M67125g2 = AbstractC23141n2.m67125g(6, null, c28655q, 2);
            zM87153g = c28655q.m87153g(state.m112562b());
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112562b()));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112562b()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            zM87153g2 = c28655q.m87153g(state.m112564d());
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112564d()));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC28683x.m87272z(AbstractC35506h.m112621a(state.m112564d()));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            C35666g c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            if ((i15 & 112) == 32) {
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new C34904e(function4, 6);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C34904e(function4, 6);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function6 = function4;
            AbstractC35662e.m112943g(null, c23196w3M67125g2, c35666g2, null, null, null, (InterfaceC4339a) objM87133R3, null, false, null, null, false, AbstractC37817c.m121344e(-1934109749, c28655q, new C2026r((Object) state, (Object) interfaceC28601c3, (Object) interfaceC28601c4, function6, 25)), c28655q, 0, 384, 4025);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(state, i13, function3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112596r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final String m112597s(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m112598t(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: u */
    private static final String m112599u(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m112600v(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112601w(Function1 function1) {
        function1.invoke(AbstractC35503e.c.f151102a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112602x(C35499a c35499a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM112597s = m112597s(interfaceC28601c1);
            String strM112599u = m112599u(interfaceC28601c2);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C29802c(19, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29802c(20, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            }
            m112567B(c35499a, strM112597s, strM112599u, function2, (Function1) objM87133R2, function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m112603y(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m112598t(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m112604z(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m112600v(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }
}
