package vg0;

import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.models.AITurn;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import js0.AbstractC21909c;
import l83.C23454a0;
import m83.C25271y;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vg0.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0018J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lvg0/b1;", "Lod1/g;", "Lvg0/o0;", "Lcom/whoop/ai/chat/models/AITurn;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ljs0/c;Ltr2/n;)V", "action", "", "isFirstPoll", "Lec3/l;", "s", "(Lvg0/o0;Z)Lec3/l;", "", "turnId", "m", "(Ljava/lang/String;)Lcom/whoop/ai/chat/models/AITurn;", "Ll83/a0;", "r", "(Ljava/lang/String;)V", "turn", "q", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/AITurn;)V", "error", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "o", "n", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ljs0/c;", "c", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35979b1 implements InterfaceC27844g<C36005o0, AITurn> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.b1$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.TurnPollingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TurnPollingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153271w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153272x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153273y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35979b1 f153274z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C35979b1 c35979b1) {
            super(3, interfaceC30057d);
            this.f153274z = c35979b1;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36005o0 c36005o0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153274z);
            aVar.f153272x = interfaceC13062m;
            aVar.f153273y = c36005o0;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153271w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153272x;
                C36005o0 c36005o0 = (C36005o0) this.f153273y;
                this.f153274z.m114255r(c36005o0.getTurnId());
                InterfaceC13058l interfaceC13058lM114256s = this.f153274z.m114256s(c36005o0, true);
                this.f153272x = null;
                this.f153273y = null;
                this.f153271w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM114256s, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C36005o0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.b1$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.TurnPollingInteractor$pollTurnEndpoint$1", m100430f = "TurnPollingInteractor.kt", m100431l = {59, 63, 71, 88, 95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/ai/chat/models/AITurn;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f153275E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f153276F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f153277G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C35979b1 f153278H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C36005o0 f153279I;

        /* JADX INFO: renamed from: w */
        Object f153280w;

        /* JADX INFO: renamed from: x */
        Object f153281x;

        /* JADX INFO: renamed from: y */
        int f153282y;

        /* JADX INFO: renamed from: z */
        int f153283z;

        /* JADX INFO: renamed from: vg0.b1$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f153284a;

            static {
                int[] iArr = new int[AiMessageStatus.values().length];
                try {
                    iArr[AiMessageStatus.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AiMessageStatus.COMPLETE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AiMessageStatus.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AiMessageStatus.FLAGGED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AiMessageStatus.STOPPED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f153284a = iArr;
            }
        }

        /* JADX INFO: renamed from: vg0.b1$b$b, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.TurnPollingInteractor$pollTurnEndpoint$1$response$1", m100430f = "TurnPollingInteractor.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/models/AITurn;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42535b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153285w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35979b1 f153286x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36005o0 f153287y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42535b(C35979b1 c35979b1, C36005o0 c36005o0, InterfaceC30057d<? super C42535b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153286x = c35979b1;
                this.f153287y = c36005o0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42535b(this.f153286x, this.f153287y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153285w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153286x.api;
                String fingerprint = this.f153287y.getFingerprint();
                String turnId = this.f153287y.getTurnId();
                this.f153285w = 1;
                Object conversationTurn = aiChatApi.getConversationTurn(fingerprint, turnId, this);
                return conversationTurn == enumC31071a ? enumC31071a : conversationTurn;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d) {
                return ((C42535b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, C35979b1 c35979b1, C36005o0 c36005o0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153277G = z4;
            this.f153278H = c35979b1;
            this.f153279I = c36005o0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153277G, this.f153278H, this.f153279I, interfaceC30057d);
            bVar.f153276F = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x025e  */
        /* JADX WARN: Code duplicated, block: B:19:0x006e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0070  */
        /* JADX WARN: Code duplicated, block: B:22:0x0098  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00db  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:43:0x0100  */
        /* JADX WARN: Code duplicated, block: B:45:0x0108  */
        /* JADX WARN: Code duplicated, block: B:46:0x010d  */
        /* JADX WARN: Code duplicated, block: B:48:0x0119  */
        /* JADX WARN: Code duplicated, block: B:49:0x011e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0122  */
        /* JADX WARN: Code duplicated, block: B:54:0x0125  */
        /* JADX WARN: Code duplicated, block: B:57:0x013f A[PHI: r0 r1
          0x013f: PHI (r0v25 ec3.m) = (r0v28 ec3.m), (r0v28 ec3.m), (r0v1 ec3.m) binds: [B:19:0x006e, B:55:0x013b, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x013f: PHI (r1v9 int) = (r1v13 int), (r1v13 int), (r1v17 int) binds: [B:19:0x006e, B:55:0x013b, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:63:0x0173  */
        /* JADX WARN: Code duplicated, block: B:66:0x017b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0189  */
        /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:75:0x01ba A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:85:0x01da  */
        /* JADX WARN: Code duplicated, block: B:91:0x021d  */
        /* JADX WARN: Code duplicated, block: B:93:0x0222  */
        /* JADX WARN: Code duplicated, block: B:96:0x0251  */
        /* JADX WARN: Code duplicated, block: B:98:0x0258  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v17, types: [int] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0218 -> B:18:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0251 -> B:97:0x0252). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 609
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C35979b1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C35979b1(AiChatApi api, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final AITurn m114250m(String turnId) {
        return new AITurn(turnId, AiMessageStatus.FAILED, C25271y.f99162w, null, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m114251n(String turnId) {
        this.logger.mo85228t(AbstractC11266d.m30461o("Poll complete. TurnId: ", turnId), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m114252o(String turnId) {
        this.logger.mo85228t(AbstractC11266d.m30461o("Poll continuing. TurnId: ", turnId), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m114253p(String turnId, String error) {
        this.logger.mo85222m(AbstractC31061c.m95640p("Poll failed. TurnId: ", turnId, ", Error: ", error), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m114254q(String turnId, AITurn turn) {
        this.logger.mo85228t("Poll response. TurnId: " + turnId + ", Status: " + turn.getTurnStatus(), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m114255r(String turnId) {
        this.logger.mo85228t(AbstractC11266d.m30461o("Poll started. TurnId: ", turnId), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC13058l m114256s(C36005o0 action, boolean isFirstPoll) {
        return new C13084s1(new b(isFirstPoll, this, action, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C35979b1(AiChatApi aiChatApi, AbstractC21909c abstractC21909c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, abstractC21909c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TurnPollingInteractor") : interfaceC34116n);
    }
}
