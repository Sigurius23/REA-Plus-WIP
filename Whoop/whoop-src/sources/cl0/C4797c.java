package cl0;

import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatConversationKt;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiMessageStatus;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fl0.C14558c;
import fl0.EnumC14565j;
import l83.C23454a0;
import od1.AbstractC27845h;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xk0.C38423a;

/* JADX INFO: renamed from: cl0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcl0/c;", "", "Lcl0/b;", "activeResponsePollingInteractor", "Lxk0/a;", "analyticsHelper", "<init>", "(Lcl0/b;Lxk0/a;)V", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "latestResponse", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "conversation", "Lec3/l;", "Lfl0/c;", "c", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/conversation/AiChatConversation;)Lec3/l;", "aiConversationResult", "b", "(Lfl0/c;)Lec3/l;", "a", "Lcl0/b;", "Lxk0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4797c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4796b activeResponsePollingInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: cl0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19758a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f19759b;

        static {
            int[] iArr = new int[EnumC14565j.values().length];
            try {
                iArr[EnumC14565j.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14565j.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14565j.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14565j.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC14565j.FLAGGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19758a = iArr;
            int[] iArr2 = new int[AiMessageStatus.values().length];
            try {
                iArr2[AiMessageStatus.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AiMessageStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AiMessageStatus.FLAGGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AiMessageStatus.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AiMessageStatus.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f19759b = iArr2;
        }
    }

    /* JADX INFO: renamed from: cl0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19760w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AiChatConversation f19761x;

        /* JADX INFO: renamed from: cl0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19762w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AiChatConversation f19763x;

            /* JADX INFO: renamed from: cl0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.AiActiveResponseInteractor$routeLatestResponse$$inlined$map$1$2", m100430f = "AiActiveResponseInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41359a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19764E;

                /* JADX INFO: renamed from: F */
                Object f19765F;

                /* JADX INFO: renamed from: G */
                Object f19766G;

                /* JADX INFO: renamed from: H */
                int f19767H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19768w;

                /* JADX INFO: renamed from: x */
                int f19769x;

                /* JADX INFO: renamed from: y */
                Object f19770y;

                public C41359a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19768w = obj;
                    this.f19769x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AiChatConversation aiChatConversation) {
                this.f19762w = interfaceC13062m;
                this.f19763x = aiChatConversation;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41359a c41359a;
                if (interfaceC30057d instanceof C41359a) {
                    c41359a = (C41359a) interfaceC30057d;
                    int i13 = c41359a.f19769x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41359a.f19769x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41359a = new C41359a(interfaceC30057d);
                    }
                } else {
                    c41359a = new C41359a(interfaceC30057d);
                }
                Object obj2 = c41359a.f19768w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41359a.f19769x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19762w;
                    AiChatConversation aiChatConversationReplaceLatestResponse = AiChatConversationKt.replaceLatestResponse(this.f19763x, (AiChatMessage) obj);
                    c41359a.f19770y = null;
                    c41359a.f19764E = null;
                    c41359a.f19765F = null;
                    c41359a.f19766G = null;
                    c41359a.f19767H = 0;
                    c41359a.f19769x = 1;
                    if (interfaceC13062m.emit(aiChatConversationReplaceLatestResponse, c41359a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, AiChatConversation aiChatConversation) {
            this.f19760w = interfaceC13058l;
            this.f19761x = aiChatConversation;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19760w.collect(new a(interfaceC13062m, this.f19761x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cl0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19772w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4797c f19773x;

        /* JADX INFO: renamed from: cl0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19774w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4797c f19775x;

            /* JADX INFO: renamed from: cl0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.AiActiveResponseInteractor$routeLatestResponse$$inlined$map$2$2", m100430f = "AiActiveResponseInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41360a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19776E;

                /* JADX INFO: renamed from: F */
                Object f19777F;

                /* JADX INFO: renamed from: G */
                Object f19778G;

                /* JADX INFO: renamed from: H */
                int f19779H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19780w;

                /* JADX INFO: renamed from: x */
                int f19781x;

                /* JADX INFO: renamed from: y */
                Object f19782y;

                public C41360a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19780w = obj;
                    this.f19781x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4797c c4797c) {
                this.f19774w = interfaceC13062m;
                this.f19775x = c4797c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41360a c41360a;
                EnumC14565j enumC14565j;
                if (interfaceC30057d instanceof C41360a) {
                    c41360a = (C41360a) interfaceC30057d;
                    int i13 = c41360a.f19781x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41360a.f19781x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41360a = new C41360a(interfaceC30057d);
                    }
                } else {
                    c41360a = new C41360a(interfaceC30057d);
                }
                Object obj2 = c41360a.f19780w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41360a.f19781x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19774w;
                    AiChatConversation aiChatConversation = (AiChatConversation) obj;
                    AiChatMessage latestAssistantResponse = AiChatConversationKt.getLatestAssistantResponse(aiChatConversation);
                    if ((latestAssistantResponse != null ? latestAssistantResponse.getMessageStatus() : null) == AiMessageStatus.FAILED) {
                        this.f19775x.analyticsHelper.m123070h(aiChatConversation.getId(), true);
                        enumC14565j = EnumC14565j.ERROR;
                    } else {
                        enumC14565j = EnumC14565j.SUCCESS;
                    }
                    C14558c c14558c = new C14558c(aiChatConversation, enumC14565j, null, null, false, null, 60, null);
                    c41360a.f19782y = null;
                    c41360a.f19776E = null;
                    c41360a.f19777F = null;
                    c41360a.f19778G = null;
                    c41360a.f19779H = 0;
                    c41360a.f19781x = 1;
                    if (interfaceC13062m.emit(c14558c, c41360a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C4797c c4797c) {
            this.f19772w = interfaceC13058l;
            this.f19773x = c4797c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19772w.collect(new a(interfaceC13062m, this.f19773x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C4797c(C4796b activeResponsePollingInteractor, C38423a analyticsHelper) {
        AbstractC22676k.m65750j(activeResponsePollingInteractor, "activeResponsePollingInteractor");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.activeResponsePollingInteractor = activeResponsePollingInteractor;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13058l m15160c(AiChatMessage latestResponse, AiChatConversation conversation) {
        int i13 = a.f19759b[latestResponse.getMessageStatus().ordinal()];
        if (i13 == 1) {
            return new C0456u(new C14558c(conversation, EnumC14565j.SUCCESS, null, null, false, null, 60, null), 1);
        }
        if (i13 == 2) {
            return new C0456u(new C14558c(conversation, EnumC14565j.ERROR, null, null, false, null, 60, null), 1);
        }
        if (i13 == 3) {
            return new C0456u(new C14558c(conversation, EnumC14565j.FLAGGED, null, null, false, null, 60, null), 1);
        }
        if (i13 == 4) {
            return new C0456u(new C14558c(conversation, EnumC14565j.STOPPED, null, null, false, null, 60, null), 1);
        }
        if (i13 == 5) {
            return new c(new b(AbstractC27845h.m83945a(new C0456u(latestResponse, 1), this.activeResponsePollingInteractor), conversation), this);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m15161b(C14558c aiConversationResult) {
        InterfaceC13058l interfaceC13058lM15160c;
        AbstractC22676k.m65750j(aiConversationResult, "aiConversationResult");
        int i13 = a.f19758a[aiConversationResult.getMessagingState().ordinal()];
        if (i13 == 1 || i13 == 2) {
            return new C0456u(aiConversationResult, 1);
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        AiChatMessage latestAssistantResponse = AiChatConversationKt.getLatestAssistantResponse(aiConversationResult.getConversation());
        return (latestAssistantResponse == null || (interfaceC13058lM15160c = m15160c(latestAssistantResponse, aiConversationResult.getConversation())) == null) ? new C0456u(aiConversationResult, 1) : interfaceC13058lM15160c;
    }
}
