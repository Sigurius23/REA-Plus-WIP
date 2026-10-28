package rw;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p108e4.AbstractC12682p;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.EnumC28428x;
import p440qw.C30679n;
import p555vl.AbstractC36095b;
import p563vw.C36540a;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: rw.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C31860j extends AbstractC28430z {

    /* JADX INFO: renamed from: c */
    public static final C31858h f132126c = new C31858h(EnumC28428x.f114645w, 1);

    /* JADX INFO: renamed from: a */
    public final C28417m f132127a;

    /* JADX INFO: renamed from: b */
    public final EnumC28428x f132128b;

    public C31860j(C28417m c28417m, EnumC28428x enumC28428x) {
        this.f132127a = c28417m;
        this.f132128b = enumC28428x;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        Object arrayList;
        Serializable arrayList2;
        int iM121062o0 = c37653a.m121062o0();
        int iM35485e = AbstractC12682p.m35485e(iM121062o0);
        if (iM35485e == 0) {
            c37653a.beginArray();
            arrayList = new ArrayList();
        } else if (iM35485e != 2) {
            arrayList = null;
        } else {
            c37653a.beginObject();
            arrayList = new C30679n(true);
        }
        if (arrayList == null) {
            return m99046d(c37653a, iM121062o0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c37653a.hasNext()) {
                String strNextName = arrayList instanceof Map ? c37653a.nextName() : null;
                int iM121062o1 = c37653a.m121062o0();
                int iM35485e2 = AbstractC12682p.m35485e(iM121062o1);
                if (iM35485e2 == 0) {
                    c37653a.beginArray();
                    arrayList2 = new ArrayList();
                } else if (iM35485e2 != 2) {
                    arrayList2 = null;
                } else {
                    c37653a.beginObject();
                    arrayList2 = new C30679n(true);
                }
                boolean z4 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m99046d(c37653a, iM121062o1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strNextName, arrayList2);
                }
                if (z4) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c37653a.endArray();
                } else {
                    c37653a.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        if (obj == null) {
            c37654b.m121076m();
            return;
        }
        Class<?> cls = obj.getClass();
        C28417m c28417m = this.f132127a;
        c28417m.getClass();
        AbstractC28430z abstractC28430zM86136c = c28417m.m86136c(new C36540a(cls));
        if (!(abstractC28430zM86136c instanceof C31860j)) {
            abstractC28430zM86136c.mo86133c(c37654b, obj);
        } else {
            c37654b.beginObject();
            c37654b.endObject();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Serializable m99046d(C37653a c37653a, int i13) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 5) {
            return c37653a.nextString();
        }
        if (iM35485e == 6) {
            return this.f132128b.mo86143a(c37653a);
        }
        if (iM35485e == 7) {
            return Boolean.valueOf(c37653a.m121065x());
        }
        if (iM35485e != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC36095b.m114672B(i13)));
        }
        c37653a.m121053T();
        return null;
    }
}
