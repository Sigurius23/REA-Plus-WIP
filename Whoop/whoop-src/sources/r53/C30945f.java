package r53;

import java.nio.ByteBuffer;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r53.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C30945f {

    /* JADX INFO: renamed from: a */
    public final int f127678a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f127679b;

    public C30945f(int i13, ByteBuffer buffer) {
        AbstractC22676k.m65750j(buffer, "buffer");
        this.f127678a = i13;
        this.f127679b = buffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30945f)) {
            return false;
        }
        C30945f c30945f = (C30945f) obj;
        return this.f127678a == c30945f.f127678a && AbstractC22676k.m65745e(this.f127679b, c30945f.f127679b);
    }

    public final int hashCode() {
        return this.f127679b.hashCode() + (Integer.hashCode(this.f127678a) * 31);
    }

    public final String toString() {
        return "PlanePrimitive(rowStride=" + ((Object) String.valueOf(this.f127678a)) + ", buffer=" + this.f127679b + ')';
    }
}
