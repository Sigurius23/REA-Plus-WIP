package hl0;

import com.whoop.bot.api.AiConversationApi;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import ec3.AbstractC13091v;
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
import xk0.C38423a;

/* JADX INFO: renamed from: hl0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lhl0/b;", "Lod1/g;", "Lhl0/a;", "Lhl0/c;", "Lcom/whoop/bot/api/AiConversationApi;", "api", "Lxk0/a;", "analyticsHelper", "Lhl0/e;", "feedbackStatusStore", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/bot/api/AiConversationApi;Lxk0/a;Lhl0/e;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/bot/api/AiConversationApi;", "b", "Lxk0/a;", "c", "Lhl0/e;", "d", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17393b implements InterfaceC27844g<C17392a, C17394c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiConversationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17396e feedbackStatusStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: hl0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.feedback.AiFeedbackInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiFeedbackInteractor.kt", m100431l = {190, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f67342E;

        /* JADX INFO: renamed from: F */
        Object f67343F;

        /* JADX INFO: renamed from: G */
        Object f67344G;

        /* JADX INFO: renamed from: H */
        int f67345H;

        /* JADX INFO: renamed from: w */
        int f67346w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67347x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f67348y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17393b f67349z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C17393b c17393b) {
            super(3, interfaceC30057d);
            this.f67349z = c17393b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C17392a c17392a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f67349z);
            aVar.f67347x = interfaceC13062m;
            aVar.f67348y = c17392a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m;
            C17392a c17392a;
            Object objM108729b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67346w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    c17392a = (C17392a) this.f67344G;
                    interfaceC13062m = (InterfaceC13062m) this.f67342E;
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            }
            AbstractC34132o.m107864I(obj);
            interfaceC13062m = (InterfaceC13062m) this.f67347x;
            c17392a = (C17392a) this.f67348y;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.f67349z.logger;
            b bVar = this.f67349z.new b(c17392a, null);
            this.f67347x = null;
            this.f67348y = null;
            this.f67342E = interfaceC13062m;
            this.f67343F = null;
            this.f67344G = c17392a;
            this.f67345H = 0;
            this.f67346w = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to submit ai conversation feedback", bVar, this, 2, null);
            if (objM108729b != enumC31071a) {
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            boolean z4 = interfaceC34385a instanceof InterfaceC34385a.c;
            if (z4) {
                this.f67349z.feedbackStatusStore.m49236a(c17392a.getMessageId(), c17392a.getFeedback());
            } else {
                if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f67349z.analyticsHelper.m123057L((InterfaceC34385a.b) interfaceC34385a, "post_feedback");
            }
            C17394c c17394c = new C17394c(this.f67349z.feedbackStatusStore.m49237b(), true, z4 ? AbstractC17395d.b.f67357a : AbstractC17395d.a.f67356a);
            this.f67347x = null;
            this.f67348y = null;
            this.f67342E = null;
            this.f67343F = null;
            this.f67344G = null;
            this.f67346w = 2;
            AbstractC13091v.m36615y(interfaceC13062m);
            Object objEmit = interfaceC13062m.emit(c17394c, this);
            if (objEmit != EnumC31071a.f128113w) {
                objEmit = c23454a0;
            }
            if (objEmit != EnumC31071a.f128113w) {
                objEmit = c23454a0;
            }
            return objEmit == enumC31071a ? enumC31071a : c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C17392a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: hl0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.feedback.AiFeedbackInteractor$interact$1$result$1", m100430f = "AiFeedbackInteractor.kt", m100431l = {24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f67350w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17392a f67352y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C17392a c17392a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f67352y = c17392a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17393b.this.new b(this.f67352y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67350w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiConversationApi aiConversationApi = C17393b.this.api;
            String messageId = this.f67352y.getMessageId();
            AiMessageFeedback feedback = this.f67352y.getFeedback();
            this.f67350w = 1;
            Object objPostFeedback = aiConversationApi.postFeedback(messageId, feedback, this);
            return objPostFeedback == enumC31071a ? enumC31071a : objPostFeedback;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C17393b(AiConversationApi api, C38423a analyticsHelper, C17396e feedbackStatusStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(feedbackStatusStore, "feedbackStatusStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.feedbackStatusStore = feedbackStatusStore;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C17393b(AiConversationApi aiConversationApi, C38423a c38423a, C17396e c17396e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiConversationApi, c38423a, c17396e, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiFeedbackInteractor") : interfaceC34116n);
    }
}
