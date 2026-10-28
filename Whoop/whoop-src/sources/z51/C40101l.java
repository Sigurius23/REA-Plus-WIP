package z51;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: z51.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b?\u00108R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b'\u00108R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b@\u00101R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\bA\u00108R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\bB\u0010*R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bF\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b+\u0010IR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\b=\u0010I¨\u0006K"}, m65681d2 = {"Lz51/l;", "Lm91/u;", "", "showOptimalStrain", "showStrainWeeklyPlanGoal", "hasSleepPerformance", "", "optimalStrainPercent", "Ll83/k;", "optimalStrainRange", "recoveryPercent", "Lcom/whoop/design/util/TextResource;", "recoveryPercentText", "Lz51/k;", "recoveryType", "sleepPercentText", "strainScorePercent", "strainScoreText", "bonusTrendText", "strainWeeklyPlanGoalPercent", "strainWeeklyPlanGoalText", "displayGaugeOnly", "", "sharedIconClickedEvent", "gaugeClickedEvent", "Lz51/a;", "firstCustomGaugeEntryViewState", "secondCustomGaugeEntryViewState", "<init>", "(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/Object;Lz51/a;Lz51/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "l", "c", "d", "F", "e", "()F", "Ll83/k;", "f", "()Ll83/k;", "g", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "Lz51/k;", "i", "()Lz51/k;", "m", "j", "n", "o", "p", "q", "getDisplayGaugeOnly", "Ljava/lang/Object;", "getSharedIconClickedEvent", "()Ljava/lang/Object;", "getGaugeClickedEvent", "r", "Lz51/a;", "()Lz51/a;", "s", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40101l implements InterfaceC25312u {

    /* JADX INFO: renamed from: t */
    public static final int f173095t = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showOptimalStrain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showStrainWeeklyPlanGoal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasSleepPerformance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float optimalStrainPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C23465k optimalStrainRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float recoveryPercent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource recoveryPercentText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC40100k recoveryType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource sleepPercentText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float strainScorePercent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource strainScoreText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource bonusTrendText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float strainWeeklyPlanGoalPercent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final TextResource strainWeeklyPlanGoalText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean displayGaugeOnly;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Object sharedIconClickedEvent;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Object gaugeClickedEvent;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C40090a firstCustomGaugeEntryViewState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C40090a secondCustomGaugeEntryViewState;

    public C40101l(boolean z4, boolean z13, boolean z14, float f13, C23465k optimalStrainRange, float f14, TextResource recoveryPercentText, EnumC40100k recoveryType, TextResource sleepPercentText, float f15, TextResource strainScoreText, TextResource bonusTrendText, float f16, TextResource strainWeeklyPlanGoalText, boolean z15, Object sharedIconClickedEvent, Object gaugeClickedEvent, C40090a c40090a, C40090a c40090a2) {
        AbstractC22676k.m65750j(optimalStrainRange, "optimalStrainRange");
        AbstractC22676k.m65750j(recoveryPercentText, "recoveryPercentText");
        AbstractC22676k.m65750j(recoveryType, "recoveryType");
        AbstractC22676k.m65750j(sleepPercentText, "sleepPercentText");
        AbstractC22676k.m65750j(strainScoreText, "strainScoreText");
        AbstractC22676k.m65750j(bonusTrendText, "bonusTrendText");
        AbstractC22676k.m65750j(strainWeeklyPlanGoalText, "strainWeeklyPlanGoalText");
        AbstractC22676k.m65750j(sharedIconClickedEvent, "sharedIconClickedEvent");
        AbstractC22676k.m65750j(gaugeClickedEvent, "gaugeClickedEvent");
        this.showOptimalStrain = z4;
        this.showStrainWeeklyPlanGoal = z13;
        this.hasSleepPerformance = z14;
        this.optimalStrainPercent = f13;
        this.optimalStrainRange = optimalStrainRange;
        this.recoveryPercent = f14;
        this.recoveryPercentText = recoveryPercentText;
        this.recoveryType = recoveryType;
        this.sleepPercentText = sleepPercentText;
        this.strainScorePercent = f15;
        this.strainScoreText = strainScoreText;
        this.bonusTrendText = bonusTrendText;
        this.strainWeeklyPlanGoalPercent = f16;
        this.strainWeeklyPlanGoalText = strainWeeklyPlanGoalText;
        this.displayGaugeOnly = z15;
        this.sharedIconClickedEvent = sharedIconClickedEvent;
        this.gaugeClickedEvent = gaugeClickedEvent;
        this.firstCustomGaugeEntryViewState = c40090a;
        this.secondCustomGaugeEntryViewState = c40090a2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBonusTrendText() {
        return this.bonusTrendText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C40090a getFirstCustomGaugeEntryViewState() {
        return this.firstCustomGaugeEntryViewState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasSleepPerformance() {
        return this.hasSleepPerformance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getOptimalStrainPercent() {
        return this.optimalStrainPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40101l)) {
            return false;
        }
        C40101l c40101l = (C40101l) other;
        return this.showOptimalStrain == c40101l.showOptimalStrain && this.showStrainWeeklyPlanGoal == c40101l.showStrainWeeklyPlanGoal && this.hasSleepPerformance == c40101l.hasSleepPerformance && Float.compare(this.optimalStrainPercent, c40101l.optimalStrainPercent) == 0 && AbstractC22676k.m65745e(this.optimalStrainRange, c40101l.optimalStrainRange) && Float.compare(this.recoveryPercent, c40101l.recoveryPercent) == 0 && AbstractC22676k.m65745e(this.recoveryPercentText, c40101l.recoveryPercentText) && this.recoveryType == c40101l.recoveryType && AbstractC22676k.m65745e(this.sleepPercentText, c40101l.sleepPercentText) && Float.compare(this.strainScorePercent, c40101l.strainScorePercent) == 0 && AbstractC22676k.m65745e(this.strainScoreText, c40101l.strainScoreText) && AbstractC22676k.m65745e(this.bonusTrendText, c40101l.bonusTrendText) && Float.compare(this.strainWeeklyPlanGoalPercent, c40101l.strainWeeklyPlanGoalPercent) == 0 && AbstractC22676k.m65745e(this.strainWeeklyPlanGoalText, c40101l.strainWeeklyPlanGoalText) && this.displayGaugeOnly == c40101l.displayGaugeOnly && AbstractC22676k.m65745e(this.sharedIconClickedEvent, c40101l.sharedIconClickedEvent) && AbstractC22676k.m65745e(this.gaugeClickedEvent, c40101l.gaugeClickedEvent) && AbstractC22676k.m65745e(this.firstCustomGaugeEntryViewState, c40101l.firstCustomGaugeEntryViewState) && AbstractC22676k.m65745e(this.secondCustomGaugeEntryViewState, c40101l.secondCustomGaugeEntryViewState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C23465k getOptimalStrainRange() {
        return this.optimalStrainRange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getRecoveryPercent() {
        return this.recoveryPercent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getRecoveryPercentText() {
        return this.recoveryPercentText;
    }

    public int hashCode() {
        int iM106644c = AbstractC33745d.m106644c(AbstractC33745d.m106644c(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.strainWeeklyPlanGoalPercent, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.strainScorePercent, AbstractC31061c.m95625a((this.recoveryType.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.recoveryPercent, (this.optimalStrainRange.hashCode() + AbstractC11266d.m30447a(this.optimalStrainPercent, AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.showOptimalStrain) * 31, 31, this.showStrainWeeklyPlanGoal), 31, this.hasSleepPerformance), 31)) * 31, 31), this.recoveryPercentText, 31)) * 31, this.sleepPercentText, 31), 31), this.strainScoreText, 31), this.bonusTrendText, 31), 31), this.strainWeeklyPlanGoalText, 31), 31, this.displayGaugeOnly), 31, this.sharedIconClickedEvent), 31, this.gaugeClickedEvent);
        C40090a c40090a = this.firstCustomGaugeEntryViewState;
        int iHashCode = (iM106644c + (c40090a == null ? 0 : c40090a.hashCode())) * 31;
        C40090a c40090a2 = this.secondCustomGaugeEntryViewState;
        return iHashCode + (c40090a2 != null ? c40090a2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC40100k getRecoveryType() {
        return this.recoveryType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C40090a getSecondCustomGaugeEntryViewState() {
        return this.secondCustomGaugeEntryViewState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowOptimalStrain() {
        return this.showOptimalStrain;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowStrainWeeklyPlanGoal() {
        return this.showStrainWeeklyPlanGoal;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getSleepPercentText() {
        return this.sleepPercentText;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getStrainScorePercent() {
        return this.strainScorePercent;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getStrainScoreText() {
        return this.strainScoreText;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getStrainWeeklyPlanGoalPercent() {
        return this.strainWeeklyPlanGoalPercent;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextResource getStrainWeeklyPlanGoalText() {
        return this.strainWeeklyPlanGoalText;
    }

    public String toString() {
        boolean z4 = this.showOptimalStrain;
        boolean z13 = this.showStrainWeeklyPlanGoal;
        boolean z14 = this.hasSleepPerformance;
        float f13 = this.optimalStrainPercent;
        C23465k c23465k = this.optimalStrainRange;
        float f14 = this.recoveryPercent;
        TextResource textResource = this.recoveryPercentText;
        EnumC40100k enumC40100k = this.recoveryType;
        TextResource textResource2 = this.sleepPercentText;
        float f15 = this.strainScorePercent;
        TextResource textResource3 = this.strainScoreText;
        TextResource textResource4 = this.bonusTrendText;
        float f16 = this.strainWeeklyPlanGoalPercent;
        TextResource textResource5 = this.strainWeeklyPlanGoalText;
        boolean z15 = this.displayGaugeOnly;
        Object obj = this.sharedIconClickedEvent;
        Object obj2 = this.gaugeClickedEvent;
        C40090a c40090a = this.firstCustomGaugeEntryViewState;
        C40090a c40090a2 = this.secondCustomGaugeEntryViewState;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("OverviewGaugeState(showOptimalStrain=", ", showStrainWeeklyPlanGoal=", ", hasSleepPerformance=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", optimalStrainPercent=");
        sbM32002u.append(f13);
        sbM32002u.append(", optimalStrainRange=");
        sbM32002u.append(c23465k);
        sbM32002u.append(", recoveryPercent=");
        sbM32002u.append(f14);
        sbM32002u.append(", recoveryPercentText=");
        sbM32002u.append(textResource);
        sbM32002u.append(", recoveryType=");
        sbM32002u.append(enumC40100k);
        sbM32002u.append(", sleepPercentText=");
        sbM32002u.append(textResource2);
        sbM32002u.append(", strainScorePercent=");
        sbM32002u.append(f15);
        sbM32002u.append(", strainScoreText=");
        AbstractC30007c.m91855y(sbM32002u, textResource3, ", bonusTrendText=", textResource4, ", strainWeeklyPlanGoalPercent=");
        sbM32002u.append(f16);
        sbM32002u.append(", strainWeeklyPlanGoalText=");
        sbM32002u.append(textResource5);
        sbM32002u.append(", displayGaugeOnly=");
        sbM32002u.append(z15);
        sbM32002u.append(", sharedIconClickedEvent=");
        sbM32002u.append(obj);
        sbM32002u.append(", gaugeClickedEvent=");
        sbM32002u.append(obj2);
        sbM32002u.append(", firstCustomGaugeEntryViewState=");
        sbM32002u.append(c40090a);
        sbM32002u.append(", secondCustomGaugeEntryViewState=");
        sbM32002u.append(c40090a2);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C40101l(boolean z4, boolean z13, boolean z14, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, TextResource textResource2, float f15, TextResource textResource3, TextResource textResource4, float f16, TextResource textResource5, boolean z15, Object obj, Object obj2, C40090a c40090a, C40090a c40090a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Float fValueOf = Float.valueOf(0.0f);
        boolean z16 = (i13 & 1) != 0 ? false : z4;
        boolean z17 = (i13 & 2) != 0 ? false : z13;
        boolean z18 = (i13 & 4) != 0 ? true : z14;
        float f17 = (i13 & 8) != 0 ? 0.0f : f13;
        C23465k c23465k2 = (i13 & 16) != 0 ? new C23465k(fValueOf, fValueOf) : c23465k;
        TextResource textResourceM21267a = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC8693b.m21267a() : textResource4;
        float f18 = (i13 & 4096) != 0 ? 0.0f : f16;
        TextResource textResourceM21267a2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? AbstractC8693b.m21267a() : textResource5;
        boolean z19 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z15;
        int i14 = 32768 & i13;
        C23454a0 c23454a0 = C23454a0.f92919a;
        this(z16, z17, z18, f17, c23465k2, f14, textResource, enumC40100k, textResource2, f15, textResource3, textResourceM21267a, f18, textResourceM21267a2, z19, i14 != 0 ? c23454a0 : obj, (65536 & i13) != 0 ? c23454a0 : obj2, (131072 & i13) != 0 ? null : c40090a, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : c40090a2);
    }
}
