package k42;

import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k42.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lk42/d;", "", "", "title", "subtitle", "", "Lk42/b;", "accountList", "footerText", "", "display", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22194d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C22192b> accountList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String footerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean display;

    public C22194d(String title, String subtitle, List<C22192b> accountList, String footerText, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(accountList, "accountList");
        AbstractC22676k.m65750j(footerText, "footerText");
        this.title = title;
        this.subtitle = subtitle;
        this.accountList = accountList;
        this.footerText = footerText;
        this.display = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22192b> m63560a() {
        return this.accountList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
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
        if (!(other instanceof C22194d)) {
            return false;
        }
        C22194d c22194d = (C22194d) other;
        return AbstractC22676k.m65745e(this.title, c22194d.title) && AbstractC22676k.m65745e(this.subtitle, c22194d.subtitle) && AbstractC22676k.m65745e(this.accountList, c22194d.accountList) && AbstractC22676k.m65745e(this.footerText, c22194d.footerText) && this.display == c22194d.display;
    }

    public int hashCode() {
        return Boolean.hashCode(this.display) + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.accountList), 31, this.footerText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<C22192b> list = this.accountList;
        String str3 = this.footerText;
        boolean z4 = this.display;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataSharingDomainState(title=", str, ", subtitle=", str2, ", accountList=");
        AbstractC17176i.m48511m(", footerText=", str3, ", display=", sbM32001t, list);
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
