package o61;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f01.C13873k0;
import f01.C13885o0;
import f01.C13888p0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j61.C21372f;
import j61.C21373g;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k61.C22230c;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27266m;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import u61.C34552a;
import u61.C34556e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o61.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0011\u0010'R\u0017\u0010*\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b\n\u0010'R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u0013\u0010'R\u0017\u0010.\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b\u000f\u0010'R\u0017\u00100\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b\r\u0010'R\u0017\u00102\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b\u0016\u0010'¨\u00063"}, m65681d2 = {"Lo61/f;", "", "<init>", "()V", "", "isCalibrating", "Lj71/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Z)Lj71/c;", "Lhy0/c2;", "b", "Lhy0/c2;", "calibratingTrend", "c", "positiveYellowTrend", "d", "positiveBlueTrend", "e", "positiveGreenTrend", "f", "longTextTrend", "Lf01/k0;", "g", "Lf01/k0;", "fakeGraphDescriptionBody", "emptyStateBody", "Lf01/p0;", "i", "Lf01/p0;", "getFakeGraphDescriptionFooter", "()Lf01/p0;", "fakeGraphDescriptionFooter", "j", "getPositiveYellowTrendWithIcon", "()Lf01/k0;", "positiveYellowTrendWithIcon", "Lf01/o0;", "k", "Lf01/o0;", "()Lf01/o0;", "fakeGraphDescriptionState", "l", "fakeGraphDescriptionCalibratingState", "m", "fakeGraphDescriptionYoungerState", "n", "fakeGraphDescriptionNoDataState", "o", "fakeGraphDescriptionLongTextState", "p", "rightItemState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27607f {

    /* JADX INFO: renamed from: a */
    public static final C27607f f111109a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C17731c2 calibratingTrend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C17731c2 positiveYellowTrend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C17731c2 positiveBlueTrend;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C17731c2 positiveGreenTrend;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C17731c2 longTextTrend;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C13873k0 fakeGraphDescriptionBody;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C13873k0 emptyStateBody;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C13888p0 fakeGraphDescriptionFooter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C13873k0 positiveYellowTrendWithIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C13885o0 fakeGraphDescriptionState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C13885o0 fakeGraphDescriptionCalibratingState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C13885o0 fakeGraphDescriptionYoungerState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C13885o0 fakeGraphDescriptionNoDataState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C13885o0 fakeGraphDescriptionLongTextState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final C13885o0 rightItemState;

    /* JADX INFO: renamed from: q */
    public static final int f111125q;

    /* JADX INFO: renamed from: o61.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f111126w = new a();

        /* JADX INFO: renamed from: a */
        public final long m83367a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m83367a((C39336i) obj));
        }
    }

    static {
        C27607f c27607f = new C27607f();
        f111109a = c27607f;
        C17731c2 c17731c2 = new C17731c2(AbstractC8693b.m21278l("Calibrating"), true, EnumC17727b2.NEUTRAL, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null);
        calibratingTrend = c17731c2;
        C17731c2 c17731c3 = new C17731c2(AbstractC8693b.m21278l("vs. typical Tuesday"), true, EnumC17727b2.POSITIVE_YELLOW, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null);
        positiveYellowTrend = c17731c3;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("0.2 years younger");
        EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE_BLUE;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_TRIANGLE_DOWN;
        C17731c2 c17731c4 = new C17731c2(textResourceM21278l, true, enumC17727b2, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null);
        positiveBlueTrend = c17731c4;
        C17731c2 c17731c5 = new C17731c2(AbstractC8693b.m21278l(""), true, EnumC17727b2.POSITIVE_GREEN, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null);
        positiveGreenTrend = c17731c5;
        C17731c2 c17731c6 = new C17731c2(AbstractC8693b.m21278l("plus lent que la semaine la semaine dernière"), true, enumC17727b2, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null);
        longTextTrend = c17731c6;
        C13873k0 c13873k0 = new C13873k0(AbstractC8693b.m21278l("TODAY'S HIGH STRESS"), AbstractC8693b.m21278l("2:15"), AbstractC8693b.m21278l("hrs"), c17731c3);
        fakeGraphDescriptionBody = c13873k0;
        C13873k0 c13873k0M39330b = C13873k0.m39330b(c13873k0, null, AbstractC8693b.m21278l("--:--"), null, null, 5, null);
        emptyStateBody = c13873k0M39330b;
        boolean z4 = false;
        C13888p0 c13888p0 = new C13888p0(AbstractC8693b.m21278l("Calibration in progress"), AbstractC8693b.m21278l("Needs 4 Recoveries"), c17731c2, z4, 8, null);
        fakeGraphDescriptionFooter = c13888p0;
        positiveYellowTrendWithIcon = C13873k0.m39330b(c13873k0, null, null, null, c17731c3.m50800a((28671 & 1) != 0 ? c17731c3.text : null, (28671 & 2) != 0 ? c17731c3.includeBackground : false, (28671 & 4) != 0 ? c17731c3.trendTypeState : null, (28671 & 8) != 0 ? c17731c3.isPressed : false, (28671 & 16) != 0 ? c17731c3.icon : EnumC16313m0.TINY_ATTENTION, (28671 & 32) != 0 ? c17731c3.removeSideRadius : null, (28671 & 64) != 0 ? c17731c3.withIcon : false, (28671 & 128) != 0 ? c17731c3.showBorder : false, (28671 & 256) != 0 ? c17731c3.overflow : 0, (28671 & 512) != 0 ? c17731c3.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17731c3.iconSize : 0.0f, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17731c3.destination : null, (28671 & 4096) != 0 ? c17731c3.maxFontScaling : null, (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17731c3.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17731c3.backgroundPaddingValues : null), 7, null);
        C13885o0 c13885o0 = new C13885o0("STRESS_MONITOR", AbstractC8693b.m21278l("STRESS MONITOR"), EnumC16313m0.TINY_CARET_FORWARD, null, m83358i(c27607f, false, 1, null), c13873k0, null, null, null, null);
        fakeGraphDescriptionState = c13885o0;
        C13885o0 c13885o0M39452b = C13885o0.m39452b(c13885o0, null, null, null, null, c27607f.m83366h(true), C13873k0.m39330b(c13873k0, null, null, null, c17731c2, 7, null), c13888p0, null, null, null, 911, null);
        fakeGraphDescriptionCalibratingState = c13885o0M39452b;
        fakeGraphDescriptionYoungerState = C13885o0.m39452b(c13885o0, "HEALTHSPAN", AbstractC8693b.m21278l("HEALTHSPAN"), null, null, null, c13873k0.m39331a(AbstractC8693b.m21278l("WHOOP AGE"), AbstractC8693b.m21278l("25"), AbstractC8693b.m21278l(""), c17731c4), C13888p0.m39487b(c13888p0, AbstractC8693b.m21278l("Decreased Pace of Aging"), AbstractC8693b.m21278l("vs. last week"), c17731c5, false, 8, null), null, null, null, 924, null);
        fakeGraphDescriptionNoDataState = C13885o0.m39452b(c13885o0M39452b, null, null, null, null, C21395c.m60092b(m83358i(c27607f, false, 1, null), null, AbstractC37056f.m118958J(new AbstractC21394b.e(new C27602a("END", "STANDARD"), null, "stress_final_marker", false, false, 24, null)), null, null, 13, null), c13873k0M39330b, null, null, null, null, 911, null);
        fakeGraphDescriptionLongTextState = C13885o0.m39452b(c13885o0, "HEALTHSPAN", AbstractC8693b.m21278l("HEALTHSPAN"), null, null, null, c13873k0.m39331a(AbstractC8693b.m21278l("WHOOP AGE"), AbstractC8693b.m21278l("25"), AbstractC8693b.m21278l(""), c17731c6), C13888p0.m39487b(c13888p0, AbstractC8693b.m21278l("Decreased Pace of Aging"), AbstractC8693b.m21278l("vs. last week"), c17731c5, false, 8, null), null, null, null, 924, null);
        rightItemState = C13885o0.m39452b(c13885o0, null, null, null, new C17731c2(AbstractC8693b.m21278l("example design item"), true, EnumC17727b2.POSITIVE_RANGE, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), null, null, null, null, null, null, MessageListItemViewType.LINK_ATTACHMENTS, null);
        f111125q = 8;
    }

    private C27607f() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C21395c m83358i(C27607f c27607f, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c27607f.m83366h(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final AbstractC17911t m83359j(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getAccentNegativeTrend()), new C17919x(brushBackground.getAccentPositiveTrend()), new C17919x(brushBackground.getRecovery())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: b */
    public final C13885o0 m83360b() {
        return fakeGraphDescriptionCalibratingState;
    }

    /* JADX INFO: renamed from: c */
    public final C13885o0 m83361c() {
        return fakeGraphDescriptionLongTextState;
    }

    /* JADX INFO: renamed from: d */
    public final C13885o0 m83362d() {
        return fakeGraphDescriptionNoDataState;
    }

    /* JADX INFO: renamed from: e */
    public final C13885o0 m83363e() {
        return fakeGraphDescriptionState;
    }

    /* JADX INFO: renamed from: f */
    public final C13885o0 m83364f() {
        return fakeGraphDescriptionYoungerState;
    }

    /* JADX INFO: renamed from: g */
    public final C13885o0 m83365g() {
        return rightItemState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final C21395c m83366h(boolean isCalibrating) {
        List listM118959K = AbstractC37056f.m118959K(new C21372f(0.1f, null, null, null, null, null, null, 126, null), new C21372f(0.36f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null), new C21372f(0.63f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null), new C21372f(0.9f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null));
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C21374h c21374h = new C21374h(null, null, null, 0 == true ? 1 : 0, new C16618c(0.05f, 0.05f, 0.05f, 0.04f), listM118959K, C25271y.f99162w, new C21373g(AbstractC8693b.m21278l("stressHrGraphState"), objArr2, null, objArr, 14, null), true, false, 0 == true ? 1 : 0, 0L, 0.0f, 7695, null);
        C22230c c22230c = isCalibrating ? new C22230c(0.0f, 0, 0, null, 0L, false, 63, null) : new C22230c(0.0f, 0, 0, AbstractC18249c.m52572j(new C27266m(25)), 0L, false, 55, null);
        List<C34556e> listM118959K2 = AbstractC37056f.m118959K(new C34556e(0.0f, 0.1749653f, null, null, null, null, 60, null), new C34556e(0.01f, 0.2359073f, null, null, null, null, 60, null), new C34556e(0.02f, 0.1990325f, null, null, null, null, 60, null), new C34556e(0.03f, 0.22256988f, null, null, null, null, 60, null), new C34556e(0.04f, 0.18739685f, null, null, null, null, 60, null), new C34556e(0.05f, 0.15655762f, null, null, null, null, 60, null), new C34556e(0.06f, 0.16400215f, null, null, null, null, 60, null), new C34556e(0.07f, 0.22661766f, null, null, null, null, 60, null), new C34556e(0.08f, 0.23575307f, null, null, null, null, 60, null), new C34556e(0.09f, 0.23113143f, null, null, null, null, 60, null), new C34556e(0.1f, 0.14325826f, null, null, null, null, 60, null), new C34556e(0.11f, 0.18431748f, null, null, null, null, 60, null), new C34556e(0.12f, 0.27153572f, null, null, null, null, 60, null), new C34556e(0.13f, 0.24009493f, null, null, null, null, 60, null), new C34556e(0.14f, 0.20369925f, null, null, null, null, 60, null), new C34556e(0.15f, 0.27071595f, null, null, null, null, 60, null), new C34556e(0.16f, 0.19268462f, null, null, null, null, 60, null), new C34556e(0.17f, 0.1471308f, null, null, null, null, 60, null), new C34556e(0.18f, 0.19521318f, null, null, null, null, 60, null), new C34556e(0.19f, 0.27374896f, null, null, null, null, 60, null), new C34556e(0.2f, 0.17675453f, null, null, null, null, 60, null), new C34556e(0.21f, 0.25686646f, null, null, null, null, 60, null), new C34556e(0.22f, 0.1985346f, null, null, null, null, 60, null), new C34556e(0.23f, 0.16729625f, null, null, null, null, 60, null), new C34556e(0.24f, 0.18687728f, null, null, null, null, 60, null), new C34556e(0.25f, 0.23376912f, null, null, null, null, 60, null), new C34556e(0.26f, 0.247189f, null, null, null, null, 60, null), new C34556e(0.27f, 0.24439521f, null, null, null, null, 60, null), new C34556e(0.28f, 0.29403663f, null, null, null, null, 60, null), new C34556e(0.29f, 0.27072448f, null, null, null, null, 60, null), new C34556e(0.3f, 0.2643976f, null, null, null, null, 60, null), new C34556e(0.31f, 0.25227156f, null, null, null, null, 60, null), new C34556e(0.32f, 0.23375201f, null, null, null, null, 60, null), new C34556e(0.33f, 0.345027f, null, null, null, null, 60, null), new C34556e(0.34f, 0.34794274f, null, null, null, null, 60, null), new C34556e(0.35f, 0.33680123f, null, null, null, null, 60, null), new C34556e(0.36f, 0.29314616f, null, null, null, null, 60, null), new C34556e(0.37f, 0.36815667f, null, null, null, null, 60, null), new C34556e(0.38f, 0.35516363f, null, null, null, null, 60, null), new C34556e(0.39f, 0.49494115f, null, null, null, null, 60, null), new C34556e(0.4f, 0.4405598f, null, null, null, null, 60, null), new C34556e(0.41f, 0.42091292f, null, null, null, null, 60, null), new C34556e(0.42f, 0.40586513f, null, null, null, null, 60, null), new C34556e(0.43f, 0.55308443f, null, null, null, null, 60, null), new C34556e(0.44f, 0.38643485f, null, null, null, null, 60, null), new C34556e(0.45f, 0.48798588f, null, null, null, null, 60, null), new C34556e(0.46f, 0.4853838f, null, null, null, null, 60, null), new C34556e(0.47f, 0.5504575f, null, null, null, null, 60, null), new C34556e(0.48f, 0.4131981f, null, null, null, null, 60, null), new C34556e(0.49f, 0.43081924f, null, null, null, null, 60, null), new C34556e(0.5f, 0.5874471f, null, null, null, null, 60, null), new C34556e(0.51f, 0.45180872f, null, null, null, null, 60, null), new C34556e(0.52f, 0.4839462f, null, null, null, null, 60, null), new C34556e(0.53f, 0.5076686f, null, null, null, null, 60, null), new C34556e(0.54f, 0.62677807f, null, null, null, null, 60, null), new C34556e(0.55f, 0.48135123f, null, null, null, null, 60, null), new C34556e(0.56f, 0.41537678f, null, null, null, null, 60, null), new C34556e(0.57f, 0.5134545f, null, null, null, null, 60, null), new C34556e(0.58f, 0.57155204f, null, null, null, null, 60, null), new C34556e(0.59f, 0.49206957f, null, null, null, null, 60, null), new C34556e(0.6f, 0.5241387f, null, null, null, null, 60, null), new C34556e(0.61f, 0.50753266f, null, null, null, null, 60, null), new C34556e(0.62f, 0.41063634f, null, null, null, null, 60, null), new C34556e(0.63f, 0.46238807f, null, null, null, null, 60, null), new C34556e(0.64f, 0.37581113f, null, null, null, null, 60, null), new C34556e(0.65f, 0.49853086f, null, null, null, null, 60, null), new C34556e(0.66f, 0.5953474f, null, null, null, null, 60, null), new C34556e(0.67f, 0.51965016f, null, null, null, null, 60, null), new C34556e(0.68f, 0.5241055f, null, null, null, null, 60, null), new C34556e(0.69f, 0.61295855f, null, null, null, null, 60, null), new C34556e(0.7f, 0.45614058f, null, null, null, null, 60, null), new C34556e(0.71f, 0.62741345f, null, null, null, null, 60, null), new C34556e(0.72f, 0.4810794f, null, null, null, null, 60, null), new C34556e(0.73f, 0.63581985f, null, null, null, null, 60, null), new C34556e(0.74f, 0.49937645f, null, null, null, null, 60, null), new C34556e(0.75f, 0.49269837f, null, null, null, null, 60, null), new C34556e(0.76f, 0.43960878f, null, null, null, null, 60, null), new C34556e(0.77f, 0.49795237f, null, null, null, null, 60, null), new C34556e(0.78f, 0.5702696f, null, null, null, null, 60, null), new C34556e(0.79f, 0.5525465f, null, null, null, null, 60, null), new C34556e(0.8f, 0.6746962f, null, null, null, null, 60, null), new C34556e(0.81f, 0.5508775f, null, null, null, null, 60, null), new C34556e(0.82f, 0.47635412f, null, null, null, null, 60, null), new C34556e(0.83f, 0.43630743f, null, null, null, null, 60, null), new C34556e(0.84f, 0.3929305f, null, null, null, null, 60, null), new C34556e(0.85f, 0.42137843f, null, null, null, null, 60, null), new C34556e(0.86f, 0.43188974f, null, null, null, null, 60, null), new C34556e(0.87f, 0.33287725f, null, null, null, null, 60, null), new C34556e(0.88f, 0.36150515f, null, null, null, null, 60, null), new C34556e(0.89f, 0.53294927f, null, null, null, null, 60, null), new C34556e(0.9f, 0.4226092f, null, null, null, null, 60, null), new C34556e(0.91f, 0.50061864f, null, null, null, null, 60, null), new C34556e(0.92f, 0.3737286f, null, null, null, null, 60, null), new C34556e(0.93f, 0.46118143f, null, null, null, null, 60, null), new C34556e(0.94f, 0.43740317f, null, null, null, null, 60, null), new C34556e(0.95f, 0.4960412f, null, null, null, null, 60, null), new C34556e(0.96f, 0.44800285f, null, null, null, null, 60, null), new C34556e(0.97f, 0.58221674f, null, null, null, null, 60, null), new C34556e(0.98f, 0.35430968f, null, null, null, null, 60, null), new C34556e(0.99f, 0.43066323f, null, null, null, null, 60, null));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K2, 10));
        for (C34556e c34556e : listM118959K2) {
            arrayList.add(C34556e.m109246c(c34556e, 0.0f, 0.0f, null, null, null, new C0520a(null, null, AbstractC8693b.m21278l(String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(c34556e.getYPercent())}, 1))), null, null, p745y81.Function1.m125323a(a.f111126w), null, false, null, null, null, null, 4059, null), 31, null));
        }
        return new C21395c(c21374h, AbstractC37056f.m118959K(new AbstractC21394b.g(AbstractC37056f.m118958J(new C34552a(arrayList, null, c22230c, null, 8, null)), "greenishline", false, null, null, false, 60, null), new AbstractC21394b.e(new C27602a("END", "STANDARD"), new C27606e(0.43066323f, "STANDARD", null, 4, null), "stress_final_marker", false, false, 24, null)), null, null, 12, null);
    }
}
