package i21;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import y11.C39065r;

/* JADX INFO: renamed from: i21.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Li21/j;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Ly81/f;", "titleColor", "Ly11/r;", "horizontalImpactBarViewState", "Li21/l;", "impactCardType", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/f;", "e", "()Ly81/f;", "Ly11/r;", "()Ly11/r;", "d", "Li21/l;", "()Li21/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18000j implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f69861e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39065r horizontalImpactBarViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC18002l impactCardType;

    public C18000j(TextResource title, EnumC39333f titleColor, C39065r horizontalImpactBarViewState, InterfaceC18002l impactCardType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        this.title = title;
        this.titleColor = titleColor;
        this.horizontalImpactBarViewState = horizontalImpactBarViewState;
        this.impactCardType = impactCardType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39065r getHorizontalImpactBarViewState() {
        return this.horizontalImpactBarViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC18002l getImpactCardType() {
        return this.impactCardType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18000j)) {
            return false;
        }
        C18000j c18000j = (C18000j) other;
        return AbstractC22676k.m65745e(this.title, c18000j.title) && this.titleColor == c18000j.titleColor && AbstractC22676k.m65745e(this.horizontalImpactBarViewState, c18000j.horizontalImpactBarViewState) && AbstractC22676k.m65745e(this.impactCardType, c18000j.impactCardType);
    }

    public int hashCode() {
        return this.impactCardType.hashCode() + ((this.horizontalImpactBarViewState.hashCode() + AbstractC21702c.m61132c(this.titleColor, this.title.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "ImpactCardState(title=" + this.title + ", titleColor=" + this.titleColor + ", horizontalImpactBarViewState=" + this.horizontalImpactBarViewState + ", impactCardType=" + this.impactCardType + ")";
    }

    public /* synthetic */ C18000j(TextResource textResource, EnumC39333f enumC39333f, C39065r c39065r, InterfaceC18002l interfaceC18002l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, c39065r, interfaceC18002l);
    }
}
