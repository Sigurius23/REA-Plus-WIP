package mb3;

import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23804u0;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import m83.C25271y;
import nb3.C26555l;
import nb3.EnumC26551h;
import ob3.EnumC27792b;
import ob3.InterfaceC27794d;
import p048ce.C4463d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: mb3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C25391h extends AbstractC23763c0 implements InterfaceC27794d {

    /* JADX INFO: renamed from: E */
    public final C23784k0 f99476E;

    /* JADX INFO: renamed from: F */
    public final boolean f99477F;

    /* JADX INFO: renamed from: G */
    public final boolean f99478G;

    /* JADX INFO: renamed from: x */
    public final EnumC27792b f99479x;

    /* JADX INFO: renamed from: y */
    public final C25392i f99480y;

    /* JADX INFO: renamed from: z */
    public final AbstractC23773f1 f99481z;

    public C25391h(EnumC27792b captureStatus, C25392i constructor, AbstractC23773f1 abstractC23773f1, C23784k0 attributes, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(captureStatus, "captureStatus");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(attributes, "attributes");
        this.f99479x = captureStatus;
        this.f99480y = constructor;
        this.f99481z = abstractC23773f1;
        this.f99476E = attributes;
        this.f99477F = z4;
        this.f99478G = z13;
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C25391h mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        C25392i c25392i = this.f99480y;
        c25392i.getClass();
        AbstractC23804u0 abstractC23804u0Mo69870d = c25392i.f99483w.mo69870d(kotlinTypeRefiner);
        C4463d c4463d = c25392i.f99484x != null ? new C4463d(7, c25392i, kotlinTypeRefiner) : null;
        C25392i c25392i2 = c25392i.f99485y;
        if (c25392i2 == null) {
            c25392i2 = c25392i;
        }
        C25392i c25392i3 = new C25392i(abstractC23804u0Mo69870d, c4463d, c25392i2, c25392i.f99486z);
        AbstractC23773f1 abstractC23773f1 = this.f99481z;
        return new C25391h(this.f99479x, c25392i3, abstractC23773f1 != null ? abstractC23773f1 : null, this.f99476E, this.f99477F, 32);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return C25271y.f99162w;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: Y */
    public final C23784k0 mo69843Y() {
        return this.f99476E;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC23796q0 mo69844i0() {
        return this.f99480y;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return this.f99477F;
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final AbstractC23773f1 mo64125r0(boolean z4) {
        return new C25391h(this.f99479x, this.f99480y, this.f99481z, this.f99476E, z4, 32);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        return C26555l.m78680a(EnumC26551h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        return new C25391h(this.f99479x, this.f99480y, this.f99481z, this.f99476E, z4, 32);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C25391h(this.f99479x, this.f99480y, this.f99481z, newAttributes, this.f99477F, this.f99478G);
    }

    /* JADX INFO: renamed from: w0 */
    public final EnumC27792b m74519w0() {
        return this.f99479x;
    }

    /* JADX INFO: renamed from: x0 */
    public final C25392i m74520x0() {
        return this.f99480y;
    }

    /* JADX INFO: renamed from: y0 */
    public final AbstractC23773f1 m74521y0() {
        return this.f99481z;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m74522z0() {
        return this.f99478G;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25391h(EnumC27792b enumC27792b, C25392i c25392i, AbstractC23773f1 abstractC23773f1, C23784k0 c23784k0, boolean z4, int i13) {
        if ((i13 & 8) != 0) {
            C23784k0.f94165x.getClass();
            c23784k0 = C23784k0.f94166y;
        }
        this(enumC27792b, c25392i, abstractC23773f1, c23784k0, (i13 & 16) != 0 ? false : z4, false);
    }
}
