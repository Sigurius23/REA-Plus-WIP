package hs2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import es2.AbstractC13592b;
import es2.C13593c;
import es2.C13594d;
import fs2.EnumC14748a;
import fs2.InterfaceC14758k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import is2.C20924a;
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

/* JADX INFO: renamed from: hs2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\f8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0\f8\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010,¨\u00062"}, m65681d2 = {"Lhs2/d;", "Landroidx/lifecycle/w1;", "Les2/d;", "interactor", "Lis2/a;", "reducer", "Lfs2/k;", "videoCallManager", "Lbc3/c0;", "coroutineScope", "<init>", "(Les2/d;Lis2/a;Lfs2/k;Lbc3/c0;)V", "Lec3/l;", "Les2/b;", "Les2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lhs2/a$j;", "p", "(Lhs2/a$j;)Les2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lhs2/a$j;)V", "onCleared", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Les2/d;", "x", "Lis2/a;", "y", "Lfs2/k;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "Lec3/l;", "domainState", "Lhs2/e;", "G", "getViewState", "()Lec3/l;", "viewState", "Lhs2/a$g;", "H", "n", "navigationEvents", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17610d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C13594d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C20924a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC14758k videoCallManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: hs2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.presentation.VideoCallViewModel$sendViewEvent$1", m100430f = "VideoCallViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f68243w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC17607a.j f68245y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC17607a.j jVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f68245y = jVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17610d.this.new a(this.f68245y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f68243w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17610d.this.eventFlow;
                InterfaceC17607a.j jVar = this.f68245y;
                this.f68243w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hs2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68246w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17610d f68247x;

        /* JADX INFO: renamed from: hs2.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68248w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17610d f68249x;

            /* JADX INFO: renamed from: hs2.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.presentation.VideoCallViewModel$special$$inlined$map$1$2", m100430f = "VideoCallViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41709a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68250E;

                /* JADX INFO: renamed from: F */
                Object f68251F;

                /* JADX INFO: renamed from: G */
                Object f68252G;

                /* JADX INFO: renamed from: H */
                int f68253H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68254w;

                /* JADX INFO: renamed from: x */
                int f68255x;

                /* JADX INFO: renamed from: y */
                Object f68256y;

                public C41709a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68254w = obj;
                    this.f68255x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17610d c17610d) {
                this.f68248w = interfaceC13062m;
                this.f68249x = c17610d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41709a c41709a;
                if (interfaceC30057d instanceof C41709a) {
                    c41709a = (C41709a) interfaceC30057d;
                    int i13 = c41709a.f68255x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41709a.f68255x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41709a = new C41709a(interfaceC30057d);
                    }
                } else {
                    c41709a = new C41709a(interfaceC30057d);
                }
                Object obj2 = c41709a.f68254w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41709a.f68255x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68248w;
                    AbstractC13592b abstractC13592bM50150p = this.f68249x.m50150p((InterfaceC17607a.j) obj);
                    c41709a.f68256y = null;
                    c41709a.f68250E = null;
                    c41709a.f68251F = null;
                    c41709a.f68252G = null;
                    c41709a.f68253H = 0;
                    c41709a.f68255x = 1;
                    if (interfaceC13062m.emit(abstractC13592bM50150p, c41709a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C17610d c17610d) {
            this.f68246w = interfaceC13058l;
            this.f68247x = c17610d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68246w.collect(new a(interfaceC13062m, this.f68247x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hs2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68258w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17610d f68259x;

        /* JADX INFO: renamed from: hs2.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68260w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17610d f68261x;

            /* JADX INFO: renamed from: hs2.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.presentation.VideoCallViewModel$special$$inlined$map$2$2", m100430f = "VideoCallViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41710a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68262E;

                /* JADX INFO: renamed from: F */
                Object f68263F;

                /* JADX INFO: renamed from: G */
                Object f68264G;

                /* JADX INFO: renamed from: H */
                int f68265H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68266w;

                /* JADX INFO: renamed from: x */
                int f68267x;

                /* JADX INFO: renamed from: y */
                Object f68268y;

                public C41710a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68266w = obj;
                    this.f68267x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17610d c17610d) {
                this.f68260w = interfaceC13062m;
                this.f68261x = c17610d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41710a c41710a;
                if (interfaceC30057d instanceof C41710a) {
                    c41710a = (C41710a) interfaceC30057d;
                    int i13 = c41710a.f68267x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41710a.f68267x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41710a = new C41710a(interfaceC30057d);
                    }
                } else {
                    c41710a = new C41710a(interfaceC30057d);
                }
                Object obj2 = c41710a.f68266w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41710a.f68267x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68260w;
                    C17611e c17611eM58053a = this.f68261x.reducer.m58053a((C13593c) obj);
                    c41710a.f68268y = null;
                    c41710a.f68262E = null;
                    c41710a.f68263F = null;
                    c41710a.f68264G = null;
                    c41710a.f68265H = 0;
                    c41710a.f68267x = 1;
                    if (interfaceC13062m.emit(c17611eM58053a, c41710a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C17610d c17610d) {
            this.f68258w = interfaceC13058l;
            this.f68259x = c17610d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68258w.collect(new a(interfaceC13062m, this.f68259x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hs2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68270w;

        /* JADX INFO: renamed from: hs2.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68271w;

            /* JADX INFO: renamed from: hs2.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.videocall.presentation.VideoCallViewModel$special$$inlined$mapNotNull$1$2", m100430f = "VideoCallViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41711a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68272E;

                /* JADX INFO: renamed from: F */
                Object f68273F;

                /* JADX INFO: renamed from: G */
                Object f68274G;

                /* JADX INFO: renamed from: H */
                Object f68275H;

                /* JADX INFO: renamed from: I */
                int f68276I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68277w;

                /* JADX INFO: renamed from: x */
                int f68278x;

                /* JADX INFO: renamed from: y */
                Object f68279y;

                public C41711a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68277w = obj;
                    this.f68278x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f68271w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41711a c41711a;
                if (interfaceC30057d instanceof C41711a) {
                    c41711a = (C41711a) interfaceC30057d;
                    int i13 = c41711a.f68278x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41711a.f68278x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41711a = new C41711a(interfaceC30057d);
                    }
                } else {
                    c41711a = new C41711a(interfaceC30057d);
                }
                Object obj2 = c41711a.f68277w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41711a.f68278x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68271w;
                    InterfaceC17607a interfaceC17607a = ((C13593c) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC17607a.g gVar = interfaceC17607a instanceof InterfaceC17607a.g ? (InterfaceC17607a.g) interfaceC17607a : null;
                    if (gVar != null) {
                        c41711a.f68279y = null;
                        c41711a.f68272E = null;
                        c41711a.f68273F = null;
                        c41711a.f68274G = null;
                        c41711a.f68275H = null;
                        c41711a.f68276I = 0;
                        c41711a.f68278x = 1;
                        if (interfaceC13062m.emit(gVar, c41711a) == enumC31071a) {
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
            this.f68270w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68270w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17610d(C13594d interactor, C20924a reducer, InterfaceC14758k videoCallManager, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(videoCallManager, "videoCallManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.videoCallManager = videoCallManager;
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
    public final AbstractC13592b m50150p(InterfaceC17607a.j jVar) {
        if (jVar instanceof InterfaceC17607a.c) {
            return new AbstractC13592b.a(((InterfaceC17607a.c) jVar).getCallId());
        }
        if (AbstractC22676k.m65745e(jVar, InterfaceC17607a.i.f68226a)) {
            return AbstractC13592b.f.f47990a;
        }
        if (AbstractC22676k.m65745e(jVar, InterfaceC17607a.d.f68221a)) {
            return AbstractC13592b.b.f47985a;
        }
        if (AbstractC22676k.m65745e(jVar, InterfaceC17607a.f.f68224a)) {
            return AbstractC13592b.d.f47988a;
        }
        if (jVar instanceof InterfaceC17607a.e) {
            return new AbstractC13592b.c(((InterfaceC17607a.e) jVar).getNavAction());
        }
        if (jVar instanceof InterfaceC17607a.h) {
            return new AbstractC13592b.e(((InterfaceC17607a.h) jVar).getIsDisabled());
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
    public final void m50152o(InterfaceC17607a.j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        this.videoCallManager.mo42290a(EnumC14748a.SCREEN_DESTROYED);
        super.onCleared();
    }

    public /* synthetic */ C17610d(C13594d c13594d, C20924a c20924a, InterfaceC14758k interfaceC14758k, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13594d, c20924a, interfaceC14758k, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
