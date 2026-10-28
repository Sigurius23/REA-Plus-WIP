package sc3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: renamed from: sc3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C32404r {

    /* JADX INFO: renamed from: a */
    public final C22686q f134148a;

    /* JADX INFO: renamed from: b */
    public final String f134149b;

    public C32404r(C22686q c22686q, String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f134148a = c22686q;
        this.f134149b = name;
    }

    /* JADX INFO: renamed from: a */
    public final Object m100982a(Object obj) {
        Object obj2 = this.f134148a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException(AbstractC25012a.m73376i(this.f134149b, " is not set", new StringBuilder("Field ")));
    }

    /* JADX INFO: renamed from: b */
    public final Object m100983b(Object obj, Object obj2) {
        C22686q c22686q = this.f134148a;
        Object obj3 = c22686q.get(obj);
        if (obj3 == null) {
            c22686q.set(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public /* synthetic */ C32404r(C22686q c22686q) {
        this(c22686q, c22686q.getName());
    }
}
