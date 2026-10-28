package rv2;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: rv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lrv2/b;", "", "", "imageUrl", "ctaText", "bottomText", "", "Lm91/u;", "contentItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31844b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String ctaText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String bottomText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> contentItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C31844b(String str, String str2, String str3, List<? extends InterfaceC25312u> contentItems) {
        AbstractC22676k.m65750j(contentItems, "contentItems");
        this.imageUrl = str;
        this.ctaText = str2;
        this.bottomText = str3;
        this.contentItems = contentItems;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m98954b() {
        return this.contentItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31844b)) {
            return false;
        }
        C31844b c31844b = (C31844b) other;
        return AbstractC22676k.m65745e(this.imageUrl, c31844b.imageUrl) && AbstractC22676k.m65745e(this.ctaText, c31844b.ctaText) && AbstractC22676k.m65745e(this.bottomText, c31844b.bottomText) && AbstractC22676k.m65745e(this.contentItems, c31844b.contentItems);
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ctaText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomText;
        return this.contentItems.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.ctaText;
        return AbstractC30007c.m91840j(this.bottomText, ", contentItems=", ")", AbstractC11895b.m32001t("NoWorkoutsState(imageUrl=", str, ", ctaText=", str2, ", bottomText="), this.contentItems);
    }
}
