package ul2;

import ci2.InterfaceC4733b;
import cm2.EnumC4821i;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.trends.data.DismissBody;
import com.whoop.trends.data.TrendsApi;
import com.whoop.trends.data.model.ManualMeasurementRequestBody;
import com.whoop.trends.data.model.MeasurementRecord;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.Sections;
import com.whoop.trends.data.model.TrendTileProperties;
import com.whoop.trends.data.model.TrendsDtoV3;
import com.whoop.trends.data.model.Vo2ManualMeasurementRequest;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ul2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0080@¢\u0006\u0004\b$\u0010%J\"\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b(\u0010\u001dJ \u0010+\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010*\u001a\u00020)H\u0080@¢\u0006\u0004\b+\u0010,J(\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0080@¢\u0006\u0004\b.\u0010/J \u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b0\u00101J(\u00102\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b2\u00103J(\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u000204H\u0080@¢\u0006\u0004\b5\u00106J(\u00107\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u000204H\u0080@¢\u0006\u0004\b7\u00106J$\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u00108\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b9\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, m65681d2 = {"Lul2/c;", "Lhj0/n;", "Lcom/whoop/trends/data/TrendsApi;", "api", "Ltr2/n;", "logger", "Lin2/d;", "dispatcherFactory", "Lrr2/c;", "crashReporter", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/trends/data/TrendsApi;Ltr2/n;Lin2/d;Lrr2/c;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/trends/data/model/TrendTileProperties;", "properties", "Lu02/a;", "Lpg3/v0;", "Ll83/a0;", "q", "(Lcom/whoop/trends/data/model/TrendTileProperties;Lq83/d;)Ljava/lang/Object;", "Lor2/h0;", "graphKey", "", "todayDateTime", "Lcom/whoop/trends/data/model/TrendsDtoV3;", "o", "(Lor2/h0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/RecordedData;", "n", "(Lor2/h0;Lq83/d;)Ljava/lang/Object;", "Lcm2/i;", "measurementId", "Lcom/whoop/trends/data/model/MeasurementRecord;", "l", "(Lcm2/i;Lq83/d;)Ljava/lang/Object;", "nextToken", "Lcom/whoop/trends/data/model/Sections;", "m", "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "body", "f", "(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;", "id", "p", "(Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;", "i", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcm2/i;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "g", "(Lcm2/i;Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;", "k", "componentId", "j", "a", "Lcom/whoop/trends/data/TrendsApi;", "b", "Lci2/b;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35070c extends AbstractC17355n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TrendsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ul2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {94, LogPriority.NONE}, m100432m = "addManualMeasurement$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f148703w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148704x;

        /* JADX INFO: renamed from: z */
        int f148706z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148704x = obj;
            this.f148706z |= Integer.MIN_VALUE;
            return C35070c.this.m110905f(null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$addManualMeasurement$2", m100430f = "TrendsRepository.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148707w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ManualMeasurementRequestBody f148709y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ManualMeasurementRequestBody manualMeasurementRequestBody, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148709y = manualMeasurementRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new b(this.f148709y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148707w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            ManualMeasurementRequestBody manualMeasurementRequestBody = this.f148709y;
            this.f148707w = 1;
            Object objAddManualMeasurement = trendsApi.addManualMeasurement(manualMeasurementRequestBody, this);
            return objAddManualMeasurement == enumC31071a ? enumC31071a : objAddManualMeasurement;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {137, 142}, m100432m = "addMeasurementReport$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148710E;

        /* JADX INFO: renamed from: w */
        Object f148711w;

        /* JADX INFO: renamed from: x */
        Object f148712x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148713y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148713y = obj;
            this.f148710E |= Integer.MIN_VALUE;
            return C35070c.this.m110906g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$addMeasurementReport$2", m100430f = "TrendsRepository.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148715w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f148717y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Vo2ManualMeasurementRequest f148718z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC4821i enumC4821i, Vo2ManualMeasurementRequest vo2ManualMeasurementRequest, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148717y = enumC4821i;
            this.f148718z = vo2ManualMeasurementRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new d(this.f148717y, this.f148718z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148715w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String value = this.f148717y.getValue();
            Vo2ManualMeasurementRequest vo2ManualMeasurementRequest = this.f148718z;
            this.f148715w = 1;
            Object objAddMeasurementReport = trendsApi.addMeasurementReport(value, vo2ManualMeasurementRequest, this);
            return objAddMeasurementReport == enumC31071a ? enumC31071a : objAddMeasurementReport;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {132}, m100432m = "deleteMeasurementReport$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148719E;

        /* JADX INFO: renamed from: w */
        Object f148720w;

        /* JADX INFO: renamed from: x */
        Object f148721x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148722y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148722y = obj;
            this.f148719E |= Integer.MIN_VALUE;
            return C35070c.this.m110907h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$deleteMeasurementReport$2", m100430f = "TrendsRepository.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148724w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f148726y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f148727z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC4821i enumC4821i, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148726y = enumC4821i;
            this.f148727z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new f(this.f148726y, this.f148727z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148724w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String value = this.f148726y.getValue();
            String str = this.f148727z;
            this.f148724w = 1;
            Object objDeleteMeasurementReport = trendsApi.deleteMeasurementReport(value, str, this);
            return objDeleteMeasurementReport == enumC31071a ? enumC31071a : objDeleteMeasurementReport;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {120, 125}, m100432m = "deleteWeightMeasurement$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f148728w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148729x;

        /* JADX INFO: renamed from: z */
        int f148731z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148729x = obj;
            this.f148731z |= Integer.MIN_VALUE;
            return C35070c.this.m110908i(null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$deleteWeightMeasurement$2", m100430f = "TrendsRepository.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148732w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f148734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148734y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new h(this.f148734y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148732w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String str = this.f148734y;
            this.f148732w = 1;
            Object objDeleteManualMeasurement = trendsApi.deleteManualMeasurement(str, this);
            return objDeleteManualMeasurement == enumC31071a ? enumC31071a : objDeleteManualMeasurement;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$dismissComponent$2", m100430f = "TrendsRepository.kt", m100431l = {163}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148735w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f148737y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148737y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new i(this.f148737y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148735w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            DismissBody dismissBody = new DismissBody(this.f148737y);
            this.f148735w = 1;
            Object objDismissRequest = trendsApi.dismissRequest(dismissBody, this);
            return objDismissRequest == enumC31071a ? enumC31071a : objDismissRequest;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {150, 155}, m100432m = "editMeasurementReport$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148738E;

        /* JADX INFO: renamed from: w */
        Object f148739w;

        /* JADX INFO: renamed from: x */
        Object f148740x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148741y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148741y = obj;
            this.f148738E |= Integer.MIN_VALUE;
            return C35070c.this.m110910k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$editMeasurementReport$2", m100430f = "TrendsRepository.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148743w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f148745y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Vo2ManualMeasurementRequest f148746z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC4821i enumC4821i, Vo2ManualMeasurementRequest vo2ManualMeasurementRequest, InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148745y = enumC4821i;
            this.f148746z = vo2ManualMeasurementRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new k(this.f148745y, this.f148746z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148743w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String value = this.f148745y.getValue();
            Vo2ManualMeasurementRequest vo2ManualMeasurementRequest = this.f148746z;
            this.f148743w = 1;
            Object objEditMeasurementReport = trendsApi.editMeasurementReport(value, vo2ManualMeasurementRequest, this);
            return objEditMeasurementReport == enumC31071a ? enumC31071a : objEditMeasurementReport;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {63, 68}, m100432m = "fetchReportData$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f148747w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148748x;

        /* JADX INFO: renamed from: z */
        int f148750z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148748x = obj;
            this.f148750z |= Integer.MIN_VALUE;
            return C35070c.this.m110911l(null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$fetchReportData$2", m100430f = "TrendsRepository.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/trends/data/model/MeasurementRecord;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148751w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f148753y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(EnumC4821i enumC4821i, InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148753y = enumC4821i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new m(this.f148753y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148751w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String value = this.f148753y.getValue();
            this.f148751w = 1;
            Object objFetchMeasurementReportData = trendsApi.fetchMeasurementReportData(value, this);
            return objFetchMeasurementReportData == enumC31071a ? enumC31071a : objFetchMeasurementReportData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MeasurementRecord> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$fetchReportData$response$1", m100430f = "TrendsRepository.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/trends/data/model/MeasurementRecord;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148754w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC4821i f148756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC4821i enumC4821i, InterfaceC30057d<? super n> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148756y = enumC4821i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new n(this.f148756y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148754w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String value = this.f148756y.getValue();
            this.f148754w = 1;
            Object objFetchMeasurementReportData = trendsApi.fetchMeasurementReportData(value, this);
            return objFetchMeasurementReportData == enumC31071a ? enumC31071a : objFetchMeasurementReportData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MeasurementRecord> interfaceC30057d) {
            return ((n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {81, 86}, m100432m = "getPaginatedRecordedData$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148757E;

        /* JADX INFO: renamed from: w */
        Object f148758w;

        /* JADX INFO: renamed from: x */
        Object f148759x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148760y;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148760y = obj;
            this.f148757E |= Integer.MIN_VALUE;
            return C35070c.this.m110912m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$p */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$getPaginatedRecordedData$2", m100430f = "TrendsRepository.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/trends/data/model/Sections;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148762w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC28166h0 f148764y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f148765z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC28166h0 enumC28166h0, String str, InterfaceC30057d<? super p> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148764y = enumC28166h0;
            this.f148765z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new p(this.f148764y, this.f148765z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148762w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            EnumC28166h0 enumC28166h0 = this.f148764y;
            String str = this.f148765z;
            this.f148762w = 1;
            Object paginatedRecordedData = trendsApi.getPaginatedRecordedData(enumC28166h0, str, this);
            return paginatedRecordedData == enumC31071a ? enumC31071a : paginatedRecordedData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Sections> interfaceC30057d) {
            return ((p) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$q */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {50, 55}, m100432m = "getRecordedData$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f148766w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148767x;

        /* JADX INFO: renamed from: z */
        int f148769z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148767x = obj;
            this.f148769z |= Integer.MIN_VALUE;
            return C35070c.this.m110913n(null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$r */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$getRecordedData$2", m100430f = "TrendsRepository.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/trends/data/model/RecordedData;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148770w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC28166h0 f148772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EnumC28166h0 enumC28166h0, InterfaceC30057d<? super r> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148772y = enumC28166h0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new r(this.f148772y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148770w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            EnumC28166h0 enumC28166h0 = this.f148772y;
            this.f148770w = 1;
            Object recordedData = trendsApi.getRecordedData(enumC28166h0, this);
            return recordedData == enumC31071a ? enumC31071a : recordedData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super RecordedData> interfaceC30057d) {
            return ((r) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$s */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {36, 42}, m100432m = "getTrendsV3$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f148774F;

        /* JADX INFO: renamed from: w */
        Object f148775w;

        /* JADX INFO: renamed from: x */
        Object f148776x;

        /* JADX INFO: renamed from: y */
        Object f148777y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f148778z;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148778z = obj;
            this.f148774F |= Integer.MIN_VALUE;
            return C35070c.this.m110914o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$t */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$getTrendsV3$2", m100430f = "TrendsRepository.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/trends/data/model/TrendsDtoV3;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f148779E;

        /* JADX INFO: renamed from: w */
        int f148780w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC28166h0 f148782y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f148783z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EnumC28166h0 enumC28166h0, String str, String str2, InterfaceC30057d<? super t> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148782y = enumC28166h0;
            this.f148783z = str;
            this.f148779E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new t(this.f148782y, this.f148783z, this.f148779E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148780w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            EnumC28166h0 enumC28166h0 = this.f148782y;
            String str = this.f148783z;
            String str2 = this.f148779E;
            this.f148780w = 1;
            Object trendsV3 = trendsApi.getTrendsV3(enumC28166h0, str, str2, this);
            return trendsV3 == enumC31071a ? enumC31071a : trendsV3;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TrendsDtoV3> interfaceC30057d) {
            return ((t) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$u */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository", m100430f = "TrendsRepository.kt", m100431l = {107, 112}, m100432m = "updateManualMeasurement$trends_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148784E;

        /* JADX INFO: renamed from: w */
        Object f148785w;

        /* JADX INFO: renamed from: x */
        Object f148786x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148787y;

        public u(InterfaceC30057d<? super u> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148787y = obj;
            this.f148784E |= Integer.MIN_VALUE;
            return C35070c.this.m110915p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2.c$v */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$updateManualMeasurement$2", m100430f = "TrendsRepository.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148789w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f148791y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ManualMeasurementRequestBody f148792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, ManualMeasurementRequestBody manualMeasurementRequestBody, InterfaceC30057d<? super v> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148791y = str;
            this.f148792z = manualMeasurementRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new v(this.f148791y, this.f148792z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148789w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            String str = this.f148791y;
            ManualMeasurementRequestBody manualMeasurementRequestBody = this.f148792z;
            this.f148789w = 1;
            Object objUpdateManualMeasurement = trendsApi.updateManualMeasurement(str, manualMeasurementRequestBody, this);
            return objUpdateManualMeasurement == enumC31071a ? enumC31071a : objUpdateManualMeasurement;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((v) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ul2.c$w */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.TrendsRepository$updateTrendTileProperties$2", m100430f = "TrendsRepository.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f148793w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TrendTileProperties f148795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(TrendTileProperties trendTileProperties, InterfaceC30057d<? super w> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f148795y = trendTileProperties;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35070c.this.new w(this.f148795y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148793w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TrendsApi trendsApi = C35070c.this.api;
            TrendTileProperties trendTileProperties = this.f148795y;
            this.f148793w = 1;
            Object objUpdateTrendTileProperties = trendsApi.updateTrendTileProperties(trendTileProperties, this);
            return objUpdateTrendTileProperties == enumC31071a ? enumC31071a : objUpdateTrendTileProperties;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((w) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35070c(TrendsApi api, InterfaceC34116n logger, InterfaceC18732d dispatcherFactory, InterfaceC31766c crashReporter, InterfaceC4733b whoopStrapProvider, FeatureFlagChecker featureFlagChecker) {
        super(logger, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.api = api;
        this.whoopStrapProvider = whoopStrapProvider;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110905f(com.whoop.trends.data.model.ManualMeasurementRequestBody r8, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ul2.C35070c.a
            if (r0 == 0) goto L14
            r0 = r9
            ul2.c$a r0 = (ul2.C35070c.a) r0
            int r1 = r0.f148706z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148706z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$a r0 = new ul2.c$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f148704x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148706z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r8 = r6.f148703w
            com.whoop.trends.data.model.ManualMeasurementRequestBody r8 = (com.whoop.trends.data.model.ManualMeasurementRequestBody) r8
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L31
            goto L84
        L31:
            r0 = move-exception
            r8 = r0
            goto L88
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r6.f148703w
            com.whoop.trends.data.model.ManualMeasurementRequestBody r8 = (com.whoop.trends.data.model.ManualMeasurementRequestBody) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6e
        L44:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.data.repositories.FeatureFlagChecker r9 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r9 = r9.isFeatureEnabled(r1)
            if (r9 == 0) goto L77
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r9 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$b r5 = new ul2.c$b
            r5.<init>(r8, r4)
            r6.f148703w = r4
            r6.f148706z = r9
            java.lang.String r4 = "Failed to add manual measurement"
            java.lang.Object r9 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L6e
            goto L83
        L6e:
            u02.a r9 = (u02.InterfaceC34385a) r9
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r9)
            pg3.v0 r8 = (pg3.C29218v0) r8
            return r8
        L77:
            com.whoop.trends.data.TrendsApi r9 = r7.api     // Catch: java.lang.Exception -> L31
            r6.f148703w = r4     // Catch: java.lang.Exception -> L31
            r6.f148706z = r2     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r9.addManualMeasurement(r8, r6)     // Catch: java.lang.Exception -> L31
            if (r9 != r0) goto L84
        L83:
            return r0
        L84:
            pg3.v0 r9 = (pg3.C29218v0) r9     // Catch: java.lang.Exception -> L31
            r4 = r9
            goto L8d
        L88:
            java.lang.String r9 = "Failed to add manual measurement"
            r7.logRetrofitSuspendException(r8, r9)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110905f(com.whoop.trends.data.model.ManualMeasurementRequestBody, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110906g(cm2.EnumC4821i r8, com.whoop.trends.data.model.Vo2ManualMeasurementRequest r9, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ul2.C35070c.c
            if (r0 == 0) goto L14
            r0 = r10
            ul2.c$c r0 = (ul2.C35070c.c) r0
            int r1 = r0.f148710E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148710E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$c r0 = new ul2.c$c
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f148713y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148710E
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r8 = r6.f148712x
            com.whoop.trends.data.model.Vo2ManualMeasurementRequest r8 = (com.whoop.trends.data.model.Vo2ManualMeasurementRequest) r8
            java.lang.Object r8 = r6.f148711w
            cm2.i r8 = (cm2.EnumC4821i) r8
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L94
        L35:
            r0 = move-exception
            r8 = r0
            goto L98
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r6.f148712x
            com.whoop.trends.data.model.Vo2ManualMeasurementRequest r8 = (com.whoop.trends.data.model.Vo2ManualMeasurementRequest) r8
            java.lang.Object r8 = r6.f148711w
            cm2.i r8 = (cm2.EnumC4821i) r8
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L4c:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.FeatureFlagChecker r10 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r10 = r10.isFeatureEnabled(r1)
            if (r10 == 0) goto L81
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r10 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$d r5 = new ul2.c$d
            r5.<init>(r8, r9, r4)
            r6.f148711w = r4
            r6.f148712x = r4
            r6.f148710E = r10
            java.lang.String r4 = "Failed to add measurement report"
            java.lang.Object r10 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L78
            goto L93
        L78:
            u02.a r10 = (u02.InterfaceC34385a) r10
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r10)
            pg3.v0 r8 = (pg3.C29218v0) r8
            return r8
        L81:
            com.whoop.trends.data.TrendsApi r10 = r7.api     // Catch: java.lang.Exception -> L35
            java.lang.String r8 = r8.getValue()     // Catch: java.lang.Exception -> L35
            r6.f148711w = r4     // Catch: java.lang.Exception -> L35
            r6.f148712x = r4     // Catch: java.lang.Exception -> L35
            r6.f148710E = r2     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.addMeasurementReport(r8, r9, r6)     // Catch: java.lang.Exception -> L35
            if (r10 != r0) goto L94
        L93:
            return r0
        L94:
            pg3.v0 r10 = (pg3.C29218v0) r10     // Catch: java.lang.Exception -> L35
            r4 = r10
            goto L9d
        L98:
            java.lang.String r9 = "Failed to add manual measurment report"
            r7.logRetrofitSuspendException(r8, r9)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110906g(cm2.i, com.whoop.trends.data.model.Vo2ManualMeasurementRequest, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m110907h(EnumC4821i enumC4821i, String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) throws Exception {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f148719E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f148719E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108730a = eVar2.f148722y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f148719E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n logger = getLogger();
            InterfaceC31766c crashReporter = getCrashReporter();
            String strM30461o = AbstractC11266d.m30461o("Failed to delete measurementId:", str);
            f fVar = new f(enumC4821i, str, null);
            eVar2.f148720w = null;
            eVar2.f148721x = null;
            eVar2.f148719E = 1;
            objM108730a = companion.m108730a(logger, crashReporter, strM30461o, fVar, eVar2);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108730a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110908i(java.lang.String r8, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ul2.C35070c.g
            if (r0 == 0) goto L14
            r0 = r9
            ul2.c$g r0 = (ul2.C35070c.g) r0
            int r1 = r0.f148731z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148731z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$g r0 = new ul2.c$g
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f148729x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148731z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r8 = r6.f148728w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L31
            goto L84
        L31:
            r0 = move-exception
            r8 = r0
            goto L88
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r6.f148728w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6e
        L44:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.data.repositories.FeatureFlagChecker r9 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r9 = r9.isFeatureEnabled(r1)
            if (r9 == 0) goto L77
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r9 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$h r5 = new ul2.c$h
            r5.<init>(r8, r4)
            r6.f148728w = r4
            r6.f148731z = r9
            java.lang.String r4 = "Failed to delete manual measurement"
            java.lang.Object r9 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L6e
            goto L83
        L6e:
            u02.a r9 = (u02.InterfaceC34385a) r9
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r9)
            pg3.v0 r8 = (pg3.C29218v0) r8
            return r8
        L77:
            com.whoop.trends.data.TrendsApi r9 = r7.api     // Catch: java.lang.Exception -> L31
            r6.f148728w = r4     // Catch: java.lang.Exception -> L31
            r6.f148731z = r2     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r9.deleteManualMeasurement(r8, r6)     // Catch: java.lang.Exception -> L31
            if (r9 != r0) goto L84
        L83:
            return r0
        L84:
            pg3.v0 r9 = (pg3.C29218v0) r9     // Catch: java.lang.Exception -> L31
            r4 = r9
            goto L8d
        L88:
            java.lang.String r9 = "Failed to delete manual measurement"
            r7.logRetrofitSuspendException(r8, r9)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110908i(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public final Object m110909j(String str, InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(getLogger(), getCrashReporter(), AbstractC11266d.m30461o("Failed to dismiss component: ", str), new i(str, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110910k(cm2.EnumC4821i r8, com.whoop.trends.data.model.Vo2ManualMeasurementRequest r9, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ul2.C35070c.j
            if (r0 == 0) goto L14
            r0 = r10
            ul2.c$j r0 = (ul2.C35070c.j) r0
            int r1 = r0.f148738E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148738E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$j r0 = new ul2.c$j
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f148741y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148738E
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r8 = r6.f148740x
            com.whoop.trends.data.model.Vo2ManualMeasurementRequest r8 = (com.whoop.trends.data.model.Vo2ManualMeasurementRequest) r8
            java.lang.Object r8 = r6.f148739w
            cm2.i r8 = (cm2.EnumC4821i) r8
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L94
        L35:
            r0 = move-exception
            r8 = r0
            goto L98
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r6.f148740x
            com.whoop.trends.data.model.Vo2ManualMeasurementRequest r8 = (com.whoop.trends.data.model.Vo2ManualMeasurementRequest) r8
            java.lang.Object r8 = r6.f148739w
            cm2.i r8 = (cm2.EnumC4821i) r8
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L4c:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.FeatureFlagChecker r10 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r10 = r10.isFeatureEnabled(r1)
            if (r10 == 0) goto L81
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r10 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$k r5 = new ul2.c$k
            r5.<init>(r8, r9, r4)
            r6.f148739w = r4
            r6.f148740x = r4
            r6.f148738E = r10
            java.lang.String r4 = "Failed to edit measurement report"
            java.lang.Object r10 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L78
            goto L93
        L78:
            u02.a r10 = (u02.InterfaceC34385a) r10
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r10)
            pg3.v0 r8 = (pg3.C29218v0) r8
            return r8
        L81:
            com.whoop.trends.data.TrendsApi r10 = r7.api     // Catch: java.lang.Exception -> L35
            java.lang.String r8 = r8.getValue()     // Catch: java.lang.Exception -> L35
            r6.f148739w = r4     // Catch: java.lang.Exception -> L35
            r6.f148740x = r4     // Catch: java.lang.Exception -> L35
            r6.f148738E = r2     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.editMeasurementReport(r8, r9, r6)     // Catch: java.lang.Exception -> L35
            if (r10 != r0) goto L94
        L93:
            return r0
        L94:
            pg3.v0 r10 = (pg3.C29218v0) r10     // Catch: java.lang.Exception -> L35
            r4 = r10
            goto L9d
        L98:
            java.lang.String r9 = "Failed to add manual measurment report"
            r7.logRetrofitSuspendException(r8, r9)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110910k(cm2.i, com.whoop.trends.data.model.Vo2ManualMeasurementRequest, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110911l(cm2.EnumC4821i r11, q83.InterfaceC30057d<? super com.whoop.trends.data.model.MeasurementRecord> r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ul2.C35070c.l
            if (r0 == 0) goto L14
            r0 = r12
            ul2.c$l r0 = (ul2.C35070c.l) r0
            int r1 = r0.f148750z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148750z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$l r0 = new ul2.c$l
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f148748x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148750z
            r2 = 2
            r3 = 1
            r9 = 0
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r11 = r6.f148747w
            cm2.i r11 = (cm2.EnumC4821i) r11
            p505ts.AbstractC34132o.m107864I(r12)     // Catch: java.lang.Exception -> L31
            goto L93
        L31:
            r0 = move-exception
            r11 = r0
            goto La3
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            java.lang.Object r11 = r6.f148747w
            cm2.i r11 = (cm2.EnumC4821i) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L6f
        L45:
            p505ts.AbstractC34132o.m107864I(r12)
            com.whoop.data.repositories.FeatureFlagChecker r12 = r10.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r12 = r12.isFeatureEnabled(r1)
            if (r12 == 0) goto L78
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r10.getLogger()
            r12 = r3
            rr2.c r3 = r10.getCrashReporter()
            ul2.c$m r5 = new ul2.c$m
            r5.<init>(r11, r9)
            r6.f148747w = r9
            r6.f148750z = r12
            java.lang.String r4 = "Failed to fetch reported data"
            java.lang.Object r12 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L6f
            goto L92
        L6f:
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r11 = u02.AbstractC34386b.m108737b(r12)
            com.whoop.trends.data.model.MeasurementRecord r11 = (com.whoop.trends.data.model.MeasurementRecord) r11
            return r11
        L78:
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE     // Catch: java.lang.Exception -> L31
            r12 = r2
            tr2.n r2 = r10.getLogger()     // Catch: java.lang.Exception -> L31
            ul2.c$n r5 = new ul2.c$n     // Catch: java.lang.Exception -> L31
            r5.<init>(r11, r9)     // Catch: java.lang.Exception -> L31
            r6.f148747w = r9     // Catch: java.lang.Exception -> L31
            r6.f148750z = r12     // Catch: java.lang.Exception -> L31
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r12 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L31
            if (r12 != r0) goto L93
        L92:
            return r0
        L93:
            u02.a r12 = (u02.InterfaceC34385a) r12     // Catch: java.lang.Exception -> L31
            boolean r11 = r12 instanceof u02.InterfaceC34385a.c     // Catch: java.lang.Exception -> L31
            if (r11 == 0) goto La8
            u02.a$c r12 = (u02.InterfaceC34385a.c) r12     // Catch: java.lang.Exception -> L31
            java.lang.Object r11 = r12.m108735a()     // Catch: java.lang.Exception -> L31
            com.whoop.trends.data.model.MeasurementRecord r11 = (com.whoop.trends.data.model.MeasurementRecord) r11     // Catch: java.lang.Exception -> L31
            r9 = r11
            goto La8
        La3:
            java.lang.String r12 = "Failed to fetch reported data"
            r10.logRetrofitSuspendException(r11, r12)
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110911l(cm2.i, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110912m(or2.EnumC28166h0 r8, java.lang.String r9, q83.InterfaceC30057d<? super com.whoop.trends.data.model.Sections> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ul2.C35070c.o
            if (r0 == 0) goto L14
            r0 = r10
            ul2.c$o r0 = (ul2.C35070c.o) r0
            int r1 = r0.f148757E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148757E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$o r0 = new ul2.c$o
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f148760y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148757E
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r8 = r6.f148759x
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.f148758w
            or2.h0 r8 = (or2.EnumC28166h0) r8
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L90
        L35:
            r0 = move-exception
            r8 = r0
            goto L94
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r6.f148759x
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.f148758w
            or2.h0 r8 = (or2.EnumC28166h0) r8
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L4c:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.FeatureFlagChecker r10 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r10 = r10.isFeatureEnabled(r1)
            if (r10 == 0) goto L81
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r10 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$p r5 = new ul2.c$p
            r5.<init>(r8, r9, r4)
            r6.f148758w = r4
            r6.f148759x = r4
            r6.f148757E = r10
            java.lang.String r4 = "Failed to fetch paginated recorded data"
            java.lang.Object r10 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L78
            goto L8f
        L78:
            u02.a r10 = (u02.InterfaceC34385a) r10
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r10)
            com.whoop.trends.data.model.Sections r8 = (com.whoop.trends.data.model.Sections) r8
            return r8
        L81:
            com.whoop.trends.data.TrendsApi r10 = r7.api     // Catch: java.lang.Exception -> L35
            r6.f148758w = r4     // Catch: java.lang.Exception -> L35
            r6.f148759x = r4     // Catch: java.lang.Exception -> L35
            r6.f148757E = r2     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.getPaginatedRecordedData(r8, r9, r6)     // Catch: java.lang.Exception -> L35
            if (r10 != r0) goto L90
        L8f:
            return r0
        L90:
            com.whoop.trends.data.model.Sections r10 = (com.whoop.trends.data.model.Sections) r10     // Catch: java.lang.Exception -> L35
            r4 = r10
            goto L99
        L94:
            java.lang.String r9 = "Failed to fetch recorded data"
            r7.logRetrofitSuspendException(r8, r9)
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110912m(or2.h0, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110913n(or2.EnumC28166h0 r8, q83.InterfaceC30057d<? super com.whoop.trends.data.model.RecordedData> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ul2.C35070c.q
            if (r0 == 0) goto L14
            r0 = r9
            ul2.c$q r0 = (ul2.C35070c.q) r0
            int r1 = r0.f148769z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148769z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$q r0 = new ul2.c$q
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f148767x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148769z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r8 = r6.f148766w
            or2.h0 r8 = (or2.EnumC28166h0) r8
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L31
            goto L84
        L31:
            r0 = move-exception
            r8 = r0
            goto L88
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r6.f148766w
            or2.h0 r8 = (or2.EnumC28166h0) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6e
        L44:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.data.repositories.FeatureFlagChecker r9 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r9 = r9.isFeatureEnabled(r1)
            if (r9 == 0) goto L77
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r9 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$r r5 = new ul2.c$r
            r5.<init>(r8, r4)
            r6.f148766w = r4
            r6.f148769z = r9
            java.lang.String r4 = "Failed to fetch recorded data"
            java.lang.Object r9 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L6e
            goto L83
        L6e:
            u02.a r9 = (u02.InterfaceC34385a) r9
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r9)
            com.whoop.trends.data.model.RecordedData r8 = (com.whoop.trends.data.model.RecordedData) r8
            return r8
        L77:
            com.whoop.trends.data.TrendsApi r9 = r7.api     // Catch: java.lang.Exception -> L31
            r6.f148766w = r4     // Catch: java.lang.Exception -> L31
            r6.f148769z = r2     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = r9.getRecordedData(r8, r6)     // Catch: java.lang.Exception -> L31
            if (r9 != r0) goto L84
        L83:
            return r0
        L84:
            com.whoop.trends.data.model.RecordedData r9 = (com.whoop.trends.data.model.RecordedData) r9     // Catch: java.lang.Exception -> L31
            r4 = r9
            goto L8d
        L88:
            java.lang.String r9 = "Failed to fetch recorded data"
            r7.logRetrofitSuspendException(r8, r9)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110913n(or2.h0, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r0 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r0 == r9) goto L51;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110914o(or2.EnumC28166h0 r14, java.lang.String r15, q83.InterfaceC30057d<? super com.whoop.trends.data.model.TrendsDtoV3> r16) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110914o(or2.h0, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110915p(java.lang.String r8, com.whoop.trends.data.model.ManualMeasurementRequestBody r9, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ul2.C35070c.u
            if (r0 == 0) goto L14
            r0 = r10
            ul2.c$u r0 = (ul2.C35070c.u) r0
            int r1 = r0.f148784E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f148784E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ul2.c$u r0 = new ul2.c$u
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f148787y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f148784E
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r8 = r6.f148786x
            com.whoop.trends.data.model.ManualMeasurementRequestBody r8 = (com.whoop.trends.data.model.ManualMeasurementRequestBody) r8
            java.lang.Object r8 = r6.f148785w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L90
        L35:
            r0 = move-exception
            r8 = r0
            goto L94
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r6.f148786x
            com.whoop.trends.data.model.ManualMeasurementRequestBody r8 = (com.whoop.trends.data.model.ManualMeasurementRequestBody) r8
            java.lang.Object r8 = r6.f148785w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L4c:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.FeatureFlagChecker r10 = r7.featureFlagChecker
            java.lang.String r1 = "trends-api-call-error-handling-android"
            boolean r10 = r10.isFeatureEnabled(r1)
            if (r10 == 0) goto L81
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r7.getLogger()
            r10 = r3
            rr2.c r3 = r7.getCrashReporter()
            ul2.c$v r5 = new ul2.c$v
            r5.<init>(r8, r9, r4)
            r6.f148785w = r4
            r6.f148786x = r4
            r6.f148784E = r10
            java.lang.String r4 = "Failed to update manual measurement"
            java.lang.Object r10 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L78
            goto L8f
        L78:
            u02.a r10 = (u02.InterfaceC34385a) r10
            java.lang.Object r8 = u02.AbstractC34386b.m108737b(r10)
            pg3.v0 r8 = (pg3.C29218v0) r8
            return r8
        L81:
            com.whoop.trends.data.TrendsApi r10 = r7.api     // Catch: java.lang.Exception -> L35
            r6.f148785w = r4     // Catch: java.lang.Exception -> L35
            r6.f148786x = r4     // Catch: java.lang.Exception -> L35
            r6.f148784E = r2     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.updateManualMeasurement(r8, r9, r6)     // Catch: java.lang.Exception -> L35
            if (r10 != r0) goto L90
        L8f:
            return r0
        L90:
            pg3.v0 r10 = (pg3.C29218v0) r10     // Catch: java.lang.Exception -> L35
            r4 = r10
            goto L99
        L94:
            java.lang.String r9 = "Failed to update manual measurement"
            r7.logRetrofitSuspendException(r8, r9)
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.C35070c.m110915p(java.lang.String, com.whoop.trends.data.model.ManualMeasurementRequestBody, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: q */
    public final Object m110916q(TrendTileProperties trendTileProperties, InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(getLogger(), getCrashReporter(), "updateTrendTileProperties", new w(trendTileProperties, null), interfaceC30057d);
    }
}
