package yd3;

import androidx.databinding.RunnableC1189s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p031b9.AbstractC2875y;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.C34671d0;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import wd3.ThreadFactoryC37173g;

/* JADX INFO: renamed from: yd3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C39473d {

    /* JADX INFO: renamed from: k */
    public static final Logger f169841k;

    /* JADX INFO: renamed from: l */
    public static final C39473d f169842l;

    /* JADX INFO: renamed from: a */
    public final C34671d0 f169843a;

    /* JADX INFO: renamed from: b */
    public final Logger f169844b;

    /* JADX INFO: renamed from: c */
    public int f169845c;

    /* JADX INFO: renamed from: d */
    public boolean f169846d;

    /* JADX INFO: renamed from: e */
    public long f169847e;

    /* JADX INFO: renamed from: f */
    public int f169848f;

    /* JADX INFO: renamed from: g */
    public int f169849g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f169850h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f169851i;

    /* JADX INFO: renamed from: j */
    public final RunnableC1189s f169852j;

    static {
        Logger logger = Logger.getLogger(C39473d.class.getName());
        AbstractC22676k.m65749i(logger, "getLogger(...)");
        f169841k = logger;
        String name = AbstractC37174h.f158963b + " TaskRunner";
        AbstractC22676k.m65750j(name, "name");
        f169842l = new C39473d(new C34671d0(new ThreadFactoryC37173g(name, true)));
    }

    public C39473d(C34671d0 c34671d0) {
        Logger logger = f169841k;
        AbstractC22676k.m65750j(logger, "logger");
        this.f169843a = c34671d0;
        this.f169844b = logger;
        this.f169845c = InterfaceC33561b.INVALID_OWNERSHIP;
        this.f169850h = new ArrayList();
        this.f169851i = new ArrayList();
        this.f169852j = new RunnableC1189s(this, 7);
    }

    /* JADX INFO: renamed from: a */
    public static final void m126123a(C39473d c39473d, AbstractC39470a abstractC39470a, long j7, boolean z4) {
        TimeZone timeZone = AbstractC37174h.f158962a;
        C39472c c39472c = abstractC39470a.f169831c;
        AbstractC22676k.m65747g(c39472c);
        if (c39472c.f169838d != abstractC39470a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z13 = c39472c.f169840f;
        c39472c.f169840f = false;
        c39472c.f169838d = null;
        c39473d.f169850h.remove(c39472c);
        if (j7 != -1 && !z13 && !c39472c.f169837c) {
            c39472c.m126121f(abstractC39470a, j7, true);
        }
        if (c39472c.f169839e.isEmpty()) {
            return;
        }
        c39473d.f169851i.add(c39472c);
        if (z4) {
            return;
        }
        c39473d.m126127e();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC39470a m126124b() {
        boolean z4;
        TimeZone timeZone = AbstractC37174h.f158962a;
        while (true) {
            ArrayList arrayList = this.f169851i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC39470a abstractC39470a = null;
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                AbstractC39470a abstractC39470a2 = (AbstractC39470a) ((C39472c) it.next()).f169839e.get(0);
                long jMax = Math.max(0L, abstractC39470a2.f169832d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC39470a != null) {
                        z4 = true;
                        break;
                    }
                    abstractC39470a = abstractC39470a2;
                }
            }
            ArrayList arrayList2 = this.f169850h;
            if (abstractC39470a != null) {
                TimeZone timeZone2 = AbstractC37174h.f158962a;
                abstractC39470a.f169832d = -1L;
                C39472c c39472c = abstractC39470a.f169831c;
                AbstractC22676k.m65747g(c39472c);
                c39472c.f169839e.remove(abstractC39470a);
                arrayList.remove(c39472c);
                c39472c.f169838d = abstractC39470a;
                arrayList2.add(c39472c);
                if (z4 || (!this.f169846d && !arrayList.isEmpty())) {
                    m126127e();
                }
                return abstractC39470a;
            }
            if (this.f169846d) {
                if (jMin >= this.f169847e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.f169846d = true;
            this.f169847e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = AbstractC37174h.f158962a;
                    if (jMin > 0) {
                        long j7 = jMin / 1000000;
                        long j13 = jMin - (1000000 * j7);
                        if (j7 > 0 || jMin > 0) {
                            wait(j7, (int) j13);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = AbstractC37174h.f158962a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C39472c) arrayList2.get(size)).m126119b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        C39472c c39472c2 = (C39472c) arrayList.get(size2);
                        c39472c2.m126119b();
                        if (c39472c2.f169839e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f169846d = false;
            } catch (Throwable th3) {
                this.f169846d = false;
                throw th3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m126125c(C39472c taskQueue) {
        AbstractC22676k.m65750j(taskQueue, "taskQueue");
        TimeZone timeZone = AbstractC37174h.f158962a;
        if (taskQueue.f169838d == null) {
            boolean zIsEmpty = taskQueue.f169839e.isEmpty();
            ArrayList arrayList = this.f169851i;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = AbstractC37172f.f158958a;
                AbstractC22676k.m65750j(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f169846d) {
            notify();
        } else {
            m126127e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final C39472c m126126d() {
        int i13;
        synchronized (this) {
            i13 = this.f169845c;
            this.f169845c = i13 + 1;
        }
        return new C39472c(this, AbstractC2875y.m8295h(i13, "Q"));
    }

    /* JADX INFO: renamed from: e */
    public final void m126127e() {
        TimeZone timeZone = AbstractC37174h.f158962a;
        int i13 = this.f169848f;
        if (i13 > this.f169849g) {
            return;
        }
        this.f169848f = i13 + 1;
        RunnableC1189s runnable = this.f169852j;
        AbstractC22676k.m65750j(runnable, "runnable");
        ((ThreadPoolExecutor) this.f169843a.f146043w).execute(runnable);
    }
}
