package su0;

import androidx.lifecycle.InterfaceC1585g0;
import b12.InterfaceC2285a;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.DeadBatteryReadingTimer;
import com.whoop.data.repositories.HarvardDeadBatteryThreshold;
import com.whoop.data.repositories.MaverickDeadBatteryThreshold;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import xu0.InterfaceC38652a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: su0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m65681d2 = {"Lsu0/b;", "Lb12/a;", "Lbc3/c0;", "coroutineScope", "Lci2/b;", "whoopStrapProvider", "Ljs0/c;", "configurationRepository", "Lxu0/a;", "deadBatteryWorkScheduler", "Lsu0/c;", "deadBatteryNotificationStateManager", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Lci2/b;Ljs0/c;Lxu0/a;Lsu0/c;Ltr2/n;)V", "", "level", "", "isCharging", "", "threshold", "timerDurationMinutes", "Ll83/a0;", "c", "(BZIILq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onStart", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Lec3/l;", "e", "()Lec3/l;", "Lst0/v;", "strapGen", "d", "(Lst0/v;)I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lci2/b;", "y", "Ljs0/c;", "z", "Lxu0/a;", "E", "Lsu0/c;", "F", "Ltr2/n;", "Ljk0/d;", "G", "Lec3/l;", "whoopStrapFlow", "Lbc3/k1;", "H", "Lbc3/k1;", "readingsJob", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33012b implements InterfaceC2285a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C33013c deadBatteryNotificationStateManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l whoopStrapFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private InterfaceC3027k1 readingsJob;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC38652a deadBatteryWorkScheduler;

    /* JADX INFO: renamed from: su0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f137453a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137453a = iArr;
        }
    }

    /* JADX INFO: renamed from: su0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl", m100430f = "DeadBatteryNotificationMonitorImpl.kt", m100431l = {73, 77}, m100432m = "evaluateBatteryConditions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f137454E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f137455F;

        /* JADX INFO: renamed from: H */
        int f137457H;

        /* JADX INFO: renamed from: w */
        byte f137458w;

        /* JADX INFO: renamed from: x */
        boolean f137459x;

        /* JADX INFO: renamed from: y */
        int f137460y;

        /* JADX INFO: renamed from: z */
        int f137461z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f137455F = obj;
            this.f137457H |= Integer.MIN_VALUE;
            return C33012b.this.m104226c((byte) 0, false, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: su0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl$handleBatteryReadings$$inlined$flatMapLatest$1", m100430f = "DeadBatteryNotificationMonitorImpl.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137462w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f137463x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137464y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33012b f137465z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C33012b c33012b) {
            super(3, interfaceC30057d);
            this.f137465z = c33012b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f137465z);
            cVar.f137463x = interfaceC13062m;
            cVar.f137464y = interfaceC21750d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0076  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM125868N0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137462w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f137463x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f137464y;
                InterfaceC13058l interfaceC13058lM65136e = interfaceC21750d.getBatteryLevel().m65136e();
                InterfaceC13058l interfaceC13058lM65150e = interfaceC21750d.getChargeStatus().m65150e();
                int iM104227d = this.f137465z.m104227d(interfaceC21750d.mo24752w0());
                AbstractC21909c abstractC21909c = this.f137465z.configurationRepository;
                DeadBatteryReadingTimer deadBatteryReadingTimer = DeadBatteryReadingTimer.INSTANCE;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = deadBatteryReadingTimer.getName();
                Object defaultValue = deadBatteryReadingTimer.getDefaultValue();
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
                C13060l1 c13060l1 = new C13060l1(interfaceC13058lM65136e, interfaceC13058lM65150e, this.f137465z.new d(iM104227d, ((Integer) defaultValue).intValue(), null), 1);
                this.f137463x = null;
                this.f137464y = null;
                this.f137462w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13060l1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: su0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl$handleBatteryReadings$1$1", m100430f = "DeadBatteryNotificationMonitorImpl.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "level", "", "isCharging", "Ll83/a0;", "<anonymous>", "(BZ)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f137466E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f137467F;

        /* JADX INFO: renamed from: w */
        int f137468w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ byte f137469x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ boolean f137470y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, int i14, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f137466E = i13;
            this.f137467F = i14;
        }

        /* JADX INFO: renamed from: f */
        public final Object m104229f(byte b, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = C33012b.this.new d(this.f137466E, this.f137467F, interfaceC30057d);
            dVar.f137469x = b;
            dVar.f137470y = z4;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m104229f(((Number) obj).byteValue(), ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            byte b = this.f137469x;
            boolean z4 = this.f137470y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137468w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                int i14 = this.f137466E;
                int i15 = this.f137467F;
                this.f137469x = b;
                this.f137470y = z4;
                this.f137468w = 1;
                if (C33012b.this.m104226c(b, z4, i14, i15, this) == enumC31071a) {
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

    public C33012b(InterfaceC2994c0 coroutineScope, InterfaceC4733b whoopStrapProvider, AbstractC21909c configurationRepository, InterfaceC38652a deadBatteryWorkScheduler, C33013c deadBatteryNotificationStateManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(deadBatteryWorkScheduler, "deadBatteryWorkScheduler");
        AbstractC22676k.m65750j(deadBatteryNotificationStateManager, "deadBatteryNotificationStateManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.whoopStrapProvider = whoopStrapProvider;
        this.configurationRepository = configurationRepository;
        this.deadBatteryWorkScheduler = deadBatteryWorkScheduler;
        this.deadBatteryNotificationStateManager = deadBatteryNotificationStateManager;
        this.logger = logger;
        this.whoopStrapFlow = new C4588i(whoopStrapProvider.mo14818b(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m104226c(byte r7, boolean r8, int r9, int r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof su0.C33012b.b
            if (r0 == 0) goto L13
            r0 = r11
            su0.b$b r0 = (su0.C33012b.b) r0
            int r1 = r0.f137457H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137457H = r1
            goto L18
        L13:
            su0.b$b r0 = new su0.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f137455F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f137457H
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            int r10 = r0.f137461z
            byte r7 = r0.f137458w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L7a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L5e
        L3c:
            p505ts.AbstractC34132o.m107864I(r11)
            if (r8 == 0) goto L5f
            xu0.a r11 = r6.deadBatteryWorkScheduler
            r11.mo91221c()
            xu0.a r11 = r6.deadBatteryWorkScheduler
            r11.mo91219a()
            su0.c r11 = r6.deadBatteryNotificationStateManager
            r0.f137458w = r7
            r0.f137459x = r8
            r0.f137460y = r9
            r0.f137461z = r10
            r0.f137457H = r5
            java.lang.Object r7 = r11.m104232c(r0)
            if (r7 != r1) goto L5e
            goto L79
        L5e:
            return r3
        L5f:
            if (r7 > r9) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 == 0) goto L8a
            su0.c r11 = r6.deadBatteryNotificationStateManager
            r0.f137458w = r7
            r0.f137459x = r8
            r0.f137460y = r9
            r0.f137461z = r10
            r0.f137454E = r5
            r0.f137457H = r4
            java.lang.Object r11 = r11.m104230a(r0)
            if (r11 != r1) goto L7a
        L79:
            return r1
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r11, r8)
            if (r8 != 0) goto L8f
            xu0.a r8 = r6.deadBatteryWorkScheduler
            r8.mo91220b(r10, r7)
            goto L8f
        L8a:
            xu0.a r7 = r6.deadBatteryWorkScheduler
            r7.mo91221c()
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.C33012b.m104226c(byte, boolean, int, int, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final int m104227d(EnumC32978v strapGen) {
        int i13 = strapGen == null ? -1 : a.f137453a[strapGen.ordinal()];
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Long.TYPE;
        Class cls5 = Integer.TYPE;
        Object objM125868N0 = null;
        if (i13 == 1) {
            AbstractC21909c abstractC21909c = this.configurationRepository;
            HarvardDeadBatteryThreshold harvardDeadBatteryThreshold = HarvardDeadBatteryThreshold.INSTANCE;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = harvardDeadBatteryThreshold.getName();
            Object defaultValue = harvardDeadBatteryThreshold.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
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
                return ((Integer) defaultValue).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        if (i13 != 2 && i13 != 3) {
            return 5;
        }
        AbstractC21909c abstractC21909c2 = this.configurationRepository;
        MaverickDeadBatteryThreshold maverickDeadBatteryThreshold = MaverickDeadBatteryThreshold.INSTANCE;
        C21908b configurations2 = abstractC21909c2.getConfigurations();
        String name2 = maverickDeadBatteryThreshold.getName();
        Object defaultValue2 = maverickDeadBatteryThreshold.getDefaultValue();
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str6);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str7);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str8);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str9);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str10);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N0 != null) {
            defaultValue2 = objM125868N0;
        }
        if (defaultValue2 != null) {
            return ((Integer) defaultValue2).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC13058l m104228e() {
        return AbstractC13091v.m36590P(AbstractC13091v.m36610t(this.whoopStrapFlow), new c(null, this));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onDestroy(owner);
        InterfaceC3027k1 interfaceC3027k1 = this.readingsJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.readingsJob = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onStart(owner);
        InterfaceC3027k1 interfaceC3027k1 = this.readingsJob;
        if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
            this.readingsJob = AbstractC13091v.m36582H(m104228e(), this.coroutineScope);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    public /* synthetic */ C33012b(InterfaceC2994c0 interfaceC2994c0, InterfaceC4733b interfaceC4733b, AbstractC21909c abstractC21909c, InterfaceC38652a interfaceC38652a, C33013c c33013c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, interfaceC4733b, abstractC21909c, interfaceC38652a, c33013c, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DeadBatteryNotificationMonitorImpl") : interfaceC34116n);
    }
}
