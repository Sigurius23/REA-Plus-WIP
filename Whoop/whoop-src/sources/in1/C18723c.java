package in1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.homecustomization.domain.models.CustomizeOverviewDomainBody;
import dn1.C12218b;
import dn1.InterfaceC12217a;
import dn1.InterfaceC12219c;
import e41.C12704i;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
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

/* JADX INFO: renamed from: in1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020#0\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lin1/c;", "Landroidx/lifecycle/w1;", "Ldn1/b;", "interactor", "Lin1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldn1/b;Lin1/a;Lbc3/c0;)V", "Lin1/b;", NotificationCompat.CATEGORY_EVENT, "Ldn1/a;", "o", "(Lin1/b;)Ldn1/a;", "Lin1/d$c;", "viewState", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "l", "(Lin1/d$c;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "viewEvent", "Ll83/a0;", "n", "(Lin1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/l;", "Ldn1/c;", "y", "Lec3/l;", "domainState", "Lin1/d;", "z", "getViewState", "()Lec3/l;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18723c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: in1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.CustomizeOverviewViewModel$sendViewEvent$1", m100430f = "CustomizeOverviewViewModel.kt", m100431l = {70, 72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73554w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC18722b f73555x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C18723c f73556y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC18722b interfaceC18722b, C18723c c18723c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73555x = interfaceC18722b;
            this.f73556y = c18723c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f73555x, this.f73556y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f73554w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L47
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L36
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                in1.b r5 = r4.f73555x
                boolean r5 = r5 instanceof in1.InterfaceC18722b.f
                if (r5 == 0) goto L36
                in1.c r5 = r4.f73556y
                ec3.o1 r5 = in1.C18723c.m54449g(r5)
                in1.b$g r1 = in1.InterfaceC18722b.g.f73547a
                r4.f73554w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L36
                goto L46
            L36:
                in1.c r5 = r4.f73556y
                ec3.o1 r5 = in1.C18723c.m54449g(r5)
                in1.b r1 = r4.f73555x
                r4.f73554w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: in1.C18723c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: in1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73557w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18723c f73558x;

        /* JADX INFO: renamed from: in1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73559w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18723c f73560x;

            /* JADX INFO: renamed from: in1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.CustomizeOverviewViewModel$special$$inlined$map$1$2", m100430f = "CustomizeOverviewViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41764a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73561E;

                /* JADX INFO: renamed from: F */
                Object f73562F;

                /* JADX INFO: renamed from: G */
                Object f73563G;

                /* JADX INFO: renamed from: H */
                int f73564H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73565w;

                /* JADX INFO: renamed from: x */
                int f73566x;

                /* JADX INFO: renamed from: y */
                Object f73567y;

                public C41764a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73565w = obj;
                    this.f73566x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18723c c18723c) {
                this.f73559w = interfaceC13062m;
                this.f73560x = c18723c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41764a c41764a;
                if (interfaceC30057d instanceof C41764a) {
                    c41764a = (C41764a) interfaceC30057d;
                    int i13 = c41764a.f73566x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41764a.f73566x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41764a = new C41764a(interfaceC30057d);
                    }
                } else {
                    c41764a = new C41764a(interfaceC30057d);
                }
                Object obj2 = c41764a.f73565w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41764a.f73566x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73559w;
                    InterfaceC12217a interfaceC12217aM54452o = this.f73560x.m54452o((InterfaceC18722b) obj);
                    c41764a.f73567y = null;
                    c41764a.f73561E = null;
                    c41764a.f73562F = null;
                    c41764a.f73563G = null;
                    c41764a.f73564H = 0;
                    c41764a.f73566x = 1;
                    if (interfaceC13062m.emit(interfaceC12217aM54452o, c41764a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C18723c c18723c) {
            this.f73557w = interfaceC13058l;
            this.f73558x = c18723c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73557w.collect(new a(interfaceC13062m, this.f73558x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: in1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18721a f73570x;

        /* JADX INFO: renamed from: in1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73571w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18721a f73572x;

            /* JADX INFO: renamed from: in1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.CustomizeOverviewViewModel$special$$inlined$map$2$2", m100430f = "CustomizeOverviewViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41765a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73573E;

                /* JADX INFO: renamed from: F */
                Object f73574F;

                /* JADX INFO: renamed from: G */
                Object f73575G;

                /* JADX INFO: renamed from: H */
                int f73576H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73577w;

                /* JADX INFO: renamed from: x */
                int f73578x;

                /* JADX INFO: renamed from: y */
                Object f73579y;

                public C41765a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73577w = obj;
                    this.f73578x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18721a c18721a) {
                this.f73571w = interfaceC13062m;
                this.f73572x = c18721a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41765a c41765a;
                if (interfaceC30057d instanceof C41765a) {
                    c41765a = (C41765a) interfaceC30057d;
                    int i13 = c41765a.f73578x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41765a.f73578x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41765a = new C41765a(interfaceC30057d);
                    }
                } else {
                    c41765a = new C41765a(interfaceC30057d);
                }
                Object obj2 = c41765a.f73577w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41765a.f73578x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73571w;
                    InterfaceC18724d interfaceC18724dM54442b = this.f73572x.m54442b((InterfaceC12219c) obj);
                    c41765a.f73579y = null;
                    c41765a.f73573E = null;
                    c41765a.f73574F = null;
                    c41765a.f73575G = null;
                    c41765a.f73576H = 0;
                    c41765a.f73578x = 1;
                    if (interfaceC13062m.emit(interfaceC18724dM54442b, c41765a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C18721a c18721a) {
            this.f73569w = interfaceC13058l;
            this.f73570x = c18721a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73569w.collect(new a(interfaceC13062m, this.f73570x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18723c(C12218b interactor, C18721a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM83945a, reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    private final CustomizeOverviewDomainBody m54451l(InterfaceC18724d.c viewState) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = viewState.getPinnedSection().m54463b().iterator();
        while (it.hasNext()) {
            arrayList.add(((C12704i) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        viewState.m54457c();
        viewState.m54457c();
        return new CustomizeOverviewDomainBody(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC12217a m54452o(InterfaceC18722b event) {
        if (event instanceof InterfaceC18722b.c) {
            return InterfaceC12217a.c.f40871a;
        }
        if (event instanceof InterfaceC18722b.i) {
            return InterfaceC12217a.j.f40878a;
        }
        if (event instanceof InterfaceC18722b.e) {
            InterfaceC18722b.e eVar = (InterfaceC18722b.e) event;
            return new InterfaceC12217a.e(eVar.getFromIndex(), eVar.getToIndex());
        }
        if (event instanceof InterfaceC18722b.a) {
            return new InterfaceC12217a.a(((InterfaceC18722b.a) event).getIndex());
        }
        if (event instanceof InterfaceC18722b.d) {
            return new InterfaceC12217a.d(((InterfaceC18722b.d) event).getIndex());
        }
        if (event instanceof InterfaceC18722b.h) {
            return new InterfaceC12217a.h(((InterfaceC18722b.h) event).getNewSelectedMetric());
        }
        if (event instanceof InterfaceC18722b.g) {
            return InterfaceC12217a.g.f40876a;
        }
        if (event instanceof InterfaceC18722b.f) {
            return new InterfaceC12217a.f(m54451l(((InterfaceC18722b.f) event).getViewState()));
        }
        if (event instanceof InterfaceC18722b.b) {
            return InterfaceC12217a.b.f40870a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m54453n(InterfaceC18722b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, this, null), 3);
    }

    public /* synthetic */ C18723c(C12218b c12218b, C18721a c18721a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12218b, c18721a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
