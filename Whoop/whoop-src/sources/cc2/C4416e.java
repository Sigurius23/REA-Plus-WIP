package cc2;

import androidx.core.app.NotificationCompat;
import bc2.C2983b;
import bc2.InterfaceC2982a;
import bc2.InterfaceC2984c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc2.C11915b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cc2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcc2/e;", "Lld1/c;", "Lcc2/a;", "Lcc2/d;", "Lbc2/b;", "interactor", "Ldc2/b;", "reducer", "Lbc3/c0;", "closeableCoroutineScope", "<init>", "(Lbc2/b;Ldc2/b;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Lbc2/a$a;", "o", "(Lcc2/d;)Lbc2/a$a;", "Ll83/a0;", "n", "(Lcc2/d;)V", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lbc2/c;", "z", "Lec3/l;", "domainResult", "E", "getViewState", "()Lec3/l;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4416e extends AbstractC23864c<C4412a, InterfaceC4415d> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 closeableCoroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainResult;

    /* JADX INFO: renamed from: cc2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.presentation.LanguageBetaOptOutViewModel$sendViewEvent$1", m100430f = "LanguageBetaOptOutViewModel.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17846w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4415d f17848y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4415d interfaceC4415d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17848y = interfaceC4415d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4416e.this.new a(this.f17848y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17846w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4416e.this.eventFlow;
                InterfaceC4415d interfaceC4415d = this.f17848y;
                this.f17846w = 1;
                if (interfaceC13072o1.emit(interfaceC4415d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cc2.e$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f17849w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4416e f17850x;

        /* JADX INFO: renamed from: cc2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17851w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4416e f17852x;

            /* JADX INFO: renamed from: cc2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.presentation.LanguageBetaOptOutViewModel$special$$inlined$map$1$2", m100430f = "LanguageBetaOptOutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41340a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f17853E;

                /* JADX INFO: renamed from: F */
                Object f17854F;

                /* JADX INFO: renamed from: G */
                Object f17855G;

                /* JADX INFO: renamed from: H */
                int f17856H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17857w;

                /* JADX INFO: renamed from: x */
                int f17858x;

                /* JADX INFO: renamed from: y */
                Object f17859y;

                public C41340a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17857w = obj;
                    this.f17858x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4416e c4416e) {
                this.f17851w = interfaceC13062m;
                this.f17852x = c4416e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41340a c41340a;
                if (interfaceC30057d instanceof C41340a) {
                    c41340a = (C41340a) interfaceC30057d;
                    int i13 = c41340a.f17858x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41340a.f17858x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41340a = new C41340a(interfaceC30057d);
                    }
                } else {
                    c41340a = new C41340a(interfaceC30057d);
                }
                Object obj2 = c41340a.f17857w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41340a.f17858x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f17851w;
                    InterfaceC2982a.a aVarM13851o = this.f17852x.m13851o((InterfaceC4415d) obj);
                    c41340a.f17859y = null;
                    c41340a.f17853E = null;
                    c41340a.f17854F = null;
                    c41340a.f17855G = null;
                    c41340a.f17856H = 0;
                    c41340a.f17858x = 1;
                    if (interfaceC13062m.emit(aVarM13851o, c41340a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4416e c4416e) {
            this.f17849w = interfaceC13058l;
            this.f17850x = c4416e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f17849w.collect(new a(interfaceC13062m, this.f17850x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cc2.e$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f17861w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11915b f17862x;

        /* JADX INFO: renamed from: cc2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17863w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11915b f17864x;

            /* JADX INFO: renamed from: cc2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.presentation.LanguageBetaOptOutViewModel$special$$inlined$map$2$2", m100430f = "LanguageBetaOptOutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41341a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f17865E;

                /* JADX INFO: renamed from: F */
                Object f17866F;

                /* JADX INFO: renamed from: G */
                Object f17867G;

                /* JADX INFO: renamed from: H */
                int f17868H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17869w;

                /* JADX INFO: renamed from: x */
                int f17870x;

                /* JADX INFO: renamed from: y */
                Object f17871y;

                public C41341a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17869w = obj;
                    this.f17870x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11915b c11915b) {
                this.f17863w = interfaceC13062m;
                this.f17864x = c11915b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41341a c41341a;
                if (interfaceC30057d instanceof C41341a) {
                    c41341a = (C41341a) interfaceC30057d;
                    int i13 = c41341a.f17870x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41341a.f17870x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41341a = new C41341a(interfaceC30057d);
                    }
                } else {
                    c41341a = new C41341a(interfaceC30057d);
                }
                Object obj2 = c41341a.f17869w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41341a.f17870x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f17863w;
                    C4412a c4412aM32186a = this.f17864x.m32186a((InterfaceC2984c) obj);
                    c41341a.f17871y = null;
                    c41341a.f17865E = null;
                    c41341a.f17866F = null;
                    c41341a.f17867G = null;
                    c41341a.f17868H = 0;
                    c41341a.f17870x = 1;
                    if (interfaceC13062m.emit(c4412aM32186a, c41341a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C11915b c11915b) {
            this.f17861w = interfaceC13058l;
            this.f17862x = c11915b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f17861w.collect(new a(interfaceC13062m, this.f17862x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4416e(C2983b interactor, C11915b reducer, InterfaceC2994c0 closeableCoroutineScope) {
        super(closeableCoroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(closeableCoroutineScope, "closeableCoroutineScope");
        this.closeableCoroutineScope = closeableCoroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainResult = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM83945a, reducer), closeableCoroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC2982a.a m13851o(InterfaceC4415d event) {
        if (AbstractC22676k.m65745e(event, InterfaceC4415d.a.f17841a)) {
            return InterfaceC2982a.a.f11971a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC4415d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.closeableCoroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C4416e(C2983b c2983b, C11915b c11915b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2983b, c11915b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
