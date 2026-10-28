package g12;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import f12.AbstractC14009a;
import f12.AbstractC14010b;
import f12.C14011c;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: g12.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006#"}, m65681d2 = {"Lg12/e;", "Lg12/d;", "Lf12/c;", "interactor", "Lg12/a;", "urlOpenerListener", "Lbc3/c0;", "coroutineScope", "<init>", "(Lf12/c;Lg12/a;Lbc3/c0;)V", "", QueryParams.URL, "provider", "codeVerifier", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lf12/c;", "b", "Lg12/a;", "c", "Lbc3/c0;", "Lec3/o1;", "Lg12/c;", "d", "Lec3/o1;", "eventFlow", "e", "Ljava/lang/String;", "cacheValue", "Lec3/t1;", "f", "Lec3/t1;", "()Lec3/t1;", "result", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15227e implements InterfaceC15226d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14011c interactor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15223a urlOpenerListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String cacheValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13087t1 result;

    /* JADX INFO: renamed from: g12.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f57181w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15227e f57182x;

        /* JADX INFO: renamed from: g12.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41617a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f57183w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15227e f57184x;

            /* JADX INFO: renamed from: g12.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.performer.RealOAuthFlowPerformer$performFlow$$inlined$filter$1$2", m100430f = "OAuthIntegrationFlowPerformer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41618a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f57186F;

                /* JADX INFO: renamed from: G */
                Object f57187G;

                /* JADX INFO: renamed from: H */
                int f57188H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f57189w;

                /* JADX INFO: renamed from: x */
                int f57190x;

                /* JADX INFO: renamed from: y */
                Object f57191y;

                /* JADX INFO: renamed from: z */
                Object f57192z;

                public C41618a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f57189w = obj;
                    this.f57190x |= Integer.MIN_VALUE;
                    return C41617a.this.emit(null, this);
                }
            }

            public C41617a(InterfaceC13062m interfaceC13062m, C15227e c15227e) {
                this.f57183w = interfaceC13062m;
                this.f57184x = c15227e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41618a c41618a;
                if (interfaceC30057d instanceof C41618a) {
                    c41618a = (C41618a) interfaceC30057d;
                    int i13 = c41618a.f57190x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41618a.f57190x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41618a = new C41618a(interfaceC30057d);
                    }
                } else {
                    c41618a = new C41618a(interfaceC30057d);
                }
                Object obj2 = c41618a.f57189w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41618a.f57190x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f57183w;
                    if (!AbstractC22676k.m65745e((String) obj, this.f57184x.cacheValue)) {
                        c41618a.f57191y = null;
                        c41618a.f57192z = null;
                        c41618a.f57186F = null;
                        c41618a.f57187G = null;
                        c41618a.f57188H = 0;
                        c41618a.f57190x = 1;
                        if (interfaceC13062m.emit(obj, c41618a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C15227e c15227e) {
            this.f57181w = interfaceC13058l;
            this.f57182x = c15227e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f57181w.collect(new C41617a(interfaceC13062m, this.f57182x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g12.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f57193E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f57194w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15227e f57195x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f57196y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f57197z;

        /* JADX INFO: renamed from: g12.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f57198E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f57199w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15227e f57200x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f57201y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f57202z;

            /* JADX INFO: renamed from: g12.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.performer.RealOAuthFlowPerformer$performFlow$$inlined$map$1$2", m100430f = "OAuthIntegrationFlowPerformer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41619a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f57203E;

                /* JADX INFO: renamed from: F */
                Object f57204F;

                /* JADX INFO: renamed from: G */
                Object f57205G;

                /* JADX INFO: renamed from: H */
                int f57206H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f57207w;

                /* JADX INFO: renamed from: x */
                int f57208x;

                /* JADX INFO: renamed from: y */
                Object f57209y;

                public C41619a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f57207w = obj;
                    this.f57208x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15227e c15227e, String str, String str2, String str3) {
                this.f57199w = interfaceC13062m;
                this.f57200x = c15227e;
                this.f57201y = str;
                this.f57202z = str2;
                this.f57198E = str3;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41619a c41619a;
                if (interfaceC30057d instanceof C41619a) {
                    c41619a = (C41619a) interfaceC30057d;
                    int i13 = c41619a.f57208x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41619a.f57208x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41619a = new C41619a(interfaceC30057d);
                    }
                } else {
                    c41619a = new C41619a(interfaceC30057d);
                }
                Object obj2 = c41619a.f57207w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41619a.f57208x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f57199w;
                    String str = (String) obj;
                    this.f57200x.cacheValue = str;
                    AbstractC14009a.a aVar = new AbstractC14009a.a(this.f57201y, str, this.f57202z, this.f57198E);
                    c41619a.f57209y = null;
                    c41619a.f57203E = null;
                    c41619a.f57204F = null;
                    c41619a.f57205G = null;
                    c41619a.f57206H = 0;
                    c41619a.f57208x = 1;
                    if (interfaceC13062m.emit(aVar, c41619a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C15227e c15227e, String str, String str2, String str3) {
            this.f57194w = interfaceC13058l;
            this.f57195x = c15227e;
            this.f57196y = str;
            this.f57197z = str2;
            this.f57193E = str3;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f57194w.collect(new a(interfaceC13062m, this.f57195x, this.f57196y, this.f57197z, this.f57193E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g12.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.performer.RealOAuthFlowPerformer", m100430f = "OAuthIntegrationFlowPerformer.kt", m100431l = {34, 49}, m100432m = "performFlow", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f57211E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f57212F;

        /* JADX INFO: renamed from: H */
        int f57214H;

        /* JADX INFO: renamed from: w */
        Object f57215w;

        /* JADX INFO: renamed from: x */
        Object f57216x;

        /* JADX INFO: renamed from: y */
        Object f57217y;

        /* JADX INFO: renamed from: z */
        Object f57218z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f57212F = obj;
            this.f57214H |= Integer.MIN_VALUE;
            return C15227e.this.mo43291a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: g12.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements InterfaceC13062m {
        public d() {
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC14010b abstractC14010b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objEmit;
            boolean z4 = abstractC14010b instanceof AbstractC14010b.b;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!z4) {
                return ((abstractC14010b instanceof AbstractC14010b.a) && (objEmit = C15227e.this.eventFlow.emit(AbstractC15225c.b.f57172a, interfaceC30057d)) == EnumC31071a.f128113w) ? objEmit : c23454a0;
            }
            Object objEmit2 = C15227e.this.eventFlow.emit(AbstractC15225c.c.f57173a, interfaceC30057d);
            return objEmit2 == EnumC31071a.f128113w ? objEmit2 : c23454a0;
        }
    }

    /* JADX INFO: renamed from: g12.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.performer.RealOAuthFlowPerformer$performFlow$flow$2", m100430f = "OAuthIntegrationFlowPerformer.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f57220w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15227e.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f57220w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15227e.this.eventFlow;
                AbstractC15225c.a aVar = AbstractC15225c.a.f57171a;
                this.f57220w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C15227e(C14011c interactor, C15223a urlOpenerListener, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(urlOpenerListener, "urlOpenerListener");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.urlOpenerListener = urlOpenerListener;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.result = AbstractC13091v.m36586L(c13096w1M36592b, coroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        if (r11.collect(r12, r0) == r1) goto L23;
     */
    @Override // g12.InterfaceC15226d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo43291a(java.lang.String r11, java.lang.String r12, java.lang.String r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g12.C15227e.mo43291a(java.lang.String, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13087t1 getResult() {
        return this.result;
    }

    public /* synthetic */ C15227e(C14011c c14011c, C15223a c15223a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14011c, c15223a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
