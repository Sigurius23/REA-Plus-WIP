package ss2;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ss2.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0017\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, m65681d2 = {"Lss2/a;", "", "", "navigationTitle", "heroImageUrl", "januaryJumpstartImageUrl", "Lss2/d;", "headerSection", "Lcom/whoop/design/models/DesignSystemModel;", "customPlanCard", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lss2/d;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "e", "d", "Lss2/d;", "()Lss2/d;", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "Ljava/util/List;", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32950a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String heroImageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String januaryJumpstartImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C32953d headerSection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final DesignSystemModel customPlanCard;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<DesignSystemModel> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C32950a(String navigationTitle, String heroImageUrl, String januaryJumpstartImageUrl, C32953d headerSection, DesignSystemModel designSystemModel, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(heroImageUrl, "heroImageUrl");
        AbstractC22676k.m65750j(januaryJumpstartImageUrl, "januaryJumpstartImageUrl");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(items, "items");
        this.navigationTitle = navigationTitle;
        this.heroImageUrl = heroImageUrl;
        this.januaryJumpstartImageUrl = januaryJumpstartImageUrl;
        this.headerSection = headerSection;
        this.customPlanCard = designSystemModel;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DesignSystemModel getCustomPlanCard() {
        return this.customPlanCard;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C32953d getHeaderSection() {
        return this.headerSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeroImageUrl() {
        return this.heroImageUrl;
    }

    /* JADX INFO: renamed from: d */
    public final List<DesignSystemModel> m104053d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getJanuaryJumpstartImageUrl() {
        return this.januaryJumpstartImageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32950a)) {
            return false;
        }
        C32950a c32950a = (C32950a) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c32950a.navigationTitle) && AbstractC22676k.m65745e(this.heroImageUrl, c32950a.heroImageUrl) && AbstractC22676k.m65745e(this.januaryJumpstartImageUrl, c32950a.januaryJumpstartImageUrl) && AbstractC22676k.m65745e(this.headerSection, c32950a.headerSection) && AbstractC22676k.m65745e(this.customPlanCard, c32950a.customPlanCard) && AbstractC22676k.m65745e(this.items, c32950a.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public int hashCode() {
        int iHashCode = (this.headerSection.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.heroImageUrl), 31, this.januaryJumpstartImageUrl)) * 31;
        DesignSystemModel designSystemModel = this.customPlanCard;
        return this.items.hashCode() + ((iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.heroImageUrl;
        String str3 = this.januaryJumpstartImageUrl;
        C32953d c32953d = this.headerSection;
        DesignSystemModel designSystemModel = this.customPlanCard;
        List<DesignSystemModel> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeLandingDomain(navigationTitle=", str, ", heroImageUrl=", str2, ", januaryJumpstartImageUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", headerSection=");
        sbM32001t.append(c32953d);
        sbM32001t.append(", customPlanCard=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
