package vh2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import fy1.InterfaceC14871g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import jk0.InterfaceC21750d;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import oh2.InterfaceC27939b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p739ui0.C35015q;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sh2.AbstractC32512c;
import sh2.InterfaceC32510a;
import sj2.InterfaceC32564a;
import st0.C32969m;
import st0.EnumC32973q;
import st0.EnumC32978v;
import st0.InterfaceC32972p;
import th2.InterfaceC33815a;
import th2.InterfaceC33817c;
import tr2.InterfaceC34116n;
import uo1.C35141b;
import vk0.InterfaceC36081g;
import xj0.C38332a0;
import yb3.AbstractC39401e;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import zj0.C40727h;
import zj0.InterfaceC40756t;

/* JADX INFO: renamed from: vh2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001GBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J@\u0010(\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020,2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0*2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.Jc\u00106\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020&2\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001e2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000201H\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u0002012\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u000201H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010A\u001a\u00020@*\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ \u0010C\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020FH\u0016¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010_R,\u0010e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0*\u0012\u0004\u0012\u00020,0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, m65681d2 = {"Lvh2/e;", "Lvh2/d;", "Lth2/a;", "client", "Lsh2/a;", "certificateTransferApi", "Ljs0/c;", "configurationRepository", "Lci2/b;", "whoopStrapProvider", "Lvh2/a;", "strapLockStateRecorder", "Lbc3/c0;", "coroutineScope", "Lvh2/c;", "unlockMetrics", "Lvh2/g;", "stuckLockedTracker", "Lfy1/g;", "nanoClock", "Ltr2/n;", "logger", "<init>", "(Lth2/a;Lsh2/a;Ljs0/c;Lci2/b;Lvh2/a;Lbc3/c0;Lvh2/c;Lvh2/g;Lfy1/g;Ltr2/n;)V", "Ljk0/d;", "strap", "Lzj0/t$b;", "hello", "", "isRetry", "Lvh2/h;", "q", "(Ljk0/d;Lzj0/t$b;ZLq83/d;)Ljava/lang/Object;", "", "serial", "strapSignature", "Lsj2/a;", "priority", "Lvh2/i;", "trigger", "l", "(Ljk0/d;Ljava/lang/String;Ljava/lang/String;Lsj2/a;Lvh2/i;ZLq83/d;)Ljava/lang/Object;", "Ll83/k;", "key", "", "p", "(Ll83/k;Z)I", "attemptIndex", "result", "", "backendFetchMs", "queueWaitMs", "certTransferMs", "totalMs", "o", "(Ljk0/d;Ljava/lang/String;Lvh2/i;IZLvh2/h;JLjava/lang/Long;Ljava/lang/Long;J)Lvh2/h;", "startNanos", "endNanos", "n", "(JJ)J", "Lkotlin/time/Duration;", "r", "()J", "Lsh2/c$b;", "Lvh2/h$b;", "t", "(Lsh2/c$b;)Lvh2/h$b;", "d", "(Ljk0/d;Lzj0/t$b;Lq83/d;)Ljava/lang/Object;", "connectionScope", "Ll83/a0;", "a", "(Lbc3/c0;Ljk0/d;Lzj0/t$b;)V", "c", "(Ljk0/d;Lq83/d;)Ljava/lang/Object;", "b", "()V", "Lth2/a;", "Lsh2/a;", "Ljs0/c;", "Lci2/b;", "e", "Lvh2/a;", "f", "Lbc3/c0;", "g", "Lvh2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lvh2/g;", "i", "Lfy1/g;", "j", "Ltr2/n;", "Lmc3/a;", "k", "Lmc3/a;", "refreshLock", "attemptLock", "", "m", "Ljava/util/Map;", "attemptIndexByKey", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36050e implements InterfaceC36049d {

    /* JADX INFO: renamed from: n */
    private static final a f153811n = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33815a client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32510a certificateTransferApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC36046a strapLockStateRecorder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36048c unlockMetrics;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C36052g stuckLockedTracker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC25435a refreshLock;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC25435a attemptLock;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Map<C23465k, Integer> attemptIndexByKey;

    /* JADX INFO: renamed from: vh2.e$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lvh2/e$a;", "", "<init>", "()V", "", "LOCK_TIMEOUT_MILLIS", "J", "NANOS_PER_MS", "NOT_STARTED", "a", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: vh2.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lvh2/e$a$a;", "Ljs0/a;", "", "<init>", "()V", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42542a extends AbstractC21907a<Integer> {

            /* JADX INFO: renamed from: a */
            public static final C42542a f153825a = new C42542a();

            private C42542a() {
                super("mobile-strap-unlock-refresh-threshold-days", 38);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vh2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f153826a;

        static {
            int[] iArr = new int[AbstractC32512c.b.values().length];
            try {
                iArr[AbstractC32512c.b.INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC32512c.b.START_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC32512c.b.LOAD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC32512c.b.VERIFY_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC32512c.b.PROCESS_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC32512c.b.TRANSFER_INCOMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC32512c.b.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f153826a = iArr;
        }
    }

    /* JADX INFO: renamed from: vh2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {134, 145}, m100432m = "attempt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f153827E;

        /* JADX INFO: renamed from: F */
        Object f153828F;

        /* JADX INFO: renamed from: G */
        Object f153829G;

        /* JADX INFO: renamed from: H */
        Object f153830H;

        /* JADX INFO: renamed from: I */
        boolean f153831I;

        /* JADX INFO: renamed from: J */
        int f153832J;

        /* JADX INFO: renamed from: K */
        long f153833K;

        /* JADX INFO: renamed from: L */
        long f153834L;

        /* JADX INFO: renamed from: M */
        long f153835M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f153836N;

        /* JADX INFO: renamed from: P */
        int f153838P;

        /* JADX INFO: renamed from: w */
        Object f153839w;

        /* JADX INFO: renamed from: x */
        Object f153840x;

        /* JADX INFO: renamed from: y */
        Object f153841y;

        /* JADX INFO: renamed from: z */
        Object f153842z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153836N = obj;
            this.f153838P |= Integer.MIN_VALUE;
            return C36050e.this.m114459l(null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: vh2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$finishAttempt$1", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {217}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f153843E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f153844F;

        /* JADX INFO: renamed from: w */
        int f153845w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f153847y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36053h f153848z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC36053h interfaceC36053h, boolean z4, String str2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153847y = str;
            this.f153848z = interfaceC36053h;
            this.f153843E = z4;
            this.f153844F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36050e.this.new d(this.f153847y, this.f153848z, this.f153843E, this.f153844F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153845w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36052g c36052g = C36050e.this.stuckLockedTracker;
                String str = this.f153847y;
                InterfaceC36053h interfaceC36053h = this.f153848z;
                boolean z4 = this.f153843E;
                String str2 = this.f153844F;
                this.f153845w = 1;
                if (c36052g.m114473a(str, interfaceC36053h, z4, str2, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: vh2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {88}, m100432m = "lock", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f153849w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153850x;

        /* JADX INFO: renamed from: z */
        int f153852z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153850x = obj;
            this.f153852z |= Integer.MIN_VALUE;
            return C36050e.this.mo114450c(null, this);
        }
    }

    /* JADX INFO: renamed from: vh2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {255, 117}, m100432m = "refreshAttempt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153853E;

        /* JADX INFO: renamed from: F */
        int f153854F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f153855G;

        /* JADX INFO: renamed from: I */
        int f153857I;

        /* JADX INFO: renamed from: w */
        Object f153858w;

        /* JADX INFO: renamed from: x */
        Object f153859x;

        /* JADX INFO: renamed from: y */
        Object f153860y;

        /* JADX INFO: renamed from: z */
        boolean f153861z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153855G = obj;
            this.f153857I |= Integer.MIN_VALUE;
            return C36050e.this.m114464q(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: vh2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$retryUnlockIfLocked$1", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f153862E;

        /* JADX INFO: renamed from: w */
        int f153863w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21750d f153865y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f153866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC21750d interfaceC21750d, WhoopStrapInfo whoopStrapInfo, String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153865y = interfaceC21750d;
            this.f153866z = whoopStrapInfo;
            this.f153862E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36050e.this.new g(this.f153865y, this.f153866z, this.f153862E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:17:0x003d, B:19:0x0047, B:22:0x0050, B:24:0x0054, B:27:0x0083, B:28:0x0088, B:14:0x0036), top: B:37:0x0036 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:17:0x003d, B:19:0x0047, B:22:0x0050, B:24:0x0054, B:27:0x0083, B:28:0x0088, B:14:0x0036), top: B:37:0x0036 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:17:0x003d, B:19:0x0047, B:22:0x0050, B:24:0x0054, B:27:0x0083, B:28:0x0088, B:14:0x0036), top: B:37:0x0036 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0083 A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #2 {all -> 0x004d, blocks: (B:17:0x003d, B:19:0x0047, B:22:0x0050, B:24:0x0054, B:27:0x0083, B:28:0x0088, B:14:0x0036), top: B:37:0x0036 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0054, please report this as an issue */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g gVar;
            Throwable th3;
            InterfaceC36053h interfaceC36053h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153863w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    gVar = this;
                    interfaceC36053h = (InterfaceC36053h) obj;
                    if (AbstractC22676k.m65745e(interfaceC36053h, InterfaceC36053h.c.f153919a)) {
                        gVar.f153865y.mo24730i0();
                    } else {
                        if (interfaceC36053h instanceof InterfaceC36053h.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C36050e.this.logger.mo85226q("Unlock retry failed (" + ((InterfaceC36053h.a) interfaceC36053h).getReason() + "); strap remains Locked", new AbstractC30556a.a[0]);
                    }
                    C36050e.this.attemptLock.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    gVar = this;
                    C36050e.this.attemptLock.mo68214i(null);
                    throw th3;
                }
            }
            AbstractC34132o.m107864I(obj);
            try {
                C36050e c36050e = C36050e.this;
                InterfaceC21750d interfaceC21750d = this.f153865y;
                String serialNumber = this.f153866z.getSerialNumber();
                String str = this.f153862E;
                InterfaceC32564a.a aVar = InterfaceC32564a.a.f134904a;
                EnumC36054i enumC36054i = EnumC36054i.UNLOCK;
                this.f153863w = 1;
                gVar = this;
                try {
                    obj = c36050e.m114459l(interfaceC21750d, serialNumber, str, aVar, enumC36054i, true, gVar);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    interfaceC36053h = (InterfaceC36053h) obj;
                    if (AbstractC22676k.m65745e(interfaceC36053h, InterfaceC36053h.c.f153919a)) {
                        gVar.f153865y.mo24730i0();
                    } else {
                        if (interfaceC36053h instanceof InterfaceC36053h.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C36050e.this.logger.mo85226q("Unlock retry failed (" + ((InterfaceC36053h.a) interfaceC36053h).getReason() + "); strap remains Locked", new AbstractC30556a.a[0]);
                    }
                    C36050e.this.attemptLock.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    C36050e.this.attemptLock.mo68214i(null);
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                gVar = this;
            }
        }
    }

    /* JADX INFO: renamed from: vh2.e$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$scheduleRefresh$1", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {78, 81, 82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC40756t.b f153867E;

        /* JADX INFO: renamed from: w */
        Object f153868w;

        /* JADX INFO: renamed from: x */
        int f153869x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC21750d f153871z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC21750d interfaceC21750d, InterfaceC40756t.b bVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153871z = interfaceC21750d;
            this.f153867E = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36050e.this.new h(this.f153871z, this.f153867E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x006f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0083  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r10 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        
            if (r10 == r0) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:24:0x0080). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f153869x
                r2 = 0
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2d
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                java.lang.Object r1 = r9.f153868w
                vh2.h r1 = (vh2.InterfaceC36053h) r1
                p505ts.AbstractC34132o.m107864I(r10)
                goto L80
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f153868w
                vh2.h r1 = (vh2.InterfaceC36053h) r1
                p505ts.AbstractC34132o.m107864I(r10)
                goto L6f
            L29:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L3f
            L2d:
                p505ts.AbstractC34132o.m107864I(r10)
                vh2.e r10 = vh2.C36050e.this
                jk0.d r1 = r9.f153871z
                zj0.t$b r7 = r9.f153867E
                r9.f153869x = r6
                java.lang.Object r10 = vh2.C36050e.m114458k(r10, r1, r7, r3, r9)
                if (r10 != r0) goto L3f
                goto L7f
            L3f:
                vh2.h r10 = (vh2.InterfaceC36053h) r10
            L41:
                vh2.h$a r1 = new vh2.h$a
                vh2.h$b r7 = vh2.InterfaceC36053h.b.INTERRUPTED
                r1.<init>(r7)
                boolean r10 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r1)
                if (r10 == 0) goto L83
                vh2.e r10 = vh2.C36050e.this
                tr2.n r10 = vh2.C36050e.m114456i(r10)
                java.lang.String r1 = "Cert transfer was interrupted, rescheduling after 5 seconds delay"
                qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r3]
                r10.mo85226q(r1, r7)
                kotlin.time.Duration$Companion r10 = p715kotlin.time.Duration.INSTANCE
                r10 = 5
                kotlin.time.DurationUnit r1 = p715kotlin.time.DurationUnit.SECONDS
                long r7 = p715kotlin.time.DurationKt.toDuration(r10, r1)
                r9.f153868w = r2
                r9.f153869x = r5
                java.lang.Object r10 = bc3.AbstractC3034m0.m8783c(r7, r9)
                if (r10 != r0) goto L6f
                goto L7f
            L6f:
                vh2.e r10 = vh2.C36050e.this
                jk0.d r1 = r9.f153871z
                zj0.t$b r7 = r9.f153867E
                r9.f153868w = r2
                r9.f153869x = r4
                java.lang.Object r10 = vh2.C36050e.m114458k(r10, r1, r7, r6, r9)
                if (r10 != r0) goto L80
            L7f:
                return r0
            L80:
                vh2.h r10 = (vh2.InterfaceC36053h) r10
                goto L41
            L83:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: vh2.C36050e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vh2.e$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl", m100430f = "StrapUnlockServiceImpl.kt", m100431l = {255, 57}, m100432m = "unlock", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153872E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f153873F;

        /* JADX INFO: renamed from: H */
        int f153875H;

        /* JADX INFO: renamed from: w */
        Object f153876w;

        /* JADX INFO: renamed from: x */
        Object f153877x;

        /* JADX INFO: renamed from: y */
        Object f153878y;

        /* JADX INFO: renamed from: z */
        int f153879z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153873F = obj;
            this.f153875H |= Integer.MIN_VALUE;
            return C36050e.this.mo114451d(null, null, this);
        }
    }

    public C36050e(InterfaceC33815a client, InterfaceC32510a certificateTransferApi, AbstractC21909c configurationRepository, InterfaceC4733b whoopStrapProvider, InterfaceC36046a strapLockStateRecorder, InterfaceC2994c0 coroutineScope, C36048c unlockMetrics, C36052g stuckLockedTracker, InterfaceC14871g nanoClock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(client, "client");
        AbstractC22676k.m65750j(certificateTransferApi, "certificateTransferApi");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(strapLockStateRecorder, "strapLockStateRecorder");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(unlockMetrics, "unlockMetrics");
        AbstractC22676k.m65750j(stuckLockedTracker, "stuckLockedTracker");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        AbstractC22676k.m65750j(logger, "logger");
        this.client = client;
        this.certificateTransferApi = certificateTransferApi;
        this.configurationRepository = configurationRepository;
        this.whoopStrapProvider = whoopStrapProvider;
        this.strapLockStateRecorder = strapLockStateRecorder;
        this.coroutineScope = coroutineScope;
        this.unlockMetrics = unlockMetrics;
        this.stuckLockedTracker = stuckLockedTracker;
        this.nanoClock = nanoClock;
        this.logger = logger;
        this.refreshLock = AbstractC25438d.m74669a();
        this.attemptLock = AbstractC25438d.m74669a();
        this.attemptIndexByKey = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x016e  */
    /* JADX WARN: Code duplicated, block: B:36:0x017e  */
    /* JADX WARN: Code duplicated, block: B:39:0x018a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0194  */
    /* JADX WARN: Code duplicated, block: B:44:0x019c  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01de  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x0203  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: l */
    public final Object m114459l(InterfaceC21750d interfaceC21750d, String str, String str2, InterfaceC32564a interfaceC32564a, EnumC36054i enumC36054i, boolean z4, InterfaceC30057d<? super InterfaceC36053h> interfaceC30057d) {
        c cVar;
        int iM114463p;
        String str3;
        InterfaceC21750d interfaceC21750d2;
        long j7;
        boolean z13;
        EnumC36054i enumC36054i2;
        Object obj;
        InterfaceC32564a interfaceC32564a2;
        long jMo42899a;
        AtomicLong atomicLong;
        boolean z14;
        Object objMo101515a;
        InterfaceC21750d interfaceC21750d3;
        long j13;
        AbstractC32512c abstractC32512c;
        long jMo42899a2;
        WhoopStrapInfo whoopStrapInfo;
        String codeName;
        String strMo84319a;
        InterfaceC36053h aVar;
        InterfaceC36053h aVar2;
        Long l7;
        Long l12;
        Long l13;
        InterfaceC27939b maximVersion;
        EnumC32978v whoopDeviceType;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f153838P;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f153838P = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj2 = cVar.f153836N;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f153838P;
        if (i14 != 0) {
            if (i14 == 1) {
                long j14 = cVar.f153833K;
                int i15 = cVar.f153832J;
                z13 = cVar.f153831I;
                EnumC36054i enumC36054i3 = (EnumC36054i) cVar.f153827E;
                interfaceC32564a2 = (InterfaceC32564a) cVar.f153842z;
                String str4 = (String) cVar.f153840x;
                InterfaceC21750d interfaceC21750d4 = (InterfaceC21750d) cVar.f153839w;
                AbstractC34132o.m107864I(obj2);
                interfaceC21750d2 = interfaceC21750d4;
                j7 = j14;
                iM114463p = i15;
                enumC36054i2 = enumC36054i3;
                obj = obj2;
                str3 = str4;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j15 = cVar.f153835M;
                long j16 = cVar.f153834L;
                long j17 = cVar.f153833K;
                int i16 = cVar.f153832J;
                boolean z15 = cVar.f153831I;
                AtomicLong atomicLong2 = (AtomicLong) cVar.f153830H;
                EnumC36054i enumC36054i4 = (EnumC36054i) cVar.f153827E;
                String str5 = (String) cVar.f153840x;
                interfaceC21750d3 = (InterfaceC21750d) cVar.f153839w;
                AbstractC34132o.m107864I(obj2);
                z14 = z15;
                atomicLong = atomicLong2;
                j7 = j17;
                jMo42899a = j16;
                iM114463p = i16;
                enumC36054i2 = enumC36054i4;
                objMo101515a = obj2;
                str3 = str5;
                j13 = j15;
            }
            abstractC32512c = (AbstractC32512c) objMo101515a;
            String str6 = str3;
            EnumC36054i enumC36054i5 = enumC36054i2;
            jMo42899a2 = this.nanoClock.mo42899a();
            whoopStrapInfo = interfaceC21750d3.get_strapInfo();
            C36048c c36048c = this.unlockMetrics;
            if (whoopStrapInfo != null || (whoopDeviceType = whoopStrapInfo.getWhoopDeviceType()) == null) {
                codeName = null;
            } else {
                codeName = whoopDeviceType.getCodeName();
            }
            if (whoopStrapInfo != null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) {
                strMo84319a = null;
            } else {
                strMo84319a = maximVersion.mo84319a();
            }
            c36048c.m114445h(codeName, strMo84319a, abstractC32512c);
            if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.d.f134656a)) {
                if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.c.f134655a)) {
                    aVar2 = new InterfaceC36053h.a(InterfaceC36053h.b.STRAP_REJECT);
                } else {
                    if (abstractC32512c instanceof AbstractC32512c.a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new InterfaceC36053h.a(m114467t(((AbstractC32512c.a) abstractC32512c).getReason()));
                }
                InterfaceC21750d interfaceC21750d5 = interfaceC21750d3;
                l7 = new Long(atomicLong.get());
                if (l7.longValue() == Long.MIN_VALUE) {
                    l7 = null;
                }
                if (l7 != null) {
                    l12 = new Long(m114461n(jMo42899a, l7.longValue()));
                } else {
                    l12 = null;
                }
                if (l7 != null) {
                    l13 = new Long(m114461n(l7.longValue(), jMo42899a2));
                } else {
                    l13 = null;
                }
                return m114462o(interfaceC21750d5, str6, enumC36054i5, iM114463p, z14, aVar, j13, l12, l13, m114461n(j7, jMo42899a2));
            }
            this.strapLockStateRecorder.mo114433a();
            aVar2 = InterfaceC36053h.c.f153919a;
            aVar = aVar2;
            InterfaceC21750d interfaceC21750d6 = interfaceC21750d3;
            l7 = new Long(atomicLong.get());
            if (l7.longValue() == Long.MIN_VALUE) {
                l7 = null;
            }
            if (l7 != null) {
                l12 = new Long(m114461n(jMo42899a, l7.longValue()));
            } else {
                l12 = null;
            }
            if (l7 != null) {
                l13 = new Long(m114461n(l7.longValue(), jMo42899a2));
            } else {
                l13 = null;
            }
            return m114462o(interfaceC21750d6, str6, enumC36054i5, iM114463p, z14, aVar, j13, l12, l13, m114461n(j7, jMo42899a2));
        }
        AbstractC34132o.m107864I(obj2);
        iM114463p = m114463p(new C23465k(enumC36054i, str), z4);
        long jMo42899a3 = this.nanoClock.mo42899a();
        InterfaceC33815a interfaceC33815a = this.client;
        String strM125916A = AbstractC39421y.m125916A(AbstractC39401e.m125836a(str2));
        cVar.f153839w = interfaceC21750d;
        cVar.f153840x = str;
        cVar.f153841y = null;
        cVar.f153842z = interfaceC32564a;
        cVar.f153827E = enumC36054i;
        cVar.f153831I = z4;
        cVar.f153832J = iM114463p;
        cVar.f153833K = jMo42899a3;
        cVar.f153838P = 1;
        Object objMo106973a = interfaceC33815a.mo106973a(str, strM125916A, cVar);
        if (objMo106973a == enumC31071a) {
            return enumC31071a;
        }
        str3 = str;
        interfaceC21750d2 = interfaceC21750d;
        j7 = jMo42899a3;
        z13 = z4;
        enumC36054i2 = enumC36054i;
        obj = objMo106973a;
        interfaceC32564a2 = interfaceC32564a;
        InterfaceC33817c interfaceC33817c = (InterfaceC33817c) obj;
        jMo42899a = this.nanoClock.mo42899a();
        boolean z16 = z13;
        long jM114461n = m114461n(j7, jMo42899a);
        if (!(interfaceC33817c instanceof InterfaceC33817c.d)) {
            InterfaceC21750d interfaceC21750d7 = interfaceC21750d2;
            if (AbstractC22676k.m65745e(interfaceC33817c, InterfaceC33817c.b.f141640a)) {
                return m114462o(interfaceC21750d7, str3, enumC36054i2, iM114463p, z16, new InterfaceC36053h.a(InterfaceC36053h.b.FORBIDDEN), jM114461n, null, null, jM114461n);
            }
            if (AbstractC22676k.m65745e(interfaceC33817c, InterfaceC33817c.a.f141639a)) {
                return m114462o(interfaceC21750d7, str3, enumC36054i2, iM114463p, z16, new InterfaceC36053h.a(InterfaceC36053h.b.BACKEND_FAIL), jM114461n, null, null, jM114461n);
            }
            if (AbstractC22676k.m65745e(interfaceC33817c, InterfaceC33817c.c.f141641a)) {
                return m114462o(interfaceC21750d7, str3, enumC36054i2, iM114463p, z16, new InterfaceC36053h.a(InterfaceC36053h.b.NO_NETWORK), jM114461n, null, null, jM114461n);
            }
            throw new NoWhenBranchMatchedException();
        }
        String token = ((InterfaceC33817c.d) interfaceC33817c).getToken();
        InterfaceC32564a interfaceC32564a3 = interfaceC32564a2;
        atomicLong = new AtomicLong(Long.MIN_VALUE);
        InterfaceC32510a interfaceC32510a = this.certificateTransferApi;
        byte[] bArrM125919D = AbstractC39421y.m125919D(token);
        C35015q c35015q = new C35015q(16, atomicLong, this);
        cVar.f153839w = interfaceC21750d2;
        cVar.f153840x = str3;
        cVar.f153841y = null;
        cVar.f153842z = null;
        cVar.f153827E = enumC36054i2;
        cVar.f153828F = null;
        cVar.f153829G = null;
        cVar.f153830H = atomicLong;
        z14 = z16;
        cVar.f153831I = z14;
        cVar.f153832J = iM114463p;
        cVar.f153833K = j7;
        cVar.f153834L = jMo42899a;
        cVar.f153835M = jM114461n;
        InterfaceC21750d interfaceC21750d8 = interfaceC21750d2;
        cVar.f153838P = 2;
        objMo101515a = interfaceC32510a.mo101515a(interfaceC21750d8, bArrM125919D, interfaceC32564a3, c35015q, cVar);
        interfaceC21750d3 = interfaceC21750d8;
        if (objMo101515a == enumC31071a) {
            return enumC31071a;
        }
        j13 = jM114461n;
        abstractC32512c = (AbstractC32512c) objMo101515a;
        String str7 = str3;
        EnumC36054i enumC36054i6 = enumC36054i2;
        jMo42899a2 = this.nanoClock.mo42899a();
        whoopStrapInfo = interfaceC21750d3.get_strapInfo();
        C36048c c36048c2 = this.unlockMetrics;
        if (whoopStrapInfo != null) {
            codeName = null;
        } else {
            codeName = null;
        }
        if (whoopStrapInfo != null) {
            strMo84319a = null;
        } else {
            strMo84319a = null;
        }
        c36048c2.m114445h(codeName, strMo84319a, abstractC32512c);
        if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.d.f134656a)) {
            if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.c.f134655a)) {
                aVar2 = new InterfaceC36053h.a(InterfaceC36053h.b.STRAP_REJECT);
            } else {
                if (abstractC32512c instanceof AbstractC32512c.a) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new InterfaceC36053h.a(m114467t(((AbstractC32512c.a) abstractC32512c).getReason()));
            }
            InterfaceC21750d interfaceC21750d9 = interfaceC21750d3;
            l7 = new Long(atomicLong.get());
            if (l7.longValue() == Long.MIN_VALUE) {
                l7 = null;
            }
            if (l7 != null) {
                l12 = new Long(m114461n(jMo42899a, l7.longValue()));
            } else {
                l12 = null;
            }
            if (l7 != null) {
                l13 = new Long(m114461n(l7.longValue(), jMo42899a2));
            } else {
                l13 = null;
            }
            return m114462o(interfaceC21750d9, str7, enumC36054i6, iM114463p, z14, aVar, j13, l12, l13, m114461n(j7, jMo42899a2));
        }
        this.strapLockStateRecorder.mo114433a();
        aVar2 = InterfaceC36053h.c.f153919a;
        aVar = aVar2;
        InterfaceC21750d interfaceC21750d10 = interfaceC21750d3;
        l7 = new Long(atomicLong.get());
        if (l7.longValue() == Long.MIN_VALUE) {
            l7 = null;
        }
        if (l7 != null) {
            l12 = new Long(m114461n(jMo42899a, l7.longValue()));
        } else {
            l12 = null;
        }
        if (l7 != null) {
            l13 = new Long(m114461n(l7.longValue(), jMo42899a2));
        } else {
            l13 = null;
        }
        return m114462o(interfaceC21750d10, str7, enumC36054i6, iM114463p, z14, aVar, j13, l12, l13, m114461n(j7, jMo42899a2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m114460m(AtomicLong atomicLong, C36050e c36050e) {
        atomicLong.compareAndSet(Long.MIN_VALUE, c36050e.nanoClock.mo42899a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private final long m114461n(long startNanos, long endNanos) {
        return (endNanos - startNanos) / 1000000;
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC36053h m114462o(InterfaceC21750d strap, String serial, EnumC36054i trigger, int attemptIndex, boolean isRetry, InterfaceC36053h result, long backendFetchMs, Long queueWaitMs, Long certTransferMs, long totalMs) {
        String str;
        EnumC32978v whoopDeviceType;
        InterfaceC27939b maximVersion;
        if ((result instanceof InterfaceC36053h.c) || ((result instanceof InterfaceC36053h.a) && ((InterfaceC36053h.a) result).getReason() == InterfaceC36053h.b.FORBIDDEN)) {
            str = serial;
            this.attemptIndexByKey.remove(new C23465k(trigger, str));
        } else {
            str = serial;
        }
        WhoopStrapInfo whoopStrapInfo = strap.get_strapInfo();
        String strMo84319a = (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
        this.unlockMetrics.m114444g((whoopStrapInfo == null || (whoopDeviceType = whoopStrapInfo.getWhoopDeviceType()) == null) ? null : whoopDeviceType.getCodeName(), strMo84319a, trigger, attemptIndex, result, backendFetchMs, queueWaitMs, certTransferMs, totalMs);
        if (trigger == EnumC36054i.UNLOCK) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(str, result, isRetry, strMo84319a, null), 3);
        }
        return result;
    }

    /* JADX INFO: renamed from: p */
    private final int m114463p(C23465k key, boolean isRetry) {
        int iIntValue = 1;
        if (isRetry) {
            Integer num = this.attemptIndexByKey.get(key);
            iIntValue = 1 + (num != null ? num.intValue() : 0);
        }
        this.attemptIndexByKey.put(key, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m114464q(InterfaceC21750d interfaceC21750d, InterfaceC40756t.b bVar, boolean z4, InterfaceC30057d<? super InterfaceC36053h> interfaceC30057d) throws Throwable {
        f fVar;
        InterfaceC40756t.b bVar2;
        boolean z13;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i14 = fVar.f153857I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f153857I = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM114459l = fVar2.f153855G;
        Object obj = EnumC31071a.f128113w;
        int i15 = fVar2.f153857I;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM114459l);
                InterfaceC25435a interfaceC25435a3 = this.attemptLock;
                fVar2.f153858w = interfaceC21750d;
                fVar2.f153859x = bVar;
                fVar2.f153860y = interfaceC25435a3;
                fVar2.f153861z = z4;
                fVar2.f153853E = 0;
                fVar2.f153857I = 1;
                if (interfaceC25435a3.mo68211b(fVar2) != obj) {
                    bVar2 = bVar;
                    z13 = z4;
                    interfaceC25435a = interfaceC25435a3;
                    i13 = 0;
                }
                return obj;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) fVar2.f153860y;
                try {
                    AbstractC34132o.m107864I(objM114459l);
                    InterfaceC36053h interfaceC36053h = (InterfaceC36053h) objM114459l;
                    interfaceC25435a2.mo68214i(null);
                    return interfaceC36053h;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = fVar2.f153853E;
            boolean z14 = fVar2.f153861z;
            interfaceC25435a = (InterfaceC25435a) fVar2.f153860y;
            bVar2 = (InterfaceC40756t.b) fVar2.f153859x;
            InterfaceC21750d interfaceC21750d2 = (InterfaceC21750d) fVar2.f153858w;
            AbstractC34132o.m107864I(objM114459l);
            z13 = z14;
            i13 = i16;
            interfaceC21750d = interfaceC21750d2;
            String strMo132226y = bVar2.getSerial();
            String strMo132210A = bVar2.getStrapSignature();
            InterfaceC32564a interfaceC32564a = InterfaceC32564a.b.f134906a;
            EnumC36054i enumC36054i = EnumC36054i.REFRESH;
            fVar2.f153858w = null;
            fVar2.f153859x = null;
            fVar2.f153860y = interfaceC25435a;
            fVar2.f153861z = z13;
            fVar2.f153853E = i13;
            fVar2.f153854F = 0;
            fVar2.f153857I = 2;
            objM114459l = m114459l(interfaceC21750d, strMo132226y, strMo132210A, interfaceC32564a, enumC36054i, z13, fVar2);
            if (objM114459l != obj) {
                interfaceC25435a2 = interfaceC25435a;
                InterfaceC36053h interfaceC36053h2 = (InterfaceC36053h) objM114459l;
                interfaceC25435a2.mo68214i(null);
                return interfaceC36053h2;
            }
            return obj;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: r */
    private final long m114465r() {
        Duration.Companion companion = Duration.INSTANCE;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        a.C42542a c42542a = a.C42542a.f153825a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c42542a.getName();
        Object defaultValue = c42542a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return DurationKt.toDuration(((Integer) defaultValue).intValue(), DurationUnit.DAYS);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m114466s(C36050e c36050e, Throwable th3) {
        c36050e.refreshLock.mo68214i(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC36053h.b m114467t(AbstractC32512c.b bVar) {
        switch (b.f153826a[bVar.ordinal()]) {
            case 1:
                return InterfaceC36053h.b.INTERRUPTED;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return InterfaceC36053h.b.TRANSFER_FAILED;
            case 7:
                return InterfaceC36053h.b.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // vh2.InterfaceC36049d
    /* JADX INFO: renamed from: a */
    public void mo114448a(InterfaceC2994c0 connectionScope, InterfaceC21750d strap, InterfaceC40756t.b hello) {
        InterfaceC27939b maximVersion;
        AbstractC22676k.m65750j(connectionScope, "connectionScope");
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(hello, "hello");
        this.strapLockStateRecorder.mo114434c(hello.getLockInfo());
        C36048c c36048c = this.unlockMetrics;
        InterfaceC32972p interfaceC32972pMo132248m = hello.getLockInfo();
        WhoopStrapInfo whoopStrapInfo = strap.get_strapInfo();
        c36048c.m114447j(interfaceC32972pMo132248m, (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a());
        InterfaceC32972p interfaceC32972pMo132248m2 = hello.getLockInfo();
        InterfaceC32972p.b bVar = interfaceC32972pMo132248m2 instanceof InterfaceC32972p.b ? (InterfaceC32972p.b) interfaceC32972pMo132248m2 : null;
        if (bVar != null && bVar.getState() == EnumC32973q.UNLOCKED) {
            Duration.Companion companion = Duration.INSTANCE;
            if (Duration.m134261compareToLRDsOJo(DurationKt.toDuration(bVar.getCounterSeconds(), DurationUnit.SECONDS), m114465r()) > 0) {
                return;
            }
            if (!this.refreshLock.tryLock()) {
                this.logger.mo85216g("Refresh already in progress; skipping", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85216g("Refresh scheduled successfully", new AbstractC30556a.a[0]);
                AbstractC3006f0.m8732z(connectionScope, null, null, new h(strap, hello, null), 3).invokeOnCompletion(new C35141b(this, 9));
            }
        }
    }

    @Override // vh2.InterfaceC36049d
    /* JADX INFO: renamed from: b */
    public void mo114449b() {
        WhoopStrapInfo whoopStrapInfo;
        String strapSignature;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        if (interfaceC21750d == null || !AbstractC22676k.m65745e(interfaceC21750d.getConnectionState(), C32969m.f137297a) || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null || (strapSignature = whoopStrapInfo.getStrapSignature()) == null) {
            return;
        }
        if (!this.attemptLock.tryLock()) {
            this.logger.mo85216g("Unlock attempt already in progress; skipping retry", new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85216g("Retrying unlock for Locked strap", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new g(interfaceC21750d, whoopStrapInfo, strapSignature, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // vh2.InterfaceC36049d
    /* JADX INFO: renamed from: c */
    public Object mo114450c(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f153852z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f153852z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objMo24727g0 = eVar2.f153850x;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar2.f153852z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo24727g0);
            InterfaceC36081g c38332a0 = new C38332a0();
            InterfaceC32564a interfaceC32564a = InterfaceC32564a.a.f134904a;
            eVar2.f153849w = null;
            eVar2.f153852z = 1;
            objMo24727g0 = interfaceC21750d.mo24727g0(c38332a0, 5000L, interfaceC32564a, eVar2);
            if (objMo24727g0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo24727g0);
        }
        C40727h c40727h = (C40727h) objMo24727g0;
        boolean z4 = c40727h != null && c40727h.m132198W();
        if (z4) {
            this.strapLockStateRecorder.mo114435d();
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // vh2.InterfaceC36049d
    /* JADX INFO: renamed from: d */
    public Object mo114451d(InterfaceC21750d interfaceC21750d, InterfaceC40756t.b bVar, InterfaceC30057d<? super InterfaceC36053h> interfaceC30057d) throws Throwable {
        i iVar;
        InterfaceC40756t.b bVar2;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i14 = iVar.f153875H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f153875H = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM114459l = iVar2.f153873F;
        Object obj = EnumC31071a.f128113w;
        int i15 = iVar2.f153875H;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM114459l);
                this.logger.mo85216g("Attempting to unlock the connected strap", new AbstractC30556a.a[0]);
                InterfaceC25435a interfaceC25435a3 = this.attemptLock;
                iVar2.f153876w = interfaceC21750d;
                iVar2.f153877x = bVar;
                iVar2.f153878y = interfaceC25435a3;
                iVar2.f153879z = 0;
                iVar2.f153875H = 1;
                if (interfaceC25435a3.mo68211b(iVar2) != obj) {
                    bVar2 = bVar;
                    interfaceC25435a = interfaceC25435a3;
                    i13 = 0;
                }
                return obj;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) iVar2.f153878y;
                try {
                    AbstractC34132o.m107864I(objM114459l);
                    InterfaceC36053h interfaceC36053h = (InterfaceC36053h) objM114459l;
                    interfaceC25435a2.mo68214i(null);
                    return interfaceC36053h;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = iVar2.f153879z;
            interfaceC25435a = (InterfaceC25435a) iVar2.f153878y;
            bVar2 = (InterfaceC40756t.b) iVar2.f153877x;
            InterfaceC21750d interfaceC21750d2 = (InterfaceC21750d) iVar2.f153876w;
            AbstractC34132o.m107864I(objM114459l);
            i13 = i16;
            interfaceC21750d = interfaceC21750d2;
            this.strapLockStateRecorder.mo114434c(bVar2.getLockInfo());
            String strMo132226y = bVar2.getSerial();
            String strMo132210A = bVar2.getStrapSignature();
            InterfaceC32564a interfaceC32564a = InterfaceC32564a.a.f134904a;
            EnumC36054i enumC36054i = EnumC36054i.UNLOCK;
            iVar2.f153876w = null;
            iVar2.f153877x = null;
            iVar2.f153878y = interfaceC25435a;
            iVar2.f153879z = i13;
            iVar2.f153872E = 0;
            iVar2.f153875H = 2;
            objM114459l = m114459l(interfaceC21750d, strMo132226y, strMo132210A, interfaceC32564a, enumC36054i, false, iVar2);
            if (objM114459l != obj) {
                interfaceC25435a2 = interfaceC25435a;
                InterfaceC36053h interfaceC36053h2 = (InterfaceC36053h) objM114459l;
                interfaceC25435a2.mo68214i(null);
                return interfaceC36053h2;
            }
            return obj;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    public /* synthetic */ C36050e(InterfaceC33815a interfaceC33815a, InterfaceC32510a interfaceC32510a, AbstractC21909c abstractC21909c, InterfaceC4733b interfaceC4733b, InterfaceC36046a interfaceC36046a, InterfaceC2994c0 interfaceC2994c0, C36048c c36048c, C36052g c36052g, InterfaceC14871g interfaceC14871g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC33815a, interfaceC32510a, abstractC21909c, interfaceC4733b, interfaceC36046a, interfaceC2994c0, c36048c, c36052g, interfaceC14871g, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StrapUnlockService") : interfaceC34116n);
    }
}
