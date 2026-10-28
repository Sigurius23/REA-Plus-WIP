package p040c0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p002a0.C0057v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3746i extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39967p f15320w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15321x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3789x f15322y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4352n f15323z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3746i(C39967p c39967p, Object obj, C3789x c3789x, InterfaceC4352n interfaceC4352n) {
        super(3);
        this.f15320w = c39967p;
        this.f15321x = obj;
        this.f15322y = c3789x;
        this.f15323z = interfaceC4352n;
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
        InterfaceC3747i0 interfaceC3747i0 = (InterfaceC3747i0) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((C28655q) composer).m87153g(interfaceC3747i0) : ((C28655q) composer).m87157i(interfaceC3747i0) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            C39967p c39967p = this.f15320w;
            boolean zM87153g = c28655q.m87153g(c39967p);
            Object obj4 = this.f15321x;
            boolean zM87157i = zM87153g | c28655q.m87157i(obj4);
            C3789x c3789x = this.f15322y;
            boolean zM87157i2 = zM87157i | c28655q.m87157i(c3789x);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i2 || objM87133R == c28676v0) {
                objM87133R = new C3743h(c39967p, obj4, c3789x, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(interfaceC3747i0, (Function1) objM87133R, c28655q);
            C0057v0 c0057v0 = c3789x.f15451e;
            AbstractC22676k.m65748h(interfaceC3747i0, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c0057v0.m135m(obj4, ((C3750j0) interfaceC3747i0).f15332a);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C3767p();
                c28655q.m87172p0(objM87133R2);
            }
            this.f15323z.invoke((C3767p) objM87133R2, obj4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
