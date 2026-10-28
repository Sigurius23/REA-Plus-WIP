package j81;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.TrendsScreenModel;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: j81.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006$"}, m65681d2 = {"Lj81/h;", "", "<init>", "()V", "Lcom/whoop/navigation/e;", "b", "Lcom/whoop/navigation/e;", "getNavigationAction", "()Lcom/whoop/navigation/e;", "navigationAction", "Lj81/i;", "c", "Lj81/i;", "d", "()Lj81/i;", "fakeStrainGauge", "e", "fakeStrainTargetReachedGauge", "fakeRecoveryGauge", "f", "a", "fakeRecoveryEmptyGauge", "g", "fakeSleepGauge", "Lj81/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj81/c;", "getFakeStrainCircularDialState", "()Lj81/c;", "fakeStrainCircularDialState", "i", "getFakeRecoveryCircularDialState", "fakeRecoveryCircularDialState", "j", "getFakeSleepCircularDialState", "fakeSleepCircularDialState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21424h {

    /* JADX INFO: renamed from: a */
    public static final C21424h f82205a = new C21424h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C9598e navigationAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C21425i fakeStrainGauge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C21425i fakeStrainTargetReachedGauge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C21425i fakeRecoveryGauge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C21425i fakeRecoveryEmptyGauge;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C21425i fakeSleepGauge;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C21419c fakeStrainCircularDialState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C21419c fakeRecoveryCircularDialState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C21419c fakeSleepCircularDialState;

    /* JADX INFO: renamed from: k */
    public static final int f82215k;

    /* JADX INFO: renamed from: j81.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f82216w = new a();

        /* JADX INFO: renamed from: a */
        public final long m60286a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60286a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f82217w = new b();

        /* JADX INFO: renamed from: a */
        public final long m60287a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60287a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f82218w = new c();

        /* JADX INFO: renamed from: a */
        public final long m60288a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60288a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f82219w = new d();

        /* JADX INFO: renamed from: a */
        public final long m60289a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60289a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f82220w = new e();

        /* JADX INFO: renamed from: a */
        public final long m60290a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60290a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f82221w = new f();

        /* JADX INFO: renamed from: a */
        public final long m60291a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60291a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f82222w = new g();

        /* JADX INFO: renamed from: a */
        public final long m60292a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60292a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: j81.h$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f82223w = new h();

        /* JADX INFO: renamed from: a */
        public final long m60293a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m60293a((C39336i) obj));
        }
    }

    static {
        C9598e c9598e = new C9598e(AppScreen.C9270a6.f27482w, new TrendsScreenModel("HR_ZONES_1_3", 0, "2024-11-27", (String) null, (String) null, (AiAction) null, 56, (DefaultConstructorMarker) null), null, 4, null);
        navigationAction = c9598e;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("14.2");
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("STRAIN");
        AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(p745y81.Function1.m125323a(g.f82222w));
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        Float fValueOf = Float.valueOf(0.8f);
        Float fValueOf2 = Float.valueOf(0.4f);
        Float fValueOf3 = Float.valueOf(0.7f);
        fakeStrainGauge = new C21425i("STRAIN_SCORE_GAUGE", "StrainScoreGauge", textResourceM21278l, textResourceM21267a, textResourceM21278l2, fValueOf, 0.8f, fValueOf2, fValueOf3, abstractC18247aM52575m, null, 0.0f, 0.0f, 0.0f, false, c9598e, enumC39333f, null, null, 423936, null);
        fakeStrainTargetReachedGauge = new C21425i("STRAIN_SCORE_GAUGE", "StrainScoreGauge", AbstractC8693b.m21278l("14.2"), AbstractC8693b.m21267a(), AbstractC8693b.m21278l("TARGET REACHED"), Float.valueOf(0.671f), 0.676f, fValueOf2, fValueOf3, AbstractC18249c.m52575m(p745y81.Function1.m125323a(h.f82223w)), null, 0.0f, 0.0f, 0.0f, false, c9598e, enumC39333f, EnumC39333f.ACCENT_ACTION, Integer.valueOf(AbstractC2875y.m8290c(C38072d.f163053a)), 30720, null);
        fakeRecoveryGauge = new C21425i("RECOVERY_SCORE_GAUGE", "RecoveryScoreGauge", AbstractC8693b.m21278l("85"), AbstractC8693b.m21278l("%"), AbstractC8693b.m21278l("RECOVERY"), null, 0.85f, null, null, AbstractC18249c.m52575m(p745y81.Function1.m125323a(c.f82218w)), null, 0.0f, 0.0f, 0.0f, false, c9598e, enumC39333f, null, null, 423936, null);
        fakeRecoveryEmptyGauge = new C21425i("RECOVERY_SCORE_GAUGE", "RecoveryScoreGauge", AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("%"), AbstractC8693b.m21278l("RECOVERY"), null, 0.0f, null, null, AbstractC18249c.m52575m(p745y81.Function1.m125323a(b.f82217w)), null, 0.0f, 0.0f, 0.0f, false, null, EnumC39333f.WHITE_20, null, null, 423936, null);
        fakeSleepGauge = new C21425i("SLEEP_SCORE_GAUGE", "SleepScoreGauge", AbstractC8693b.m21278l("74"), AbstractC8693b.m21278l("%"), AbstractC8693b.m21278l("SLEEP PERFORMANCE"), null, 0.74f, null, null, AbstractC18249c.m52575m(p745y81.Function1.m125323a(e.f82220w)), AbstractC37056f.m118959K(EnumC39333f.ACCENT_POSITIVE_TREND, EnumC39333f.WHITE_50, EnumC39333f.ACCENT_NEGATIVE_TREND), 0.0f, 0.0f, 0.0f, false, c9598e, enumC39333f, null, null, 423936, null);
        float f13 = 22 * 4;
        float f14 = 6;
        fakeStrainCircularDialState = new C21419c(f13, 0.2f, AbstractC18249c.m52575m(p745y81.Function1.m125323a(f.f82221w)), Float.valueOf(0.5f), Float.valueOf(0.3f), Float.valueOf(0.6f), false, f14, 0.0f, null, null, 1856, null);
        fakeRecoveryCircularDialState = new C21419c(f13, 0.7f, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f82216w)), null, null, null, false, f14, 0.0f, null, null, 1912, null);
        fakeSleepCircularDialState = new C21419c(f13, 0.8f, AbstractC18249c.m52575m(p745y81.Function1.m125323a(d.f82219w)), null, null, null, false, f14, 0.0f, null, null, 1912, null);
        f82215k = 8;
    }

    private C21424h() {
    }

    /* JADX INFO: renamed from: a */
    public final C21425i m60281a() {
        return fakeRecoveryEmptyGauge;
    }

    /* JADX INFO: renamed from: b */
    public final C21425i m60282b() {
        return fakeRecoveryGauge;
    }

    /* JADX INFO: renamed from: c */
    public final C21425i m60283c() {
        return fakeSleepGauge;
    }

    /* JADX INFO: renamed from: d */
    public final C21425i m60284d() {
        return fakeStrainGauge;
    }

    /* JADX INFO: renamed from: e */
    public final C21425i m60285e() {
        return fakeStrainTargetReachedGauge;
    }
}
