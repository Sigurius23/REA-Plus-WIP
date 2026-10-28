package p185h6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.RunnableC1645z0;
import bd3.C3143v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p031b9.AbstractC2875y;
import p044c5.AbstractC4211c;
import p044c5.C4212d;
import p044c5.C4217i;
import p437qt.C30582e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C16964s implements InterfaceC16954i {

    /* JADX INFO: renamed from: a */
    public final Context f65105a;

    /* JADX INFO: renamed from: b */
    public final C4212d f65106b;

    /* JADX INFO: renamed from: c */
    public final C30582e f65107c;

    /* JADX INFO: renamed from: d */
    public final Object f65108d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f65109e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f65110f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f65111g;

    /* JADX INFO: renamed from: h */
    public AbstractC37056f f65112h;

    public C16964s(Context context, C4212d c4212d) {
        AbstractC37056f.m118993q(context, "Context cannot be null");
        this.f65105a = context.getApplicationContext();
        this.f65106b = c4212d;
        this.f65107c = C16965t.f65113d;
    }

    @Override // p185h6.InterfaceC16954i
    /* JADX INFO: renamed from: a */
    public final void mo9715a(AbstractC37056f abstractC37056f) {
        synchronized (this.f65108d) {
            this.f65112h = abstractC37056f;
        }
        synchronized (this.f65108d) {
            try {
                if (this.f65112h == null) {
                    return;
                }
                if (this.f65110f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC16946a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f65111g = threadPoolExecutor;
                    this.f65110f = threadPoolExecutor;
                }
                this.f65110f.execute(new RunnableC1645z0(this, 5));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m47721b() {
        synchronized (this.f65108d) {
            try {
                this.f65112h = null;
                Handler handler = this.f65109e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f65109e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f65111g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f65110f = null;
                this.f65111g = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C4217i m47722c() {
        try {
            C30582e c30582e = this.f65107c;
            Context context = this.f65105a;
            C4212d c4212d = this.f65106b;
            c30582e.getClass();
            Object[] objArr = {c4212d};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C3143v c3143vM13075a = AbstractC4211c.m13075a(context, Collections.unmodifiableList(arrayList));
            int i13 = c3143vM13075a.f12310x;
            if (i13 != 0) {
                throw new RuntimeException(AbstractC2875y.m8296i(i13, "fetchFonts failed (", ")"));
            }
            C4217i[] c4217iArr = (C4217i[]) ((List) c3143vM13075a.f12311y).get(0);
            if (c4217iArr == null || c4217iArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c4217iArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }
}
