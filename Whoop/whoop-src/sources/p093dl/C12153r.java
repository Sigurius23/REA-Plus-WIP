package p093dl;

import java.util.ArrayDeque;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: dl.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C12153r {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f40405b;

    /* JADX INFO: renamed from: a */
    public Object f40406a;

    static {
        char[] cArr = AbstractC33913l.f142093a;
        f40405b = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public static C12153r m33615a(Object obj) {
        C12153r c12153r;
        ArrayDeque arrayDeque = f40405b;
        synchronized (arrayDeque) {
            c12153r = (C12153r) arrayDeque.poll();
        }
        if (c12153r == null) {
            c12153r = new C12153r();
        }
        c12153r.f40406a = obj;
        return c12153r;
    }

    /* JADX INFO: renamed from: b */
    public final void m33616b() {
        ArrayDeque arrayDeque = f40405b;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C12153r) && this.f40406a.equals(((C12153r) obj).f40406a);
    }

    public final int hashCode() {
        return this.f40406a.hashCode();
    }
}
