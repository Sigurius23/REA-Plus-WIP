package lg3;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lg3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C24052n {

    /* JADX INFO: renamed from: a */
    public final int f95052a;

    /* JADX INFO: renamed from: b */
    public final HashMap f95053b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f95054c = new HashMap();

    public C24052n(int i13) {
        this.f95052a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m70951a(String str) {
        int length = str.length();
        HashMap map = this.f95054c;
        HashMap map2 = this.f95053b;
        int i13 = this.f95052a;
        if (length == i13) {
            map2.put(str, null);
            map.put(str.toLowerCase(Locale.ENGLISH), null);
        } else if (length > i13) {
            String strSubstring = str.substring(0, i13);
            C24052n c24052n = (C24052n) map2.get(strSubstring);
            if (c24052n == null) {
                c24052n = new C24052n(length);
                map2.put(strSubstring, c24052n);
                map.put(strSubstring.toLowerCase(Locale.ENGLISH), c24052n);
            }
            c24052n.m70951a(str);
        }
    }
}
