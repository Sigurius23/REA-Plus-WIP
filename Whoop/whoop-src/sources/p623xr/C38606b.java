package p623xr;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import androidx.room.ServiceConnectionC1767b0;
import com.google.android.play.integrity.internal.C5077af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import ng3.C26702o;
import p073cq.C11040i;
import p559vr.C36296f;
import sr.AbstractC32899g;

/* JADX INFO: renamed from: xr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38606b {

    /* JADX INFO: renamed from: o */
    public static final HashMap f166093o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f166094a;

    /* JADX INFO: renamed from: b */
    public final C38624t f166095b;

    /* JADX INFO: renamed from: g */
    public boolean f166100g;

    /* JADX INFO: renamed from: h */
    public final Intent f166101h;

    /* JADX INFO: renamed from: i */
    public final C26702o f166102i;

    /* JADX INFO: renamed from: m */
    public ServiceConnectionC1767b0 f166106m;

    /* JADX INFO: renamed from: n */
    public InterfaceC38622r f166107n;

    /* JADX INFO: renamed from: d */
    public final ArrayList f166097d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f166098e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f166099f = new Object();

    /* JADX INFO: renamed from: k */
    public final C36296f f166104k = new C36296f(this, 1);

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f166105l = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f166096c = "ExpressIntegrityService";

    /* JADX INFO: renamed from: j */
    public final WeakReference f166103j = new WeakReference(null);

    public C38606b(Context context, C38624t c38624t, Intent intent, C26702o c26702o) {
        this.f166094a = context;
        this.f166095b = c38624t;
        this.f166101h = intent;
        this.f166102i = c26702o;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m123802b(C38606b c38606b, AbstractC32899g abstractC32899g) {
        InterfaceC38622r interfaceC38622r = c38606b.f166107n;
        C38624t c38624t = c38606b.f166095b;
        ArrayList arrayList = c38606b.f166097d;
        if (interfaceC38622r != null || c38606b.f166100g) {
            if (!c38606b.f166100g) {
                abstractC32899g.run();
                return;
            } else {
                c38624t.m123818b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractC32899g);
                return;
            }
        }
        c38624t.m123818b("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractC32899g);
        ServiceConnectionC1767b0 serviceConnectionC1767b0 = new ServiceConnectionC1767b0(c38606b, 3);
        c38606b.f166106m = serviceConnectionC1767b0;
        c38606b.f166100g = true;
        if (c38606b.f166094a.bindService(c38606b.f166101h, serviceConnectionC1767b0, 1)) {
            return;
        }
        c38624t.m123818b("Failed to bind to the service.", new Object[0]);
        c38606b.f166100g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC38625u) it.next()).mo103294a(new C5077af());
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m123803a() {
        Handler handler;
        HashMap map = f166093o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f166096c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f166096c, 10);
                    handlerThread.start();
                    map.put(this.f166096c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f166096c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m123804c(C11040i c11040i) {
        synchronized (this.f166099f) {
            this.f166098e.remove(c11040i);
        }
        m123803a().post(new C38605a(this, 1));
    }

    /* JADX INFO: renamed from: d */
    public final void m123805d() {
        HashSet hashSet = this.f166098e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C11040i) it.next()).m29688c(new RemoteException(String.valueOf(this.f166096c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
