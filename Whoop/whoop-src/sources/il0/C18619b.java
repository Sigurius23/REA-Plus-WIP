package il0;

import c93.InterfaceC4351m;
import com.whoop.bot.api.AiConversationApi;
import com.whoop.bot.models.history.ConversationHistory;
import ec3.AbstractC13091v;
import ec3.C13060l1;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import xk0.C38423a;

/* JADX INFO: renamed from: il0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lil0/b;", "Lod1/g;", "Lil0/a;", "Lil0/c;", "Lcom/whoop/bot/api/AiConversationApi;", "api", "Ltr2/n;", "logger", "Lxk0/a;", "analyticsHelper", "<init>", "(Lcom/whoop/bot/api/AiConversationApi;Ltr2/n;Lxk0/a;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/bot/api/AiConversationApi;", "b", "Ltr2/n;", "c", "Lxk0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18619b implements InterfaceC27844g<AbstractC18618a, C18620c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiConversationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: il0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.history.AiConversationHistoryInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiConversationHistoryInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72803w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72805y;

        public a(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18618a abstractC18618a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f72804x = interfaceC13062m;
            aVar.f72805y = abstractC18618a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72803w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f72804x;
                if (!AbstractC22676k.m65745e((AbstractC18618a) this.f72805y, AbstractC18618a.a.f72799a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(new b(null));
                this.f72804x = null;
                this.f72805y = null;
                this.f72803w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC18618a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: il0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.history.AiConversationHistoryInteractor$interact$1$2", m100430f = "AiConversationHistoryInteractor.kt", m100431l = {30, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil0/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72806w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72807x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f72807x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f72807x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f72806w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                il0.d$d r6 = il0.AbstractC18621d.d.f72819a
                r5.f72807x = r0
                r5.f72806w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L3d
            L30:
                il0.d$c r6 = il0.AbstractC18621d.c.f72818a
                r2 = 0
                r5.f72807x = r2
                r5.f72806w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: il0.C18619b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: il0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.history.AiConversationHistoryInteractor$interact$2", m100430f = "AiConversationHistoryInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lil0/c;", "prevResult", "Lil0/d;", "action", "<anonymous>", "(Lil0/c;Lil0/d;)Lil0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72808w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f72809x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72810y;

        /* JADX INFO: renamed from: il0.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.history.AiConversationHistoryInteractor$interact$2$1", m100430f = "AiConversationHistoryInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bot/models/history/ConversationHistory;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f72812w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18619b f72813x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C18619b c18619b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f72813x = c18619b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f72813x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f72812w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiConversationApi aiConversationApi = this.f72813x.api;
                this.f72812w = 1;
                Object history = aiConversationApi.getHistory(this);
                return history == enumC31071a ? enumC31071a : history;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ConversationHistory> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18620c c18620c, AbstractC18621d abstractC18621d, InterfaceC30057d<? super C18620c> interfaceC30057d) {
            c cVar = C18619b.this.new c(interfaceC30057d);
            cVar.f72809x = c18620c;
            cVar.f72810y = abstractC18621d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            C18620c c18620c = (C18620c) this.f72809x;
            AbstractC18621d abstractC18621d = (AbstractC18621d) this.f72810y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72808w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(abstractC18621d, AbstractC18621d.b.f72817a)) {
                    return C18620c.m53893b(c18620c, true, false, null, 4, null);
                }
                if (AbstractC22676k.m65745e(abstractC18621d, AbstractC18621d.d.f72819a)) {
                    return C18620c.m53893b(c18620c, false, true, null, 4, null);
                }
                if (!AbstractC22676k.m65745e(abstractC18621d, AbstractC18621d.c.f72818a)) {
                    if (abstractC18621d instanceof AbstractC18621d.a) {
                        return new C18620c(false, false, null, 7, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C18619b.this.logger;
                a aVar = new a(C18619b.this, null);
                this.f72809x = null;
                this.f72810y = null;
                this.f72808w = 1;
                cVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar, cVar, 6, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                cVar = this;
            }
            C18619b c18619b = C18619b.this;
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                c18619b.analyticsHelper.m123057L((InterfaceC34385a.b) interfaceC34385a, "get_history");
                return new C18620c(true, false, null, 6, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return new C18620c(false, false, (ConversationHistory) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), 3, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C18619b(AiConversationApi api, InterfaceC34116n logger, C38423a analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new C13060l1(new C18620c(false, true, null, 5, null), AbstractC13091v.m36590P(upstream, new a(null)), new c(null)));
    }
}
