package z30;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: z30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40041d {

    /* JADX INFO: renamed from: a */
    public final List f172762a;

    public C40041d(List list) {
        this.f172762a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40041d) && AbstractC22676k.m65745e(this.f172762a, ((C40041d) obj).f172762a);
    }

    public final int hashCode() {
        return this.f172762a.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("FindAutocompletePredictionsResponse(autocompletePredictions=", ")", this.f172762a);
    }
}
