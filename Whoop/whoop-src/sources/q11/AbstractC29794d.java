package q11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import fy1.C14873i;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import j02.C21166s;
import java.util.ArrayList;
import java.util.Iterator;
import k81.EnumC22291a;
import l83.C23454a0;
import m83.C25235a0;
import ny0.AbstractC27265l0;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p719m22.C24965t;
import p725ot1.C28330f;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pt2.C29529k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: q11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq11/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(Landroidx/compose/runtime/Composer;I)V", "l", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29794d {

    /* JADX INFO: renamed from: q11.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f121815w = new a();

        /* JADX INFO: renamed from: a */
        public final long m91260a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91260a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: q11.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C29795e f121816w;

        public b(C29795e c29795e) {
            this.f121816w = c29795e;
        }

        /* JADX INFO: renamed from: a */
        public final void m91261a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2037538450);
            AbstractC29794d.m91252f(C2314t.f9131w, this.f121816w, null, c28655q, 6, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91261a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q11.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C29795e f121817w;

        public c(C29795e c29795e) {
            this.f121817w = c29795e;
        }

        /* JADX INFO: renamed from: a */
        public final void m91262a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-346151072);
            AbstractC29794d.m91252f(C2314t.f9131w, this.f121817w, null, c28655q, 6, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91262a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:103:0x0300  */
    /* JADX WARN: Code duplicated, block: B:107:0x030e  */
    /* JADX WARN: Code duplicated, block: B:110:0x033f  */
    /* JADX WARN: Code duplicated, block: B:113:0x034a  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:82:0x023a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0242  */
    /* JADX WARN: Code duplicated, block: B:90:0x025d  */
    /* JADX WARN: Code duplicated, block: B:96:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r27v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r27v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v21, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public static final void m91252f(Modifier modifier, C29795e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int i16;
        int iHashCode2;
        int iHashCode3;
        C28676v0 c28676v1;
        ?? r14;
        C2314t c2314t2;
        boolean z13;
        C28655q c28655q;
        Iterator it;
        ?? r15;
        ?? r16;
        TextResource textResource;
        Function1 function5;
        Object objM87133R;
        C28676v0 c28676v2;
        Object obj;
        ?? r17;
        int i17;
        Object obj2;
        ?? r18;
        Object next;
        int i18;
        Object objM87133R2;
        Object obj3;
        boolean z14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1810031403);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        obj3 = objM87133R2;
                        C29529k c29529k = new C29529k(19);
                        c28655q2.m87172p0(c29529k);
                        obj3 = c29529k;
                    }
                    obj3 = objM87133R2;
                    function4 = (Function1) obj3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), 3, 4);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                i16 = i15;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM53364e);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (viewState.getHeader() == null) {
                    c28655q2.m87150e0(-1982229910);
                    z13 = false;
                    c28655q2.m87173q(false);
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    r14 = 1;
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(-1982229909);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C38072d c38072d = C38072d.f163053a;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC18249c.m52565c(modifierM3409f2, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10())));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    c28676v1 = c28676v0;
                    r14 = 1;
                    c2314t2 = c2314t;
                    z13 = false;
                    AbstractC30795n.m94707h(viewState.getHeader(), null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196602);
                    C28655q c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                }
                c28655q.m87150e0(-756662585);
                it = viewState.m91265c().iterator();
                r15 = z13;
                r16 = c28655q;
                while (true) {
                    textResource = null;
                    z14 = false;
                    if (it.hasNext()) {
                        function5 = function4;
                        r16.m87173q(z13);
                        r16.m87173q(r14);
                        if (viewState.getCta() == null) {
                            r16.m87150e0(2076673153);
                            r16.m87173q(z13);
                            r18 = r16;
                        } else {
                            r16.m87150e0(2076673154);
                            TextResource textResourceM82267m = viewState.getCta().getText();
                            C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), textResource, 2, z14 ? 1 : 0);
                            objM87133R = r16.m87133R();
                            c28676v2 = c28676v1;
                            if (objM87133R == c28676v2) {
                                obj = objM87133R;
                                a aVar = a.f121815w;
                                r16.m87172p0(aVar);
                                obj = aVar;
                            }
                            obj = objM87133R;
                            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) obj);
                            if ((i16 & 896) == 256) {
                                r17 = r14;
                            } else {
                                r17 = z13;
                            }
                            i17 = (r16.m87157i(viewState) ? 1 : 0) | r17;
                            Object objM87133R3 = r16.m87133R();
                            obj2 = objM87133R3;
                            if (i17 == 0 || objM87133R3 == c28676v2) {
                                C29793c c29793c = new C29793c(0, function5, viewState);
                                r16.m87172p0(c29793c);
                                obj2 = c29793c;
                            }
                            ?? r27 = r16;
                            AbstractC27265l0.m82217i(null, null, textResourceM82267m, null, c39274g, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) obj2, r27, 0, 0, 4011);
                            ?? r19 = r27;
                            r19.m87173q(z13);
                            r18 = r19;
                        }
                        r18.m87173q(r14);
                        function3 = function5;
                        modifier3 = modifier4;
                        r10 = r18;
                        break;
                    }
                    next = it.next();
                    i18 = r15 + 1;
                    if (r15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C29799i c29799i = (C29799i) next;
                    if (r15 == 0 || viewState.getHeader() != null) {
                        r16.m87150e0(1987805437);
                        ?? r24 = C38072d.f163053a;
                        AbstractC15751g.m44449b(AbstractC1099a.m3396r(AbstractC18249c.m52565c(c2314t2, AbstractC18249c.m52577o(r24.m121949b(r16, 6).getWhite10())), ((float) r14) * 8, 0.0f, 2), r24.m121949b(r16, 6).getWhite10(), 0.0f, 0.0f, r16, 0, 12);
                        r16.m87173q(z13);
                    } else {
                        r16.m87150e0(1988112957);
                        r16.m87173q(z13);
                    }
                    ?? r28 = r16;
                    AbstractC29798h.m91274i(c29799i, r15 == true ? 1 : 0, function4, r28, i16 & 896, 0);
                    r16 = r28;
                    r15 = i18;
                }
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                r10 = c28655q2;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(modifier3, viewState, function3, i13, i14, 24);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    obj3 = objM87133R2;
                    C29529k c29529k2 = new C29529k(19);
                    c28655q2.m87172p0(c29529k2);
                    obj3 = c29529k2;
                }
                obj3 = objM87133R2;
                function4 = (Function1) obj3;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), 3, 4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            i16 = i15;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM53364e2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
            if (viewState.getHeader() == null) {
                c28655q2.m87150e0(-1982229910);
                z13 = false;
                c28655q2.m87173q(false);
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                r14 = 1;
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-1982229909);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C38072d c38072d2 = C38072d.f163053a;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC18249c.m52565c(modifierM3409f4, AbstractC18249c.m52577o(c38072d2.m121949b(c28655q2, 6).getWhite10())));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                c28676v1 = c28676v0;
                r14 = 1;
                c2314t2 = c2314t;
                z13 = false;
                AbstractC30795n.m94707h(viewState.getHeader(), null, c38072d2.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196602);
                C28655q c28655q4 = c28655q2;
                c28655q4.m87173q(true);
                c28655q4.m87173q(false);
                c28655q = c28655q4;
            }
            c28655q.m87150e0(-756662585);
            it = viewState.m91265c().iterator();
            r15 = z13;
            r16 = c28655q;
            while (true) {
                textResource = null;
                z14 = false;
                if (it.hasNext()) {
                    function5 = function4;
                    r16.m87173q(z13);
                    r16.m87173q(r14);
                    if (viewState.getCta() == null) {
                        r16.m87150e0(2076673153);
                        r16.m87173q(z13);
                        r18 = r16;
                    } else {
                        r16.m87150e0(2076673154);
                        TextResource textResourceM82267m2 = viewState.getCta().getText();
                        C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), textResource, 2, z14 ? 1 : 0);
                        objM87133R = r16.m87133R();
                        c28676v2 = c28676v1;
                        if (objM87133R == c28676v2) {
                            obj = objM87133R;
                            a aVar2 = a.f121815w;
                            r16.m87172p0(aVar2);
                            obj = aVar2;
                        }
                        obj = objM87133R;
                        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) obj);
                        if ((i16 & 896) == 256) {
                            r17 = r14;
                        } else {
                            r17 = z13;
                        }
                        i17 = (r16.m87157i(viewState) ? 1 : 0) | r17;
                        Object objM87133R4 = r16.m87133R();
                        obj2 = objM87133R4;
                        if (i17 == 0) {
                            C29793c c29793c2 = new C29793c(0, function5, viewState);
                            r16.m87172p0(c29793c2);
                            obj2 = c29793c2;
                        } else {
                            C29793c c29793c3 = new C29793c(0, function5, viewState);
                            r16.m87172p0(c29793c3);
                            obj2 = c29793c3;
                        }
                        ?? r29 = r16;
                        AbstractC27265l0.m82217i(null, null, textResourceM82267m2, null, c39274g2, false, interfaceC39332eM125323a2, null, false, false, null, null, (Function1) obj2, r29, 0, 0, 4011);
                        ?? r110 = r29;
                        r110.m87173q(z13);
                        r18 = r110;
                    }
                    r18.m87173q(r14);
                    function3 = function5;
                    modifier3 = modifier4;
                    r10 = r18;
                    break;
                }
                next = it.next();
                i18 = r15 + 1;
                if (r15 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C29799i c29799i2 = (C29799i) next;
                if (r15 == 0) {
                    r16.m87150e0(1987805437);
                    ?? r25 = C38072d.f163053a;
                    AbstractC15751g.m44449b(AbstractC1099a.m3396r(AbstractC18249c.m52565c(c2314t2, AbstractC18249c.m52577o(r25.m121949b(r16, 6).getWhite10())), ((float) r14) * 8, 0.0f, 2), r25.m121949b(r16, 6).getWhite10(), 0.0f, 0.0f, r16, 0, 12);
                    r16.m87173q(z13);
                } else {
                    r16.m87150e0(1987805437);
                    ?? r26 = C38072d.f163053a;
                    AbstractC15751g.m44449b(AbstractC1099a.m3396r(AbstractC18249c.m52565c(c2314t2, AbstractC18249c.m52577o(r26.m121949b(r16, 6).getWhite10())), ((float) r14) * 8, 0.0f, 2), r26.m121949b(r16, 6).getWhite10(), 0.0f, 0.0f, r16, 0, 12);
                    r16.m87173q(z13);
                }
                ?? r210 = r16;
                AbstractC29798h.m91274i(c29799i2, r15 == true ? 1 : 0, function4, r210, i16 & 896, 0);
                r16 = r210;
                r15 = i18;
            }
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            r10 = c28655q2;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, viewState, function3, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91253g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m91254h(Function1 function1, C29795e c29795e, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC29791a.a(c29795e.getCta().getNavigationAction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m91255i(Modifier modifier, C29795e c29795e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91252f(modifier, c29795e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m91256j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(325093559);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("decreased");
            EnumC17727b2 enumC17727b2 = EnumC17727b2.NEGATIVE_YELLOW;
            EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_TRIANGLE_UP;
            C29799i c29799i = new C29799i(null, "SLEEP QUALITY", "Higher blood pressure may be associated with reduced sleep quality, making it harder to achieve deep, restorative sleep.", new C17731c2(textResourceM21278l, true, enumC17727b2, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), null, 16, null);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("increased");
            EnumC17727b2 enumC17727b3 = EnumC17727b2.POSITIVE_YELLOW;
            InterfaceC21430b interfaceC21430b = null;
            boolean z4 = false;
            Object obj = null;
            C21166s c21166s = null;
            EnumC22291a enumC22291a = null;
            boolean z13 = false;
            boolean z14 = false;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            String str = null;
            String str2 = "Some research suggests that higher blood pressure may disrupt sleep, which can lead to fragmented rest and poorer recover compared to lower blood pressure. Possible impacts may include:";
            C29795e c29795e = new C29795e(str, str2, AbstractC37056f.m118959K(c29799i, new C29799i(null, "SLEEP FRAGMENTATION", "Reduced sleep quality...", new C17731c2(textResourceM21278l2, true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), null, 16, null), new C29799i(null, "A VERY LONG HEADER, SLEEP ARCHITECTURE", "Reduced sleep quality...", new C17731c2(AbstractC8693b.m21278l("increased"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), null, 16, null)), new C27273p0(AbstractC8693b.m21278l("VIEW SOURCES"), new C9598e(null, null, null, 7, null), objArr3, objArr4, objArr5, interfaceC21430b, z4, obj, objArr2, c21166s, enumC22291a, z13, objArr, z14, 16380, null), 1, null);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b(c29795e)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m91257k(int i13, Composer composer, int i14) {
        m91256j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m91258l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1520234839);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C29795e c29795e = new C29795e("test_list_no_header", null, AbstractC37056f.m118959K(new C29799i("no_header_row_1", "No Header Row 1", "Description for row 1.", null, null, 16, null), new C29799i("no_header_row_2", "No Header Row 2", "Description for row 2.", 0 == true ? 1 : 0, null, 16, null)), null);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c(c29795e)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m91259m(int i13, Composer composer, int i14) {
        m91258l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
