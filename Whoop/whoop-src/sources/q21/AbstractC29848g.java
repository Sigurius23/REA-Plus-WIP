package q21;

import a80.C0545i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import lf0.C23967s0;
import m83.AbstractC25265s;
import ny0.AbstractC27249e;
import ny0.AbstractC27265l0;
import ny0.C27256h;
import ny0.C27273p0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pt2.C29529k;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: q21.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq21/i;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29848g {

    /* JADX INFO: renamed from: q21.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f121992w = new a();

        /* JADX INFO: renamed from: a */
        public final long m91395a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91395a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x021c  */
    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0259  */
    /* JADX WARN: Code duplicated, block: B:117:0x0261  */
    /* JADX WARN: Code duplicated, block: B:119:0x0266  */
    /* JADX WARN: Code duplicated, block: B:120:0x0268  */
    /* JADX WARN: Code duplicated, block: B:123:0x026f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0273  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0310  */
    /* JADX WARN: Code duplicated, block: B:143:0x0342  */
    /* JADX WARN: Code duplicated, block: B:144:0x0346  */
    /* JADX WARN: Code duplicated, block: B:147:0x0353  */
    /* JADX WARN: Code duplicated, block: B:149:0x0361  */
    /* JADX WARN: Code duplicated, block: B:152:0x036f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0376  */
    /* JADX WARN: Code duplicated, block: B:156:0x0380  */
    /* JADX WARN: Code duplicated, block: B:158:0x0386  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:168:0x0409  */
    /* JADX WARN: Code duplicated, block: B:170:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0417  */
    /* JADX WARN: Code duplicated, block: B:178:0x0439  */
    /* JADX WARN: Code duplicated, block: B:180:0x043f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0449  */
    /* JADX WARN: Code duplicated, block: B:186:0x0453  */
    /* JADX WARN: Code duplicated, block: B:189:0x0460 A[EDGE_INSN: B:189:0x0460->B:190:0x0462 BREAK  A[LOOP:5: B:184:0x044d->B:292:?]] */
    /* JADX WARN: Code duplicated, block: B:192:0x046b  */
    /* JADX WARN: Code duplicated, block: B:193:0x046e  */
    /* JADX WARN: Code duplicated, block: B:196:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:200:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0507  */
    /* JADX WARN: Code duplicated, block: B:216:0x053c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0540  */
    /* JADX WARN: Code duplicated, block: B:220:0x0553  */
    /* JADX WARN: Code duplicated, block: B:222:0x0561  */
    /* JADX WARN: Code duplicated, block: B:226:0x057c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0584  */
    /* JADX WARN: Code duplicated, block: B:230:0x0588  */
    /* JADX WARN: Code duplicated, block: B:231:0x058a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0591  */
    /* JADX WARN: Code duplicated, block: B:235:0x0593  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:247:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:248:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:251:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:254:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:259:0x061e  */
    /* JADX WARN: Code duplicated, block: B:260:0x062c  */
    /* JADX WARN: Code duplicated, block: B:262:0x064c  */
    /* JADX WARN: Code duplicated, block: B:265:0x065d  */
    /* JADX WARN: Code duplicated, block: B:266:0x065f  */
    /* JADX WARN: Code duplicated, block: B:269:0x066b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x066d  */
    /* JADX WARN: Code duplicated, block: B:273:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:276:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:281:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:? A[LOOP:1: B:83:0x0150->B:283:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[LOOP:5: B:184:0x044d->B:292:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Code duplicated, block: B:94:0x019f  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    /* JADX INFO: renamed from: e */
    public static final void m91390e(Modifier modifier, C29850i viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C29846e c29846eM91422g;
        EnumC29847f style;
        EnumC29847f enumC29847f;
        boolean z13;
        C29846e c29846eM91422g2;
        EnumC29847f style2;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z15;
        C28676v0 c28676v1;
        int iHashCode2;
        Modifier modifier5;
        C0213j c0213j2;
        int i16;
        C0209i c0209i2;
        Iterator it;
        boolean zHasNext;
        C23000t1 c23000t1;
        float f15;
        C2314t c2314t2;
        C28676v0 c28676v2;
        float f16;
        Function1 function5;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i3;
        boolean z16;
        int iHashCode4;
        List list;
        int size;
        int i17;
        List list2;
        int i18;
        boolean z17;
        float f17;
        float f18;
        int iHashCode5;
        C0213j c0213j4;
        C0209i c0209i4;
        int i19;
        boolean z18;
        C27256h c27256hM91417a;
        boolean z19;
        boolean zM87157i;
        Object objM87133R;
        C28676v0 c28676v3;
        C27273p0 c27273p0M91421f;
        Object objM87133R2;
        boolean z24;
        boolean zM87157i2;
        Object objM87133R3;
        boolean z25;
        int i24;
        float f19;
        float f24;
        int iHashCode6;
        C0213j c0213j5;
        C0209i c0209i5;
        int i25;
        int i26;
        boolean z26;
        boolean z27;
        List list3;
        Iterator it3;
        float f25;
        int iHashCode7;
        C0213j c0213j6;
        C0209i c0209i6;
        int iHashCode8;
        C0213j c0213j7;
        C0209i c0209i7;
        int i27;
        int i28;
        boolean z28;
        boolean z29;
        List list4;
        C28676v0 c28676v4;
        List list5;
        Iterator it4;
        Object objM87133R4;
        C2306l c2306l = C2299e.f9108K;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-410977152);
        int i29 = i14 & 1;
        if (i29 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29529k(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                f13 = 2;
                f14 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
                c29846eM91422g = viewState.getStyle();
                if (c29846eM91422g != null) {
                    style = c29846eM91422g.getStyle();
                } else {
                    style = null;
                }
                enumC29847f = EnumC29847f.FAMILY_PLAN;
                if (style != enumC29847f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c29846eM91422g2 = viewState.getStyle();
                if (c29846eM91422g2 != null) {
                    style2 = c29846eM91422g2.getStyle();
                } else {
                    style2 = null;
                }
                if (style2 == enumC29847f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                List<List<AbstractC29845d>> listM91420e = viewState.m91420e();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                for (Object obj : listM91420e) {
                    list4 = (List) obj;
                    boolean z34 = z13;
                    if (z13) {
                        list5 = list4;
                        c28676v4 = c28676v0;
                        if ((list5 instanceof Collection) || !list5.isEmpty()) {
                            it4 = list5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((AbstractC29845d) it4.next()) instanceof AbstractC29845d.g) {
                                        arrayList.add(obj);
                                        break;
                                    }
                                }
                            }
                        }
                        z13 = z34;
                        c28676v0 = c28676v4;
                    } else {
                        c28676v4 = c28676v0;
                    }
                    arrayList2.add(obj);
                    z13 = z34;
                    c28676v0 = c28676v4;
                }
                z15 = z13;
                c28676v1 = c28676v0;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                modifier5 = modifier4;
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                i16 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(1099863212);
                it = arrayList.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c23000t1 = C23000t1.f90727a;
                    if (zHasNext) {
                        f15 = f13;
                        c2314t2 = c2314t;
                        c28676v2 = c28676v1;
                        f16 = f14;
                        c28655q.m87173q(false);
                        Modifier modifierM3388j = AbstractC1099a.m3388j(c2314t2, EnumC22935a1.f90537w);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        function5 = function4;
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i8 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d);
                        C0209i c0209i9 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m3);
                        c0209i3 = C0217k.f732j;
                        if (!c28655q.f115903S) {
                            z16 = z14;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            }
                            C0209i c0209i10 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N3);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
                            list = (List) AbstractC25265s.m74100H0(arrayList2);
                            if (list != null) {
                                size = list.size();
                            } else {
                                size = 0;
                            }
                            c28655q.m87150e0(-1301371773);
                            for (i17 = 0; i17 < size; i17++) {
                                if (viewState.getHighlightedPlan() == i17) {
                                    c28655q.m87150e0(-220646786);
                                    Modifier modifierMo66772c = c23000t1.mo66772c(AbstractC1092a.m3356a(0.15f, c2314t2, viewState.getHighlightedBackgroundColor(), AbstractC33253j.m105489e(f15 * 4)), true, 1.0f);
                                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j6 = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j6);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                                    c0209i6 = C0217k.f732j;
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, c2314t2));
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(-220054004);
                                    if (i17 == 0 || !z15) {
                                        f25 = 1.0f;
                                    } else {
                                        f25 = 2.0f;
                                    }
                                    AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t2, true, f25));
                                    c28655q.m87173q(false);
                                }
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            list2 = (List) AbstractC25265s.m74100H0(arrayList2);
                            if (list2 != null) {
                                i18 = 1;
                                z17 = false;
                                break;
                            }
                            list3 = list2;
                            if (!(list3 instanceof Collection) && list3.isEmpty()) {
                                i18 = 1;
                                z17 = false;
                                break;
                            }
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                        i18 = 1;
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    i18 = 1;
                                    z17 = false;
                                    break;
                                }
                            }
                            f17 = i18 * f16;
                            C22971k c22971kM66746i = AbstractC22977m.m66746i(f17);
                            if (z17) {
                                f18 = f17;
                            } else {
                                f18 = 0 * f16;
                            }
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f18, 0.0f, f17, 5));
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                            iHashCode5 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j4);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                            c0209i4 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                            c28655q.m87150e0(-610585197);
                            i19 = 0;
                            for (Object obj2 : arrayList2) {
                                i24 = i19 + 1;
                                if (i19 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                List list6 = (List) obj2;
                                f19 = 4;
                                Modifier modifierM3405b = AbstractC1102d.m3405b(c2314t2, 0.0f, ((float) 7.5d) * f19, 1);
                                if (z16 || i19 != 0) {
                                    f24 = 0 * f19;
                                } else {
                                    f24 = 3 * f19;
                                }
                                Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3405b, 0.0f, f24, 0.0f, 0.0f, 13);
                                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                                iHashCode6 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                                InterfaceC0221l.f734a.getClass();
                                c0213j5 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j5);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                                c0209i5 = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                                c28655q.m87150e0(827756950);
                                i25 = 0;
                                for (Object obj3 : list6) {
                                    i26 = i25 + 1;
                                    if (i25 >= 0) {
                                        AbstractC37056f.m118977d0();
                                        throw null;
                                    }
                                    AbstractC29845d abstractC29845d = (AbstractC29845d) obj3;
                                    if (i25 == 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    if (viewState.getHighlightedPlan() == i25) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    AbstractC29844c.m91359w(c23000t1, abstractC29845d, z26, z27, z15, c28655q, 6, 0);
                                    i25 = i26;
                                }
                                c28655q.m87173q(false);
                                c28655q.m87173q(true);
                                i19 = i24;
                            }
                            z18 = false;
                            AbstractC2875y.m8286B(c28655q, false, true, true, true);
                            c27256hM91417a = viewState.getButtonState();
                            if (c27256hM91417a == null) {
                                c28655q.m87150e0(-1320135924);
                                c28655q.m87173q(false);
                                c28676v3 = c28676v2;
                            } else {
                                c28655q.m87150e0(-1320135923);
                                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                                if ((i16 & 896) == 256) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87157i = z19 | c28655q.m87157i(c27256hM91417a);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    c28676v3 = c28676v2;
                                } else {
                                    c28676v3 = c28676v2;
                                    if (objM87133R == c28676v3) {
                                    }
                                    AbstractC27249e.m82121d(modifierM3409f3, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                                    c28655q = c28655q;
                                    z18 = false;
                                    c28655q.m87173q(false);
                                }
                                objM87133R = new C0545i(function5, c27256hM91417a, 10);
                                c28655q.m87172p0(objM87133R);
                                AbstractC27249e.m82121d(modifierM3409f3, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                                c28655q = c28655q;
                                z18 = false;
                                c28655q.m87173q(false);
                            }
                            c27273p0M91421f = viewState.getSecondaryButtonViewState();
                            if (c27273p0M91421f == null) {
                                c28655q.m87150e0(-1319894465);
                                c28655q.m87173q(z18);
                                z25 = true;
                            } else {
                                c28655q.m87150e0(-1319894464);
                                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                                TextResource text = c27273p0M91421f.getText();
                                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v3) {
                                    objM87133R2 = a.f121992w;
                                    c28655q.m87172p0(objM87133R2);
                                }
                                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                                if ((i16 & 896) == 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                zM87157i2 = z24 | c28655q.m87157i(c27273p0M91421f);
                                objM87133R3 = c28655q.m87133R();
                                if (zM87157i2 || objM87133R3 == c28676v3) {
                                    objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                C28655q c28655q2 = c28655q;
                                z25 = true;
                                AbstractC27265l0.m82217i(c2314t2, enumC27269n0, text, null, c39274g, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R3, c28655q2, 100663350, 0, 3752);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z25);
                            modifier3 = modifier5;
                            function3 = function5;
                            break;
                        }
                        z16 = z14;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        C0209i c0209i11 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N3);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
                        list = (List) AbstractC25265s.m74100H0(arrayList2);
                        if (list != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        c28655q.m87150e0(-1301371773);
                        while (i17 < size) {
                            if (viewState.getHighlightedPlan() == i17) {
                                c28655q.m87150e0(-220646786);
                                Modifier modifierMo66772c2 = c23000t1.mo66772c(AbstractC1092a.m3356a(0.15f, c2314t2, viewState.getHighlightedBackgroundColor(), AbstractC33253j.m105489e(f15 * 4)), true, 1.0f);
                                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                                iHashCode7 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo66772c2);
                                InterfaceC0221l.f734a.getClass();
                                c0213j6 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j6);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                                c0209i6 = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, c2314t2));
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-220054004);
                                if (i17 == 0) {
                                    f25 = 1.0f;
                                } else {
                                    f25 = 1.0f;
                                }
                                AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t2, true, f25));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        list2 = (List) AbstractC25265s.m74100H0(arrayList2);
                        if (list2 != null) {
                            i18 = 1;
                            z17 = false;
                            break;
                        }
                        list3 = list2;
                        if (!(list3 instanceof Collection)) {
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                        i18 = 1;
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    i18 = 1;
                                    z17 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                        i18 = 1;
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    i18 = 1;
                                    z17 = false;
                                    break;
                                }
                            }
                        }
                        f17 = i18 * f16;
                        C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                        if (z17) {
                            f18 = f17;
                        } else {
                            f18 = 0 * f16;
                        }
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f18, 0.0f, f17, 5));
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j4);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        c28655q.m87150e0(-610585197);
                        i19 = 0;
                        while (r1.hasNext()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            List list7 = (List) obj2;
                            f19 = 4;
                            Modifier modifierM3405b2 = AbstractC1102d.m3405b(c2314t2, 0.0f, ((float) 7.5d) * f19, 1);
                            if (z16) {
                                f24 = 0 * f19;
                            } else {
                                f24 = 0 * f19;
                            }
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3405b2, 0.0f, f24, 0.0f, 0.0f, 13);
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                            iHashCode6 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j5 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j5);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                            c0209i5 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                            c28655q.m87150e0(827756950);
                            i25 = 0;
                            while (r3.hasNext()) {
                                i26 = i25 + 1;
                                if (i25 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                AbstractC29845d abstractC29845d2 = (AbstractC29845d) obj3;
                                if (i25 == 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (viewState.getHighlightedPlan() == i25) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                AbstractC29844c.m91359w(c23000t1, abstractC29845d2, z26, z27, z15, c28655q, 6, 0);
                                i25 = i26;
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            i19 = i24;
                        }
                        z18 = false;
                        AbstractC2875y.m8286B(c28655q, false, true, true, true);
                        c27256hM91417a = viewState.getButtonState();
                        if (c27256hM91417a == null) {
                            c28655q.m87150e0(-1320135924);
                            c28655q.m87173q(false);
                            c28676v3 = c28676v2;
                        } else {
                            c28655q.m87150e0(-1320135923);
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            if ((i16 & 896) == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i = z19 | c28655q.m87157i(c27256hM91417a);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v3 = c28676v2;
                                if (objM87133R == c28676v3) {
                                }
                                AbstractC27249e.m82121d(modifierM3409f6, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                                c28655q = c28655q;
                                z18 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28676v3 = c28676v2;
                            }
                            objM87133R = new C0545i(function5, c27256hM91417a, 10);
                            c28655q.m87172p0(objM87133R);
                            AbstractC27249e.m82121d(modifierM3409f6, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                            c28655q = c28655q;
                            z18 = false;
                            c28655q.m87173q(false);
                        }
                        c27273p0M91421f = viewState.getSecondaryButtonViewState();
                        if (c27273p0M91421f == null) {
                            c28655q.m87150e0(-1319894465);
                            c28655q.m87173q(z18);
                            z25 = true;
                        } else {
                            c28655q.m87150e0(-1319894464);
                            EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                            TextResource text2 = c27273p0M91421f.getText();
                            C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v3) {
                                objM87133R2 = a.f121992w;
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R2);
                            if ((i16 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zM87157i2 = z24 | c28655q.m87157i(c27273p0M91421f);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                                c28655q.m87172p0(objM87133R3);
                            }
                            C28655q c28655q3 = c28655q;
                            z25 = true;
                            AbstractC27265l0.m82217i(c2314t2, enumC27269n1, text2, null, c39274g2, false, interfaceC39332eM125323a2, null, false, false, null, null, (Function1) objM87133R3, c28655q3, 100663350, 0, 3752);
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        modifier3 = modifier5;
                        function3 = function5;
                        break;
                    }
                    List list8 = (List) it.next();
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f14, 1));
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                    Iterator it5 = it;
                    iHashCode8 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j7 = C0217k.f724b;
                    c28655q.m87158i0();
                    Function1 function6 = function4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j7);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i7 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode8))) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    c28655q.m87150e0(-1747796890);
                    i27 = 0;
                    for (Object obj4 : list8) {
                        i28 = i27 + 1;
                        if (i27 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC29845d abstractC29845d3 = (AbstractC29845d) obj4;
                        if (i27 == 0) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if (viewState.getHighlightedPlan() == i27) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        float f26 = f14;
                        AbstractC29844c.m91359w(c23000t1, abstractC29845d3, z28, z29, z15, c28655q, 6, 0);
                        f13 = f13;
                        f14 = f26;
                        i27 = i28;
                        c28676v1 = c28676v1;
                        c2314t = c2314t;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    it = it5;
                    function4 = function6;
                    c28676v1 = c28676v1;
                    c2314t = c2314t;
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(modifier3, viewState, function3, i13, i14, 25);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C29529k(21);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            f13 = 2;
            f14 = 8;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
            c29846eM91422g = viewState.getStyle();
            if (c29846eM91422g != null) {
                style = c29846eM91422g.getStyle();
            } else {
                style = null;
            }
            enumC29847f = EnumC29847f.FAMILY_PLAN;
            if (style != enumC29847f) {
                z13 = true;
            } else {
                z13 = false;
            }
            c29846eM91422g2 = viewState.getStyle();
            if (c29846eM91422g2 != null) {
                style2 = c29846eM91422g2.getStyle();
            } else {
                style2 = null;
            }
            if (style2 == enumC29847f) {
                z14 = true;
            } else {
                z14 = false;
            }
            List<List<AbstractC29845d>> listM91420e2 = viewState.m91420e();
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            while (r12.hasNext()) {
                list4 = (List) obj;
                boolean z35 = z13;
                if (z13) {
                    list5 = list4;
                    c28676v4 = c28676v0;
                    if (list5 instanceof Collection) {
                        it4 = list5.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((AbstractC29845d) it4.next()) instanceof AbstractC29845d.g) {
                                    arrayList.add(obj);
                                    break;
                                    break;
                                }
                            }
                        }
                    } else {
                        it4 = list5.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((AbstractC29845d) it4.next()) instanceof AbstractC29845d.g) {
                                    arrayList.add(obj);
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    z13 = z35;
                    c28676v0 = c28676v4;
                } else {
                    c28676v4 = c28676v0;
                }
                arrayList2.add(obj);
                z13 = z35;
                c28676v0 = c28676v4;
            }
            z15 = z13;
            c28676v1 = c28676v0;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            modifier5 = modifier4;
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            i16 = i15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
            c28655q.m87150e0(1099863212);
            it = arrayList.iterator();
            while (true) {
                zHasNext = it.hasNext();
                c23000t1 = C23000t1.f90727a;
                if (zHasNext) {
                    f15 = f13;
                    c2314t2 = c2314t;
                    c28676v2 = c28676v1;
                    f16 = f14;
                    c28655q.m87173q(false);
                    Modifier modifierM3388j2 = AbstractC1099a.m3388j(c2314t2, EnumC22935a1.f90537w);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    function5 = function4;
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3388j2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i12 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC39127r0M66763d2);
                    C0209i c0209i13 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m15);
                    c0209i3 = C0217k.f732j;
                    if (!c28655q.f115903S) {
                        z16 = z14;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        }
                        C0209i c0209i14 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N15);
                        Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m16);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N16);
                        list = (List) AbstractC25265s.m74100H0(arrayList2);
                        if (list != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        c28655q.m87150e0(-1301371773);
                        while (i17 < size) {
                            if (viewState.getHighlightedPlan() == i17) {
                                c28655q.m87150e0(-220646786);
                                Modifier modifierMo66772c3 = c23000t1.mo66772c(AbstractC1092a.m3356a(0.15f, c2314t2, viewState.getHighlightedBackgroundColor(), AbstractC33253j.m105489e(f15 * 4)), true, 1.0f);
                                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                                iHashCode7 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierMo66772c3);
                                InterfaceC0221l.f734a.getClass();
                                c0213j6 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j6);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m17);
                                c0209i6 = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N17);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, c2314t2));
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-220054004);
                                if (i17 == 0) {
                                    f25 = 1.0f;
                                } else {
                                    f25 = 1.0f;
                                }
                                AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t2, true, f25));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        list2 = (List) AbstractC25265s.m74100H0(arrayList2);
                        if (list2 != null) {
                            i18 = 1;
                            z17 = false;
                            break;
                        }
                        list3 = list2;
                        if (!(list3 instanceof Collection)) {
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                        i18 = 1;
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    i18 = 1;
                                    z17 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                        i18 = 1;
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    i18 = 1;
                                    z17 = false;
                                    break;
                                }
                            }
                        }
                        f17 = i18 * f16;
                        C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f17);
                        if (z17) {
                            f18 = f17;
                        } else {
                            f18 = 0 * f16;
                        }
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f18, 0.0f, f17, 5));
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k, c28655q, 6);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j4);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
                        c28655q.m87150e0(-610585197);
                        i19 = 0;
                        while (r1.hasNext()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            List list9 = (List) obj2;
                            f19 = 4;
                            Modifier modifierM3405b3 = AbstractC1102d.m3405b(c2314t2, 0.0f, ((float) 7.5d) * f19, 1);
                            if (z16) {
                                f24 = 0 * f19;
                            } else {
                                f24 = 0 * f19;
                            }
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(modifierM3405b3, 0.0f, f24, 0.0f, 0.0f, 13);
                            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                            iHashCode6 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j5 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j5);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a7);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m19);
                            c0209i5 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N19);
                            c28655q.m87150e0(827756950);
                            i25 = 0;
                            while (r3.hasNext()) {
                                i26 = i25 + 1;
                                if (i25 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                AbstractC29845d abstractC29845d4 = (AbstractC29845d) obj3;
                                if (i25 == 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (viewState.getHighlightedPlan() == i25) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                AbstractC29844c.m91359w(c23000t1, abstractC29845d4, z26, z27, z15, c28655q, 6, 0);
                                i25 = i26;
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            i19 = i24;
                        }
                        z18 = false;
                        AbstractC2875y.m8286B(c28655q, false, true, true, true);
                        c27256hM91417a = viewState.getButtonState();
                        if (c27256hM91417a == null) {
                            c28655q.m87150e0(-1320135924);
                            c28655q.m87173q(false);
                            c28676v3 = c28676v2;
                        } else {
                            c28655q.m87150e0(-1320135923);
                            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            if ((i16 & 896) == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i = z19 | c28655q.m87157i(c27256hM91417a);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v3 = c28676v2;
                                if (objM87133R == c28676v3) {
                                }
                                AbstractC27249e.m82121d(modifierM3409f10, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                                c28655q = c28655q;
                                z18 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28676v3 = c28676v2;
                            }
                            objM87133R = new C0545i(function5, c27256hM91417a, 10);
                            c28655q.m87172p0(objM87133R);
                            AbstractC27249e.m82121d(modifierM3409f10, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                            c28655q = c28655q;
                            z18 = false;
                            c28655q.m87173q(false);
                        }
                        c27273p0M91421f = viewState.getSecondaryButtonViewState();
                        if (c27273p0M91421f == null) {
                            c28655q.m87150e0(-1319894465);
                            c28655q.m87173q(z18);
                            z25 = true;
                        } else {
                            c28655q.m87150e0(-1319894464);
                            EnumC27269n0 enumC27269n2 = EnumC27269n0.TextSmall;
                            TextResource text3 = c27273p0M91421f.getText();
                            C39274g c39274g3 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v3) {
                                objM87133R2 = a.f121992w;
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) objM87133R2);
                            if ((i16 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zM87157i2 = z24 | c28655q.m87157i(c27273p0M91421f);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                                c28655q.m87172p0(objM87133R3);
                            }
                            C28655q c28655q4 = c28655q;
                            z25 = true;
                            AbstractC27265l0.m82217i(c2314t2, enumC27269n2, text3, null, c39274g3, false, interfaceC39332eM125323a3, null, false, false, null, null, (Function1) objM87133R3, c28655q4, 100663350, 0, 3752);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        modifier3 = modifier5;
                        function3 = function5;
                        break;
                    }
                    z16 = z14;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N15);
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N110);
                    list = (List) AbstractC25265s.m74100H0(arrayList2);
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    c28655q.m87150e0(-1301371773);
                    while (i17 < size) {
                        if (viewState.getHighlightedPlan() == i17) {
                            c28655q.m87150e0(-220646786);
                            Modifier modifierMo66772c4 = c23000t1.mo66772c(AbstractC1092a.m3356a(0.15f, c2314t2, viewState.getHighlightedBackgroundColor(), AbstractC33253j.m105489e(f15 * 4)), true, 1.0f);
                            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode7 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierMo66772c4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j6 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j6);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111);
                            c0209i6 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, c2314t2));
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-220054004);
                            if (i17 == 0) {
                                f25 = 1.0f;
                            } else {
                                f25 = 1.0f;
                            }
                            AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t2, true, f25));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    list2 = (List) AbstractC25265s.m74100H0(arrayList2);
                    if (list2 != null) {
                        i18 = 1;
                        z17 = false;
                        break;
                    }
                    list3 = list2;
                    if (!(list3 instanceof Collection)) {
                        it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                    i18 = 1;
                                    z17 = true;
                                    break;
                                }
                            } else {
                                i18 = 1;
                                z17 = false;
                                break;
                            }
                        }
                    } else {
                        it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((AbstractC29845d) it3.next()) instanceof AbstractC29845d.d) {
                                    i18 = 1;
                                    z17 = true;
                                    break;
                                }
                            } else {
                                i18 = 1;
                                z17 = false;
                                break;
                            }
                        }
                    }
                    f17 = i18 * f16;
                    C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f17);
                    if (z17) {
                        f18 = f17;
                    } else {
                        f18 = 0 * f16;
                    }
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f18, 0.0f, f17, 5));
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k, c28655q, 6);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m112);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N112);
                    c28655q.m87150e0(-610585197);
                    i19 = 0;
                    while (r1.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        List list10 = (List) obj2;
                        f19 = 4;
                        Modifier modifierM3405b4 = AbstractC1102d.m3405b(c2314t2, 0.0f, ((float) 7.5d) * f19, 1);
                        if (z16) {
                            f24 = 0 * f19;
                        } else {
                            f24 = 0 * f19;
                        }
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3405b4, 0.0f, f24, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                        iHashCode6 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j5 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j5);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m113);
                        c0209i5 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N113);
                        c28655q.m87150e0(827756950);
                        i25 = 0;
                        while (r3.hasNext()) {
                            i26 = i25 + 1;
                            if (i25 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC29845d abstractC29845d5 = (AbstractC29845d) obj3;
                            if (i25 == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (viewState.getHighlightedPlan() == i25) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            AbstractC29844c.m91359w(c23000t1, abstractC29845d5, z26, z27, z15, c28655q, 6, 0);
                            i25 = i26;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        i19 = i24;
                    }
                    z18 = false;
                    AbstractC2875y.m8286B(c28655q, false, true, true, true);
                    c27256hM91417a = viewState.getButtonState();
                    if (c27256hM91417a == null) {
                        c28655q.m87150e0(-1320135924);
                        c28655q.m87173q(false);
                        c28676v3 = c28676v2;
                    } else {
                        c28655q.m87150e0(-1320135923);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        if ((i16 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z19 | c28655q.m87157i(c27256hM91417a);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            c28676v3 = c28676v2;
                            if (objM87133R == c28676v3) {
                            }
                            AbstractC27249e.m82121d(modifierM3409f13, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                            c28655q = c28655q;
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28676v3 = c28676v2;
                        }
                        objM87133R = new C0545i(function5, c27256hM91417a, 10);
                        c28655q.m87172p0(objM87133R);
                        AbstractC27249e.m82121d(modifierM3409f13, c27256hM91417a, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                        c28655q = c28655q;
                        z18 = false;
                        c28655q.m87173q(false);
                    }
                    c27273p0M91421f = viewState.getSecondaryButtonViewState();
                    if (c27273p0M91421f == null) {
                        c28655q.m87150e0(-1319894465);
                        c28655q.m87173q(z18);
                        z25 = true;
                    } else {
                        c28655q.m87150e0(-1319894464);
                        EnumC27269n0 enumC27269n3 = EnumC27269n0.TextSmall;
                        TextResource text4 = c27273p0M91421f.getText();
                        C39274g c39274g4 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v3) {
                            objM87133R2 = a.f121992w;
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) objM87133R2);
                        if ((i16 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zM87157i2 = z24 | c28655q.m87157i(c27273p0M91421f);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C23967s0(function5, c27273p0M91421f, 2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q5 = c28655q;
                        z25 = true;
                        AbstractC27265l0.m82217i(c2314t2, enumC27269n3, text4, null, c39274g4, false, interfaceC39332eM125323a4, null, false, false, null, null, (Function1) objM87133R3, c28655q5, 100663350, 0, 3752);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    modifier3 = modifier5;
                    function3 = function5;
                    break;
                }
                List list11 = (List) it.next();
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f14, 1));
                C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                Iterator it6 = it;
                iHashCode8 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                InterfaceC0221l.f734a.getClass();
                c0213j7 = C0217k.f724b;
                c28655q.m87158i0();
                Function1 function7 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j7);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a10);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m114);
                c0209i7 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N114);
                c28655q.m87150e0(-1747796890);
                i27 = 0;
                while (r2.hasNext()) {
                    i28 = i27 + 1;
                    if (i27 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    AbstractC29845d abstractC29845d6 = (AbstractC29845d) obj4;
                    if (i27 == 0) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (viewState.getHighlightedPlan() == i27) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    float f27 = f14;
                    AbstractC29844c.m91359w(c23000t1, abstractC29845d6, z28, z29, z15, c28655q, 6, 0);
                    f13 = f13;
                    f14 = f27;
                    i27 = i28;
                    c28676v1 = c28676v1;
                    c2314t = c2314t;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                it = it6;
                function4 = function7;
                c28676v1 = c28676v1;
                c2314t = c2314t;
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, viewState, function3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m91391f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91392g(Function1 function1, C27256h c27256h) {
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m91393h(Function1 function1, C27273p0 c27273p0, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27273p0.getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m91394i(Modifier modifier, C29850i c29850i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91390e(modifier, c29850i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
