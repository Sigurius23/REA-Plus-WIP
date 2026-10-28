package ji2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ji2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lji2/d;", "", "", "templateName", "templateUrl", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21725d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String templateName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String templateUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean selected;

    public C21725d(String templateName, String templateUrl, boolean z4) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(templateUrl, "templateUrl");
        this.templateName = templateName;
        this.templateUrl = templateUrl;
        this.selected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21725d)) {
            return false;
        }
        C21725d c21725d = (C21725d) other;
        return AbstractC22676k.m65745e(this.templateName, c21725d.templateName) && AbstractC22676k.m65745e(this.templateUrl, c21725d.templateUrl) && this.selected == c21725d.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d(this.templateName.hashCode() * 31, 31, this.templateUrl);
    }

    public String toString() {
        String str = this.templateName;
        String str2 = this.templateUrl;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("ShareableGraphic(templateName=", str, ", templateUrl=", str2, ", selected="), this.selected, ")");
    }
}
