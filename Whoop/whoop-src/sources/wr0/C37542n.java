package wr0;

import com.whoop.communitymoments.domain.models.MenuAnchorButtonStyle;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vy0.C36570d0;

/* JADX INFO: renamed from: wr0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lwr0/n;", "Lm91/u;", "Lgz0/m0;", "icon", "", "contentDescription", "Lkd1/o;", "iconImage", "Lvy0/d0;", "menu", "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;", "style", "<init>", "(Lgz0/m0;Ljava/lang/String;Lkd1/o;Lvy0/d0;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Ljava/lang/String;", "c", "Lkd1/o;", "()Lkd1/o;", "d", "Lvy0/d0;", "e", "()Lvy0/d0;", "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;", "f", "()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37542n implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f160541f = C36570d0.f156622b | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String contentDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o iconImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36570d0 menu;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final MenuAnchorButtonStyle style;

    public C37542n(EnumC16313m0 icon, String str, AbstractC22403o abstractC22403o, C36570d0 menu, MenuAnchorButtonStyle style) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(menu, "menu");
        AbstractC22676k.m65750j(style, "style");
        this.icon = icon;
        this.contentDescription = str;
        this.iconImage = abstractC22403o;
        this.menu = menu;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getIconImage() {
        return this.iconImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C36570d0 getMenu() {
        return this.menu;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37542n)) {
            return false;
        }
        C37542n c37542n = (C37542n) other;
        return this.icon == c37542n.icon && AbstractC22676k.m65745e(this.contentDescription, c37542n.contentDescription) && AbstractC22676k.m65745e(this.iconImage, c37542n.iconImage) && AbstractC22676k.m65745e(this.menu, c37542n.menu) && this.style == c37542n.style;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final MenuAnchorButtonStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        String str = this.contentDescription;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.iconImage;
        return this.style.hashCode() + ((this.menu.hashCode() + ((iHashCode2 + (abstractC22403o != null ? abstractC22403o.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "MenuAnchorButtonState(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", iconImage=" + this.iconImage + ", menu=" + this.menu + ", style=" + this.style + ")";
    }
}
