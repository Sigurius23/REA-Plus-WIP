package r93;

import hc3.AbstractC17176i;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;

/* JADX INFO: renamed from: r93.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C31118e0 {

    /* JADX INFO: renamed from: a */
    public final C35845c f128322a;

    /* JADX INFO: renamed from: b */
    public final List f128323b;

    public C31118e0(C35845c classId, List list) {
        AbstractC22676k.m65750j(classId, "classId");
        this.f128322a = classId;
        this.f128323b = list;
    }

    /* JADX INFO: renamed from: a */
    public final C35845c m95865a() {
        return this.f128322a;
    }

    /* JADX INFO: renamed from: b */
    public final List m95866b() {
        return this.f128323b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31118e0)) {
            return false;
        }
        C31118e0 c31118e0 = (C31118e0) obj;
        return AbstractC22676k.m65745e(this.f128322a, c31118e0.f128322a) && AbstractC22676k.m65745e(this.f128323b, c31118e0.f128323b);
    }

    public final int hashCode() {
        return this.f128323b.hashCode() + (this.f128322a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ClassRequest(classId=");
        sb4.append(this.f128322a);
        sb4.append(", typeParametersCount=");
        return AbstractC17176i.m48506h(sb4, this.f128323b, ')');
    }
}
