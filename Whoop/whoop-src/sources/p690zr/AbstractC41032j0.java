package p690zr;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: zr.j0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41032j0 extends AbstractC41008b0 implements Set {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f177006y = 0;

    /* JADX INFO: renamed from: x */
    public transient AbstractC41023g0 f177007x;

    /* JADX INFO: renamed from: j */
    public static int m133262j(int i13) {
        int iMax = Math.max(i13, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC41032j0 m133263l(int i13, Object... objArr) {
        if (i13 == 0) {
            return C41012c1.f176973J;
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C41030i1(obj);
        }
        int iM133262j = m133262j(i13);
        Object[] objArr2 = new Object[iM133262j];
        int i14 = iM133262j - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            Object obj2 = objArr[i17];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC2875y.m8295h(i17, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM133286p = AbstractC41047q.m133286p(iHashCode);
            while (true) {
                int i18 = iM133286p & i14;
                Object obj3 = objArr2[i18];
                if (obj3 == null) {
                    objArr[i16] = obj2;
                    objArr2[i18] = obj2;
                    i15 += iHashCode;
                    i16++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM133286p++;
            }
        }
        Arrays.fill(objArr, i16, i13, (Object) null);
        if (i16 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C41030i1(obj4);
        }
        if (m133262j(i16) < iM133262j / 2) {
            return m133263l(i16, objArr);
        }
        int length = objArr.length;
        if (i16 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new C41012c1(i15, i14, i16, objArr, objArr2);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC41032j0 m133264m(Collection collection) {
        if ((collection instanceof AbstractC41032j0) && !(collection instanceof SortedSet)) {
            AbstractC41032j0 abstractC41032j0 = (AbstractC41032j0) collection;
            if (!abstractC41032j0.mo133226g()) {
                return abstractC41032j0;
            }
        }
        Object[] array = collection.toArray();
        return m133263l(array.length, array);
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: a */
    public AbstractC41023g0 mo133227a() {
        AbstractC41023g0 abstractC41023g0 = this.f177007x;
        if (abstractC41023g0 != null) {
            return abstractC41023g0;
        }
        AbstractC41023g0 abstractC41023g0Mo133236n = mo133236n();
        this.f177007x = abstractC41023g0Mo133236n;
        return abstractC41023g0Mo133236n;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC41032j0) && (this instanceof C41012c1) && (((AbstractC41032j0) obj) instanceof C41012c1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC41047q.m133276f(obj, this);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC41047q.m133280j(this);
    }

    /* JADX INFO: renamed from: n */
    public AbstractC41023g0 mo133236n() {
        Object[] array = toArray(AbstractC41008b0.f176958w);
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        return AbstractC41023g0.m133250j(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC41036k1 iterator();
}
