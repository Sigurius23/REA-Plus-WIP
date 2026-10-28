package za3;

import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import m83.C25271y;
import mb3.C25389f;
import nb3.C26555l;
import nb3.EnumC26551h;
import ob3.InterfaceC27794d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: za3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C40246a extends AbstractC23763c0 implements InterfaceC27794d {

    /* JADX INFO: renamed from: E */
    public final C23784k0 f174035E;

    /* JADX INFO: renamed from: x */
    public final AbstractC23804u0 f174036x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40247b f174037y;

    /* JADX INFO: renamed from: z */
    public final boolean f174038z;

    public C40246a(AbstractC23804u0 typeProjection, InterfaceC40247b constructor, boolean z4, C23784k0 attributes) {
        AbstractC22676k.m65750j(typeProjection, "typeProjection");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(attributes, "attributes");
        this.f174036x = typeProjection;
        this.f174037y = constructor;
        this.f174038z = z4;
        this.f174035E = attributes;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return C25271y.f99162w;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: Y */
    public final C23784k0 mo69843Y() {
        return this.f174035E;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC23796q0 mo69844i0() {
        return this.f174037y;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return this.f174038z;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C40246a(this.f174036x.mo69870d(kotlinTypeRefiner), this.f174037y, this.f174038z, this.f174035E);
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final AbstractC23773f1 mo64125r0(boolean z4) {
        if (z4 == this.f174038z) {
            return this;
        }
        return new C40246a(this.f174036x, this.f174037y, z4, this.f174035E);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C40246a(this.f174036x.mo69870d(kotlinTypeRefiner), this.f174037y, this.f174038z, this.f174035E);
    }

    @Override // lb3.AbstractC23763c0
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Captured(");
        sb4.append(this.f174036x);
        sb4.append(')');
        sb4.append(this.f174038z ? "?" : "");
        return sb4.toString();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        return C26555l.m78680a(EnumC26551h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        if (z4 == this.f174038z) {
            return this;
        }
        return new C40246a(this.f174036x, this.f174037y, z4, this.f174035E);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C40246a(this.f174036x, this.f174037y, this.f174038z, newAttributes);
    }

    public C40246a(AbstractC23804u0 abstractC23804u0) {
        C40248c c40248c = new C40248c(abstractC23804u0);
        C23784k0.f94165x.getClass();
        this(abstractC23804u0, c40248c, false, C23784k0.f94166y);
    }
}
