package r01;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: r01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lr01/c;", "Lm91/u;", "", "imageUrl", "title", "description", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lr01/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "g", "c", "e", "d", "Lm91/u;", "()Lm91/u;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30842c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u button;

    public C30842c(String str, String title, String description, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.imageUrl = str;
        this.title = title;
        this.description = description;
        this.button = interfaceC25312u;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C30842c m94851b(C30842c c30842c, String str, String str2, String str3, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c30842c.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = c30842c.title;
        }
        if ((i13 & 4) != 0) {
            str3 = c30842c.description;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c30842c.button;
        }
        return c30842c.m94852a(str, str2, str3, interfaceC25312u);
    }

    /* JADX INFO: renamed from: a */
    public final C30842c m94852a(String imageUrl, String title, String description, InterfaceC25312u button) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new C30842c(imageUrl, title, description, button);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30842c)) {
            return false;
        }
        C30842c c30842c = (C30842c) other;
        return AbstractC22676k.m65745e(this.imageUrl, c30842c.imageUrl) && AbstractC22676k.m65745e(this.title, c30842c.title) && AbstractC22676k.m65745e(this.description, c30842c.description) && AbstractC22676k.m65745e(this.button, c30842c.button);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.description);
        InterfaceC25312u interfaceC25312u = this.button;
        return iM30450d + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        InterfaceC25312u interfaceC25312u = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardViewState(imageUrl=", str, ", title=", str2, ", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", button=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
