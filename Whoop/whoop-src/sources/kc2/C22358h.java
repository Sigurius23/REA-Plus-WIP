package kc2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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

/* JADX INFO: renamed from: kc2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lkc2/h;", "Landroidx/lifecycle/w1;", "Lkc2/g;", "interactor", "Lkc2/j;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lkc2/g;Lkc2/j;Lbc3/c0;)V", "Lec3/l;", "Lkc2/c$a;", "Lkc2/d;", "interact", "(Lec3/l;)Lec3/l;", "Lkc2/e;", "o", "(Lkc2/e;)Lkc2/c$a;", "action", "Ll83/a0;", "p", "(Lkc2/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkc2/g;", "x", "Lkc2/j;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lkc2/i;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22358h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C22357g interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C22360j viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: kc2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendViewModel$sendEvent$1", m100430f = "SettingsReferAFriendViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87258w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22355e f87260y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC22355e abstractC22355e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87260y = abstractC22355e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22358h.this.new a(this.f87260y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87258w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C22358h.this.eventFlow;
                AbstractC22355e abstractC22355e = this.f87260y;
                this.f87258w = 1;
                if (interfaceC13072o1.emit(abstractC22355e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kc2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87261w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22358h f87262x;

        /* JADX INFO: renamed from: kc2.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87263w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22358h f87264x;

            /* JADX INFO: renamed from: kc2.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendViewModel$special$$inlined$map$1$2", m100430f = "SettingsReferAFriendViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41883a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87265E;

                /* JADX INFO: renamed from: F */
                Object f87266F;

                /* JADX INFO: renamed from: G */
                Object f87267G;

                /* JADX INFO: renamed from: H */
                int f87268H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87269w;

                /* JADX INFO: renamed from: x */
                int f87270x;

                /* JADX INFO: renamed from: y */
                Object f87271y;

                public C41883a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87269w = obj;
                    this.f87270x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22358h c22358h) {
                this.f87263w = interfaceC13062m;
                this.f87264x = c22358h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41883a c41883a;
                if (interfaceC30057d instanceof C41883a) {
                    c41883a = (C41883a) interfaceC30057d;
                    int i13 = c41883a.f87270x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41883a.f87270x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41883a = new C41883a(interfaceC30057d);
                    }
                } else {
                    c41883a = new C41883a(interfaceC30057d);
                }
                Object obj2 = c41883a.f87269w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41883a.f87270x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87263w;
                    AbstractC22353c.a aVarM64268o = this.f87264x.m64268o((AbstractC22355e) obj);
                    c41883a.f87271y = null;
                    c41883a.f87265E = null;
                    c41883a.f87266F = null;
                    c41883a.f87267G = null;
                    c41883a.f87268H = 0;
                    c41883a.f87270x = 1;
                    if (interfaceC13062m.emit(aVarM64268o, c41883a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C22358h c22358h) {
            this.f87261w = interfaceC13058l;
            this.f87262x = c22358h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87261w.collect(new a(interfaceC13062m, this.f87262x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kc2.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87273w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22358h f87274x;

        /* JADX INFO: renamed from: kc2.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87275w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22358h f87276x;

            /* JADX INFO: renamed from: kc2.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendViewModel$special$$inlined$map$2$2", m100430f = "SettingsReferAFriendViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41884a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87277E;

                /* JADX INFO: renamed from: F */
                Object f87278F;

                /* JADX INFO: renamed from: G */
                Object f87279G;

                /* JADX INFO: renamed from: H */
                int f87280H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87281w;

                /* JADX INFO: renamed from: x */
                int f87282x;

                /* JADX INFO: renamed from: y */
                Object f87283y;

                public C41884a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87281w = obj;
                    this.f87282x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22358h c22358h) {
                this.f87275w = interfaceC13062m;
                this.f87276x = c22358h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41884a c41884a;
                if (interfaceC30057d instanceof C41884a) {
                    c41884a = (C41884a) interfaceC30057d;
                    int i13 = c41884a.f87282x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41884a.f87282x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41884a = new C41884a(interfaceC30057d);
                    }
                } else {
                    c41884a = new C41884a(interfaceC30057d);
                }
                Object obj2 = c41884a.f87281w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41884a.f87282x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87275w;
                    C22359i c22359iM64275a = this.f87276x.viewStateReducer.m64275a((AbstractC22354d) obj);
                    c41884a.f87283y = null;
                    c41884a.f87277E = null;
                    c41884a.f87278F = null;
                    c41884a.f87279G = null;
                    c41884a.f87280H = 0;
                    c41884a.f87282x = 1;
                    if (interfaceC13062m.emit(c22359iM64275a, c41884a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C22358h c22358h) {
            this.f87273w = interfaceC13058l;
            this.f87274x = c22358h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87273w.collect(new a(interfaceC13062m, this.f87274x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22358h(C22357g interactor, C22360j viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), scope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC22353c.a m64268o(AbstractC22355e abstractC22355e) {
        if (abstractC22355e instanceof AbstractC22355e.a) {
            return new AbstractC22353c.a(((AbstractC22355e.a) abstractC22355e).getSource());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final void m64270p(AbstractC22355e action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(action, null), 3);
    }

    public /* synthetic */ C22358h(C22357g c22357g, C22360j c22360j, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22357g, c22360j, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
