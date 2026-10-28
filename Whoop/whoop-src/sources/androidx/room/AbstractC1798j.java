package androidx.room;

import java.util.Iterator;
import p518ub.InterfaceC34735h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1798j extends AbstractC1825r1 {
    public abstract void bind(InterfaceC34735h interfaceC34735h, Object obj);

    public final int handle(Object obj) {
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            bind(interfaceC34735hAcquire, obj);
            return interfaceC34735hAcquire.mo109676F();
        } finally {
            release(interfaceC34735hAcquire);
        }
    }

    public final int handleMultiple(Iterable<Object> entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            int iMo109676F = 0;
            while (it.hasNext()) {
                bind(interfaceC34735hAcquire, it.next());
                iMo109676F += interfaceC34735hAcquire.mo109676F();
            }
            release(interfaceC34735hAcquire);
            return iMo109676F;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }

    public final int handleMultiple(Object[] entities) {
        AbstractC22676k.m65750j(entities, "entities");
        InterfaceC34735h interfaceC34735hAcquire = acquire();
        try {
            int iMo109676F = 0;
            for (Object obj : entities) {
                bind(interfaceC34735hAcquire, obj);
                iMo109676F += interfaceC34735hAcquire.mo109676F();
            }
            release(interfaceC34735hAcquire);
            return iMo109676F;
        } catch (Throwable th3) {
            release(interfaceC34735hAcquire);
            throw th3;
        }
    }
}
