package vg0;

import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vg0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lvg0/l0;", "Lod1/g;", "Lvg0/k0;", "Lvg0/m0;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35999l0 implements InterfaceC27844g<C35997k0, AbstractC36001m0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.l0$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnEndViewedInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MarkTurnEndViewedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153451w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153452x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153453y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35999l0 f153454z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C35999l0 c35999l0) {
            super(3, interfaceC30057d);
            this.f153454z = c35999l0;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C35997k0 c35997k0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153454z);
            aVar.f153452x = interfaceC13062m;
            aVar.f153453y = c35997k0;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153451w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153452x;
                C13084s1 c13084s1 = new C13084s1(new b((C35997k0) this.f153453y, this.f153454z, null));
                this.f153452x = null;
                this.f153453y = null;
                this.f153451w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C35997k0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.l0$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnEndViewedInteractor$interact$1$1", m100430f = "MarkTurnEndViewedInteractor.kt", m100431l = {38, 42, 46, 52, 56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/m0;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35999l0 f153455E;

        /* JADX INFO: renamed from: w */
        Object f153456w;

        /* JADX INFO: renamed from: x */
        int f153457x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f153458y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35997k0 f153459z;

        /* JADX INFO: renamed from: vg0.l0$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnEndViewedInteractor$interact$1$1$response$1", m100430f = "MarkTurnEndViewedInteractor.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153460w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35999l0 f153461x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35997k0 f153462y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35999l0 c35999l0, C35997k0 c35997k0, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153461x = c35999l0;
                this.f153462y = c35997k0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153461x, this.f153462y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153460w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153461x.api;
                String fingerprint = this.f153462y.getFingerprint();
                String turnId = this.f153462y.getTurnId();
                this.f153460w = 1;
                Object objMarkTurnEndSeen = aiChatApi.markTurnEndSeen(fingerprint, turnId, this);
                return objMarkTurnEndSeen == enumC31071a ? enumC31071a : objMarkTurnEndSeen;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35997k0 c35997k0, C35999l0 c35999l0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153459z = c35997k0;
            this.f153455E = c35999l0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153459z, this.f153455E, interfaceC30057d);
            bVar.f153458y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            InterfaceC34385a interfaceC34385a;
            AbstractC36001m0.a aVar;
            AbstractC36001m0.b bVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153458y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153457x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 2) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 3) {
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        bVar = AbstractC36001m0.b.f153480a;
                        this.f153458y = null;
                        this.f153456w = null;
                        this.f153457x = 4;
                        if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new AbstractC36001m0.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                        this.f153458y = null;
                        this.f153456w = null;
                        this.f153457x = 5;
                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 4 && i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC39414r.m125890i0(this.f153459z.getFingerprint())) {
                AbstractC36001m0.a aVar2 = new AbstractC36001m0.a("Conversation fingerprint is missing");
                this.f153458y = null;
                this.f153457x = 1;
                if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                    return c23454a0;
                }
            } else if (AbstractC39414r.m125890i0(this.f153459z.getTurnId())) {
                AbstractC36001m0.a aVar3 = new AbstractC36001m0.a("Turn ID is missing");
                this.f153458y = null;
                this.f153457x = 2;
                if (interfaceC13062m.emit(aVar3, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f153455E.logger;
                a aVar4 = new a(this.f153455E, this.f153459z, null);
                this.f153458y = interfaceC13062m;
                this.f153457x = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar4, this, 6, null);
                if (objM108729b != enumC31071a) {
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        bVar = AbstractC36001m0.b.f153480a;
                        this.f153458y = null;
                        this.f153456w = null;
                        this.f153457x = 4;
                        if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new AbstractC36001m0.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                        this.f153458y = null;
                        this.f153456w = null;
                        this.f153457x = 5;
                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            }
            return enumC31071a;
        }
    }

    public C35999l0(AiChatApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C35999l0(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MarkTurnEndViewedInteractor") : interfaceC34116n);
    }
}
