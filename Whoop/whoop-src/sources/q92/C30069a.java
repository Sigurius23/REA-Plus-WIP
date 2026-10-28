package q92;

import b83.C2813i;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c83.AbstractC4309a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.service.rearchitect.IllegalStateTransitionException;
import e83.C12860e;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import h83.AbstractC17016a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.InterfaceC21493z;
import jy1.C22047a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l73.AbstractC23410a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n73.C26442a;
import nf3.C26669a;
import of3.InterfaceC27903a;
import oh3.AbstractC27946d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r73.AbstractC31056a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.C32958b;
import st0.C32959c;
import st0.C32960d;
import st0.C32961e;
import st0.C32963g;
import st0.C32964h;
import st0.C32965i;
import st0.C32966j;
import st0.C32967k;
import st0.C32969m;
import st0.C32970n;
import st0.C32971o;
import us0.InterfaceC35207c;
import v73.C35781g;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010.\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00040\u00040(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010?\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010R\u001a\u00020B8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010D\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010W\"\u0004\b[\u0010\u000e¨\u0006\\"}, m65681d2 = {"Lq92/a;", "Lof3/a;", "<init>", "()V", "Lst0/f;", "oldState", "newState", "c", "(Lst0/f;Lst0/f;)Lst0/f;", "l", "n", "state", "Ll83/a0;", "o", "(Lst0/f;)V", "Lc83/a;", "listener", "b", "(Lc83/a;)V", "m", "d", "", "toString", "()Ljava/lang/String;", "Loh3/d;", "y", "Lq92/b;", "g", "()Loh3/d;", "log", "Lec3/p1;", "z", "Lec3/p1;", "_connectionStateFlow", "Lec3/f2;", "E", "Lec3/f2;", "e", "()Lec3/f2;", "connectionStateFlow", "Le83/e;", "kotlin.jvm.PlatformType", "F", "Le83/e;", "getWhoopStrapConnectionCallbacks$core_release", "()Le83/e;", "whoopStrapConnectionCallbacks", "Liy1/c;", "G", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Liy1/c;", "metricsInteractor", "Lus0/c;", "H", "i", "()Lus0/c;", "pairLifecycleAnalytics", "Lbc3/c0;", "I", "Lbc3/c0;", "scope", "Ln73/a;", "J", "Ln73/a;", "callbacksDisposables", "", "K", "Z", "isTest", "", "L", "getLastTimeStampMillis", "()J", "q", "(J)V", "lastTimeStampMillis", "M", "f", "()Z", "p", "(Z)V", "hasTimedOut", "value", "N", "Lst0/f;", "j", "()Lst0/f;", "previousState", "O", "k", "r", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30069a implements InterfaceC27903a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final InterfaceC13037f2 connectionStateFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final C12860e whoopStrapConnectionCallbacks;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final InterfaceC23462h metricsInteractor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final InterfaceC23462h pairLifecycleAnalytics;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final C26442a callbacksDisposables;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final boolean isTest;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static long lastTimeStampMillis;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static boolean hasTimedOut;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static AbstractC32962f previousState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static AbstractC32962f state;

    /* JADX INFO: renamed from: w */
    public static final C30069a f122700w;

    /* JADX INFO: renamed from: x */
    static final /* synthetic */ InterfaceC21493z[] f122701x;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final C30070b log;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final InterfaceC13075p1 _connectionStateFlow;

    /* JADX INFO: renamed from: q92.a$a */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"q92/a$a", "Lh83/a;", "Lst0/f;", "Ll83/a0;", "onComplete", "()V", "t", "c", "(Lst0/f;)V", "", "onError", "(Ljava/lang/Throwable;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC17016a {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC4309a f122704x;

        public a(AbstractC4309a abstractC4309a) {
            this.f122704x = abstractC4309a;
        }

        @Override // eg3.InterfaceC13182a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(AbstractC32962f t14) {
            AbstractC22676k.m65750j(t14, "t");
            this.f122704x.onNext(t14);
        }

        @Override // eg3.InterfaceC13182a
        public void onComplete() {
            this.f122704x.onComplete();
        }

        @Override // eg3.InterfaceC13182a
        public void onError(Throwable t14) {
            AbstractC22676k.m65750j(t14, "t");
            this.f122704x.onError(t14);
        }
    }

    /* JADX INFO: renamed from: q92.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.BleConnectionStateMachine$sendDataDogMetric$1", m100430f = "BleConnectionStateMachine.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122705w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC32962f f122706x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC32962f abstractC32962f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122706x = abstractC32962f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f122706x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122705w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21030c interfaceC21030cM92155h = C30069a.f122700w.m92155h();
                C22047a c22047a = new C22047a(0, "connectivity.app.ble.connection_state", null, AbstractC37056f.m118958J("State:" + this.f122706x), null, 17, null);
                this.f122705w = 1;
                if (interfaceC21030cM92155h.mo58700a(c22047a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: q92.a$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f122707w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122708x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122709y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f122707w = interfaceC27903a;
            this.f122708x = interfaceC35951a;
            this.f122709y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            InterfaceC27903a interfaceC27903a = this.f122707w;
            InterfaceC35951a interfaceC35951a = this.f122708x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f122709y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: q92.a$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f122710w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122711x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122712y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f122710w = interfaceC27903a;
            this.f122711x = interfaceC35951a;
            this.f122712y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, us0.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35207c invoke() {
            InterfaceC27903a interfaceC27903a = this.f122710w;
            InterfaceC35951a interfaceC35951a = this.f122711x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f122712y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35207c.class), interfaceC35951a);
        }
    }

    static {
        C22693x c22693x = new C22693x(C30069a.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f122701x = new InterfaceC21493z[]{c22673i0.property1(c22693x)};
        C30069a c30069a = new C30069a();
        f122700w = c30069a;
        log = new C30070b("BleConnectionStateMachine");
        C32963g c32963g = C32963g.f137291a;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c32963g);
        _connectionStateFlow = c13045h2M36593c;
        connectionStateFlow = AbstractC13091v.m36598h(c13045h2M36593c);
        whoopStrapConnectionCallbacks = new C12860e();
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        metricsInteractor = AbstractC30060g.m92087G(enumC23463i, new c(c30069a, null, null));
        pairLifecycleAnalytics = AbstractC30060g.m92087G(enumC23463i, new d(c30069a, null, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        scope = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        callbacksDisposables = new C26442a();
        isTest = ((Boolean) c30069a.getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), new C35953c("testFlag"))).booleanValue();
        lastTimeStampMillis = System.currentTimeMillis();
        previousState = c32963g;
        state = c32963g;
    }

    private C30069a() {
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC32962f m92153c(AbstractC32962f oldState, AbstractC32962f newState) {
        m92154g().mo84371h("State changed from " + oldState + " to " + newState, new Object[0]);
        lastTimeStampMillis = System.currentTimeMillis();
        previousState = newState;
        ((C13045h2) _connectionStateFlow).m36570j(newState);
        m92159o(newState);
        m92156i().mo71174a(oldState, newState);
        whoopStrapConnectionCallbacks.onNext(newState);
        return newState;
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC27946d m92154g() {
        return log.getValue(this, f122701x[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC21030c m92155h() {
        return (InterfaceC21030c) metricsInteractor.getValue();
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC35207c m92156i() {
        return (InterfaceC35207c) pairLifecycleAnalytics.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final AbstractC32962f m92157l(AbstractC32962f oldState, AbstractC32962f newState) {
        m92154g().mo84369c(new IllegalStateTransitionException(oldState, newState));
        return (AbstractC22676k.m65745e(oldState, C32963g.f137291a) && AbstractC22676k.m65745e(newState, C32970n.f137298a)) ? m92158n(oldState, newState) : m92153c(oldState, newState);
    }

    /* JADX INFO: renamed from: n */
    private final AbstractC32962f m92158n(AbstractC32962f oldState, AbstractC32962f newState) {
        m92154g().mo84371h("State requested to change from " + oldState + " to " + newState + ", but this is an illegal transition which we do not want to allow.", new Object[0]);
        lastTimeStampMillis = System.currentTimeMillis();
        previousState = oldState;
        ((C13045h2) _connectionStateFlow).m36570j(oldState);
        whoopStrapConnectionCallbacks.onNext(oldState);
        m92159o(oldState);
        return oldState;
    }

    /* JADX INFO: renamed from: o */
    private final void m92159o(AbstractC32962f state2) {
        AbstractC3006f0.m8732z(scope, null, null, new b(state2, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m92160b(AbstractC4309a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        C26442a c26442a = callbacksDisposables;
        C12860e c12860e = whoopStrapConnectionCallbacks;
        c12860e.getClass();
        int i13 = AbstractC23410a.f92767w;
        AbstractC31056a.m95617b(i13, "capacity");
        C35781g c35781g = new C35781g(c12860e, i13);
        a aVar = new a(listener);
        c35781g.m67903a(aVar);
        c26442a.mo78293a(aVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m92161d() {
        callbacksDisposables.m78296d();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 m92162e() {
        return connectionStateFlow;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m92163f() {
        return System.currentTimeMillis() - lastTimeStampMillis >= 30000;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC32962f m92164j() {
        return previousState;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized AbstractC32962f m92165k() {
        return state;
    }

    /* JADX INFO: renamed from: m */
    public final void m92166m(AbstractC4309a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        callbacksDisposables.mo78295c(listener);
        m92161d();
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m92167p(boolean z4) {
        hasTimedOut = z4;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m92168q(long j7) {
        lastTimeStampMillis = j7;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0185 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0018, B:9:0x001c, B:12:0x0026, B:14:0x0030, B:16:0x0038, B:18:0x003e, B:21:0x0045, B:103:0x017c, B:24:0x004e, B:25:0x0054, B:27:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x0070, B:36:0x0079, B:37:0x007f, B:38:0x0085, B:40:0x008d, B:42:0x0095, B:45:0x009c, B:46:0x00a2, B:47:0x00a8, B:49:0x00b0, B:51:0x00b6, B:54:0x00bd, B:55:0x00c3, B:56:0x00c9, B:58:0x00cf, B:59:0x00d5, B:61:0x00dd, B:63:0x00e5, B:64:0x00eb, B:65:0x00f1, B:67:0x00f7, B:69:0x00fd, B:71:0x0101, B:72:0x0107, B:73:0x010d, B:75:0x0113, B:77:0x0119, B:78:0x011e, B:79:0x0123, B:81:0x012b, B:83:0x0131, B:86:0x013a, B:87:0x013f, B:88:0x0144, B:90:0x014c, B:92:0x0152, B:93:0x0157, B:94:0x015c, B:96:0x0164, B:98:0x016a, B:99:0x016f, B:100:0x0174, B:102:0x0178, B:104:0x017f, B:105:0x0184, B:106:0x0185), top: B:111:0x0001 }] */
    /* JADX INFO: renamed from: r */
    public final synchronized void m92169r(AbstractC32962f newState) {
        AbstractC32962f abstractC32962fM92153c;
        try {
            AbstractC22676k.m65750j(newState, "newState");
            AbstractC32962f abstractC32962f = state;
            C32963g c32963g = C32963g.f137291a;
            if (newState.equals(c32963g)) {
                state = m92153c(abstractC32962f, newState);
            } else {
                C32964h c32964h = C32964h.f137292a;
                if (newState.equals(c32964h) || (newState instanceof C32965i)) {
                    state = m92153c(abstractC32962f, newState);
                } else {
                    C32967k c32967k = C32967k.f137296a;
                    if (newState.equals(c32967k)) {
                        state = m92153c(abstractC32962f, newState);
                    } else {
                        AbstractC32962f abstractC32962f2 = state;
                        C32961e c32961e = C32961e.f137290a;
                        if (AbstractC22676k.m65745e(abstractC32962f2, c32961e)) {
                            abstractC32962fM92153c = (newState.equals(C32960d.f137289a) || newState.equals(c32961e) || newState.equals(c32963g)) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                        } else {
                            C32960d c32960d = C32960d.f137289a;
                            if (AbstractC22676k.m65745e(abstractC32962f2, c32960d)) {
                                abstractC32962fM92153c = (newState.equals(c32964h) || newState.equals(c32963g) || newState.equals(C32959c.f137288a) || newState.equals(C32958b.f137287a)) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                            } else if (AbstractC22676k.m65745e(abstractC32962f2, C32959c.f137288a)) {
                                abstractC32962fM92153c = (newState.equals(C32958b.f137287a) || newState.equals(c32960d)) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                            } else {
                                C32970n c32970n = C32970n.f137298a;
                                if (AbstractC22676k.m65745e(abstractC32962f2, c32970n)) {
                                    abstractC32962fM92153c = (newState.equals(c32964h) || newState.equals(c32963g)) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                } else if (AbstractC22676k.m65745e(abstractC32962f2, c32964h)) {
                                    abstractC32962fM92153c = m92153c(abstractC32962f, newState);
                                } else if (AbstractC22676k.m65745e(abstractC32962f2, C32958b.f137287a)) {
                                    abstractC32962fM92153c = newState.equals(C32966j.f137295a) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                } else if (AbstractC22676k.m65745e(abstractC32962f2, c32963g)) {
                                    abstractC32962fM92153c = (newState.equals(c32961e) || isTest) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                } else if (AbstractC22676k.m65745e(abstractC32962f2, c32967k)) {
                                    abstractC32962fM92153c = newState.equals(c32963g) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                } else {
                                    C32971o c32971o = C32971o.f137299a;
                                    if (AbstractC22676k.m65745e(abstractC32962f2, c32971o)) {
                                        abstractC32962fM92153c = (newState.equals(c32970n) || newState.equals(C32969m.f137297a)) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                    } else if (AbstractC22676k.m65745e(abstractC32962f2, C32969m.f137297a)) {
                                        abstractC32962fM92153c = newState.equals(c32970n) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                    } else if (AbstractC22676k.m65745e(abstractC32962f2, C32966j.f137295a)) {
                                        abstractC32962fM92153c = newState.equals(c32971o) ? m92153c(abstractC32962f, newState) : m92157l(abstractC32962f, newState);
                                    } else {
                                        if (!(abstractC32962f2 instanceof C32965i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        abstractC32962fM92153c = m92153c(abstractC32962f, newState);
                                    }
                                }
                            }
                        }
                        state = abstractC32962fM92153c;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public String toString() {
        AbstractC32962f abstractC32962f = state;
        C26442a c26442a = callbacksDisposables;
        int i13 = 0;
        if (!c26442a.f105041x) {
            synchronized (c26442a) {
                try {
                    if (!c26442a.f105041x) {
                        C2813i c2813i = c26442a.f105040w;
                        i13 = c2813i != null ? c2813i.f11006b : 0;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return "BleConnectionStateMachine in state " + abstractC32962f + " and " + i13 + " listeners";
    }
}
