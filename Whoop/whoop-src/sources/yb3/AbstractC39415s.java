package yb3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25264r;
import p715kotlin.jvm.internal.AbstractC22676k;
import r51.C30936d;
import va3.AbstractC35846d;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: yb3.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39415s extends AbstractC35854l {
    /* JADX INFO: renamed from: r */
    public static String m125908r(String str, String str2) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC38176k.m122289y(AbstractC38176k.m122272A(new C25264r(str, 4), new C30936d(str2, 13)), "\n", null, null, 62);
    }

    /* JADX INFO: renamed from: s */
    public static String m125909s(String str) throws IOException {
        int length;
        AbstractC22676k.m65750j(str, "<this>");
        List listM125894m0 = AbstractC39414r.m125894m0(str);
        List list = listM125894m0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC39414r.m125890i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC35846d.m113784i(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) AbstractC25265s.m74120X0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM125894m0.size();
        int iM118951C = AbstractC37056f.m118951C(listM125894m0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i13 = length + 1;
            if (length < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str3 = (String) obj2;
            String strM125878W = ((length == 0 || length == iM118951C) && AbstractC39414r.m125890i0(str3)) ? null : AbstractC39414r.m125878W(iIntValue, str3);
            if (strM125878W != null) {
                arrayList3.add(strM125878W);
            }
            length = i13;
        }
        StringBuilder sb4 = new StringBuilder(length3);
        AbstractC25265s.m74109M0(arrayList3, sb4, "\n", null, null, null, 124);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m125910t(String str) throws IOException {
        AbstractC22676k.m65750j(str, "<this>");
        if (AbstractC39414r.m125890i0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM125894m0 = AbstractC39414r.m125894m0(str);
        int length = str.length();
        listM125894m0.size();
        int iM118951C = AbstractC37056f.m118951C(listM125894m0);
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : listM125894m0) {
            int i14 = i13 + 1;
            String strSubstring = null;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i13 != 0 && i13 != iM118951C) || !AbstractC39414r.m125890i0(str2)) {
                int length2 = str2.length();
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        i15 = -1;
                        break;
                    }
                    if (!AbstractC35846d.m113784i(str2.charAt(i15))) {
                        break;
                    }
                    i15++;
                }
                if (i15 != -1 && AbstractC39421y.m125929N(str2, i15, "|", false)) {
                    strSubstring = str2.substring("|".length() + i15);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i13 = i14;
        }
        StringBuilder sb4 = new StringBuilder(length);
        AbstractC25265s.m74109M0(arrayList, sb4, "\n", null, null, null, 124);
        return sb4.toString();
    }
}
