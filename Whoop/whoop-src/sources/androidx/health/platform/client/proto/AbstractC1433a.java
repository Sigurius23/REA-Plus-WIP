package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1433a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public static void m4562a(Iterable iterable, List list) {
        Charset charset = AbstractC1549x0.f6150a;
        iterable.getClass();
        if (iterable instanceof InterfaceC1435a1) {
            List listMo4566b = ((InterfaceC1435a1) iterable).mo4566b();
            InterfaceC1435a1 interfaceC1435a1 = (InterfaceC1435a1) list;
            int size = list.size();
            for (Object obj : listMo4566b) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1435a1.size() - size) + " is null.";
                    for (int size2 = interfaceC1435a1.size() - 1; size2 >= size; size2--) {
                        interfaceC1435a1.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1468h) {
                    interfaceC1435a1.mo4565M0((C1468h) obj);
                } else {
                    interfaceC1435a1.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1550x1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo4563b(InterfaceC1536u2 interfaceC1536u2);

    /* JADX INFO: renamed from: c */
    public abstract void mo4564c(C1483k c1483k);
}
