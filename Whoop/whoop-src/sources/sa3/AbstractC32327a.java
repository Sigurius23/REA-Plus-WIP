package sa3;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25240d;
import m83.C25261o;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sa3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32327a {

    /* JADX INFO: renamed from: a */
    public final int[] f133779a;

    /* JADX INFO: renamed from: b */
    public final int f133780b;

    /* JADX INFO: renamed from: c */
    public final int f133781c;

    /* JADX INFO: renamed from: d */
    public final int f133782d;

    /* JADX INFO: renamed from: e */
    public final List f133783e;

    public AbstractC32327a(int... numbers) {
        List listM74093D1;
        AbstractC22676k.m65750j(numbers, "numbers");
        this.f133779a = numbers;
        Integer numM74083x0 = AbstractC25260n.m74083x0(numbers, 0);
        this.f133780b = numM74083x0 != null ? numM74083x0.intValue() : -1;
        Integer numM74083x1 = AbstractC25260n.m74083x0(numbers, 1);
        this.f133781c = numM74083x1 != null ? numM74083x1.intValue() : -1;
        Integer numM74083x2 = AbstractC25260n.m74083x0(numbers, 2);
        this.f133782d = numM74083x2 != null ? numM74083x2.intValue() : -1;
        if (numbers.length <= 3) {
            listM74093D1 = C25271y.f99162w;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(AbstractC11895b.m31999r(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listM74093D1 = AbstractC25265s.m74093D1(new C25240d(new C25261o(numbers), 3, numbers.length));
        }
        this.f133783e = listM74093D1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m100625a(int i13, int i14, int i15) {
        int i16 = this.f133780b;
        if (i16 > i13) {
            return true;
        }
        if (i16 < i13) {
            return false;
        }
        int i17 = this.f133781c;
        if (i17 > i14) {
            return true;
        }
        return i17 >= i14 && this.f133782d >= i15;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC32327a abstractC32327a = (AbstractC32327a) obj;
        return this.f133780b == abstractC32327a.f133780b && this.f133781c == abstractC32327a.f133781c && this.f133782d == abstractC32327a.f133782d && AbstractC22676k.m65745e(this.f133783e, abstractC32327a.f133783e);
    }

    public final int hashCode() {
        int i13 = this.f133780b;
        int i14 = (i13 * 31) + this.f133781c + i13;
        int i15 = (i14 * 31) + this.f133782d + i14;
        return this.f133783e.hashCode() + (i15 * 31) + i15;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i13 : this.f133779a) {
            if (i13 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC25265s.m74110N0(arrayList, ".", null, null, null, 62);
    }
}
