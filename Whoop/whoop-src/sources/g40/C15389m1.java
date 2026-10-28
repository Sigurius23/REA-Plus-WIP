package g40;

import bi.AbstractC3269g;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import i93.C18277c;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15389m1 {

    /* JADX INFO: renamed from: d */
    public static final C18277c f57832d = new C18277c('0', '9');

    /* JADX INFO: renamed from: a */
    public String f57833a = "";

    /* JADX INFO: renamed from: b */
    public final ArrayList f57834b;

    /* JADX INFO: renamed from: c */
    public final C26318e f57835c;

    public C15389m1() {
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, 6);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            ((AbstractC25243e0) it).nextInt();
            arrayList.add(AbstractC13091v.m36593c(""));
        }
        this.f57834b = arrayList;
        this.f57835c = new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25265s.m74110N0(C25271y.f99162w, "", null, null, null, 62)) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 4), new C15335d(arrayList, 4));
    }

    /* JADX INFO: renamed from: a */
    public final int m43596a(int i13, String text) {
        AbstractC22676k.m65750j(text, "text");
        ArrayList arrayList = this.f57834b;
        if (text.equals(((C13045h2) ((InterfaceC13075p1) arrayList.get(i13))).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            C13045h2 c13045h2 = (C13045h2) ((InterfaceC13075p1) arrayList.get(i13));
            c13045h2.getClass();
            c13045h2.m36571k(null, "");
            return 0;
        }
        StringBuilder sb4 = new StringBuilder();
        int length = text.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = text.charAt(i14);
            if (f57832d.m52652e(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        String string = sb4.toString();
        if (string.length() == 6) {
            i13 = 0;
        }
        int iMin = Math.min(6, string.length());
        Iterator it = AbstractC12889b.m36278i0(0, iMin).iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            ((C13045h2) ((InterfaceC13075p1) arrayList.get(i13 + iNextInt))).m36570j(String.valueOf(string.charAt(iNextInt)));
        }
        return iMin;
    }
}
