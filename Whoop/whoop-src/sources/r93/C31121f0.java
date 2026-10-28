package r93;

import cb3.AbstractC4393e;
import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb3.C22342k;
import lb3.C23779i;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25235a0;
import mb3.C25389f;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34684k;
import u93.C34682j;
import u93.C34705u0;
import va3.C35850h;

/* JADX INFO: renamed from: r93.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31121f0 extends AbstractC34684k {

    /* JADX INFO: renamed from: G */
    public final boolean f128332G;

    /* JADX INFO: renamed from: H */
    public final ArrayList f128333H;

    /* JADX INFO: renamed from: I */
    public final C23779i f128334I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31121f0(C22342k c22342k, InterfaceC31123g container, C35850h c35850h, boolean z4, int i13) {
        super(c22342k, container, c35850h, InterfaceC31155s0.f128370q);
        AbstractC22676k.m65750j(container, "container");
        this.f128332G = z4;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i13);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            arrayList.add(C34705u0.m109618N0(this, EnumC23776g1.INVARIANT, C35850h.m113814e("T" + iNextInt), iNextInt, c22342k));
        }
        this.f128333H = arrayList;
        this.f128334I = new C23779i(this, AbstractC21598x.m60704u(this), AbstractC12350b.m34570S(AbstractC4393e.m13812j(this).mo78661c().m83817e()), c22342k);
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: I */
    public final AbstractC31167y0 mo60488I() {
        return null;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: N */
    public final boolean mo60491N() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: Q */
    public final boolean mo60492Q() {
        return false;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: V */
    public final /* bridge */ /* synthetic */ InterfaceC22712o mo60494V() {
        return C22711n.f89378b;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        return this.f128334I;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return C32305g.f133684a;
    }

    @Override // r93.InterfaceC31117e
    public final Collection getConstructors() {
        return C25235a0.f99113w;
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        return EnumC31120f.f128328w;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p PUBLIC = AbstractC31150q.f128353e;
        AbstractC22676k.m65749i(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // u93.AbstractC34684k, r93.InterfaceC31168z
    public final boolean isExternal() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isInline() {
        return false;
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return this.f128332G;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isValue() {
        return false;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        return this.f128333H;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        return EnumC31106a0.f128310x;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        return C22711n.f89378b;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: o0 */
    public final boolean mo60500o0() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: s */
    public final C34682j mo60501s() {
        return null;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }
}
