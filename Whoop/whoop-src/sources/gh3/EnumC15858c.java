package gh3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC30802r;
import p471rx.exceptions.CompositeException;

/* JADX INFO: renamed from: gh3.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15858c {
    ;


    /* JADX INFO: renamed from: w */
    public static final Throwable f59954w = new Throwable("Terminated");

    /* JADX INFO: renamed from: a */
    public static boolean m44774a(AtomicReference atomicReference, Throwable th3) {
        Throwable compositeException;
        while (true) {
            Throwable th4 = (Throwable) atomicReference.get();
            if (th4 == f59954w) {
                return false;
            }
            if (th4 == null) {
                compositeException = th3;
            } else if (th4 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th4).f132385w);
                arrayList.add(th3);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(th4, th3);
            }
            while (!atomicReference.compareAndSet(th4, compositeException)) {
                if (atomicReference.get() != th4) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44775b(Throwable th3) {
        return th3 == f59954w;
    }

    /* JADX INFO: renamed from: c */
    public static Throwable m44776c(AtomicReference atomicReference) {
        Throwable th3 = (Throwable) atomicReference.get();
        Throwable th4 = f59954w;
        return th3 != th4 ? (Throwable) atomicReference.getAndSet(th4) : th3;
    }

    public static EnumC15858c valueOf(String str) {
        AbstractC30802r.m94771t(Enum.valueOf(EnumC15858c.class, str));
        throw null;
    }
}
