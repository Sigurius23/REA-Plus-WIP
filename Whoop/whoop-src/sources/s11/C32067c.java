package s11;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l01.C23031c;
import l01.C23032d;
import l01.EnumC23029a;
import l01.EnumC23033e;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\b\u0010!R\u0017\u0010%\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010!R\u0017\u0010(\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010!R\u0017\u0010+\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010!R\u0017\u0010-\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b\u000b\u0010!R\u0017\u0010/\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b\u000e\u0010!R\u0017\u00102\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010!R\u0017\u00104\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b\u0005\u0010!¨\u00065"}, m65681d2 = {"Ls11/c;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "fakeFeatureItemTitle", "c", "fakeFeatureMarkdownItemTitle", "Lcom/whoop/design/util/TextResource;", "d", "Lcom/whoop/design/util/TextResource;", "featureListTitle", "e", "featureListTitleMarkdown", "Ll01/c;", "f", "Ll01/c;", "featureSquareShapeItem", "g", "featureSquareMarkdownShapeItem", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "featureSquareNegativeAccentTrendShapeItem", "i", "featureCircleShapeItem", "j", "featureAccentInfoItem", "k", "featureNeutralInfoItem", "Ll01/d;", "l", "Ll01/d;", "()Ll01/d;", "fakeSquareShapeFeaturesList", "m", "getFakeAccentInfoFeaturesList", "fakeAccentInfoFeaturesList", "n", "getFakeNeutralInfoFeaturesList", "fakeNeutralInfoFeaturesList", "o", "getFakeSingleAccentInfoFeaturesList", "fakeSingleAccentInfoFeaturesList", "p", "fakeSquareShapeFeaturesListMarkdown", "q", "fakeSquareShapeMarkdownFeaturesList", "r", "a", "fakeCircleShapeFeaturesList", "s", "fakeInfoFeaturesList", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32067c {

    /* JADX INFO: renamed from: a */
    public static final C32067c f132977a = new C32067c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String fakeFeatureItemTitle = "Testing Feature";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String fakeFeatureMarkdownItemTitle = "Testing **Feature**";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final TextResource featureListTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final TextResource featureListTitleMarkdown;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C23031c featureSquareShapeItem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C23031c featureSquareMarkdownShapeItem;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C23031c featureSquareNegativeAccentTrendShapeItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C23031c featureCircleShapeItem;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C23031c featureAccentInfoItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C23031c featureNeutralInfoItem;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C23032d fakeSquareShapeFeaturesList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C23032d fakeAccentInfoFeaturesList;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C23032d fakeNeutralInfoFeaturesList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C23032d fakeSingleAccentInfoFeaturesList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final C23032d fakeSquareShapeFeaturesListMarkdown;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final C23032d fakeSquareShapeMarkdownFeaturesList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final C23032d fakeCircleShapeFeaturesList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final C23032d fakeInfoFeaturesList;

    /* JADX INFO: renamed from: t */
    public static final int f132996t;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Everything on WHOOP");
        featureListTitle = textResourceM21278l;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Your gift includes: *4 Tests*");
        featureListTitleMarkdown = textResourceM21278l2;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND_15;
        EnumC23029a enumC23029a = EnumC23029a.ROUNDED_SQUARE;
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND;
        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
        C23031c c23031c = new C23031c("Testing Feature", enumC39333f3, enumC16313m0, enumC39333f, enumC39333f2, enumC23029a, 0.0f, null, 192, null);
        featureSquareShapeItem = c23031c;
        EnumC39333f enumC39333f4 = EnumC39333f.WHITE_70;
        C23031c c23031c2 = new C23031c("Testing **Feature**", enumC39333f4, enumC16313m0, enumC39333f, enumC39333f2, enumC23029a, 0.0f, null, 192, null);
        featureSquareMarkdownShapeItem = c23031c2;
        C23031c c23031c3 = new C23031c("Testing Feature", enumC39333f3, EnumC16313m0.TINY_ATTENTION, EnumC39333f.ACCENT_NEGATIVE_TREND_15, EnumC39333f.ACCENT_NEGATIVE_TREND, enumC23029a, 0.0f, null, 192, null);
        featureSquareNegativeAccentTrendShapeItem = c23031c3;
        C23031c c23031c4 = new C23031c("Testing Feature", enumC39333f3, enumC16313m0, enumC39333f3, EnumC39333f.BRAND_BLACK, EnumC23029a.CIRCLE, 0.0f, null, 192, null);
        featureCircleShapeItem = c23031c4;
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
        EnumC39333f enumC39333f5 = EnumC39333f.NEUTRAL_15;
        EnumC39333f enumC39333f6 = EnumC39333f.RECOVERY;
        C23031c c23031c5 = new C23031c("Caffeinated drinks are leading to this", enumC39333f3, enumC16313m1, enumC39333f5, enumC39333f6, enumC23029a, 0.0f, null, 192, null);
        featureAccentInfoItem = c23031c5;
        float f13 = 4;
        C23031c c23031c6 = new C23031c("Results are not a diagnosis — only a doctor can diagnose cancer and guide next steps", enumC39333f3, enumC16313m1, null, enumC39333f4, enumC23029a, f13 * f13, null, 128, null);
        featureNeutralInfoItem = c23031c6;
        EnumC23033e enumC23033e = EnumC23033e.CHECKLIST;
        fakeSquareShapeFeaturesList = new C23032d(textResourceM21278l, false, enumC23033e, AbstractC37056f.m118959K(c23031c, c23031c, c23031c3), 2, null);
        fakeAccentInfoFeaturesList = new C23032d(AbstractC8693b.m21278l("BEHAVIORS"), true, enumC23033e, AbstractC37056f.m118959K(c23031c5, c23031c5));
        fakeNeutralInfoFeaturesList = new C23032d(AbstractC8693b.m21278l("WHAT'S INCLUDED"), true, enumC23033e, AbstractC37056f.m118959K(c23031c, c23031c, c23031c, c23031c6));
        fakeSingleAccentInfoFeaturesList = new C23032d(null, false, enumC23033e, AbstractC37056f.m118958J(new C23031c("Get more restful time by reducing stress and working on increasing HRV", enumC39333f3, enumC16313m1, enumC39333f5, enumC39333f6, enumC23029a, 0.0f, null, 192, null)), 2, null);
        fakeSquareShapeFeaturesListMarkdown = new C23032d(textResourceM21278l2, false, enumC23033e, AbstractC37056f.m118959K(c23031c, c23031c, c23031c), 2, null);
        fakeSquareShapeMarkdownFeaturesList = new C23032d(textResourceM21278l, false, enumC23033e, AbstractC37056f.m118959K(c23031c2, c23031c2, c23031c2), 2, null);
        fakeCircleShapeFeaturesList = new C23032d(textResourceM21278l, false, enumC23033e, AbstractC37056f.m118959K(c23031c4, c23031c4, c23031c4), 2, null);
        fakeInfoFeaturesList = new C23032d(AbstractC8693b.m21278l("How it works"), false, EnumC23033e.INFO, AbstractC37056f.m118959K(new C23031c("Tap \"Invite Friends\"", enumC39333f6, EnumC16313m0.SEND, null, null, enumC23029a, 0.0f, null, 192, null), new C23031c("Share your referral link", enumC39333f6, EnumC16313m0.GIFT, null, null, enumC23029a, 0.0f, null, 192, null), new C23031c("Your friends unlock Advanced Labs early access", enumC39333f6, EnumC16313m0.HEART_RATE, null, null, enumC23029a, 0.0f, null, 192, null)), 2, null);
        f132996t = 8;
    }

    private C32067c() {
    }

    /* JADX INFO: renamed from: a */
    public final C23032d m99652a() {
        return fakeCircleShapeFeaturesList;
    }

    /* JADX INFO: renamed from: b */
    public final C23032d m99653b() {
        return fakeInfoFeaturesList;
    }

    /* JADX INFO: renamed from: c */
    public final C23032d m99654c() {
        return fakeSquareShapeFeaturesList;
    }

    /* JADX INFO: renamed from: d */
    public final C23032d m99655d() {
        return fakeSquareShapeFeaturesListMarkdown;
    }

    /* JADX INFO: renamed from: e */
    public final C23032d m99656e() {
        return fakeSquareShapeMarkdownFeaturesList;
    }
}
