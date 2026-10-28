package eu;

import com.google.android.gms.maps.model.LatLng;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p591wp.C37487h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13619j0 {

    /* JADX INFO: renamed from: a */
    public final C28633k1 f48237a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f48238b;

    /* JADX INFO: renamed from: c */
    public C37487h f48239c;

    static {
        new C28539n0(10, C13602b.f48123a0, C13604c.f48147O);
    }

    public C13619j0(LatLng position) {
        AbstractC22676k.m65750j(position, "position");
        this.f48237a = AbstractC28683x.m87272z(position);
        this.f48238b = AbstractC28683x.m87272z(EnumC13618j.f48235y);
    }

    /* JADX INFO: renamed from: a */
    public final void m38433a(C37487h c37487h) {
        C37487h c37487h2 = this.f48239c;
        if (c37487h2 == null && c37487h == null) {
            return;
        }
        if (c37487h2 != null && c37487h != null) {
            throw new IllegalStateException("MarkerState may only be associated with one Marker at a time.");
        }
        this.f48239c = c37487h;
    }
}
