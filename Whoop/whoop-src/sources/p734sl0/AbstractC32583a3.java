package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import h00.C16506i;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.C19254a;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import nl0.AbstractC26802d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc2.C32375n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sl0.a3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "conversationId", "", "suggestions", "", "messageCount", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "d", "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32583a3 {
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x019a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x022d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0238  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m101640d(String conversationId, List<String> suggestions, int i13, Function1 function1, Composer composer, int i14, int i15) {
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        int i16;
        int i17;
        String str;
        int i18;
        ArrayList arrayList2;
        String str2;
        C28676v0 c28676v1;
        C2314t c2314t2;
        int i19;
        C28655q c28655q2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object objM87133R;
        Function1 function4;
        Object objM87133R2;
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(217972821);
        int i29 = (i14 & 6) == 0 ? (c28655q3.m87153g(conversationId) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i29 |= c28655q3.m87157i(suggestions) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i29 |= c28655q3.m87149e(i13) ? 256 : 128;
        }
        int i34 = i15 & 8;
        if (i34 == 0) {
            if ((i14 & 3072) == 0) {
                function2 = function1;
                i29 |= c28655q3.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i29 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i29 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32375n(29);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                float f14 = 8;
                C2314t c2314t3 = C2314t.f9131w;
                c2314t = c2314t3;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t3, 0.0f, ((float) 1.5d) * f14, 0.0f, 0.0f, 13), "VerticalSuggestions");
                f13 = 1;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14 * f13), C2299e.f9110M, c28655q3, 6);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                c28655q3.m87150e0(-1062467602);
                List<String> list = suggestions;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                i16 = 0;
                for (Object obj : list) {
                    i17 = i16 + 1;
                    if (i16 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    str = (String) obj;
                    if (i16 == 0) {
                        c28655q3.m87150e0(-2138700114);
                        C28655q c28655q4 = c28655q3;
                        i24 = 0;
                        arrayList2 = arrayList;
                        str2 = str;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        i18 = i16;
                        i19 = 2048;
                        AbstractC17755i2.m50938j(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, null, null, 0L, 0L, null, c28655q4, 6, 254);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        i18 = i16;
                        arrayList2 = arrayList;
                        str2 = str;
                        c28676v1 = c28676v0;
                        c2314t2 = c2314t;
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2 = c28655q3;
                        i24 = 0;
                        c28655q2.m87150e0(-2138526173);
                        c28655q2.m87173q(false);
                    }
                    if ((i29 & 7168) == i19) {
                        i25 = 1;
                    } else {
                        i25 = i24;
                    }
                    int i35 = (c28655q2.m87149e(i18) ? 1 : 0) | i25;
                    if ((i29 & 896) == 256) {
                        i26 = 1;
                    } else {
                        i26 = i24;
                    }
                    int i36 = i35 | i26;
                    if ((i29 & 14) == 4) {
                        i27 = 1;
                    } else {
                        i27 = i24;
                    }
                    i28 = i36 | i27;
                    objM87133R = c28655q2.m87133R();
                    if (i28 == 0 || objM87133R == c28676v1) {
                        function4 = function2;
                        objM87133R = new C19254a(conversationId, i18, i13, function4);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        function4 = function2;
                    }
                    AbstractC32626j1.m101896f(str2, (Function1) objM87133R, c28655q2, i24, i24);
                    C2314t c2314t4 = c2314t2;
                    Function1 function5 = function4;
                    C28655q c28655q5 = c28655q2;
                    AbstractC17755i2.m50938j(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t4)), null, null, null, null, 0L, 0L, null, c28655q5, 6, 254);
                    arrayList = arrayList2;
                    arrayList.add(C23454a0.f92919a);
                    c28676v0 = c28676v1;
                    c28655q3 = c28655q5;
                    i16 = i17;
                    function2 = function5;
                    c2314t = c2314t4;
                    f13 = f13;
                }
                c28655q = c28655q3;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function3 = function2;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16506i(conversationId, suggestions, i13, function3, i14, i15);
            }
        }
        i29 |= 3072;
        function2 = function1;
        if ((i29 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i29 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32375n(29);
                    c28655q3.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            float f15 = 8;
            C2314t c2314t5 = C2314t.f9131w;
            c2314t = c2314t5;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t5, 0.0f, ((float) 1.5d) * f15, 0.0f, 0.0f, 13), "VerticalSuggestions");
            f13 = 1;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15 * f13), C2299e.f9110M, c28655q3, 6);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            c28655q3.m87150e0(-1062467602);
            List<String> list2 = suggestions;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            i16 = 0;
            while (r20.hasNext()) {
                i17 = i16 + 1;
                if (i16 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                str = (String) obj;
                if (i16 == 0) {
                    c28655q3.m87150e0(-2138700114);
                    C28655q c28655q6 = c28655q3;
                    i24 = 0;
                    arrayList2 = arrayList;
                    str2 = str;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    i18 = i16;
                    i19 = 2048;
                    AbstractC17755i2.m50938j(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, null, null, 0L, 0L, null, c28655q6, 6, 254);
                    c28655q2 = c28655q6;
                    c28655q2.m87173q(false);
                } else {
                    i18 = i16;
                    arrayList2 = arrayList;
                    str2 = str;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2 = c28655q3;
                    i24 = 0;
                    c28655q2.m87150e0(-2138526173);
                    c28655q2.m87173q(false);
                }
                if ((i29 & 7168) == i19) {
                    i25 = 1;
                } else {
                    i25 = i24;
                }
                int i37 = (c28655q2.m87149e(i18) ? 1 : 0) | i25;
                if ((i29 & 896) == 256) {
                    i26 = 1;
                } else {
                    i26 = i24;
                }
                int i38 = i37 | i26;
                if ((i29 & 14) == 4) {
                    i27 = 1;
                } else {
                    i27 = i24;
                }
                i28 = i38 | i27;
                objM87133R = c28655q2.m87133R();
                if (i28 == 0) {
                    function4 = function2;
                    objM87133R = new C19254a(conversationId, i18, i13, function4);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function4 = function2;
                    objM87133R = new C19254a(conversationId, i18, i13, function4);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC32626j1.m101896f(str2, (Function1) objM87133R, c28655q2, i24, i24);
                C2314t c2314t6 = c2314t2;
                Function1 function6 = function4;
                C28655q c28655q7 = c28655q2;
                AbstractC17755i2.m50938j(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t6)), null, null, null, null, 0L, 0L, null, c28655q7, 6, 254);
                arrayList = arrayList2;
                arrayList.add(C23454a0.f92919a);
                c28676v0 = c28676v1;
                c28655q3 = c28655q7;
                i16 = i17;
                function2 = function6;
                c2314t = c2314t6;
                f13 = f13;
            }
            c28655q = c28655q3;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            function3 = function2;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16506i(conversationId, suggestions, i13, function3, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m101641e(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m101642f(Function1 function1, int i13, int i14, String str, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC26802d.m(it, i13, i14, str, null, null, 48, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101643g(String str, List list, int i13, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m101640d(str, list, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
