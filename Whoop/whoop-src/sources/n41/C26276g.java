package n41;

import b91.EnumC2888c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\u001e\u0010(R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%¨\u0006."}, m65681d2 = {"Ln41/g;", "", "Li2/x;", "textColor", "backgroundColor", "capsuleColor", "colonColor", "Ly3/f;", "cornerRadius", "Lb91/c;", "numberStyleLarge", "numberStyle", "labelStyle", "padding", "<init>", "(JJJJFLb91/c;Lb91/c;Lb91/c;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "getBackgroundColor-0d7_KjU", "c", "getCapsuleColor-0d7_KjU", "e", "F", "getCornerRadius-D9Ej5fM", "()F", "f", "Lb91/c;", "()Lb91/c;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getLabelStyle", "i", "getPadding-D9Ej5fM", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26276g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long capsuleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long colonColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC2888c numberStyleLarge;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC2888c numberStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC2888c labelStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float padding;

    public /* synthetic */ C26276g(long j7, long j13, long j14, long j15, float f13, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, EnumC2888c enumC2888c3, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, j14, j15, f13, enumC2888c, enumC2888c2, enumC2888c3, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColonColor() {
        return this.colonColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC2888c getNumberStyle() {
        return this.numberStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC2888c getNumberStyleLarge() {
        return this.numberStyleLarge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26276g)) {
            return false;
        }
        C26276g c26276g = (C26276g) other;
        return C17919x.m51542d(this.textColor, c26276g.textColor) && C17919x.m51542d(this.backgroundColor, c26276g.backgroundColor) && C17919x.m51542d(this.capsuleColor, c26276g.capsuleColor) && C17919x.m51542d(this.colonColor, c26276g.colonColor) && C39174f.m124782b(this.cornerRadius, c26276g.cornerRadius) && this.numberStyleLarge == c26276g.numberStyleLarge && this.numberStyle == c26276g.numberStyle && this.labelStyle == c26276g.labelStyle && C39174f.m124782b(this.padding, c26276g.padding);
    }

    public int hashCode() {
        long j7 = this.textColor;
        int i13 = C17919x.f69638o;
        return Float.hashCode(this.padding) + ((this.labelStyle.hashCode() + ((this.numberStyle.hashCode() + ((this.numberStyleLarge.hashCode() + AbstractC11266d.m30447a(this.cornerRadius, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(j7) * 31, this.backgroundColor, 31), this.capsuleColor, 31), this.colonColor, 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String strM51548j = C17919x.m51548j(this.textColor);
        String strM51548j2 = C17919x.m51548j(this.backgroundColor);
        String strM51548j3 = C17919x.m51548j(this.capsuleColor);
        String strM51548j4 = C17919x.m51548j(this.colonColor);
        String strM124783c = C39174f.m124783c(this.cornerRadius);
        EnumC2888c enumC2888c = this.numberStyleLarge;
        EnumC2888c enumC2888c2 = this.numberStyle;
        EnumC2888c enumC2888c3 = this.labelStyle;
        String strM124783c2 = C39174f.m124783c(this.padding);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TimerStyle(textColor=", strM51548j, ", backgroundColor=", strM51548j2, ", capsuleColor=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", colonColor=", strM51548j4, ", cornerRadius=");
        sbM32001t.append(strM124783c);
        sbM32001t.append(", numberStyleLarge=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", numberStyle=");
        sbM32001t.append(enumC2888c2);
        sbM32001t.append(", labelStyle=");
        sbM32001t.append(enumC2888c3);
        sbM32001t.append(", padding=");
        return AbstractC25012a.m73376i(strM124783c2, ")", sbM32001t);
    }

    private C26276g(long j7, long j13, long j14, long j15, float f13, EnumC2888c numberStyleLarge, EnumC2888c numberStyle, EnumC2888c labelStyle, float f14) {
        AbstractC22676k.m65750j(numberStyleLarge, "numberStyleLarge");
        AbstractC22676k.m65750j(numberStyle, "numberStyle");
        AbstractC22676k.m65750j(labelStyle, "labelStyle");
        this.textColor = j7;
        this.backgroundColor = j13;
        this.capsuleColor = j14;
        this.colonColor = j15;
        this.cornerRadius = f13;
        this.numberStyleLarge = numberStyleLarge;
        this.numberStyle = numberStyle;
        this.labelStyle = labelStyle;
        this.padding = f14;
    }
}
