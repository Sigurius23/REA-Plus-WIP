package d90;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: d90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0015\u0010\f¨\u0006\u001f"}, m65681d2 = {"Ld90/c;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "analyticsName", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11812c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f38399e = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String analyticsName;

    public C11812c(AbstractC22403o image, TextResource title, String str, String analyticsName) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.image = image;
        this.title = title;
        this.subTitle = str;
        this.analyticsName = analyticsName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11812c)) {
            return false;
        }
        C11812c c11812c = (C11812c) other;
        return AbstractC22676k.m65745e(this.image, c11812c.image) && AbstractC22676k.m65745e(this.title, c11812c.title) && AbstractC22676k.m65745e(this.subTitle, c11812c.subTitle) && AbstractC22676k.m65745e(this.analyticsName, c11812c.analyticsName);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
        String str = this.subTitle;
        return this.analyticsName.hashCode() + ((iM95625a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        return AbstractC11266d.m30464r(AbstractC36095b.m114683k("FamilyPlanBlockViewState(image=", textResource, abstractC22403o, ", title=", ", subTitle="), this.subTitle, ", analyticsName=", this.analyticsName, ")");
    }
}
