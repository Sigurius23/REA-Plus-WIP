package p094dn;

import java.util.ArrayList;
import java.util.Arrays;
import p010a9.AbstractC0576a;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: dn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12181a extends AbstractC0576a {

    /* JADX INFO: renamed from: E */
    public final ArrayList f40607E;

    /* JADX INFO: renamed from: y */
    public final long f40608y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f40609z;

    public C12181a(int i13, long j7) {
        super(i13, 1);
        this.f40608y = j7;
        this.f40609z = new ArrayList();
        this.f40607E = new ArrayList();
    }

    /* JADX INFO: renamed from: o */
    public final C12181a m33782o(int i13) {
        ArrayList arrayList = this.f40607E;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C12181a c12181a = (C12181a) arrayList.get(i14);
            if (c12181a.f2052x == i13) {
                return c12181a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final C12182b m33783p(int i13) {
        ArrayList arrayList = this.f40609z;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C12182b c12182b = (C12182b) arrayList.get(i14);
            if (c12182b.f2052x == i13) {
                return c12182b;
            }
        }
        return null;
    }

    @Override // p010a9.AbstractC0576a
    public final String toString() {
        String strM1492c = AbstractC0576a.m1492c(this.f2052x);
        String string = Arrays.toString(this.f40609z.toArray());
        String string2 = Arrays.toString(this.f40607E.toArray());
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(AbstractC30007c.m91832b(22, strM1492c), string), string2));
        sb4.append(strM1492c);
        sb4.append(" leaves: ");
        sb4.append(string);
        sb4.append(" containers: ");
        sb4.append(string2);
        return sb4.toString();
    }
}
