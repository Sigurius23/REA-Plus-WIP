package zl0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
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

/* JADX INFO: renamed from: zl0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lzl0/e;", "Lld1/c;", "Lzl0/k;", "Lzl0/f;", "Lzl0/d;", "interactor", "Lzl0/g;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lzl0/d;Lzl0/g;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lzl0/f;)V", "x", "Lzl0/d;", "y", "Lzl0/g;", "z", "Lbc3/c0;", "Lec3/o1;", "Lzl0/b;", "E", "Lec3/o1;", "actionFlow", "Lec3/l;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40873e extends AbstractC23864c<C40879k, InterfaceC40874f> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40872d interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C40875g reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: zl0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetMiniArchViewModel$sendViewEvent$1", m100430f = "SelectionWidgetMiniArchViewModel.kt", m100431l = {30, 32, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176150w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40874f f176151x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40873e f176152y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40874f interfaceC40874f, C40873e c40873e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176151x = interfaceC40874f;
            this.f176152y = c40873e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176151x, this.f176152y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f176150w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L18
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L73
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                zl0.f r6 = r5.f176151x
                boolean r1 = r6 instanceof zl0.InterfaceC40874f.c
                if (r1 == 0) goto L49
                zl0.e r6 = r5.f176152y
                ec3.o1 r6 = zl0.C40873e.m132472j(r6)
                zl0.b$c r1 = new zl0.b$c
                zl0.f r2 = r5.f176151x
                zl0.f$c r2 = (zl0.InterfaceC40874f.c) r2
                int r2 = r2.getSelectionId()
                zl0.f r3 = r5.f176151x
                zl0.f$c r3 = (zl0.InterfaceC40874f.c) r3
                boolean r3 = r3.getSelected()
                r1.<init>(r2, r3)
                r5.f176150w = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L73
                goto L72
            L49:
                boolean r1 = r6 instanceof zl0.InterfaceC40874f.b
                if (r1 == 0) goto L5e
                zl0.e r6 = r5.f176152y
                ec3.o1 r6 = zl0.C40873e.m132472j(r6)
                zl0.b$b r1 = zl0.AbstractC40870b.b.f176119a
                r5.f176150w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L73
                goto L72
            L5e:
                boolean r6 = r6 instanceof zl0.InterfaceC40874f.a
                if (r6 == 0) goto L76
                zl0.e r6 = r5.f176152y
                ec3.o1 r6 = zl0.C40873e.m132472j(r6)
                zl0.b$a r1 = zl0.AbstractC40870b.a.f176118a
                r5.f176150w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L73
            L72:
                return r0
            L73:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            L76:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zl0.C40873e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zl0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176153w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40873e f176154x;

        /* JADX INFO: renamed from: zl0.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176155w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40873e f176156x;

            /* JADX INFO: renamed from: zl0.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetMiniArchViewModel$special$$inlined$map$1$2", m100430f = "SelectionWidgetMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42762a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176157E;

                /* JADX INFO: renamed from: F */
                Object f176158F;

                /* JADX INFO: renamed from: G */
                Object f176159G;

                /* JADX INFO: renamed from: H */
                int f176160H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176161w;

                /* JADX INFO: renamed from: x */
                int f176162x;

                /* JADX INFO: renamed from: y */
                Object f176163y;

                public C42762a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176161w = obj;
                    this.f176162x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40873e c40873e) {
                this.f176155w = interfaceC13062m;
                this.f176156x = c40873e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42762a c42762a;
                if (interfaceC30057d instanceof C42762a) {
                    c42762a = (C42762a) interfaceC30057d;
                    int i13 = c42762a.f176162x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42762a.f176162x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42762a = new C42762a(interfaceC30057d);
                    }
                } else {
                    c42762a = new C42762a(interfaceC30057d);
                }
                Object obj2 = c42762a.f176161w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42762a.f176162x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176155w;
                    C40879k c40879kM132477a = this.f176156x.reducer.m132477a((C40871c) obj);
                    c42762a.f176163y = null;
                    c42762a.f176157E = null;
                    c42762a.f176158F = null;
                    c42762a.f176159G = null;
                    c42762a.f176160H = 0;
                    c42762a.f176162x = 1;
                    if (interfaceC13062m.emit(c40879kM132477a, c42762a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C40873e c40873e) {
            this.f176153w = interfaceC13058l;
            this.f176154x = c40873e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176153w.collect(new a(interfaceC13062m, this.f176154x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40873e(C40872d interactor, C40875g reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(interactor.interact(c13096w1M36592b), this), coroutineScope, C13105z1.f45288a, 1);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC40874f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C40873e(C40872d c40872d, C40875g c40875g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40872d, c40875g, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
