package l83;

import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C23467m implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Throwable f92939w;

    public C23467m(Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        this.f92939w = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23467m) {
            return AbstractC22676k.m65745e(this.f92939w, ((C23467m) obj).f92939w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92939w.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f92939w + ')';
    }
}
