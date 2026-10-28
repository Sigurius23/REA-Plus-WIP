package vi1;

import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.health.monitor.medical.domain.HeartHealthBffRequest;
import com.whoop.health.monitor.medical.domain.model.HeartHealthBffModel;
import com.whoop.health.monitor.medical.domain.model.HorizontalDividerModel;
import com.whoop.health.monitor.medical.domain.model.LabradorEnabledCardModel;
import com.whoop.health.monitor.medical.domain.model.LabradorResultModel;
import com.whoop.health.monitor.medical.domain.model.SamdCardHeaderModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdDetectionModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdMenuItemModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdReadingModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdTileModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.LabradorDetailsScreenModel;
import com.whoop.navigation.LabradorReadingModel;
import com.whoop.navigation.LabradorResultsModel;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import org.joda.time.DateTime;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30057d;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rk1.EnumC31496c;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sk1.C32573b;
import sm0.AbstractC32714a;
import ti1.AbstractC33851c;
import ti1.AbstractC33852d;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yi1.EnumC39580n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: vi1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u0010\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\b\u0012\u0004\u0012\u00020,0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b-\u0010.J#\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010T\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR \u0010[\u001a\u00020U8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010S\u001a\u0004\bX\u0010YR \u0010`\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\\\u0012\u0004\b_\u0010S\u001a\u0004\b]\u0010^R \u0010f\u001a\u00020a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b5\u0010b\u0012\u0004\be\u0010S\u001a\u0004\bc\u0010d¨\u0006g"}, m65681d2 = {"Lvi1/d;", "Lod1/g;", "Lvi1/b;", "Lvi1/c;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Lqk1/b;", "dao", "Ljava/time/ZoneId;", "zone", "Ljava/time/Clock;", "clock", "<init>", "(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;)V", "Lec3/l;", "s", "()Lec3/l;", "Lvi1/c$c;", "cacheSuccess", "k", "(Lvi1/c$c;Lq83/d;)Ljava/lang/Object;", "o", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;", "cached", "v", "(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;", "u", "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;", "t", "Lrk1/c;", "state", "Lhy0/b2;", "r", "(Lrk1/c;)Lhy0/b2;", "", "Lsk1/b;", "determinations", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;", "p", "(Ljava/util/List;)Ljava/util/List;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lqk1/a;", "reading", "Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;", "l", "(Lqk1/a;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;", "Ljava/time/Instant;", "timestamp", "Lcom/whoop/design/util/TextResource$c;", "q", "(Ljava/time/Instant;)Lcom/whoop/design/util/TextResource$c;", "a", "Lnm0/e;", "b", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "c", "Lzr2/a;", "d", "Ltr2/n;", "e", "Lqk1/b;", "f", "Ljava/time/ZoneId;", "g", "Ljava/time/Clock;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;", "offlineLabradorEnabledCardModel", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "i", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "n", "()Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "getOfflineShepherdErrorModel$kennel_release$annotations", "()V", "offlineShepherdErrorModel", "Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;", "j", "Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;", "m", "()Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;", "getOfflineDividerModel$kennel_release$annotations", "offlineDividerModel", "Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;", "getOfflineModel$kennel_release", "()Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;", "getOfflineModel$kennel_release$annotations", "offlineModel", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "getDataBehindTileModel$kennel_release", "()Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;", "getDataBehindTileModel$kennel_release$annotations", "dataBehindTileModel", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36061d implements InterfaceC27844g<InterfaceC36059b, InterfaceC36060c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final OnboardingStatusDao onboardingStatusDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30444b dao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ZoneId zone;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final LabradorEnabledCardModel offlineLabradorEnabledCardModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ShepherdDetectionModel offlineShepherdErrorModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final HorizontalDividerModel offlineDividerModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final HeartHealthBffModel offlineModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final ShepherdTileModel dataBehindTileModel;

    /* JADX INFO: renamed from: vi1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f153941a;

        static {
            int[] iArr = new int[EnumC31496c.values().length];
            try {
                iArr[EnumC31496c.SinusRhythm.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31496c.Unreadable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153941a = iArr;
        }
    }

    /* JADX INFO: renamed from: vi1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor", m100430f = "HeartHealthInteractor.kt", m100431l = {98}, m100432m = "applyLocalReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f153942w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153943x;

        /* JADX INFO: renamed from: z */
        int f153945z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153943x = obj;
            this.f153945z |= Integer.MIN_VALUE;
            return C36061d.this.m114496k(null, this);
        }
    }

    /* JADX INFO: renamed from: vi1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$getOfflineState$2", m100430f = "HeartHealthInteractor.kt", m100431l = {159, 161, 162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lvi1/c;", "<anonymous>", "(Lbc3/c0;)Lvi1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f153946E;

        /* JADX INFO: renamed from: F */
        int f153947F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f153948G;

        /* JADX INFO: renamed from: w */
        Object f153950w;

        /* JADX INFO: renamed from: x */
        Object f153951x;

        /* JADX INFO: renamed from: y */
        Object f153952y;

        /* JADX INFO: renamed from: z */
        Object f153953z;

        /* JADX INFO: renamed from: vi1.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$getOfflineState$2$labradorOnboardingCompletedDeferred$1", m100430f = "HeartHealthInteractor.kt", m100431l = {142}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f153954w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36061d f153955x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C36061d c36061d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f153955x = c36061d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153955x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean zBooleanValue;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153954w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        OnboardingStatusDao onboardingStatusDao = this.f153955x.onboardingStatusDao;
                        FeatureEducationType featureEducationType = FeatureEducationType.ECG_EDUCATION;
                        this.f153954w = 1;
                        obj = onboardingStatusDao.isCompleted(featureEducationType, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } catch (Exception e5) {
                    AbstractC3006f0.m8721o(getContext());
                    this.f153955x.logger.mo85218i("failed to determine if education completed for offline state", e5, new AbstractC30556a.a[0]);
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }

        /* JADX INFO: renamed from: vi1.d$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$getOfflineState$2$shepherdOnboardingCompletedDeferred$1", m100430f = "HeartHealthInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f153956w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36061d f153957x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C36061d c36061d, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f153957x = c36061d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f153957x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean zBooleanValue;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153956w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        OnboardingStatusDao onboardingStatusDao = this.f153957x.onboardingStatusDao;
                        FeatureEducationType featureEducationType = FeatureEducationType.ARRHYTHMIA_EDUCATION;
                        this.f153956w = 1;
                        obj = onboardingStatusDao.isCompleted(featureEducationType, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } catch (Exception e5) {
                    AbstractC3006f0.m8721o(getContext());
                    this.f153957x.logger.mo85218i("failed to determine if education completed for 2nd offline state", e5, new AbstractC30556a.a[0]);
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C36061d.this.new c(interfaceC30057d);
            cVar.f153948G = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC36060c> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
        
            if (r11 == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vi1.C36061d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vi1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HeartHealthInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153958w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153959x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153960y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36061d f153961z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C36061d c36061d) {
            super(3, interfaceC30057d);
            this.f153961z = c36061d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC36059b interfaceC36059b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f153961z);
            dVar.f153959x = interfaceC13062m;
            dVar.f153960y = interfaceC36059b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153958w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153959x;
                if (!AbstractC22676k.m65745e((InterfaceC36059b) this.f153960y, InterfaceC36059b.a.f153924a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM114500s = this.f153961z.m114500s();
                this.f153959x = null;
                this.f153960y = null;
                this.f153958w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM114500s, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC36059b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vi1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$loadBffData$$inlined$cacheAPI$1", m100430f = "HeartHealthInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153962w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153963x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153964y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f153965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f153965z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f153965z);
            eVar.f153963x = interfaceC13062m;
            eVar.f153964y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153962w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153963x;
                C26832c c26832c = (C26832c) this.f153964y;
                InterfaceC26834e interfaceC26834e = this.f153965z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HeartHealthBffModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HeartHealthBffModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f153963x = null;
                this.f153964y = null;
                this.f153962w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vi1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153966w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36061d f153967x;

        /* JADX INFO: renamed from: vi1.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153968w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36061d f153969x;

            /* JADX INFO: renamed from: vi1.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$loadBffData$$inlined$map$1$2", m100430f = "HeartHealthInteractor.kt", m100431l = {55, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42544a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f153970E;

                /* JADX INFO: renamed from: F */
                Object f153971F;

                /* JADX INFO: renamed from: G */
                Object f153972G;

                /* JADX INFO: renamed from: H */
                Object f153973H;

                /* JADX INFO: renamed from: I */
                Object f153974I;

                /* JADX INFO: renamed from: J */
                Object f153975J;

                /* JADX INFO: renamed from: K */
                int f153976K;

                /* JADX INFO: renamed from: L */
                int f153977L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153978w;

                /* JADX INFO: renamed from: x */
                int f153979x;

                /* JADX INFO: renamed from: y */
                Object f153980y;

                public C42544a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153978w = obj;
                    this.f153979x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36061d c36061d) {
                this.f153968w = interfaceC13062m;
                this.f153969x = c36061d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L35;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vi1.C36061d.f.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public f(InterfaceC13058l interfaceC13058l, C36061d c36061d) {
            this.f153966w = interfaceC13058l;
            this.f153967x = c36061d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153966w.collect(new a(interfaceC13062m, this.f153967x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vi1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153982w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36061d f153983x;

        /* JADX INFO: renamed from: vi1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153984w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36061d f153985x;

            /* JADX INFO: renamed from: vi1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$loadBffData$$inlined$map$2$2", m100430f = "HeartHealthInteractor.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42545a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f153986E;

                /* JADX INFO: renamed from: F */
                Object f153987F;

                /* JADX INFO: renamed from: G */
                Object f153988G;

                /* JADX INFO: renamed from: H */
                Object f153989H;

                /* JADX INFO: renamed from: I */
                Object f153990I;

                /* JADX INFO: renamed from: J */
                Object f153991J;

                /* JADX INFO: renamed from: K */
                int f153992K;

                /* JADX INFO: renamed from: L */
                int f153993L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153994w;

                /* JADX INFO: renamed from: x */
                int f153995x;

                /* JADX INFO: renamed from: y */
                Object f153996y;

                public C42545a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153994w = obj;
                    this.f153995x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36061d c36061d) {
                this.f153984w = interfaceC13062m;
                this.f153985x = c36061d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L25;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vi1.C36061d.g.a.C42545a
                    if (r0 == 0) goto L13
                    r0 = r9
                    vi1.d$g$a$a r0 = (vi1.C36061d.g.a.C42545a) r0
                    int r1 = r0.f153995x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f153995x = r1
                    goto L18
                L13:
                    vi1.d$g$a$a r0 = new vi1.d$g$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f153994w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f153995x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f153988G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f153986E
                    vi1.d$g$a$a r8 = (vi1.C36061d.g.a.C42545a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L9e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f153992K
                    java.lang.Object r2 = r0.f153991J
                    vi1.c r2 = (vi1.InterfaceC36060c) r2
                    java.lang.Object r2 = r0.f153990I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f153989H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f153988G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f153986E
                    vi1.d$g$a$a r4 = (vi1.C36061d.g.a.C42545a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L81
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f153984w
                    vi1.c r8 = (vi1.InterfaceC36060c) r8
                    boolean r9 = r8 instanceof vi1.InterfaceC36060c.c
                    r6 = 0
                    if (r9 == 0) goto L85
                    vi1.d r9 = r7.f153985x
                    vi1.c$c r8 = (vi1.InterfaceC36060c.c) r8
                    r0.f153996y = r5
                    r0.f153986E = r5
                    r0.f153987F = r5
                    r0.f153988G = r5
                    r0.f153989H = r2
                    r0.f153990I = r5
                    r0.f153991J = r5
                    r0.f153992K = r6
                    r0.f153993L = r6
                    r0.f153995x = r4
                    java.lang.Object r9 = vi1.C36061d.m114488c(r9, r8, r0)
                    if (r9 != r1) goto L80
                    goto L9d
                L80:
                    r8 = r6
                L81:
                    vi1.c r9 = (vi1.InterfaceC36060c) r9
                    r6 = r8
                    r8 = r9
                L85:
                    r0.f153996y = r5
                    r0.f153986E = r5
                    r0.f153987F = r5
                    r0.f153988G = r5
                    r0.f153989H = r5
                    r0.f153990I = r5
                    r0.f153991J = r5
                    r0.f153992K = r6
                    r0.f153995x = r3
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto L9e
                L9d:
                    return r1
                L9e:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vi1.C36061d.g.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public g(InterfaceC13058l interfaceC13058l, C36061d c36061d) {
            this.f153982w = interfaceC13058l;
            this.f153983x = c36061d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153982w.collect(new a(interfaceC13062m, this.f153983x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vi1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor", m100430f = "HeartHealthInteractor.kt", m100431l = {209}, m100432m = "offlineLabradorEnabledCardModel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f153998w;

        /* JADX INFO: renamed from: y */
        int f154000y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153998w = obj;
            this.f154000y |= Integer.MIN_VALUE;
            return C36061d.this.m114501t(this);
        }
    }

    public C36061d(InterfaceC26834e cachedApiSource, OnboardingStatusDao onboardingStatusDao, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, InterfaceC30444b dao, ZoneId zone, Clock clock) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(zone, "zone");
        AbstractC22676k.m65750j(clock, "clock");
        this.cachedApiSource = cachedApiSource;
        this.onboardingStatusDao = onboardingStatusDao;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.dao = dao;
        this.zone = zone;
        this.clock = clock;
        LabradorEnabledCardModel labradorEnabledCardModel = new LabradorEnabledCardModel(new SamdCardHeaderModel(AbstractC8693b.m21277k(AbstractC33852d.f141772e), (String) null, (String) null, new C9598e(AppScreen.C9347k3.f27721w, LabradorResultsModel.INSTANCE, null, 4, null), 6, (DefaultConstructorMarker) null), true, AbstractC37056f.m118958J(new CtaTileModel((TextResource) AbstractC8693b.m21277k(AbstractC33852d.f141783p), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, new C9598e(AppScreen.C9331i3.f27672w, new LabradorReadingModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), 32766, (DefaultConstructorMarker) null)));
        this.offlineLabradorEnabledCardModel = labradorEnabledCardModel;
        ShepherdDetectionModel shepherdDetectionModel = new ShepherdDetectionModel((SamdCardHeaderModel) null, (String) null, AbstractC37056f.m118958J(new ShepherdTileModel(new ShepherdMenuItemModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, 1023, (DefaultConstructorMarker) null), EnumC39580n.ErrorConnection.getKey())), (Long) null, (Long) null, 27, (DefaultConstructorMarker) null);
        this.offlineShepherdErrorModel = shepherdDetectionModel;
        this.offlineDividerModel = new HorizontalDividerModel("INACTIVE");
        this.offlineModel = new HeartHealthBffModel(AbstractC37056f.m118959K(labradorEnabledCardModel, shepherdDetectionModel));
        this.dataBehindTileModel = new ShepherdTileModel(new ShepherdMenuItemModel(AbstractC8693b.m21277k(AbstractC33852d.f141768a), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, 1022, (DefaultConstructorMarker) null), EnumC39580n.RecentlyActivated.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public final Object m114496k(InterfaceC36060c.c cVar, InterfaceC30057d<? super InterfaceC36060c.c> interfaceC30057d) {
        b bVar;
        InterfaceC36060c.c cVar2;
        InterfaceC36060c.c cVar3;
        C30443a c30443a;
        DateTime dateTime;
        DateTime dateTime2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f153945z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f153945z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo93126b = bVar.f153943x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f153945z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            try {
                InterfaceC30444b interfaceC30444b = this.dao;
                cVar2 = cVar;
                try {
                    bVar.f153942w = cVar2;
                    bVar.f153945z = 1;
                    objMo93126b = interfaceC30444b.mo93126b(bVar);
                    if (objMo93126b == enumC31071a) {
                        return enumC31071a;
                    }
                    cVar3 = cVar2;
                } catch (SQLiteException e5) {
                    e = e5;
                    this.logger.mo85230v("failed to read latest reading from disk", e, new AbstractC30556a.a[0]);
                    cVar3 = cVar2;
                    c30443a = null;
                }
            } catch (SQLiteException e13) {
                e = e13;
                cVar2 = cVar;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar3 = (InterfaceC36060c.c) bVar.f153942w;
            try {
                AbstractC34132o.m107864I(objMo93126b);
            } catch (SQLiteException e14) {
                e = e14;
                cVar2 = cVar3;
                this.logger.mo85230v("failed to read latest reading from disk", e, new AbstractC30556a.a[0]);
                cVar3 = cVar2;
                c30443a = null;
            }
        }
        c30443a = (C30443a) objMo93126b;
        if (c30443a == null) {
            return cVar3;
        }
        LabradorResultModel labradorResultModelM114504l = m114504l(c30443a);
        List<DesignSystemModel> items = cVar3.getBffData().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (Object objCopy$default : items) {
            if (objCopy$default instanceof LabradorEnabledCardModel) {
                LabradorEnabledCardModel labradorEnabledCardModel = (LabradorEnabledCardModel) objCopy$default;
                List<DesignSystemModel> items2 = labradorEnabledCardModel.getItems();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items2, 10));
                for (DesignSystemModel designSystemModel : items2) {
                    if (designSystemModel instanceof LabradorResultModel) {
                        LabradorResultModel labradorResultModel = (LabradorResultModel) designSystemModel;
                        if (labradorResultModel.getSamples() != null) {
                            String trailingTimestamp = labradorResultModelM114504l.getTrailingTimestamp();
                            long millis = Long.MAX_VALUE;
                            long millis2 = (trailingTimestamp == null || (dateTime2 = DateTime.parse(trailingTimestamp)) == null) ? Long.MAX_VALUE : dateTime2.getMillis();
                            String trailingTimestamp2 = labradorResultModel.getTrailingTimestamp();
                            if (trailingTimestamp2 != null && (dateTime = DateTime.parse(trailingTimestamp2)) != null) {
                                millis = dateTime.getMillis();
                            }
                            if (millis2 > millis) {
                                designSystemModel = labradorResultModelM114504l;
                            }
                            z4 = false;
                        }
                    }
                    arrayList2.add(designSystemModel);
                }
                if (z4) {
                    arrayList2 = AbstractC25265s.m74128f1(labradorResultModelM114504l, arrayList2);
                }
                objCopy$default = LabradorEnabledCardModel.copy$default(labradorEnabledCardModel, null, false, arrayList2, 3, null);
            }
            arrayList.add(objCopy$default);
        }
        InterfaceC36060c.c cVarM114484b = InterfaceC36060c.c.m114484b(cVar3, cVar3.getBffData().copy(arrayList), false, 2, null);
        return cVarM114484b == null ? cVar3 : cVarM114484b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m114497o(InterfaceC30057d<? super InterfaceC36060c> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new c(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    private final List<ShepherdReadingModel> m114498p(List<C32573b> determinations) {
        List<C32573b> list = determinations;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C32573b c32573b : list) {
            arrayList.add(new ShepherdReadingModel(c32573b.getTitle(), c32573b.getTrendType()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    private final EnumC17727b2 m114499r(EnumC31496c state) {
        int i13 = a.f153941a[state.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? EnumC17727b2.CONCERN_RANGE : EnumC17727b2.NEUTRAL;
        }
        return EnumC17727b2.POSITIVE_RANGE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC13058l m114500s() {
        return new g(new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new HeartHealthBffRequest(), 1), AbstractC25260n.m74059b1(new String[]{"labradorrefreshscope", "shepherdrefreshscope"}), null, 2, null), new e(null, this.cachedApiSource)), this), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: t */
    public final Object m114501t(InterfaceC30057d<? super LabradorEnabledCardModel> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f154000y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f154000y = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objMo93126b = hVar.f153998w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f154000y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            InterfaceC30444b interfaceC30444b = this.dao;
            hVar.f154000y = 1;
            objMo93126b = interfaceC30444b.mo93126b(hVar);
            if (objMo93126b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo93126b);
        }
        C30443a c30443a = (C30443a) objMo93126b;
        return c30443a != null ? new LabradorEnabledCardModel(new SamdCardHeaderModel(AbstractC8693b.m21277k(AbstractC33852d.f141772e), (String) null, (String) null, new C9598e(AppScreen.C9347k3.f27721w, LabradorResultsModel.INSTANCE, null, 4, null), 6, (DefaultConstructorMarker) null), false, AbstractC37056f.m118959K(new CtaTileModel((TextResource) AbstractC8693b.m21277k(AbstractC33852d.f141783p), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, new C9598e(AppScreen.C9331i3.f27672w, new LabradorReadingModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), 32766, (DefaultConstructorMarker) null), m114504l(c30443a)), 2, (DefaultConstructorMarker) null) : this.offlineLabradorEnabledCardModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final HeartHealthBffModel m114502u(HeartHealthBffModel cached) {
        List<DesignSystemModel> items = cached.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (Object objCopy$default : items) {
            if (objCopy$default instanceof LabradorEnabledCardModel) {
                LabradorEnabledCardModel labradorEnabledCardModel = (LabradorEnabledCardModel) objCopy$default;
                List<DesignSystemModel> items2 = labradorEnabledCardModel.getItems();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : items2) {
                    if (!(((DesignSystemModel) obj) instanceof ShepherdMenuItemModel)) {
                        arrayList2.add(obj);
                    }
                }
                objCopy$default = LabradorEnabledCardModel.copy$default(labradorEnabledCardModel, null, false, arrayList2, 3, null);
            }
            arrayList.add(objCopy$default);
        }
        return cached.copy(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final HeartHealthBffModel m114503v(HeartHealthBffModel cached) {
        List<DesignSystemModel> items = cached.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (Object objCopy$default : items) {
            if (objCopy$default instanceof ShepherdDetectionModel) {
                ShepherdDetectionModel shepherdDetectionModel = (ShepherdDetectionModel) objCopy$default;
                Long latestProcessedTimestamp = shepherdDetectionModel.getLatestProcessedTimestamp();
                if (latestProcessedTimestamp == null || this.dateAndTimeProvider.mo133363b() <= latestProcessedTimestamp.longValue() + DurationKt.MILLIS_IN_DAY) {
                    objCopy$default = shepherdDetectionModel;
                } else {
                    List<DesignSystemModel> items2 = shepherdDetectionModel.getItems();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : items2) {
                        DesignSystemModel designSystemModel = (DesignSystemModel) obj;
                        if (designSystemModel instanceof ShepherdTileModel) {
                            ShepherdTileModel shepherdTileModel = (ShepherdTileModel) designSystemModel;
                            if (AbstractC22676k.m65745e(shepherdTileModel.getAfibState(), "NOT_DETECTED") || AbstractC22676k.m65745e(shepherdTileModel.getAfibState(), "POSSIBLE_AFIB_DETECTED")) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                    objCopy$default = ShepherdDetectionModel.copy$default(shepherdDetectionModel, null, null, AbstractC25265s.m74129g1(AbstractC37056f.m118958J(this.dataBehindTileModel), arrayList2), null, null, 27, null);
                }
            }
            arrayList.add(objCopy$default);
        }
        return cached.copy(arrayList);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new d(null, this));
    }

    /* JADX INFO: renamed from: l */
    public final LabradorResultModel m114504l(C30443a reading) {
        AbstractC22676k.m65750j(reading, "reading");
        List<List> listM74156w1 = AbstractC25265s.m74156w1(reading.m93121g(), reading.m93121g().size() / 3);
        ArrayList arrayList = new ArrayList();
        for (List list : listM74156w1) {
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) it.next()).intValue()));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        EnumC31496c enumC31496cM97036a = EnumC31496c.INSTANCE.m97036a(reading.getClassification());
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC33852d.f141771d);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(reading.getTimestamp());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
        return new LabradorResultModel(c8688bM21277k, m114507q(instantOfEpochMilli), m114499r(enumC31496cM97036a), "CARET_FORWARD", new C9598e(AppScreen.C9307f3.f27598w, new LabradorDetailsScreenModel(""), null, 4, null), arrayList, m114498p(enumC31496cM97036a.getDeterminations()), OffsetDateTime.ofInstant(Instant.ofEpochMilli(reading.getTimestamp()), this.zone).toString());
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final HorizontalDividerModel getOfflineDividerModel() {
        return this.offlineDividerModel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ShepherdDetectionModel getOfflineShepherdErrorModel() {
        return this.offlineShepherdErrorModel;
    }

    /* JADX INFO: renamed from: q */
    public final TextResource.C8689c m114507q(Instant timestamp) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        int iBetween = (int) ChronoUnit.MINUTES.between(timestamp, Instant.now(this.clock));
        int minutes = (int) ChronoUnit.DAYS.getDuration().toMinutes();
        if (iBetween >= minutes) {
            int i13 = iBetween / minutes;
            return new TextResource.C8689c(AbstractC33851c.f141765a, i13, AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(Integer.valueOf(i13))));
        }
        if (iBetween < 60) {
            return new TextResource.C8689c(AbstractC33851c.f141767c, iBetween, AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(Integer.valueOf(iBetween))));
        }
        int i14 = iBetween / 60;
        return new TextResource.C8689c(AbstractC33851c.f141766b, i14, AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(Integer.valueOf(i14))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36061d(InterfaceC26834e interfaceC26834e, OnboardingStatusDao onboardingStatusDao, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, InterfaceC30444b interfaceC30444b, ZoneId zoneId, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HeartHealthTab") : interfaceC34116n;
        if ((i13 & 32) != 0) {
            zoneId = ZoneId.systemDefault();
            AbstractC22676k.m65749i(zoneId, "systemDefault(...)");
        }
        this(interfaceC26834e, onboardingStatusDao, interfaceC41070a, interfaceC34116nM107848a, interfaceC30444b, zoneId, clock);
    }
}
