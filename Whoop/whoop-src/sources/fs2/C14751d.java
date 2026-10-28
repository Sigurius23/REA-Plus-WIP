package fs2;

import com.whoop.videocall.api.HmsVideoCallApi;
import com.whoop.videocall.api.HmsVideoCallSessionResponse;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import l83.C23454a0;
import p088dc.AbstractC11895b;
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
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: fs2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, m65681d2 = {"Lfs2/d;", "Lfs2/k;", "Lcom/whoop/videocall/api/HmsVideoCallApi;", "hmsVideoCallApi", "Lfs2/f;", "clientService", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;)V", "", "callId", "Ll83/a0;", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "Lfs2/a;", "reason", "a", "(Lfs2/a;)V", "Lcom/whoop/videocall/api/HmsVideoCallApi;", "Lfs2/f;", "c", "Ltr2/n;", "Lec3/p1;", "Lfs2/l;", "Lec3/p1;", "stateOverride", "Lec3/l;", "e", "Lec3/l;", "()Lec3/l;", "callStateFlow", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14751d implements InterfaceC14758k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HmsVideoCallApi hmsVideoCallApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14753f clientService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 stateOverride;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l callStateFlow;

    /* JADX INFO: renamed from: fs2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.HmsVideoCallManager$callStateFlow$1", m100430f = "HmsVideoCallManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfs2/l;", "override", "Lfs2/b;", "phase", "<anonymous>", "(Lfs2/l;Lfs2/b;)Lfs2/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54601w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54602x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54603y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14759l interfaceC14759l, InterfaceC14749b interfaceC14749b, InterfaceC30057d<? super InterfaceC14759l> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f54602x = interfaceC14759l;
            aVar.f54603y = interfaceC14749b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14759l interfaceC14759l = (InterfaceC14759l) this.f54602x;
            InterfaceC14749b interfaceC14749b = (InterfaceC14749b) this.f54603y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f54601w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC14759l != null) {
                return interfaceC14759l;
            }
            if (interfaceC14749b == null) {
                return InterfaceC14759l.d.f54670a;
            }
            if (interfaceC14749b.equals(InterfaceC14749b.a.f54591a)) {
                return InterfaceC14759l.f.f54672a;
            }
            if (interfaceC14749b.equals(InterfaceC14749b.c.f54593a)) {
                return InterfaceC14759l.e.f54671a;
            }
            if (interfaceC14749b instanceof InterfaceC14749b.b) {
                return new InterfaceC14759l.c(((InterfaceC14749b.b) interfaceC14749b).getMessage());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: fs2.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.HmsVideoCallManager", m100430f = "HmsVideoCallManager.kt", m100431l = {40}, m100432m = "startCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f54604w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54605x;

        /* JADX INFO: renamed from: z */
        int f54607z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f54605x = obj;
            this.f54607z |= Integer.MIN_VALUE;
            return C14751d.this.mo42291b(null, this);
        }
    }

    /* JADX INFO: renamed from: fs2.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.HmsVideoCallManager$startCall$result$1", m100430f = "HmsVideoCallManager.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/videocall/api/HmsVideoCallSessionResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f54608w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14751d.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54608w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HmsVideoCallApi hmsVideoCallApi = C14751d.this.hmsVideoCallApi;
            this.f54608w = 1;
            Object session = hmsVideoCallApi.getSession(this);
            return session == enumC31071a ? enumC31071a : session;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HmsVideoCallSessionResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14751d(HmsVideoCallApi hmsVideoCallApi, C14753f clientService, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(hmsVideoCallApi, "hmsVideoCallApi");
        AbstractC22676k.m65750j(clientService, "clientService");
        AbstractC22676k.m65750j(logger, "logger");
        this.hmsVideoCallApi = hmsVideoCallApi;
        this.clientService = clientService;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.stateOverride = c13045h2M36593c;
        this.callStateFlow = AbstractC13091v.m36610t(new C13060l1(c13045h2M36593c, clientService.getCallPhase(), new a(null), 1));
    }

    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: a */
    public void mo42290a(EnumC14748a reason) {
        AbstractC22676k.m65750j(reason, "reason");
        this.logger.mo85226q(AbstractC11895b.m31996o("leaveCall(", reason.getTag(), ") ignored — not implemented yet"), new AbstractC30556a.a[0]);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: b */
    public Object mo42291b(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f54607z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f54607z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f54605x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f54607z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            ((C13045h2) this.stateOverride).m36570j(InterfaceC14759l.f.f54672a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f54604w = null;
            bVar2.f54607z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "100ms video call session", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.clientService.m42310f((HmsVideoCallSessionResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
            ((C13045h2) this.stateOverride).m36570j(null);
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC13075p1 interfaceC13075p1 = this.stateOverride;
            InterfaceC14759l.c cVar2 = new InterfaceC14759l.c(null, 1, null);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, cVar2);
        }
        return C23454a0.f92919a;
    }

    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: c, reason: from getter */
    public InterfaceC13058l getCallStateFlow() {
        return this.callStateFlow;
    }

    @Override // fs2.InterfaceC14758k
    /* JADX INFO: renamed from: d */
    public Object mo42293d(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logger.mo85226q("joinCall() ignored — not implemented yet", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    public /* synthetic */ C14751d(HmsVideoCallApi hmsVideoCallApi, C14753f c14753f, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hmsVideoCallApi, c14753f, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HmsVideoCallManager") : interfaceC34116n);
    }
}
