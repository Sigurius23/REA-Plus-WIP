package n83;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p212i6.AbstractC18150c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n83.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C26461d extends AbstractC18150c implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f105099E;

    public C26461d(C26463f map, int i13) {
        this.f105099E = i13;
        AbstractC22676k.m65750j(map, "map");
        this.f70446z = map;
        this.f70444x = -1;
        this.f70445y = map.f105107H;
        m52084c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f105099E) {
            case 0:
                m52083b();
                int i13 = this.f70443w;
                C26463f c26463f = (C26463f) this.f70446z;
                if (i13 >= c26463f.f105105F) {
                    throw new NoSuchElementException();
                }
                this.f70443w = i13 + 1;
                this.f70444x = i13;
                C26462e c26462e = new C26462e(c26463f, i13);
                m52084c();
                return c26462e;
            case 1:
                m52083b();
                int i14 = this.f70443w;
                C26463f c26463f2 = (C26463f) this.f70446z;
                if (i14 >= c26463f2.f105105F) {
                    throw new NoSuchElementException();
                }
                this.f70443w = i14 + 1;
                this.f70444x = i14;
                Object obj = c26463f2.f105113w[i14];
                m52084c();
                return obj;
            default:
                m52083b();
                int i15 = this.f70443w;
                C26463f c26463f3 = (C26463f) this.f70446z;
                if (i15 >= c26463f3.f105105F) {
                    throw new NoSuchElementException();
                }
                this.f70443w = i15 + 1;
                this.f70444x = i15;
                Object[] objArr = c26463f3.f105114x;
                AbstractC22676k.m65747g(objArr);
                Object obj2 = objArr[this.f70444x];
                m52084c();
                return obj2;
        }
    }
}
