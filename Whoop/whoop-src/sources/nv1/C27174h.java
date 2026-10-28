package nv1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nv1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lnv1/h;", "", "", "title", "headline", "body", "helpText", "helpLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27174h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String headline;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String helpText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String helpLink;

    public C27174h(String title, String headline, String body, String helpText, String helpLink) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(headline, "headline");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(helpText, "helpText");
        AbstractC22676k.m65750j(helpLink, "helpLink");
        this.title = title;
        this.headline = headline;
        this.body = body;
        this.helpText = helpText;
        this.helpLink = helpLink;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHelpLink() {
        return this.helpLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHelpText() {
        return this.helpText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27174h)) {
            return false;
        }
        C27174h c27174h = (C27174h) other;
        return AbstractC22676k.m65745e(this.title, c27174h.title) && AbstractC22676k.m65745e(this.headline, c27174h.headline) && AbstractC22676k.m65745e(this.body, c27174h.body) && AbstractC22676k.m65745e(this.helpText, c27174h.helpText) && AbstractC22676k.m65745e(this.helpLink, c27174h.helpLink);
    }

    public int hashCode() {
        return this.helpLink.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.headline), 31, this.body), 31, this.helpText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.headline;
        String str3 = this.body;
        String str4 = this.helpText;
        String str5 = this.helpLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UnavailableBodyArgs(title=", str, ", headline=", str2, ", body=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", helpText=", str4, ", helpLink=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
