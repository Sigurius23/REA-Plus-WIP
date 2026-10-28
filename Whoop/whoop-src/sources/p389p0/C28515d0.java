package p389p0;

import java.util.List;
import java.util.Map;
import p002a0.AbstractC0052t;
import p002a0.C0023g0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39140v1;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p0.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28515d0 implements InterfaceC39133t0 {

    /* JADX INFO: renamed from: w */
    public final C28506a0 f115412w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39140v1 f115413x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28509b0 f115414y;

    /* JADX INFO: renamed from: z */
    public final C0023g0 f115415z;

    public C28515d0(C28506a0 c28506a0, InterfaceC39140v1 interfaceC39140v1) {
        this.f115412w = c28506a0;
        this.f115413x = interfaceC39140v1;
        this.f115414y = (InterfaceC28509b0) c28506a0.f115399b.invoke();
        AbstractC0052t.m122a();
        this.f115415z = new C0023g0();
    }

    @Override // p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public final boolean mo781A() {
        return this.f115413x.mo781A();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f115413x.mo722D0(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f115413x.mo724F(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f115413x.mo726K(j7);
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: W */
    public final InterfaceC39130s0 mo86822W(int i13, int i14, Map map, Function1 function1) {
        return this.f115413x.mo86822W(i13, i14, map, function1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final List m86823a(int i13) {
        C0023g0 c0023g0 = this.f115415z;
        List list = (List) c0023g0.m121b(i13);
        if (list != null) {
            return list;
        }
        InterfaceC28509b0 interfaceC28509b0 = this.f115414y;
        Object objMo77532c = interfaceC28509b0.mo77532c(i13);
        List listMo124616s0 = this.f115413x.mo124616s0(objMo77532c, this.f115412w.m86818a(i13, objMo77532c, interfaceC28509b0.mo77530a(i13)));
        c0023g0.m51h(i13, listMo124616s0);
        return listMo124616s0;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f115413x.mo733e0(i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return this.f115413x.mo734f0(f13);
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f115413x.getDensity();
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f115413x.getLayoutDirection();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f115413x.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f115413x.mo736i(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f115413x.mo738l(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f115413x.getFontScale();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f115413x.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f115413x.mo743q0(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: w0 */
    public final int mo86824w0(long j7) {
        return this.f115413x.mo86824w0(j7);
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC39130s0 mo795x0(int i13, int i14, Map map, Function1 function1, Function1 function2) {
        return this.f115413x.mo795x0(i13, i14, map, function1, function2);
    }
}
