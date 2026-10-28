package live.hms.video.utils;

import android.util.Log;
import bc3.AbstractC2995c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C2999d1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c33.ThreadFactoryC3934a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.ChatClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0004\b\u0010\u0010\u000fJ5\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Llive/hms/video/utils/HMSCoroutineScope;", "Lbc3/c0;", "<init>", "()V", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "", "task", "Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;", "schedule", "Lkotlin/Function2;", "block", "Lbc3/k1;", "launchWithTimeout", "(Llive/hms/video/utils/HMSCoroutineScope;Lc93/m;)Lbc3/k1;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lbc3/c1;", "dispatcher", "Lbc3/c1;", "getDispatcher", "()Lbc3/c1;", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSCoroutineScope implements InterfaceC2994c0 {
    public static final HMSCoroutineScope INSTANCE = new HMSCoroutineScope();
    private static final AbstractC2995c1 dispatcher;
    private static final ScheduledExecutorService executor;

    /* JADX INFO: renamed from: live.hms.video.utils.HMSCoroutineScope$launchWithTimeout$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.utils.HMSCoroutineScope$launchWithTimeout$1", m100430f = "HMSCoroutineScope.kt", m100431l = {57}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243971 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4351m $block;
        int label;

        /* JADX INFO: renamed from: live.hms.video.utils.HMSCoroutineScope$launchWithTimeout$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "live.hms.video.utils.HMSCoroutineScope$launchWithTimeout$1$1", m100430f = "HMSCoroutineScope.kt", m100431l = {58}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ InterfaceC4351m $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.$block = interfaceC4351m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
                    InterfaceC4351m interfaceC4351m = this.$block;
                    this.label = 1;
                    if (interfaceC4351m.invoke(interfaceC2994c0, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243971(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C243971> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$block = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C243971(this.$block, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243971) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                    this.label = 1;
                    if (AbstractC3028k2.m8748b(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, anonymousClass1, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                Log.e("LeakTest", "x1x1 " + e5 + ' ' + e5.getMessage() + ' ' + e5.getCause() + ' ' + e5.getStackTrace(), e5);
            }
            return C23454a0.f92919a;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC3934a(2));
        executor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        AbstractC22676k.m65747g(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        dispatcher = new C2999d1(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    private HMSCoroutineScope() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor$lambda$0(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("hms-sdk-coroutine-thread");
        return thread;
    }

    public static /* synthetic */ ScheduledFuture schedule$default(HMSCoroutineScope hMSCoroutineScope, long j7, TimeUnit timeUnit, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return hMSCoroutineScope.schedule(j7, timeUnit, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$2(Function1 task) {
        AbstractC22676k.m65750j(task, "$task");
        AbstractC3006f0.m8732z(INSTANCE, null, null, new HMSCoroutineScope$schedule$1$1(task, null), 3);
    }

    public static /* synthetic */ ScheduledFuture scheduleWithFixedDelay$default(HMSCoroutineScope hMSCoroutineScope, long j7, TimeUnit timeUnit, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return hMSCoroutineScope.scheduleWithFixedDelay(j7, timeUnit, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleWithFixedDelay$lambda$1(Function1 task) {
        AbstractC22676k.m65750j(task, "$task");
        AbstractC3006f0.m8732z(INSTANCE, null, null, new HMSCoroutineScope$scheduleWithFixedDelay$1$1(task, null), 3);
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return dispatcher;
    }

    public final AbstractC2995c1 getDispatcher() {
        return dispatcher;
    }

    public final ScheduledExecutorService getExecutor() {
        return executor;
    }

    public final InterfaceC3027k1 launchWithTimeout(HMSCoroutineScope hMSCoroutineScope, InterfaceC4351m block) {
        AbstractC22676k.m65750j(hMSCoroutineScope, "<this>");
        AbstractC22676k.m65750j(block, "block");
        return AbstractC3006f0.m8732z(INSTANCE, null, null, new C243971(block, null), 3);
    }

    public final ScheduledFuture<?> schedule(long delay, TimeUnit unit, Function1 task) {
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(task, "task");
        ScheduledFuture<?> scheduledFutureSchedule = executor.schedule(new RunnableC24404b(task, 0), delay, unit);
        AbstractC22676k.m65749i(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(long delay, TimeUnit unit, Function1 task) {
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(task, "task");
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = executor.scheduleWithFixedDelay(new RunnableC24404b(task, 1), delay, delay, unit);
        AbstractC22676k.m65749i(scheduledFutureScheduleWithFixedDelay, "scheduleWithFixedDelay(...)");
        return scheduledFutureScheduleWithFixedDelay;
    }
}
