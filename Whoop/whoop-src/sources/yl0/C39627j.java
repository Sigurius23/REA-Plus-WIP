package yl0;

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
import rg0.C31384e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: yl0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lyl0/j;", "Lld1/c;", "Lyl0/o;", "Lyl0/k;", "Lyl0/h;", "interactor", "Lyl0/l;", "reducer", "Lrg0/e;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lyl0/h;Lyl0/l;Lrg0/e;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lyl0/k;)V", "x", "Lyl0/h;", "y", "Lyl0/l;", "z", "Lrg0/e;", "E", "Lbc3/c0;", "Lec3/o1;", "Lyl0/f;", "F", "Lec3/o1;", "actionFlow", "Lec3/l;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39627j extends AbstractC23864c<C39632o, InterfaceC39628k> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C39625h interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C39629l reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C31384e analyticsHelper;

    /* JADX INFO: renamed from: yl0.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetMiniArchViewModel$sendViewEvent$1", m100430f = "JournalEntryWidgetMiniArchViewModel.kt", m100431l = {32, 34, 36, 38, 40, 42, 44, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170471w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC39628k f170472x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39627j f170473y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC39628k interfaceC39628k, C39627j c39627j, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170472x = interfaceC39628k;
            this.f170473y = c39627j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170472x, this.f170473y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0145, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yl0.C39627j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yl0.j$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170474w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39627j f170475x;

        /* JADX INFO: renamed from: yl0.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170476w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39627j f170477x;

            /* JADX INFO: renamed from: yl0.j$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetMiniArchViewModel$special$$inlined$map$1$2", m100430f = "JournalEntryWidgetMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42702a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f170478E;

                /* JADX INFO: renamed from: F */
                Object f170479F;

                /* JADX INFO: renamed from: G */
                Object f170480G;

                /* JADX INFO: renamed from: H */
                int f170481H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170482w;

                /* JADX INFO: renamed from: x */
                int f170483x;

                /* JADX INFO: renamed from: y */
                Object f170484y;

                public C42702a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170482w = obj;
                    this.f170483x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39627j c39627j) {
                this.f170476w = interfaceC13062m;
                this.f170477x = c39627j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42702a c42702a;
                if (interfaceC30057d instanceof C42702a) {
                    c42702a = (C42702a) interfaceC30057d;
                    int i13 = c42702a.f170483x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42702a.f170483x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42702a = new C42702a(interfaceC30057d);
                    }
                } else {
                    c42702a = new C42702a(interfaceC30057d);
                }
                Object obj2 = c42702a.f170482w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42702a.f170483x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170476w;
                    C39632o c39632oM126664c = this.f170477x.reducer.m126664c((C39624g) obj);
                    c42702a.f170484y = null;
                    c42702a.f170478E = null;
                    c42702a.f170479F = null;
                    c42702a.f170480G = null;
                    c42702a.f170481H = 0;
                    c42702a.f170483x = 1;
                    if (interfaceC13062m.emit(c39632oM126664c, c42702a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C39627j c39627j) {
            this.f170474w = interfaceC13058l;
            this.f170475x = c39627j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170474w.collect(new a(interfaceC13062m, this.f170475x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39627j(C39625h interactor, C39629l reducer, C31384e analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
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
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC39628k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C39627j(C39625h c39625h, C39629l c39629l, C31384e c31384e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39625h, c39629l, c31384e, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
