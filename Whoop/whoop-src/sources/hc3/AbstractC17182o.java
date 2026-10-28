package hc3;

import bc3.AbstractC3069w1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: hc3.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17182o {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3069w1 f65999a;

    static {
        String property;
        int i13 = AbstractC17192y.f66011a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List listM122276E = AbstractC38176k.m122276E(AbstractC38176k.m122278n(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = listM122276E.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iMo48538b = ((MainDispatcherFactory) next).mo48538b();
                do {
                    Object next2 = it.next();
                    int iMo48538b2 = ((MainDispatcherFactory) next2).mo48538b();
                    if (iMo48538b < iMo48538b2) {
                        next = next2;
                        iMo48538b = iMo48538b2;
                    }
                } while (it.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f65999a = mainDispatcherFactory.mo48537a(listM122276E);
    }
}
