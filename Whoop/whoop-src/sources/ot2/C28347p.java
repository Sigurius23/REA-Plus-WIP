package ot2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import jt2.C21939a;
import jt2.C21940b;
import jt2.C21956r;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import ys2.C39756c;

/* JADX INFO: renamed from: ot2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b4\u0010DR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010DR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\bG\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b9\u0010H\u001a\u0004\b;\u0010IR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b=\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bA\u0010IR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b5\u0010H\u001a\u0004\bJ\u0010IR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010>\u001a\u0004\bK\u0010@R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\b-\u0010@R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\b0\u0010@R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010.\u001a\u0004\bM\u0010&R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\bL\u0010&R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bE\u00103R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bB\u00103R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bN\u0010&¨\u0006O"}, m65681d2 = {"Lot2/p;", "", "", "planId", "Lcom/whoop/design/util/TextResource;", "currentPlanTitle", "navTitle", "headerDisplay", "Lkd1/o;", "headerImage", "subTitle", "", "Lm91/u;", "metricTiles", "buttonTitle", "", "buttonEnabled", "isCustomized", "migrateSmartAlarm", "Lys2/c;", "customizePlanDialogViewState", "endPlanButtonText", "endPlanDialogViewState", "unsavedChangesDialogViewState", "Ljt2/r;", "sliderValues", "Ljt2/a;", "activityItems", "Ljt2/b;", "behaviorItems", "source", "presetPlanCategory", "explanationTitle", "explanation", "templateId", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZZLys2/c;Lcom/whoop/design/util/TextResource;Lys2/c;Lys2/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "p", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "o", "d", "k", "Lkd1/o;", "l", "()Lkd1/o;", "f", "t", "g", "Ljava/util/List;", "m", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Z", "()Z", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "n", "Lys2/c;", "()Lys2/c;", "v", "r", "q", "s", "u", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28347p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String planId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource currentPlanTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource navTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource headerDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o headerImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> metricTiles;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean buttonEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isCustomized;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean migrateSmartAlarm;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C39756c customizePlanDialogViewState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource endPlanButtonText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C39756c endPlanDialogViewState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C39756c unsavedChangesDialogViewState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<C21956r> sliderValues;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final List<C21939a> activityItems;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<C21940b> behaviorItems;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String presetPlanCategory;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final TextResource explanationTitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final TextResource explanation;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String templateId;

    /* JADX WARN: Multi-variable type inference failed */
    public C28347p(String planId, TextResource textResource, TextResource navTitle, TextResource headerDisplay, AbstractC22403o abstractC22403o, TextResource subTitle, List<? extends InterfaceC25312u> metricTiles, TextResource buttonTitle, boolean z4, boolean z13, boolean z14, C39756c c39756c, TextResource textResource2, C39756c c39756c2, C39756c c39756c3, List<C21956r> sliderValues, List<C21939a> activityItems, List<C21940b> behaviorItems, String str, String str2, TextResource explanationTitle, TextResource explanation, String str3) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(navTitle, "navTitle");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(metricTiles, "metricTiles");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(sliderValues, "sliderValues");
        AbstractC22676k.m65750j(activityItems, "activityItems");
        AbstractC22676k.m65750j(behaviorItems, "behaviorItems");
        AbstractC22676k.m65750j(explanationTitle, "explanationTitle");
        AbstractC22676k.m65750j(explanation, "explanation");
        this.planId = planId;
        this.currentPlanTitle = textResource;
        this.navTitle = navTitle;
        this.headerDisplay = headerDisplay;
        this.headerImage = abstractC22403o;
        this.subTitle = subTitle;
        this.metricTiles = metricTiles;
        this.buttonTitle = buttonTitle;
        this.buttonEnabled = z4;
        this.isCustomized = z13;
        this.migrateSmartAlarm = z14;
        this.customizePlanDialogViewState = c39756c;
        this.endPlanButtonText = textResource2;
        this.endPlanDialogViewState = c39756c2;
        this.unsavedChangesDialogViewState = c39756c3;
        this.sliderValues = sliderValues;
        this.activityItems = activityItems;
        this.behaviorItems = behaviorItems;
        this.source = str;
        this.presetPlanCategory = str2;
        this.explanationTitle = explanationTitle;
        this.explanation = explanation;
        this.templateId = str3;
    }

    /* JADX INFO: renamed from: a */
    public final List<C21939a> m85983a() {
        return this.activityItems;
    }

    /* JADX INFO: renamed from: b */
    public final List<C21940b> m85984b() {
        return this.behaviorItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getButtonEnabled() {
        return this.buttonEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getCurrentPlanTitle() {
        return this.currentPlanTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28347p)) {
            return false;
        }
        C28347p c28347p = (C28347p) other;
        return AbstractC22676k.m65745e(this.planId, c28347p.planId) && AbstractC22676k.m65745e(this.currentPlanTitle, c28347p.currentPlanTitle) && AbstractC22676k.m65745e(this.navTitle, c28347p.navTitle) && AbstractC22676k.m65745e(this.headerDisplay, c28347p.headerDisplay) && AbstractC22676k.m65745e(this.headerImage, c28347p.headerImage) && AbstractC22676k.m65745e(this.subTitle, c28347p.subTitle) && AbstractC22676k.m65745e(this.metricTiles, c28347p.metricTiles) && AbstractC22676k.m65745e(this.buttonTitle, c28347p.buttonTitle) && this.buttonEnabled == c28347p.buttonEnabled && this.isCustomized == c28347p.isCustomized && this.migrateSmartAlarm == c28347p.migrateSmartAlarm && AbstractC22676k.m65745e(this.customizePlanDialogViewState, c28347p.customizePlanDialogViewState) && AbstractC22676k.m65745e(this.endPlanButtonText, c28347p.endPlanButtonText) && AbstractC22676k.m65745e(this.endPlanDialogViewState, c28347p.endPlanDialogViewState) && AbstractC22676k.m65745e(this.unsavedChangesDialogViewState, c28347p.unsavedChangesDialogViewState) && AbstractC22676k.m65745e(this.sliderValues, c28347p.sliderValues) && AbstractC22676k.m65745e(this.activityItems, c28347p.activityItems) && AbstractC22676k.m65745e(this.behaviorItems, c28347p.behaviorItems) && AbstractC22676k.m65745e(this.source, c28347p.source) && AbstractC22676k.m65745e(this.presetPlanCategory, c28347p.presetPlanCategory) && AbstractC22676k.m65745e(this.explanationTitle, c28347p.explanationTitle) && AbstractC22676k.m65745e(this.explanation, c28347p.explanation) && AbstractC22676k.m65745e(this.templateId, c28347p.templateId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C39756c getCustomizePlanDialogViewState() {
        return this.customizePlanDialogViewState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getEndPlanButtonText() {
        return this.endPlanButtonText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C39756c getEndPlanDialogViewState() {
        return this.endPlanDialogViewState;
    }

    public int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        TextResource textResource = this.currentPlanTitle;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.navTitle, 31), this.headerDisplay, 31);
        AbstractC22403o abstractC22403o = this.headerImage;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.subTitle, 31), 31, this.metricTiles), this.buttonTitle, 31), 31, this.buttonEnabled), 31, this.isCustomized), 31, this.migrateSmartAlarm);
        C39756c c39756c = this.customizePlanDialogViewState;
        int iHashCode2 = (iM8289b + (c39756c == null ? 0 : c39756c.hashCode())) * 31;
        TextResource textResource2 = this.endPlanButtonText;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C39756c c39756c2 = this.endPlanDialogViewState;
        int iHashCode4 = (iHashCode3 + (c39756c2 == null ? 0 : c39756c2.hashCode())) * 31;
        C39756c c39756c3 = this.unsavedChangesDialogViewState;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode4 + (c39756c3 == null ? 0 : c39756c3.hashCode())) * 31, 31, this.sliderValues), 31, this.activityItems), 31, this.behaviorItems);
        String str = this.source;
        int iHashCode5 = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presetPlanCategory;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, this.explanationTitle, 31), this.explanation, 31);
        String str3 = this.templateId;
        return iM95625a2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getExplanation() {
        return this.explanation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getHeaderDisplay() {
        return this.headerDisplay;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC22403o getHeaderImage() {
        return this.headerImage;
    }

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC25312u> m85995m() {
        return this.metricTiles;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getMigrateSmartAlarm() {
        return this.migrateSmartAlarm;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getNavTitle() {
        return this.navTitle;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    /* JADX INFO: renamed from: r */
    public final List<C21956r> m86000r() {
        return this.sliderValues;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    public String toString() {
        String str = this.planId;
        TextResource textResource = this.currentPlanTitle;
        TextResource textResource2 = this.navTitle;
        TextResource textResource3 = this.headerDisplay;
        AbstractC22403o abstractC22403o = this.headerImage;
        TextResource textResource4 = this.subTitle;
        List<InterfaceC25312u> list = this.metricTiles;
        TextResource textResource5 = this.buttonTitle;
        boolean z4 = this.buttonEnabled;
        boolean z13 = this.isCustomized;
        boolean z14 = this.migrateSmartAlarm;
        C39756c c39756c = this.customizePlanDialogViewState;
        TextResource textResource6 = this.endPlanButtonText;
        C39756c c39756c2 = this.endPlanDialogViewState;
        C39756c c39756c3 = this.unsavedChangesDialogViewState;
        List<C21956r> list2 = this.sliderValues;
        List<C21939a> list3 = this.activityItems;
        List<C21940b> list4 = this.behaviorItems;
        String str2 = this.source;
        String str3 = this.presetPlanCategory;
        TextResource textResource7 = this.explanationTitle;
        TextResource textResource8 = this.explanation;
        String str4 = this.templateId;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("InitialScreenState(planId=", str, ", currentPlanTitle=", textResource, ", navTitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", headerDisplay=", textResource3, ", headerImage=");
        AbstractC13673n.m38549A(sbM91847q, abstractC22403o, ", subTitle=", textResource4, ", metricTiles=");
        AbstractC30007c.m91852v(textResource5, ", buttonTitle=", ", buttonEnabled=", sbM91847q, list);
        AbstractC38963t7.m124392v(sbM91847q, z4, ", isCustomized=", z13, ", migrateSmartAlarm=");
        sbM91847q.append(z14);
        sbM91847q.append(", customizePlanDialogViewState=");
        sbM91847q.append(c39756c);
        sbM91847q.append(", endPlanButtonText=");
        sbM91847q.append(textResource6);
        sbM91847q.append(", endPlanDialogViewState=");
        sbM91847q.append(c39756c2);
        sbM91847q.append(", unsavedChangesDialogViewState=");
        sbM91847q.append(c39756c3);
        sbM91847q.append(", sliderValues=");
        sbM91847q.append(list2);
        sbM91847q.append(", activityItems=");
        AbstractC21702c.m61148s(sbM91847q, list3, ", behaviorItems=", list4, ", source=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", presetPlanCategory=", str3, ", explanationTitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource7, ", explanation=", textResource8, ", templateId=");
        return AbstractC25012a.m73376i(str4, ")", sbM91847q);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C39756c getUnsavedChangesDialogViewState() {
        return this.unsavedChangesDialogViewState;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsCustomized() {
        return this.isCustomized;
    }
}
