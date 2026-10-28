package p157fv;

import android.animation.TimeInterpolator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C14810p {

    /* JADX INFO: renamed from: a */
    public final String f54993a;

    /* JADX INFO: renamed from: b */
    public final Long f54994b;

    /* JADX INFO: renamed from: c */
    public final TimeInterpolator f54995c;

    public C14810p(String str, Long l7, TimeInterpolator timeInterpolator) {
        this.f54993a = str;
        this.f54994b = l7;
        this.f54995c = timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14810p.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.MapAnimationOptions");
        C14810p c14810p = (C14810p) obj;
        return AbstractC22676k.m65745e(this.f54993a, c14810p.f54993a) && this.f54994b.equals(c14810p.f54994b) && AbstractC22676k.m65745e(this.f54995c, c14810p.f54995c);
    }

    public final int hashCode() {
        String str = this.f54993a;
        int iHashCode = (this.f54994b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 961;
        TimeInterpolator timeInterpolator = this.f54995c;
        return iHashCode + (timeInterpolator != null ? timeInterpolator.hashCode() : 0);
    }
}
