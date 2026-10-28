package ne3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25269w;
import p333n4.C26250f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26634q extends AbstractC26632p {

    /* JADX INFO: renamed from: y */
    public final AbstractC26632p f105902y;

    public AbstractC26634q(AbstractC26632p delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f105902y = delegate;
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: J */
    public final List mo79147J(C26611e0 c26611e0) {
        List<C26611e0> listMo79147J = this.f105902y.mo79147J(c26611e0);
        ArrayList arrayList = new ArrayList();
        for (C26611e0 path : listMo79147J) {
            AbstractC22676k.m65750j(path, "path");
            arrayList.add(path);
        }
        AbstractC25269w.m74165k0(arrayList);
        return arrayList;
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: a0 */
    public final C26250f mo79148a0(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        C26250f c26250fMo79148a0 = this.f105902y.mo79148a0(path);
        if (c26250fMo79148a0 == null) {
            return null;
        }
        C26611e0 c26611e0 = (C26611e0) c26250fMo79148a0.f104374d;
        if (c26611e0 == null) {
            return c26250fMo79148a0;
        }
        boolean z4 = c26250fMo79148a0.f104372b;
        boolean z13 = c26250fMo79148a0.f104373c;
        Long l7 = (Long) c26250fMo79148a0.f104375e;
        Long l12 = (Long) c26250fMo79148a0.f104376f;
        Long l13 = (Long) c26250fMo79148a0.f104377g;
        Long l14 = (Long) c26250fMo79148a0.f104378h;
        Map extras = (Map) c26250fMo79148a0.f104379i;
        AbstractC22676k.m65750j(extras, "extras");
        return new C26250f(z4, z13, c26611e0, l7, l12, l13, l14, extras);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b */
    public final InterfaceC26629n0 mo79149b(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return this.f105902y.mo79149b(file);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b0 */
    public final C26646z mo79150b0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return this.f105902y.mo79150b0(file);
    }

    @Override // ne3.AbstractC26632p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f105902y.close();
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: h */
    public final void mo79151h(C26611e0 source, C26611e0 target) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(target, "target");
        this.f105902y.mo79151h(source, target);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: k */
    public final void mo79152k(C26611e0 dir) {
        AbstractC22676k.m65750j(dir, "dir");
        this.f105902y.mo79152k(dir);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: m */
    public final void mo79153m(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        this.f105902y.mo79153m(path);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: o0 */
    public final C26646z mo79154o0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return this.f105902y.mo79154o0(file);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: p0 */
    public InterfaceC26629n0 mo37080p0(C26611e0 file, boolean z4) {
        AbstractC22676k.m65750j(file, "file");
        return this.f105902y.mo37080p0(file, z4);
    }

    public final String toString() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.f105902y + ')';
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC26633p0 mo79155x0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return this.f105902y.mo79155x0(file);
    }
}
