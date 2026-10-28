package l01;

import b91.EnumC2888c;
import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InAppBrowserScreenModel;
import d11.C11474i;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import ny0.C27256h;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p720m91.C25306o;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l01.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001a\u0010/R\u0017\u00102\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u001d\u0010/R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b\u0017\u0010/R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u0010\u00108R\u0017\u0010<\u001a\u0002058\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00108R\u0017\u0010?\u001a\u0002058\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u00108R\u0017\u0010A\u001a\u0002058\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\b\u0013\u00108R\u0017\u0010C\u001a\u0002058\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\b\u000e\u00108R\u0017\u0010F\u001a\u0002058\u0006¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u00108R\u0017\u0010I\u001a\u0002058\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u00108R\u0017\u0010L\u001a\u0002058\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u00108R\u0017\u0010N\u001a\u0002058\u0006¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\b\b\u00108R\u0017\u0010P\u001a\u0002058\u0006¢\u0006\f\n\u0004\bO\u00107\u001a\u0004\b\u0005\u00108R\u0017\u0010R\u001a\u0002058\u0006¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\b\u000b\u00108R\u0017\u0010U\u001a\u0002058\u0006¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u00108R\u0017\u0010X\u001a\u0002058\u0006¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u00108R\u0017\u0010[\u001a\u0002058\u0006¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u00108¨\u0006\\"}, m65681d2 = {"Ll01/o;", "", "<init>", "()V", "Lkd1/o$a;", "b", "Lkd1/o$a;", "fakeImage", "c", "fakeUpsellImage", "", "d", "Ljava/lang/String;", "fakeTitle", "e", "fakeCardButtonTitle", "f", "fakeFeatureItemTitle", "Lcom/whoop/design/util/TextResource;", "g", "Lcom/whoop/design/util/TextResource;", "featureListTitle", "Ll01/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll01/c;", "featureItem", "i", "featureAdvancedLabsItem", "Lcom/whoop/navigation/e;", "j", "Lcom/whoop/navigation/e;", "getDestination", "()Lcom/whoop/navigation/e;", "destination", "Ll01/d;", "k", "Ll01/d;", "fakeFeaturesList", "Ll01/h;", "l", "Ll01/h;", "getFakeUpsellCardCalloutState", "()Ll01/h;", "fakeUpsellCardCalloutState", "Ll01/s;", "m", "Ll01/s;", "()Ll01/s;", "fakeUpsellSmallCardOneState", "n", "fakeUpsellSmallCardPeakState", "o", "fakeUpsellSmallCardLifeState", "Ll01/n;", "p", "Ll01/n;", "()Ll01/n;", "fakeUpsellCardFeaturesOneState", "q", "a", "fakeUpsellCardFeaturesAdvancedLabsState", "r", "getFakeUpsellCardFeaturesPdpState", "fakeUpsellCardFeaturesPdpState", "s", "fakeUpsellCardFeaturesPeakState", "t", "fakeUpsellCardFeaturesLifeState", "u", "getFakeUpsellCardFeaturesOneStateTwoButtons", "fakeUpsellCardFeaturesOneStateTwoButtons", "v", "getFakeUpsellCardFeaturesPeakStateTwoButtons", "fakeUpsellCardFeaturesPeakStateTwoButtons", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "getFakeUpsellCardFeaturesLifeStateTwoButtons", "fakeUpsellCardFeaturesLifeStateTwoButtons", "x", "fakeUpsellCardFeaturesCitlState", "y", "fakeUpsellCardFeaturesCitlNewState", "z", "fakeUpsellCardFeaturesDescriptionCardState", "A", "getFakeUpsellCardFeaturesDeviceState", "fakeUpsellCardFeaturesDeviceState", "B", "getFakeUpsellCardFeaturesItemsState", "fakeUpsellCardFeaturesItemsState", "C", "getFakeUpsellCardFeaturesLifeStateTwoButtonsAndHeader", "fakeUpsellCardFeaturesLifeStateTwoButtonsAndHeader", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23043o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesDeviceState;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesItemsState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesLifeStateTwoButtonsAndHeader;

    /* JADX INFO: renamed from: D */
    public static final int f90861D;

    /* JADX INFO: renamed from: a */
    public static final C23043o f90862a = new C23043o();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final AbstractC22403o.a fakeImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final AbstractC22403o.a fakeUpsellImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String fakeTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String fakeCardButtonTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String fakeFeatureItemTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final TextResource featureListTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C23031c featureItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C23031c featureAdvancedLabsItem;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C23032d fakeFeaturesList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C23036h fakeUpsellCardCalloutState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C23047s fakeUpsellSmallCardOneState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C23047s fakeUpsellSmallCardPeakState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C23047s fakeUpsellSmallCardLifeState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesOneState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesAdvancedLabsState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesPdpState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesPeakState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesLifeState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesOneStateTwoButtons;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesPeakStateTwoButtons;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesLifeStateTwoButtons;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesCitlState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesCitlNewState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final C23042n fakeUpsellCardFeaturesDescriptionCardState;

    static {
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62056c);
        fakeImage = aVar;
        AbstractC22403o.a aVar2 = new AbstractC22403o.a(AbstractC16272a.f62062d);
        fakeUpsellImage = aVar2;
        fakeTitle = "Lorem, Blorf snazzle wump glorfnik zop, trebble flibber noo-gazzle plonktip zizzle";
        fakeCardButtonTitle = "BLORF ZAZZLE";
        fakeFeatureItemTitle = "Testing Feature";
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Everything on WHOOP");
        featureListTitle = textResourceM21278l;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
        C23031c c23031c = new C23031c("Testing Feature", null, enumC16313m0, null, null, null, 0.0f, null, 194, null);
        featureItem = c23031c;
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND_15;
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND;
        C23031c c23031c2 = new C23031c("Testing Feature", null, enumC16313m0, enumC39333f, enumC39333f2, EnumC23029a.ROUNDED_SQUARE, 0.0f, null, 194, null);
        featureAdvancedLabsItem = c23031c2;
        C9598e c9598e = new C9598e(AppScreen.C9457y2.f28061w, new InAppBrowserScreenModel("https://app.whoop.com/fake/inapp"), null, 4, null);
        destination = c9598e;
        C23032d c23032d = new C23032d(textResourceM21278l, false, EnumC23033e.CHECKLIST, AbstractC37056f.m118959K(c23031c, c23031c, c23031c), 2, null);
        fakeFeaturesList = c23032d;
        C4092p2 c4092p2 = new C4092p2(enumC16313m0, 0.0f, null, null, new TextResource.C8691e("You're on the waitlist."), null, enumC39333f, null, enumC39333f2, null, null, null, null, false, null, null, null, null, null, null, 1040046, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("LEARN MORE");
        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
        fakeUpsellCardCalloutState = new C23036h("Get clinical lab results and personalized insights to optimize your health.", aVar2, null, c4092p2, new C27256h(textResourceM21278l2, null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), 4, null);
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        EnumC23048t enumC23048t = EnumC23048t.ONE;
        fakeUpsellSmallCardOneState = new C23047s("Lorem, Blorf snazzle wump glorfnik zop, trebble flibber noo-gazzle plonktip zizzle", enumC16313m1, aVar2, aVar, enumC23048t, c9598e);
        EnumC23048t enumC23048t2 = EnumC23048t.PEAK;
        fakeUpsellSmallCardPeakState = new C23047s("Lorem, Blorf snazzle wump glorfnik zop, trebble flibber noo-gazzle plonktip zizzle", enumC16313m1, aVar2, aVar, enumC23048t2, c9598e);
        EnumC23048t enumC23048t3 = EnumC23048t.LIFE;
        fakeUpsellSmallCardLifeState = new C23047s("Lorem, Blorf snazzle wump glorfnik zop, trebble flibber noo-gazzle plonktip zizzle", enumC16313m1, aVar2, aVar, enumC23048t3, c9598e);
        EnumC16313m0 enumC16313m2 = EnumC16313m0.CROSS;
        EnumC2888c enumC2888c = EnumC2888c.B2;
        C23042n c23042n = new C23042n("id", enumC16313m2, aVar2, "Lorem, Blorf snazzle wump glorfnik zop, trebble flibber noo-gazzle plonktip zizzle", enumC2888c, aVar, null, null, null, enumC23048t, new C27256h(AbstractC8693b.m21278l("BLORF ZAZZLE"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, c23032d, null, null, 0.0f, 0.0f, 0.0f, AbstractC18249c.m52575m(enumC39333f3), false, null, 1829248, null);
        fakeUpsellCardFeaturesOneState = c23042n;
        C23042n c23042n2 = new C23042n("id", null, aVar2, null, enumC2888c, null, null, null, null, EnumC23048t.ADVANCED_LABS, new C27256h(AbstractC8693b.m21278l("BLORF ZAZZLE"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, C23032d.m66806b(c23032d, null, false, null, AbstractC37056f.m118959K(c23031c2, c23031c2, c23031c2), 7, null), null, null, 0.0f, 0.0f, 0.0f, null, false, null, 1567104, null);
        fakeUpsellCardFeaturesAdvancedLabsState = c23042n2;
        fakeUpsellCardFeaturesPdpState = C23042n.m66921b(c23042n2, null, null, null, null, null, null, null, null, null, EnumC23048t.PDP, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2096639, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("BLORF ZAZZLE");
        EnumC39333f enumC39333f4 = EnumC39333f.STRAIN_ZONE_1;
        fakeUpsellCardFeaturesPeakState = C23042n.m66921b(c23042n, null, null, null, null, null, null, null, null, null, enumC23048t2, new C27256h(textResourceM21278l3, null, AbstractC18249c.m52575m(enumC39333f4), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2095615, null);
        fakeUpsellCardFeaturesLifeState = C23042n.m66921b(c23042n, null, null, null, null, null, null, null, null, null, enumC23048t3, new C27256h(AbstractC8693b.m21278l("BLORF ZAZZLE"), null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2095615, null);
        fakeUpsellCardFeaturesOneStateTwoButtons = new C23042n("id", enumC16313m2, aVar2, "Lorem, improve performance with the wearable that transformed the market. Compatible with your WHOOP MG.", enumC2888c, aVar, null, null, null, enumC23048t, new C27256h(AbstractC8693b.m21278l("EXPLORE WHOOP"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), new C27256h(AbstractC8693b.m21278l("EXPLORE WHOOP"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), c23032d, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2089344, null);
        fakeUpsellCardFeaturesPeakStateTwoButtons = C23042n.m66921b(c23042n, null, null, null, null, null, null, null, null, null, enumC23048t2, new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52575m(enumC39333f4), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52575m(enumC39333f4), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093567, null);
        fakeUpsellCardFeaturesLifeStateTwoButtons = C23042n.m66921b(c23042n, null, null, null, null, null, null, null, null, null, enumC23048t3, new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093567, null);
        fakeUpsellCardFeaturesCitlState = C23042n.m66921b(c23042n, null, null, null, "Clinical care that's one step ahead. Connecting your trends to your labs, like never before.", null, null, null, null, null, EnumC23048t.CITL, new C27256h(AbstractC8693b.m21278l("BOOK A CONSULTATION"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, null, 0.0f, 0.0f, 0.0f, null, true, null, 1567221, null);
        fakeUpsellCardFeaturesCitlNewState = C23042n.m66921b(c23042n, null, null, null, "Clinical care that's one step ahead. Connecting your trends to your labs, like never before.", null, null, null, null, null, EnumC23048t.CITL_NEW, new C27256h(AbstractC8693b.m21278l("BOOK A CONSULTATION"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, null, 0.0f, 0.0f, 0.0f, null, true, null, 1567221, null);
        fakeUpsellCardFeaturesDescriptionCardState = new C23042n(null, null, aVar2, null, enumC2888c, null, null, null, null, null, new C27256h(AbstractC8693b.m21278l("PURCHASE TEST FOR $799"), null, AbstractC18249c.m52575m(enumC39333f3), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, new C23030b(AbstractC8693b.m21278l("EARLY CANCER DETECTION WITH GALLERI®"), AbstractC8693b.m21278l("Greater control. More options. Clearer answers. Galleri® is a single blood test that screens for 50+ cancers — before symptoms appear.")), null, 0.0f, 0.0f, 0.0f, null, false, null, 1558976, null);
        fakeUpsellCardFeaturesDeviceState = C23042n.m66921b(c23042n, null, null, null, "Upgrade your WHOOP experience with the latest device.", null, null, null, null, null, EnumC23048t.DEVICE, new C27256h(AbstractC8693b.m21278l("SHOP DEVICE"), null, null, null, null, null, EnumC27272p.REFER_A_FRIEND, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554232, null), null, null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 1305077, null);
        fakeUpsellCardFeaturesItemsState = C23042n.m66921b(c23042n, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC37056f.m118958J(new C25306o(new C11474i(null, null, null, AbstractC8693b.m21278l("Upgrade to WHOOP Life"), AbstractC8693b.m21278l("Limited-time cyber deal on your Life upgrade."), null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, c9598e, 268435303, null), null, 2, null)), 0.0f, 0.0f, 0.0f, null, false, null, 2076671, null);
        fakeUpsellCardFeaturesLifeStateTwoButtonsAndHeader = C23042n.m66921b(c23042n, null, null, null, null, null, null, "Gift Your 4.0 Get $50", null, null, enumC23048t3, new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), new C27256h(AbstractC8693b.m21278l("UPGRADE TO WHOOP"), null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, null, null, null, c9598e, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554296, null), null, null, null, 0.0f, 0.0f, 0.0f, null, false, null, 2093503, null);
        f90861D = 8;
    }

    private C23043o() {
    }

    /* JADX INFO: renamed from: a */
    public final C23042n m66943a() {
        return fakeUpsellCardFeaturesAdvancedLabsState;
    }

    /* JADX INFO: renamed from: b */
    public final C23042n m66944b() {
        return fakeUpsellCardFeaturesCitlNewState;
    }

    /* JADX INFO: renamed from: c */
    public final C23042n m66945c() {
        return fakeUpsellCardFeaturesCitlState;
    }

    /* JADX INFO: renamed from: d */
    public final C23042n m66946d() {
        return fakeUpsellCardFeaturesDescriptionCardState;
    }

    /* JADX INFO: renamed from: e */
    public final C23042n m66947e() {
        return fakeUpsellCardFeaturesLifeState;
    }

    /* JADX INFO: renamed from: f */
    public final C23042n m66948f() {
        return fakeUpsellCardFeaturesOneState;
    }

    /* JADX INFO: renamed from: g */
    public final C23042n m66949g() {
        return fakeUpsellCardFeaturesPeakState;
    }

    /* JADX INFO: renamed from: h */
    public final C23047s m66950h() {
        return fakeUpsellSmallCardLifeState;
    }

    /* JADX INFO: renamed from: i */
    public final C23047s m66951i() {
        return fakeUpsellSmallCardOneState;
    }

    /* JADX INFO: renamed from: j */
    public final C23047s m66952j() {
        return fakeUpsellSmallCardPeakState;
    }
}
