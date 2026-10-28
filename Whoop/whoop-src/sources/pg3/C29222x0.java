package pg3;

import com.iterable.iterableapi.C5378v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ud3.C34810e0;
import ud3.C34826l0;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: pg3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29222x0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC34819i f118281a;

    /* JADX INFO: renamed from: b */
    public C34810e0 f118282b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f118283c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f118284d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Executor f118285e;

    public C29222x0() {
    }

    /* JADX INFO: renamed from: a */
    public final void m88727a(AbstractC29185f abstractC29185f) {
        Objects.requireNonNull(abstractC29185f, "factory == null");
        this.f118284d.add(abstractC29185f);
    }

    /* JADX INFO: renamed from: b */
    public final void m88728b(AbstractC29199m abstractC29199m) {
        Objects.requireNonNull(abstractC29199m, "factory == null");
        this.f118283c.add(abstractC29199m);
    }

    /* JADX INFO: renamed from: c */
    public final void m88729c(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        C5378v c5378v = new C5378v(1);
        c5378v.m16528d(null, str);
        C34810e0 c34810e0M16526b = c5378v.m16526b();
        ArrayList arrayList = c34810e0M16526b.f146567f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.f118282b = c34810e0M16526b;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c34810e0M16526b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C29224y0 m88730d() {
        if (this.f118282b == null) {
            throw new IllegalStateException("Base URL required.");
        }
        InterfaceC34819i c34826l0 = this.f118281a;
        if (c34826l0 == null) {
            c34826l0 = new C34826l0();
        }
        InterfaceC34819i interfaceC34819i = c34826l0;
        Executor executor = this.f118285e;
        if (executor == null) {
            executor = AbstractC29204o0.f118200a;
        }
        Executor executor2 = executor;
        C29173b c29173b = AbstractC29204o0.f118202c;
        ArrayList arrayList = new ArrayList(this.f118284d);
        List listMo88667a = c29173b.mo88667a(executor2);
        arrayList.addAll(listMo88667a);
        List listMo88668b = c29173b.mo88668b();
        int size = listMo88668b.size();
        ArrayList arrayList2 = this.f118283c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new C29176c(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listMo88668b);
        return new C29224y0(interfaceC34819i, this.f118282b, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList), listMo88667a.size(), executor2);
    }

    /* JADX INFO: renamed from: e */
    public final void m88731e(C34826l0 c34826l0) {
        Objects.requireNonNull(c34826l0, "client == null");
        this.f118281a = c34826l0;
    }

    public C29222x0(C29224y0 c29224y0) {
        InterfaceC34819i interfaceC34819i = c29224y0.f118289b;
        List list = c29224y0.f118293f;
        this.f118281a = interfaceC34819i;
        this.f118282b = c29224y0.f118290c;
        List list2 = c29224y0.f118291d;
        int size = list2.size() - c29224y0.f118292e;
        for (int i13 = 1; i13 < size; i13++) {
            this.f118283c.add((AbstractC29199m) list2.get(i13));
        }
        int size2 = list.size() - c29224y0.f118294g;
        for (int i14 = 0; i14 < size2; i14++) {
            this.f118284d.add((AbstractC29185f) list.get(i14));
        }
        this.f118285e = c29224y0.f118295h;
    }
}
