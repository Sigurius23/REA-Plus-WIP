package it2;

import com.mapbox.common.HttpHeaders;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelection;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21172v;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: it2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b1\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b2\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b4\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b \u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b)\u00108¨\u00069"}, m65681d2 = {"Lit2/a;", "", "", "planName", "", "locked", "showMetricSelection", "analyticsSource", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "initialSelection", HttpHeaders.DATE, "source", "presetPlanCategory", "planTitle", "description", "explanationTitle", "explanation", "templateId", "category", "carouselPlacement", "Lj02/v;", "dismissalType", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/v;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "c", "l", "d", "getAnalyticsSource", "e", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "g", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "f", "getDate", "m", "k", "j", "n", "o", "p", "Lj02/v;", "()Lj02/v;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20931a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String planName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean locked;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showMetricSelection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String analyticsSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InitialSelection initialSelection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String presetPlanCategory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String planTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String explanationTitle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String explanation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String templateId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String carouselPlacement;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final EnumC21172v dismissalType;

    public C20931a(String planName, boolean z4, boolean z13, String analyticsSource, InitialSelection initialSelection, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EnumC21172v enumC21172v) {
        AbstractC22676k.m65750j(planName, "planName");
        AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
        this.planName = planName;
        this.locked = z4;
        this.showMetricSelection = z13;
        this.analyticsSource = analyticsSource;
        this.initialSelection = initialSelection;
        this.date = str;
        this.source = str2;
        this.presetPlanCategory = str3;
        this.planTitle = str4;
        this.description = str5;
        this.explanationTitle = str6;
        this.explanation = str7;
        this.templateId = str8;
        this.category = str9;
        this.carouselPlacement = str10;
        this.dismissalType = enumC21172v;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCarouselPlacement() {
        return this.carouselPlacement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC21172v getDismissalType() {
        return this.dismissalType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20931a)) {
            return false;
        }
        C20931a c20931a = (C20931a) other;
        return AbstractC22676k.m65745e(this.planName, c20931a.planName) && this.locked == c20931a.locked && this.showMetricSelection == c20931a.showMetricSelection && AbstractC22676k.m65745e(this.analyticsSource, c20931a.analyticsSource) && AbstractC22676k.m65745e(this.initialSelection, c20931a.initialSelection) && AbstractC22676k.m65745e(this.date, c20931a.date) && AbstractC22676k.m65745e(this.source, c20931a.source) && AbstractC22676k.m65745e(this.presetPlanCategory, c20931a.presetPlanCategory) && AbstractC22676k.m65745e(this.planTitle, c20931a.planTitle) && AbstractC22676k.m65745e(this.description, c20931a.description) && AbstractC22676k.m65745e(this.explanationTitle, c20931a.explanationTitle) && AbstractC22676k.m65745e(this.explanation, c20931a.explanation) && AbstractC22676k.m65745e(this.templateId, c20931a.templateId) && AbstractC22676k.m65745e(this.category, c20931a.category) && AbstractC22676k.m65745e(this.carouselPlacement, c20931a.carouselPlacement) && this.dismissalType == c20931a.dismissalType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InitialSelection getInitialSelection() {
        return this.initialSelection;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.planName.hashCode() * 31, 31, this.locked), 31, this.showMetricSelection), 31, this.analyticsSource);
        InitialSelection initialSelection = this.initialSelection;
        int iHashCode = (iM30450d + (initialSelection == null ? 0 : initialSelection.hashCode())) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.presetPlanCategory;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.planTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.explanationTitle;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.explanation;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.templateId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.category;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.carouselPlacement;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        EnumC21172v enumC21172v = this.dismissalType;
        return iHashCode11 + (enumC21172v != null ? enumC21172v.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPlanTitle() {
        return this.planTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowMetricSelection() {
        return this.showMetricSelection;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    public String toString() {
        String str = this.planName;
        boolean z4 = this.locked;
        boolean z13 = this.showMetricSelection;
        String str2 = this.analyticsSource;
        InitialSelection initialSelection = this.initialSelection;
        String str3 = this.date;
        String str4 = this.source;
        String str5 = this.presetPlanCategory;
        String str6 = this.planTitle;
        String str7 = this.description;
        String str8 = this.explanationTitle;
        String str9 = this.explanation;
        String str10 = this.templateId;
        String str11 = this.category;
        String str12 = this.carouselPlacement;
        EnumC21172v enumC21172v = this.dismissalType;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("HubAndSpokeScreenArgs(planName=", str, ", locked=", ", showMetricSelection=", z4);
        AbstractC38963t7.m124391u(sbM73379l, z13, ", analyticsSource=", str2, ", initialSelection=");
        sbM73379l.append(initialSelection);
        sbM73379l.append(", date=");
        sbM73379l.append(str3);
        sbM73379l.append(", source=");
        AbstractC11266d.m30444B(sbM73379l, str4, ", presetPlanCategory=", str5, ", planTitle=");
        AbstractC11266d.m30444B(sbM73379l, str6, ", description=", str7, ", explanationTitle=");
        AbstractC11266d.m30444B(sbM73379l, str8, ", explanation=", str9, ", templateId=");
        AbstractC11266d.m30444B(sbM73379l, str10, ", category=", str11, ", carouselPlacement=");
        sbM73379l.append(str12);
        sbM73379l.append(", dismissalType=");
        sbM73379l.append(enumC21172v);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
