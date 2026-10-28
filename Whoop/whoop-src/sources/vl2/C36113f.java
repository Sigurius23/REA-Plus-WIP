package vl2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lvl2/f;", "", "", "navigationBarTitle", "title", "subtitle", "Lvl2/m;", "addManualMeasurement", "Lvl2/g;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvl2/m;Lvl2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Lvl2/m;", "()Lvl2/m;", "Lvl2/g;", "()Lvl2/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36113f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationBarTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36120m addManualMeasurement;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C36114g sections;

    public C36113f(String navigationBarTitle, String title, String subtitle, C36120m addManualMeasurement, C36114g sections) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(addManualMeasurement, "addManualMeasurement");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarTitle = navigationBarTitle;
        this.title = title;
        this.subtitle = subtitle;
        this.addManualMeasurement = addManualMeasurement;
        this.sections = sections;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36120m getAddManualMeasurement() {
        return this.addManualMeasurement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C36114g getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36113f)) {
            return false;
        }
        C36113f c36113f = (C36113f) other;
        return AbstractC22676k.m65745e(this.navigationBarTitle, c36113f.navigationBarTitle) && AbstractC22676k.m65745e(this.title, c36113f.title) && AbstractC22676k.m65745e(this.subtitle, c36113f.subtitle) && AbstractC22676k.m65745e(this.addManualMeasurement, c36113f.addManualMeasurement) && AbstractC22676k.m65745e(this.sections, c36113f.sections);
    }

    public int hashCode() {
        return this.sections.hashCode() + ((this.addManualMeasurement.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBarTitle.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31);
    }

    public String toString() {
        String str = this.navigationBarTitle;
        String str2 = this.title;
        String str3 = this.subtitle;
        C36120m c36120m = this.addManualMeasurement;
        C36114g c36114g = this.sections;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementRecordDomainState(navigationBarTitle=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", addManualMeasurement=");
        sbM32001t.append(c36120m);
        sbM32001t.append(", sections=");
        sbM32001t.append(c36114g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
