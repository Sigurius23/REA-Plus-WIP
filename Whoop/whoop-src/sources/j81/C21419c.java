package j81;

import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0084\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b1\u0010!R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b'\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b2\u00104¨\u00065"}, m65681d2 = {"Lj81/c;", "", "Ly3/f;", "diameter", "", "fillPercentage", "Li91/a;", "background", "scoreTarget", "lowerOptimalPercentage", "higherOptimalPercentage", "", "shouldHideOptimalRange", "strokeWidth", "capCornerRadiusFraction", "Ly81/f;", "backgroundColor", "optimalRangeColor", "<init>", "(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;)Lj81/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "f", "()F", "b", "g", "c", "Li91/a;", "()Li91/a;", "d", "Ljava/lang/Float;", "k", "()Ljava/lang/Float;", "e", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "l", "()Z", "m", "j", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21419c {

    /* JADX INFO: renamed from: l */
    public static final int f82183l = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float diameter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18247a background;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Float scoreTarget;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Float lowerOptimalPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Float higherOptimalPercentage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean shouldHideOptimalRange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float capCornerRadiusFraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC39333f optimalRangeColor;

    public /* synthetic */ C21419c(float f13, float f14, AbstractC18247a abstractC18247a, Float f15, Float f16, Float f17, boolean z4, float f18, float f19, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, abstractC18247a, f15, f16, f17, z4, f18, f19, enumC39333f, enumC39333f2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21419c m60241b(C21419c c21419c, float f13, float f14, AbstractC18247a abstractC18247a, Float f15, Float f16, Float f17, boolean z4, float f18, float f19, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c21419c.diameter;
        }
        if ((i13 & 2) != 0) {
            f14 = c21419c.fillPercentage;
        }
        if ((i13 & 4) != 0) {
            abstractC18247a = c21419c.background;
        }
        if ((i13 & 8) != 0) {
            f15 = c21419c.scoreTarget;
        }
        if ((i13 & 16) != 0) {
            f16 = c21419c.lowerOptimalPercentage;
        }
        if ((i13 & 32) != 0) {
            f17 = c21419c.higherOptimalPercentage;
        }
        if ((i13 & 64) != 0) {
            z4 = c21419c.shouldHideOptimalRange;
        }
        if ((i13 & 128) != 0) {
            f18 = c21419c.strokeWidth;
        }
        if ((i13 & 256) != 0) {
            f19 = c21419c.capCornerRadiusFraction;
        }
        if ((i13 & 512) != 0) {
            enumC39333f = c21419c.backgroundColor;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC39333f2 = c21419c.optimalRangeColor;
        }
        EnumC39333f enumC39333f3 = enumC39333f;
        EnumC39333f enumC39333f4 = enumC39333f2;
        float f24 = f18;
        float f25 = f19;
        Float f26 = f17;
        boolean z13 = z4;
        Float f27 = f16;
        AbstractC18247a abstractC18247a2 = abstractC18247a;
        return c21419c.m60242a(f13, f14, abstractC18247a2, f15, f27, f26, z13, f24, f25, enumC39333f3, enumC39333f4);
    }

    /* JADX INFO: renamed from: a */
    public final C21419c m60242a(float diameter, float fillPercentage, AbstractC18247a background, Float scoreTarget, Float lowerOptimalPercentage, Float higherOptimalPercentage, boolean shouldHideOptimalRange, float strokeWidth, float capCornerRadiusFraction, EnumC39333f backgroundColor, EnumC39333f optimalRangeColor) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(optimalRangeColor, "optimalRangeColor");
        return new C21419c(diameter, fillPercentage, background, scoreTarget, lowerOptimalPercentage, higherOptimalPercentage, shouldHideOptimalRange, strokeWidth, capCornerRadiusFraction, backgroundColor, optimalRangeColor, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getCapCornerRadiusFraction() {
        return this.capCornerRadiusFraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21419c)) {
            return false;
        }
        C21419c c21419c = (C21419c) other;
        return C39174f.m124782b(this.diameter, c21419c.diameter) && Float.compare(this.fillPercentage, c21419c.fillPercentage) == 0 && AbstractC22676k.m65745e(this.background, c21419c.background) && AbstractC22676k.m65745e(this.scoreTarget, c21419c.scoreTarget) && AbstractC22676k.m65745e(this.lowerOptimalPercentage, c21419c.lowerOptimalPercentage) && AbstractC22676k.m65745e(this.higherOptimalPercentage, c21419c.higherOptimalPercentage) && this.shouldHideOptimalRange == c21419c.shouldHideOptimalRange && C39174f.m124782b(this.strokeWidth, c21419c.strokeWidth) && Float.compare(this.capCornerRadiusFraction, c21419c.capCornerRadiusFraction) == 0 && this.backgroundColor == c21419c.backgroundColor && this.optimalRangeColor == c21419c.optimalRangeColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDiameter() {
        return this.diameter;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getHigherOptimalPercentage() {
        return this.higherOptimalPercentage;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + AbstractC11266d.m30447a(this.fillPercentage, Float.hashCode(this.diameter) * 31, 31)) * 31;
        Float f13 = this.scoreTarget;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.lowerOptimalPercentage;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.higherOptimalPercentage;
        return this.optimalRangeColor.hashCode() + AbstractC21702c.m61132c(this.backgroundColor, AbstractC11266d.m30447a(this.capCornerRadiusFraction, AbstractC11266d.m30447a(this.strokeWidth, AbstractC2875y.m8289b((iHashCode3 + (f15 != null ? f15.hashCode() : 0)) * 31, 31, this.shouldHideOptimalRange), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getLowerOptimalPercentage() {
        return this.lowerOptimalPercentage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC39333f getOptimalRangeColor() {
        return this.optimalRangeColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getScoreTarget() {
        return this.scoreTarget;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShouldHideOptimalRange() {
        return this.shouldHideOptimalRange;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.diameter);
        float f13 = this.fillPercentage;
        AbstractC18247a abstractC18247a = this.background;
        Float f14 = this.scoreTarget;
        Float f15 = this.lowerOptimalPercentage;
        Float f16 = this.higherOptimalPercentage;
        boolean z4 = this.shouldHideOptimalRange;
        String strM124783c2 = C39174f.m124783c(this.strokeWidth);
        float f17 = this.capCornerRadiusFraction;
        EnumC39333f enumC39333f = this.backgroundColor;
        EnumC39333f enumC39333f2 = this.optimalRangeColor;
        StringBuilder sb4 = new StringBuilder("CircularProgressDialState(diameter=");
        sb4.append(strM124783c);
        sb4.append(", fillPercentage=");
        sb4.append(f13);
        sb4.append(", background=");
        sb4.append(abstractC18247a);
        sb4.append(", scoreTarget=");
        sb4.append(f14);
        sb4.append(", lowerOptimalPercentage=");
        sb4.append(f15);
        sb4.append(", higherOptimalPercentage=");
        sb4.append(f16);
        sb4.append(", shouldHideOptimalRange=");
        AbstractC38963t7.m124391u(sb4, z4, ", strokeWidth=", strM124783c2, ", capCornerRadiusFraction=");
        sb4.append(f17);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", optimalRangeColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f2, ")");
    }

    private C21419c(float f13, float f14, AbstractC18247a background, Float f15, Float f16, Float f17, boolean z4, float f18, float f19, EnumC39333f backgroundColor, EnumC39333f optimalRangeColor) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(optimalRangeColor, "optimalRangeColor");
        this.diameter = f13;
        this.fillPercentage = f14;
        this.background = background;
        this.scoreTarget = f15;
        this.lowerOptimalPercentage = f16;
        this.higherOptimalPercentage = f17;
        this.shouldHideOptimalRange = z4;
        this.strokeWidth = f18;
        this.capCornerRadiusFraction = f19;
        this.backgroundColor = backgroundColor;
        this.optimalRangeColor = optimalRangeColor;
    }

    public /* synthetic */ C21419c(float f13, float f14, AbstractC18247a abstractC18247a, Float f15, Float f16, Float f17, boolean z4, float f18, float f19, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, abstractC18247a, (i13 & 8) != 0 ? null : f15, (i13 & 16) != 0 ? null : f16, (i13 & 32) != 0 ? null : f17, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? Float.NaN : f18, (i13 & 256) != 0 ? 0.7f : f19, (i13 & 512) != 0 ? EnumC39333f.WHITE_10 : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC39333f.WHITE_20 : enumC39333f2, null);
    }
}
