package kotlinx.coroutines.test.internal;

import bc3.AbstractC3069w1;
import hc3.C17184q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import oc3.C27821d;
import p714k80.C22275d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "kotlinx-coroutines-test"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class TestMainDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: a */
    public final AbstractC3069w1 mo48537a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((MainDispatcherFactory) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
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
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory == null) {
            mainDispatcherFactory = C17184q.f66000a;
        }
        return new C27821d(new C22275d(mainDispatcherFactory, arrayList, this));
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: b */
    public final int mo48538b() {
        return Integer.MAX_VALUE;
    }
}
