package gg0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dg0.AbstractC12004b;
import dg0.C12005c;
import dg0.C12006d;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hg0.C17254a;
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

/* JADX INFO: renamed from: gg0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lgg0/b;", "Landroidx/lifecycle/w1;", "Ldg0/d;", "interactor", "Lhg0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldg0/d;Lhg0/a;Lbc3/c0;)V", "Lec3/l;", "Ldg0/b;", "Ldg0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lgg0/a$m;", "p", "(Lgg0/a$m;)Ldg0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lgg0/a$m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ldg0/d;", "x", "Lhg0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lgg0/c;", "F", "getViewState", "()Lec3/l;", "viewState", "Lgg0/a$h;", "G", "n", "navigationEvents", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15823b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12006d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17254a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: gg0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.presentation.UpdateTestsViewModel$sendViewEvent$1", m100430f = "UpdateTestsViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f59742w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15822a.m f59744y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15822a.m mVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f59744y = mVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15823b.this.new a(this.f59744y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59742w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15823b.this.eventFlow;
                InterfaceC15822a.m mVar = this.f59744y;
                this.f59742w = 1;
                if (interfaceC13072o1.emit(mVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gg0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59745w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15823b f59746x;

        /* JADX INFO: renamed from: gg0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59747w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15823b f59748x;

            /* JADX INFO: renamed from: gg0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.presentation.UpdateTestsViewModel$special$$inlined$map$1$2", m100430f = "UpdateTestsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41649a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59749E;

                /* JADX INFO: renamed from: F */
                Object f59750F;

                /* JADX INFO: renamed from: G */
                Object f59751G;

                /* JADX INFO: renamed from: H */
                int f59752H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59753w;

                /* JADX INFO: renamed from: x */
                int f59754x;

                /* JADX INFO: renamed from: y */
                Object f59755y;

                public C41649a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59753w = obj;
                    this.f59754x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15823b c15823b) {
                this.f59747w = interfaceC13062m;
                this.f59748x = c15823b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41649a c41649a;
                if (interfaceC30057d instanceof C41649a) {
                    c41649a = (C41649a) interfaceC30057d;
                    int i13 = c41649a.f59754x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41649a.f59754x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41649a = new C41649a(interfaceC30057d);
                    }
                } else {
                    c41649a = new C41649a(interfaceC30057d);
                }
                Object obj2 = c41649a.f59753w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41649a.f59754x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59747w;
                    AbstractC12004b abstractC12004bM44638p = this.f59748x.m44638p((InterfaceC15822a.m) obj);
                    c41649a.f59755y = null;
                    c41649a.f59749E = null;
                    c41649a.f59750F = null;
                    c41649a.f59751G = null;
                    c41649a.f59752H = 0;
                    c41649a.f59754x = 1;
                    if (interfaceC13062m.emit(abstractC12004bM44638p, c41649a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C15823b c15823b) {
            this.f59745w = interfaceC13058l;
            this.f59746x = c15823b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59745w.collect(new a(interfaceC13062m, this.f59746x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gg0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59757w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15823b f59758x;

        /* JADX INFO: renamed from: gg0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59759w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15823b f59760x;

            /* JADX INFO: renamed from: gg0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.presentation.UpdateTestsViewModel$special$$inlined$map$2$2", m100430f = "UpdateTestsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41650a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59761E;

                /* JADX INFO: renamed from: F */
                Object f59762F;

                /* JADX INFO: renamed from: G */
                Object f59763G;

                /* JADX INFO: renamed from: H */
                int f59764H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59765w;

                /* JADX INFO: renamed from: x */
                int f59766x;

                /* JADX INFO: renamed from: y */
                Object f59767y;

                public C41650a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59765w = obj;
                    this.f59766x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15823b c15823b) {
                this.f59759w = interfaceC13062m;
                this.f59760x = c15823b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41650a c41650a;
                if (interfaceC30057d instanceof C41650a) {
                    c41650a = (C41650a) interfaceC30057d;
                    int i13 = c41650a.f59766x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41650a.f59766x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41650a = new C41650a(interfaceC30057d);
                    }
                } else {
                    c41650a = new C41650a(interfaceC30057d);
                }
                Object obj2 = c41650a.f59765w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41650a.f59766x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59759w;
                    C15824c c15824cM48829c = this.f59760x.reducer.m48829c((C12005c) obj);
                    c41650a.f59767y = null;
                    c41650a.f59761E = null;
                    c41650a.f59762F = null;
                    c41650a.f59763G = null;
                    c41650a.f59764H = 0;
                    c41650a.f59766x = 1;
                    if (interfaceC13062m.emit(c15824cM48829c, c41650a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C15823b c15823b) {
            this.f59757w = interfaceC13058l;
            this.f59758x = c15823b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59757w.collect(new a(interfaceC13062m, this.f59758x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gg0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59769w;

        /* JADX INFO: renamed from: gg0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59770w;

            /* JADX INFO: renamed from: gg0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.presentation.UpdateTestsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "UpdateTestsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41651a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59771E;

                /* JADX INFO: renamed from: F */
                Object f59772F;

                /* JADX INFO: renamed from: G */
                Object f59773G;

                /* JADX INFO: renamed from: H */
                Object f59774H;

                /* JADX INFO: renamed from: I */
                int f59775I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59776w;

                /* JADX INFO: renamed from: x */
                int f59777x;

                /* JADX INFO: renamed from: y */
                Object f59778y;

                public C41651a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59776w = obj;
                    this.f59777x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f59770w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41651a c41651a;
                if (interfaceC30057d instanceof C41651a) {
                    c41651a = (C41651a) interfaceC30057d;
                    int i13 = c41651a.f59777x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41651a.f59777x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41651a = new C41651a(interfaceC30057d);
                    }
                } else {
                    c41651a = new C41651a(interfaceC30057d);
                }
                Object obj2 = c41651a.f59776w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41651a.f59777x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59770w;
                    InterfaceC15822a updateTestsEvent = ((C12005c) obj).getUpdateTestsEvent();
                    InterfaceC15822a.h hVar = updateTestsEvent instanceof InterfaceC15822a.h ? (InterfaceC15822a.h) updateTestsEvent : null;
                    if (hVar != null) {
                        c41651a.f59778y = null;
                        c41651a.f59771E = null;
                        c41651a.f59772F = null;
                        c41651a.f59773G = null;
                        c41651a.f59774H = null;
                        c41651a.f59775I = 0;
                        c41651a.f59777x = 1;
                        if (interfaceC13062m.emit(hVar, c41651a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f59769w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59769w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15823b(C12006d interactor, C17254a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC12004b m44638p(InterfaceC15822a.m mVar) {
        if (mVar instanceof InterfaceC15822a.i) {
            InterfaceC15822a.i iVar = (InterfaceC15822a.i) mVar;
            return new AbstractC12004b.c(iVar.getSource(), iVar.getTestCount());
        }
        if (mVar instanceof InterfaceC15822a.j) {
            return new AbstractC12004b.d(((InterfaceC15822a.j) mVar).getSelectedSegmentId());
        }
        if (mVar instanceof InterfaceC15822a.d) {
            InterfaceC15822a.d dVar = (InterfaceC15822a.d) mVar;
            return new AbstractC12004b.a(dVar.getCardButtonState(), dVar.getSelectedSegmentId(), dVar.getIsFromDialog());
        }
        if (mVar instanceof InterfaceC15822a.e) {
            return AbstractC12004b.b.f39600a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m44640o(InterfaceC15822a.m event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C15823b(C12006d c12006d, C17254a c17254a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12006d, c17254a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
