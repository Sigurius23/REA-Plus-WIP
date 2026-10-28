package m81;

import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: m81.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lm81/f;", "", "Ly81/e;", "contentColor", "backgroundColor", "iconColor", "borderColor", "Ly3/f;", "borderWidth", "cornerRadius", "<init>", "(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "d", "()Ly81/e;", "b", "c", "f", "e", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25231f {

    /* JADX INFO: renamed from: g */
    public static final int f99095g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e contentColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e borderColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float borderWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float cornerRadius;

    public /* synthetic */ C25231f(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, interfaceC39332e2, interfaceC39332e3, interfaceC39332e4, f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC39332e getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25231f)) {
            return false;
        }
        C25231f c25231f = (C25231f) other;
        return AbstractC22676k.m65745e(this.contentColor, c25231f.contentColor) && AbstractC22676k.m65745e(this.backgroundColor, c25231f.backgroundColor) && AbstractC22676k.m65745e(this.iconColor, c25231f.iconColor) && AbstractC22676k.m65745e(this.borderColor, c25231f.borderColor) && C39174f.m124782b(this.borderWidth, c25231f.borderWidth) && C39174f.m124782b(this.cornerRadius, c25231f.cornerRadius);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        int iM106648g = AbstractC33745d.m106648g(this.iconColor, AbstractC33745d.m106648g(this.backgroundColor, this.contentColor.hashCode() * 31, 31), 31);
        InterfaceC39332e interfaceC39332e = this.borderColor;
        return Float.hashCode(this.cornerRadius) + AbstractC11266d.m30447a(this.borderWidth, (iM106648g + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31, 31);
    }

    public String toString() {
        InterfaceC39332e interfaceC39332e = this.contentColor;
        InterfaceC39332e interfaceC39332e2 = this.backgroundColor;
        InterfaceC39332e interfaceC39332e3 = this.iconColor;
        InterfaceC39332e interfaceC39332e4 = this.borderColor;
        String strM124783c = C39174f.m124783c(this.borderWidth);
        String strM124783c2 = C39174f.m124783c(this.cornerRadius);
        StringBuilder sb4 = new StringBuilder("SelectorButtonStyle(contentColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", backgroundColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", iconColor=");
        sb4.append(interfaceC39332e3);
        sb4.append(", borderColor=");
        sb4.append(interfaceC39332e4);
        sb4.append(", borderWidth=");
        return AbstractC11266d.m30464r(sb4, strM124783c, ", cornerRadius=", strM124783c2, ")");
    }

    private C25231f(InterfaceC39332e contentColor, InterfaceC39332e backgroundColor, InterfaceC39332e iconColor, InterfaceC39332e interfaceC39332e, float f13, float f14) {
        AbstractC22676k.m65750j(contentColor, "contentColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        this.contentColor = contentColor;
        this.backgroundColor = backgroundColor;
        this.iconColor = iconColor;
        this.borderColor = interfaceC39332e;
        this.borderWidth = f13;
        this.cornerRadius = f14;
    }

    public C25231f(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, InterfaceC39332e interfaceC39332e4, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, interfaceC39332e2, (i13 & 4) != 0 ? interfaceC39332e : interfaceC39332e3, (i13 & 8) != 0 ? null : interfaceC39332e4, (i13 & 16) != 0 ? 1 : f13, (i13 & 32) != 0 ? 3 * 4 : f14, null);
    }
}
