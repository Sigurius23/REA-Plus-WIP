package oe3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25262p;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import ne3.C26611e0;
import ne3.C26646z;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26633p0;
import p249jc.C21565a;
import p249jc.C21567b;
import p333n4.C26250f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: oe3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C27887g extends AbstractC26632p {

    /* JADX INFO: renamed from: F */
    public static final C26611e0 f112443F;

    /* JADX INFO: renamed from: E */
    public final C23470p f112444E;

    /* JADX INFO: renamed from: y */
    public final ClassLoader f112445y;

    /* JADX INFO: renamed from: z */
    public final AbstractC26632p f112446z;

    static {
        String str = C26611e0.f105848x;
        f112443F = C21567b.m60606o("/", false);
    }

    public C27887g(ClassLoader classLoader) {
        C26603a0 systemFileSystem = AbstractC26632p.f105900w;
        AbstractC22676k.m65750j(systemFileSystem, "systemFileSystem");
        this.f112445y = classLoader;
        this.f112446z = systemFileSystem;
        this.f112444E = AbstractC30060g.m92088H(new C25262p(this, 4));
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: J */
    public final List mo79147J(C26611e0 c26611e0) throws FileNotFoundException {
        C26611e0 c26611e1 = f112443F;
        c26611e1.getClass();
        String strM79265s = AbstractC27883c.m84155b(c26611e1, c26611e0, true).m79175d(c26611e1).f105849w.m79265s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z4 = false;
        for (C23465k c23465k : (List) this.f112444E.getValue()) {
            AbstractC26632p abstractC26632p = (AbstractC26632p) c23465k.f92937w;
            C26611e0 c26611e2 = (C26611e0) c23465k.f92938x;
            try {
                List listMo79147J = abstractC26632p.mo79147J(c26611e2.m79176e(strM79265s));
                ArrayList<C26611e0> arrayList = new ArrayList();
                for (Object obj : listMo79147J) {
                    if (C21565a.m60596g((C26611e0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                for (C26611e0 c26611e3 : arrayList) {
                    AbstractC22676k.m65750j(c26611e3, "<this>");
                    arrayList2.add(c26611e1.m79176e(AbstractC39421y.m125927L(AbstractC39414r.m125898q0(c26611e3.f105849w.m79265s(), c26611e2.f105849w.m79265s()), '\\', '/')));
                }
                AbstractC25265s.m74141p0(linkedHashSet, arrayList2);
                z4 = true;
            } catch (IOException unused) {
            }
        }
        if (z4) {
            return AbstractC25265s.m74093D1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c26611e0);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: a0 */
    public final C26250f mo79148a0(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        if (!C21565a.m60596g(path)) {
            return null;
        }
        C26611e0 c26611e0 = f112443F;
        c26611e0.getClass();
        String strM79265s = AbstractC27883c.m84155b(c26611e0, path, true).m79175d(c26611e0).f105849w.m79265s();
        for (C23465k c23465k : (List) this.f112444E.getValue()) {
            C26250f c26250fMo79148a0 = ((AbstractC26632p) c23465k.f92937w).mo79148a0(((C26611e0) c23465k.f92938x).m79176e(strM79265s));
            if (c26250fMo79148a0 != null) {
                return c26250fMo79148a0;
            }
        }
        return null;
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b */
    public final InterfaceC26629n0 mo79149b(C26611e0 file) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b0 */
    public final C26646z mo79150b0(C26611e0 file) throws FileNotFoundException {
        AbstractC22676k.m65750j(file, "file");
        if (!C21565a.m60596g(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        C26611e0 c26611e0 = f112443F;
        c26611e0.getClass();
        String strM79265s = AbstractC27883c.m84155b(c26611e0, file, true).m79175d(c26611e0).f105849w.m79265s();
        for (C23465k c23465k : (List) this.f112444E.getValue()) {
            try {
                return ((AbstractC26632p) c23465k.f92937w).mo79150b0(((C26611e0) c23465k.f92938x).m79176e(strM79265s));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: h */
    public final void mo79151h(C26611e0 source, C26611e0 target) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: k */
    public final void mo79152k(C26611e0 dir) throws IOException {
        AbstractC22676k.m65750j(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: m */
    public final void mo79153m(C26611e0 path) throws IOException {
        AbstractC22676k.m65750j(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: o0 */
    public final C26646z mo79154o0(C26611e0 file) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC26629n0 mo37080p0(C26611e0 file, boolean z4) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC26633p0 mo79155x0(C26611e0 file) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        if (!C21565a.m60596g(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        C26611e0 c26611e0 = f112443F;
        c26611e0.getClass();
        URL resource = this.f112445y.getResource(AbstractC27883c.m84155b(c26611e0, file, false).m79175d(c26611e0).f105849w.m79265s());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC22676k.m65749i(inputStream, "getInputStream(...)");
        return AbstractC26604b.m79166k(inputStream);
    }
}
