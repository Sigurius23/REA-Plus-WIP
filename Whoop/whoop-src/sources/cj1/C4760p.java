package cj1;

import androidx.core.app.NotificationCompat;
import gz0.EnumC16313m0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cj1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcj1/p;", "", "", "startTitle", "endTitle", "Lgz0/m0;", "icon", "Lcj1/q;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lcj1/q;", "()Lcj1/q;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4760p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String startTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String endTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4761q status;

    public C4760p(String startTitle, String str, EnumC16313m0 enumC16313m0, EnumC4761q status) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(status, "status");
        this.startTitle = startTitle;
        this.endTitle = str;
        this.icon = enumC16313m0;
        this.status = status;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStartTitle() {
        return this.startTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC4761q getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4760p)) {
            return false;
        }
        C4760p c4760p = (C4760p) other;
        return AbstractC22676k.m65745e(this.startTitle, c4760p.startTitle) && AbstractC22676k.m65745e(this.endTitle, c4760p.endTitle) && this.icon == c4760p.icon && this.status == c4760p.status;
    }

    public int hashCode() {
        int iHashCode = this.startTitle.hashCode() * 31;
        String str = this.endTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.status.hashCode() + ((iHashCode2 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.startTitle;
        String str2 = this.endTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC4761q enumC4761q = this.status;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalRecordsTileFooterState(startTitle=", str, ", endTitle=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", status=");
        sbM32001t.append(enumC4761q);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C4760p(String str, String str2, EnumC16313m0 enumC16313m0, EnumC4761q enumC4761q, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : enumC16313m0, (i13 & 8) != 0 ? EnumC4761q.PENDING : enumC4761q);
    }
}
