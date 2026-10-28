package gk2;

import android.content.Context;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.tombstone.PaginatedReleaseTombstoneResponse;
import com.whoop.tombstone.TombstoneApi;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import jy1.C22047a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28165h;
import or2.C28167h1;
import or2.EnumC28168i;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p078d1.C11456i;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gk2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010(J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\b,\u0010\u001eJ\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\rH\u0082@¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b2\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?R\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010@R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010CR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010DR\u001b\u0010G\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\bA\u0010F¨\u0006H"}, m65681d2 = {"Lgk2/d;", "", "Landroid/content/Context;", "context", "Lor2/h1;", "packageInfoProvider", "Lcom/whoop/tombstone/TombstoneApi;", "tombstoneApi", "Liy1/c;", "metricWriter", "La6/g;", "Lf6/f;", "dataStore", "", "releaseName", "", "thisBuildEpochMillis", "buildDistribution", "", "appVersionCode", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Landroid/content/Context;Lor2/h1;Lcom/whoop/tombstone/TombstoneApi;Liy1/c;La6/g;Ljava/lang/String;JLjava/lang/String;ILjava/time/Clock;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "g", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/Instant;", "lastUpdateTime", "l", "(Ljava/time/Instant;Lq83/d;)Ljava/lang/Object;", "Ljava/time/Duration;", "q", "()Ljava/time/Duration;", "p", "", "Lgk2/a;", "i", "reason", "o", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "k", "()V", "m", "a", "Landroid/content/Context;", "b", "Lor2/h1;", "c", "Lcom/whoop/tombstone/TombstoneApi;", "d", "Liy1/c;", "e", "La6/g;", "f", "Ljava/lang/String;", "J", "I", "j", "Ljava/time/Clock;", "Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ll83/h;", "()Ljava/lang/String;", "userType", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15929d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28167h1 packageInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TombstoneApi tombstoneApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String releaseName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long thisBuildEpochMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String buildDistribution;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int appVersionCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC23462h userType;

    /* JADX INFO: renamed from: gk2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60267a;

        static {
            int[] iArr = new int[EnumC28168i.values().length];
            try {
                iArr[EnumC28168i.PLAY_PROD_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28168i.FIREBASE_DEV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28168i.FIREBASE_PROD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60267a = iArr;
        }
    }

    /* JADX INFO: renamed from: gk2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter", m100430f = "TombstoneReporter.kt", m100431l = {53, 55, 66, 70}, m100432m = "calculateAndReportBuildBehind", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f60268E;

        /* JADX INFO: renamed from: G */
        int f60270G;

        /* JADX INFO: renamed from: w */
        Object f60271w;

        /* JADX INFO: renamed from: x */
        Object f60272x;

        /* JADX INFO: renamed from: y */
        Object f60273y;

        /* JADX INFO: renamed from: z */
        int f60274z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60268E = obj;
            this.f60270G |= Integer.MIN_VALUE;
            return C15929d.this.m44965g(this);
        }
    }

    /* JADX INFO: renamed from: gk2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter", m100430f = "TombstoneReporter.kt", m100431l = {105, 108, 113, 120}, m100432m = "detectAndReportUpdateEvent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f60276F;

        /* JADX INFO: renamed from: w */
        Object f60277w;

        /* JADX INFO: renamed from: x */
        Object f60278x;

        /* JADX INFO: renamed from: y */
        Object f60279y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f60280z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60280z = obj;
            this.f60276F |= Integer.MIN_VALUE;
            return C15929d.this.m44966h(this);
        }
    }

    /* JADX INFO: renamed from: gk2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((C15926a) t15).getReleasedAt(), ((C15926a) t14).getReleasedAt());
        }
    }

    /* JADX INFO: renamed from: gk2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter", m100430f = "TombstoneReporter.kt", m100431l = {147}, m100432m = "getLatestAndroidBuildFromTombstoneService", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f60281E;

        /* JADX INFO: renamed from: F */
        int f60282F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f60283G;

        /* JADX INFO: renamed from: I */
        int f60285I;

        /* JADX INFO: renamed from: w */
        Object f60286w;

        /* JADX INFO: renamed from: x */
        Object f60287x;

        /* JADX INFO: renamed from: y */
        int f60288y;

        /* JADX INFO: renamed from: z */
        int f60289z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60283G = obj;
            this.f60285I |= Integer.MIN_VALUE;
            return C15929d.this.m44967i(this);
        }
    }

    /* JADX INFO: renamed from: gk2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter$getLatestAndroidBuildFromTombstoneService$2$releasesResponse$1", m100430f = "TombstoneReporter.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60290w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22665e0 f60292y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C22665e0 c22665e0, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f60292y = c22665e0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15929d.this.new f(this.f60292y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60290w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TombstoneApi tombstoneApi = C15929d.this.tombstoneApi;
            int i14 = this.f60292y.f89334w;
            this.f60290w = 1;
            Object objM26500a = TombstoneApi.m26500a(tombstoneApi, i14, 0, this, 2, null);
            return objM26500a == enumC31071a ? enumC31071a : objM26500a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PaginatedReleaseTombstoneResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gk2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter$persistUpdateTime$2", m100430f = "TombstoneReporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60293w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f60294x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Instant f60295y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Instant instant, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60295y = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f60295y, interfaceC30057d);
            gVar.f60294x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f60294x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f60293w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC15930e.f60304a, new Long(this.f60295y.toEpochMilli()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gk2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter", m100430f = "TombstoneReporter.kt", m100431l = {46, 47, 49}, m100432m = "reportAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f60296w;

        /* JADX INFO: renamed from: y */
        int f60298y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60296w = obj;
            this.f60298y |= Integer.MIN_VALUE;
            return C15929d.this.m44976m(this);
        }
    }

    /* JADX INFO: renamed from: gk2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.TombstoneReporter", m100430f = "TombstoneReporter.kt", m100431l = {83, 94}, m100432m = "reportBuildAndUpdateAge", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f60299E;

        /* JADX INFO: renamed from: w */
        Object f60300w;

        /* JADX INFO: renamed from: x */
        Object f60301x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60302y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60302y = obj;
            this.f60299E |= Integer.MIN_VALUE;
            return C15929d.this.m44971n(this);
        }
    }

    public C15929d(Context context, C28167h1 packageInfoProvider, TombstoneApi tombstoneApi, InterfaceC21030c metricWriter, InterfaceC0422g dataStore, String releaseName, long j7, String buildDistribution, int i13, Clock clock, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(packageInfoProvider, "packageInfoProvider");
        AbstractC22676k.m65750j(tombstoneApi, "tombstoneApi");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(releaseName, "releaseName");
        AbstractC22676k.m65750j(buildDistribution, "buildDistribution");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.context = context;
        this.packageInfoProvider = packageInfoProvider;
        this.tombstoneApi = tombstoneApi;
        this.metricWriter = metricWriter;
        this.dataStore = dataStore;
        this.releaseName = releaseName;
        this.thisBuildEpochMillis = j7;
        this.buildDistribution = buildDistribution;
        this.appVersionCode = i13;
        this.clock = clock;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.userType = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C11456i(this, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (m44972o("nobuilds", r2) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        if (m44972o(r1, r2) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        if (r4.mo58700a(r9, r2) == r3) goto L60;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m44965g(q83.InterfaceC30057d<? super java.lang.Boolean> r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.C15929d.m44965g(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public final Object m44966h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Instant instantM85269b;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f60276F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f60276F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36575A = cVar.f60280z;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f60276F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.dataStore.getData();
            cVar.f60276F = 1;
            objM36575A = AbstractC13091v.m36575A(data, cVar);
            if (objM36575A != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    instantM85269b = (Instant) cVar.f60278x;
                    AbstractC34132o.m107864I(objM36575A);
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            AbstractC34132o.m107864I(objM36575A);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objM36575A);
        cVar.f60277w = null;
        cVar.f60278x = null;
        cVar.f60279y = null;
        cVar.f60276F = 4;
        if (m44970l(instantM85269b, cVar) == obj) {
            return obj;
        }
        return c23454a0;
        Long l7 = (Long) ((AbstractC14134f) objM36575A).mo40227b(AbstractC15930e.f60304a);
        Instant instantOfEpochMilli = l7 != null ? Instant.ofEpochMilli(l7.longValue()) : null;
        instantM85269b = this.packageInfoProvider.m85269b(this.context);
        if (instantOfEpochMilli == null) {
            cVar.f60277w = null;
            cVar.f60278x = null;
            cVar.f60276F = 2;
            if (m44970l(instantM85269b, cVar) == obj) {
                return obj;
            }
            return c23454a0;
        }
        if (!AbstractC22676k.m65745e(instantM85269b, instantOfEpochMilli)) {
            Duration durationBetween = Duration.between(instantOfEpochMilli, instantM85269b);
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, "distribution.app_update_event", new Double(durationBetween.toMillis()), AbstractC37056f.m118959K(AbstractC11266d.m30461o("distribution:", this.buildDistribution), AbstractC11266d.m30461o("release_name:", this.releaseName), AbstractC11266d.m30461o("type:", m44968j())), null, 17, null);
            cVar.f60277w = null;
            cVar.f60278x = instantM85269b;
            cVar.f60279y = null;
            cVar.f60276F = 3;
            if (interfaceC21030c.mo58700a(c22047a, cVar) != obj) {
                cVar.f60277w = null;
                cVar.f60278x = null;
                cVar.f60279y = null;
                cVar.f60276F = 4;
                if (m44970l(instantM85269b, cVar) == obj) {
                }
            }
            return obj;
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da A[LOOP:1: B:31:0x00d4->B:33:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:20:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m44967i(q83.InterfaceC30057d<? super java.util.List<gk2.C15926a>> r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.C15929d.m44967i(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    private final String m44968j() {
        return (String) this.userType.getValue();
    }

    /* JADX INFO: renamed from: k */
    private final void m44969k() {
        if (AbstractC22676k.m65745e(m44968j(), "employee")) {
            int i13 = a.f60267a[AbstractC28165h.m85267c(this.buildDistribution).ordinal()];
            if (i13 == 1) {
                this.logger.mo85216g("non member is using the play store", new AbstractC30556a.a[0]);
            } else if (i13 == 2) {
                this.logger.mo85216g("non member is using firebase dev", new AbstractC30556a.a[0]);
            } else {
                if (i13 != 3) {
                    return;
                }
                this.logger.mo85216g("non member is using firebase prod", new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final Object m44970l(Instant instant, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStore, new g(instant, null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: n */
    public final Object m44971n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f60299E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f60299E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f60302y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f60299E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        Duration durationM44974q = m44974q();
        this.logger.mo85228t("timeSinceLastAppUpdate: " + durationM44974q, new AbstractC30556a.a[0]);
        InterfaceC21030c interfaceC21030c = this.metricWriter;
        C22047a c22047a = new C22047a(0, "distribution.update.millisbehind", new Double((double) durationM44974q.toMillis()), AbstractC37056f.m118959K(AbstractC11266d.m30461o("distribution:", this.buildDistribution), AbstractC11266d.m30461o("type:", m44968j())), null, 17, null);
        iVar.f60300w = null;
        iVar.f60299E = 1;
        if (interfaceC21030c.mo58700a(c22047a, iVar) != enumC31071a) {
        }
        return enumC31071a;
        Duration durationM44973p = m44973p();
        this.logger.mo85228t("timeSinceBuildCut: " + durationM44973p, new AbstractC30556a.a[0]);
        if (!AbstractC22676k.m65745e(durationM44973p, Duration.ZERO)) {
            InterfaceC21030c interfaceC21030c2 = this.metricWriter;
            C22047a c22047a2 = new C22047a(0, "distribution.build.millisbehind", new Double(durationM44973p.toMillis()), AbstractC37056f.m118959K(AbstractC11266d.m30461o("distribution:", this.buildDistribution), AbstractC11266d.m30461o("type:", m44968j())), null, 17, null);
            iVar.f60300w = null;
            iVar.f60301x = null;
            iVar.f60299E = 2;
            if (interfaceC21030c2.mo58700a(c22047a2, iVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: o */
    private final Object m44972o(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "distribution.versionsbehind.error", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("distribution:", this.buildDistribution), AbstractC11266d.m30461o("reason:", str), AbstractC11266d.m30461o("release_name:", this.releaseName), AbstractC11266d.m30461o("type:", m44968j())), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private final Duration m44973p() {
        if (this.thisBuildEpochMillis != 0) {
            Duration durationOfMillis = Duration.ofMillis(this.clock.millis() - this.thisBuildEpochMillis);
            AbstractC22676k.m65747g(durationOfMillis);
            return durationOfMillis;
        }
        Duration duration = Duration.ZERO;
        AbstractC22676k.m65747g(duration);
        return duration;
    }

    /* JADX INFO: renamed from: q */
    private final Duration m44974q() {
        Duration durationOfMillis = Duration.ofMillis(this.clock.millis() - this.packageInfoProvider.m85269b(this.context).toEpochMilli());
        AbstractC22676k.m65749i(durationOfMillis, "ofMillis(...)");
        return durationOfMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m44975r(C15929d c15929d) {
        return c15929d.featureFlagChecker.isFeatureEnabled("droid-internal-app-updates-telemetry") ? "employee" : "member";
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m44976m(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Exception {
        h hVar;
        Object objM44965g;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f60298y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f60298y = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f60296w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = hVar.f60298y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            hVar.f60298y = 1;
            if (m44971n(hVar) != obj2) {
            }
            return obj2;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
        }
        m44969k();
        hVar.f60298y = 3;
        objM44965g = m44965g(hVar);
        if (objM44965g != obj2) {
            return obj2;
        }
        return objM44965g;
        hVar.f60298y = 2;
        if (m44966h(hVar) != obj2) {
            m44969k();
            hVar.f60298y = 3;
            objM44965g = m44965g(hVar);
            if (objM44965g != obj2) {
                return objM44965g;
            }
        }
        return obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C15929d(Context context, C28167h1 c28167h1, TombstoneApi tombstoneApi, InterfaceC21030c interfaceC21030c, InterfaceC0422g interfaceC0422g, String str, long j7, String str2, int i13, Clock clock, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        String str3 = (i14 & 32) != 0 ? "Android" : str;
        long j13 = (i14 & 64) != 0 ? 0L : j7;
        String str4 = (i14 & 128) != 0 ? "" : str2;
        int i15 = (i14 & 256) != 0 ? 0 : i13;
        if ((i14 & 512) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        this(context, c28167h1, tombstoneApi, interfaceC21030c, interfaceC0422g, str3, j13, str4, i15, clock2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TombstoneReporter") : interfaceC34116n, featureFlagChecker);
    }
}
