package vk0;

import bc3.AbstractC3028k2;
import bc3.C3058t;
import bc3.C3060t1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import com.whoop.taskexecutor.TaskInterruptedException;
import ec3.C13045h2;
import j93.InterfaceC21461d;
import java.time.Clock;
import js0.AbstractC21909c;
import js0.C21908b;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23468n;
import lt0.InterfaceC24724a;
import p077d0.C11328a;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import sj2.InterfaceC32565b;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import zj0.C40727h;

/* JADX INFO: renamed from: vk0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lvk0/c;", "Lvk0/b;", "Lsj2/b;", "Lvk0/e;", "executionService", "Lvk0/h;", "crpDataDogMetrics", "Ljs0/c;", "configRepo", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lsj2/b;Lvk0/h;Ljs0/c;Ljava/time/Clock;Ltr2/n;)V", "Lst0/v;", "whoopDeviceType", "Ll83/a0;", "i", "(Lst0/v;)V", "Lvk0/a;", "bleTask", "Lsj2/a;", "executionPriority", "Lvk0/i;", "gattService", "Lbc3/i0;", "a", "(Lvk0/a;Lsj2/a;Lvk0/i;Lst0/v;)Lbc3/i0;", "Lsj2/b;", "b", "Lvk0/h;", "c", "Ljs0/c;", "getConfigRepo", "()Ljs0/c;", "d", "Ljava/time/Clock;", "f", "()Ljava/time/Clock;", "e", "Ltr2/n;", "", "g", "()J", "longRunningTaskTimeout", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36077c implements InterfaceC36076b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC32565b<InterfaceC36079e> executionService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36082h crpDataDogMetrics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vk0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$1", m100430f = "BleTaskExecutorImpl.kt", m100431l = {116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lvk0/e;", "<anonymous>", "()Lvk0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f154063E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC36083i f154064F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC36081g f154065G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC36075a f154066H;

        /* JADX INFO: renamed from: w */
        int f154067w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22669g0 f154069y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC32978v f154070z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22669g0 c22669g0, EnumC32978v enumC32978v, C22669g0 c22669g1, InterfaceC36083i interfaceC36083i, InterfaceC36081g interfaceC36081g, InterfaceC36075a interfaceC36075a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f154069y = c22669g0;
            this.f154070z = enumC32978v;
            this.f154063E = c22669g1;
            this.f154064F = interfaceC36083i;
            this.f154065G = interfaceC36081g;
            this.f154066H = interfaceC36075a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36077c.this.new a(this.f154069y, this.f154070z, this.f154063E, this.f154064F, this.f154065G, this.f154066H, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo79830i;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f154067w;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C36077c.this.crpDataDogMetrics.m114603i((String) this.f154069y.f89336w, this.f154070z);
                this.f154063E.f89336w = new Long(C36077c.this.getClock().millis());
                InterfaceC36083i interfaceC36083i = this.f154064F;
                InterfaceC36081g interfaceC36081g = this.f154065G;
                long jMo114592I = ((InterfaceC36081g) this.f154066H).mo114592I();
                boolean dualResponse = this.f154065G.getDualResponse();
                this.f154067w = 1;
                objMo79830i = interfaceC36083i.mo79830i(interfaceC36081g, jMo114592I, dualResponse, this);
                if (objMo79830i == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo79830i = ((C23468n) obj).f92940w;
            }
            C22669g0 c22669g0 = this.f154063E;
            C36077c c36077c = C36077c.this;
            C22669g0 c22669g1 = this.f154069y;
            EnumC32978v enumC32978v = this.f154070z;
            InterfaceC36081g interfaceC36081g2 = this.f154065G;
            Throwable thM68037a = C23468n.m68037a(objMo79830i);
            if (thM68037a == null) {
                C40727h c40727h = (C40727h) objMo79830i;
                if (c22669g0.f89336w != null) {
                    C36082h c36082h = c36077c.crpDataDogMetrics;
                    String str = (String) c22669g1.f89336w;
                    boolean zM132198W = c40727h != null ? c40727h.m132198W() : false;
                    Object obj2 = c22669g0.f89336w;
                    AbstractC22676k.m65747g(obj2);
                    c36082h.m114602h(str, zM132198W, ((Number) obj2).longValue(), c36077c.getClock().millis(), enumC32978v);
                }
                return new InterfaceC36079e.b(c40727h);
            }
            if (c22669g0.f89336w != null) {
                C36082h c36082h2 = c36077c.crpDataDogMetrics;
                String str2 = (String) c22669g1.f89336w;
                Object obj3 = c22669g0.f89336w;
                AbstractC22676k.m65747g(obj3);
                i13 = 0;
                c36082h2.m114602h(str2, false, ((Number) obj3).longValue(), c36077c.getClock().millis(), enumC32978v);
            } else {
                i13 = 0;
            }
            c36077c.logger.mo85222m("Command Task " + InterfaceC36081g.m114591B(interfaceC36081g2, null, 1, null) + " failed due to " + thM68037a, new AbstractC30556a.a[i13]);
            if (thM68037a instanceof Exception) {
                return new InterfaceC36079e.a((Exception) thM68037a);
            }
            throw thM68037a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vk0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$deferred$1", m100430f = "BleTaskExecutorImpl.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lvk0/e;", "<anonymous>", "()Lvk0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC32978v f154071E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC36083i f154072F;

        /* JADX INFO: renamed from: w */
        int f154073w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC36075a f154074x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36077c f154075y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22667f0 f154076z;

        /* JADX INFO: renamed from: vk0.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$deferred$1$1", m100430f = "BleTaskExecutorImpl.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lvk0/e;", "<anonymous>", "(Lbc3/c0;)Lvk0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ EnumC32978v f154077E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC36083i f154078F;

            /* JADX INFO: renamed from: w */
            int f154079w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22667f0 f154080x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36077c f154081y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC36075a f154082z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22667f0 c22667f0, C36077c c36077c, InterfaceC36075a interfaceC36075a, EnumC32978v enumC32978v, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f154080x = c22667f0;
                this.f154081y = c36077c;
                this.f154082z = interfaceC36075a;
                this.f154077E = enumC32978v;
                this.f154078F = interfaceC36083i;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f154080x, this.f154081y, this.f154082z, this.f154077E, this.f154078F, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f154079w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f154080x.f89335w = this.f154081y.getClock().millis();
                this.f154081y.crpDataDogMetrics.m114606l(((InterfaceC36084j) this.f154082z).getTaskName(), true, this.f154077E);
                InterfaceC36084j interfaceC36084j = (InterfaceC36084j) this.f154082z;
                InterfaceC36083i interfaceC36083i = this.f154078F;
                this.f154079w = 1;
                Object objMo23655x = interfaceC36084j.mo23655x(interfaceC36083i, this);
                return objMo23655x == enumC31071a ? enumC31071a : objMo23655x;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC36075a interfaceC36075a, C36077c c36077c, C22667f0 c22667f0, EnumC32978v enumC32978v, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f154074x = interfaceC36075a;
            this.f154075y = c36077c;
            this.f154076z = c22667f0;
            this.f154071E = enumC32978v;
            this.f154072F = interfaceC36083i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f154074x, this.f154075y, this.f154076z, this.f154071E, this.f154072F, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154073w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(((C13045h2) ((InterfaceC36084j) this.f154074x).getServiceFlow()).getValue(), InterfaceC36085k.b.f154179a)) {
                    this.f154075y.logger.mo85216g(AbstractC11895b.m31996o("Task ", ((InterfaceC36084j) this.f154074x).getTaskName(), " already finished before CRP execution, skipping"), new AbstractC30556a.a[0]);
                    return new InterfaceC36079e.b(null);
                }
                long jM114581g = this.f154075y.m114581g();
                a aVar = new a(this.f154076z, this.f154075y, this.f154074x, this.f154071E, this.f154072F, null);
                this.f154073w = 1;
                obj = AbstractC3028k2.m8748b(jM114581g, aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC36079e) obj;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vk0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$deferred$2", m100430f = "BleTaskExecutorImpl.kt", m100431l = {175}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f154083w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC36075a f154084x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36083i f154085y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC36075a interfaceC36075a, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f154084x = interfaceC36075a;
            this.f154085y = interfaceC36083i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f154084x, this.f154085y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154083w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC36084j interfaceC36084j = (InterfaceC36084j) this.f154084x;
                InterfaceC36083i interfaceC36083i = this.f154085y;
                this.f154083w = 1;
                if (interfaceC36084j.mo23651H(interfaceC36083i, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C36077c(InterfaceC32565b<InterfaceC36079e> executionService, C36082h crpDataDogMetrics, AbstractC21909c configRepo, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(executionService, "executionService");
        AbstractC22676k.m65750j(crpDataDogMetrics, "crpDataDogMetrics");
        AbstractC22676k.m65750j(configRepo, "configRepo");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.executionService = executionService;
        this.crpDataDogMetrics = crpDataDogMetrics;
        this.configRepo = configRepo;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final long m114581g() {
        AbstractC21909c abstractC21909c = this.configRepo;
        C36086l c36086l = C36086l.f154182a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c36086l.getName();
        Object defaultValue = c36086l.getDefaultValue();
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
            return ((Long) defaultValue).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m114582h(C36077c c36077c, InterfaceC36075a interfaceC36075a, EnumC32978v enumC32978v, C22667f0 c22667f0, Throwable th3) {
        InterfaceC36084j interfaceC36084j = (InterfaceC36084j) interfaceC36075a;
        c36077c.crpDataDogMetrics.m114606l(interfaceC36084j.getTaskName(), false, enumC32978v);
        c36077c.crpDataDogMetrics.m114607m(interfaceC36084j.getTaskName(), c22667f0.f89335w, c36077c.clock.millis(), enumC32978v);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private final void m114583i(EnumC32978v whoopDeviceType) {
        C36082h c36082h = this.crpDataDogMetrics;
        InterfaceC32565b<InterfaceC36079e> interfaceC32565b = this.executionService;
        InterfaceC32564a.b bVar = InterfaceC32564a.b.f134906a;
        c36082h.m114605k(interfaceC32565b.mo101602a(bVar), bVar.toString(), whoopDeviceType);
        C36082h c36082h2 = this.crpDataDogMetrics;
        InterfaceC32565b<InterfaceC36079e> interfaceC32565b2 = this.executionService;
        InterfaceC32564a.c cVar = InterfaceC32564a.c.f134908a;
        c36082h2.m114605k(interfaceC32565b2.mo101602a(cVar), cVar.toString(), whoopDeviceType);
        C36082h c36082h3 = this.crpDataDogMetrics;
        InterfaceC32565b<InterfaceC36079e> interfaceC32565b3 = this.executionService;
        InterfaceC32564a.a aVar = InterfaceC32564a.a.f134904a;
        c36082h3.m114605k(interfaceC32565b3.mo101602a(aVar), aVar.toString(), whoopDeviceType);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vk0.InterfaceC36076b
    /* JADX INFO: renamed from: a */
    public InterfaceC3018i0 mo114576a(InterfaceC36075a bleTask, InterfaceC32564a executionPriority, InterfaceC36083i gattService, EnumC32978v whoopDeviceType) throws Exception {
        C22669g0 c22669g0;
        Exception exc;
        Object obj;
        EnumC32978v enumC32978v;
        Object obj2;
        Object obj3;
        String strCommandName;
        C36077c c36077c;
        C36077c c36077c2 = this;
        AbstractC22676k.m65750j(bleTask, "bleTask");
        AbstractC22676k.m65750j(executionPriority, "executionPriority");
        AbstractC22676k.m65750j(gattService, "gattService");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        c36077c2.m114583i(whoopDeviceType);
        C22669g0 c22669g1 = new C22669g0();
        C22669g0 c22669g2 = new C22669g0();
        if (bleTask instanceof InterfaceC36081g) {
            try {
                InterfaceC36081g interfaceC36081g = (InterfaceC36081g) bleTask;
                c36077c2.logger.mo85228t("Submitting task " + interfaceC36081g.mo114594s(whoopDeviceType) + " to the queue", new AbstractC30556a.a[0]);
                InterfaceC24724a interfaceC24724aMo114594s = interfaceC36081g.mo114594s(whoopDeviceType);
                if (interfaceC24724aMo114594s != null) {
                    try {
                        strCommandName = interfaceC24724aMo114594s.commandName();
                    } catch (Exception e5) {
                        exc = e5;
                        c36077c2 = c36077c2;
                        c22669g1 = c22669g1;
                        c22669g0 = c22669g2;
                        obj = c22669g1.f89336w;
                        if (obj != null) {
                            enumC32978v = whoopDeviceType;
                        } else {
                            enumC32978v = whoopDeviceType;
                        }
                        if (exc instanceof TaskInterruptedException) {
                        }
                        if (exc instanceof TimeoutCancellationException) {
                            c36077c2.crpDataDogMetrics.m114604j((String) obj2, enumC32978v);
                        }
                        c36077c2.logger.mo85222m("Task " + InterfaceC36081g.m114591B((InterfaceC36081g) bleTask, null, 1, null) + " was interrupted due to " + exc + ", returning error", new AbstractC30556a.a[0]);
                        InterfaceC36079e.a aVar = new InterfaceC36079e.a(exc);
                        C3058t c3058t = new C3058t(null);
                        c3058t.m8807L(aVar);
                        return c3058t;
                    }
                } else {
                    strCommandName = null;
                }
                if (strCommandName == null) {
                    strCommandName = "";
                }
                c22669g2.f89336w = strCommandName;
                c36077c2.crpDataDogMetrics.m114601g(strCommandName, whoopDeviceType);
                try {
                    c22669g0 = c22669g2;
                    try {
                        return InterfaceC32565b.m101601b(c36077c2.executionService, (String) c22669g2.f89336w, executionPriority, c36077c2.new a(c22669g2, whoopDeviceType, c22669g1, gattService, interfaceC36081g, bleTask, null), null, 8, null);
                    } catch (Exception e13) {
                        e = e13;
                        exc = e;
                        obj = c22669g1.f89336w;
                        if (obj != null || (obj3 = c22669g0.f89336w) == null) {
                            enumC32978v = whoopDeviceType;
                        } else {
                            c36077c2.crpDataDogMetrics.m114602h((String) obj3, false, ((Number) obj).longValue(), c36077c2.clock.millis(), whoopDeviceType);
                            enumC32978v = whoopDeviceType;
                        }
                        if ((exc instanceof TaskInterruptedException) && !(exc instanceof TimeoutCancellationException)) {
                            throw exc;
                        }
                        if ((exc instanceof TimeoutCancellationException) && (obj2 = c22669g0.f89336w) != null) {
                            c36077c2.crpDataDogMetrics.m114604j((String) obj2, enumC32978v);
                        }
                        c36077c2.logger.mo85222m("Task " + InterfaceC36081g.m114591B((InterfaceC36081g) bleTask, null, 1, null) + " was interrupted due to " + exc + ", returning error", new AbstractC30556a.a[0]);
                        InterfaceC36079e.a aVar2 = new InterfaceC36079e.a(exc);
                        C3058t c3058t2 = new C3058t(null);
                        c3058t2.m8807L(aVar2);
                        return c3058t2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    c22669g0 = c22669g2;
                }
            } catch (Exception e15) {
                e = e15;
                c22669g0 = c22669g2;
            }
        } else {
            if (!(bleTask instanceof InterfaceC36084j)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC36084j interfaceC36084j = (InterfaceC36084j) bleTask;
            c36077c2.logger.mo85228t(AbstractC11895b.m31996o("Submitting task ", interfaceC36084j.getTaskName(), " to the queue"), new AbstractC30556a.a[0]);
            C22667f0 c22667f0 = new C22667f0();
            c22667f0.f89335w = c36077c2.clock.millis();
            try {
                try {
                    try {
                        InterfaceC3018i0 interfaceC3018i0Mo101603c = c36077c2.executionService.mo101603c(((InterfaceC36084j) bleTask).getTaskName(), executionPriority, new b(bleTask, c36077c2, c22667f0, whoopDeviceType, gattService, null), new c(bleTask, gattService, null));
                        c36077c = this;
                        try {
                            ((C3060t1) interfaceC3018i0Mo101603c).invokeOnCompletion(new C11328a(c36077c, bleTask, whoopDeviceType, c22667f0, 5));
                            return interfaceC3018i0Mo101603c;
                        } catch (Exception e16) {
                            e = e16;
                            c36077c.logger.mo85222m("Task " + interfaceC36084j.getTaskName() + " was interrupted due to " + e + ", returning error", new AbstractC30556a.a[0]);
                            throw e;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        c36077c = this;
                    }
                } catch (Exception e18) {
                    e = e18;
                    c36077c = c36077c2;
                }
            } catch (Exception e19) {
                e = e19;
                c36077c = c36077c2;
            }
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }
}
