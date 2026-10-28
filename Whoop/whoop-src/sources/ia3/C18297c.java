package ia3;

import androidx.lifecycle.C1591h2;
import dc3.C11934s;
import ga3.AbstractC15625c;
import java.util.Iterator;
import kb3.C22342k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import ma3.InterfaceC25373b;
import o93.AbstractC27741m;
import p027b3.C2365d3;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32306h;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import va3.C35847e;
import va3.C35850h;
import vb1.C35868a;
import x93.C38111d;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38170e;
import xb3.C38171f;
import xb3.C38184s;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: ia3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18297c implements InterfaceC32307i {

    /* JADX INFO: renamed from: w */
    public final C41113q f71249w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC25373b f71250x;

    /* JADX INFO: renamed from: y */
    public final boolean f71251y;

    /* JADX INFO: renamed from: z */
    public final C1591h2 f71252z;

    public C18297c(C41113q c3, InterfaceC25373b annotationOwner, boolean z4) {
        AbstractC22676k.m65750j(c3, "c");
        AbstractC22676k.m65750j(annotationOwner, "annotationOwner");
        this.f71249w = c3;
        this.f71250x = annotationOwner;
        this.f71251y = z4;
        this.f71252z = ((C22342k) ((C18295a) c3.f177224x).f71223a).m64224c(new C11934s(this, 5));
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: J */
    public final /* bridge */ boolean mo52688J(C35847e c35847e) {
        return AbstractC32306h.m100567p(this, c35847e);
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: T */
    public final InterfaceC32300b mo52689T(C35847e fqName) {
        InterfaceC32300b interfaceC32300b;
        AbstractC22676k.m65750j(fqName, "fqName");
        InterfaceC25373b interfaceC25373b = this.f71250x;
        C38111d c38111dMo74422a = interfaceC25373b.mo74422a(fqName);
        if (c38111dMo74422a != null && (interfaceC32300b = (InterfaceC32300b) this.f71252z.invoke(c38111dMo74422a)) != null) {
            return interfaceC32300b;
        }
        C35850h c35850h = AbstractC15625c.f58656a;
        return AbstractC15625c.m43954a(fqName, interfaceC25373b, this.f71249w);
    }

    @Override // s93.InterfaceC32307i
    public final boolean isEmpty() {
        return this.f71250x.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC25373b interfaceC25373b = this.f71250x;
        C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC25265s.m74145r0(interfaceC25373b.getAnnotations()), this.f71252z);
        C35850h c35850h = AbstractC15625c.f58656a;
        return new C38170e(new C38171f(AbstractC38176k.m122286v(AbstractC25260n.m74050X(new InterfaceC38174i[]{c38184sM122272A, new C2365d3(AbstractC15625c.m43954a(AbstractC27741m.f111862m, interfaceC25373b, this.f71249w), 3)}), new C38136a(3)), false, new C35868a(16)));
    }
}
