package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5138f0 extends AbstractC5144h0 {

    /* JADX INFO: renamed from: c */
    public static final Class f21507c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m16168d(long j7, Object obj, int i13) {
        List listMo16111i;
        List list = (List) AbstractC5160m1.f21551c.m16249i(j7, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC5135e0) {
                listMo16111i = new C5132d0(i13);
            } else {
                listMo16111i = ((list instanceof InterfaceC5183w0) && (list instanceof InterfaceC5123a0)) ? ((InterfaceC5123a0) list).mo16111i(i13) : new ArrayList(i13);
            }
            AbstractC5160m1.m16292p(j7, obj, listMo16111i);
            return listMo16111i;
        }
        if (f21507c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i13);
            arrayList.addAll(list);
            AbstractC5160m1.m16292p(j7, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C5145h1) {
            C5132d0 c5132d0 = new C5132d0(list.size() + i13);
            c5132d0.addAll((C5145h1) list);
            AbstractC5160m1.m16292p(j7, obj, c5132d0);
            return c5132d0;
        }
        if ((list instanceof InterfaceC5183w0) && (list instanceof InterfaceC5123a0)) {
            InterfaceC5123a0 interfaceC5123a0 = (InterfaceC5123a0) list;
            if (!((AbstractC5125b) interfaceC5123a0).f21478w) {
                InterfaceC5123a0 interfaceC5123a0Mo16111i = interfaceC5123a0.mo16111i(list.size() + i13);
                AbstractC5160m1.m16292p(j7, obj, interfaceC5123a0Mo16111i);
                return interfaceC5123a0Mo16111i;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: a */
    public final void mo16169a(long j7, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC5160m1.f21551c.m16249i(j7, obj);
        if (list instanceof InterfaceC5135e0) {
            objUnmodifiableList = ((InterfaceC5135e0) list).mo16156k();
        } else {
            if (f21507c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC5183w0) && (list instanceof InterfaceC5123a0)) {
                AbstractC5125b abstractC5125b = (AbstractC5125b) ((InterfaceC5123a0) list);
                boolean z4 = abstractC5125b.f21478w;
                if (z4 && z4) {
                    abstractC5125b.f21478w = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC5160m1.m16292p(j7, obj, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: b */
    public final void mo16170b(long j7, Object obj, Object obj2) {
        List list = (List) AbstractC5160m1.f21551c.m16249i(j7, obj2);
        List listM16168d = m16168d(j7, obj, list.size());
        int size = listM16168d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM16168d.addAll(list);
        }
        if (size > 0) {
            list = listM16168d;
        }
        AbstractC5160m1.m16292p(j7, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: c */
    public final List mo16171c(long j7, Object obj) {
        return m16168d(j7, obj, 10);
    }
}
