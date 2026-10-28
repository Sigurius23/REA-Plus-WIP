package js0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: js0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ljs0/b;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "<init>", "()V", "", "T", "key", "defaultValue", "i", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "config-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21908b extends ConcurrentHashMap<String, String> {
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean m62325a(String str) {
        return super.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ boolean m62326b(String str) {
        return super.containsValue(str);
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ String m62327c(String str) {
        return (String) super.get(str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m62325a((String) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return m62326b((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ Set<Map.Entry<String, String>> m62328d() {
        return super.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public /* bridge */ Set<String> m62329e() {
        return super.keySet();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return m62328d();
    }

    /* JADX INFO: renamed from: g */
    public /* bridge */ String m62330g(String str, String str2) {
        return (String) super.getOrDefault(str, str2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return m62327c((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : m62330g((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: h */
    public /* bridge */ int m62331h() {
        return super.size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: i */
    public final <T> T m62332i(String key, T defaultValue) {
        Object objM125868N0;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        T t14 = null;
        if (defaultValue instanceof Integer) {
            String str = (String) get(key);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (defaultValue instanceof Long) {
            String str2 = (String) get(key);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (defaultValue instanceof Float) {
            String str3 = (String) get(key);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (defaultValue instanceof Double) {
            String str4 = (String) get(key);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (defaultValue instanceof Boolean) {
            String str5 = (String) get(key);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = defaultValue instanceof String ? get(key) : defaultValue;
        }
        if (objM125868N0 != null) {
            t14 = (T) objM125868N0;
        }
        return t14 == null ? defaultValue : t14;
    }

    /* JADX INFO: renamed from: j */
    public /* bridge */ Collection<String> m62333j() {
        return super.values();
    }

    /* JADX INFO: renamed from: k */
    public /* bridge */ String m62334k(String str) {
        return (String) super.remove(str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m62329e();
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ boolean m62335l(String str, String str2) {
        return super.remove(str, str2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return m62334k((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m62331h();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<String> values() {
        return m62333j();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return m62335l((String) obj, (String) obj2);
        }
        return false;
    }
}
