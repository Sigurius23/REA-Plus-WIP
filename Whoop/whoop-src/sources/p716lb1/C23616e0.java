package p716lb1;

import b91.C2886a;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.e0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Llb1/e0;", "", "Ly81/f;", "fillColor", "trackColor", "Lb91/a;", "labelTextStyle", "labelTextColor", "Ly3/f;", "ringDiameter", "<init>", "(Ly81/f;Ly81/f;Lb91/a;Ly81/f;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "()Ly81/f;", "b", "e", "c", "Lb91/a;", "()Lb91/a;", "d", "F", "()F", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C23616e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f fillColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f trackColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a labelTextStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f labelTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float ringDiameter;

    public /* synthetic */ C23616e0(EnumC39333f enumC39333f, EnumC39333f enumC39333f2, C2886a c2886a, EnumC39333f enumC39333f3, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC39333f, enumC39333f2, c2886a, enumC39333f3, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getLabelTextColor() {
        return this.labelTextColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getLabelTextStyle() {
        return this.labelTextStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getRingDiameter() {
        return this.ringDiameter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getTrackColor() {
        return this.trackColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23616e0)) {
            return false;
        }
        C23616e0 c23616e0 = (C23616e0) other;
        return this.fillColor == c23616e0.fillColor && this.trackColor == c23616e0.trackColor && AbstractC22676k.m65745e(this.labelTextStyle, c23616e0.labelTextStyle) && this.labelTextColor == c23616e0.labelTextColor && C39174f.m124782b(this.ringDiameter, c23616e0.ringDiameter);
    }

    public int hashCode() {
        return Float.hashCode(this.ringDiameter) + AbstractC21702c.m61132c(this.labelTextColor, AbstractC11895b.m31984c(this.labelTextStyle, AbstractC21702c.m61132c(this.trackColor, this.fillColor.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        EnumC39333f enumC39333f = this.fillColor;
        EnumC39333f enumC39333f2 = this.trackColor;
        C2886a c2886a = this.labelTextStyle;
        EnumC39333f enumC39333f3 = this.labelTextColor;
        String strM124783c = C39174f.m124783c(this.ringDiameter);
        StringBuilder sb4 = new StringBuilder("CircularProgressAppearance(fillColor=");
        sb4.append(enumC39333f);
        sb4.append(", trackColor=");
        sb4.append(enumC39333f2);
        sb4.append(", labelTextStyle=");
        sb4.append(c2886a);
        sb4.append(", labelTextColor=");
        sb4.append(enumC39333f3);
        sb4.append(", ringDiameter=");
        return AbstractC25012a.m73376i(strM124783c, ")", sb4);
    }

    private C23616e0(EnumC39333f fillColor, EnumC39333f trackColor, C2886a labelTextStyle, EnumC39333f labelTextColor, float f13) {
        AbstractC22676k.m65750j(fillColor, "fillColor");
        AbstractC22676k.m65750j(trackColor, "trackColor");
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(labelTextColor, "labelTextColor");
        this.fillColor = fillColor;
        this.trackColor = trackColor;
        this.labelTextStyle = labelTextStyle;
        this.labelTextColor = labelTextColor;
        this.ringDiameter = f13;
    }
}
