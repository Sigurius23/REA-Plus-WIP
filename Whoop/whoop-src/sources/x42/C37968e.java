package x42;

import bc3.InterfaceC2994c0;
import c52.AbstractC4251b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import g52.C15495a;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y42.C39228j;
import y42.InterfaceC39219a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x42.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lx42/e;", "", "Ly42/j;", "puffinManager", "Lg52/a;", "puffinScanScheduler", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Ly42/j;Lg52/a;Ljs0/c;Ltr2/n;)V", "Ll83/a0;", "c", "()V", "Lkotlin/time/Duration;", "b", "()J", "Lbc3/c0;", "scope", "d", "(Lbc3/c0;)V", "a", "Ly42/j;", "Lg52/a;", "Ljs0/c;", "Ltr2/n;", "e", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37968e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15495a puffinScanScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x42.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.PuffinOneTimeReconnectionTrigger$start$$inlined$flatMapLatest$1", m100430f = "PuffinOneTimeReconnectionTrigger.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f162599w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f162600x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f162601y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f162600x = interfaceC13062m;
            bVar.f162601y = interfaceC39219a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162599w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f162600x;
                InterfaceC13087t1 connectionStatus = ((InterfaceC39219a) this.f162601y).getConnectionStatus();
                this.f162600x = null;
                this.f162601y = null;
                this.f162599w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, connectionStatus, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC39219a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: x42.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.PuffinOneTimeReconnectionTrigger$start$2", m100430f = "PuffinOneTimeReconnectionTrigger.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "hasScheduledReconnect", "Lc52/b;", "currState", "<anonymous>", "(ZLc52/b;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f162602w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f162603x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f162604y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m121612f(boolean z4, AbstractC4251b abstractC4251b, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            c cVar = C37968e.this.new c(interfaceC30057d);
            cVar.f162603x = z4;
            cVar.f162604y = abstractC4251b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m121612f(((Boolean) obj).booleanValue(), (AbstractC4251b) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f162603x;
            AbstractC4251b abstractC4251b = (AbstractC4251b) this.f162604y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f162602w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.c.f17284a)) {
                if (!z4) {
                    C37968e.this.m121610c();
                }
                z4 = true;
            } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.f.f17287a)) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    public C37968e(C39228j puffinManager, C15495a puffinScanScheduler, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(puffinScanScheduler, "puffinScanScheduler");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.puffinManager = puffinManager;
        this.puffinScanScheduler = puffinScanScheduler;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final long m121609b() {
        Duration.Companion companion = Duration.INSTANCE;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        Companion.C42626a c42626a = Companion.C42626a.f162598a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c42626a.getName();
        Object defaultValue = c42626a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
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
            return DurationKt.toDuration(((Long) defaultValue).longValue(), DurationUnit.MILLISECONDS);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m121610c() {
        this.logger.mo85216g("Scheduling Puffin reconnect", new AbstractC30556a.a[0]);
        this.puffinScanScheduler.m43707c(m121609b());
    }

    /* JADX INFO: renamed from: d */
    public final void m121611d(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.logger.mo85228t("Started observing Puffin disconnects", new AbstractC30556a.a[0]);
        AbstractC13091v.m36582H(new C13060l1(Boolean.FALSE, AbstractC13091v.m36590P(this.puffinManager.m124994e(), new b(null)), new c(null)), scope);
    }
}
