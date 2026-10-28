package mx2;

import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mx2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, m65681d2 = {"Lmx2/i;", "", "", "title", "subtitle", "", "Lmx2/j;", "options", "bottomText", "ctaText", "backText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "f", "getBackText", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26022i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C26023j> options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String bottomText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String ctaText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String backText;

    public C26022i(String title, String subtitle, List<C26023j> options, String bottomText, String ctaText, String backText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(bottomText, "bottomText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(backText, "backText");
        this.title = title;
        this.subtitle = subtitle;
        this.options = options;
        this.bottomText = bottomText;
        this.ctaText = ctaText;
        this.backText = backText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: c */
    public final List<C26023j> m77401c() {
        return this.options;
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
        if (!(other instanceof C26022i)) {
            return false;
        }
        C26022i c26022i = (C26022i) other;
        return AbstractC22676k.m65745e(this.title, c26022i.title) && AbstractC22676k.m65745e(this.subtitle, c26022i.subtitle) && AbstractC22676k.m65745e(this.options, c26022i.options) && AbstractC22676k.m65745e(this.bottomText, c26022i.bottomText) && AbstractC22676k.m65745e(this.ctaText, c26022i.ctaText) && AbstractC22676k.m65745e(this.backText, c26022i.backText);
    }

    public int hashCode() {
        return this.backText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.options), 31, this.bottomText), 31, this.ctaText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<C26023j> list = this.options;
        String str3 = this.bottomText;
        String str4 = this.ctaText;
        String str5 = this.backText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CancelReasonConfigDomain(title=", str, ", subtitle=", str2, ", options=");
        AbstractC17176i.m48511m(", bottomText=", str3, ", ctaText=", sbM32001t, list);
        return AbstractC11266d.m30464r(sbM32001t, str4, ", backText=", str5, ")");
    }
}
