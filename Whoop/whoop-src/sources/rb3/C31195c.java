package rb3;

import java.util.Arrays;
import java.util.Iterator;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C31195c extends AbstractC31193a {

    /* JADX INFO: renamed from: w */
    public Object[] f128519w = new Object[20];

    /* JADX INFO: renamed from: x */
    public int f128520x = 0;

    @Override // rb3.AbstractC31193a
    /* JADX INFO: renamed from: a */
    public final int mo96145a() {
        return this.f128520x;
    }

    @Override // rb3.AbstractC31193a
    /* JADX INFO: renamed from: c */
    public final void mo96146c(int i13, Object value) {
        AbstractC22676k.m65750j(value, "value");
        Object[] objArr = this.f128519w;
        if (objArr.length <= i13) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i13);
            Object[] objArrCopyOf = Arrays.copyOf(this.f128519w, length);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f128519w = objArrCopyOf;
        }
        Object[] objArr2 = this.f128519w;
        if (objArr2[i13] == null) {
            this.f128520x++;
        }
        objArr2[i13] = value;
    }

    @Override // rb3.AbstractC31193a
    public final Object get(int i13) {
        return AbstractC25260n.m74084y0(i13, this.f128519w);
    }

    @Override // rb3.AbstractC31193a, java.lang.Iterable
    public final Iterator iterator() {
        return new C31194b(this);
    }
}
