package k42;

import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: k42.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lk42/a;", "", "", "title", "subtitle", "disclaimer", "", "Lk42/c;", "dataSharingBoxes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22191a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String disclaimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C22193c> dataSharingBoxes;

    public C22191a(String title, String subtitle, String disclaimer, List<C22193c> dataSharingBoxes) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(dataSharingBoxes, "dataSharingBoxes");
        this.title = title;
        this.subtitle = subtitle;
        this.disclaimer = disclaimer;
        this.dataSharingBoxes = dataSharingBoxes;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22193c> m63547a() {
        return this.dataSharingBoxes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22191a)) {
            return false;
        }
        C22191a c22191a = (C22191a) other;
        return AbstractC22676k.m65745e(this.title, c22191a.title) && AbstractC22676k.m65745e(this.subtitle, c22191a.subtitle) && AbstractC22676k.m65745e(this.disclaimer, c22191a.disclaimer) && AbstractC22676k.m65745e(this.dataSharingBoxes, c22191a.dataSharingBoxes);
    }

    public int hashCode() {
        return this.dataSharingBoxes.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.disclaimer);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return AbstractC30007c.m91840j(this.disclaimer, ", dataSharingBoxes=", ")", AbstractC11895b.m32001t("AccountDataSharingDomainState(title=", str, ", subtitle=", str2, ", disclaimer="), this.dataSharingBoxes);
    }
}
