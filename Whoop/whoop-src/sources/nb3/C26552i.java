package nb3;

import java.util.Arrays;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: nb3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C26552i extends AbstractC23763c0 {

    /* JADX INFO: renamed from: E */
    public final List f105522E;

    /* JADX INFO: renamed from: F */
    public final boolean f105523F;

    /* JADX INFO: renamed from: G */
    public final String[] f105524G;

    /* JADX INFO: renamed from: H */
    public final String f105525H;

    /* JADX INFO: renamed from: x */
    public final InterfaceC23796q0 f105526x;

    /* JADX INFO: renamed from: y */
    public final C26550g f105527y;

    /* JADX INFO: renamed from: z */
    public final EnumC26554k f105528z;

    public C26552i(InterfaceC23796q0 interfaceC23796q0, C26550g c26550g, EnumC26554k kind, List arguments, boolean z4, String... formatParams) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(formatParams, "formatParams");
        this.f105526x = interfaceC23796q0;
        this.f105527y = c26550g;
        this.f105528z = kind;
        this.f105522E = arguments;
        this.f105523F = z4;
        this.f105524G = formatParams;
        String str = kind.f105562w;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f105525H = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return this.f105522E;
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
        return this.f105526x;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return this.f105523F;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64126s0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final AbstractC23773f1 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return this;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        return this.f105527y;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        String[] strArr = this.f105524G;
        return new C26552i(this.f105526x, this.f105527y, this.f105528z, this.f105522E, z4, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return this;
    }
}
