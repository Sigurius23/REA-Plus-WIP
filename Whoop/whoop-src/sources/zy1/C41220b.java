package zy1;

import androidx.core.app.NotificationCompat;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wy1.C37695b;
import wy1.InterfaceC37694a;
import xy1.C38700a;
import xy1.C38701b;

/* JADX INFO: renamed from: zy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lzy1/b;", "Landroidx/lifecycle/w1;", "Lxy1/b;", "interactor", "Lzy1/c;", "mfaInputViewStateReducer", "Lbc3/c0;", "coroutineScope", "stateInScope", "<init>", "(Lxy1/b;Lzy1/c;Lbc3/c0;Lbc3/c0;)V", "Lec3/l;", "Lwy1/a;", "Lxy1/a;", "n", "(Lec3/l;Lxy1/b;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lwy1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lzy1/c;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "viewEvents", "Lec3/t1;", "Lwy1/b;", "z", "Lec3/t1;", "l", "()Lec3/t1;", "viewState", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41220b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C41221c mfaInputViewStateReducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEvents;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: zy1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.presentation.MfaInputViewModel$sendViewEvent$1", m100430f = "MfaInputViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177862w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC37694a f177864y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC37694a interfaceC37694a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177864y = interfaceC37694a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C41220b.this.new a(this.f177864y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177862w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C41220b.this.viewEvents;
                InterfaceC37694a interfaceC37694a = this.f177864y;
                this.f177862w = 1;
                if (interfaceC13072o1.emit(interfaceC37694a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zy1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177865w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41220b f177866x;

        /* JADX INFO: renamed from: zy1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177867w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41220b f177868x;

            /* JADX INFO: renamed from: zy1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.presentation.MfaInputViewModel$special$$inlined$map$1$2", m100430f = "MfaInputViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42780a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177869E;

                /* JADX INFO: renamed from: F */
                Object f177870F;

                /* JADX INFO: renamed from: G */
                Object f177871G;

                /* JADX INFO: renamed from: H */
                int f177872H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177873w;

                /* JADX INFO: renamed from: x */
                int f177874x;

                /* JADX INFO: renamed from: y */
                Object f177875y;

                public C42780a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177873w = obj;
                    this.f177874x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C41220b c41220b) {
                this.f177867w = interfaceC13062m;
                this.f177868x = c41220b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42780a c42780a;
                if (interfaceC30057d instanceof C42780a) {
                    c42780a = (C42780a) interfaceC30057d;
                    int i13 = c42780a.f177874x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42780a.f177874x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42780a = new C42780a(interfaceC30057d);
                    }
                } else {
                    c42780a = new C42780a(interfaceC30057d);
                }
                Object obj2 = c42780a.f177873w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42780a.f177874x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f177867w;
                    C37695b c37695bM133909a = this.f177868x.mfaInputViewStateReducer.m133909a((C38700a) obj);
                    c42780a.f177875y = null;
                    c42780a.f177869E = null;
                    c42780a.f177870F = null;
                    c42780a.f177871G = null;
                    c42780a.f177872H = 0;
                    c42780a.f177874x = 1;
                    if (interfaceC13062m.emit(c37695bM133909a, c42780a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C41220b c41220b) {
            this.f177865w = interfaceC13058l;
            this.f177866x = c41220b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177865w.collect(new a(interfaceC13062m, this.f177866x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41220b(C38701b interactor, C41221c mfaInputViewStateReducer, InterfaceC2994c0 coroutineScope, InterfaceC2994c0 stateInScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(mfaInputViewStateReducer, "mfaInputViewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(stateInScope, "stateInScope");
        this.mfaInputViewStateReducer = mfaInputViewStateReducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.viewEvents = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(m133906n(c13096w1M36592b, interactor), this), stateInScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m133906n(InterfaceC13058l interfaceC13058l, C38701b c38701b) {
        return c38701b.m124125f(interfaceC13058l);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m133908o(InterfaceC37694a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C41220b(C38701b c38701b, C41221c c41221c, InterfaceC2994c0 interfaceC2994c0, InterfaceC2994c0 interfaceC2994c1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC2994c0 = (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0;
        this(c38701b, c41221c, interfaceC2994c0, (i13 & 8) != 0 ? interfaceC2994c0 : interfaceC2994c1);
    }
}
