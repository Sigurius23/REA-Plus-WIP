package p093dl;

import android.text.TextUtils;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: dl.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C12148m implements InterfaceC12145j {

    /* JADX INFO: renamed from: b */
    public final Map f40395b;

    /* JADX INFO: renamed from: c */
    public volatile Map f40396c;

    public C12148m(Map map) {
        this.f40395b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m33610a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f40395b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb4 = new StringBuilder();
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str = ((C12147l) list.get(i13)).f40394a;
                if (!TextUtils.isEmpty(str)) {
                    sb4.append(str);
                    if (i13 != list.size() - 1) {
                        sb4.append(DateTimeRange.lowerUpperDelimiter);
                    }
                }
            }
            String string = sb4.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12148m) {
            return this.f40395b.equals(((C12148m) obj).f40395b);
        }
        return false;
    }

    @Override // p093dl.InterfaceC12145j
    public final Map getHeaders() {
        if (this.f40396c == null) {
            synchronized (this) {
                try {
                    if (this.f40396c == null) {
                        this.f40396c = Collections.unmodifiableMap(m33610a());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f40396c;
    }

    public final int hashCode() {
        return this.f40395b.hashCode();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("LazyHeaders{headers="), this.f40395b, '}');
    }
}
