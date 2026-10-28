package z30;

import com.stripe.android.p056ui.core.elements.autocomplete.model.Place;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40040c {

    /* JADX INFO: renamed from: a */
    public final Place f172761a;

    public C40040c(Place place) {
        this.f172761a = place;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40040c) && AbstractC22676k.m65745e(this.f172761a, ((C40040c) obj).f172761a);
    }

    public final int hashCode() {
        return this.f172761a.hashCode();
    }

    public final String toString() {
        return "FetchPlaceResponse(place=" + this.f172761a + ")";
    }
}
