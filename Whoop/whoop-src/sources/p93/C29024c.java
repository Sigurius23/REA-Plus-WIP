package p93;

import i93.C18283i;
import i93.C18284j;
import ib3.C18344c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb3.C22342k;
import l83.C23454a0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mb3.C25389f;
import ng3.C26701n;
import o93.AbstractC27742n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.AbstractC31167y0;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34666b;
import u93.C34682j;
import u93.C34705u0;
import va3.C35845c;
import va3.C35850h;

/* JADX INFO: renamed from: p93.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C29024c extends AbstractC34666b {

    /* JADX INFO: renamed from: L */
    public static final C35845c f117487L = new C35845c(AbstractC27742n.f111886k, C35850h.m113814e("Function"));

    /* JADX INFO: renamed from: M */
    public static final C35845c f117488M = new C35845c(AbstractC27742n.f111884i, C35850h.m113814e("KFunction"));

    /* JADX INFO: renamed from: E */
    public final C22342k f117489E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC31124g0 f117490F;

    /* JADX INFO: renamed from: G */
    public final AbstractC29032k f117491G;

    /* JADX INFO: renamed from: H */
    public final int f117492H;

    /* JADX INFO: renamed from: I */
    public final C29023b f117493I;

    /* JADX INFO: renamed from: J */
    public final C29026e f117494J;

    /* JADX INFO: renamed from: K */
    public final List f117495K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29024c(C22342k c22342k, C18344c containingDeclaration, AbstractC29032k functionTypeKind, int i13) {
        super(c22342k, functionTypeKind.m88263a(i13));
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(functionTypeKind, "functionTypeKind");
        this.f117489E = c22342k;
        this.f117490F = containingDeclaration;
        this.f117491G = functionTypeKind;
        this.f117492H = i13;
        this.f117493I = new C29023b(this);
        this.f117494J = new C29026e(c22342k, this);
        ArrayList arrayList = new ArrayList();
        C18284j c18284j = new C18284j(1, i13, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284j, 10));
        Iterator it = c18284j.iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            arrayList.add(C34705u0.m109618N0(this, EnumC23776g1.IN_VARIANCE, C35850h.m113814e("P" + iNextInt), arrayList.size(), this.f117489E));
            arrayList2.add(C23454a0.f92919a);
        }
        arrayList.add(C34705u0.m109618N0(this, EnumC23776g1.OUT_VARIANCE, C35850h.m113814e("R"), arrayList.size(), this.f117489E));
        this.f117495K = AbstractC25265s.m74093D1(arrayList);
        C26701n c26701n = EnumC29025d.f117496w;
        AbstractC29032k abstractC29032k = this.f117491G;
        c26701n.getClass();
        C26701n.m79405m(abstractC29032k);
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
        return this.f117493I;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        return this.f117490F;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return C32305g.f133684a;
    }

    @Override // r93.InterfaceC31117e
    public final /* bridge */ /* synthetic */ Collection getConstructors() {
        return C25271y.f99162w;
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        return EnumC31120f.f128329x;
    }

    @Override // r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        return InterfaceC31155s0.f128370q;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p PUBLIC = AbstractC31150q.f128353e;
        AbstractC22676k.m65749i(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // r93.InterfaceC31168z
    public final boolean isExternal() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isInline() {
        return false;
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isValue() {
        return false;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        return this.f117495K;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        return EnumC31106a0.f128307E;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        return this.f117494J;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: o0 */
    public final boolean mo60500o0() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ C34682j mo60501s() {
        return null;
    }

    public final String toString() {
        String strM113817b = getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return strM113817b;
    }
}
