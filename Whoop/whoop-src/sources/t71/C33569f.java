package t71;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: t71.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006%"}, m65681d2 = {"Lt71/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Ly81/f;", "titleColor", "subTitle", "subTitleColor", "Lt71/g;", "impactCardType", "ctaButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/f;", "g", "()Ly81/f;", "c", "d", "e", "Lt71/g;", "()Lt71/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33569f implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f140060g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f subTitleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC33570g impactCardType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource ctaButtonText;

    public C33569f(TextResource title, EnumC39333f titleColor, TextResource subTitle, EnumC39333f subTitleColor, InterfaceC33570g impactCardType, TextResource ctaButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(subTitleColor, "subTitleColor");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        AbstractC22676k.m65750j(ctaButtonText, "ctaButtonText");
        this.title = title;
        this.titleColor = titleColor;
        this.subTitle = subTitle;
        this.subTitleColor = subTitleColor;
        this.impactCardType = impactCardType;
        this.ctaButtonText = ctaButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC33570g getImpactCardType() {
        return this.impactCardType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getSubTitleColor() {
        return this.subTitleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33569f)) {
            return false;
        }
        C33569f c33569f = (C33569f) other;
        return AbstractC22676k.m65745e(this.title, c33569f.title) && this.titleColor == c33569f.titleColor && AbstractC22676k.m65745e(this.subTitle, c33569f.subTitle) && this.subTitleColor == c33569f.subTitleColor && AbstractC22676k.m65745e(this.impactCardType, c33569f.impactCardType) && AbstractC22676k.m65745e(this.ctaButtonText, c33569f.ctaButtonText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return this.ctaButtonText.hashCode() + ((this.impactCardType.hashCode() + AbstractC21702c.m61132c(this.subTitleColor, AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.titleColor, this.title.hashCode() * 31, 31), this.subTitle, 31), 31)) * 31);
    }

    public String toString() {
        return "ImpactActivityCardState(title=" + this.title + ", titleColor=" + this.titleColor + ", subTitle=" + this.subTitle + ", subTitleColor=" + this.subTitleColor + ", impactCardType=" + this.impactCardType + ", ctaButtonText=" + this.ctaButtonText + ")";
    }

    public /* synthetic */ C33569f(TextResource textResource, EnumC39333f enumC39333f, TextResource textResource2, EnumC39333f enumC39333f2, InterfaceC33570g interfaceC33570g, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? EnumC39333f.WHITE_50 : enumC39333f2, interfaceC33570g, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource3);
    }
}
