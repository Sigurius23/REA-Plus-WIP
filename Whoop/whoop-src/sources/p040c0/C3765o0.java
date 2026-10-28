package p040c0;

import al.AbstractC0954a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0227m1;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3765o0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f15373w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC11337c0 f15374x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15375y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function3 f15376z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3765o0(C11421z1 c11421z1, InterfaceC11337c0 interfaceC11337c0, Object obj, Function3 function3) {
        super(2);
        this.f15373w = c11421z1;
        this.f15374x = interfaceC11337c0;
        this.f15375y = obj;
        this.f15376z = function3;
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
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Object objMo2428y0;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            C3737f c3737f = new C3737f(this.f15374x, 1);
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            C11421z1 c11421z1 = this.f15373w;
            boolean zM30665g = c11421z1.m30665g();
            AbstractC0954a abstractC0954a = c11421z1.f36630a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM30665g) {
                c28655q.m87150e0(1666853325);
                c28655q.m87173q(false);
                objMo2428y0 = abstractC0954a.mo2428y0();
            } else {
                c28655q.m87150e0(1666599280);
                boolean zM87153g = c28655q.m87153g(c11421z1);
                objMo2428y0 = c28655q.m87133R();
                if (zM87153g || objMo2428y0 == c28676v0) {
                    AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                    Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                    AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                    try {
                        Object objMo2428y1 = abstractC0954a.mo2428y0();
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        c28655q.m87172p0(objMo2428y1);
                        objMo2428y0 = objMo2428y1;
                    } catch (Throwable th3) {
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        throw th3;
                    }
                }
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(1378811975);
            Object obj3 = this.f15375y;
            float f13 = AbstractC22676k.m65745e(objMo2428y0, obj3) ? 1.0f : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f13);
            boolean zM87153g2 = c28655q.m87153g(c11421z1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g2 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C3762n0(c11421z1, 0));
                c28655q.m87172p0(objM87133R);
            }
            Object value = ((InterfaceC28670t2) objM87133R).getValue();
            c28655q.m87150e0(1378811975);
            float f14 = AbstractC22676k.m65745e(value, obj3) ? 1.0f : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f14);
            boolean zM87153g3 = c28655q.m87153g(c11421z1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g3 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new C3762n0(c11421z1, 1));
                c28655q.m87172p0(objM87133R2);
            }
            C11409v1 c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1, fValueOf, fValueOf2, (InterfaceC11337c0) c3737f.invoke(((InterfaceC28670t2) objM87133R2).getValue(), c28655q, 0), c11351f2, c28655q, 0);
            boolean zM87153g4 = c28655q.m87153g(c11409v1M30542d);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0227m1(c11409v1M30542d, 10);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(C2314t.f9131w, (Function1) objM87133R3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3486a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            this.f15376z.invoke(obj3, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
