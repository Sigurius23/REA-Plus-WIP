package i51;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i51.w */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Li51/w;", "", "", "id", "max", "", "layerPattern", "", "indicatorLayers", "wrapperLayers", "<init>", "(IILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "c", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18126w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String layerPattern;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> indicatorLayers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> wrapperLayers;

    public C18126w(int i13, int i14, String str, List<String> list, List<String> list2) {
        this.id = i13;
        this.max = i14;
        this.layerPattern = str;
        this.indicatorLayers = list;
        this.wrapperLayers = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m52064b() {
        return this.indicatorLayers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLayerPattern() {
        return this.layerPattern;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m52067e() {
        return this.wrapperLayers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18126w)) {
            return false;
        }
        C18126w c18126w = (C18126w) other;
        return this.id == c18126w.id && this.max == c18126w.max && AbstractC22676k.m65745e(this.layerPattern, c18126w.layerPattern) && AbstractC22676k.m65745e(this.indicatorLayers, c18126w.indicatorLayers) && AbstractC22676k.m65745e(this.wrapperLayers, c18126w.wrapperLayers);
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.max, Integer.hashCode(this.id) * 31, 31);
        String str = this.layerPattern;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.indicatorLayers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.wrapperLayers;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        int i14 = this.max;
        String str = this.layerPattern;
        List<String> list = this.indicatorLayers;
        List<String> list2 = this.wrapperLayers;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SlotGroup(id=", ", max=", ", layerPattern=");
        AbstractC36095b.m114694v(str, ", indicatorLayers=", ", wrapperLayers=", sbM30465s, list);
        return AbstractC3855a.m11829m(sbM30465s, list2, ")");
    }
}
