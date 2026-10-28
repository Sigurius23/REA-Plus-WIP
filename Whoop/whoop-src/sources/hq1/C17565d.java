package hq1;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hq1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lhq1/d;", "", "", "impactsTitle", "impactsDescription", "", "Lcom/whoop/design/models/DesignSystemModel;", "tiles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17565d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String impactsTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String impactsDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<DesignSystemModel> tiles;

    /* JADX WARN: Multi-variable type inference failed */
    public C17565d(String str, String str2, List<? extends DesignSystemModel> tiles) {
        AbstractC22676k.m65750j(tiles, "tiles");
        this.impactsTitle = str;
        this.impactsDescription = str2;
        this.tiles = tiles;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImpactsDescription() {
        return this.impactsDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImpactsTitle() {
        return this.impactsTitle;
    }

    /* JADX INFO: renamed from: c */
    public final List<DesignSystemModel> m50003c() {
        return this.tiles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17565d)) {
            return false;
        }
        C17565d c17565d = (C17565d) other;
        return AbstractC22676k.m65745e(this.impactsTitle, c17565d.impactsTitle) && AbstractC22676k.m65745e(this.impactsDescription, c17565d.impactsDescription) && AbstractC22676k.m65745e(this.tiles, c17565d.tiles);
    }

    public int hashCode() {
        String str = this.impactsTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.impactsDescription;
        return this.tiles.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.impactsTitle;
        String str2 = this.impactsDescription;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("ImpactDetailsFooter(impactsTitle=", str, ", impactsDescription=", str2, ", tiles="), this.tiles, ")");
    }
}
