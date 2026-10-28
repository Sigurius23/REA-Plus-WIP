package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n83.C26460c;
import p002a0.C0030i1;
import p518ub.InterfaceC34735h;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.room.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1805l extends AbstractC1825r1 {
    public abstract void bind(InterfaceC34735h interfaceC34735h, Object obj);

    public final void insert(Object obj) {
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            bind(interfaceC34735hAcquire, obj);
            interfaceC34735hAcquire.mo109677i0();
        } finally {
            release(interfaceC34735hAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            bind(interfaceC34735hAcquire, obj);
            return interfaceC34735hAcquire.mo109677i0();
        } finally {
            release(interfaceC34735hAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i13 = 0;
            for (Object obj : entities) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                bind(interfaceC34735hAcquire, obj);
                jArr[i13] = interfaceC34735hAcquire.mo109677i0();
                i13 = i14;
            }
            release(interfaceC34735hAcquire);
            return jArr;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        Iterator<Object> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i13 = 0; i13 < size; i13++) {
                bind(interfaceC34735hAcquire, it.next());
                lArr[i13] = Long.valueOf(interfaceC34735hAcquire.mo109677i0());
            }
            release(interfaceC34735hAcquire);
            return lArr;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            for (Object obj : entities) {
                bind(interfaceC34735hAcquire, obj);
                c26460cM119000x.add(Long.valueOf(interfaceC34735hAcquire.mo109677i0()));
            }
            return AbstractC37056f.m118988k(c26460cM119000x);
        } finally {
            release(interfaceC34735hAcquire);
        }
    }

    public final void insert(Object[] entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            for (Object obj : entities) {
                bind(interfaceC34735hAcquire, obj);
                interfaceC34735hAcquire.mo109677i0();
            }
            release(interfaceC34735hAcquire);
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i13 = 0; i13 < length; i13++) {
                bind(interfaceC34735hAcquire, c0030i1M65777h.next());
                lArr[i13] = Long.valueOf(interfaceC34735hAcquire.mo109677i0());
            }
            release(interfaceC34735hAcquire);
            return lArr;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(interfaceC34735hAcquire, it.next());
                c26460cM119000x.add(Long.valueOf(interfaceC34735hAcquire.mo109677i0()));
            }
            return AbstractC37056f.m118988k(c26460cM119000x);
        } finally {
            release(interfaceC34735hAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = i14 + 1;
                bind(interfaceC34735hAcquire, entities[i13]);
                jArr[i14] = interfaceC34735hAcquire.mo109677i0();
                i13++;
                i14 = i15;
            }
            release(interfaceC34735hAcquire);
            return jArr;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final void insert(Iterable<Object> entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            while (it.hasNext()) {
                bind(interfaceC34735hAcquire, it.next());
                interfaceC34735hAcquire.mo109677i0();
            }
            release(interfaceC34735hAcquire);
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }
}
