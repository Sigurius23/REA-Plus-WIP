package ah0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.domain.formwidget.C5936d;
import com.whoop.p057ai.chat.domain.formwidget.C5938f;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
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

/* JADX INFO: renamed from: ah0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lah0/h;", "Lld1/c;", "Lah0/i;", "Lah0/g;", "Lcom/whoop/ai/chat/domain/formwidget/f;", "interactor", "Lah0/j;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lah0/g;)V", "x", "Lcom/whoop/ai/chat/domain/formwidget/f;", "y", "Lah0/j;", "z", "Lbc3/c0;", "Lec3/o1;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "E", "Lec3/o1;", "actionFlow", "Lec3/t1;", "Lcom/whoop/ai/chat/domain/formwidget/d;", "F", "Lec3/t1;", "widgetState", "Lec3/l;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0887h extends AbstractC23864c<C0888i, InterfaceC0886g> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 widgetState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C5938f interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C0889j reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: ah0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.formwidget.FormWidgetViewModel$sendViewEvent$1", m100430f = "FormWidgetViewModel.kt", m100431l = {35, 37, 39, 50, 59, 61, 63, 65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3244w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC0886g f3245x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0887h f3246y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0886g interfaceC0886g, C0887h c0887h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3245x = interfaceC0886g;
            this.f3246y = c0887h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f3245x, this.f3246y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0109, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ah0.C0887h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ah0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3247w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0887h f3248x;

        /* JADX INFO: renamed from: ah0.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3249w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0887h f3250x;

            /* JADX INFO: renamed from: ah0.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.formwidget.FormWidgetViewModel$special$$inlined$map$1$2", m100430f = "FormWidgetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41273a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3251E;

                /* JADX INFO: renamed from: F */
                Object f3252F;

                /* JADX INFO: renamed from: G */
                Object f3253G;

                /* JADX INFO: renamed from: H */
                int f3254H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3255w;

                /* JADX INFO: renamed from: x */
                int f3256x;

                /* JADX INFO: renamed from: y */
                Object f3257y;

                public C41273a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3255w = obj;
                    this.f3256x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0887h c0887h) {
                this.f3249w = interfaceC13062m;
                this.f3250x = c0887h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41273a c41273a;
                if (interfaceC30057d instanceof C41273a) {
                    c41273a = (C41273a) interfaceC30057d;
                    int i13 = c41273a.f3256x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41273a.f3256x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41273a = new C41273a(interfaceC30057d);
                    }
                } else {
                    c41273a = new C41273a(interfaceC30057d);
                }
                Object obj2 = c41273a.f3255w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41273a.f3256x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3249w;
                    C0888i c0888iM2183a = this.f3250x.reducer.m2183a((C5936d) obj);
                    c41273a.f3257y = null;
                    c41273a.f3251E = null;
                    c41273a.f3252F = null;
                    c41273a.f3253G = null;
                    c41273a.f3254H = 0;
                    c41273a.f3256x = 1;
                    if (interfaceC13062m.emit(c0888iM2183a, c41273a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C0887h c0887h) {
            this.f3247w = interfaceC13058l;
            this.f3248x = c0887h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3247w.collect(new a(interfaceC13062m, this.f3248x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0887h(C5938f interactor, C0889j reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(c13096w1M36592b);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.widgetState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new b(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC0886g event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C0887h(C5938f c5938f, C0889j c0889j, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5938f, c0889j, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
