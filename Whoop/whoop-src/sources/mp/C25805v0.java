package mp;

import com.google.android.gms.internal.fido.zzhf;
import g73.C15553a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: mp.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25805v0 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final AbstractC25788n f101545w;

    /* JADX INFO: renamed from: x */
    public final int f101546x;

    public C25805v0(C25810y c25810y) throws zzhf {
        c25810y.getClass();
        this.f101545w = c25810y;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            AbstractC25788n abstractC25788n = this.f101545w;
            if (i13 >= abstractC25788n.size()) {
                break;
            }
            int iMo76006b = ((AbstractC25755b1) abstractC25788n.get(i13)).mo76006b();
            if (i14 < iMo76006b) {
                i14 = iMo76006b;
            }
            i13++;
        }
        int i15 = i14 + 1;
        this.f101546x = i15;
        if (i15 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d((byte) -128);
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: b */
    public final int mo76006b() {
        return this.f101546x;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        int iMo75988a = abstractC25755b1.mo75988a();
        int iM76004d = AbstractC25755b1.m76004d((byte) -128);
        if (iM76004d != iMo75988a) {
            return iM76004d - abstractC25755b1.mo75988a();
        }
        AbstractC25788n abstractC25788n = ((C25805v0) abstractC25755b1).f101545w;
        AbstractC25788n abstractC25788n2 = this.f101545w;
        if (abstractC25788n2.size() != abstractC25788n.size()) {
            return abstractC25788n2.size() - abstractC25788n.size();
        }
        for (int i13 = 0; i13 < abstractC25788n2.size(); i13++) {
            int iCompareTo = ((AbstractC25755b1) abstractC25788n2.get(i13)).compareTo((AbstractC25755b1) abstractC25788n.get(i13));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25805v0.class == obj.getClass()) {
            return this.f101545w.equals(((C25805v0) obj).f101545w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC25755b1.m76004d((byte) -128)), this.f101545w});
    }

    public final String toString() {
        AbstractC25788n abstractC25788n = this.f101545w;
        if (abstractC25788n.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = abstractC25788n.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((AbstractC25755b1) abstractC25788n.get(i13)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb4 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb4.append(C15553a.m43793w(it.next()));
                while (it.hasNext()) {
                    sb4.append((CharSequence) ",\n  ");
                    sb4.append(C15553a.m43793w(it.next()));
                }
            }
            sb4.append("\n]");
            return sb4.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
