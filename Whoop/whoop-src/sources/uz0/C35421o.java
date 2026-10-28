package uz0;

import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: uz0.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, m65681d2 = {"Luz0/o;", "", "", "indicatorPosition", "", "zoneStyle", "title", "", "Luz0/p;", "zones", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getIndicatorPosition", "()F", "b", "Ljava/lang/String;", "getZoneStyle", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35421o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float indicatorPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String zoneStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C35422p> zones;

    public C35421o(float f13, String str, String title, List<C35422p> zones) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(zones, "zones");
        this.indicatorPosition = f13;
        this.zoneStyle = str;
        this.title = title;
        this.zones = zones;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b */
    public final List<C35422p> m112392b() {
        return this.zones;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35421o)) {
            return false;
        }
        C35421o c35421o = (C35421o) other;
        return Float.compare(this.indicatorPosition, c35421o.indicatorPosition) == 0 && AbstractC22676k.m65745e(this.zoneStyle, c35421o.zoneStyle) && AbstractC22676k.m65745e(this.title, c35421o.title) && AbstractC22676k.m65745e(this.zones, c35421o.zones);
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.indicatorPosition) * 31;
        String str = this.zoneStyle;
        return this.zones.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
    }

    public String toString() {
        float f13 = this.indicatorPosition;
        String str = this.zoneStyle;
        String str2 = this.title;
        List<C35422p> list = this.zones;
        StringBuilder sb4 = new StringBuilder("TargetZonesViewState(indicatorPosition=");
        sb4.append(f13);
        sb4.append(", zoneStyle=");
        sb4.append(str);
        sb4.append(", title=");
        return AbstractC30007c.m91840j(str2, ", zones=", ")", sb4, list);
    }
}
