package v33;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v33.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C35621f extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final List f151409a;

    public C35621f(List updates) {
        AbstractC22676k.m65750j(updates, "updates");
        this.f151409a = updates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35621f) && AbstractC22676k.m65745e(this.f151409a, ((C35621f) obj).f151409a);
    }

    public final int hashCode() {
        return this.f151409a.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("ConnectionQualityChangeEvent(updates=", ")", this.f151409a);
    }
}
