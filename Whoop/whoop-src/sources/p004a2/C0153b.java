package p004a2;

import com.squareup.wire.AbstractC5583n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0153b {

    /* JADX INFO: renamed from: a */
    public final Integer f476a;

    public C0153b(AbstractC5583n abstractC5583n, Integer num) {
        this.f476a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0153b) {
            return AbstractC22676k.m65745e(null, null) && AbstractC22676k.m65745e(this.f476a, ((C0153b) obj).f476a);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f476a + ')';
    }
}
