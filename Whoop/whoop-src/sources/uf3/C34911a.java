package uf3;

import ag3.AbstractC0865a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25265s;
import org.koin.core.error.NoParameterFoundException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34911a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f147011a;

    public C34911a(ArrayList arrayList) {
        this.f147011a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Object m110110a(int i13, InterfaceC21461d clazz) throws NoParameterFoundException {
        AbstractC22676k.m65750j(clazz, "clazz");
        ArrayList arrayList = this.f147011a;
        if (arrayList.size() > i13) {
            return arrayList.get(i13);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i13 + " from " + this + " for type '" + AbstractC0865a.m2111a(clazz) + '\'');
    }

    /* JADX INFO: renamed from: b */
    public final Object m110111b(InterfaceC21461d clazz) {
        Object obj;
        AbstractC22676k.m65750j(clazz, "clazz");
        Iterator it = this.f147011a.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (clazz.isInstance(next)) {
                obj = next;
            }
        } while (obj == null);
        return obj;
    }

    public final String toString() {
        return AbstractC22676k.m65755o(AbstractC25265s.m74093D1(this.f147011a), "DefinitionParameters");
    }
}
