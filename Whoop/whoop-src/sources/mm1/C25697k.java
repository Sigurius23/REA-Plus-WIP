package mm1;

import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: mm1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, m65681d2 = {"Lmm1/k;", "Lm91/u;", "", "title", "dayStrainDisplay", "dayStrainSubtitle", "", "dayStrainGaugeFillPercentage", "Lgz0/m0;", "strainHelpIcon", "dayStrainTitleEndIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLgz0/m0;Lgz0/m0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "getDayStrainSubtitle", "d", "D", "()D", "e", "Lgz0/m0;", "()Lgz0/m0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25697k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dayStrainDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dayStrainSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double dayStrainGaugeFillPercentage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 strainHelpIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 dayStrainTitleEndIcon;

    public C25697k(String title, String dayStrainDisplay, String dayStrainSubtitle, double d3, EnumC16313m0 strainHelpIcon, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(dayStrainDisplay, "dayStrainDisplay");
        AbstractC22676k.m65750j(dayStrainSubtitle, "dayStrainSubtitle");
        AbstractC22676k.m65750j(strainHelpIcon, "strainHelpIcon");
        this.title = title;
        this.dayStrainDisplay = dayStrainDisplay;
        this.dayStrainSubtitle = dayStrainSubtitle;
        this.dayStrainGaugeFillPercentage = d3;
        this.strainHelpIcon = strainHelpIcon;
        this.dayStrainTitleEndIcon = enumC16313m0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDayStrainDisplay() {
        return this.dayStrainDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getDayStrainGaugeFillPercentage() {
        return this.dayStrainGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getDayStrainTitleEndIcon() {
        return this.dayStrainTitleEndIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getStrainHelpIcon() {
        return this.strainHelpIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25697k)) {
            return false;
        }
        C25697k c25697k = (C25697k) other;
        return AbstractC22676k.m65745e(this.title, c25697k.title) && AbstractC22676k.m65745e(this.dayStrainDisplay, c25697k.dayStrainDisplay) && AbstractC22676k.m65745e(this.dayStrainSubtitle, c25697k.dayStrainSubtitle) && Double.compare(this.dayStrainGaugeFillPercentage, c25697k.dayStrainGaugeFillPercentage) == 0 && this.strainHelpIcon == c25697k.strainHelpIcon && this.dayStrainTitleEndIcon == c25697k.dayStrainTitleEndIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.strainHelpIcon, AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.dayStrainDisplay), 31, this.dayStrainSubtitle), 31, this.dayStrainGaugeFillPercentage), 31);
        EnumC16313m0 enumC16313m0 = this.dayStrainTitleEndIcon;
        return iM48500b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.dayStrainDisplay;
        String str3 = this.dayStrainSubtitle;
        double d3 = this.dayStrainGaugeFillPercentage;
        EnumC16313m0 enumC16313m0 = this.strainHelpIcon;
        EnumC16313m0 enumC16313m1 = this.dayStrainTitleEndIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WelcomeCardState(title=", str, ", dayStrainDisplay=", str2, ", dayStrainSubtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", dayStrainGaugeFillPercentage=");
        sbM32001t.append(d3);
        sbM32001t.append(", strainHelpIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", dayStrainTitleEndIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
