package g01;

import androidx.core.app.NotificationCompat;
import c41.EnumC4142w3;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: g01.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lg01/g;", "Lm91/u;", "", "startTitle", "endTitle", "Lgz0/m0;", "icon", "Lc41/w3;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lc41/w3;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lc41/w3;", "e", "()Lc41/w3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14944g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String startTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String endTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4142w3 status;

    public C14944g(String startTitle, String endTitle, EnumC16313m0 icon, EnumC4142w3 status) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        this.startTitle = startTitle;
        this.endTitle = endTitle;
        this.icon = icon;
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

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC4142w3 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14944g)) {
            return false;
        }
        C14944g c14944g = (C14944g) other;
        return AbstractC22676k.m65745e(this.startTitle, c14944g.startTitle) && AbstractC22676k.m65745e(this.endTitle, c14944g.endTitle) && this.icon == c14944g.icon && this.status == c14944g.status;
    }

    public int hashCode() {
        return this.status.hashCode() + AbstractC17176i.m48500b(this.icon, AbstractC11266d.m30450d(this.startTitle.hashCode() * 31, 31, this.endTitle), 31);
    }

    public String toString() {
        String str = this.startTitle;
        String str2 = this.endTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC4142w3 enumC4142w3 = this.status;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FertilityStatusItemState(startTitle=", str, ", endTitle=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", status=");
        sbM32001t.append(enumC4142w3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
