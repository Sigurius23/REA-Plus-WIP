package mq2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xq2.EnumC38591t;

/* JADX INFO: renamed from: mq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u0014B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'¨\u0006*"}, m65681d2 = {"Lmq2/b;", "", "Lkotlin/Function0;", "", "currentTimeMillis", "Lbc3/c0;", "timeoutScope", "<init>", "(Lc93/a;Lbc3/c0;)V", "Lxq2/t;", "direction", "", "expectedAnimationCount", "Ll83/a0;", "onComplete", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxq2/t;ILc93/a;)V", "g", "()V", "e", "a", "Lc93/a;", "b", "Lbc3/c0;", "Lp1/c1;", "c", "Lp1/c1;", "f", "()Lp1/c1;", "currentDirection", "d", "onAnimationComplete", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "pendingAnimationCount", "hasNavigated", "J", "lastTriggerTime", "Lbc3/k1;", "Lbc3/k1;", "timeoutJob", "i", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25889b {

    /* JADX INFO: renamed from: j */
    public static final int f102158j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a currentTimeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 timeoutScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28601c1 currentDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC4339a onAnimationComplete;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicInteger pendingAnimationCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AtomicInteger hasNavigated;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long lastTriggerTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private InterfaceC3027k1 timeoutJob;

    /* JADX INFO: renamed from: mq2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.AnimationCoordinator$triggerAnimations$1", m100430f = "AnimationCoordinator.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102167w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC38591t f102169y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f102170z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC38591t enumC38591t, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102169y = enumC38591t;
            this.f102170z = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25889b.this.new b(this.f102169y, this.f102170z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102167w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f102167w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (C25889b.this.pendingAnimationCount.get() > 0 && C25889b.this.hasNavigated.get() == 0 && C25889b.this.getCurrentDirection().getValue() == this.f102169y) {
                C25889b.this.m76547e();
                this.f102170z.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    public C25889b(InterfaceC4339a currentTimeMillis, InterfaceC2994c0 timeoutScope) {
        AbstractC22676k.m65750j(currentTimeMillis, "currentTimeMillis");
        AbstractC22676k.m65750j(timeoutScope, "timeoutScope");
        this.currentTimeMillis = currentTimeMillis;
        this.timeoutScope = timeoutScope;
        this.currentDirection = AbstractC28683x.m87272z(null);
        this.pendingAnimationCount = new AtomicInteger(0);
        this.hasNavigated = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final long m76544b() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: e */
    public final void m76547e() {
        InterfaceC3027k1 interfaceC3027k1 = this.timeoutJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.timeoutJob = null;
        this.currentDirection.setValue(null);
        this.onAnimationComplete = null;
        this.pendingAnimationCount.set(0);
        this.hasNavigated.set(0);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC28601c1 getCurrentDirection() {
        return this.currentDirection;
    }

    /* JADX INFO: renamed from: g */
    public final void m76549g() {
        if (this.currentDirection.getValue() == null || this.onAnimationComplete == null || this.pendingAnimationCount.decrementAndGet() != 0 || !this.hasNavigated.compareAndSet(0, 1)) {
            return;
        }
        InterfaceC4339a interfaceC4339a = this.onAnimationComplete;
        this.currentDirection.setValue(null);
        this.onAnimationComplete = null;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m76550h(EnumC38591t direction, int expectedAnimationCount, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(direction, "direction");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        long jLongValue = ((Number) this.currentTimeMillis.invoke()).longValue();
        long j7 = jLongValue - this.lastTriggerTime;
        boolean z4 = this.pendingAnimationCount.get() > 0 && this.currentDirection.getValue() != null;
        if (j7 < 500 && z4) {
            m76547e();
            onComplete.invoke();
            this.lastTriggerTime = jLongValue;
            return;
        }
        if (j7 >= 100 || this.currentDirection.getValue() == null) {
            this.lastTriggerTime = jLongValue;
            m76547e();
            if (expectedAnimationCount <= 0) {
                onComplete.invoke();
                return;
            }
            this.hasNavigated.set(0);
            this.pendingAnimationCount.set(expectedAnimationCount);
            this.currentDirection.setValue(direction);
            this.onAnimationComplete = onComplete;
            InterfaceC3027k1 interfaceC3027k1 = this.timeoutJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.timeoutJob = AbstractC3006f0.m8732z(this.timeoutScope, null, null, new b(direction, onComplete, null), 3);
        }
    }

    public C25889b(InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C25888a(0) : interfaceC4339a, (i13 & 2) != 0 ? AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)) : interfaceC2994c0);
    }
}
