package p50;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import l83.C23454a0;
import no0.C26970r0;
import no0.C26984y0;
import os0.C28308d;
import ov2.C28402f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p725ot1.C28330f;
import p736sz0.C33169c0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p50.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lp50/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp50/c;", "row", "l", "(Lp50/c;Landroidx/compose/runtime/Composer;I)V", "Lsz0/c0;", "state", "f", "(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28850b {
    /* JADX INFO: renamed from: f */
    private static final void m87744f(Modifier modifier, C33169c0 c33169c0, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1424564213);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(c33169c0) : c28655q2.m87157i(c33169c0) ? 32 : 16;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 19) != 18)) {
            c28655q = c28655q2;
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c33169c0.getText()), c28655q2, TextResource.$stable), modifier3, false, C21053l.f79834a.m58880a(C23285v0.m67364b(EnumC2888c.INSTANCE.m8402a(c33169c0.getStyle()).getStyle(), 0L, 0L, null, null, 0L, c33169c0.getAlignment(), 0L, null, null, 16744447), c33169c0.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, ((i17 << 3) & 112) | (C21054m.f79836p << 9), 500);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier2, c33169c0, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87745g(Modifier modifier, C33169c0 c33169c0, int i13, int i14, Composer composer, int i15) {
        m87744f(modifier, c33169c0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ed A[LOOP:1: B:71:0x01e7->B:73:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x022b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: h */
    public static final void m87746h(Modifier modifier, C28852d c28852d, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        float f14;
        float f15;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        int i17;
        float f16;
        int i18;
        C2314t c2314t2;
        float f17;
        Iterator<T> it;
        int i19;
        float f18;
        int i24;
        C2314t c2314t3;
        int i25;
        Object objM87133R;
        C28852d viewState = c28852d;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1938290721);
        int i26 = i14 & 1;
        if (i26 != 0) {
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
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = 1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28402f(23);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                } else {
                    function2 = function2;
                }
                f13 = 3;
                f14 = 8;
                f15 = 2 * f14;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), f13, 4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC17918w0.f69621a), f15, ((float) 2.5d) * f14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(interfaceC4339a);
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
                c28655q.m87150e0(1537782963);
                i17 = 0;
                for (Object obj : viewState.m87756b()) {
                    i19 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m87750l((C28851c) obj, c28655q, C33169c0.f138321k);
                    if (i17 < AbstractC37056f.m118951C(viewState.m87756b())) {
                        c28655q.m87150e0(-1840388798);
                        f18 = f14;
                        i24 = i15;
                        i25 = i16;
                        c2314t3 = c2314t;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f15, i16), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                        c28655q.m87173q(false);
                    } else {
                        f18 = f14;
                        i24 = i15;
                        c2314t3 = c2314t;
                        i25 = i16;
                        c28655q.m87150e0(-1840295581);
                        c28655q.m87173q(false);
                    }
                    f15 = f15;
                    c2314t = c2314t3;
                    i16 = i25;
                    i17 = i19;
                    f13 = f13;
                    f14 = f18;
                    i15 = i24;
                    modifier4 = modifier4;
                    viewState = c28852d;
                }
                Modifier modifier5 = modifier4;
                f16 = f14;
                i18 = i15;
                c2314t2 = c2314t;
                f17 = f13;
                boolean z13 = i16;
                c28655q.m87173q(false);
                if (c28852d.m87755a().isEmpty()) {
                    c28655q.m87150e0(427218615);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(426908212);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f16, c2314t2));
                    it = c28852d.m87755a().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, new C26970r0(14), function2, c28655q, (i18 << 3) & 7168, 2);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(modifier3, c28852d, function3, i13, i14, 13);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = 1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i27 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28402f(23);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function2;
            }
            f13 = 3;
            f14 = 8;
            f15 = 2 * f14;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), f13, 4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC17918w0.f69621a), f15, ((float) 2.5d) * f14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
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
            c28655q.m87150e0(1537782963);
            i17 = 0;
            while (r3.hasNext()) {
                i19 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m87750l((C28851c) obj, c28655q, C33169c0.f138321k);
                if (i17 < AbstractC37056f.m118951C(viewState.m87756b())) {
                    c28655q.m87150e0(-1840388798);
                    f18 = f14;
                    i24 = i15;
                    i25 = i16;
                    c2314t3 = c2314t;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f15, i16), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    c28655q.m87173q(false);
                } else {
                    f18 = f14;
                    i24 = i15;
                    c2314t3 = c2314t;
                    i25 = i16;
                    c28655q.m87150e0(-1840295581);
                    c28655q.m87173q(false);
                }
                f15 = f15;
                c2314t = c2314t3;
                i16 = i25;
                i17 = i19;
                f13 = f13;
                f14 = f18;
                i15 = i24;
                modifier4 = modifier4;
                viewState = c28852d;
            }
            Modifier modifier6 = modifier4;
            f16 = f14;
            i18 = i15;
            c2314t2 = c2314t;
            f17 = f13;
            boolean z14 = i16;
            c28655q.m87173q(false);
            if (c28852d.m87755a().isEmpty()) {
                c28655q.m87150e0(426908212);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f16, c2314t2));
                it = c28852d.m87755a().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, new C26970r0(14), function2, c28655q, (i18 << 3) & 7168, 2);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(427218615);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, c28852d, function3, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87747i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m87748j(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(930399262);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87749k(Modifier modifier, C28852d c28852d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87746h(modifier, c28852d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m87750l(C28851c c28851c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1859286336);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c28851c) : c28655q.m87157i(c28851c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C33169c0 c33169c0M87752a = c28851c.getLabel();
            int i15 = C33169c0.f138321k << 3;
            m87744f(layoutWeightElement, c33169c0M87752a, c28655q, i15, 0);
            m87744f(null, c28851c.getValue(), c28655q, i15, 1);
            m87744f(null, c28851c.getUnit(), c28655q, i15, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c28851c, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m87751m(C28851c c28851c, int i13, Composer composer, int i14) {
        m87750l(c28851c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
