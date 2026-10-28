package gk2;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.repositories.SoftTombstonePromptCadenceDays;
import com.whoop.data.repositories.TombstoneReleaseName;
import com.whoop.data.repositories.TombstoneStatusPollingCadenceMillis;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import com.whoop.domain.model.UserSwitchEvent;
import com.whoop.tombstone.ReleaseTombstoneResponse;
import com.whoop.tombstone.TombstoneApi;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.concurrent.CancellationException;
import js0.AbstractC21909c;
import js0.C21908b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import od1.InterfaceC27837a0;
import or2.C28167h1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: gk2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001#B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u0018098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b-\u0010<¨\u0006?"}, m65681d2 = {"Lgk2/h;", "Lgk2/c;", "Landroid/content/Context;", "context", "Lor2/h1;", "packageInfoProvider", "Lcom/whoop/tombstone/TombstoneApi;", "tombstoneApi", "Ljs0/c;", "configurationRepository", "Lod1/a0;", "userSessionManager", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lzr2/a;", "timeProvider", "Lgk2/f;", "tombstoneReporterScheduler", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lor2/h1;Lcom/whoop/tombstone/TombstoneApi;Ljs0/c;Lod1/a0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lzr2/a;Lgk2/f;Lbc3/c0;Ltr2/n;)V", "Lgk2/g;", "f", "()Lgk2/g;", "Ll83/a0;", "i", "()V", "j", "g", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/tombstone/TombstoneApi;", "b", "Ljs0/c;", "c", "Lod1/a0;", "d", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "e", "Lzr2/a;", "Lgk2/f;", "Lbc3/c0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ltr2/n;", "", "I", "appVersionCode", "Lbc3/k1;", "Lbc3/k1;", "tombstoneStatusPollingJob", "Lec3/o1;", "k", "Lec3/o1;", "internalTombstoneSharedFlow", "Lec3/t1;", "l", "Lec3/t1;", "()Lec3/t1;", "tombstoneStateSharedFlow", "m", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15933h implements InterfaceC15928c {

    /* JADX INFO: renamed from: n */
    public static final int f60307n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TombstoneApi tombstoneApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C15931f tombstoneReporterScheduler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int appVersionCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private InterfaceC3027k1 tombstoneStatusPollingJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13072o1 internalTombstoneSharedFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13087t1 tombstoneStateSharedFlow;

    /* JADX INFO: renamed from: gk2.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.Undertaker$1", m100430f = "TombstoneManager.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60320w;

        /* JADX INFO: renamed from: gk2.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41656a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C15933h f60322w;

            public C41656a(C15933h c15933h) {
                this.f60322w = c15933h;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UserSwitchEvent userSwitchEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (userSwitchEvent instanceof Login) {
                    this.f60322w.m44984i();
                } else {
                    if (!(userSwitchEvent instanceof Logout)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f60322w.m44985j();
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15933h.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60320w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C15933h.this.userSessionManager.getUserId() != 0) {
                    C15933h.this.m44984i();
                }
                C15933h.this.tombstoneReporterScheduler.m44978a();
                InterfaceC13087t1 userSwitchFlow = C15933h.this.userSessionManager.getUserSwitchFlow();
                C41656a c41656a = new C41656a(C15933h.this);
                this.f60320w = 1;
                if (userSwitchFlow.collect(c41656a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: gk2.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.Undertaker", m100430f = "TombstoneManager.kt", m100431l = {78, 81, 88, 95, 112}, m100432m = "fetchReleaseStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f60324F;

        /* JADX INFO: renamed from: w */
        Object f60325w;

        /* JADX INFO: renamed from: x */
        Object f60326x;

        /* JADX INFO: renamed from: y */
        Object f60327y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f60328z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60328z = obj;
            this.f60324F |= Integer.MIN_VALUE;
            return C15933h.this.m44986g(this);
        }
    }

    /* JADX INFO: renamed from: gk2.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.tombstone.Undertaker$startPollingForTombstoneStatus$1", m100430f = "TombstoneManager.kt", m100431l = {147, 149}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60329w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f60331y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j7, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60331y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15933h.this.new d(this.f60331y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003b -> B:11:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f60329w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L19
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L33
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
            L1c:
                gk2.h r7 = gk2.C15933h.this
                od1.a0 r7 = gk2.C15933h.m44980c(r7)
                int r7 = r7.getUserId()
                if (r7 == 0) goto L33
                gk2.h r7 = gk2.C15933h.this
                r6.f60329w = r3
                java.lang.Object r7 = r7.m44986g(r6)
                if (r7 != r0) goto L33
                goto L3d
            L33:
                long r4 = r6.f60331y
                r6.f60329w = r2
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r0) goto L1c
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gk2.C15933h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C15933h(Context context, C28167h1 packageInfoProvider, TombstoneApi tombstoneApi, AbstractC21909c configurationRepository, InterfaceC27837a0 userSessionManager, PreferenceHelper preferenceHelper, InterfaceC41070a timeProvider, C15931f tombstoneReporterScheduler, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(packageInfoProvider, "packageInfoProvider");
        AbstractC22676k.m65750j(tombstoneApi, "tombstoneApi");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        AbstractC22676k.m65750j(tombstoneReporterScheduler, "tombstoneReporterScheduler");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.tombstoneApi = tombstoneApi;
        this.configurationRepository = configurationRepository;
        this.userSessionManager = userSessionManager;
        this.preferenceHelper = preferenceHelper;
        this.timeProvider = timeProvider;
        this.tombstoneReporterScheduler = tombstoneReporterScheduler;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.appVersionCode = packageInfoProvider.m85268a(context);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.internalTombstoneSharedFlow = c13096w1M36592b;
        this.tombstoneStateSharedFlow = c13096w1M36592b;
        AbstractC3006f0.m8732z(coroutineScope, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: f */
    private final EnumC15932g m44983f() {
        Object objM125868N0;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        SoftTombstonePromptCadenceDays softTombstonePromptCadenceDays = SoftTombstonePromptCadenceDays.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = softTombstonePromptCadenceDays.getName();
        Object defaultValue = softTombstonePromptCadenceDays.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) defaultValue).intValue();
        int intValueFromMainPrefs$default = PreferenceHelper.getIntValueFromMainPrefs$default(this.preferenceHelper, "KEY_LAST_SEEN_SOFT_TOMBSTONE_VERSION", 0, 2, null);
        long longValueFromMainPrefs$default = PreferenceHelper.getLongValueFromMainPrefs$default(this.preferenceHelper, "KEY_LAST_PROMPTED_SOFT_TOMBSTONE_TIME_MILLIS", 0L, 2, null);
        long jMo133363b = this.timeProvider.mo133363b();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        DateTime dateTime = new DateTime(jMo133363b, dateTimeZone);
        boolean z4 = Days.daysBetween(new DateTime(longValueFromMainPrefs$default, dateTimeZone), dateTime).getDays() >= iIntValue;
        int i13 = this.appVersionCode;
        if (i13 == intValueFromMainPrefs$default || !z4) {
            this.logger.mo85228t(AbstractC2875y.m8296i(iIntValue, "Setting Tombstone State to VALID even though we received SOFT_TOMBSTONE since it has not been ", " days since we've shown the prompt."), new AbstractC30556a.a[0]);
            return EnumC15932g.VALID;
        }
        this.preferenceHelper.putIntValueIntoMainPrefs("KEY_LAST_SEEN_SOFT_TOMBSTONE_VERSION", i13);
        this.preferenceHelper.putLongValueIntoMainPrefs("KEY_LAST_PROMPTED_SOFT_TOMBSTONE_TIME_MILLIS", dateTime.getMillis());
        this.logger.mo85228t("Setting Tombstone State to SOFT_TOMBSTONE", new AbstractC30556a.a[0]);
        return EnumC15932g.SOFT_TOMBSTONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    /* JADX INFO: renamed from: i */
    public final void m44984i() {
        Object objM125868N0;
        this.logger.mo85228t("Starting polling for tombstone status", new AbstractC30556a.a[0]);
        AbstractC21909c abstractC21909c = this.configurationRepository;
        TombstoneStatusPollingCadenceMillis tombstoneStatusPollingCadenceMillis = TombstoneStatusPollingCadenceMillis.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = tombstoneStatusPollingCadenceMillis.getName();
        Object defaultValue = tombstoneStatusPollingCadenceMillis.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        long jLongValue = ((Long) defaultValue).longValue();
        m44985j();
        this.tombstoneStatusPollingJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(jLongValue, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m44985j() {
        InterfaceC3027k1 interfaceC3027k1 = this.tombstoneStatusPollingJob;
        if (interfaceC3027k1 != null) {
            this.logger.mo85228t("Cancelling existing tombstone status poll", new AbstractC30556a.a[0]);
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public Object m44986g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Object objM125868N0;
        String str;
        EnumC15932g enumC15932gM44983f;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f60324F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f60324F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objIsVersionValid = cVar.f60328z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f60324F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objIsVersionValid);
                AbstractC21909c abstractC21909c = this.configurationRepository;
                TombstoneReleaseName tombstoneReleaseName = TombstoneReleaseName.INSTANCE;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = tombstoneReleaseName.getName();
                Object defaultValue = tombstoneReleaseName.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str2);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str3);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str4);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str5);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str6 = (String) configurations.get(name);
                    if (str6 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str6);
                    } else {
                        objM125868N0 = null;
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) defaultValue;
                TombstoneApi tombstoneApi = this.tombstoneApi;
                int i15 = this.appVersionCode;
                cVar.f60325w = str;
                cVar.f60324F = 1;
                objIsVersionValid = tombstoneApi.isVersionValid(str, i15, cVar);
                if (objIsVersionValid == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    AbstractC34132o.m107864I(objIsVersionValid);
                    return c23454a0;
                }
                if (i14 == 3) {
                    AbstractC34132o.m107864I(objIsVersionValid);
                    return c23454a0;
                }
                if (i14 == 4) {
                    AbstractC34132o.m107864I(objIsVersionValid);
                    return c23454a0;
                }
                if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objIsVersionValid);
                return c23454a0;
            }
            str = (String) cVar.f60325w;
            AbstractC34132o.m107864I(objIsVersionValid);
            ReleaseTombstoneResponse releaseTombstoneResponse = (ReleaseTombstoneResponse) objIsVersionValid;
            if (!AbstractC22676k.m65745e(releaseTombstoneResponse.getReleaseName(), str)) {
                this.logger.mo85226q(AbstractC11266d.m30461o("We received a tombstone state response for a platform that is not Android: ", releaseTombstoneResponse.getReleaseName()), new AbstractC30556a.a[0]);
                InterfaceC13072o1 interfaceC13072o1 = this.internalTombstoneSharedFlow;
                EnumC15932g enumC15932g = EnumC15932g.VALID;
                cVar.f60325w = null;
                cVar.f60326x = null;
                cVar.f60324F = 3;
                if (interfaceC13072o1.emit(enumC15932g, cVar) != enumC31071a) {
                    return c23454a0;
                }
            } else if (releaseTombstoneResponse.getVersionCode() != this.appVersionCode) {
                this.logger.mo85226q("We received a tombstone state response for a version that is not the same as our current app version!", new AbstractC30556a.a[0]);
                InterfaceC13072o1 interfaceC13072o2 = this.internalTombstoneSharedFlow;
                EnumC15932g enumC15932g2 = EnumC15932g.VALID;
                cVar.f60325w = null;
                cVar.f60326x = null;
                cVar.f60324F = 4;
                if (interfaceC13072o2.emit(enumC15932g2, cVar) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                if (releaseTombstoneResponse.getHardTombstone()) {
                    this.logger.mo85228t("Setting Tombstone State to HARD_TOMBSTONE", new AbstractC30556a.a[0]);
                    enumC15932gM44983f = EnumC15932g.HARD_TOMBSTONE;
                } else if (releaseTombstoneResponse.getSoftTombstone()) {
                    enumC15932gM44983f = m44983f();
                } else {
                    this.logger.mo85228t("Setting Tombstone State to VALID", new AbstractC30556a.a[0]);
                    enumC15932gM44983f = EnumC15932g.VALID;
                }
                InterfaceC13072o1 interfaceC13072o3 = this.internalTombstoneSharedFlow;
                cVar.f60325w = null;
                cVar.f60326x = null;
                cVar.f60327y = null;
                cVar.f60324F = 5;
                if (interfaceC13072o3.emit(enumC15932gM44983f, cVar) != enumC31071a) {
                    return c23454a0;
                }
            }
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Encountered an error when trying to get tombstone status", this.logger, null, 8, null);
            InterfaceC13072o1 interfaceC13072o4 = this.internalTombstoneSharedFlow;
            EnumC15932g enumC15932g3 = EnumC15932g.VALID;
            cVar.f60325w = null;
            cVar.f60326x = null;
            cVar.f60324F = 2;
            if (interfaceC13072o4.emit(enumC15932g3, cVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return enumC31071a;
    }

    @Override // gk2.InterfaceC15928c
    /* JADX INFO: renamed from: h, reason: from getter and merged with bridge method [inline-methods] */
    public InterfaceC13087t1 mo44958a() {
        return this.tombstoneStateSharedFlow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15933h(Context context, C28167h1 c28167h1, TombstoneApi tombstoneApi, AbstractC21909c abstractC21909c, InterfaceC27837a0 interfaceC27837a0, PreferenceHelper preferenceHelper, InterfaceC41070a interfaceC41070a, C15931f c15931f, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        if ((i13 & 256) != 0) {
            C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, ExecutorC22364d.f87316w));
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        this(context, c28167h1, tombstoneApi, abstractC21909c, interfaceC27837a0, preferenceHelper, interfaceC41070a, c15931f, interfaceC2994c0M8708b, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("Undertaker") : interfaceC34116n);
    }
}
