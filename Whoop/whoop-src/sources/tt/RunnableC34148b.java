package tt;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;
import p098dt.C12355g;
import p533ut.C35227a;
import pg3.C29203o;

/* JADX INFO: renamed from: tt.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC34148b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143135w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34149c f143136x;

    public /* synthetic */ RunnableC34148b(C34149c c34149c, int i13) {
        this.f143135w = i13;
        this.f143136x = c34149c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35227a c35227aM88704t0;
        C35227a c35227aM107926g;
        switch (this.f143135w) {
            case 0:
                this.f143136x.m107920a();
                return;
            case 1:
                this.f143136x.m107920a();
                return;
            default:
                C34149c c34149c = this.f143136x;
                Object obj = C34149c.f143137m;
                synchronized (obj) {
                    try {
                        C12355g c12355g = c34149c.f143138a;
                        c12355g.m34610a();
                        C29203o c29203oM88698n0 = C29203o.m88698n0(c12355g.f41519a);
                        try {
                            c35227aM88704t0 = c34149c.f143140c.m88704t0();
                            if (c29203oM88698n0 != null) {
                                c29203oM88698n0.m88705u0();
                            }
                        } catch (Throwable th3) {
                            if (c29203oM88698n0 != null) {
                                c29203oM88698n0.m88705u0();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                try {
                    int i13 = c35227aM88704t0.f149824b;
                    if (i13 == 5) {
                        c35227aM107926g = c34149c.m107926g(c35227aM88704t0);
                    } else {
                        if (i13 == 3) {
                            c35227aM107926g = c34149c.m107926g(c35227aM88704t0);
                        } else if (!c34149c.f143141d.m107932a(c35227aM88704t0)) {
                            return;
                        } else {
                            c35227aM107926g = c34149c.m107921b(c35227aM88704t0);
                        }
                    }
                    synchronized (obj) {
                        try {
                            C12355g c12355g2 = c34149c.f143138a;
                            c12355g2.m34610a();
                            C29203o c29203oM88698n1 = C29203o.m88698n0(c12355g2.f41519a);
                            try {
                                c34149c.f143140c.m88701q0(c35227aM107926g);
                                if (c29203oM88698n1 != null) {
                                    c29203oM88698n1.m88705u0();
                                }
                            } catch (Throwable th5) {
                                if (c29203oM88698n1 != null) {
                                    c29203oM88698n1.m88705u0();
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    synchronized (c34149c) {
                        try {
                            if (c34149c.f143148k.size() != 0 && !TextUtils.equals(c35227aM88704t0.f149823a, c35227aM107926g.f149823a)) {
                                Iterator it = c34149c.f143148k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    if (c35227aM107926g.f149824b == 4) {
                        String str = c35227aM107926g.f149823a;
                        synchronized (c34149c) {
                            c34149c.f143147j = str;
                        }
                    }
                    int i14 = c35227aM107926g.f149824b;
                    if (i14 == 5) {
                        c34149c.m107927h(new FirebaseInstallationsException());
                        return;
                    } else if (i14 == 2 || i14 == 1) {
                        c34149c.m107927h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c34149c.m107928i(c35227aM107926g);
                        return;
                    }
                } catch (FirebaseInstallationsException e5) {
                    c34149c.m107927h(e5);
                    return;
                }
        }
    }
}
