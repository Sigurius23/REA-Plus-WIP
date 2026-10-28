package p093dl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: dl.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C12146k {

    /* JADX INFO: renamed from: d */
    public static final Map f40390d;

    /* JADX INFO: renamed from: a */
    public boolean f40391a = true;

    /* JADX INFO: renamed from: b */
    public Map f40392b = f40390d;

    /* JADX INFO: renamed from: c */
    public boolean f40393c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb4 = new StringBuilder(property.length());
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = property.charAt(i13);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb4.append(cCharAt);
                } else {
                    sb4.append('?');
                }
            }
            property = sb4.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new C12147l(property)));
        }
        f40390d = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m33608a(String str, String str2) {
        C12147l c12147l = new C12147l(str2);
        if (!this.f40393c || !"User-Agent".equalsIgnoreCase(str)) {
            m33609b();
            List arrayList = (List) this.f40392b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f40392b.put(str, arrayList);
            }
            arrayList.add(c12147l);
            return;
        }
        m33609b();
        List arrayList2 = (List) this.f40392b.get(str);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            this.f40392b.put(str, arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(c12147l);
        if (this.f40393c && "User-Agent".equalsIgnoreCase(str)) {
            this.f40393c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m33609b() {
        if (this.f40391a) {
            this.f40391a = false;
            HashMap map = new HashMap(this.f40392b.size());
            for (Map.Entry entry : this.f40392b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f40392b = map;
        }
    }
}
