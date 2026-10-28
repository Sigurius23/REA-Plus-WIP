package ne3;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import m83.C25258m;
import oe3.C27887g;
import p249jc.C21567b;
import p333n4.C26250f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26632p implements Closeable {

    /* JADX INFO: renamed from: w */
    public static final C26603a0 f105900w;

    /* JADX INFO: renamed from: x */
    public static final C26611e0 f105901x;

    static {
        C26603a0 c26603a0;
        try {
            Class.forName("java.nio.file.Files");
            c26603a0 = new C26605b0();
        } catch (ClassNotFoundException unused) {
            c26603a0 = new C26603a0();
        }
        f105900w = c26603a0;
        String str = C26611e0.f105848x;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC22676k.m65749i(property, "getProperty(...)");
        f105901x = C21567b.m60606o(property, false);
        ClassLoader classLoader = C27887g.class.getClassLoader();
        AbstractC22676k.m65749i(classLoader, "getClassLoader(...)");
        new C27887g(classLoader);
    }

    /* JADX INFO: renamed from: J */
    public abstract List mo79147J(C26611e0 c26611e0);

    /* JADX INFO: renamed from: T */
    public final C26250f m79271T(C26611e0 path) throws FileNotFoundException {
        AbstractC22676k.m65750j(path, "path");
        C26250f c26250fMo79148a0 = mo79148a0(path);
        if (c26250fMo79148a0 != null) {
            return c26250fMo79148a0;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    /* JADX INFO: renamed from: a0 */
    public abstract C26250f mo79148a0(C26611e0 c26611e0);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC26629n0 mo79149b(C26611e0 c26611e0);

    /* JADX INFO: renamed from: b0 */
    public abstract C26646z mo79150b0(C26611e0 c26611e0);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo79151h(C26611e0 c26611e0, C26611e0 c26611e1);

    /* JADX INFO: renamed from: i */
    public final void m79272i(C26611e0 c26611e0) {
        C25258m c25258m = new C25258m();
        while (c26611e0 != null && !m79274x(c26611e0)) {
            c25258m.addFirst(c26611e0);
            c26611e0 = c26611e0.m79174c();
        }
        Iterator<E> it = c25258m.iterator();
        while (it.hasNext()) {
            mo79152k((C26611e0) it.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo79152k(C26611e0 c26611e0);

    /* JADX INFO: renamed from: m */
    public abstract void mo79153m(C26611e0 c26611e0);

    /* JADX INFO: renamed from: o0 */
    public abstract C26646z mo79154o0(C26611e0 c26611e0);

    /* JADX INFO: renamed from: p0 */
    public abstract InterfaceC26629n0 mo37080p0(C26611e0 c26611e0, boolean z4);

    /* JADX INFO: renamed from: s */
    public final void m79273s(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        mo79153m(path);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m79274x(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        return mo79148a0(path) != null;
    }

    /* JADX INFO: renamed from: x0 */
    public abstract InterfaceC26633p0 mo79155x0(C26611e0 c26611e0);
}
