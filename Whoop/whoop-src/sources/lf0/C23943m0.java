package lf0;

import kd1.AbstractC22403o;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lf0.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0017\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u000e¨\u0006$"}, m65681d2 = {"Llf0/m0;", "Lm91/u;", "", "id", "Lkd1/o;", "image", "title", "description", "Lny0/p0;", "ctaButton", "reportUrl", "<init>", "(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lny0/p0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lkd1/o;", "c", "()Lkd1/o;", "e", "d", "Lny0/p0;", "()Lny0/p0;", "f", "getReportUrl", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23943m0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f94601g = C27273p0.f109116o | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27273p0 ctaButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String reportUrl;

    public C23943m0(String id4, AbstractC22403o image, String title, String description, C27273p0 ctaButton, String reportUrl) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(ctaButton, "ctaButton");
        AbstractC22676k.m65750j(reportUrl, "reportUrl");
        this.id = id4;
        this.image = image;
        this.title = title;
        this.description = description;
        this.ctaButton = ctaButton;
        this.reportUrl = reportUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27273p0 getCtaButton() {
        return this.ctaButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23943m0)) {
            return false;
        }
        C23943m0 c23943m0 = (C23943m0) other;
        return AbstractC22676k.m65745e(this.id, c23943m0.id) && AbstractC22676k.m65745e(this.image, c23943m0.image) && AbstractC22676k.m65745e(this.title, c23943m0.title) && AbstractC22676k.m65745e(this.description, c23943m0.description) && AbstractC22676k.m65745e(this.ctaButton, c23943m0.ctaButton) && AbstractC22676k.m65745e(this.reportUrl, c23943m0.reportUrl);
    }

    public int hashCode() {
        return this.reportUrl.hashCode() + ((this.ctaButton.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC30007c.m91833c(this.image, this.id.hashCode() * 31, 31), 31, this.title), 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.id;
        AbstractC22403o abstractC22403o = this.image;
        String str2 = this.title;
        String str3 = this.description;
        C27273p0 c27273p0 = this.ctaButton;
        String str4 = this.reportUrl;
        StringBuilder sb4 = new StringBuilder("ClinicalReportCtaTileState(id=");
        sb4.append(str);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", description=", str3, ", ctaButton=");
        sb4.append(c27273p0);
        sb4.append(", reportUrl=");
        sb4.append(str4);
        sb4.append(")");
        return sb4.toString();
    }
}
