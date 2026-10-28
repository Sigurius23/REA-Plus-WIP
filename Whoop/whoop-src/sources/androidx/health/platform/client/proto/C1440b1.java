package androidx.health.platform.client.proto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1440b1 extends AbstractC1450d1 {

    /* JADX INFO: renamed from: c */
    public static final Class f6022c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // androidx.health.platform.client.proto.AbstractC1450d1
    /* JADX INFO: renamed from: a */
    public final void mo4576a(long j7, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC1502n3.f6075c.m4711i(j7, obj);
        if (list instanceof InterfaceC1435a1) {
            objUnmodifiableList = ((InterfaceC1435a1) list).mo4567k();
        } else {
            if (f6022c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1550x1) && (list instanceof InterfaceC1544w0)) {
                AbstractC1438b abstractC1438b = (AbstractC1438b) ((InterfaceC1544w0) list);
                if (abstractC1438b.f6021w) {
                    abstractC1438b.f6021w = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1502n3.m4733o(j7, obj, objUnmodifiableList);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1450d1
    /* JADX INFO: renamed from: b */
    public final void mo4577b(long j7, Object obj, Object obj2) {
        List list;
        List list2;
        List listMo4923i;
        AbstractC1497m3 abstractC1497m3 = AbstractC1502n3.f6075c;
        List list3 = (List) abstractC1497m3.m4711i(j7, obj2);
        int size = list3.size();
        List list4 = (List) abstractC1497m3.m4711i(j7, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof InterfaceC1435a1) {
                listMo4923i = new C1557z0(size);
            } else {
                listMo4923i = ((list4 instanceof InterfaceC1550x1) && (list4 instanceof InterfaceC1544w0)) ? ((InterfaceC1544w0) list4).mo4923i(size) : new ArrayList(size);
            }
            AbstractC1502n3.m4733o(j7, obj, listMo4923i);
            list2 = listMo4923i;
        } else {
            if (f6022c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                AbstractC1502n3.m4733o(j7, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof C1477i3) {
                C1557z0 c1557z0 = new C1557z0(list4.size() + size);
                c1557z0.addAll((C1477i3) list4);
                AbstractC1502n3.m4733o(j7, obj, c1557z0);
                list = c1557z0;
            } else if ((list4 instanceof InterfaceC1550x1) && (list4 instanceof InterfaceC1544w0)) {
                InterfaceC1544w0 interfaceC1544w0 = (InterfaceC1544w0) list4;
                if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    InterfaceC1544w0 interfaceC1544w0Mo4923i = interfaceC1544w0.mo4923i(list4.size() + size);
                    AbstractC1502n3.m4733o(j7, obj, interfaceC1544w0Mo4923i);
                    list2 = interfaceC1544w0Mo4923i;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        AbstractC1502n3.m4733o(j7, obj, list3);
    }
}
