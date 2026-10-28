package vl2;

import bc3.InterfaceC2994c0;
import bm2.AbstractC3436e0;
import bm2.C3439f0;
import c93.InterfaceC4351m;
import cm2.EnumC4821i;
import cm2.EnumC4822j;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.IntegrationsUpsellDtoV3;
import com.whoop.trends.data.model.ManualMeasurementRequestBody;
import com.whoop.trends.data.model.ManualMeasurementSheet;
import com.whoop.trends.data.model.MeasurementRecord;
import com.whoop.trends.data.model.MeasurementSection;
import com.whoop.trends.data.model.MetricEducationV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.Sections;
import com.whoop.trends.data.model.SegmentControllerDtoV3;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TrendMenuItemModel;
import com.whoop.trends.data.model.TrendsDtoV3;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import com.whoop.trends.data.model.Vo2ManualMeasurementRequest;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.InterfaceC25237b0;
import or2.AbstractC28190p0;
import or2.C28204u;
import or2.EnumC28166h0;
import org.joda.time.DateTimeZone;
import p322m7.C25147g1;
import p322m7.C25149h0;
import p336n7.C26413c;
import p452r7.C31003b0;
import p452r7.C31038t;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.InterfaceC34385a;
import ul2.C35068a;
import ul2.C35070c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vl2.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001MB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b%\u0010&J(\u0010(\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b.\u0010-J\u0018\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b0\u00101J(\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b3\u00104J \u00105\u001a\u00020\r2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b7\u00108J(\u00109\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b9\u00108J(\u0010:\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b:\u00108J(\u0010=\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b=\u0010>J(\u0010?\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020@2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010I\u001a\u00020H*\u00020;H\u0002¢\u0006\u0004\bI\u0010JJ \u0010L\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\bL\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, m65681d2 = {"Lvl2/u;", "", "Lul2/c;", "repository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lul2/a;", "googleHealthConnectHelper", "<init>", "(Lul2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lul2/a;)V", "Lec3/l;", "Lvl2/s;", "upstream", "Lvl2/t;", "H", "(Lec3/l;)Lec3/l;", "Lcom/whoop/trends/data/model/TrendsDtoV3;", "data", "Lor2/h0;", "graphKey", "previousState", "", "showIntegrationsUpsell", "recordedDataError", "successDeleteMeasurement", "Lvl2/t$c;", "u", "(Lcom/whoop/trends/data/model/TrendsDtoV3;Lor2/h0;Lvl2/t;ZZZ)Lvl2/t$c;", "", "todayDateTime", "sendTileProperties", "C", "(Lor2/h0;Ljava/lang/String;Lvl2/t;ZZZLq83/d;)Ljava/lang/Object;", "E", "(Lor2/h0;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "Lcm2/i;", "measurementId", "F", "(Lcm2/i;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "nextToken", "B", "(Lor2/h0;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "Lbm2/f0;", "body", "q", "(Lbm2/f0;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "s", "Ll83/a0;", "r", "(Lbm2/f0;Lq83/d;)Ljava/lang/Object;", "id", "K", "(Ljava/lang/String;Lbm2/f0;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "y", "(Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "v", "(Lcm2/i;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "Lvl2/a0;", "vo2ManualMeasurement", "t", "(Lcm2/i;Lvl2/a0;Lvl2/t;Lq83/d;)Ljava/lang/Object;", "A", "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "G", "(Lbm2/f0;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "Lcom/whoop/trends/data/model/Sections;", "oldSections", "newSections", "I", "(Lcom/whoop/trends/data/model/Sections;Lcom/whoop/trends/data/model/Sections;)Lcom/whoop/trends/data/model/Sections;", "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "J", "(Lvl2/a0;)Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "componentId", "z", "a", "Lul2/c;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lul2/a;", "d", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36128u {

    /* JADX INFO: renamed from: e */
    public static final int f154472e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35070c repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35068a googleHealthConnectHelper;

    /* JADX INFO: renamed from: vl2.u$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {210, 214}, m100432m = "addManualMeasurement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f154476E;

        /* JADX INFO: renamed from: G */
        int f154478G;

        /* JADX INFO: renamed from: w */
        Object f154479w;

        /* JADX INFO: renamed from: x */
        Object f154480x;

        /* JADX INFO: renamed from: y */
        Object f154481y;

        /* JADX INFO: renamed from: z */
        Object f154482z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154476E = obj;
            this.f154478G |= Integer.MIN_VALUE;
            return C36128u.this.m114883q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {224, 228, 230}, m100432m = "addManualWeightMeasurementAndRefresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f154483E;

        /* JADX INFO: renamed from: G */
        int f154485G;

        /* JADX INFO: renamed from: w */
        Object f154486w;

        /* JADX INFO: renamed from: x */
        Object f154487x;

        /* JADX INFO: renamed from: y */
        Object f154488y;

        /* JADX INFO: renamed from: z */
        Object f154489z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154483E = obj;
            this.f154485G |= Integer.MIN_VALUE;
            return C36128u.this.m114885s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {312, 315}, m100432m = "addMenuSheetManualMeasurement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f154490E;

        /* JADX INFO: renamed from: G */
        int f154492G;

        /* JADX INFO: renamed from: w */
        Object f154493w;

        /* JADX INFO: renamed from: x */
        Object f154494x;

        /* JADX INFO: renamed from: y */
        Object f154495y;

        /* JADX INFO: renamed from: z */
        Object f154496z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154490E = obj;
            this.f154492G |= Integer.MIN_VALUE;
            return C36128u.this.m114886t(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {290}, m100432m = "deleteMeasurementReportLegacy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f154498F;

        /* JADX INFO: renamed from: w */
        Object f154499w;

        /* JADX INFO: renamed from: x */
        Object f154500x;

        /* JADX INFO: renamed from: y */
        Object f154501y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f154502z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154502z = obj;
            this.f154498F |= Integer.MIN_VALUE;
            return C36128u.this.m114889w(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {300}, m100432m = "deleteMeasurementReportWithStates", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f154504F;

        /* JADX INFO: renamed from: w */
        Object f154505w;

        /* JADX INFO: renamed from: x */
        Object f154506x;

        /* JADX INFO: renamed from: y */
        Object f154507y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f154508z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154508z = obj;
            this.f154504F |= Integer.MIN_VALUE;
            return C36128u.this.m114890x(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor$deleteMeasurementReportWithStates$response$1", m100430f = "TrendsApiInteractor.kt", m100431l = {301}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154509w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f154511y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f154512z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC4821i enumC4821i, String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154511y = enumC4821i;
            this.f154512z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36128u.this.new g(this.f154511y, this.f154512z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154509w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C35070c c35070c = C36128u.this.repository;
            EnumC4821i enumC4821i = this.f154511y;
            String str = this.f154512z;
            this.f154509w = 1;
            Object objM110907h = c35070c.m110907h(enumC4821i, str, this);
            return objM110907h == enumC31071a ? enumC31071a : objM110907h;
        }
    }

    /* JADX INFO: renamed from: vl2.u$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {272}, m100432m = "deleteWeightMeasurement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154513E;

        /* JADX INFO: renamed from: w */
        Object f154514w;

        /* JADX INFO: renamed from: x */
        Object f154515x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154516y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154516y = obj;
            this.f154513E |= Integer.MIN_VALUE;
            return C36128u.this.m114891y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {367}, m100432m = "dismissComponent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154518E;

        /* JADX INFO: renamed from: w */
        Object f154519w;

        /* JADX INFO: renamed from: x */
        Object f154520x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154521y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154521y = obj;
            this.f154518E |= Integer.MIN_VALUE;
            return C36128u.this.m114892z(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {322, 325}, m100432m = "editMenuSheetManualMeasurement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f154523E;

        /* JADX INFO: renamed from: G */
        int f154525G;

        /* JADX INFO: renamed from: w */
        Object f154526w;

        /* JADX INFO: renamed from: x */
        Object f154527x;

        /* JADX INFO: renamed from: y */
        Object f154528y;

        /* JADX INFO: renamed from: z */
        Object f154529z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154523E = obj;
            this.f154525G |= Integer.MIN_VALUE;
            return C36128u.this.m114857A(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {193}, m100432m = "fetchPaginatedRecordedData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f154531F;

        /* JADX INFO: renamed from: w */
        Object f154532w;

        /* JADX INFO: renamed from: x */
        Object f154533x;

        /* JADX INFO: renamed from: y */
        Object f154534y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f154535z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154535z = obj;
            this.f154531F |= Integer.MIN_VALUE;
            return C36128u.this.m114858B(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {151, 154, 161}, m100432m = "fetchPillarsDataV3", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f154536E;

        /* JADX INFO: renamed from: F */
        boolean f154537F;

        /* JADX INFO: renamed from: G */
        boolean f154538G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f154539H;

        /* JADX INFO: renamed from: J */
        int f154541J;

        /* JADX INFO: renamed from: w */
        Object f154542w;

        /* JADX INFO: renamed from: x */
        Object f154543x;

        /* JADX INFO: renamed from: y */
        Object f154544y;

        /* JADX INFO: renamed from: z */
        Object f154545z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154539H = obj;
            this.f154541J |= Integer.MIN_VALUE;
            return C36128u.this.m114859C(null, null, null, false, false, false, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {173}, m100432m = "fetchRecordedData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154546E;

        /* JADX INFO: renamed from: w */
        Object f154547w;

        /* JADX INFO: renamed from: x */
        Object f154548x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154549y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154549y = obj;
            this.f154546E |= Integer.MIN_VALUE;
            return C36128u.this.m114861E(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {183}, m100432m = "fetchReportData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154551E;

        /* JADX INFO: renamed from: w */
        Object f154552w;

        /* JADX INFO: renamed from: x */
        Object f154553x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154554y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154554y = obj;
            this.f154551E |= Integer.MIN_VALUE;
            return C36128u.this.m114862F(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vl2.u$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor$interact$1", m100430f = "TrendsApiInteractor.kt", m100431l = {49, 53, 57, 61, 96, 97, 98, LogPriority.NONE, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 101, 102, 103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvl2/t;", "prevDomainState", "Lvl2/s;", "domainAction", "<anonymous>", "(Lvl2/t;Lvl2/s;)Lvl2/t;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f154556w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f154557x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154558y;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC36127t abstractC36127t, AbstractC36126s abstractC36126s, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) {
            o oVar = C36128u.this.new o(interfaceC30057d);
            oVar.f154557x = abstractC36127t;
            oVar.f154558y = abstractC36126s;
            return oVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x030b, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x032d, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x034f, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x036d, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0289, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x02a7, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02c5, code lost:
        
            if (r0 == r10) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x02e8, code lost:
        
            if (r0 == r10) goto L126;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r48) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 920
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vl2.C36128u.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vl2.u$p */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"vl2/u$p", "Lm83/b0;", "", "g", "()Ljava/util/Iterator;", "element", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC25237b0 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Iterable f154560w;

        public p(Iterable iterable) {
            this.f154560w = iterable;
        }

        @Override // m83.InterfaceC25237b0
        /* JADX INFO: renamed from: d */
        public String mo73982d(MeasurementSection element) {
            return element.getTitle();
        }

        @Override // m83.InterfaceC25237b0
        /* JADX INFO: renamed from: g */
        public Iterator<MeasurementSection> mo73983g() {
            return this.f154560w.iterator();
        }
    }

    /* JADX INFO: renamed from: vl2.u$q */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsApiInteractor", m100430f = "TrendsApiInteractor.kt", m100431l = {262}, m100432m = "updateManualMeasurement", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f154561E;

        /* JADX INFO: renamed from: G */
        int f154563G;

        /* JADX INFO: renamed from: w */
        Object f154564w;

        /* JADX INFO: renamed from: x */
        Object f154565x;

        /* JADX INFO: renamed from: y */
        Object f154566y;

        /* JADX INFO: renamed from: z */
        Object f154567z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154561E = obj;
            this.f154563G |= Integer.MIN_VALUE;
            return C36128u.this.m114866K(null, null, null, this);
        }
    }

    public C36128u(C35070c repository, FeatureFlagChecker ffChecker, C35068a googleHealthConnectHelper) {
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(googleHealthConnectHelper, "googleHealthConnectHelper");
        this.repository = repository;
        this.ffChecker = ffChecker;
        this.googleHealthConnectHelper = googleHealthConnectHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: A */
    public final Object m114857A(EnumC4821i enumC4821i, C36107a0 c36107a0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        j jVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f154525G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f154525G = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM110910k = jVar2.f154523E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar2.f154525G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110910k);
            C35070c c35070c = this.repository;
            Vo2ManualMeasurementRequest vo2ManualMeasurementRequestM114865J = m114865J(c36107a0);
            jVar2.f154526w = null;
            jVar2.f154527x = null;
            jVar2.f154528y = abstractC36127t;
            jVar2.f154525G = 1;
            objM110910k = c35070c.m110910k(enumC4821i, vo2ManualMeasurementRequestM114865J, jVar2);
            if (objM110910k != enumC31071a) {
                abstractC36127t2 = abstractC36127t;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM110910k);
            return objM110910k;
        }
        abstractC36127t2 = (AbstractC36127t) jVar2.f154528y;
        AbstractC34132o.m107864I(objM110910k);
        C29218v0 c29218v0 = (C29218v0) objM110910k;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        if (c29218v0 == null) {
            return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1074003969, 7, null);
        }
        EnumC28166h0 graphKey = cVar.getGraphKey();
        String string = LocalDate.now().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        jVar2.f154526w = null;
        jVar2.f154527x = null;
        jVar2.f154528y = null;
        jVar2.f154529z = null;
        jVar2.f154525G = 2;
        Object objM114860D = m114860D(this, graphKey, string, abstractC36127t2, false, false, true, jVar2, 24, null);
        return objM114860D == enumC31071a ? enumC31071a : objM114860D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: B */
    public final Object m114858B(EnumC28166h0 enumC28166h0, String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        k kVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f154531F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f154531F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object objM110912m = kVar.f154535z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar.f154531F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110912m);
            C35070c c35070c = this.repository;
            kVar.f154532w = null;
            kVar.f154533x = null;
            kVar.f154534y = abstractC36127t;
            kVar.f154531F = 1;
            objM110912m = c35070c.m110912m(enumC28166h0, str, kVar);
            if (objM110912m == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) kVar.f154534y;
            AbstractC34132o.m107864I(objM110912m);
        }
        Sections sections = (Sections) objM110912m;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        if (sections == null) {
            return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -524289, 7, null);
        }
        RecordedData recordedData = cVar.getRecordedData();
        Sections sectionsM114864I = recordedData != null ? m114864I(recordedData.getSections(), sections) : null;
        return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, sectionsM114864I != null ? RecordedData.copy$default(cVar.getRecordedData(), null, null, null, null, null, sectionsM114864I, 31, null) : null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -655361, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109 A[PHI: r19 r20 r21 r22 r24 r25
      0x0109: PHI (r19v2 vl2.u) = (r19v1 vl2.u), (r19v5 vl2.u) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r20v2 com.whoop.trends.data.model.TrendsDtoV3) = (r20v1 com.whoop.trends.data.model.TrendsDtoV3), (r20v5 com.whoop.trends.data.model.TrendsDtoV3) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r21v2 or2.h0) = (r21v1 or2.h0), (r21v5 or2.h0) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r22v2 vl2.t) = (r22v1 vl2.t), (r22v5 vl2.t) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r24v2 boolean) = (r24v1 boolean), (r24v5 boolean) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r25v2 boolean) = (r25v1 boolean), (r25v5 boolean) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x010c A[PHI: r19 r20 r21 r22 r24 r25
      0x010c: PHI (r19v4 vl2.u) = (r19v1 vl2.u), (r19v5 vl2.u) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r20v4 com.whoop.trends.data.model.TrendsDtoV3) = (r20v1 com.whoop.trends.data.model.TrendsDtoV3), (r20v5 com.whoop.trends.data.model.TrendsDtoV3) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r21v4 or2.h0) = (r21v1 or2.h0), (r21v5 or2.h0) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r22v4 vl2.t) = (r22v1 vl2.t), (r22v5 vl2.t) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r24v4 boolean) = (r24v1 boolean), (r24v5 boolean) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r25v4 boolean) = (r25v1 boolean), (r25v5 boolean) binds: [B:35:0x0107, B:43:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        if (r14.m110916q(r15, r3) == r4) goto L40;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m114859C(or2.EnumC28166h0 r19, java.lang.String r20, vl2.AbstractC36127t r21, boolean r22, boolean r23, boolean r24, q83.InterfaceC30057d<? super vl2.AbstractC36127t> r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C36128u.m114859C(or2.h0, java.lang.String, vl2.t, boolean, boolean, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Object m114860D(C36128u c36128u, EnumC28166h0 enumC28166h0, String str, AbstractC36127t abstractC36127t, boolean z4, boolean z13, boolean z14, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        if ((i13 & 32) != 0) {
            z14 = false;
        }
        return c36128u.m114859C(enumC28166h0, str, abstractC36127t, z4, z13, z14, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: E */
    public final Object m114861E(EnumC28166h0 enumC28166h0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        m mVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f154546E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f154546E = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object objM110913n = mVar.f154549y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f154546E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110913n);
            C35070c c35070c = this.repository;
            mVar.f154547w = null;
            mVar.f154548x = abstractC36127t;
            mVar.f154546E = 1;
            objM110913n = c35070c.m110913n(enumC28166h0, mVar);
            if (objM110913n == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) mVar.f154548x;
            AbstractC34132o.m107864I(objM110913n);
        }
        RecordedData recordedData = (RecordedData) objM110913n;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return recordedData != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recordedData, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1441793, 7, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: F */
    public final Object m114862F(EnumC4821i enumC4821i, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        n nVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f154551E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f154551E = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        Object objM110911l = nVar.f154554y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = nVar.f154551E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110911l);
            C35070c c35070c = this.repository;
            nVar.f154552w = null;
            nVar.f154553x = abstractC36127t;
            nVar.f154551E = 1;
            objM110911l = c35070c.m110911l(enumC4821i, nVar);
            if (objM110911l == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) nVar.f154553x;
            AbstractC34132o.m107864I(objM110911l);
        }
        MeasurementRecord measurementRecord = (MeasurementRecord) objM110911l;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return measurementRecord != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, measurementRecord, false, null, null, null, AbstractC36112e.d.f154376a, -1610874881, 3, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, AbstractC36112e.d.f154376a, -1074003969, 3, null);
    }

    /* JADX INFO: renamed from: G */
    private final ManualMeasurementRequestBody m114863G(C3439f0 body) {
        Double dValueOf;
        String string = body.getDateTime().toString("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        AbstractC22676k.m65747g(string);
        Double bodyFat = body.getBodyFat();
        EnumC4822j metricType = body.getMetricType();
        EnumC4822j enumC4822j = EnumC4822j.KG;
        if (metricType == enumC4822j) {
            dValueOf = body.getLeanBodyMass();
        } else {
            Double leanBodyMass = body.getLeanBodyMass();
            dValueOf = leanBodyMass != null ? Double.valueOf(AbstractC3436e0.m9972Y0(leanBodyMass.doubleValue())) : null;
        }
        return new ManualMeasurementRequestBody(string, body.getMetricType() == enumC4822j ? body.getWeight() : AbstractC3436e0.m9972Y0(body.getWeight()), bodyFat, dValueOf);
    }

    /* JADX INFO: renamed from: I */
    private final Sections m114864I(Sections oldSections, Sections newSections) {
        p pVar = new p(AbstractC25265s.m74129g1(oldSections.getRecords(), newSections.getRecords()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itMo73983g = pVar.mo73983g();
        while (itMo73983g.hasNext()) {
            Object next = itMo73983g.next();
            Object objMo73982d = pVar.mo73982d(next);
            Object arrayList = linkedHashMap.get(objMo73982d);
            if (arrayList == null && !linkedHashMap.containsKey(objMo73982d)) {
                arrayList = new ArrayList();
            }
            List list = (List) arrayList;
            AbstractC25265s.m74141p0(list, ((MeasurementSection) next).getMeasurements());
            linkedHashMap.put(objMo73982d, list);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new MeasurementSection((String) entry.getKey(), (List) entry.getValue()));
        }
        return new Sections(newSections.getNextToken(), arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.time.ZonedDateTime] */
    /* JADX INFO: renamed from: J */
    private final Vo2ManualMeasurementRequest m114865J(C36107a0 c36107a0) {
        String str = c36107a0.getScoreDateTime().atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        AbstractC22676k.m65747g(str);
        return new Vo2ManualMeasurementRequest(str, c36107a0.getVo2maxScore(), c36107a0.getSource(), c36107a0.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: K */
    public final Object m114866K(String str, C3439f0 c3439f0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        q qVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof q) {
            qVar = (q) interfaceC30057d;
            int i13 = qVar.f154563G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qVar.f154563G = i13 - Integer.MIN_VALUE;
            } else {
                qVar = new q(interfaceC30057d);
            }
        } else {
            qVar = new q(interfaceC30057d);
        }
        Object objM110915p = qVar.f154561E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = qVar.f154563G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110915p);
            ManualMeasurementRequestBody manualMeasurementRequestBodyM114863G = m114863G(c3439f0);
            C35070c c35070c = this.repository;
            qVar.f154564w = null;
            qVar.f154565x = null;
            qVar.f154566y = abstractC36127t;
            qVar.f154567z = null;
            qVar.f154563G = 1;
            objM110915p = c35070c.m110915p(str, manualMeasurementRequestBodyM114863G, qVar);
            if (objM110915p == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) qVar.f154566y;
            AbstractC34132o.m107864I(objM110915p);
        }
        C29218v0 c29218v0 = (C29218v0) objM110915p;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return c29218v0 != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1310721, 7, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: q */
    public final Object m114883q(C3439f0 c3439f0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        b bVar;
        C3439f0 c3439f1;
        AbstractC36127t abstractC36127t2;
        AbstractC36127t abstractC36127t3;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f154478G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f154478G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM110905f = bVar.f154476E;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f154478G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110905f);
            ManualMeasurementRequestBody manualMeasurementRequestBodyM114863G = m114863G(c3439f0);
            C35070c c35070c = this.repository;
            bVar.f154479w = c3439f0;
            bVar.f154480x = abstractC36127t;
            bVar.f154481y = null;
            bVar.f154478G = 1;
            objM110905f = c35070c.m110905f(manualMeasurementRequestBodyM114863G, bVar);
            if (objM110905f != obj) {
                c3439f1 = c3439f0;
                abstractC36127t2 = abstractC36127t;
            }
            return obj;
        }
        if (i14 == 1) {
            abstractC36127t2 = (AbstractC36127t) bVar.f154480x;
            c3439f1 = (C3439f0) bVar.f154479w;
            AbstractC34132o.m107864I(objM110905f);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t3 = (AbstractC36127t) bVar.f154480x;
            AbstractC34132o.m107864I(objM110905f);
        }
        abstractC36127t2 = abstractC36127t3;
        return AbstractC36127t.c.m114821b((AbstractC36127t.c) abstractC36127t2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
        C29218v0 c29218v0 = (C29218v0) objM110905f;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        if (c29218v0 == null) {
            return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
        }
        if (this.ffChecker.isFeatureEnabled("add_manual_measurement_health_connect")) {
            bVar.f154479w = null;
            bVar.f154480x = abstractC36127t2;
            bVar.f154481y = null;
            bVar.f154482z = null;
            bVar.f154478G = 2;
            if (m114884r(c3439f1, bVar) != obj) {
                abstractC36127t3 = abstractC36127t2;
                abstractC36127t2 = abstractC36127t3;
            }
            return obj;
        }
        return AbstractC36127t.c.m114821b((AbstractC36127t.c) abstractC36127t2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
    }

    /* JADX INFO: renamed from: r */
    private final Object m114884r(C3439f0 c3439f0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C31003b0 c31003b0M95568c;
        C25149h0 c25149h0;
        C31003b0 c31003b0M95568c2;
        EnumC4822j metricType = c3439f0.getMetricType();
        EnumC4822j enumC4822j = EnumC4822j.KG;
        if (metricType == enumC4822j) {
            C31038t c31038t = C31003b0.f127986y;
            c31003b0M95568c = C31038t.m95567b(c3439f0.getWeight());
        } else {
            C31038t c31038t2 = C31003b0.f127986y;
            c31003b0M95568c = C31038t.m95568c(c3439f0.getWeight());
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c3439f0.getDateTime().getMillis());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
        C28204u.Companion companion = C28204u.INSTANCE;
        DateTimeZone zone = c3439f0.getDateTime().getZone();
        AbstractC22676k.m65749i(zone, "getZone(...)");
        ZoneOffset zoneOffsetM85371n = companion.m85371n(zone);
        C26413c c26413c = C26413c.f104890h;
        C25147g1 c25147g1 = new C25147g1(instantOfEpochMilli, zoneOffsetM85371n, c31003b0M95568c, c26413c);
        if (c3439f0.getLeanBodyMass() != null) {
            if (c3439f0.getMetricType() == enumC4822j) {
                C31038t c31038t3 = C31003b0.f127986y;
                c31003b0M95568c2 = C31038t.m95567b(c3439f0.getLeanBodyMass().doubleValue());
            } else {
                C31038t c31038t4 = C31003b0.f127986y;
                c31003b0M95568c2 = C31038t.m95568c(c3439f0.getLeanBodyMass().doubleValue());
            }
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(c3439f0.getDateTime().getMillis());
            AbstractC22676k.m65749i(instantOfEpochMilli2, "ofEpochMilli(...)");
            DateTimeZone zone2 = c3439f0.getDateTime().getZone();
            AbstractC22676k.m65749i(zone2, "getZone(...)");
            c25149h0 = new C25149h0(instantOfEpochMilli2, companion.m85371n(zone2), c31003b0M95568c2, c26413c);
        } else {
            c25149h0 = null;
        }
        Object objM110903g = this.googleHealthConnectHelper.m110903g(c25149h0 != null ? AbstractC37056f.m118959K(c25147g1, c25149h0) : AbstractC37056f.m118958J(c25147g1), interfaceC30057d);
        return objM110903g == EnumC31071a.f128113w ? objM110903g : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[PHI: r4
      0x00b3: PHI (r4v4 vl2.t) = (r4v3 vl2.t), (r4v3 vl2.t), (r4v14 vl2.t) binds: [B:26:0x00a0, B:28:0x00b0, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: s */
    public final Object m114885s(C3439f0 c3439f0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        c cVar;
        C3439f0 c3439f1;
        AbstractC36127t abstractC36127t2;
        Object objM114861E;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f154485G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f154485G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM110905f = cVar.f154483E;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f154485G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110905f);
            ManualMeasurementRequestBody manualMeasurementRequestBodyM114863G = m114863G(c3439f0);
            C35070c c35070c = this.repository;
            cVar.f154486w = c3439f0;
            cVar.f154487x = abstractC36127t;
            cVar.f154488y = null;
            cVar.f154485G = 1;
            objM110905f = c35070c.m110905f(manualMeasurementRequestBodyM114863G, cVar);
            if (objM110905f != obj) {
                c3439f1 = c3439f0;
                abstractC36127t2 = abstractC36127t;
            }
            return obj;
        }
        if (i14 == 1) {
            abstractC36127t2 = (AbstractC36127t) cVar.f154487x;
            c3439f1 = (C3439f0) cVar.f154486w;
            AbstractC34132o.m107864I(objM110905f);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM110905f);
                return objM110905f;
            }
            abstractC36127t2 = (AbstractC36127t) cVar.f154487x;
            AbstractC34132o.m107864I(objM110905f);
        }
        EnumC28166h0 enumC28166h0 = EnumC28166h0.WEIGHT;
        cVar.f154486w = null;
        cVar.f154487x = null;
        cVar.f154488y = null;
        cVar.f154489z = null;
        cVar.f154485G = 3;
        objM114861E = m114861E(enumC28166h0, abstractC36127t2, cVar);
        if (objM114861E == obj) {
            return obj;
        }
        return objM114861E;
        C29218v0 c29218v0 = (C29218v0) objM110905f;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar2 = (AbstractC36127t.c) abstractC36127t2;
        if (c29218v0 == null) {
            return AbstractC36127t.c.m114821b(cVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
        }
        if (this.ffChecker.isFeatureEnabled("add_manual_measurement_health_connect")) {
            cVar.f154486w = null;
            cVar.f154487x = abstractC36127t2;
            cVar.f154488y = null;
            cVar.f154489z = null;
            cVar.f154485G = 2;
            if (m114884r(c3439f1, cVar) != obj) {
                EnumC28166h0 enumC28166h1 = EnumC28166h0.WEIGHT;
                cVar.f154486w = null;
                cVar.f154487x = null;
                cVar.f154488y = null;
                cVar.f154489z = null;
                cVar.f154485G = 3;
                objM114861E = m114861E(enumC28166h1, abstractC36127t2, cVar);
                if (objM114861E == obj) {
                    return objM114861E;
                }
            }
        } else {
            EnumC28166h0 enumC28166h2 = EnumC28166h0.WEIGHT;
            cVar.f154486w = null;
            cVar.f154487x = null;
            cVar.f154488y = null;
            cVar.f154489z = null;
            cVar.f154485G = 3;
            objM114861E = m114861E(enumC28166h2, abstractC36127t2, cVar);
            if (objM114861E == obj) {
                return objM114861E;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: t */
    public final Object m114886t(EnumC4821i enumC4821i, C36107a0 c36107a0, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        d dVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f154492G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f154492G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM110906g = dVar2.f154490E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f154492G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110906g);
            C35070c c35070c = this.repository;
            Vo2ManualMeasurementRequest vo2ManualMeasurementRequestM114865J = m114865J(c36107a0);
            dVar2.f154493w = null;
            dVar2.f154494x = null;
            dVar2.f154495y = abstractC36127t;
            dVar2.f154492G = 1;
            objM110906g = c35070c.m110906g(enumC4821i, vo2ManualMeasurementRequestM114865J, dVar2);
            if (objM110906g != enumC31071a) {
                abstractC36127t2 = abstractC36127t;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM110906g);
            return objM110906g;
        }
        abstractC36127t2 = (AbstractC36127t) dVar2.f154495y;
        AbstractC34132o.m107864I(objM110906g);
        C29218v0 c29218v0 = (C29218v0) objM110906g;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        if (c29218v0 == null) {
            return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1074003969, 7, null);
        }
        EnumC28166h0 graphKey = cVar.getGraphKey();
        String string = LocalDate.now().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        dVar2.f154493w = null;
        dVar2.f154494x = null;
        dVar2.f154495y = null;
        dVar2.f154496z = null;
        dVar2.f154492G = 2;
        Object objM114860D = m114860D(this, graphKey, string, abstractC36127t2, false, false, true, dVar2, 24, null);
        return objM114860D == enumC31071a ? enumC31071a : objM114860D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private final AbstractC36127t.c m114887u(TrendsDtoV3 data, EnumC28166h0 graphKey, AbstractC36127t previousState, boolean showIntegrationsUpsell, boolean recordedDataError, boolean successDeleteMeasurement) {
        IntegrationsUpsellDtoV3 integrationsUpsell;
        AbstractC36127t.c cVar;
        AbstractC36127t.c cVar2;
        EnumC4821i measurementId;
        AbstractC36127t.c cVar3;
        String title = data.getTitle();
        SegmentControllerDtoV3 segmentController = data.getSegmentController();
        String noDataGraphText = data.getNoDataGraphText();
        String noDataGraphSubText = data.getNoDataGraphSubText();
        MetricEducationV3 metricEducation = data.getMetricEducation();
        TimeSegmentDtoV3 weekTimeSegment = data.getWeekTimeSegment();
        TimeSegmentDtoV3 monthTimeSegment = data.getMonthTimeSegment();
        TimeSegmentDtoV3 sixMonthTimeSegment = data.getSixMonthTimeSegment();
        TimeSegmentDtoV3 allTimeSegment = data.getAllTimeSegment();
        List<NavigationSectionV3> navigationSections = data.getNavigationSections();
        String infoCalloutDisplay = data.getInfoCalloutDisplay();
        ArticleTileCarouselModel educationCarouselModel = this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL) ? data.getEducationCarouselModel() : null;
        if (showIntegrationsUpsell) {
            integrationsUpsell = data.getIntegrationsUpsell();
            cVar = null;
        } else {
            integrationsUpsell = null;
            cVar = null;
        }
        TrendsMenuItemDtoV3 manualMeasurementItem = data.getManualMeasurementItem();
        ArticleTileCarouselModel articleTileCarouselModel = educationCarouselModel;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = integrationsUpsell;
        TrendsMenuItemDtoV3 seeAllDataItem = data.getSeeAllDataItem();
        MeasurementRecord measurementRecord = cVar;
        ManualMeasurementSheet manualMeasurementSheet = data.getManualMeasurementSheet();
        boolean z4 = previousState instanceof AbstractC36127t.c;
        AbstractC36127t.c cVar4 = z4 ? (AbstractC36127t.c) previousState : measurementRecord;
        RecordedData recordedData = cVar4 != null ? cVar4.getRecordedData() : measurementRecord;
        TextWithIllustrationCardModel upsellCard = data.getUpsellCard();
        List<MenuItemModel> trendMenuList = data.getTrendMenuList();
        CardioFitnessLevelModel cardioFitnessLevel = data.getCardioFitnessLevel();
        List<MetricEducationV3> metricEducationList = data.getMetricEducationList();
        List<InfoCalloutTileModel> infoCalloutList = data.getInfoCalloutList();
        String manualMeasurementTextDisplay = data.getManualMeasurementTextDisplay();
        List<TrendMenuItemModel> trendMenus = data.getTrendMenus();
        AdditionalInfoTextModel additionalInfoText = data.getAdditionalInfoText();
        AbstractC36127t.c cVar5 = z4 ? (AbstractC36127t.c) previousState : measurementRecord;
        MeasurementRecord measurementRecord2 = cVar5 != null ? cVar5.getMeasurementRecord() : measurementRecord;
        if (z4) {
            cVar3 = (AbstractC36127t.c) previousState;
        } else {
            cVar2 = measurementRecord;
        }
        if (cVar2 != 0) {
            cVar2 = cVar3;
            measurementId = cVar2.getMeasurementId();
        } else {
            cVar2 = cVar3;
            measurementId = measurementRecord;
        }
        return new AbstractC36127t.c(title, segmentController, noDataGraphText, noDataGraphSubText, metricEducation, weekTimeSegment, monthTimeSegment, sixMonthTimeSegment, allTimeSegment, navigationSections, infoCalloutDisplay, graphKey, articleTileCarouselModel, integrationsUpsellDtoV3, manualMeasurementItem, seeAllDataItem, manualMeasurementSheet, recordedData, recordedDataError, false, false, upsellCard, trendMenuList, cardioFitnessLevel, metricEducationList, infoCalloutList, manualMeasurementTextDisplay, trendMenus, additionalInfoText, measurementRecord2, successDeleteMeasurement, measurementId, data.getDesignItems(), data.getMetadata(), null, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final Object m114888v(EnumC4821i enumC4821i, String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) {
        return this.ffChecker.isFeatureEnabled("vo2-max-delete-states-android") ? m114890x(enumC4821i, str, abstractC36127t, interfaceC30057d) : m114889w(enumC4821i, str, abstractC36127t, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: w */
    public final Object m114889w(EnumC4821i enumC4821i, String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        e eVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f154498F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f154498F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM110907h = eVar.f154502z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f154498F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110907h);
            C35070c c35070c = this.repository;
            eVar.f154499w = null;
            eVar.f154500x = null;
            eVar.f154501y = abstractC36127t;
            eVar.f154498F = 1;
            objM110907h = c35070c.m110907h(enumC4821i, str, eVar);
            if (objM110907h == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) eVar.f154501y;
            AbstractC34132o.m107864I(objM110907h);
        }
        C29218v0 c29218v0 = (C29218v0) objM110907h;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return c29218v0 != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, true, null, null, null, null, -1074003969, 7, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1074003969, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: x */
    public final Object m114890x(EnumC4821i enumC4821i, String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) {
        f fVar;
        AbstractC36127t abstractC36127t2;
        String str2 = str;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f154504F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f154504F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM85321a = fVar.f154508z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f154504F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM85321a);
            g gVar = new g(enumC4821i, str2, null);
            fVar.f154505w = null;
            fVar.f154506x = str2;
            abstractC36127t2 = abstractC36127t;
            fVar.f154507y = abstractC36127t2;
            fVar.f154504F = 1;
            objM85321a = AbstractC28190p0.m85321a(1000L, gVar, fVar);
            if (objM85321a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC36127t abstractC36127t3 = (AbstractC36127t) fVar.f154507y;
            String str3 = (String) fVar.f154506x;
            AbstractC34132o.m107864I(objM85321a);
            abstractC36127t2 = abstractC36127t3;
            str2 = str3;
        }
        C29218v0 c29218v0 = (C29218v0) objM85321a;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return c29218v0 != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, AbstractC36112e.b.f154374a, -262145, 3, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, new AbstractC36112e.a(str2), -1074003969, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: y */
    public final Object m114891y(String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) throws Exception {
        h hVar;
        AbstractC36127t abstractC36127t2;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f154513E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f154513E = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM110908i = hVar.f154516y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f154513E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110908i);
            C35070c c35070c = this.repository;
            hVar.f154514w = null;
            hVar.f154515x = abstractC36127t;
            hVar.f154513E = 1;
            objM110908i = c35070c.m110908i(str, hVar);
            if (objM110908i == enumC31071a) {
                return enumC31071a;
            }
            abstractC36127t2 = abstractC36127t;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36127t2 = (AbstractC36127t) hVar.f154515x;
            AbstractC34132o.m107864I(objM110908i);
        }
        C29218v0 c29218v0 = (C29218v0) objM110908i;
        AbstractC22676k.m65748h(abstractC36127t2, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsApiDomainResult.ResultV3");
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        return c29218v0 != null ? AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -1310721, 7, null) : AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: z */
    public final Object m114892z(String str, AbstractC36127t abstractC36127t, InterfaceC30057d<? super AbstractC36127t> interfaceC30057d) {
        i iVar;
        AbstractC36127t abstractC36127t2;
        ArrayList arrayList;
        String str2 = str;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f154518E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f154518E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM110909j = iVar.f154521y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f154518E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110909j);
            C35070c c35070c = this.repository;
            iVar.f154519w = str2;
            abstractC36127t2 = abstractC36127t;
            iVar.f154520x = abstractC36127t2;
            iVar.f154518E = 1;
            objM110909j = c35070c.m110909j(str2, iVar);
            if (objM110909j == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC36127t abstractC36127t3 = (AbstractC36127t) iVar.f154520x;
            String str3 = (String) iVar.f154519w;
            AbstractC34132o.m107864I(objM110909j);
            abstractC36127t2 = abstractC36127t3;
            str2 = str3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM110909j;
        if (!(abstractC36127t2 instanceof AbstractC36127t.c)) {
            return abstractC36127t2;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            return interfaceC34385a instanceof InterfaceC34385a.b ? AbstractC36127t.c.m114821b((AbstractC36127t.c) abstractC36127t2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -262145, 7, null) : abstractC36127t2;
        }
        AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t2;
        List<InfoCalloutTileModel> listM114841k = cVar.m114841k();
        if (listM114841k != null) {
            arrayList = new ArrayList();
            for (Object obj : listM114841k) {
                if (!AbstractC22676k.m65745e(((InfoCalloutTileModel) obj).getComponentDismissalId(), str2)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return AbstractC36127t.c.m114821b(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, arrayList, null, null, null, null, false, null, null, null, null, -33554433, 7, null);
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC13058l m114893H(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(AbstractC36127t.b.f154435a, upstream, new o(null)), 1);
    }
}
