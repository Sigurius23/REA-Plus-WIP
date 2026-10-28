package tl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: tl.h */
/* JADX INFO: loaded from: classes.dex */
public class C33909h {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f142085a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f142086b;

    /* JADX INFO: renamed from: c */
    public long f142087c;

    public C33909h(long j7) {
        this.f142086b = j7;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Object m107260a(Object obj) {
        return this.f142085a.get(obj);
    }

    /* JADX INFO: renamed from: b */
    public int mo9716b(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo9717c(Object obj, Object obj2) {
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Object m107261d(Object obj, Object obj2) {
        long jMo9716b = mo9716b(obj2);
        if (jMo9716b >= this.f142086b) {
            mo9717c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f142087c += jMo9716b;
        }
        Object objPut = this.f142085a.put(obj, obj2);
        if (objPut != null) {
            this.f142087c -= (long) mo9716b(objPut);
            if (!objPut.equals(obj2)) {
                mo9717c(obj, objPut);
            }
        }
        m107262e(this.f142086b);
        return objPut;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m107262e(long j7) {
        while (this.f142087c > j7) {
            Iterator it = this.f142085a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f142087c -= (long) mo9716b(value);
            Object key = entry.getKey();
            it.remove();
            mo9717c(key, value);
        }
    }
}
