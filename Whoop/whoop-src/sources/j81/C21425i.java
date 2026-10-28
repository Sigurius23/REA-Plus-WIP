package j81;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: j81.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u00103R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010E\u001a\u0004\b,\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b/\u0010SR\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b6\u0010VR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\b>\u0010VR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b@\u0010Z¨\u0006["}, m65681d2 = {"Lj81/i;", "Lm91/u;", "", "id", "testTag", "Lcom/whoop/design/util/TextResource;", "scoreDisplay", "scoreDisplaySuffix", "scoreDisplayTitle", "", "scoreTarget", "gaugeFillPercentage", "lowerOptimalPercentage", "higherOptimalPercentage", "Li91/a;", "progressFillColor", "", "Ly81/f;", "barStyles", "Ly3/f;", "diameter", "strokeWidth", "capCornerRadiusFraction", "", "shouldHideOptimalRange", "Lcom/whoop/navigation/e;", "destination", "scoreDisplayColor", "scoreDisplayTitleColor", "", "scoreDisplayTitleIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lj81/c;", "k", "()Lj81/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "j", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "f", "e", "g", "Ljava/lang/Float;", "getScoreTarget", "()Ljava/lang/Float;", "F", "getGaugeFillPercentage", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getLowerOptimalPercentage", "i", "getHigherOptimalPercentage", "Li91/a;", "getProgressFillColor", "()Li91/a;", "Ljava/util/List;", "()Ljava/util/List;", "l", "getDiameter-D9Ej5fM", "m", "getStrokeWidth-D9Ej5fM", "n", "getCapCornerRadiusFraction", "o", "Z", "getShouldHideOptimalRange", "()Z", "p", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "q", "Ly81/f;", "()Ly81/f;", "r", "s", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21425i implements InterfaceC25312u {

    /* JADX INFO: renamed from: t */
    public static final int f82224t = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource scoreDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource scoreDisplaySuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource scoreDisplayTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Float scoreTarget;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float gaugeFillPercentage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Float lowerOptimalPercentage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Float higherOptimalPercentage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC18247a progressFillColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<EnumC39333f> barStyles;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float diameter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float capCornerRadiusFraction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean shouldHideOptimalRange;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC39333f scoreDisplayColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final EnumC39333f scoreDisplayTitleColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Integer scoreDisplayTitleIcon;

    public /* synthetic */ C21425i(String str, String str2, TextResource textResource, TextResource textResource2, TextResource textResource3, Float f13, float f14, Float f15, Float f16, AbstractC18247a abstractC18247a, List list, float f17, float f18, float f19, boolean z4, C9598e c9598e, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, textResource, textResource2, textResource3, f13, f14, f15, f16, abstractC18247a, list, f17, f18, f19, z4, c9598e, enumC39333f, enumC39333f2, num);
    }

    /* JADX INFO: renamed from: a */
    public final List<EnumC39333f> m60294a() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getScoreDisplayColor() {
        return this.scoreDisplayColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21425i)) {
            return false;
        }
        C21425i c21425i = (C21425i) other;
        return AbstractC22676k.m65745e(this.id, c21425i.id) && AbstractC22676k.m65745e(this.testTag, c21425i.testTag) && AbstractC22676k.m65745e(this.scoreDisplay, c21425i.scoreDisplay) && AbstractC22676k.m65745e(this.scoreDisplaySuffix, c21425i.scoreDisplaySuffix) && AbstractC22676k.m65745e(this.scoreDisplayTitle, c21425i.scoreDisplayTitle) && AbstractC22676k.m65745e(this.scoreTarget, c21425i.scoreTarget) && Float.compare(this.gaugeFillPercentage, c21425i.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.lowerOptimalPercentage, c21425i.lowerOptimalPercentage) && AbstractC22676k.m65745e(this.higherOptimalPercentage, c21425i.higherOptimalPercentage) && AbstractC22676k.m65745e(this.progressFillColor, c21425i.progressFillColor) && AbstractC22676k.m65745e(this.barStyles, c21425i.barStyles) && C39174f.m124782b(this.diameter, c21425i.diameter) && C39174f.m124782b(this.strokeWidth, c21425i.strokeWidth) && Float.compare(this.capCornerRadiusFraction, c21425i.capCornerRadiusFraction) == 0 && this.shouldHideOptimalRange == c21425i.shouldHideOptimalRange && AbstractC22676k.m65745e(this.destination, c21425i.destination) && this.scoreDisplayColor == c21425i.scoreDisplayColor && this.scoreDisplayTitleColor == c21425i.scoreDisplayTitleColor && AbstractC22676k.m65745e(this.scoreDisplayTitleIcon, c21425i.scoreDisplayTitleIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getScoreDisplayTitle() {
        return this.scoreDisplayTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC39333f getScoreDisplayTitleColor() {
        return this.scoreDisplayTitleColor;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.testTag;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.scoreDisplay, 31), this.scoreDisplaySuffix, 31), this.scoreDisplayTitle, 31);
        Float f13 = this.scoreTarget;
        int iM30447a = AbstractC11266d.m30447a(this.gaugeFillPercentage, (iM95625a + (f13 == null ? 0 : f13.hashCode())) * 31, 31);
        Float f14 = this.lowerOptimalPercentage;
        int iHashCode2 = (iM30447a + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.higherOptimalPercentage;
        int iHashCode3 = (this.progressFillColor.hashCode() + ((iHashCode2 + (f15 == null ? 0 : f15.hashCode())) * 31)) * 31;
        List<EnumC39333f> list = this.barStyles;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.capCornerRadiusFraction, AbstractC11266d.m30447a(this.strokeWidth, AbstractC11266d.m30447a(this.diameter, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31, this.shouldHideOptimalRange);
        C9598e c9598e = this.destination;
        int iM61132c = AbstractC21702c.m61132c(this.scoreDisplayColor, (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31);
        EnumC39333f enumC39333f = this.scoreDisplayTitleColor;
        int iHashCode4 = (iM61132c + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        Integer num = this.scoreDisplayTitleIcon;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getScoreDisplayTitleIcon() {
        return this.scoreDisplayTitleIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: k */
    public final C21419c m60303k() {
        float f13 = this.diameter;
        float f14 = this.gaugeFillPercentage;
        AbstractC18247a abstractC18247a = this.progressFillColor;
        float f15 = this.strokeWidth;
        Float f16 = this.lowerOptimalPercentage;
        Float f17 = this.higherOptimalPercentage;
        return new C21419c(f13, f14, abstractC18247a, this.scoreTarget, f16, f17, this.shouldHideOptimalRange, f15, this.capCornerRadiusFraction, null, null, 1536, null);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.testTag;
        TextResource textResource = this.scoreDisplay;
        TextResource textResource2 = this.scoreDisplaySuffix;
        TextResource textResource3 = this.scoreDisplayTitle;
        Float f13 = this.scoreTarget;
        float f14 = this.gaugeFillPercentage;
        Float f15 = this.lowerOptimalPercentage;
        Float f16 = this.higherOptimalPercentage;
        AbstractC18247a abstractC18247a = this.progressFillColor;
        List<EnumC39333f> list = this.barStyles;
        String strM124783c = C39174f.m124783c(this.diameter);
        String strM124783c2 = C39174f.m124783c(this.strokeWidth);
        float f17 = this.capCornerRadiusFraction;
        boolean z4 = this.shouldHideOptimalRange;
        C9598e c9598e = this.destination;
        EnumC39333f enumC39333f = this.scoreDisplayColor;
        EnumC39333f enumC39333f2 = this.scoreDisplayTitleColor;
        Integer num = this.scoreDisplayTitleIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScoreGaugeState(id=", str, ", testTag=", str2, ", scoreDisplay=");
        AbstractC30007c.m91855y(sbM32001t, textResource, ", scoreDisplaySuffix=", textResource2, ", scoreDisplayTitle=");
        sbM32001t.append(textResource3);
        sbM32001t.append(", scoreTarget=");
        sbM32001t.append(f13);
        sbM32001t.append(", gaugeFillPercentage=");
        sbM32001t.append(f14);
        sbM32001t.append(", lowerOptimalPercentage=");
        sbM32001t.append(f15);
        sbM32001t.append(", higherOptimalPercentage=");
        sbM32001t.append(f16);
        sbM32001t.append(", progressFillColor=");
        sbM32001t.append(abstractC18247a);
        sbM32001t.append(", barStyles=");
        AbstractC17176i.m48511m(", diameter=", strM124783c, ", strokeWidth=", sbM32001t, list);
        sbM32001t.append(strM124783c2);
        sbM32001t.append(", capCornerRadiusFraction=");
        sbM32001t.append(f17);
        sbM32001t.append(", shouldHideOptimalRange=");
        sbM32001t.append(z4);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", scoreDisplayColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", scoreDisplayTitleColor=");
        sbM32001t.append(enumC39333f2);
        sbM32001t.append(", scoreDisplayTitleIcon=");
        return AbstractC11478a.m30859k(sbM32001t, num, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C21425i(String str, String str2, TextResource scoreDisplay, TextResource scoreDisplaySuffix, TextResource scoreDisplayTitle, Float f13, float f14, Float f15, Float f16, AbstractC18247a progressFillColor, List<? extends EnumC39333f> list, float f17, float f18, float f19, boolean z4, C9598e c9598e, EnumC39333f scoreDisplayColor, EnumC39333f enumC39333f, Integer num) {
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(scoreDisplaySuffix, "scoreDisplaySuffix");
        AbstractC22676k.m65750j(scoreDisplayTitle, "scoreDisplayTitle");
        AbstractC22676k.m65750j(progressFillColor, "progressFillColor");
        AbstractC22676k.m65750j(scoreDisplayColor, "scoreDisplayColor");
        this.id = str;
        this.testTag = str2;
        this.scoreDisplay = scoreDisplay;
        this.scoreDisplaySuffix = scoreDisplaySuffix;
        this.scoreDisplayTitle = scoreDisplayTitle;
        this.scoreTarget = f13;
        this.gaugeFillPercentage = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.progressFillColor = progressFillColor;
        this.barStyles = list;
        this.diameter = f17;
        this.strokeWidth = f18;
        this.capCornerRadiusFraction = f19;
        this.shouldHideOptimalRange = z4;
        this.destination = c9598e;
        this.scoreDisplayColor = scoreDisplayColor;
        this.scoreDisplayTitleColor = enumC39333f;
        this.scoreDisplayTitleIcon = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21425i(String str, String str2, TextResource textResource, TextResource textResource2, TextResource textResource3, Float f13, float f14, Float f15, Float f16, AbstractC18247a abstractC18247a, List list, float f17, float f18, float f19, boolean z4, C9598e c9598e, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f24;
        String str3 = (i13 & 2) != 0 ? null : str2;
        float f25 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 65 * 4 : f17;
        if ((i13 & 4096) != 0) {
            float f26 = 4;
            f24 = f26 * f26;
        } else {
            f24 = f18;
        }
        this(str, str3, textResource, textResource2, textResource3, f13, f14, f15, f16, abstractC18247a, list, f25, f24, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0.7f : f19, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z4, c9598e, enumC39333f, (131072 & i13) != 0 ? null : enumC39333f2, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : num, null);
    }
}
