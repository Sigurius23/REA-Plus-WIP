package p423qf;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25265s;
import mg.InterfaceC25526h;
import p424qg.C30333b;
import p424qg.C30334c;
import p424qg.C30335d;
import p424qg.C30339h;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C30318b implements Closeable {

    /* JADX INFO: renamed from: P */
    public static final /* synthetic */ AtomicLongFieldUpdater f124378P;

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ AtomicLongFieldUpdater f124379Q;

    /* JADX INFO: renamed from: R */
    public static final /* synthetic */ AtomicLongFieldUpdater f124380R;

    /* JADX INFO: renamed from: S */
    public static final /* synthetic */ AtomicLongFieldUpdater f124381S;

    /* JADX INFO: renamed from: E */
    public volatile /* synthetic */ long f124382E;

    /* JADX INFO: renamed from: F */
    public volatile /* synthetic */ long f124383F;

    /* JADX INFO: renamed from: G */
    public final C30334c f124384G;

    /* JADX INFO: renamed from: H */
    public final C30334c f124385H;

    /* JADX INFO: renamed from: I */
    public final C30335d f124386I;

    /* JADX INFO: renamed from: J */
    public final C30335d f124387J;

    /* JADX INFO: renamed from: K */
    public final C30335d f124388K;

    /* JADX INFO: renamed from: L */
    public final C30335d f124389L;

    /* JADX INFO: renamed from: M */
    public final C30335d f124390M;

    /* JADX INFO: renamed from: N */
    public final C30335d f124391N;

    /* JADX INFO: renamed from: O */
    public final C30334c f124392O;

    /* JADX INFO: renamed from: w */
    public volatile /* synthetic */ long f124393w;

    /* JADX INFO: renamed from: x */
    public volatile /* synthetic */ long f124394x;

    /* JADX INFO: renamed from: y */
    public volatile /* synthetic */ long f124395y;

    /* JADX INFO: renamed from: z */
    public volatile /* synthetic */ long f124396z;

    static {
        AtomicLongFieldUpdater.newUpdater(C30318b.class, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH);
        f124378P = AtomicLongFieldUpdater.newUpdater(C30318b.class, "x");
        f124379Q = AtomicLongFieldUpdater.newUpdater(C30318b.class, "y");
        AtomicLongFieldUpdater.newUpdater(C30318b.class, "z");
        f124380R = AtomicLongFieldUpdater.newUpdater(C30318b.class, "E");
        f124381S = AtomicLongFieldUpdater.newUpdater(C30318b.class, "F");
    }

    public C30318b(InterfaceC25526h provider) {
        AbstractC22676k.m65750j(provider, "provider");
        ((C30335d) provider.mo75075a()).getClass();
        this.f124393w = 0L;
        this.f124394x = 0L;
        this.f124395y = 0L;
        this.f124396z = 0L;
        this.f124382E = 0L;
        this.f124383F = 0L;
        C30334c c30334c = C30335d.f124477a;
        this.f124384G = c30334c;
        this.f124385H = c30334c;
        C30335d c30335d = C30333b.f124476a;
        this.f124386I = c30335d;
        this.f124387J = c30335d;
        this.f124388K = c30335d;
        this.f124389L = c30335d;
        C30335d c30335d2 = C30339h.f124480a;
        this.f124390M = c30335d2;
        this.f124391N = c30335d2;
        this.f124392O = c30334c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Object objM107888l;
        Object objM107888l2;
        Object objM107888l3;
        Object objM107888l4 = C23454a0.f92919a;
        try {
            this.f124386I.getClass();
            objM107888l = objM107888l4;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        C23468n c23468n = new C23468n(objM107888l);
        try {
            this.f124387J.getClass();
            objM107888l2 = objM107888l4;
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        C23468n c23468n2 = new C23468n(objM107888l2);
        try {
            this.f124389L.getClass();
            objM107888l3 = objM107888l4;
        } catch (Throwable th5) {
            objM107888l3 = AbstractC34132o.m107888l(th5);
        }
        C23468n c23468n3 = new C23468n(objM107888l3);
        try {
            this.f124388K.getClass();
        } catch (Throwable th6) {
            objM107888l4 = AbstractC34132o.m107888l(th6);
        }
        List listM118959K = AbstractC37056f.m118959K(c23468n, c23468n2, c23468n3, new C23468n(objM107888l4));
        ArrayList arrayList = new ArrayList();
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            Throwable thM68037a = C23468n.m68037a(((C23468n) it.next()).f92940w);
            if (thM68037a != null) {
                arrayList.add(thM68037a);
            }
        }
        Throwable th7 = (Throwable) AbstractC25265s.m74100H0(arrayList);
        if (th7 != null) {
            Iterator it3 = AbstractC25265s.m74161z0(arrayList, 1).iterator();
            while (it3.hasNext()) {
                th7.addSuppressed((Throwable) it3.next());
            }
            throw th7;
        }
    }
}
