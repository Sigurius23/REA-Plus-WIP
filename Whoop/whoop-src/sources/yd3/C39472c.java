package yd3;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32306h;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: yd3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C39472c {

    /* JADX INFO: renamed from: a */
    public final C39473d f169835a;

    /* JADX INFO: renamed from: b */
    public final String f169836b;

    /* JADX INFO: renamed from: c */
    public boolean f169837c;

    /* JADX INFO: renamed from: d */
    public AbstractC39470a f169838d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f169839e;

    /* JADX INFO: renamed from: f */
    public boolean f169840f;

    public C39472c(C39473d c39473d, String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f169835a = c39473d;
        this.f169836b = name;
        this.f169839e = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static void m126116c(C39472c c39472c, String name, long j7, InterfaceC4339a block, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        boolean z4 = (i13 & 4) != 0;
        c39472c.getClass();
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(block, "block");
        c39472c.m126120d(new C39471b(block, name, z4), j7);
    }

    /* JADX INFO: renamed from: a */
    public final void m126118a() {
        C39473d c39473d = this.f169835a;
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (c39473d) {
            if (m126119b()) {
                this.f169835a.m126125c(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m126119b() {
        AbstractC39470a abstractC39470a = this.f169838d;
        if (abstractC39470a != null && abstractC39470a.f169830b) {
            this.f169840f = true;
        }
        ArrayList arrayList = this.f169839e;
        boolean z4 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC39470a) arrayList.get(size)).f169830b) {
                Logger logger = this.f169835a.f169844b;
                AbstractC39470a abstractC39470a2 = (AbstractC39470a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC32306h.m100554b(logger, abstractC39470a2, this, "canceled");
                }
                arrayList.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: d */
    public final void m126120d(AbstractC39470a task, long j7) {
        AbstractC22676k.m65750j(task, "task");
        synchronized (this.f169835a) {
            if (!this.f169837c) {
                if (m126121f(task, j7, false)) {
                    this.f169835a.m126125c(this);
                }
            } else if (task.f169830b) {
                Logger logger = this.f169835a.f169844b;
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC32306h.m100554b(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f169835a.f169844b;
                if (logger2.isLoggable(Level.FINE)) {
                    AbstractC32306h.m100554b(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[LOOP:0: B:23:0x0064->B:28:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[EDGE_INSN: B:40:0x007c->B:30:0x007c BREAK  A[LOOP:0: B:23:0x0064->B:28:0x0078], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final boolean m126121f(AbstractC39470a task, long j7, boolean z4) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.f169835a.f169844b;
        AbstractC22676k.m65750j(task, "task");
        C39472c c39472c = task.f169831c;
        if (c39472c != this) {
            if (c39472c != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f169831c = this;
        }
        long jNanoTime = System.nanoTime();
        long j13 = jNanoTime + j7;
        ArrayList arrayList = this.f169839e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f169832d = j13;
            if (logger.isLoggable(Level.FINE)) {
                if (z4) {
                    strConcat = "run again after ".concat(AbstractC32306h.m100566o(j13 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC32306h.m100566o(j13 - jNanoTime));
                }
                AbstractC32306h.m100554b(logger, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC39470a) it.next()).f169832d - jNanoTime > j7) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f169832d > j13) {
            arrayList.remove(iIndexOf);
            task.f169832d = j13;
            if (logger.isLoggable(Level.FINE)) {
                if (z4) {
                    strConcat = "run again after ".concat(AbstractC32306h.m100566o(j13 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC32306h.m100566o(j13 - jNanoTime));
                }
                AbstractC32306h.m100554b(logger, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC39470a) it.next()).f169832d - jNanoTime > j7) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            AbstractC32306h.m100554b(logger, task, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m126122g() {
        C39473d c39473d = this.f169835a;
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (c39473d) {
            this.f169837c = true;
            if (m126119b()) {
                this.f169835a.m126125c(this);
            }
        }
    }

    public final String toString() {
        return this.f169836b;
    }
}
