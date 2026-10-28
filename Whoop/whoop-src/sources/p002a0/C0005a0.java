package p002a0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import p024b0.C2178b;
import p437qt.C30582e;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0005a0 {

    /* JADX INFO: renamed from: a */
    public final int f11a;

    /* JADX INFO: renamed from: b */
    public final C2178b f12b;

    /* JADX INFO: renamed from: c */
    public final C30582e f13c;

    /* JADX INFO: renamed from: d */
    public int f14d;

    /* JADX INFO: renamed from: e */
    public int f15e;

    /* JADX INFO: renamed from: f */
    public int f16f;

    public C0005a0(int i13) {
        this.f11a = i13;
        if (i13 <= 0) {
            AbstractC34924m.m110133O("maxSize <= 0");
            throw null;
        }
        this.f12b = new C2178b(0);
        this.f13c = new C30582e(9);
    }

    /* JADX INFO: renamed from: a */
    public Object mo0a(Object key) {
        AbstractC22676k.m65750j(key, "key");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo1b(boolean z4, Object key, Object oldValue, Object obj) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(oldValue, "oldValue");
    }

    /* JADX INFO: renamed from: c */
    public final Object m2c(Object key) {
        Object objPut;
        AbstractC22676k.m65750j(key, "key");
        synchronized (this.f13c) {
            C2178b c2178b = this.f12b;
            c2178b.getClass();
            Object obj = c2178b.f8660a.get(key);
            if (obj != null) {
                this.f15e++;
                return obj;
            }
            this.f16f++;
            Object objMo0a = mo0a(key);
            if (objMo0a == null) {
                return null;
            }
            synchronized (this.f13c) {
                try {
                    C2178b c2178b2 = this.f12b;
                    c2178b2.getClass();
                    objPut = c2178b2.f8660a.put(key, objMo0a);
                    if (objPut != null) {
                        C2178b c2178b3 = this.f12b;
                        c2178b3.getClass();
                        c2178b3.f8660a.put(key, objPut);
                    } else {
                        this.f14d += m5f(key, objMo0a);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (objPut != null) {
                mo1b(false, key, objMo0a, objPut);
                return objPut;
            }
            m8i(this.f11a);
            return objMo0a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m3d(Object key, Object value) {
        Object objPut;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        synchronized (this.f13c) {
            this.f14d += m5f(key, value);
            C2178b c2178b = this.f12b;
            c2178b.getClass();
            objPut = c2178b.f8660a.put(key, value);
            if (objPut != null) {
                this.f14d -= m5f(key, objPut);
            }
        }
        if (objPut != null) {
            mo1b(false, key, objPut, value);
        }
        m8i(this.f11a);
        return objPut;
    }

    /* JADX INFO: renamed from: e */
    public final Object m4e(Object key) {
        Object objRemove;
        AbstractC22676k.m65750j(key, "key");
        synchronized (this.f13c) {
            C2178b c2178b = this.f12b;
            c2178b.getClass();
            objRemove = c2178b.f8660a.remove(key);
            if (objRemove != null) {
                this.f14d -= m5f(key, objRemove);
            }
        }
        if (objRemove != null) {
            mo1b(false, key, objRemove, null);
        }
        return objRemove;
    }

    /* JADX INFO: renamed from: f */
    public final int m5f(Object obj, Object obj2) {
        int iMo6g = mo6g(obj, obj2);
        if (iMo6g >= 0) {
            return iMo6g;
        }
        AbstractC34924m.m110134P("Negative size: " + obj + '=' + obj2);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public int mo6g(Object key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap m7h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f13c) {
            Set setEntrySet = this.f12b.f8660a.entrySet();
            AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = this.f12b.f8660a.entrySet();
            AbstractC22676k.m65749i(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i */
    public final void m8i(int i13) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f13c) {
                try {
                    if (this.f14d < 0 || (this.f12b.f8660a.isEmpty() && this.f14d != 0)) {
                        break;
                    }
                    if (this.f14d > i13 && !this.f12b.f8660a.isEmpty()) {
                        Set setEntrySet = this.f12b.f8660a.entrySet();
                        AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) AbstractC25265s.m74098G0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        C2178b c2178b = this.f12b;
                        c2178b.getClass();
                        AbstractC22676k.m65750j(key, "key");
                        c2178b.f8660a.remove(key);
                        this.f14d -= m5f(key, value);
                    }
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            mo1b(true, key, value, null);
        }
        AbstractC34924m.m110134P("LruCache.sizeOf() is reporting inconsistent results!");
        throw null;
    }

    public final String toString() {
        String str;
        synchronized (this.f13c) {
            try {
                int i13 = this.f15e;
                int i14 = this.f16f + i13;
                str = "LruCache[maxSize=" + this.f11a + ",hits=" + this.f15e + ",misses=" + this.f16f + ",hitRate=" + (i14 != 0 ? (i13 * 100) / i14 : 0) + "%]";
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }
}
