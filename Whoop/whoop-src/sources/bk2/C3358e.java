package bk2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ck2.C4792a;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import wj2.AbstractC37320a;
import wj2.C37322c;
import xj2.AbstractC38408d;
import xj2.C38409e;
import yj2.C39593a;
import yj2.C39594b;

/* JADX INFO: renamed from: bk2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0004\u0018\u0001`\u00160\u000e*\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R(\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0004\u0018\u0001`\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u000e8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006<"}, m65681d2 = {"Lbk2/e;", "Landroidx/lifecycle/w1;", "Lwj2/c;", "interactor", "Lxj2/e;", "calendarInteractor", "Lyj2/b;", "combiner", "Lck2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwj2/c;Lxj2/e;Lyj2/b;Lck2/a;Lbc3/c0;)V", "Lec3/l;", "Lwj2/a;", "Lwj2/b;", "n", "(Lec3/l;Lwj2/c;)Lec3/l;", "Lxj2/d;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "o", "(Lec3/l;Lxj2/e;)Lec3/l;", "Lbk2/b;", "viewEvent", "Ll83/a0;", "p", "(Lbk2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lwj2/c;", "getInteractor", "()Lwj2/c;", "x", "Lck2/a;", "l", "()Lck2/a;", "y", "Lbc3/c0;", "getCoroutineScope", "()Lbc3/c0;", "Lec3/o1;", "Lbk2/d;", "z", "Lec3/o1;", "eventFlow", "Lbk2/a;", "E", "calendarEventFlow", "F", "Lec3/l;", "domainState", "G", "calendarDomainState", "Lbk2/g;", "H", "getViewState", "()Lec3/l;", "viewState", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3358e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 calendarEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l calendarDomainState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C37322c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C4792a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: bk2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$domainState$2", m100430f = "TiltGraphViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lwj2/a$a;", "it", "Ll83/a0;", "<anonymous>", "(Lwj2/a$a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13058w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13059x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C3358e.this.new a(interfaceC30057d);
            aVar.f13059x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC37320a.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(aVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC37320a.a aVar = (AbstractC37320a.a) this.f13059x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C3358e.this.calendarEventFlow;
                AbstractC3354a.b bVar = new AbstractC3354a.b(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                this.f13059x = null;
                this.f13058w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bk2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$sendViewEvent$1", m100430f = "TiltGraphViewModel.kt", m100431l = {52, 53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC3355b f13062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C3358e f13063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3355b interfaceC3355b, C3358e c3358e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13062x = interfaceC3355b;
            this.f13063y = c3358e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f13062x, this.f13063y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            return r0;
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
                int r1 = r4.f13061w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L48
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                bk2.b r5 = r4.f13062x
                boolean r1 = r5 instanceof bk2.AbstractC3357d
                if (r1 == 0) goto L33
                bk2.e r5 = r4.f13063y
                ec3.o1 r5 = bk2.C3358e.m9696j(r5)
                bk2.b r1 = r4.f13062x
                r4.f13061w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L48
                goto L47
            L33:
                boolean r5 = r5 instanceof bk2.AbstractC3354a
                if (r5 == 0) goto L48
                bk2.e r5 = r4.f13063y
                ec3.o1 r5 = bk2.C3358e.m9695g(r5)
                bk2.b r1 = r4.f13062x
                r4.f13061w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bk2.C3358e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bk2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13064w;

        /* JADX INFO: renamed from: bk2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13065w;

            /* JADX INFO: renamed from: bk2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$special$$inlined$map$1$2", m100430f = "TiltGraphViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41309a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13066E;

                /* JADX INFO: renamed from: F */
                Object f13067F;

                /* JADX INFO: renamed from: G */
                Object f13068G;

                /* JADX INFO: renamed from: H */
                int f13069H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13070w;

                /* JADX INFO: renamed from: x */
                int f13071x;

                /* JADX INFO: renamed from: y */
                Object f13072y;

                public C41309a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13070w = obj;
                    this.f13071x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f13065w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41309a c41309a;
                if (interfaceC30057d instanceof C41309a) {
                    c41309a = (C41309a) interfaceC30057d;
                    int i13 = c41309a.f13071x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41309a.f13071x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41309a = new C41309a(interfaceC30057d);
                    }
                } else {
                    c41309a = new C41309a(interfaceC30057d);
                }
                Object obj2 = c41309a.f13070w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41309a.f13071x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13065w;
                    AbstractC37320a.a aVarM9705d = AbstractC3359f.m9705d((AbstractC3357d) obj);
                    c41309a.f13072y = null;
                    c41309a.f13066E = null;
                    c41309a.f13067F = null;
                    c41309a.f13068G = null;
                    c41309a.f13069H = 0;
                    c41309a.f13071x = 1;
                    if (interfaceC13062m.emit(aVarM9705d, c41309a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f13064w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13064w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bk2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13074w;

        /* JADX INFO: renamed from: bk2.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13075w;

            /* JADX INFO: renamed from: bk2.e$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$special$$inlined$map$2$2", m100430f = "TiltGraphViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41310a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13076E;

                /* JADX INFO: renamed from: F */
                Object f13077F;

                /* JADX INFO: renamed from: G */
                Object f13078G;

                /* JADX INFO: renamed from: H */
                int f13079H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13080w;

                /* JADX INFO: renamed from: x */
                int f13081x;

                /* JADX INFO: renamed from: y */
                Object f13082y;

                public C41310a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13080w = obj;
                    this.f13081x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f13075w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41310a c41310a;
                if (interfaceC30057d instanceof C41310a) {
                    c41310a = (C41310a) interfaceC30057d;
                    int i13 = c41310a.f13081x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41310a.f13081x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41310a = new C41310a(interfaceC30057d);
                    }
                } else {
                    c41310a = new C41310a(interfaceC30057d);
                }
                Object obj2 = c41310a.f13080w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41310a.f13081x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13075w;
                    AbstractC38408d abstractC38408dM9704c = AbstractC3359f.m9704c((AbstractC3354a) obj);
                    c41310a.f13082y = null;
                    c41310a.f13076E = null;
                    c41310a.f13077F = null;
                    c41310a.f13078G = null;
                    c41310a.f13079H = 0;
                    c41310a.f13081x = 1;
                    if (interfaceC13062m.emit(abstractC38408dM9704c, c41310a) == enumC31071a) {
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
            this.f13074w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13074w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bk2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13084w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3358e f13085x;

        /* JADX INFO: renamed from: bk2.e$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13086w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3358e f13087x;

            /* JADX INFO: renamed from: bk2.e$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.presentation.TiltGraphViewModel$special$$inlined$map$3$2", m100430f = "TiltGraphViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41311a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13088E;

                /* JADX INFO: renamed from: F */
                Object f13089F;

                /* JADX INFO: renamed from: G */
                Object f13090G;

                /* JADX INFO: renamed from: H */
                int f13091H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13092w;

                /* JADX INFO: renamed from: x */
                int f13093x;

                /* JADX INFO: renamed from: y */
                Object f13094y;

                public C41311a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13092w = obj;
                    this.f13093x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3358e c3358e) {
                this.f13086w = interfaceC13062m;
                this.f13087x = c3358e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41311a c41311a;
                if (interfaceC30057d instanceof C41311a) {
                    c41311a = (C41311a) interfaceC30057d;
                    int i13 = c41311a.f13093x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41311a.f13093x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41311a = new C41311a(interfaceC30057d);
                    }
                } else {
                    c41311a = new C41311a(interfaceC30057d);
                }
                Object obj2 = c41311a.f13092w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41311a.f13093x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13086w;
                    AbstractC3360g abstractC3360gM15150f = this.f13087x.getReducer().m15150f((C39593a) obj);
                    c41311a.f13094y = null;
                    c41311a.f13088E = null;
                    c41311a.f13089F = null;
                    c41311a.f13090G = null;
                    c41311a.f13091H = 0;
                    c41311a.f13093x = 1;
                    if (interfaceC13062m.emit(abstractC3360gM15150f, c41311a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C3358e c3358e) {
            this.f13084w = interfaceC13058l;
            this.f13085x = c3358e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13084w.collect(new a(interfaceC13062m, this.f13085x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3358e(C37322c interactor, C38409e calendarInteractor, C39594b combiner, C4792a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(calendarInteractor, "calendarInteractor");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.calendarEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM9697n = m9697n(new C13052j1(new c(c13096w1M36592b), new a(null), 0), interactor);
        this.domainState = interfaceC13058lM9697n;
        InterfaceC13058l interfaceC13058lM9698o = m9698o(new d(c13096w1M36592b2), calendarInteractor);
        this.calendarDomainState = interfaceC13058lM9698o;
        this.viewState = AbstractC13091v.m36586L(new e(combiner.m126476a(interfaceC13058lM9697n, interfaceC13058lM9698o), this), coroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m9697n(InterfaceC13058l interfaceC13058l, C37322c c37322c) {
        return c37322c.m119566g(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m9698o(InterfaceC13058l interfaceC13058l, C38409e c38409e) {
        return c38409e.m123034l(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C4792a getReducer() {
        return this.reducer;
    }

    /* JADX INFO: renamed from: p */
    public final void m9700p(InterfaceC3355b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, this, null), 3);
    }

    public /* synthetic */ C3358e(C37322c c37322c, C38409e c38409e, C39594b c39594b, C4792a c4792a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37322c, c38409e, c39594b, c4792a, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
