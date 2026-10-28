package io.sentry.transport;

import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20418m;
import io.sentry.util.C20579a;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.transport.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20567q implements Closeable {

    /* JADX INFO: renamed from: x */
    public final C20513q6 f77045x;

    /* JADX INFO: renamed from: y */
    public final ConcurrentHashMap f77046y = new ConcurrentHashMap();

    /* JADX INFO: renamed from: z */
    public final CopyOnWriteArrayList f77047z = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: E */
    public Timer f77042E = null;

    /* JADX INFO: renamed from: F */
    public final C20579a f77043F = new C20579a();

    /* JADX INFO: renamed from: w */
    public final C20554d f77044w = C20554d.f77025w;

    public C20567q(C20513q6 c20513q6) {
        this.f77045x = c20513q6;
    }

    /* JADX INFO: renamed from: b */
    public final void m56687b(EnumC20418m enumC20418m, Date date) {
        ConcurrentHashMap concurrentHashMap = this.f77046y;
        Date date2 = (Date) concurrentHashMap.get(enumC20418m);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC20418m, date);
            Iterator it = this.f77047z.iterator();
            while (it.hasNext()) {
                ((InterfaceC20566p) it.next()).mo55955k(this);
            }
            C20535s c20535sM56711a = this.f77043F.m56711a();
            try {
                if (this.f77042E == null) {
                    this.f77042E = new Timer(true);
                }
                this.f77042E.schedule(new C20565o(this), date);
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f77043F.m56711a();
        try {
            Timer timer = this.f77042E;
            if (timer != null) {
                timer.cancel();
                this.f77042E = null;
            }
            c20535sM56711a.close();
            this.f77047z.clear();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m56688h(EnumC20418m enumC20418m) {
        Date date;
        this.f77044w.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        EnumC20418m enumC20418m2 = EnumC20418m.All;
        ConcurrentHashMap concurrentHashMap = this.f77046y;
        Date date3 = (Date) concurrentHashMap.get(enumC20418m2);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC20418m.Unknown.equals(enumC20418m) || (date = (Date) concurrentHashMap.get(enumC20418m)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
