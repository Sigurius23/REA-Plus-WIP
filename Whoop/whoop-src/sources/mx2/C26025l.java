package mx2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mx2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lmx2/l;", "", "", "title", "body", "positiveCta", "negativeCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26025l {

    /* JADX INFO: renamed from: f */
    private static final C26025l f102943f = new C26025l("", "", "", "");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String positiveCta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String negativeCta;

    public C26025l(String title, String body, String positiveCta, String negativeCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        this.title = title;
        this.body = body;
        this.positiveCta = positiveCta;
        this.negativeCta = negativeCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNegativeCta() {
        return this.negativeCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPositiveCta() {
        return this.positiveCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26025l)) {
            return false;
        }
        C26025l c26025l = (C26025l) other;
        return AbstractC22676k.m65745e(this.title, c26025l.title) && AbstractC22676k.m65745e(this.body, c26025l.body) && AbstractC22676k.m65745e(this.positiveCta, c26025l.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, c26025l.negativeCta);
    }

    public int hashCode() {
        return this.negativeCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.positiveCta);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("StringsDomainConfig(title=", str, ", body=", str2, ", positiveCta="), this.positiveCta, ", negativeCta=", this.negativeCta, ")");
    }
}
