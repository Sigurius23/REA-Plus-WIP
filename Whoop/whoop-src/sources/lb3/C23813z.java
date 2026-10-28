package lb3;

import c93.InterfaceC4339a;
import java.util.List;
import kb3.C22340i;
import kb3.C22342k;
import kb3.EnumC22341j;
import kb3.InterfaceC22345n;
import mb3.C25389f;
import p048ce.C4463d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: lb3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C23813z extends AbstractC23811y {

    /* JADX INFO: renamed from: x */
    public final InterfaceC22345n f94210x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4339a f94211y;

    /* JADX INFO: renamed from: z */
    public final C22340i f94212z;

    public C23813z(InterfaceC22345n storageManager, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f94210x = storageManager;
        this.f94211y = interfaceC4339a;
        this.f94212z = new C22340i((C22342k) storageManager, interfaceC4339a);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return m69914r0().mo69842X();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: Y */
    public final C23784k0 mo69843Y() {
        return m69914r0().mo69843Y();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC23796q0 mo69844i0() {
        return m69914r0().mo69844i0();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return m69914r0().mo69814k0();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C23813z(this.f94210x, new C4463d(5, kotlinTypeRefiner, this));
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: p0 */
    public final AbstractC23773f1 mo69863p0() {
        AbstractC23811y abstractC23811yM69914r0 = m69914r0();
        while (abstractC23811yM69914r0 instanceof C23813z) {
            abstractC23811yM69914r0 = ((C23813z) abstractC23811yM69914r0).m69914r0();
        }
        AbstractC22676k.m65748h(abstractC23811yM69914r0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC23773f1) abstractC23811yM69914r0;
    }

    /* JADX INFO: renamed from: r0 */
    public final AbstractC23811y m69914r0() {
        return (AbstractC23811y) this.f94212z.invoke();
    }

    public final String toString() {
        C22340i c22340i = this.f94212z;
        return (c22340i.f87177y == EnumC22341j.f87178w || c22340i.f87177y == EnumC22341j.f87179x) ? "<Not computed yet>" : m69914r0().toString();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        return m69914r0().mo64128u();
    }
}
