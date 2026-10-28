package hb3;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;

/* JADX INFO: renamed from: hb3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17113f {

    /* JADX INFO: renamed from: a */
    public final C35845c f65720a;

    /* JADX INFO: renamed from: b */
    public final C17109d f65721b;

    public C17113f(C35845c classId, C17109d c17109d) {
        AbstractC22676k.m65750j(classId, "classId");
        this.f65720a = classId;
        this.f65721b = c17109d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17113f) {
            return AbstractC22676k.m65745e(this.f65720a, ((C17113f) obj).f65720a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65720a.hashCode();
    }
}
