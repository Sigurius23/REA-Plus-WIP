package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import java.util.LinkedHashMap;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0428i;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p180h0.EnumC16377d2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C14965b7 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37816b f55866E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Set f55867w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f55868x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14949a2 f55869y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function3 f55870z;

    public C14965b7(Set set, Function1 function1, C14949a2 c14949a2, Function3 function3, C37816b c37816b) {
        this.f55867w = set;
        this.f55868x = function1;
        this.f55869y = c14949a2;
        this.f55870z = function3;
        this.f55866E = c37816b;
    }

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
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC23004v interfaceC23004v = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(interfaceC23004v) ? 4 : 2;
        }
        int i13 = 0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fM124765i = C39169a.m124765i(((C1101c) interfaceC23004v).f4585b);
            boolean z4 = c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
            Float fValueOf = Float.valueOf(0.0f);
            EnumC14960b2 enumC14960b2 = EnumC14960b2.f55823w;
            LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k(fValueOf, enumC14960b2));
            EnumC15207z1 enumC15207z1 = EnumC15207z1.f57096w;
            Set set = this.f55867w;
            if (set.contains(enumC15207z1)) {
                linkedHashMapM73993b0.put(Float.valueOf(fM124765i), EnumC14960b2.f55824x);
            }
            EnumC15207z1 enumC15207z2 = EnumC15207z1.f57097x;
            if (set.contains(enumC15207z2)) {
                linkedHashMapM73993b0.put(Float.valueOf(-fM124765i), EnumC14960b2.f55825y);
            }
            Function1 function1 = this.f55868x;
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C14954a7(function1, i13);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
            float f13 = set.contains(enumC15207z2) ? 10.0f : 20.0f;
            float f14 = set.contains(enumC15207z1) ? 10.0f : 20.0f;
            EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
            C14949a2 c14949a2 = this.f55869y;
            boolean z13 = c14949a2.f56510c.getValue() == enumC14960b2;
            C15190x4 c15190x4 = new C15190x4(fM124765i, f13, f14);
            C14949a2 c14949a3 = this.f55869y;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM60426c0 = AbstractC21478l0.m60426c0(c2314t, c14949a3, linkedHashMapM73993b0, z13, z4, interfaceC4351m, c15190x4, 288);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM60426c0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
            C22949e c22949e = AbstractC22977m.f90650a;
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3401b);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Function3 function3 = this.f55870z;
            C23000t1 c23000t1 = C23000t1.f90727a;
            function3.invoke(c23000t1, c28655q, 6);
            c28655q.m87173q(true);
            boolean zM87153g2 = c28655q.m87153g(c14949a2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C0428i(c14949a2, 13);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3390l = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3390l);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            this.f55866E.invoke(c23000t1, c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
