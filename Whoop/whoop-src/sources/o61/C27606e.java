package o61;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: o61.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lo61/e;", "", "", "positionY", "", "style", "Ly81/e;", "markerColorOverride", "<init>", "(FLjava/lang/String;Ly81/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "Ljava/lang/String;", "getStyle", "c", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27606e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float positionY;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e markerColorOverride;

    public C27606e(float f13, String style, InterfaceC39332e interfaceC39332e) {
        AbstractC22676k.m65750j(style, "style");
        this.positionY = f13;
        this.style = style;
        this.markerColorOverride = interfaceC39332e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getMarkerColorOverride() {
        return this.markerColorOverride;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getPositionY() {
        return this.positionY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27606e)) {
            return false;
        }
        C27606e c27606e = (C27606e) other;
        return Float.compare(this.positionY, c27606e.positionY) == 0 && AbstractC22676k.m65745e(this.style, c27606e.style) && AbstractC22676k.m65745e(this.markerColorOverride, c27606e.markerColorOverride);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Float.hashCode(this.positionY) * 31, 31, this.style);
        InterfaceC39332e interfaceC39332e = this.markerColorOverride;
        return iM30450d + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode());
    }

    public String toString() {
        return "FinalMarkerPointState(positionY=" + this.positionY + ", style=" + this.style + ", markerColorOverride=" + this.markerColorOverride + ")";
    }

    public /* synthetic */ C27606e(float f13, String str, InterfaceC39332e interfaceC39332e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, str, (i13 & 4) != 0 ? null : interfaceC39332e);
    }
}
