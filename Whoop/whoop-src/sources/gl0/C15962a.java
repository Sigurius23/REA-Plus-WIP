package gl0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.educationhub.EducationHubGetRequest;
import com.whoop.bot.models.educationhub.EducationHubResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: gl0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lgl0/a;", "Lod1/g;", "Lgl0/b;", "Lgl0/d;", "Lnm0/e;", "cachedApiSource", "Lu92/d;", "prefs", "Lq83/j;", "ioContext", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lu92/d;Lq83/j;Ltr2/n;)V", "Lec3/l;", "Lpm0/a;", "Lcom/whoop/bot/models/educationhub/EducationHubResponse;", "f", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lu92/d;", "c", "Lq83/j;", "d", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15962a implements InterfaceC27844g<AbstractC15963b, C15965d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d prefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gl0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$getHubRequestFlow$$inlined$cacheAPI$1", m100430f = "AiEducationHubInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f60400w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f60401x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60402y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f60403z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f60403z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f60403z);
            aVar.f60401x = interfaceC13062m;
            aVar.f60402y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60400w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f60401x;
                C26832c c26832c = (C26832c) this.f60402y;
                InterfaceC26834e interfaceC26834e = this.f60403z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(EducationHubResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(EducationHubResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f60401x = null;
                this.f60402y = null;
                this.f60400w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: gl0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiEducationHubInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f60404w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f60405x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60406y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15962a f60407z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C15962a c15962a) {
            super(3, interfaceC30057d);
            this.f60407z = c15962a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC15963b abstractC15963b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f60407z);
            bVar.f60405x = interfaceC13062m;
            bVar.f60406y = abstractC15963b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60404w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f60405x;
                AbstractC15963b abstractC15963b = (AbstractC15963b) this.f60406y;
                if (AbstractC22676k.m65745e(abstractC15963b, AbstractC15963b.a.f60428a)) {
                    c0456u = new d(this.f60407z.m45036f());
                } else {
                    if (!AbstractC22676k.m65745e(abstractC15963b, AbstractC15963b.b.f60429a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(AbstractC15964c.c.f60433a, 1);
                }
                this.f60405x = null;
                this.f60406y = null;
                this.f60404w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC15963b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: gl0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$2", m100430f = "AiEducationHubInteractor.kt", m100431l = {51, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgl0/d;", "previousResult", "Lgl0/c;", "action", "<anonymous>", "(Lgl0/d;Lgl0/c;)Lgl0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        boolean f60409w;

        /* JADX INFO: renamed from: x */
        int f60410x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60411y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f60412z;

        /* JADX INFO: renamed from: gl0.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$2$1", m100430f = "AiEducationHubInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f60413w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15962a f60414x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C15965d f60415y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C15962a c15962a, C15965d c15965d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f60414x = c15962a;
                this.f60415y = c15965d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f60414x, this.f60415y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f60413w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f60414x.prefs.m109538q("education-hub-visibility", !this.f60415y.getShow());
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: gl0.a$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$2$storedState$1", m100430f = "AiEducationHubInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f60416w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15962a f60417x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C15962a c15962a, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f60417x = c15962a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f60417x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f60416w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f60417x.prefs.m109528e("education-hub-visibility", true));
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C15965d c15965d, AbstractC15964c abstractC15964c, InterfaceC30057d<? super C15965d> interfaceC30057d) {
            c cVar = C15962a.this.new c(interfaceC30057d);
            cVar.f60411y = c15965d;
            cVar.f60412z = abstractC15964c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            if (bc3.AbstractC3006f0.m8705K(r1, r3, r8) == r2) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f60411y
                gl0.d r0 = (gl0.C15965d) r0
                java.lang.Object r1 = r8.f60412z
                gl0.c r1 = (gl0.AbstractC15964c) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r8.f60410x
                r4 = 2
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L25
                if (r3 == r5) goto L21
                if (r3 != r4) goto L19
                p505ts.AbstractC34132o.m107864I(r9)
                goto L81
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L42
            L25:
                p505ts.AbstractC34132o.m107864I(r9)
                gl0.a r9 = gl0.C15962a.this
                q83.j r9 = gl0.C15962a.m45034d(r9)
                gl0.a$c$b r3 = new gl0.a$c$b
                gl0.a r7 = gl0.C15962a.this
                r3.<init>(r7, r6)
                r8.f60411y = r0
                r8.f60412z = r1
                r8.f60410x = r5
                java.lang.Object r9 = bc3.AbstractC3006f0.m8705K(r9, r3, r8)
                if (r9 != r2) goto L42
                goto L80
            L42:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                boolean r3 = r1 instanceof gl0.AbstractC15964c.a
                if (r3 == 0) goto L58
                gl0.d r0 = new gl0.d
                gl0.c$a r1 = (gl0.AbstractC15964c.a) r1
                com.whoop.design.models.items.ArticleTileCarouselModel r1 = r1.getCarousel()
                r0.<init>(r1, r9)
                return r0
            L58:
                gl0.c$b r3 = gl0.AbstractC15964c.b.f60432a
                boolean r3 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r3)
                if (r3 == 0) goto L61
                return r0
            L61:
                boolean r1 = r1 instanceof gl0.AbstractC15964c.c
                if (r1 == 0) goto L8b
                gl0.a r1 = gl0.C15962a.this
                q83.j r1 = gl0.C15962a.m45034d(r1)
                gl0.a$c$a r3 = new gl0.a$c$a
                gl0.a r7 = gl0.C15962a.this
                r3.<init>(r7, r0, r6)
                r8.f60411y = r0
                r8.f60412z = r6
                r8.f60409w = r9
                r8.f60410x = r4
                java.lang.Object r9 = bc3.AbstractC3006f0.m8705K(r1, r3, r8)
                if (r9 != r2) goto L81
            L80:
                return r2
            L81:
                boolean r9 = r0.getShow()
                r9 = r9 ^ r5
                gl0.d r9 = gl0.C15965d.m45039b(r0, r6, r9, r5, r6)
                return r9
            L8b:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gl0.C15962a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gl0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60418w;

        /* JADX INFO: renamed from: gl0.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60419w;

            /* JADX INFO: renamed from: gl0.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "AiEducationHubInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41657a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f60420E;

                /* JADX INFO: renamed from: F */
                Object f60421F;

                /* JADX INFO: renamed from: G */
                Object f60422G;

                /* JADX INFO: renamed from: H */
                int f60423H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60424w;

                /* JADX INFO: renamed from: x */
                int f60425x;

                /* JADX INFO: renamed from: y */
                Object f60426y;

                public C41657a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60424w = obj;
                    this.f60425x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60419w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41657a c41657a;
                if (interfaceC30057d instanceof C41657a) {
                    c41657a = (C41657a) interfaceC30057d;
                    int i13 = c41657a.f60425x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41657a.f60425x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41657a = new C41657a(interfaceC30057d);
                    }
                } else {
                    c41657a = new C41657a(interfaceC30057d);
                }
                Object obj2 = c41657a.f60424w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41657a.f60425x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60419w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    Object aVar = interfaceC29354a instanceof InterfaceC29354a.a ? new AbstractC15964c.a(((EducationHubResponse) ((InterfaceC29354a.a) interfaceC29354a).getData()).getTileCarousel()) : AbstractC15964c.b.f60432a;
                    c41657a.f60426y = null;
                    c41657a.f60420E = null;
                    c41657a.f60421F = null;
                    c41657a.f60422G = null;
                    c41657a.f60423H = 0;
                    c41657a.f60425x = 1;
                    if (interfaceC13062m.emit(aVar, c41657a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f60418w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60418w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C15962a(InterfaceC26834e cachedApiSource, C34660d prefs, InterfaceC30063j ioContext, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(prefs, "prefs");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.prefs = prefs;
        this.ioContext = ioContext;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m45036f() {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(EducationHubGetRequest.INSTANCE, 1), null, null, 3, null), new a(null, this.cachedApiSource));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C15965d(null, false, 3, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new c(null));
    }
}
