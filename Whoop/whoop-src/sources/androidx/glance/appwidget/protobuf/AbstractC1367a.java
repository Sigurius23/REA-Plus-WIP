package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1367a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public static void m4268a(Iterable iterable, List list) {
        Charset charset = AbstractC1383f0.f5887a;
        if (!(iterable instanceof InterfaceC1389h0)) {
            if (iterable instanceof InterfaceC1428x0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listM4340b = ((InterfaceC1389h0) iterable).m4340b();
        InterfaceC1389h0 interfaceC1389h0 = (InterfaceC1389h0) list;
        int size3 = list.size();
        for (Object obj2 : listM4340b) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC1389h0.size() - size3) + " is null.";
                for (int size4 = interfaceC1389h0.size() - 1; size4 >= size3; size4--) {
                    interfaceC1389h0.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof AbstractC1391i) {
                interfaceC1389h0.m4342x0();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                AbstractC1391i.m4353d(bArr, 0, bArr.length);
                interfaceC1389h0.m4342x0();
            } else {
                interfaceC1389h0.add((String) obj2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo4269b(InterfaceC1372b1 interfaceC1372b1);
}
