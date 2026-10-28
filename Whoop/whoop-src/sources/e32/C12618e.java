package e32;

import androidx.lifecycle.AbstractC1637w1;
import b32.AbstractC2676b;
import b32.C2677c;
import b32.C2678d;
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
import f32.C14047a;
import h20.AbstractC16632b4;
import h20.InterfaceC16645e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import od1.AbstractC27845h;
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
import y00.C38915o4;

/* JADX INFO: renamed from: e32.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Le32/e;", "Landroidx/lifecycle/w1;", "Lb32/d;", "interactor", "Lf32/a;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lb32/d;Lf32/a;Lbc3/c0;)V", "", HMSTrackSource.SCREEN, "Ll83/a0;", "p", "(Ljava/lang/String;)V", "Ly00/o4;", "paymentMethod", "postalCode", "Lh20/e;", "o", "(Ly00/o4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lh20/b4;", "result", "q", "(Lh20/b4;Ljava/lang/String;)V", "r", "()V", "t", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lb32/d;", "x", "Lf32/a;", "y", "Lbc3/c0;", "Lec3/o1;", "Lb32/b;", "z", "Lec3/o1;", "actionFlow", "Lec3/t1;", "Le32/c;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "paymentViewState", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12618e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 paymentViewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C2678d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14047a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: e32.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$dismissSetDefaultOverlay$1", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43092w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12618e.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43092w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12618e.this.actionFlow;
                AbstractC2676b.b bVar = AbstractC2676b.b.f10474a;
                this.f43092w = 1;
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

    /* JADX INFO: renamed from: e32.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$onPaymentSheetPresented$1", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43094w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f43096y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43096y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12618e.this.new b(this.f43096y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43094w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12618e.this.actionFlow;
                AbstractC2676b.d dVar = new AbstractC2676b.d(this.f43096y);
                this.f43094w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: e32.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$onPaymentSheetResult$1", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43097w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC16632b4 f43099y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f43100z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC16632b4 abstractC16632b4, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43099y = abstractC16632b4;
            this.f43100z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12618e.this.new c(this.f43099y, this.f43100z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43097w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12618e.this.actionFlow;
                AbstractC2676b.c cVar = new AbstractC2676b.c(this.f43099y, this.f43100z);
                this.f43097w = 1;
                if (interfaceC13072o1.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: e32.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$onPaymentStatusConsumed$1", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43101w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12618e.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43101w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12618e.this.actionFlow;
                AbstractC2676b.a aVar = AbstractC2676b.a.f10473a;
                this.f43101w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: e32.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$onRetrySetDefault$1", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43103w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12618e.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43103w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12618e.this.actionFlow;
                AbstractC2676b.e eVar = AbstractC2676b.e.f10478a;
                this.f43103w = 1;
                if (interfaceC13072o1.emit(eVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: e32.e$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f43105w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12618e f43106x;

        /* JADX INFO: renamed from: e32.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f43107w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12618e f43108x;

            /* JADX INFO: renamed from: e32.e$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.presentation.StripeBottomSheetTileViewModel$special$$inlined$map$1$2", m100430f = "StripeBottomSheetTileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41507a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f43109E;

                /* JADX INFO: renamed from: F */
                Object f43110F;

                /* JADX INFO: renamed from: G */
                Object f43111G;

                /* JADX INFO: renamed from: H */
                int f43112H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f43113w;

                /* JADX INFO: renamed from: x */
                int f43114x;

                /* JADX INFO: renamed from: y */
                Object f43115y;

                public C41507a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f43113w = obj;
                    this.f43114x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12618e c12618e) {
                this.f43107w = interfaceC13062m;
                this.f43108x = c12618e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41507a c41507a;
                if (interfaceC30057d instanceof C41507a) {
                    c41507a = (C41507a) interfaceC30057d;
                    int i13 = c41507a.f43114x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41507a.f43114x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41507a = new C41507a(interfaceC30057d);
                    }
                } else {
                    c41507a = new C41507a(interfaceC30057d);
                }
                Object obj2 = c41507a.f43113w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41507a.f43114x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f43107w;
                    C12616c c12616cM39976a = this.f43108x.viewStateReducer.m39976a((C2677c) obj);
                    c41507a.f43115y = null;
                    c41507a.f43109E = null;
                    c41507a.f43110F = null;
                    c41507a.f43111G = null;
                    c41507a.f43112H = 0;
                    c41507a.f43114x = 1;
                    if (interfaceC13062m.emit(c12616cM39976a, c41507a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C12618e c12618e) {
            this.f43105w = interfaceC13058l;
            this.f43106x = c12618e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f43105w.collect(new a(interfaceC13062m, this.f43106x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12618e(C2678d interactor, C14047a viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b;
        this.paymentViewState = AbstractC13091v.m36586L(new f(AbstractC27845h.m83945a(c13096w1M36592b, interactor), this), scope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    public final void m35385l() {
        AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getPaymentViewState() {
        return this.paymentViewState;
    }

    /* JADX INFO: renamed from: o */
    public final Object m35387o(C38915o4 c38915o4, String str, String str2, InterfaceC30057d<? super InterfaceC16645e> interfaceC30057d) {
        return this.interactor.m7570i(c38915o4, str, str2, interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    public final void m35388p(String screen) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(screen, null), 3);
    }

    /* JADX INFO: renamed from: q */
    public final void m35389q(AbstractC16632b4 result, String screen) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC3006f0.m8732z(this.scope, null, null, new c(result, screen, null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m35390r() {
        AbstractC3006f0.m8732z(this.scope, null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: t */
    public final void m35391t() {
        AbstractC3006f0.m8732z(this.scope, null, null, new e(null), 3);
    }

    public /* synthetic */ C12618e(C2678d c2678d, C14047a c14047a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2678d, c14047a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
