package da0;

import androidx.lifecycle.AbstractC1637w1;
import ba0.C2898b;
import ba0.C2899c;
import ba0.InterfaceC2897a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ca0.AbstractC4359a;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import n82.EnumC26455a;
import n82.InterfaceC26456b;
import od1.AbstractC27845h;
import od1.C27850m;
import od1.C27851n;
import od1.InterfaceC27849l;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.InterfaceC32869i;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: da0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010+R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002090-8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020>0-8\u0006¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010<¨\u0006B"}, m65681d2 = {"Lda0/c;", "Landroidx/lifecycle/w1;", "Lba0/c;", "interactor", "Lod1/n;", "selectActivityTypeInteractor", "Lda0/a;", "reducer", "Lbc3/c0;", "scope", "Lzr2/a;", "timeProvider", "<init>", "(Lba0/c;Lod1/n;Lda0/a;Lbc3/c0;Lzr2/a;)V", "Lda0/b;", "viewEvent", "Lba0/a;", "r", "(Lda0/b;)Lba0/a;", "Ln82/b;", "Lod1/l;", "q", "(Ln82/b;)Lod1/l;", "", HMSTrackSource.SCREEN, "Ln82/a;", "v", "(Ljava/lang/String;)Ln82/a;", "Lbc3/k1;", "t", "(Ln82/b;)Lbc3/k1;", "u", "(Lda0/b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lba0/c;", "x", "Lda0/a;", "y", "Lbc3/c0;", "z", "Lzr2/a;", "Lec3/o1;", "E", "Lec3/o1;", "selectActivityTypeEventFlow", "Lec3/l;", "Lod1/m;", "F", "Lec3/l;", "selectActivityTypeDomainState", "G", "eventFlow", "Lec3/t1;", "Lba0/b;", "H", "Lec3/t1;", "domainState", "Lda0/d;", "I", "getViewState", "()Lec3/l;", "viewState", "Lca0/a;", "J", "p", "navigationEvents", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11830c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 selectActivityTypeEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l selectActivityTypeDomainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C2899c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C11828a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: da0.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function3 {
        public a(Object obj) {
            super(3, 0, C2899c.class, obj, "interact", "interact(Lcom/whoop/add/activity/domain/AddActivityDomainState;Lcom/whoop/add/activity/domain/AddActivityDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C2898b c2898b, InterfaceC2897a interfaceC2897a, InterfaceC30057d<? super C2898b> interfaceC30057d) {
            return ((C2899c) this.receiver).m8494k(c2898b, interfaceC2897a, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: da0.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$sendSelectActivityViewEvent$1", m100430f = "AddActivityViewModel.kt", m100431l = {104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38454w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC26456b f38456y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC26456b interfaceC26456b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38456y = interfaceC26456b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11830c.this.new b(this.f38456y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38454w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C11830c.this.selectActivityTypeEventFlow;
                InterfaceC26456b interfaceC26456b = this.f38456y;
                this.f38454w = 1;
                if (interfaceC13072o1.emit(interfaceC26456b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: da0.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$sendViewEvent$1", m100430f = "AddActivityViewModel.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38457w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC11829b f38459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC11829b interfaceC11829b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38459y = interfaceC11829b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11830c.this.new c(this.f38459y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38457w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C11830c.this.eventFlow;
                InterfaceC11829b interfaceC11829b = this.f38459y;
                this.f38457w = 1;
                if (interfaceC13072o1.emit(interfaceC11829b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: da0.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f38460w;

        /* JADX INFO: renamed from: da0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f38461w;

            /* JADX INFO: renamed from: da0.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$special$$inlined$filter$1$2", m100430f = "AddActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41458a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f38463F;

                /* JADX INFO: renamed from: G */
                Object f38464G;

                /* JADX INFO: renamed from: H */
                int f38465H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f38466w;

                /* JADX INFO: renamed from: x */
                int f38467x;

                /* JADX INFO: renamed from: y */
                Object f38468y;

                /* JADX INFO: renamed from: z */
                Object f38469z;

                public C41458a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f38466w = obj;
                    this.f38467x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f38461w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41458a c41458a;
                if (interfaceC30057d instanceof C41458a) {
                    c41458a = (C41458a) interfaceC30057d;
                    int i13 = c41458a.f38467x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41458a.f38467x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41458a = new C41458a(interfaceC30057d);
                    }
                } else {
                    c41458a = new C41458a(interfaceC30057d);
                }
                Object obj2 = c41458a.f38466w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41458a.f38467x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f38461w;
                    C2898b c2898b = (C2898b) obj;
                    if ((c2898b.getScreenState() instanceof InterfaceC32869i.l) && !AbstractC22676k.m65745e(c2898b.getScreenState(), InterfaceC32869i.b.f136908a)) {
                        c41458a.f38468y = null;
                        c41458a.f38469z = null;
                        c41458a.f38463F = null;
                        c41458a.f38464G = null;
                        c41458a.f38465H = 0;
                        c41458a.f38467x = 1;
                        if (interfaceC13062m.emit(obj, c41458a) == enumC31071a) {
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
            this.f38460w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f38460w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: da0.c$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f38470w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11830c f38471x;

        /* JADX INFO: renamed from: da0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f38472w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11830c f38473x;

            /* JADX INFO: renamed from: da0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$special$$inlined$map$1$2", m100430f = "AddActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41459a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f38474E;

                /* JADX INFO: renamed from: F */
                Object f38475F;

                /* JADX INFO: renamed from: G */
                Object f38476G;

                /* JADX INFO: renamed from: H */
                int f38477H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f38478w;

                /* JADX INFO: renamed from: x */
                int f38479x;

                /* JADX INFO: renamed from: y */
                Object f38480y;

                public C41459a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f38478w = obj;
                    this.f38479x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11830c c11830c) {
                this.f38472w = interfaceC13062m;
                this.f38473x = c11830c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41459a c41459a;
                if (interfaceC30057d instanceof C41459a) {
                    c41459a = (C41459a) interfaceC30057d;
                    int i13 = c41459a.f38479x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41459a.f38479x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41459a = new C41459a(interfaceC30057d);
                    }
                } else {
                    c41459a = new C41459a(interfaceC30057d);
                }
                Object obj2 = c41459a.f38478w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41459a.f38479x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f38472w;
                    InterfaceC27849l interfaceC27849lM31730q = this.f38473x.m31730q((InterfaceC26456b) obj);
                    c41459a.f38480y = null;
                    c41459a.f38474E = null;
                    c41459a.f38475F = null;
                    c41459a.f38476G = null;
                    c41459a.f38477H = 0;
                    c41459a.f38479x = 1;
                    if (interfaceC13062m.emit(interfaceC27849lM31730q, c41459a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C11830c c11830c) {
            this.f38470w = interfaceC13058l;
            this.f38471x = c11830c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f38470w.collect(new a(interfaceC13062m, this.f38471x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: da0.c$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f38482w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11830c f38483x;

        /* JADX INFO: renamed from: da0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f38484w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11830c f38485x;

            /* JADX INFO: renamed from: da0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$special$$inlined$map$2$2", m100430f = "AddActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41460a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f38486E;

                /* JADX INFO: renamed from: F */
                Object f38487F;

                /* JADX INFO: renamed from: G */
                Object f38488G;

                /* JADX INFO: renamed from: H */
                int f38489H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f38490w;

                /* JADX INFO: renamed from: x */
                int f38491x;

                /* JADX INFO: renamed from: y */
                Object f38492y;

                public C41460a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f38490w = obj;
                    this.f38491x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11830c c11830c) {
                this.f38484w = interfaceC13062m;
                this.f38485x = c11830c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41460a c41460a;
                if (interfaceC30057d instanceof C41460a) {
                    c41460a = (C41460a) interfaceC30057d;
                    int i13 = c41460a.f38491x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41460a.f38491x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41460a = new C41460a(interfaceC30057d);
                    }
                } else {
                    c41460a = new C41460a(interfaceC30057d);
                }
                Object obj2 = c41460a.f38490w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41460a.f38491x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f38484w;
                    InterfaceC2897a interfaceC2897aM31731r = this.f38485x.m31731r((InterfaceC11829b) obj);
                    c41460a.f38492y = null;
                    c41460a.f38486E = null;
                    c41460a.f38487F = null;
                    c41460a.f38488G = null;
                    c41460a.f38489H = 0;
                    c41460a.f38491x = 1;
                    if (interfaceC13062m.emit(interfaceC2897aM31731r, c41460a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C11830c c11830c) {
            this.f38482w = interfaceC13058l;
            this.f38483x = c11830c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f38482w.collect(new a(interfaceC13062m, this.f38483x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: da0.c$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f38494w;

        /* JADX INFO: renamed from: da0.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f38495w;

            /* JADX INFO: renamed from: da0.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$special$$inlined$map$3$2", m100430f = "AddActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41461a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f38496E;

                /* JADX INFO: renamed from: F */
                Object f38497F;

                /* JADX INFO: renamed from: G */
                Object f38498G;

                /* JADX INFO: renamed from: H */
                int f38499H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f38500w;

                /* JADX INFO: renamed from: x */
                int f38501x;

                /* JADX INFO: renamed from: y */
                Object f38502y;

                public C41461a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f38500w = obj;
                    this.f38501x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f38495w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41461a c41461a;
                Object bVar;
                if (interfaceC30057d instanceof C41461a) {
                    c41461a = (C41461a) interfaceC30057d;
                    int i13 = c41461a.f38501x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41461a.f38501x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41461a = new C41461a(interfaceC30057d);
                    }
                } else {
                    c41461a = new C41461a(interfaceC30057d);
                }
                Object obj2 = c41461a.f38500w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41461a.f38501x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f38495w;
                    InterfaceC32869i screenState = ((C2898b) obj).getScreenState();
                    AbstractC22676k.m65748h(screenState, "null cannot be cast to non-null type com.whoop.common.presentation.ScreenState.ScreenDataState");
                    InterfaceC32869i.l lVar = (InterfaceC32869i.l) screenState;
                    if (lVar.equals(InterfaceC32869i.c.f136909a)) {
                        bVar = AbstractC4359a.a.f17632a;
                    } else {
                        bVar = lVar instanceof InterfaceC32869i.g ? new AbstractC4359a.b(((InterfaceC32869i.g) lVar).getActivityId()) : AbstractC4359a.c.f17634a;
                    }
                    c41461a.f38502y = null;
                    c41461a.f38496E = null;
                    c41461a.f38497F = null;
                    c41461a.f38498G = null;
                    c41461a.f38499H = 0;
                    c41461a.f38501x = 1;
                    if (interfaceC13062m.emit(bVar, c41461a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f38494w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f38494w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: da0.c$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.presentation.AddActivityViewModel$viewState$1", m100430f = "AddActivityViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lba0/b;", "screenState", "Lod1/m;", "searchState", "Lda0/d;", "<anonymous>", "(Lba0/b;Lod1/m;)Lda0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f38504w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38505x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f38506y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C2898b c2898b, C27850m c27850m, InterfaceC30057d<? super InterfaceC11831d> interfaceC30057d) {
            h hVar = C11830c.this.new h(interfaceC30057d);
            hVar.f38505x = c2898b;
            hVar.f38506y = c27850m;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C2898b c2898b = (C2898b) this.f38505x;
            C27850m c27850m = (C27850m) this.f38506y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38504w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C11830c.this.reducer.m31710m(c2898b, c27850m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830c(C2899c interactor, C27851n selectActivityTypeInteractor, C11828a reducer, InterfaceC2994c0 scope, InterfaceC41070a timeProvider) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(selectActivityTypeInteractor, "selectActivityTypeInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        this.interactor = interactor;
        this.reducer = reducer;
        this.scope = scope;
        this.timeProvider = timeProvider;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.selectActivityTypeEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new e(c13096w1M36592b, this), selectActivityTypeInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, scope, c13021b2, 1);
        this.selectActivityTypeDomainState = c13078q1M36586L;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b2;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new C13060l1(new C2898b(null, null, null, null, timeProvider.mo133362a(), timeProvider.mo133362a(), null, null, null, null, null, false, null, 8143, null), new f(c13096w1M36592b2, this), new a(interactor)), scope, c13021b2, 1);
        this.domainState = c13078q1M36586L2;
        this.viewState = new C13060l1(c13078q1M36586L2, c13078q1M36586L, new h(null), 1);
        this.navigationEvents = new g(new d(c13078q1M36586L2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC27849l m31730q(InterfaceC26456b viewEvent) {
        if (viewEvent instanceof InterfaceC26456b.a) {
            return new InterfaceC27849l.a(((InterfaceC26456b.a) viewEvent).getInitialScreenType(), false, 2, null);
        }
        if (!(viewEvent instanceof InterfaceC26456b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC26456b.b bVar = (InterfaceC26456b.b) viewEvent;
        return new InterfaceC27849l.b(bVar.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), bVar.getScreenType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC2897a m31731r(InterfaceC11829b viewEvent) {
        if (viewEvent instanceof InterfaceC11829b.g) {
            InterfaceC11829b.g gVar = (InterfaceC11829b.g) viewEvent;
            m31734t(new InterfaceC26456b.a(m31732v(gVar.getPageType())));
            return new InterfaceC2897a.g(m31732v(gVar.getPageType()), gVar.getStartDate(), gVar.getEndDate(), gVar.getInternalName(), gVar.getIsGdcFlow());
        }
        if (viewEvent instanceof InterfaceC11829b.i) {
            InterfaceC11829b.i iVar = (InterfaceC11829b.i) viewEvent;
            m31734t(new InterfaceC26456b.a(iVar.getPageType()));
            return new InterfaceC2897a.f(iVar.getPageType());
        }
        if (viewEvent instanceof InterfaceC11829b.l) {
            return new InterfaceC2897a.l(((InterfaceC11829b.l) viewEvent).getStrapLocation());
        }
        if (viewEvent instanceof InterfaceC11829b.k) {
            return new InterfaceC2897a.k(((InterfaceC11829b.k) viewEvent).getStartDateTime());
        }
        if (viewEvent instanceof InterfaceC11829b.d) {
            return new InterfaceC2897a.j(((InterfaceC11829b.d) viewEvent).getEndDateTime());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC11829b.j.f38440a)) {
            return InterfaceC2897a.i.f11611a;
        }
        if (viewEvent instanceof InterfaceC11829b.a) {
            return new InterfaceC2897a.a(((InterfaceC11829b.a) viewEvent).getInternalName());
        }
        if (viewEvent instanceof InterfaceC11829b.f) {
            return new InterfaceC2897a.e(((InterfaceC11829b.f) viewEvent).getErrorCloseEvent());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC11829b.h.f38438a)) {
            return InterfaceC2897a.h.f11610a;
        }
        if (viewEvent instanceof InterfaceC11829b.b) {
            return new InterfaceC2897a.d(((InterfaceC11829b.b) viewEvent).getIsCancel());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC11829b.e.f38431a)) {
            return InterfaceC2897a.c.f11601a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC11829b.c.f38429a)) {
            return InterfaceC2897a.b.f11600a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    private final EnumC26455a m31732v(String screen) {
        return EnumC26455a.valueOf(screen);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC3027k1 m31734t(InterfaceC26456b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new b(viewEvent, null), 3);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3027k1 m31735u(InterfaceC11829b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new c(viewEvent, null), 3);
    }

    public /* synthetic */ C11830c(C2899c c2899c, C27851n c27851n, C11828a c11828a, InterfaceC2994c0 interfaceC2994c0, InterfaceC41070a interfaceC41070a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2899c, c27851n, c11828a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC41070a);
    }
}
