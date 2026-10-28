package hx0;

import du0.C12374a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;

/* JADX INFO: renamed from: hx0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Ldu0/a;", "", "maxChunkSize", "Ltr2/n;", "logger", "Lud3/v0;", "a", "(Ljava/util/List;ILtr2/n;)Ljava/util/List;", "data-sync-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17707c {
    /* JADX INFO: renamed from: a */
    public static final List<AbstractC34846v0> m50697a(List<C12374a> list, int i13, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(logger, "logger");
        List<C12374a> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12374a) it.next()).getPayload());
        }
        return AbstractC17705a.m50682a(arrayList, i13, logger);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m50698b(List list, int i13, InterfaceC34116n interfaceC34116n, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 2000000;
        }
        return m50697a(list, i13, interfaceC34116n);
    }
}
