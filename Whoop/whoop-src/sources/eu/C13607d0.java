package eu;

import java.util.Objects;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: eu.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13607d0 {

    /* JADX INFO: renamed from: a */
    public final boolean f48156a;

    /* JADX INFO: renamed from: b */
    public final boolean f48157b;

    /* JADX INFO: renamed from: c */
    public final boolean f48158c;

    /* JADX INFO: renamed from: d */
    public final boolean f48159d;

    /* JADX INFO: renamed from: e */
    public final boolean f48160e;

    /* JADX INFO: renamed from: f */
    public final boolean f48161f;

    /* JADX INFO: renamed from: g */
    public final boolean f48162g;

    /* JADX INFO: renamed from: h */
    public final boolean f48163h;

    /* JADX INFO: renamed from: i */
    public final boolean f48164i;

    /* JADX INFO: renamed from: j */
    public final boolean f48165j;

    public /* synthetic */ C13607d0(boolean z4, boolean z13, boolean z14, boolean z15, int i13) {
        this(true, true, (i13 & 4) != 0, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0, (i13 & 32) != 0 ? true : z13, true, (i13 & 128) != 0, (i13 & 256) != 0 ? true : z14, (i13 & 512) != 0 ? true : z15);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13607d0)) {
            return false;
        }
        C13607d0 c13607d0 = (C13607d0) obj;
        return this.f48156a == c13607d0.f48156a && this.f48157b == c13607d0.f48157b && this.f48158c == c13607d0.f48158c && this.f48159d == c13607d0.f48159d && this.f48160e == c13607d0.f48160e && this.f48161f == c13607d0.f48161f && this.f48162g == c13607d0.f48162g && this.f48163h == c13607d0.f48163h && this.f48164i == c13607d0.f48164i && this.f48165j == c13607d0.f48165j;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f48156a), Boolean.valueOf(this.f48157b), Boolean.valueOf(this.f48158c), Boolean.valueOf(this.f48159d), Boolean.valueOf(this.f48160e), Boolean.valueOf(this.f48161f), Boolean.valueOf(this.f48162g), Boolean.valueOf(this.f48163h), Boolean.valueOf(this.f48164i), Boolean.valueOf(this.f48165j));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MapUiSettings(compassEnabled=");
        sb4.append(this.f48156a);
        sb4.append(", indoorLevelPickerEnabled=");
        sb4.append(this.f48157b);
        sb4.append(", mapToolbarEnabled=");
        sb4.append(this.f48158c);
        sb4.append(", myLocationButtonEnabled=");
        sb4.append(this.f48159d);
        sb4.append(", rotationGesturesEnabled=");
        sb4.append(this.f48160e);
        sb4.append(", scrollGesturesEnabled=");
        sb4.append(this.f48161f);
        sb4.append(", scrollGesturesEnabledDuringRotateOrZoom=");
        sb4.append(this.f48162g);
        sb4.append(", tiltGesturesEnabled=");
        sb4.append(this.f48163h);
        sb4.append(", zoomControlsEnabled=");
        sb4.append(this.f48164i);
        sb4.append(", zoomGesturesEnabled=");
        return AbstractC2875y.m8305r(sb4, this.f48165j, ')');
    }

    public C13607d0(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25) {
        this.f48156a = z4;
        this.f48157b = z13;
        this.f48158c = z14;
        this.f48159d = z15;
        this.f48160e = z16;
        this.f48161f = z17;
        this.f48162g = z18;
        this.f48163h = z19;
        this.f48164i = z24;
        this.f48165j = z25;
    }
}
