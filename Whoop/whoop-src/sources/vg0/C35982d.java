package vg0;

import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.models.AIConversationMetadata;
import com.whoop.p057ai.chat.models.AiChatHistoryResponse;
import com.whoop.p057ai.chat.models.AiConversationHistorySection;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.C31381b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: vg0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lvg0/d;", "Lod1/g;", "Lvg0/c;", "Lvg0/e;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "Lrg0/b;", "analyticsHelper", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;Lrg0/b;)V", "Lec3/m;", "action", "accumulator", "j", "(Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;", "Lvg0/c$a;", "g", "(Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;", "response", "", "Lvg0/f;", "i", "(Lcom/whoop/ai/chat/models/AiChatHistoryResponse;)Ljava/util/List;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "c", "Lrg0/b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35982d implements InterfaceC27844g<AbstractC35980c, C35984e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: vg0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor", m100430f = "AiChatHistoryInteractor.kt", m100431l = {89}, m100432m = "handleDelete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153293E;

        /* JADX INFO: renamed from: w */
        Object f153294w;

        /* JADX INFO: renamed from: x */
        Object f153295x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153296y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153296y = obj;
            this.f153293E |= Integer.MIN_VALUE;
            return C35982d.this.m114264g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vg0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor$handleDelete$response$1", m100430f = "AiChatHistoryInteractor.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f153298w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35980c.a f153300y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35980c.a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f153300y = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35982d.this.new b(this.f153300y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153298w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiChatApi aiChatApi = C35982d.this.api;
            String fingerprint = this.f153300y.getFingerprint();
            this.f153298w = 1;
            Object objDeleteConversation = aiChatApi.deleteConversation(fingerprint, this);
            return objDeleteConversation == enumC31071a ? enumC31071a : objDeleteConversation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vg0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor", m100430f = "AiChatHistoryInteractor.kt", m100431l = {60, 62}, m100432m = "handleFetch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153301E;

        /* JADX INFO: renamed from: w */
        Object f153302w;

        /* JADX INFO: renamed from: x */
        Object f153303x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153304y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153304y = obj;
            this.f153301E |= Integer.MIN_VALUE;
            return C35982d.this.m114265h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vg0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor$handleFetch$response$1", m100430f = "AiChatHistoryInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f153306w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35982d.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153306w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiChatApi aiChatApi = C35982d.this.api;
            this.f153306w = 1;
            Object conversations = aiChatApi.getConversations(this);
            return conversations == enumC31071a ? enumC31071a : conversations;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<AiChatHistoryResponse>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vg0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor$interact$1", m100430f = "AiChatHistoryInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35982d f153308E;

        /* JADX INFO: renamed from: w */
        Object f153309w;

        /* JADX INFO: renamed from: x */
        int f153310x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f153311y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f153312z;

        /* JADX INFO: renamed from: vg0.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f153313w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35982d f153314x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f153315y;

            /* JADX INFO: renamed from: vg0.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatHistoryInteractor$interact$1$1", m100430f = "AiChatHistoryInteractor.kt", m100431l = {44, 45}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42536a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f153316E;

                /* JADX INFO: renamed from: w */
                Object f153317w;

                /* JADX INFO: renamed from: x */
                Object f153318x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f153319y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f153320z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42536a(a<? super T> aVar, InterfaceC30057d<? super C42536a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f153320z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153319y = obj;
                    this.f153316E |= Integer.MIN_VALUE;
                    return this.f153320z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C35982d c35982d, InterfaceC13062m interfaceC13062m) {
                this.f153313w = c22669g0;
                this.f153314x = c35982d;
                this.f153315y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
            
                if (r10.emit(r11, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(vg0.AbstractC35980c r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof vg0.C35982d.e.a.C42536a
                    if (r0 == 0) goto L13
                    r0 = r11
                    vg0.d$e$a$a r0 = (vg0.C35982d.e.a.C42536a) r0
                    int r1 = r0.f153316E
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f153316E = r1
                    goto L18
                L13:
                    vg0.d$e$a$a r0 = new vg0.d$e$a$a
                    r0.<init>(r9, r11)
                L18:
                    java.lang.Object r11 = r0.f153319y
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f153316E
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L43
                    if (r2 == r4) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r10 = r0.f153317w
                    vg0.c r10 = (vg0.AbstractC35980c) r10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L75
                L2f:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L37:
                    java.lang.Object r10 = r0.f153318x
                    kotlin.jvm.internal.g0 r10 = (p715kotlin.jvm.internal.C22669g0) r10
                    java.lang.Object r2 = r0.f153317w
                    vg0.c r2 = (vg0.AbstractC35980c) r2
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L60
                L43:
                    p505ts.AbstractC34132o.m107864I(r11)
                    kotlin.jvm.internal.g0 r11 = r9.f153313w
                    vg0.d r2 = r9.f153314x
                    ec3.m r6 = r9.f153315y
                    java.lang.Object r7 = r11.f89336w
                    vg0.e r7 = (vg0.C35984e) r7
                    r0.f153317w = r5
                    r0.f153318x = r11
                    r0.f153316E = r4
                    java.lang.Object r10 = vg0.C35982d.m114263f(r2, r6, r10, r7, r0)
                    if (r10 != r1) goto L5d
                    goto L74
                L5d:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L60:
                    r10.f89336w = r11
                    ec3.m r10 = r9.f153315y
                    kotlin.jvm.internal.g0 r11 = r9.f153313w
                    java.lang.Object r11 = r11.f89336w
                    r0.f153317w = r5
                    r0.f153318x = r5
                    r0.f153316E = r3
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L75
                L74:
                    return r1
                L75:
                    l83.a0 r10 = l83.C23454a0.f92919a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: vg0.C35982d.e.a.emit(vg0.c, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, C35982d c35982d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153312z = interfaceC13058l;
            this.f153308E = c35982d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f153312z, this.f153308E, interfaceC30057d);
            eVar.f153311y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153311y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153310x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c22669g0M32004w.f89336w = new C35984e(false, false, null, null, 15, null);
                InterfaceC13058l interfaceC13058l = this.f153312z;
                a aVar = new a(c22669g0M32004w, this.f153308E, interfaceC13062m);
                this.f153311y = null;
                this.f153309w = null;
                this.f153310x = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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
    }

    public C35982d(AiChatApi api, InterfaceC34116n logger, C31381b analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m114264g(C35984e c35984e, AbstractC35980c.a aVar, InterfaceC30057d<? super C35984e> interfaceC30057d) {
        a aVar2;
        if (interfaceC30057d instanceof a) {
            aVar2 = (a) interfaceC30057d;
            int i13 = aVar2.f153293E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar2.f153293E = i13 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(interfaceC30057d);
            }
        } else {
            aVar2 = new a(interfaceC30057d);
        }
        a aVar3 = aVar2;
        Object objM108729b = aVar3.f153296y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar3.f153293E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(aVar, null);
            aVar3.f153294w = c35984e;
            aVar3.f153295x = aVar;
            aVar3.f153293E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar3, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (AbstractC35980c.a) aVar3.f153295x;
            c35984e = (C35984e) aVar3.f153294w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C35984e c35984e2 = c35984e;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsHelper.m96621b((InterfaceC34385a.b) interfaceC34385a, "delete_conversation");
            return c35984e2;
        }
        if (!((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118269a.f146788Q) {
            return c35984e2;
        }
        List<C35986f> listM114273c = c35984e2.m114273c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM114273c, 10));
        for (C35986f c35986f : listM114273c) {
            List<AIConversationMetadata> listM114280c = c35986f.m114280c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listM114280c) {
                if (!AbstractC22676k.m65745e(((AIConversationMetadata) obj).getFingerprint(), aVar.getFingerprint())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(C35986f.m114278b(c35986f, null, arrayList2, 1, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((C35986f) obj2).m114280c().isEmpty()) {
                arrayList3.add(obj2);
            }
        }
        return C35984e.m114271b(c35984e2, false, false, arrayList3, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: h */
    public final Object m114265h(InterfaceC13062m interfaceC13062m, C35984e c35984e, InterfaceC30057d<? super C35984e> interfaceC30057d) {
        c cVar;
        C35984e c35984e2;
        C35984e c35984e3;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f153301E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f153301E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f153304y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar2.f153301E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object objM114271b = C35984e.m114271b(c35984e, false, true, null, null, 13, null);
            cVar2.f153302w = null;
            cVar2.f153303x = c35984e;
            cVar2.f153301E = 1;
            if (interfaceC13062m.emit(objM114271b, cVar2) != obj2) {
                c35984e2 = c35984e;
            }
            return obj2;
        }
        if (i14 == 1) {
            C35984e c35984e4 = (C35984e) cVar2.f153303x;
            AbstractC34132o.m107864I(obj);
            c35984e2 = c35984e4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35984e3 = (C35984e) cVar2.f153303x;
            AbstractC34132o.m107864I(obj);
        }
        interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.analyticsHelper.m96621b((InterfaceC34385a.b) interfaceC34385a, "get_conversations");
            return C35984e.m114271b(c35984e3, true, false, null, null, 12, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            throw new NoWhenBranchMatchedException();
        }
        AiChatHistoryResponse aiChatHistoryResponse = (AiChatHistoryResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        return aiChatHistoryResponse != null ? c35984e3.m114272a(false, false, m114266i(aiChatHistoryResponse), aiChatHistoryResponse.getNextToken()) : C35984e.m114271b(c35984e3, true, false, null, null, 12, null);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        d dVar = new d(null);
        cVar2.f153302w = null;
        cVar2.f153303x = c35984e2;
        cVar2.f153301E = 2;
        Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
        if (objM108729b != obj2) {
            c35984e3 = c35984e2;
            obj = objM108729b;
            interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                this.analyticsHelper.m96621b((InterfaceC34385a.b) interfaceC34385a, "get_conversations");
                return C35984e.m114271b(c35984e3, true, false, null, null, 12, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                throw new NoWhenBranchMatchedException();
            }
            AiChatHistoryResponse aiChatHistoryResponse2 = (AiChatHistoryResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (aiChatHistoryResponse2 != null) {
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: i */
    private final List<C35986f> m114266i(AiChatHistoryResponse response) {
        List<AiConversationHistorySection> conversations = response.getConversations();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(conversations, 10));
        for (AiConversationHistorySection aiConversationHistorySection : conversations) {
            arrayList.add(new C35986f(aiConversationHistorySection.getTitle(), aiConversationHistorySection.getConversationMetadataList()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m114267j(InterfaceC13062m interfaceC13062m, AbstractC35980c abstractC35980c, C35984e c35984e, InterfaceC30057d<? super C35984e> interfaceC30057d) {
        if (abstractC35980c instanceof AbstractC35980c.a) {
            return m114264g(c35984e, (AbstractC35980c.a) abstractC35980c, interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC35980c, AbstractC35980c.b.f153289a)) {
            return m114265h(interfaceC13062m, c35984e, interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new e(upstream, this, null));
    }
}
