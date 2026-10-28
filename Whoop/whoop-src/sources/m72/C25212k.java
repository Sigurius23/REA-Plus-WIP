package m72;

import java.util.List;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m72.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lm72/k;", "Lm91/u;", "", "imageUrl", "cardTitle", "cardSubtitle", "", "Lm72/j;", "metricList", "Lny0/p0;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lny0/p0;", "f", "()Lny0/p0;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25212k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String cardTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cardSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C25211j> metricList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27273p0 secondaryButton;

    public C25212k(String imageUrl, String cardTitle, String cardSubtitle, List<C25211j> metricList, C27273p0 secondaryButton) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(cardSubtitle, "cardSubtitle");
        AbstractC22676k.m65750j(metricList, "metricList");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.imageUrl = imageUrl;
        this.cardTitle = cardTitle;
        this.cardSubtitle = cardSubtitle;
        this.metricList = metricList;
        this.secondaryButton = secondaryButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardSubtitle() {
        return this.cardSubtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e */
    public final List<C25211j> m73842e() {
        return this.metricList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25212k)) {
            return false;
        }
        C25212k c25212k = (C25212k) other;
        return AbstractC22676k.m65745e(this.imageUrl, c25212k.imageUrl) && AbstractC22676k.m65745e(this.cardTitle, c25212k.cardTitle) && AbstractC22676k.m65745e(this.cardSubtitle, c25212k.cardSubtitle) && AbstractC22676k.m65745e(this.metricList, c25212k.metricList) && AbstractC22676k.m65745e(this.secondaryButton, c25212k.secondaryButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27273p0 getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.cardTitle), 31, this.cardSubtitle), 31, this.metricList);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.cardTitle;
        String str3 = this.cardSubtitle;
        List<C25211j> list = this.metricList;
        C27273p0 c27273p0 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StudyInsightsViewState(imageUrl=", str, ", cardTitle=", str2, ", cardSubtitle=");
        AbstractC36095b.m114694v(str3, ", metricList=", ", secondaryButton=", sbM32001t, list);
        sbM32001t.append(c27273p0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
