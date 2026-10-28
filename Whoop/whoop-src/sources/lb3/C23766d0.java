package lb3;

import java.util.List;
import mb3.C25389f;
import nb3.C26550g;
import nb3.C26556m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: lb3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23766d0 extends AbstractC23763c0 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC22712o f94132E;

    /* JADX INFO: renamed from: F */
    public final Function1 f94133F;

    /* JADX INFO: renamed from: x */
    public final InterfaceC23796q0 f94134x;

    /* JADX INFO: renamed from: y */
    public final List f94135y;

    /* JADX INFO: renamed from: z */
    public final boolean f94136z;

    public C23766d0(InterfaceC23796q0 constructor, List arguments, boolean z4, InterfaceC22712o memberScope, Function1 function1) {
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(memberScope, "memberScope");
        this.f94134x = constructor;
        this.f94135y = arguments;
        this.f94136z = z4;
        this.f94132E = memberScope;
        this.f94133F = function1;
        if (!(memberScope instanceof C26550g) || (memberScope instanceof C26556m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return this.f94135y;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: Y */
    public final C23784k0 mo69843Y() {
        C23784k0.f94165x.getClass();
        return C23784k0.f94166y;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC23796q0 mo69844i0() {
        return this.f94134x;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return this.f94136z;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) this.f94133F.invoke(kotlinTypeRefiner);
        return abstractC23763c0 == null ? this : abstractC23763c0;
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) this.f94133F.invoke(kotlinTypeRefiner);
        return abstractC23763c0 == null ? this : abstractC23763c0;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        return this.f94132E;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        if (z4 == this.f94136z) {
            return this;
        }
        return z4 ? new C23757a0(this, 1) : new C23757a0(this, 0);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C23769e0(this, newAttributes);
    }
}
