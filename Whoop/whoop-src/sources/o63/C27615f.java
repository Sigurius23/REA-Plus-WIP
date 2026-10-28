package o63;

import c93.InterfaceC4339a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o63.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27615f {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f111145a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final Object m83373a(C27610a key, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f111145a;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = interfaceC4339a.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final Object m83374b(C27610a key) {
        AbstractC22676k.m65750j(key, "key");
        Object objM83376d = m83376d(key);
        if (objM83376d != null) {
            return objM83376d;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    /* JADX INFO: renamed from: c */
    public final Map m83375c() {
        return this.f111145a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m83376d(C27610a key) {
        AbstractC22676k.m65750j(key, "key");
        return m83375c().get(key);
    }

    /* JADX INFO: renamed from: e */
    public final void m83377e(C27610a key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        m83375c().put(key, value);
    }
}
