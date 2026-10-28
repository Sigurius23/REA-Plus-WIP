package fs2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.videocall.api.StreamVideoCallApi;
import com.whoop.videocall.api.VideoCallSessionResponse;
import cs2.C11104a;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.net.ConnectException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t23.C33358a2;
import t23.C33368c0;
import t23.C33397h2;
import t23.C33402i2;
import t23.C33407j2;
import t23.C33412k2;
import t23.C33417l2;
import t23.C33422m2;
import t23.C33427n2;
import t23.C33432o2;
import t23.C33437p2;
import t23.InterfaceC33442q2;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: fs2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u0018\u00102\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00107\u001a\b\u0012\u0004\u0012\u00020$038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Lfs2/i;", "Lfs2/k;", "Lcom/whoop/videocall/api/StreamVideoCallApi;", "streamVideoCallApi", "Lfs2/j;", "clientService", "Lcs2/a;", "videoCallMetricWriter", "Ltr2/n;", "logger", "Lbc3/c0;", "scope", "<init>", "(Lcom/whoop/videocall/api/StreamVideoCallApi;Lfs2/j;Lcs2/a;Ltr2/n;Lbc3/c0;)V", "Lt23/q2;", "connection", "Ll83/a0;", "l", "(Lt23/q2;)V", "Lfs2/a;", "reason", "j", "(Lfs2/a;)V", "", "callId", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/videocall/api/StreamVideoCallApi;", "Lfs2/j;", "c", "Lcs2/a;", "Ltr2/n;", "Lec3/p1;", "Lfs2/l;", "e", "Lec3/p1;", "stateOverride", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLeavingAndDestroying", "g", "hasBeenActive", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "endEmitted", "i", "Lt23/q2;", "previousConnection", "Lec3/f2;", "Lec3/f2;", "k", "()Lec3/f2;", "callStateFlow", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14756i implements InterfaceC14758k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StreamVideoCallApi streamVideoCallApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14757j clientService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11104a videoCallMetricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13075p1 stateOverride;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AtomicBoolean isLeavingAndDestroying;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AtomicBoolean hasBeenActive;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AtomicBoolean endEmitted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC33442q2 previousConnection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13037f2 callStateFlow;

    /* JADX INFO: renamed from: fs2.i$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoCallManager$callStateFlow$1", m100430f = "StreamVideoCallManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfs2/l;", "override", "Lt23/q2;", "connection", "<anonymous>", "(Lfs2/l;Lt23/q2;)Lfs2/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54634w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54635x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54636y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14759l interfaceC14759l, InterfaceC33442q2 interfaceC33442q2, InterfaceC30057d<? super InterfaceC14759l> interfaceC30057d) {
            a aVar = C14756i.this.new a(interfaceC30057d);
            aVar.f54635x = interfaceC14759l;
            aVar.f54636y = interfaceC33442q2;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14759l interfaceC14759l = (InterfaceC14759l) this.f54635x;
            InterfaceC33442q2 interfaceC33442q2 = (InterfaceC33442q2) this.f54636y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f54634w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14756i.this.m42319l(interfaceC33442q2);
            if (interfaceC14759l != null) {
                return interfaceC14759l;
            }
            if (interfaceC33442q2 == null) {
                return InterfaceC14759l.d.f54670a;
            }
            if (interfaceC33442q2.equals(C33427n2.f139556a)) {
                return InterfaceC14759l.e.f54671a;
            }
            if (interfaceC33442q2.equals(C33412k2.f139497a)) {
                return InterfaceC14759l.f.f54672a;
            }
            if ((interfaceC33442q2 instanceof C33417l2) || interfaceC33442q2.equals(C33397h2.f139460a) || interfaceC33442q2.equals(C33432o2.f139567a) || interfaceC33442q2.equals(C33422m2.f139547a)) {
                return InterfaceC14759l.a.f54667a;
            }
            if (interfaceC33442q2.equals(C33437p2.f139585a) || (interfaceC33442q2 instanceof C33407j2)) {
                return new InterfaceC14759l.c(null, 1, null);
            }
            if (interfaceC33442q2.equals(C33402i2.f139475a)) {
                return InterfaceC14759l.b.f54668a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: fs2.i$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoCallManager$callStateFlow$2", m100430f = "StreamVideoCallManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lfs2/l;", "state", "Ll83/a0;", "<anonymous>", "(Lfs2/l;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54638w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54639x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C14756i.this.new b(interfaceC30057d);
            bVar.f54639x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14759l interfaceC14759l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC14759l, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14759l interfaceC14759l = (InterfaceC14759l) this.f54639x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f54638w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC14759l instanceof InterfaceC14759l.a) {
                C14756i.this.hasBeenActive.set(true);
            }
            if ((interfaceC14759l instanceof InterfaceC14759l.b) && !C14756i.this.isLeavingAndDestroying.get()) {
                C14756i.this.mo42290a(EnumC14748a.REMOTE_ENDED);
            }
            if (interfaceC14759l instanceof InterfaceC14759l.c) {
                C14756i.this.m42318j(EnumC14748a.CONNECTION_FAILED);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fs2.i$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoCallManager", m100430f = "StreamVideoCallManager.kt", m100431l = {181}, m100432m = "joinCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f54641w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54642x;

        /* JADX INFO: renamed from: z */
        int f54644z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f54642x = obj;
            this.f54644z |= Integer.MIN_VALUE;
            return C14756i.this.mo42293d(this);
        }
    }

    /* JADX INFO: renamed from: fs2.i$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoCallManager", m100430f = "StreamVideoCallManager.kt", m100431l = {133}, m100432m = "startCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f54645w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54646x;

        /* JADX INFO: renamed from: z */
        int f54648z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f54646x = obj;
            this.f54648z |= Integer.MIN_VALUE;
            return C14756i.this.mo42291b(null, this);
        }
    }

    /* JADX INFO: renamed from: fs2.i$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoCallManager$startCall$result$1", m100430f = "StreamVideoCallManager.kt", m100431l = {134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/videocall/api/VideoCallSessionResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f54649w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14756i.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54649w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StreamVideoCallApi streamVideoCallApi = C14756i.this.streamVideoCallApi;
            this.f54649w = 1;
            Object session = streamVideoCallApi.getSession(this);
            return session == enumC31071a ? enumC31071a : session;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super VideoCallSessionResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14756i(StreamVideoCallApi streamVideoCallApi, C14757j clientService, C11104a videoCallMetricWriter, InterfaceC34116n logger, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(streamVideoCallApi, "streamVideoCallApi");
        AbstractC22676k.m65750j(clientService, "clientService");
        AbstractC22676k.m65750j(videoCallMetricWriter, "videoCallMetricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scope, "scope");
        this.streamVideoCallApi = streamVideoCallApi;
        this.clientService = clientService;
        this.videoCallMetricWriter = videoCallMetricWriter;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.stateOverride = c13045h2M36593c;
        this.isLeavingAndDestroying = new AtomicBoolean(false);
        this.hasBeenActive = new AtomicBoolean(false);
        this.endEmitted = new AtomicBoolean(false);
        this.callStateFlow = AbstractC13091v.m36587M(new C13052j1(new C13060l1(c13045h2M36593c, clientService.getConnectionStateFlow(), new a(null), 1), new b(null), 0), scope, C13105z1.f45288a, InterfaceC14759l.d.f54670a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m42318j(EnumC14748a reason) {
        if (this.hasBeenActive.get() && this.endEmitted.compareAndSet(false, true)) {
            this.videoCallMetricWriter.m30030b(reason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m42319l(InterfaceC33442q2 connection) {
        C33432o2 c33432o2 = C33432o2.f139567a;
        if (AbstractC22676k.m65745e(connection, c33432o2) && !AbstractC22676k.m65745e(this.previousConnection, c33432o2)) {
            this.videoCallMetricWriter.m30032d();
        }
        this.previousConnection = connection;
    }

    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: a */
    public void mo42290a(EnumC14748a reason) {
        AbstractC22676k.m65750j(reason, "reason");
        m42318j(reason);
        this.isLeavingAndDestroying.set(true);
        ((C13045h2) this.stateOverride).m36570j(InterfaceC14759l.b.f54668a);
        this.clientService.m42329g();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: b */
    public Object mo42291b(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IOException {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f54648z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f54648z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f54646x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f54648z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            this.isLeavingAndDestroying.set(false);
            this.hasBeenActive.set(false);
            this.endEmitted.set(false);
            ((C13045h2) this.stateOverride).m36570j(InterfaceC14759l.f.f54672a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(null);
            dVar2.f54645w = str;
            dVar2.f54648z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Video call session", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) dVar2.f54645w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            try {
                VideoCallSessionResponse videoCallSessionResponse = (VideoCallSessionResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
                this.clientService.m42328f(videoCallSessionResponse);
                this.clientService.m42325c(videoCallSessionResponse.getCallType(), str);
                C33368c0 c33368c0 = (C33368c0) this.clientService.getCurrentCall().getValue();
                if (c33368c0 != null) {
                    c33368c0.m105814e().m105834c();
                    C33358a2.m105787a(c33368c0.m105818i());
                } else {
                    this.logger.mo85222m("currentCall is null after createCall — camera and mic will not be disabled", new AbstractC30556a.a[0]);
                }
                ((C13045h2) this.stateOverride).m36570j(null);
                C11104a.m30029f(this.videoCallMetricWriter, true, null, 2, null);
            } catch (IllegalArgumentException e5) {
                this.logger.mo85230v("Stream Video client invalid arguments", e5, new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p1 = this.stateOverride;
                InterfaceC14759l.c cVar = new InterfaceC14759l.c(null, 1, null);
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, cVar);
                this.videoCallMetricWriter.m30033e(false, C11104a.b.INVALID_CREDENTIALS);
            } catch (RuntimeException e13) {
                this.logger.mo85230v("Stream Video client already initialized or invalid state", e13, new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p2 = this.stateOverride;
                InterfaceC14759l.c cVar2 = new InterfaceC14759l.c(null, 1, null);
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.getClass();
                c13045h3.m36571k(null, cVar2);
                this.videoCallMetricWriter.m30033e(false, C11104a.b.SDK_INIT);
            } catch (ConnectException e14) {
                this.logger.mo85230v("Stream Video WebSocket connection failed", e14, new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p3 = this.stateOverride;
                InterfaceC14759l.c cVar3 = new InterfaceC14759l.c(null, 1, null);
                C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
                c13045h4.getClass();
                c13045h4.m36571k(null, cVar3);
                this.videoCallMetricWriter.m30033e(false, C11104a.b.CONNECT);
            }
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC13075p1 interfaceC13075p4 = this.stateOverride;
            InterfaceC14759l.c cVar4 = new InterfaceC14759l.c(null, 1, null);
            C13045h2 c13045h5 = (C13045h2) interfaceC13075p4;
            c13045h5.getClass();
            c13045h5.m36571k(null, cVar4);
            this.videoCallMetricWriter.m30033e(false, C11104a.b.TOKEN_FETCH);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: d */
    public Object mo42293d(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f54644z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f54644z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM105821l = cVar.f54642x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f54644z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105821l);
            C33368c0 c33368c0 = (C33368c0) this.clientService.getCurrentCall().getValue();
            if (c33368c0 == null) {
                this.logger.mo85222m("joinCall() called with no active call", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            cVar.f54641w = null;
            cVar.f54644z = 1;
            objM105821l = c33368c0.m105821l((63 & 1) == 0, cVar);
            if (objM105821l == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM105821l);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105821l;
        if (abstractC26205h instanceof C26204g) {
            this.videoCallMetricWriter.m30031c(true);
            return c23454a0;
        }
        if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m("Failed to join call: " + abstractC26205h, new AbstractC30556a.a[0]);
        this.videoCallMetricWriter.m30031c(false);
        return c23454a0;
    }

    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: k, reason: from getter */
    public InterfaceC13037f2 getCallStateFlow() {
        return this.callStateFlow;
    }

    public C14756i(StreamVideoCallApi streamVideoCallApi, C14757j c14757j, C11104a c11104a, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(streamVideoCallApi, c14757j, c11104a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreamVideoCallManager") : interfaceC34116n, (i13 & 16) != 0 ? AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)) : interfaceC2994c0);
    }
}
