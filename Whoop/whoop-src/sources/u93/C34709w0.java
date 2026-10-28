package u93;

import ab3.AbstractC0715g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.C29027f;
import q63.AbstractC30007c;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31148p;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31111c;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31141m;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.w0 */
/* JADX INFO: loaded from: classes5.dex */
public class C34709w0 extends AbstractC34711x0 implements InterfaceC31107a1 {

    /* JADX INFO: renamed from: G */
    public final int f146186G;

    /* JADX INFO: renamed from: H */
    public final boolean f146187H;

    /* JADX INFO: renamed from: I */
    public final boolean f146188I;

    /* JADX INFO: renamed from: J */
    public final boolean f146189J;

    /* JADX INFO: renamed from: K */
    public final AbstractC23811y f146190K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC31107a1 f146191L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34709w0(InterfaceC31108b containingDeclaration, InterfaceC31107a1 interfaceC31107a1, int i13, InterfaceC32307i annotations, C35850h name, AbstractC23811y outType, boolean z4, boolean z13, boolean z14, AbstractC23811y abstractC23811y, InterfaceC31155s0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(outType, "outType");
        AbstractC22676k.m65750j(source, "source");
        this.f146186G = i13;
        this.f146187H = z4;
        this.f146188I = z13;
        this.f146189J = z14;
        this.f146190K = abstractC23811y;
        this.f146191L = interfaceC31107a1 == null ? this : interfaceC31107a1;
    }

    @Override // r93.InterfaceC31110b1
    /* JADX INFO: renamed from: A */
    public final boolean mo78666A() {
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m109625J0() {
        return this.f146187H && AbstractC30007c.m91831a(((InterfaceC31111c) mo60581g()).getKind());
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31135k
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31108b mo60581g() {
        InterfaceC31135k interfaceC31135kMo60581g = super.mo60581g();
        AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC31108b) interfaceC31135kMo60581g;
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31107a1 mo78660a() {
        InterfaceC31107a1 interfaceC31107a1 = this.f146191L;
        return interfaceC31107a1 == this ? this : ((C34709w0) interfaceC31107a1).mo78660a();
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitValueParameterDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31110b1
    /* JADX INFO: renamed from: W */
    public final /* bridge */ /* synthetic */ AbstractC0715g mo78669W() {
        return null;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31138l mo60593d(C23758a1 substitutor) {
        AbstractC22676k.m65750j(substitutor, "substitutor");
        if (substitutor.f94122a.mo69908e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p LOCAL = AbstractC31150q.f128354f;
        AbstractC22676k.m65749i(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        Collection collectionMo78673h = mo60581g().mo78673h();
        AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
        Collection collection = collectionMo78673h;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC31107a1) ((InterfaceC31108b) it.next()).mo78676v().get(this.f146186G));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC31107a1 mo95859o(C29027f c29027f, C35850h c35850h, int i13) {
        InterfaceC32307i annotations = getAnnotations();
        AbstractC22676k.m65749i(annotations, "<get-annotations>(...)");
        AbstractC23811y type = getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        return new C34709w0(c29027f, null, i13, annotations, c35850h, type, m109625J0(), this.f146188I, this.f146189J, this.f146190K, InterfaceC31155s0.f128370q);
    }
}
