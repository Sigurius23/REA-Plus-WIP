package cl0;

import bc3.AbstractC3034m0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.data.repositories.AiPollingDelay;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import od1.InterfaceC27844g;
import or2.AbstractC28188o1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cl0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcl0/b;", "Lod1/g;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "Lcl0/a;", "activeResponseApiInteractor", "Ljs0/c;", "configurationRepository", "<init>", "(Lcl0/a;Ljs0/c;)V", "message", "Lec3/l;", "g", "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;", "Ll83/a0;", "f", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcl0/a;", "b", "Ljs0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4796b implements InterfaceC27844g<AiChatMessage, AiChatMessage> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4795a activeResponseApiInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: cl0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19737w;

        /* JADX INFO: renamed from: cl0.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41357a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19738w;

            /* JADX INFO: renamed from: cl0.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.ActiveResponsePollingInteractor$interact$$inlined$filter$1$2", m100430f = "ActiveResponsePollingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41358a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f19740F;

                /* JADX INFO: renamed from: G */
                Object f19741G;

                /* JADX INFO: renamed from: H */
                int f19742H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19743w;

                /* JADX INFO: renamed from: x */
                int f19744x;

                /* JADX INFO: renamed from: y */
                Object f19745y;

                /* JADX INFO: renamed from: z */
                Object f19746z;

                public C41358a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19743w = obj;
                    this.f19744x |= Integer.MIN_VALUE;
                    return C41357a.this.emit(null, this);
                }
            }

            public C41357a(InterfaceC13062m interfaceC13062m) {
                this.f19738w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41358a c41358a;
                if (interfaceC30057d instanceof C41358a) {
                    c41358a = (C41358a) interfaceC30057d;
                    int i13 = c41358a.f19744x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41358a.f19744x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41358a = new C41358a(interfaceC30057d);
                    }
                } else {
                    c41358a = new C41358a(interfaceC30057d);
                }
                Object obj2 = c41358a.f19743w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41358a.f19744x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19738w;
                    if (AbstractC28188o1.m85314d(((AiChatMessage) obj).getContent())) {
                        c41358a.f19745y = null;
                        c41358a.f19746z = null;
                        c41358a.f19740F = null;
                        c41358a.f19741G = null;
                        c41358a.f19742H = 0;
                        c41358a.f19744x = 1;
                        if (interfaceC13062m.emit(obj, c41358a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f19737w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19737w.collect(new C41357a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cl0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.ActiveResponsePollingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ActiveResponsePollingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f19747w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f19748x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f19749y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4796b f19750z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C4796b c4796b) {
            super(3, interfaceC30057d);
            this.f19750z = c4796b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AiChatMessage aiChatMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f19750z);
            bVar.f19748x = interfaceC13062m;
            bVar.f19749y = aiChatMessage;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f19747w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f19748x;
                InterfaceC13058l interfaceC13058lM15158g = this.f19750z.m15158g((AiChatMessage) this.f19749y);
                this.f19748x = null;
                this.f19749y = null;
                this.f19747w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM15158g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AiChatMessage) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: cl0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.active.ActiveResponsePollingInteractor$pollMessageEndpoint$1", m100430f = "ActiveResponsePollingInteractor.kt", m100431l = {31, 33, 34, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C4796b f19751E;

        /* JADX INFO: renamed from: w */
        Object f19752w;

        /* JADX INFO: renamed from: x */
        int f19753x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f19754y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AiChatMessage f19755z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AiChatMessage aiChatMessage, C4796b c4796b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19755z = aiChatMessage;
            this.f19751E = c4796b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f19755z, this.f19751E, interfaceC30057d);
            cVar.f19754y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r2
          0x0049: PHI (r2v4 com.whoop.bot.models.conversation.AiChatMessage) = 
          (r2v1 com.whoop.bot.models.conversation.AiChatMessage)
          (r2v6 com.whoop.bot.models.conversation.AiChatMessage)
          (r2v8 com.whoop.bot.models.conversation.AiChatMessage)
         binds: [B:15:0x0046, B:27:0x0085, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0069 A[PHI: r8
          0x0069: PHI (r8v2 java.lang.Object) = (r8v8 java.lang.Object), (r8v0 java.lang.Object) binds: [B:20:0x0066, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0085 -> B:17:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f19754y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f19753x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L37
                if (r2 == r6) goto L2f
                if (r2 == r5) goto L27
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                goto L2f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r2 = r7.f19752w
                com.whoop.bot.models.conversation.AiChatMessage r2 = (com.whoop.bot.models.conversation.AiChatMessage) r2
                p505ts.AbstractC34132o.m107864I(r8)
                goto L79
            L27:
                java.lang.Object r2 = r7.f19752w
                com.whoop.bot.models.conversation.AiChatMessage r2 = (com.whoop.bot.models.conversation.AiChatMessage) r2
                p505ts.AbstractC34132o.m107864I(r8)
                goto L69
            L2f:
                java.lang.Object r2 = r7.f19752w
                com.whoop.bot.models.conversation.AiChatMessage r2 = (com.whoop.bot.models.conversation.AiChatMessage) r2
                p505ts.AbstractC34132o.m107864I(r8)
                goto L49
            L37:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.bot.models.conversation.AiChatMessage r2 = r7.f19755z
                r7.f19754y = r0
                r7.f19752w = r2
                r7.f19753x = r6
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L49
                goto L87
            L49:
                com.whoop.bot.models.conversation.AiMessageStatus r8 = r2.getMessageStatus()
                com.whoop.bot.models.conversation.AiMessageStatus r6 = com.whoop.bot.models.conversation.AiMessageStatus.ACTIVE
                if (r8 != r6) goto L88
                cl0.b r8 = r7.f19751E
                cl0.a r8 = cl0.C4796b.m15155d(r8)
                java.lang.String r2 = r2.getId()
                r7.f19754y = r0
                r6 = 0
                r7.f19752w = r6
                r7.f19753x = r5
                java.lang.Object r8 = r8.m15153c(r2, r7)
                if (r8 != r1) goto L69
                goto L87
            L69:
                com.whoop.bot.models.conversation.AiChatMessage r8 = (com.whoop.bot.models.conversation.AiChatMessage) r8
                r7.f19754y = r0
                r7.f19752w = r8
                r7.f19753x = r4
                java.lang.Object r2 = r0.emit(r8, r7)
                if (r2 != r1) goto L78
                goto L87
            L78:
                r2 = r8
            L79:
                cl0.b r8 = r7.f19751E
                r7.f19754y = r0
                r7.f19752w = r2
                r7.f19753x = r3
                java.lang.Object r8 = cl0.C4796b.m15154c(r8, r2, r7)
                if (r8 != r1) goto L49
            L87:
                return r1
            L88:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cl0.C4796b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4796b(C4795a activeResponseApiInteractor, AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(activeResponseApiInteractor, "activeResponseApiInteractor");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.activeResponseApiInteractor = activeResponseApiInteractor;
        this.configurationRepository = configurationRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final Object m15157f(AiChatMessage aiChatMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        AiMessageStatus messageStatus = aiChatMessage.getMessageStatus();
        AiMessageStatus aiMessageStatus = AiMessageStatus.ACTIVE;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (messageStatus != aiMessageStatus) {
            return c23454a0;
        }
        AbstractC21909c abstractC21909c = this.configurationRepository;
        AiPollingDelay aiPollingDelay = AiPollingDelay.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = aiPollingDelay.getName();
        Object defaultValue = aiPollingDelay.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        Object objM8782b = AbstractC3034m0.m8782b(((Long) defaultValue).longValue(), interfaceC30057d);
        return objM8782b == EnumC31071a.f128113w ? objM8782b : c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m15158g(AiChatMessage message) {
        return new C13084s1(new c(message, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(AbstractC13091v.m36590P(upstream, new b(null, this)));
    }
}
