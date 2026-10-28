package cl0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiActiveResponseRequest;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiMessageStatus;
import java.util.List;
import l83.C23454a0;
import nl0.EnumC26800b;
import or2.InterfaceC28215x1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.AbstractC34391g;
import u02.C34387c;
import u02.C34388d;
import u02.C34389e;
import u02.C34392h;
import xk0.C38423a;

/* JADX INFO: renamed from: cl0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcl0/a;", "", "Lu02/c;", "apiClient", "Lxk0/a;", "analyticsHelper", "Lor2/x1;", "uuidGenerator", "Lq83/j;", "ioDispatcher", "<init>", "(Lu02/c;Lxk0/a;Lor2/x1;Lq83/j;)V", "", "id", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lu02/c;", "b", "Lxk0/a;", "Lor2/x1;", "d", "Lq83/j;", "()Lcom/whoop/bot/models/conversation/AiChatMessage;", "errorChatMessage", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4795a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: cl0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.ActiveResponseApiInteractor", m100430f = "ActiveResponseApiInteractor.kt", m100431l = {32}, m100432m = "getLatestMessage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f19724E;

        /* JADX INFO: renamed from: w */
        Object f19725w;

        /* JADX INFO: renamed from: x */
        Object f19726x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f19727y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f19727y = obj;
            this.f19724E |= Integer.MIN_VALUE;
            return C4795a.this.m15153c(null, this);
        }
    }

    /* JADX INFO: renamed from: cl0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.ActiveResponseApiInteractor$getLatestMessage$apiResult$1", m100430f = "ActiveResponseApiInteractor.kt", m100431l = {33, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lu02/h;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "<anonymous>", "(Lbc3/c0;)Lu02/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AiActiveResponseRequest f19730F;

        /* JADX INFO: renamed from: w */
        Object f19731w;

        /* JADX INFO: renamed from: x */
        Object f19732x;

        /* JADX INFO: renamed from: y */
        int f19733y;

        /* JADX INFO: renamed from: z */
        int f19734z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AiActiveResponseRequest aiActiveResponseRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19730F = aiActiveResponseRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4795a.this.new b(this.f19730F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C34392h<AiChatMessage>> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f19734z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.f19732x
                f63.c r0 = (f63.AbstractC14155c) r0
                java.lang.Object r0 = r8.f19731w
                f63.c r0 = (f63.AbstractC14155c) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L77
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L4c
            L24:
                p505ts.AbstractC34132o.m107864I(r9)
                cl0.a r9 = cl0.C4795a.this
                u02.c r9 = cl0.C4795a.m15151a(r9)
                com.whoop.bot.models.conversation.AiActiveResponseRequest r1 = r8.f19730F
                java.lang.Class<l83.a0> r4 = l83.C23454a0.class
                j93.a0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.m65689b(r4)
                java.lang.reflect.Type r6 = j93.AbstractC21478l0.m60396B(r5)
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r4 = r7.getOrCreateKotlinClass(r4)
                s63.a r4 = ge3.AbstractC15751g.m44445Y(r4, r5, r6)
                r8.f19734z = r3
                java.lang.Object r9 = r9.m108748d(r1, r4, r8)
                if (r9 != r0) goto L4c
                goto L76
            L4c:
                f63.c r9 = (f63.AbstractC14155c) r9
                w53.b r9 = r9.mo13321a()
                java.lang.Class<com.whoop.bot.models.conversation.AiChatMessage> r1 = com.whoop.bot.models.conversation.AiChatMessage.class
                j93.a0 r3 = p715kotlin.jvm.internal.AbstractC22671h0.m65691d(r1)
                java.lang.reflect.Type r4 = j93.AbstractC21478l0.m60396B(r3)
                kotlin.jvm.internal.i0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r1 = r5.getOrCreateKotlinClass(r1)
                s63.a r1 = ge3.AbstractC15751g.m44445Y(r1, r3, r4)
                r3 = 0
                r8.f19731w = r3
                r8.f19732x = r3
                r3 = 0
                r8.f19733y = r3
                r8.f19734z = r2
                java.lang.Object r9 = r9.m118137a(r1, r8)
                if (r9 != r0) goto L77
            L76:
                return r0
            L77:
                if (r9 == 0) goto L81
                com.whoop.bot.models.conversation.AiChatMessage r9 = (com.whoop.bot.models.conversation.AiChatMessage) r9
                u02.h r0 = new u02.h
                r0.<init>(r9)
                return r0
            L81:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type com.whoop.bot.models.conversation.AiChatMessage"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: cl0.C4795a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4795a(C34387c apiClient, C38423a analyticsHelper, InterfaceC28215x1 uuidGenerator, InterfaceC30063j ioDispatcher) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        this.apiClient = apiClient;
        this.analyticsHelper = analyticsHelper;
        this.uuidGenerator = uuidGenerator;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: renamed from: b */
    private final AiChatMessage m15152b() {
        AiMessageStatus aiMessageStatus = AiMessageStatus.FAILED;
        String value = EnumC26800b.ASSISTANT.getValue();
        String string = this.uuidGenerator.mo85405a().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new AiChatMessage("", aiMessageStatus, value, string, (String) null, (List) null, false, (Boolean) null, (String) null, (String) null, (List) null, false, 4080, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m15153c(String str, InterfaceC30057d<? super AiChatMessage> interfaceC30057d) throws Throwable {
        a aVar;
        AbstractC34391g c34389e;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f19724E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f19724E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM8705K = aVar.f19727y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f19724E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                AiActiveResponseRequest aiActiveResponseRequest = new AiActiveResponseRequest(str);
                InterfaceC30063j interfaceC30063j = this.ioDispatcher;
                b bVar = new b(aiActiveResponseRequest, null);
                aVar.f19725w = null;
                aVar.f19726x = null;
                aVar.f19724E = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, bVar, aVar);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            c34389e = (AbstractC34391g) objM8705K;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(aVar.getContext());
            this.analyticsHelper.m123058M(e5, "get_latest_message");
            c34389e = new C34389e(C34388d.INSTANCE.m108751a(e5));
        }
        if (c34389e instanceof C34392h) {
            return (AiChatMessage) ((C34392h) c34389e).m108758a();
        }
        if (c34389e instanceof C34389e) {
            return m15152b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
