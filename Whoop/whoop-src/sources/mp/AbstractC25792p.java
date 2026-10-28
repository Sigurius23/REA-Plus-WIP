package mp;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mp.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25792p extends AbstractC25774i implements Set {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f101523y = 0;

    /* JADX INFO: renamed from: x */
    public transient AbstractC25788n f101524x;

    /* JADX INFO: renamed from: g */
    public static AbstractC25792p m76030g(int i13, Object... objArr) {
        if (i13 == 0) {
            return C25812z.f101557J;
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C25757c0(obj);
        }
        int iM76031j = m76031j(i13);
        Object[] objArr2 = new Object[iM76031j];
        int i14 = iM76031j - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            Object obj2 = objArr[i17];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC2875y.m8295h(i17, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i18 = iRotateLeft & i14;
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
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i16, i13, (Object) null);
        if (i16 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C25757c0(obj4);
        }
        if (m76031j(i16) < iM76031j / 2) {
            return m76030g(i16, objArr);
        }
        if (i16 <= 0) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new C25812z(i15, i14, i16, objArr, objArr2);
    }

    /* JADX INFO: renamed from: j */
    public static int m76031j(int i13) {
        int iMax = Math.max(i13, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC25792p) && (this instanceof C25812z) && (((AbstractC25792p) obj) instanceof C25812z) && ((C25812z) this).f101558E != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC25753b.m75990b(this);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC25788n mo75984l() {
        AbstractC25788n abstractC25788n = this.f101524x;
        if (abstractC25788n != null) {
            return abstractC25788n;
        }
        AbstractC25788n abstractC25788nMo76032m = mo76032m();
        this.f101524x = abstractC25788nMo76032m;
        return abstractC25788nMo76032m;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC25788n mo76032m() {
        Object[] array = toArray(AbstractC25774i.f101489w);
        C25777j c25777j = AbstractC25788n.f101515x;
        return AbstractC25788n.m76024l(array.length, array);
    }
}
