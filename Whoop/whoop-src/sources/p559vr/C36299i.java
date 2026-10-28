package p559vr;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import androidx.room.ServiceConnectionC1767b0;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p073cq.C11040i;
import p087db.C11856j0;
import p532ur.C35176e;

/* JADX INFO: renamed from: vr.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C36299i {

    /* JADX INFO: renamed from: n */
    public static final HashMap f155541n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f155542a;

    /* JADX INFO: renamed from: b */
    public final C11856j0 f155543b;

    /* JADX INFO: renamed from: g */
    public boolean f155548g;

    /* JADX INFO: renamed from: h */
    public final Intent f155549h;

    /* JADX INFO: renamed from: l */
    public ServiceConnectionC1767b0 f155553l;

    /* JADX INFO: renamed from: m */
    public InterfaceC36294d f155554m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f155545d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f155546e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f155547f = new Object();

    /* JADX INFO: renamed from: j */
    public final C36296f f155551j = new C36296f(this, 0);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f155552k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f155544c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f155550i = new WeakReference(null);

    public C36299i(Context context, C11856j0 c11856j0, Intent intent) {
        this.f155542a = context;
        this.f155543b = c11856j0;
        this.f155549h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m116020b(C36299i c36299i, C35176e c35176e) {
        InterfaceC36294d interfaceC36294d = c36299i.f155554m;
        C11856j0 c11856j0 = c36299i.f155543b;
        ArrayList<AbstractRunnableC36295e> arrayList = c36299i.f155545d;
        if (interfaceC36294d != null || c36299i.f155548g) {
            if (!c36299i.f155548g) {
                c35176e.run();
                return;
            } else {
                c11856j0.m31831q("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c35176e);
                return;
            }
        }
        c11856j0.m31831q("Initiate binding to the service.", new Object[0]);
        arrayList.add(c35176e);
        ServiceConnectionC1767b0 serviceConnectionC1767b0 = new ServiceConnectionC1767b0(c36299i, 2);
        c36299i.f155553l = serviceConnectionC1767b0;
        c36299i.f155548g = true;
        if (c36299i.f155542a.bindService(c36299i.f155549h, serviceConnectionC1767b0, 1)) {
            return;
        }
        c11856j0.m31831q("Failed to bind to the service.", new Object[0]);
        c36299i.f155548g = false;
        for (AbstractRunnableC36295e abstractRunnableC36295e : arrayList) {
            zzu zzuVar = new zzu();
            C11040i c11040i = abstractRunnableC36295e.f155533w;
            if (c11040i != null) {
                c11040i.m29688c(zzuVar);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m116021a() {
        Handler handler;
        HashMap map = f155541n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f155544c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f155544c, 10);
                    handlerThread.start();
                    map.put(this.f155544c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f155544c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m116022c() {
        HashSet hashSet = this.f155546e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C11040i) it.next()).m29688c(new RemoteException(String.valueOf(this.f155544c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
