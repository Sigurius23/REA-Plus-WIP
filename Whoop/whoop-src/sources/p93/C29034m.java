package p93;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: p93.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C29034m {

    /* JADX INFO: renamed from: b */
    public static final C29034m f117506b = new C29034m(AbstractC37056f.m118959K(C29028g.f117498c, C29031j.f117501c, C29029h.f117499c, C29030i.f117500c));

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f117507a;

    public C29034m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C35847e c35847e = ((AbstractC29032k) obj).f117502a;
            Object arrayList = linkedHashMap.get(c35847e);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c35847e, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f117507a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final C29033l m88266a(String className, C35847e packageFqName) {
        Integer numValueOf;
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        AbstractC22676k.m65750j(className, "className");
        List<AbstractC29032k> list = (List) this.f117507a.get(packageFqName);
        if (list != null) {
            for (AbstractC29032k abstractC29032k : list) {
                int i13 = 0;
                if (AbstractC39421y.m125930O(className, abstractC29032k.f117503b, false)) {
                    String strSubstring = className.substring(abstractC29032k.f117503b.length());
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i14 = 0;
                    while (true) {
                        if (i13 >= length) {
                            numValueOf = Integer.valueOf(i14);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i13) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i14 = (i14 * 10) + iCharAt;
                        i13++;
                    }
                    if (numValueOf != null) {
                        return new C29033l(abstractC29032k, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
