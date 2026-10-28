package vg0;

import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.models.AITurn;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
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

/* JADX INFO: renamed from: vg0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lvg0/p;", "Lod1/g;", "Lvg0/o;", "Lvg0/q;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36006p implements InterfaceC27844g<C36004o, AbstractC36008q> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.p$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateMxmSupportTicketInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CreateMxmSupportTicketInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153495w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153496x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153497y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36006p f153498z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C36006p c36006p) {
            super(3, interfaceC30057d);
            this.f153498z = c36006p;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36004o c36004o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153498z);
            aVar.f153496x = interfaceC13062m;
            aVar.f153497y = c36004o;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153495w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153496x;
                C13084s1 c13084s1 = new C13084s1(new b((C36004o) this.f153497y, this.f153498z, null));
                this.f153496x = null;
                this.f153497y = null;
                this.f153495w = 1;
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
            return invoke((InterfaceC13062m) obj, (C36004o) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.p$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateMxmSupportTicketInteractor$interact$1$1", m100430f = "CreateMxmSupportTicketInteractor.kt", m100431l = {46, 50, 54, 58, 60, 65, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/q;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C36006p f153499E;

        /* JADX INFO: renamed from: w */
        Object f153500w;

        /* JADX INFO: renamed from: x */
        int f153501x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f153502y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36004o f153503z;

        /* JADX INFO: renamed from: vg0.p$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateMxmSupportTicketInteractor$interact$1$1$response$1", m100430f = "CreateMxmSupportTicketInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/models/AITurn;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153504w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36006p f153505x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36004o f153506y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C36006p c36006p, C36004o c36004o, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153505x = c36006p;
                this.f153506y = c36004o;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153505x, this.f153506y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153504w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153505x.api;
                String fingerprint = this.f153506y.getFingerprint();
                String turnId = this.f153506y.getTurnId();
                String actionId = this.f153506y.getActionId();
                this.f153504w = 1;
                Object objCreateMxmSupportTicket = aiChatApi.createMxmSupportTicket(fingerprint, turnId, actionId, this);
                return objCreateMxmSupportTicket == enumC31071a ? enumC31071a : objCreateMxmSupportTicket;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36004o c36004o, C36006p c36006p, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153503z = c36004o;
            this.f153499E = c36006p;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153503z, this.f153499E, interfaceC30057d);
            bVar.f153502y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00cd A[PHI: r10 r14
          0x00cd: PHI (r10v2 vg0.p$b) = (r10v1 vg0.p$b), (r10v3 vg0.p$b) binds: [B:34:0x00ca, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00cd: PHI (r14v22 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:34:0x00ca, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ff A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0100 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x0101  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L16;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C36006p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C36006p(AiChatApi api, InterfaceC34116n logger) {
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

    public /* synthetic */ C36006p(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CreateMxmSupportTicketInteractor") : interfaceC34116n);
    }
}
