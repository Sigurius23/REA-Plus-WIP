package lf0;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lf0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Llf0/h0;", "", "", "id", "title", "Lhy0/c2;", "trend", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhy0/c2;Lgz0/m0;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Lhy0/c2;", "d", "()Lhy0/c2;", "Lgz0/m0;", "()Lgz0/m0;", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23923h0 {

    /* JADX INFO: renamed from: f */
    public static final int f94560f = C9598e.f28134d | C17731c2.f68917p;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    public C23923h0(String id4, String title, C17731c2 trend, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trend, "trend");
        this.id = id4;
        this.title = title;
        this.trend = trend;
        this.icon = enumC16313m0;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23923h0)) {
            return false;
        }
        C23923h0 c23923h0 = (C23923h0) other;
        return AbstractC22676k.m65745e(this.id, c23923h0.id) && AbstractC22676k.m65745e(this.title, c23923h0.title) && AbstractC22676k.m65745e(this.trend, c23923h0.trend) && this.icon == c23923h0.icon && AbstractC22676k.m65745e(this.destination, c23923h0.destination);
    }

    public int hashCode() {
        int iHashCode = (this.trend.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        C17731c2 c17731c2 = this.trend;
        EnumC16313m0 enumC16313m0 = this.icon;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardItemViewState(id=", str, ", title=", str2, ", trend=");
        sbM32001t.append(c17731c2);
        sbM32001t.append(", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }
}
