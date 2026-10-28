package p283kl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ar.C1913a;
import com.bumptech.glide.C4961c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p150fl.C14555a;
import p586wk.InterfaceC37334l;
import p684zk.C40786k;
import pf.AbstractC29125c;
import pl.C29341d;
import sl.C32578d;
import tl.AbstractC33913l;
import uk.C35043b;
import uk.C35044c;
import uk.C35046e;

/* JADX INFO: renamed from: kl.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C22558g {

    /* JADX INFO: renamed from: a */
    public final C35046e f88737a;

    /* JADX INFO: renamed from: b */
    public final Handler f88738b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f88739c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C4966h f88740d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0955b f88741e;

    /* JADX INFO: renamed from: f */
    public boolean f88742f;

    /* JADX INFO: renamed from: g */
    public boolean f88743g;

    /* JADX INFO: renamed from: h */
    public C4964f f88744h;

    /* JADX INFO: renamed from: i */
    public C22555d f88745i;

    /* JADX INFO: renamed from: j */
    public boolean f88746j;

    /* JADX INFO: renamed from: k */
    public C22555d f88747k;

    /* JADX INFO: renamed from: l */
    public Bitmap f88748l;

    /* JADX INFO: renamed from: m */
    public C22555d f88749m;

    /* JADX INFO: renamed from: n */
    public int f88750n;

    /* JADX INFO: renamed from: o */
    public int f88751o;

    /* JADX INFO: renamed from: p */
    public int f88752p;

    public C22558g(ComponentCallbacks2C4960b componentCallbacks2C4960b, C35046e c35046e, int i13, int i14, C14555a c14555a, Bitmap bitmap) {
        InterfaceC0955b interfaceC0955b = componentCallbacks2C4960b.f20298x;
        C4961c c4961c = componentCallbacks2C4960b.f20300z;
        ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(c4961c.getBaseContext());
        C4964f c4964fM15535w = ComponentCallbacks2C4960b.m15529e(c4961c.getBaseContext()).m15546j().mo15533a(((C29341d) ((C29341d) ((C29341d) new C29341d().m89314d(C40786k.f175892c)).m89330v()).m89326r(true)).m89318i(i13, i14));
        this.f88739c = new ArrayList();
        this.f88740d = componentCallbacks2C4966hM15529e;
        Handler handler = new Handler(Looper.getMainLooper(), new C22557f(this, 0));
        this.f88741e = interfaceC0955b;
        this.f88738b = handler;
        this.f88744h = c4964fM15535w;
        this.f88737a = c35046e;
        m65293i(c14555a, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final ByteBuffer m65285a() {
        return this.f88737a.f148520d.asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m65286b() {
        C22555d c22555d = this.f88745i;
        return c22555d != null ? c22555d.f88733G : this.f88748l;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m65287c() {
        return this.f88748l;
    }

    /* JADX INFO: renamed from: d */
    public final int m65288d() {
        return this.f88737a.f148528l.f148504c;
    }

    /* JADX INFO: renamed from: e */
    public final int m65289e() {
        return this.f88752p;
    }

    /* JADX INFO: renamed from: f */
    public final int m65290f() {
        return this.f88751o;
    }

    /* JADX INFO: renamed from: g */
    public final void m65291g() {
        int i13;
        int i14;
        if (!this.f88742f || this.f88743g) {
            return;
        }
        C22555d c22555d = this.f88749m;
        if (c22555d != null) {
            this.f88749m = null;
            m65292h(c22555d);
            return;
        }
        this.f88743g = true;
        C35046e c35046e = this.f88737a;
        C35044c c35044c = c35046e.f148528l;
        int i15 = c35044c.f148504c;
        if (i15 <= 0 || (i14 = c35046e.f148527k) < 0) {
            i13 = 0;
        } else {
            i13 = (i14 < 0 || i14 >= i15) ? -1 : ((C35043b) c35044c.f148506e.get(i14)).f148499i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i13);
        c35046e.m110776a();
        this.f88747k = new C22555d(this.f88738b, c35046e.f148527k, jUptimeMillis);
        C4964f c4964fM15535w = this.f88744h.mo15533a((C29341d) new C29341d().m89325q(new C32578d(Double.valueOf(Math.random()))));
        c4964fM15535w.f20321Y = c35046e;
        c4964fM15535w.f20323a0 = true;
        c4964fM15535w.m15538z(this.f88747k);
    }

    /* JADX INFO: renamed from: h */
    public final void m65292h(C22555d c22555d) {
        this.f88743g = false;
        boolean z4 = this.f88746j;
        Handler handler = this.f88738b;
        if (z4) {
            handler.obtainMessage(2, c22555d).sendToTarget();
            return;
        }
        if (!this.f88742f) {
            this.f88749m = c22555d;
            return;
        }
        if (c22555d.f88733G != null) {
            Bitmap bitmap = this.f88748l;
            if (bitmap != null) {
                this.f88741e.mo2433h(bitmap);
                this.f88748l = null;
            }
            C22555d c22555d2 = this.f88745i;
            this.f88745i = c22555d;
            ArrayList arrayList = this.f88739c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C22553b c22553b = (C22553b) ((InterfaceC22556e) arrayList.get(size));
                C1913a c1913a = c22553b.f88726w;
                Object callback = c22553b.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c22553b.stop();
                    c22553b.invalidateSelf();
                } else {
                    c22553b.invalidateSelf();
                    C22558g c22558g = (C22558g) c1913a.f7566b;
                    C22555d c22555d3 = c22558g.f88745i;
                    if ((c22555d3 != null ? c22555d3.f88731E : -1) == c22558g.m65288d() - 1) {
                        c22553b.f88721F++;
                    }
                    int i13 = c22553b.f88722G;
                    if (i13 != -1 && c22553b.f88721F >= i13) {
                        c22553b.stop();
                    }
                }
            }
            if (c22555d2 != null) {
                handler.obtainMessage(2, c22555d2).sendToTarget();
            }
        }
        m65291g();
    }

    /* JADX INFO: renamed from: i */
    public final void m65293i(InterfaceC37334l interfaceC37334l, Bitmap bitmap) {
        AbstractC29125c.m88539p(interfaceC37334l, "Argument must not be null");
        AbstractC29125c.m88539p(bitmap, "Argument must not be null");
        this.f88748l = bitmap;
        this.f88744h = this.f88744h.mo15533a(new C29341d().m89329u(interfaceC37334l, true));
        this.f88750n = AbstractC33913l.m107268c(bitmap);
        this.f88751o = bitmap.getWidth();
        this.f88752p = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: j */
    public final void m65294j(C22553b c22553b) {
        if (this.f88746j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.f88739c;
        if (arrayList.contains(c22553b)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(c22553b);
        if (!zIsEmpty || this.f88742f) {
            return;
        }
        this.f88742f = true;
        this.f88746j = false;
        m65291g();
    }

    /* JADX INFO: renamed from: k */
    public final void m65295k(C22553b c22553b) {
        ArrayList arrayList = this.f88739c;
        arrayList.remove(c22553b);
        if (arrayList.isEmpty()) {
            this.f88742f = false;
        }
    }
}
