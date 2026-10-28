package pg3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: pg3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C29219w {

    /* JADX INFO: renamed from: a */
    public final Class f118272a;

    /* JADX INFO: renamed from: b */
    public final Object f118273b;

    /* JADX INFO: renamed from: c */
    public final Method f118274c;

    /* JADX INFO: renamed from: d */
    public final List f118275d;

    public C29219w(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f118272a = cls;
        this.f118273b = obj;
        this.f118274c = method;
        this.f118275d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f118272a.getName(), this.f118274c.getName(), this.f118275d);
    }
}
