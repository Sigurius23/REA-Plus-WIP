package i01;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hy0.C17730c1;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p490t0.AbstractC33253j;
import p712j91.Function1;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0005\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u0017\u0010+\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012R\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010\u0012R\u0017\u00100\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b\f\u0010\u0012R\u0017\u00102\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u00063"}, m65681d2 = {"Li01/g;", "", "<init>", "()V", "Lhy0/h1;", "b", "Lhy0/h1;", "getTag", "()Lhy0/h1;", "tag", "c", "currentTag", "d", "badge", "Li01/h;", "e", "Li01/h;", "a", "()Li01/h;", "pricingSelectionCard1PerYearSample", "f", "pricingSelectionCard2PerYearSample", "g", "getPricingSelectionCard4PerYearSample", "pricingSelectionCard4PerYearSample", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "pricingSelectionCardDefaultSample", "pricingSelectionCardCurrentSample", "j", "pricingSelectionCardCurrentCheckSample", "k", "pricingSelectionCardBlueSample", "l", "pricingSelectionCardChromaticSample", "m", "getPricingSelectionCardLotsOfTextSample", "pricingSelectionCardLotsOfTextSample", "n", "getPricingSelectionCardLotsOfTextWithBadgesSample", "pricingSelectionCardLotsOfTextWithBadgesSample", "o", "getPricingSelectionCardNoPriceSample", "pricingSelectionCardNoPriceSample", "p", "getPricingSelectionCardLongPriceSample", "pricingSelectionCardLongPriceSample", "q", "pricingSelectionCardBlueSimpleSample", "r", "pricingSelectionCardBlueSimpleSelectedSample", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17844g {

    /* JADX INFO: renamed from: a */
    public static final C17844g f69359a = new C17844g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C17750h1 tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C17750h1 currentTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C17750h1 badge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCard1PerYearSample;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCard2PerYearSample;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCard4PerYearSample;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardDefaultSample;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardCurrentSample;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardCurrentCheckSample;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardBlueSample;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardChromaticSample;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardLotsOfTextSample;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardLotsOfTextWithBadgesSample;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardNoPriceSample;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardLongPriceSample;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardBlueSimpleSample;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final C17845h pricingSelectionCardBlueSimpleSelectedSample;

    /* JADX INFO: renamed from: s */
    public static final int f69377s;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("SAVE $0");
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
        C17750h1 c17750h1 = new C17750h1(textResourceM21278l, null, enumC39333f, null, enumC39333f2, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null);
        tag = c17750h1;
        C17750h1 c17750h2 = new C17750h1(AbstractC8693b.m21278l("CURRENT"), null, EnumC39333f.BRAND_WHITE, null, enumC39333f2, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null);
        currentTag = c17750h2;
        float f13 = 8;
        C17750h1 c17750h3 = new C17750h1(AbstractC8693b.m21278l("CURRENT"), null, EnumC39333f.TRANSPARENT, null, EnumC39333f.WHITE_70, null, null, EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL, false, AbstractC33253j.m105489e(2 * 4), ((float) 0.5d) * f13, 1 * f13, 0.0f, null, 0.0f, null, null, null, new C17730c1(EnumC39333f.WHITE_20, 0.0f, 2, null), null, null, null, 3928426, null);
        badge = c17750h3;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("1 Test");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("/ Year");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("$199");
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("$199/test");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data.");
        EnumC17846i enumC17846i = EnumC17846i.SAVINGS;
        pricingSelectionCard1PerYearSample = new C17845h("", textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, null, textResourceM21278l5, null, c17750h1, textResourceM21278l6, enumC17846i, null, null, 3152, null);
        pricingSelectionCard2PerYearSample = new C17845h("", AbstractC8693b.m21278l("2 Tests"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$349"), null, AbstractC8693b.m21278l("$175/test"), null, C17750h1.m50901b(c17750h1, AbstractC8693b.m21278l("SAVE $48"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), AbstractC8693b.m21278l("Recommended for a complete understanding of your health."), enumC17846i, null, null, 3152, null);
        pricingSelectionCard4PerYearSample = new C17845h("", AbstractC8693b.m21278l("4 Tests"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$599"), null, AbstractC8693b.m21278l("$149/test"), null, C17750h1.m50901b(c17750h1, AbstractC8693b.m21278l("SAVE $200"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), AbstractC8693b.m21278l("The most comprehensive testing to support peak performance."), enumC17846i, null, null, 3152, null);
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("1 Test");
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("/ Year");
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("$199");
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("Full Price");
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l("Get Started with this test integegrated with your WHOOP data");
        EnumC17846i enumC17846i2 = EnumC17846i.DEFAULT;
        pricingSelectionCardDefaultSample = new C17845h("", textResourceM21278l7, textResourceM21278l8, textResourceM21278l9, null, textResourceM21278l10, null, null, textResourceM21278l11, enumC17846i2, null, null, 3152, null);
        pricingSelectionCardCurrentSample = new C17845h("", AbstractC8693b.m21278l("1 Test"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$199"), null, AbstractC8693b.m21278l("$199/test"), null, c17750h2, AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data."), EnumC17846i.CURRENT, null, null, 3152, null);
        pricingSelectionCardCurrentCheckSample = new C17845h(null, AbstractC8693b.m21278l("1 Test"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$199"), EnumC17838a.MEDIUM, AbstractC8693b.m21278l(""), "$**199**/test", c17750h2, AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data."), EnumC17846i.CURRENT_WITH_CHECKMARK, null, null, 3072, null);
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l("PEAK");
        TextResource textResourceM21278l13 = AbstractC8693b.m21278l("/ Year");
        TextResource textResourceM21278l14 = AbstractC8693b.m21278l("$239");
        TextResource textResourceM21278l15 = AbstractC8693b.m21278l("$19.99/mo");
        C17750h1 c17750h1M50901b = C17750h1.m50901b(c17750h2, null, null, EnumC39333f.RECOVERY, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194299, null);
        TextResource textResourceM21278l16 = AbstractC8693b.m21278l("Full access to all WHOOP features.");
        EnumC17846i enumC17846i3 = EnumC17846i.BLUE;
        pricingSelectionCardBlueSample = new C17845h("", textResourceM21278l12, textResourceM21278l13, textResourceM21278l14, null, textResourceM21278l15, null, c17750h1M50901b, textResourceM21278l16, enumC17846i3, null, null, 3152, null);
        pricingSelectionCardChromaticSample = new C17845h("", AbstractC8693b.m21278l("LIFE"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$359"), null, AbstractC8693b.m21278l("$29.99/mo"), null, C17750h1.m50901b(c17750h2, null, null, null, new C18250d(Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null), null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194295, null), AbstractC8693b.m21278l("Premium access with advanced health insights."), EnumC17846i.CHROMATIC, null, null, 3152, null);
        pricingSelectionCardLotsOfTextSample = new C17845h("", AbstractC8693b.m21278l("This is a long title"), AbstractC8693b.m21278l("/ this is a long subtitle"), AbstractC8693b.m21278l("$199,999"), null, AbstractC8693b.m21278l("$199,999/test"), null, c17750h2, AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data. This is a lot of text. Long descriptions are fun."), enumC17846i2, null, null, 3152, null);
        pricingSelectionCardLotsOfTextWithBadgesSample = new C17845h("", AbstractC8693b.m21278l("This is a long title"), AbstractC8693b.m21278l("/ this is a long subtitle"), AbstractC8693b.m21278l("$199,999"), null, AbstractC8693b.m21278l("$199,999/test"), null, c17750h2, AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data. This is a lot of text. Long descriptions are fun."), enumC17846i2, null, AbstractC37056f.m118959K(C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("15-min Video Call"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Care Plan"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Available 24/7 this is a super long badge!!!!!!!"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("15-min Video Call"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Care Plan"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Available 24/7"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null)), 1104, null);
        pricingSelectionCardNoPriceSample = new C17845h("", AbstractC8693b.m21278l("Resume Current Plan"), AbstractC8693b.m21278l(""), AbstractC8693b.m21278l(""), null, AbstractC8693b.m21278l(""), null, null, AbstractC8693b.m21278l("Resume your membership for $180 (normally $199) at the end of your current billing period and save 10%."), enumC17846i3, null, AbstractC37056f.m118958J(C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("NOT CHARGED TODAY"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null)), 1104, null);
        pricingSelectionCardLongPriceSample = new C17845h("", AbstractC8693b.m21278l("1 Test"), AbstractC8693b.m21278l("/ Year"), AbstractC8693b.m21278l("$199,999"), null, AbstractC8693b.m21278l("$199,999/test"), null, c17750h2, AbstractC8693b.m21278l("Get started with an annual blood test integrated with your WHOOP data."), enumC17846i2, null, null, 3152, null);
        pricingSelectionCardBlueSimpleSample = new C17845h("", AbstractC8693b.m21278l("Schedule Ahead"), AbstractC8693b.m21278l(""), AbstractC8693b.m21278l("$99"), null, AbstractC8693b.m21278l(""), null, null, AbstractC8693b.m21278l("Choose a time that works for you – ideal for flexible scheduling or ongoing check-ins."), EnumC17846i.BLUE_SIMPLE, null, AbstractC37056f.m118959K(C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("25-min Video Call"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Care Plan"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null)), 1104, null);
        pricingSelectionCardBlueSimpleSelectedSample = new C17845h("", AbstractC8693b.m21278l("Always On Care"), AbstractC8693b.m21278l(""), AbstractC8693b.m21278l("$129"), null, AbstractC8693b.m21278l(""), null, null, AbstractC8693b.m21278l("Speak with a clinician within the hour for answers and next steps. Always available."), EnumC17846i.BLUE_SIMPLE_SELECTED, null, AbstractC37056f.m118959K(C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("15-min Video Call"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Care Plan"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), C17750h1.m50901b(c17750h3, AbstractC8693b.m21278l("Available 24/7"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null)), 1104, null);
        f69377s = 8;
    }

    private C17844g() {
    }

    /* JADX INFO: renamed from: a */
    public final C17845h m51299a() {
        return pricingSelectionCard1PerYearSample;
    }

    /* JADX INFO: renamed from: b */
    public final C17845h m51300b() {
        return pricingSelectionCard2PerYearSample;
    }

    /* JADX INFO: renamed from: c */
    public final C17845h m51301c() {
        return pricingSelectionCardBlueSample;
    }

    /* JADX INFO: renamed from: d */
    public final C17845h m51302d() {
        return pricingSelectionCardBlueSimpleSample;
    }

    /* JADX INFO: renamed from: e */
    public final C17845h m51303e() {
        return pricingSelectionCardBlueSimpleSelectedSample;
    }

    /* JADX INFO: renamed from: f */
    public final C17845h m51304f() {
        return pricingSelectionCardChromaticSample;
    }

    /* JADX INFO: renamed from: g */
    public final C17845h m51305g() {
        return pricingSelectionCardCurrentCheckSample;
    }

    /* JADX INFO: renamed from: h */
    public final C17845h m51306h() {
        return pricingSelectionCardCurrentSample;
    }

    /* JADX INFO: renamed from: i */
    public final C17845h m51307i() {
        return pricingSelectionCardDefaultSample;
    }
}
