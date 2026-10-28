package bu2;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bu2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJÆ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b<\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b/\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b:\u0010BR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b=\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b<\u0010I\u001a\u0004\bC\u0010JR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\b5\u0010J¨\u0006N"}, m65681d2 = {"Lbu2/d;", "Lm91/u;", "", "fillPercentage", "minFillPercentage", "maxFillPercentage", "", "weeklyTargetDouble", "Lcom/whoop/design/util/TextResource;", "weeklyTargetValue", "weeklyTargetValueSuffix", "weeklyTargetLabel", "topText", "bottomText", "Lbu2/k;", "recommendedRange", "Lbu2/h;", "levelItemState", "", "Lbu2/p;", "rangeContent", "Lbu2/c0;", "toolTipType", "Ly81/e;", "toolTipTitleColor", "increment", "color", "<init>", "(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;)V", "a", "(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;)Lbu2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "()F", "b", "i", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "D", "o", "()D", "e", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "g", "p", "n", "j", "Lbu2/k;", "k", "()Lbu2/k;", "Lbu2/h;", "()Lbu2/h;", "l", "Ljava/util/List;", "()Ljava/util/List;", "m", "Lbu2/c0;", "()Lbu2/c0;", "Ly81/e;", "()Ly81/e;", "Ljava/lang/Double;", "getIncrement", "()Ljava/lang/Double;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3643d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float minFillPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float maxFillPercentage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double weeklyTargetDouble;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource weeklyTargetValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource weeklyTargetValueSuffix;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource weeklyTargetLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource topText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource bottomText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C3650k recommendedRange;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C3647h levelItemState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C3655p> rangeContent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC3642c0 toolTipType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC39332e toolTipTitleColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Double increment;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    public C3643d(float f13, float f14, float f15, double d3, TextResource weeklyTargetValue, TextResource textResource, TextResource weeklyTargetLabel, TextResource textResource2, TextResource textResource3, C3650k c3650k, C3647h c3647h, List<C3655p> rangeContent, EnumC3642c0 enumC3642c0, InterfaceC39332e interfaceC39332e, Double d14, InterfaceC39332e color) {
        AbstractC22676k.m65750j(weeklyTargetValue, "weeklyTargetValue");
        AbstractC22676k.m65750j(weeklyTargetLabel, "weeklyTargetLabel");
        AbstractC22676k.m65750j(rangeContent, "rangeContent");
        AbstractC22676k.m65750j(color, "color");
        this.fillPercentage = f13;
        this.minFillPercentage = f14;
        this.maxFillPercentage = f15;
        this.weeklyTargetDouble = d3;
        this.weeklyTargetValue = weeklyTargetValue;
        this.weeklyTargetValueSuffix = textResource;
        this.weeklyTargetLabel = weeklyTargetLabel;
        this.topText = textResource2;
        this.bottomText = textResource3;
        this.recommendedRange = c3650k;
        this.levelItemState = c3647h;
        this.rangeContent = rangeContent;
        this.toolTipType = enumC3642c0;
        this.toolTipTitleColor = interfaceC39332e;
        this.increment = d14;
        this.color = color;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3643d m11220b(C3643d c3643d, float f13, float f14, float f15, double d3, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, C3650k c3650k, C3647h c3647h, List list, EnumC3642c0 enumC3642c0, InterfaceC39332e interfaceC39332e, Double d14, InterfaceC39332e interfaceC39332e2, int i13, Object obj) {
        return c3643d.m11221a((61423 & 1) != 0 ? c3643d.fillPercentage : f13, (61423 & 2) != 0 ? c3643d.minFillPercentage : f14, (61423 & 4) != 0 ? c3643d.maxFillPercentage : f15, (61423 & 8) != 0 ? c3643d.weeklyTargetDouble : d3, (61423 & 16) != 0 ? c3643d.weeklyTargetValue : textResource, (61423 & 32) != 0 ? c3643d.weeklyTargetValueSuffix : textResource2, (61423 & 64) != 0 ? c3643d.weeklyTargetLabel : textResource3, (61423 & 128) != 0 ? c3643d.topText : textResource4, (61423 & 256) != 0 ? c3643d.bottomText : textResource5, (61423 & 512) != 0 ? c3643d.recommendedRange : c3650k, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c3643d.levelItemState : c3647h, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c3643d.rangeContent : list, (61423 & 4096) != 0 ? c3643d.toolTipType : enumC3642c0, (61423 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c3643d.toolTipTitleColor : interfaceC39332e, (61423 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c3643d.increment : d14, (61423 & 32768) != 0 ? c3643d.color : interfaceC39332e2);
    }

    /* JADX INFO: renamed from: a */
    public final C3643d m11221a(float fillPercentage, float minFillPercentage, float maxFillPercentage, double weeklyTargetDouble, TextResource weeklyTargetValue, TextResource weeklyTargetValueSuffix, TextResource weeklyTargetLabel, TextResource topText, TextResource bottomText, C3650k recommendedRange, C3647h levelItemState, List<C3655p> rangeContent, EnumC3642c0 toolTipType, InterfaceC39332e toolTipTitleColor, Double increment, InterfaceC39332e color) {
        AbstractC22676k.m65750j(weeklyTargetValue, "weeklyTargetValue");
        AbstractC22676k.m65750j(weeklyTargetLabel, "weeklyTargetLabel");
        AbstractC22676k.m65750j(rangeContent, "rangeContent");
        AbstractC22676k.m65750j(color, "color");
        return new C3643d(fillPercentage, minFillPercentage, maxFillPercentage, weeklyTargetDouble, weeklyTargetValue, weeklyTargetValueSuffix, weeklyTargetLabel, topText, bottomText, recommendedRange, levelItemState, rangeContent, toolTipType, toolTipTitleColor, increment, color);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3643d)) {
            return false;
        }
        C3643d c3643d = (C3643d) other;
        return Float.compare(this.fillPercentage, c3643d.fillPercentage) == 0 && Float.compare(this.minFillPercentage, c3643d.minFillPercentage) == 0 && Float.compare(this.maxFillPercentage, c3643d.maxFillPercentage) == 0 && Double.compare(this.weeklyTargetDouble, c3643d.weeklyTargetDouble) == 0 && AbstractC22676k.m65745e(this.weeklyTargetValue, c3643d.weeklyTargetValue) && AbstractC22676k.m65745e(this.weeklyTargetValueSuffix, c3643d.weeklyTargetValueSuffix) && AbstractC22676k.m65745e(this.weeklyTargetLabel, c3643d.weeklyTargetLabel) && AbstractC22676k.m65745e(this.topText, c3643d.topText) && AbstractC22676k.m65745e(this.bottomText, c3643d.bottomText) && AbstractC22676k.m65745e(this.recommendedRange, c3643d.recommendedRange) && AbstractC22676k.m65745e(this.levelItemState, c3643d.levelItemState) && AbstractC22676k.m65745e(this.rangeContent, c3643d.rangeContent) && this.toolTipType == c3643d.toolTipType && AbstractC22676k.m65745e(this.toolTipTitleColor, c3643d.toolTipTitleColor) && AbstractC22676k.m65745e(this.increment, c3643d.increment) && AbstractC22676k.m65745e(this.color, c3643d.color);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C3647h getLevelItemState() {
        return this.levelItemState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getMaxFillPercentage() {
        return this.maxFillPercentage;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC17176i.m48499a(AbstractC11266d.m30447a(this.maxFillPercentage, AbstractC11266d.m30447a(this.minFillPercentage, Float.hashCode(this.fillPercentage) * 31, 31), 31), 31, this.weeklyTargetDouble), this.weeklyTargetValue, 31);
        TextResource textResource = this.weeklyTargetValueSuffix;
        int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.weeklyTargetLabel, 31);
        TextResource textResource2 = this.topText;
        int iHashCode = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.bottomText;
        int iHashCode2 = (iHashCode + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        C3650k c3650k = this.recommendedRange;
        int iHashCode3 = (iHashCode2 + (c3650k == null ? 0 : c3650k.hashCode())) * 31;
        C3647h c3647h = this.levelItemState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (c3647h == null ? 0 : c3647h.hashCode())) * 31, 31, this.rangeContent);
        EnumC3642c0 enumC3642c0 = this.toolTipType;
        int iHashCode4 = (iM31983b + (enumC3642c0 == null ? 0 : enumC3642c0.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.toolTipTitleColor;
        int iHashCode5 = (iHashCode4 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        Double d3 = this.increment;
        return this.color.hashCode() + ((iHashCode5 + (d3 != null ? d3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getMinFillPercentage() {
        return this.minFillPercentage;
    }

    /* JADX INFO: renamed from: j */
    public final List<C3655p> m11228j() {
        return this.rangeContent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C3650k getRecommendedRange() {
        return this.recommendedRange;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC39332e getToolTipTitleColor() {
        return this.toolTipTitleColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC3642c0 getToolTipType() {
        return this.toolTipType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTopText() {
        return this.topText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final double getWeeklyTargetDouble() {
        return this.weeklyTargetDouble;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextResource getWeeklyTargetLabel() {
        return this.weeklyTargetLabel;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextResource getWeeklyTargetValue() {
        return this.weeklyTargetValue;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getWeeklyTargetValueSuffix() {
        return this.weeklyTargetValueSuffix;
    }

    public String toString() {
        float f13 = this.fillPercentage;
        float f14 = this.minFillPercentage;
        float f15 = this.maxFillPercentage;
        double d3 = this.weeklyTargetDouble;
        TextResource textResource = this.weeklyTargetValue;
        TextResource textResource2 = this.weeklyTargetValueSuffix;
        TextResource textResource3 = this.weeklyTargetLabel;
        TextResource textResource4 = this.topText;
        TextResource textResource5 = this.bottomText;
        C3650k c3650k = this.recommendedRange;
        C3647h c3647h = this.levelItemState;
        List<C3655p> list = this.rangeContent;
        EnumC3642c0 enumC3642c0 = this.toolTipType;
        InterfaceC39332e interfaceC39332e = this.toolTipTitleColor;
        Double d14 = this.increment;
        InterfaceC39332e interfaceC39332e2 = this.color;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("MetricSliderItemState(fillPercentage=", f13, ", minFillPercentage=", f14, ", maxFillPercentage=");
        sbM8307t.append(f15);
        sbM8307t.append(", weeklyTargetDouble=");
        sbM8307t.append(d3);
        sbM8307t.append(", weeklyTargetValue=");
        sbM8307t.append(textResource);
        sbM8307t.append(", weeklyTargetValueSuffix=");
        sbM8307t.append(textResource2);
        sbM8307t.append(", weeklyTargetLabel=");
        sbM8307t.append(textResource3);
        sbM8307t.append(", topText=");
        sbM8307t.append(textResource4);
        sbM8307t.append(", bottomText=");
        sbM8307t.append(textResource5);
        sbM8307t.append(", recommendedRange=");
        sbM8307t.append(c3650k);
        sbM8307t.append(", levelItemState=");
        sbM8307t.append(c3647h);
        sbM8307t.append(", rangeContent=");
        sbM8307t.append(list);
        sbM8307t.append(", toolTipType=");
        sbM8307t.append(enumC3642c0);
        sbM8307t.append(", toolTipTitleColor=");
        sbM8307t.append(interfaceC39332e);
        sbM8307t.append(", increment=");
        sbM8307t.append(d14);
        sbM8307t.append(", color=");
        sbM8307t.append(interfaceC39332e2);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public /* synthetic */ C3643d(float f13, float f14, float f15, double d3, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, C3650k c3650k, C3647h c3647h, List list, EnumC3642c0 enumC3642c0, InterfaceC39332e interfaceC39332e, Double d14, InterfaceC39332e interfaceC39332e2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, d3, textResource, (i13 & 32) != 0 ? null : textResource2, textResource3, (i13 & 128) != 0 ? null : textResource4, (i13 & 256) != 0 ? null : textResource5, (i13 & 512) != 0 ? null : c3650k, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c3647h, list, (i13 & 4096) != 0 ? null : enumC3642c0, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : interfaceC39332e, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : d14, interfaceC39332e2);
    }
}
