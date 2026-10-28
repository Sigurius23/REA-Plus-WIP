package vg0;

import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.api.AiCreateTurnRequestBody;
import com.whoop.p057ai.chat.api.AiTrackingCapabilities;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.Attachment;
import com.whoop.p057ai.chat.models.ChatAttachmentCarouselModel;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import n83.C26460c;
import nl0.EnumC26800b;
import od1.InterfaceC27844g;
import p088dc.AbstractC11895b;
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
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vg0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lvg0/s;", "Lod1/g;", "Lvg0/r;", "Lvg0/t;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "action", "Lcom/whoop/ai/chat/models/AITurn;", "f", "(Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36012s implements InterfaceC27844g<C36010r, AbstractC36014t> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.s$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateTurnInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CreateTurnInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153537w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153538x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153539y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36012s f153540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C36012s c36012s) {
            super(3, interfaceC30057d);
            this.f153540z = c36012s;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36010r c36010r, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153540z);
            aVar.f153538x = interfaceC13062m;
            aVar.f153539y = c36010r;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153537w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153538x;
                C13084s1 c13084s1 = new C13084s1(new b((C36010r) this.f153539y, this.f153540z, null));
                this.f153538x = null;
                this.f153539y = null;
                this.f153537w = 1;
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
            return invoke((InterfaceC13062m) obj, (C36010r) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.s$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateTurnInteractor$interact$1$1", m100430f = "CreateTurnInteractor.kt", m100431l = {57, 63, 65, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 83, 85, 89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f153541E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f153542F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C36010r f153543G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C36012s f153544H;

        /* JADX INFO: renamed from: w */
        Object f153545w;

        /* JADX INFO: renamed from: x */
        Object f153546x;

        /* JADX INFO: renamed from: y */
        Object f153547y;

        /* JADX INFO: renamed from: z */
        Object f153548z;

        /* JADX INFO: renamed from: vg0.s$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CreateTurnInteractor$interact$1$1$response$1", m100430f = "CreateTurnInteractor.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/models/AITurn;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153549w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36012s f153550x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36010r f153551y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ AiCreateTurnRequestBody f153552z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C36012s c36012s, C36010r c36010r, AiCreateTurnRequestBody aiCreateTurnRequestBody, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153550x = c36012s;
                this.f153551y = c36010r;
                this.f153552z = aiCreateTurnRequestBody;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153550x, this.f153551y, this.f153552z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153549w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153550x.api;
                String fingerprint = this.f153551y.getFingerprint();
                AiCreateTurnRequestBody aiCreateTurnRequestBody = this.f153552z;
                this.f153549w = 1;
                Object objCreateConversationTurn = aiChatApi.createConversationTurn(fingerprint, aiCreateTurnRequestBody, this);
                return objCreateConversationTurn == enumC31071a ? enumC31071a : objCreateConversationTurn;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36010r c36010r, C36012s c36012s, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153543G = c36010r;
            this.f153544H = c36012s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153543G, this.f153544H, interfaceC30057d);
            bVar.f153542F = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x009f A[PHI: r2
          0x009f: PHI (r2v8 com.whoop.ai.chat.models.AITurn) = (r2v5 com.whoop.ai.chat.models.AITurn), (r2v10 com.whoop.ai.chat.models.AITurn) binds: [B:24:0x009c, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00eb A[PHI: r2 r11 r15
          0x00eb: PHI (r2v11 com.whoop.ai.chat.models.AITurn) = (r2v8 com.whoop.ai.chat.models.AITurn), (r2v20 com.whoop.ai.chat.models.AITurn) binds: [B:27:0x00e8, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x00eb: PHI (r11v4 vg0.s$b) = (r11v3 vg0.s$b), (r11v5 vg0.s$b) binds: [B:27:0x00e8, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x00eb: PHI (r15v20 java.lang.Object) = (r15v19 java.lang.Object), (r15v0 java.lang.Object) binds: [B:27:0x00e8, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:36:0x011c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0137  */
        /* JADX WARN: Code duplicated, block: B:41:0x013b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0157 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x0158 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x0159  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AITurn aITurnM114358f;
            AbstractC36014t.b bVar;
            b bVar2;
            InterfaceC34385a interfaceC34385a;
            AbstractC36014t.a aVar;
            AITurn aITurn;
            AbstractC36014t.a aVar2;
            AbstractC36014t.d dVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153542F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153541E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i13) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    if (AbstractC39414r.m125890i0(this.f153543G.getFingerprint())) {
                        AbstractC36014t.a aVar3 = new AbstractC36014t.a("Conversation fingerprint is missing");
                        this.f153542F = null;
                        this.f153541E = 1;
                        if (interfaceC13062m.emit(aVar3, this) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        aITurnM114358f = this.f153544H.m114358f(this.f153543G);
                        AbstractC36014t.c cVar = new AbstractC36014t.c(aITurnM114358f);
                        this.f153542F = interfaceC13062m;
                        this.f153545w = aITurnM114358f;
                        this.f153541E = 2;
                        if (interfaceC13062m.emit(cVar, this) != enumC31071a) {
                            bVar = AbstractC36014t.b.f153555a;
                            this.f153542F = interfaceC13062m;
                            this.f153545w = aITurnM114358f;
                            this.f153541E = 3;
                            if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                                AiCreateTurnRequestBody aiCreateTurnRequestBody = new AiCreateTurnRequestBody(this.f153543G.getContent(), EnumC26800b.USER.getValue(), this.f153543G.getUserTimestamp(), this.f153543G.m114349c(), (AiTrackingCapabilities) null, this.f153543G.getIsSuggestion(), 16, (DefaultConstructorMarker) null);
                                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                                InterfaceC34116n interfaceC34116n = this.f153544H.logger;
                                a aVar4 = new a(this.f153544H, this.f153543G, aiCreateTurnRequestBody, null);
                                this.f153542F = interfaceC13062m;
                                this.f153545w = aITurnM114358f;
                                this.f153546x = null;
                                this.f153541E = 4;
                                bVar2 = this;
                                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar4, bVar2, 6, null);
                                if (obj != enumC31071a) {
                                    interfaceC34385a = (InterfaceC34385a) obj;
                                    if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                                        aITurn = (AITurn) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                                        if (aITurn != null) {
                                            dVar = new AbstractC36014t.d(aITurnM114358f.getId(), aITurn);
                                            bVar2.f153542F = null;
                                            bVar2.f153545w = null;
                                            bVar2.f153546x = null;
                                            bVar2.f153547y = null;
                                            bVar2.f153548z = null;
                                            bVar2.f153541E = 5;
                                            if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                                                return c23454a0;
                                            }
                                        } else {
                                            aVar2 = new AbstractC36014t.a("Response body is null");
                                            bVar2.f153542F = null;
                                            bVar2.f153545w = null;
                                            bVar2.f153546x = null;
                                            bVar2.f153547y = null;
                                            bVar2.f153548z = null;
                                            bVar2.f153541E = 6;
                                            if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                                                return c23454a0;
                                            }
                                        }
                                    } else {
                                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar = new AbstractC36014t.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                                        bVar2.f153542F = null;
                                        bVar2.f153545w = null;
                                        bVar2.f153546x = null;
                                        bVar2.f153547y = null;
                                        bVar2.f153541E = 7;
                                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                                            return c23454a0;
                                        }
                                    }
                                }
                            }
                            return enumC31071a;
                        }
                    }
                    return enumC31071a;
                case 1:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 2:
                    aITurnM114358f = (AITurn) this.f153545w;
                    AbstractC34132o.m107864I(obj);
                    bVar = AbstractC36014t.b.f153555a;
                    this.f153542F = interfaceC13062m;
                    this.f153545w = aITurnM114358f;
                    this.f153541E = 3;
                    if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                        AiCreateTurnRequestBody aiCreateTurnRequestBody2 = new AiCreateTurnRequestBody(this.f153543G.getContent(), EnumC26800b.USER.getValue(), this.f153543G.getUserTimestamp(), this.f153543G.m114349c(), (AiTrackingCapabilities) null, this.f153543G.getIsSuggestion(), 16, (DefaultConstructorMarker) null);
                        InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                        InterfaceC34116n interfaceC34116n2 = this.f153544H.logger;
                        a aVar5 = new a(this.f153544H, this.f153543G, aiCreateTurnRequestBody2, null);
                        this.f153542F = interfaceC13062m;
                        this.f153545w = aITurnM114358f;
                        this.f153546x = null;
                        this.f153541E = 4;
                        bVar2 = this;
                        obj = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, aVar5, bVar2, 6, null);
                        if (obj != enumC31071a) {
                            interfaceC34385a = (InterfaceC34385a) obj;
                            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                                aITurn = (AITurn) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                                if (aITurn != null) {
                                    dVar = new AbstractC36014t.d(aITurnM114358f.getId(), aITurn);
                                    bVar2.f153542F = null;
                                    bVar2.f153545w = null;
                                    bVar2.f153546x = null;
                                    bVar2.f153547y = null;
                                    bVar2.f153548z = null;
                                    bVar2.f153541E = 5;
                                    if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                                        return c23454a0;
                                    }
                                } else {
                                    aVar2 = new AbstractC36014t.a("Response body is null");
                                    bVar2.f153542F = null;
                                    bVar2.f153545w = null;
                                    bVar2.f153546x = null;
                                    bVar2.f153547y = null;
                                    bVar2.f153548z = null;
                                    bVar2.f153541E = 6;
                                    if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            } else {
                                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar = new AbstractC36014t.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                                bVar2.f153542F = null;
                                bVar2.f153545w = null;
                                bVar2.f153546x = null;
                                bVar2.f153547y = null;
                                bVar2.f153541E = 7;
                                if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        }
                    }
                    return enumC31071a;
                case 3:
                    aITurnM114358f = (AITurn) this.f153545w;
                    AbstractC34132o.m107864I(obj);
                    AiCreateTurnRequestBody aiCreateTurnRequestBody3 = new AiCreateTurnRequestBody(this.f153543G.getContent(), EnumC26800b.USER.getValue(), this.f153543G.getUserTimestamp(), this.f153543G.m114349c(), (AiTrackingCapabilities) null, this.f153543G.getIsSuggestion(), 16, (DefaultConstructorMarker) null);
                    InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n3 = this.f153544H.logger;
                    a aVar6 = new a(this.f153544H, this.f153543G, aiCreateTurnRequestBody3, null);
                    this.f153542F = interfaceC13062m;
                    this.f153545w = aITurnM114358f;
                    this.f153546x = null;
                    this.f153541E = 4;
                    bVar2 = this;
                    obj = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, null, aVar6, bVar2, 6, null);
                    if (obj != enumC31071a) {
                        interfaceC34385a = (InterfaceC34385a) obj;
                        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                            aITurn = (AITurn) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                            if (aITurn != null) {
                                dVar = new AbstractC36014t.d(aITurnM114358f.getId(), aITurn);
                                bVar2.f153542F = null;
                                bVar2.f153545w = null;
                                bVar2.f153546x = null;
                                bVar2.f153547y = null;
                                bVar2.f153548z = null;
                                bVar2.f153541E = 5;
                                if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                                    return c23454a0;
                                }
                            } else {
                                aVar2 = new AbstractC36014t.a("Response body is null");
                                bVar2.f153542F = null;
                                bVar2.f153545w = null;
                                bVar2.f153546x = null;
                                bVar2.f153547y = null;
                                bVar2.f153548z = null;
                                bVar2.f153541E = 6;
                                if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        } else {
                            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = new AbstractC36014t.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                            bVar2.f153542F = null;
                            bVar2.f153545w = null;
                            bVar2.f153546x = null;
                            bVar2.f153547y = null;
                            bVar2.f153541E = 7;
                            if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                    return enumC31071a;
                case 4:
                    aITurnM114358f = (AITurn) this.f153545w;
                    AbstractC34132o.m107864I(obj);
                    bVar2 = this;
                    interfaceC34385a = (InterfaceC34385a) obj;
                    if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new AbstractC36014t.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                        bVar2.f153542F = null;
                        bVar2.f153545w = null;
                        bVar2.f153546x = null;
                        bVar2.f153547y = null;
                        bVar2.f153541E = 7;
                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    aITurn = (AITurn) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                    if (aITurn != null) {
                        dVar = new AbstractC36014t.d(aITurnM114358f.getId(), aITurn);
                        bVar2.f153542F = null;
                        bVar2.f153545w = null;
                        bVar2.f153546x = null;
                        bVar2.f153547y = null;
                        bVar2.f153548z = null;
                        bVar2.f153541E = 5;
                        if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    aVar2 = new AbstractC36014t.a("Response body is null");
                    bVar2.f153542F = null;
                    bVar2.f153545w = null;
                    bVar2.f153546x = null;
                    bVar2.f153547y = null;
                    bVar2.f153548z = null;
                    bVar2.f153541E = 6;
                    if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 5:
                case 6:
                case 7:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C36012s(AiChatApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final AITurn m114358f(C36010r action) {
        String strM31995n = AbstractC11895b.m31995n("toString(...)");
        String value = EnumC26800b.USER.getValue();
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        List<Attachment> listM114347a = action.m114347a();
        if (listM114347a != null) {
            if (listM114347a.isEmpty()) {
                listM114347a = null;
            }
            if (listM114347a != null) {
                c26460cM119000x.add(new ChatAttachmentCarouselModel(listM114347a));
            }
        }
        String content = action.getContent();
        if (content != null) {
            String str = !AbstractC39414r.m125890i0(content) ? content : null;
            if (str != null) {
                c26460cM119000x.add(new MarkdownTextWidget(str, str.hashCode(), false, 4, (DefaultConstructorMarker) null));
            }
        }
        return new AITurn(AbstractC11895b.m31995n("toString(...)"), AiMessageStatus.ACTIVE, AbstractC37056f.m118958J(new AIMessage(strM31995n, value, AbstractC37056f.m118988k(c26460cM119000x))), null, null, true, 24, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C36012s(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CreateTurnInteractor") : interfaceC34116n);
    }
}
