package ge1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import de1.C11982b;
import de1.C11983c;
import de1.InterfaceC11981a;
import ec3.AbstractC13091v;
import ec3.C13078q1;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ge1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\n8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(¨\u0006."}, m65681d2 = {"Lge1/c;", "Landroidx/lifecycle/w1;", "Lde1/c;", "interactor", "Lge1/a;", "reducer", "Lbc3/c0;", "scope", "<init>", "(Lde1/c;Lge1/a;Lbc3/c0;)V", "Lec3/l;", "Lde1/a;", "Lde1/b;", "interact", "(Lec3/l;)Lec3/l;", "Lge1/b;", "viewEvent", "o", "(Lge1/b;)Lde1/a;", "Ll83/a0;", "p", "(Lge1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lde1/c;", "x", "Lge1/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "E", "Lec3/t1;", "domainState", "Lge1/d;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "", "G", "n", "dismissEvents", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15734c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l dismissEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11983c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C15732a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ge1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.presentation.EditActivitiesDrawerViewModel$sendViewEvent$1", m100430f = "EditActivitiesDrawerViewModel.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f59265w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15733b f59267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15733b interfaceC15733b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f59267y = interfaceC15733b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15734c.this.new a(this.f59267y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59265w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15734c.this.eventFlow;
                InterfaceC15733b interfaceC15733b = this.f59267y;
                this.f59265w = 1;
                if (interfaceC13072o1.emit(interfaceC15733b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ge1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59268w;

        /* JADX INFO: renamed from: ge1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59269w;

            /* JADX INFO: renamed from: ge1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.editactivities.presentation.EditActivitiesDrawerViewModel$special$$inlined$filter$1$2", m100430f = "EditActivitiesDrawerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41638a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f59271F;

                /* JADX INFO: renamed from: G */
                Object f59272G;

                /* JADX INFO: renamed from: H */
                int f59273H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59274w;

                /* JADX INFO: renamed from: x */
                int f59275x;

                /* JADX INFO: renamed from: y */
                Object f59276y;

                /* JADX INFO: renamed from: z */
                Object f59277z;

                public C41638a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59274w = obj;
                    this.f59275x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f59269w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41638a c41638a;
                if (interfaceC30057d instanceof C41638a) {
                    c41638a = (C41638a) interfaceC30057d;
                    int i13 = c41638a.f59275x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41638a.f59275x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41638a = new C41638a(interfaceC30057d);
                    }
                } else {
                    c41638a = new C41638a(interfaceC30057d);
                }
                Object obj2 = c41638a.f59274w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41638a.f59275x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59269w;
                    if (((C11982b) obj).getShouldDismiss()) {
                        c41638a.f59276y = null;
                        c41638a.f59277z = null;
                        c41638a.f59271F = null;
                        c41638a.f59272G = null;
                        c41638a.f59273H = 0;
                        c41638a.f59275x = 1;
                        if (interfaceC13062m.emit(obj, c41638a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f59268w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59268w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ge1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59278w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15734c f59279x;

        /* JADX INFO: renamed from: ge1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59280w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15734c f59281x;

            /* JADX INFO: renamed from: ge1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.editactivities.presentation.EditActivitiesDrawerViewModel$special$$inlined$map$1$2", m100430f = "EditActivitiesDrawerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41639a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59282E;

                /* JADX INFO: renamed from: F */
                Object f59283F;

                /* JADX INFO: renamed from: G */
                Object f59284G;

                /* JADX INFO: renamed from: H */
                int f59285H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59286w;

                /* JADX INFO: renamed from: x */
                int f59287x;

                /* JADX INFO: renamed from: y */
                Object f59288y;

                public C41639a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59286w = obj;
                    this.f59287x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15734c c15734c) {
                this.f59280w = interfaceC13062m;
                this.f59281x = c15734c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41639a c41639a;
                if (interfaceC30057d instanceof C41639a) {
                    c41639a = (C41639a) interfaceC30057d;
                    int i13 = c41639a.f59287x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41639a.f59287x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41639a = new C41639a(interfaceC30057d);
                    }
                } else {
                    c41639a = new C41639a(interfaceC30057d);
                }
                Object obj2 = c41639a.f59286w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41639a.f59287x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59280w;
                    InterfaceC11981a interfaceC11981aM44356o = this.f59281x.m44356o((InterfaceC15733b) obj);
                    c41639a.f59288y = null;
                    c41639a.f59282E = null;
                    c41639a.f59283F = null;
                    c41639a.f59284G = null;
                    c41639a.f59285H = 0;
                    c41639a.f59287x = 1;
                    if (interfaceC13062m.emit(interfaceC11981aM44356o, c41639a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C15734c c15734c) {
            this.f59278w = interfaceC13058l;
            this.f59279x = c15734c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59278w.collect(new a(interfaceC13062m, this.f59279x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ge1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59290w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15734c f59291x;

        /* JADX INFO: renamed from: ge1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59292w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15734c f59293x;

            /* JADX INFO: renamed from: ge1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.editactivities.presentation.EditActivitiesDrawerViewModel$special$$inlined$map$2$2", m100430f = "EditActivitiesDrawerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41640a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59294E;

                /* JADX INFO: renamed from: F */
                Object f59295F;

                /* JADX INFO: renamed from: G */
                Object f59296G;

                /* JADX INFO: renamed from: H */
                int f59297H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59298w;

                /* JADX INFO: renamed from: x */
                int f59299x;

                /* JADX INFO: renamed from: y */
                Object f59300y;

                public C41640a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59298w = obj;
                    this.f59299x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15734c c15734c) {
                this.f59292w = interfaceC13062m;
                this.f59293x = c15734c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41640a c41640a;
                if (interfaceC30057d instanceof C41640a) {
                    c41640a = (C41640a) interfaceC30057d;
                    int i13 = c41640a.f59299x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41640a.f59299x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41640a = new C41640a(interfaceC30057d);
                    }
                } else {
                    c41640a = new C41640a(interfaceC30057d);
                }
                Object obj2 = c41640a.f59298w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41640a.f59299x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59292w;
                    InterfaceC15735d interfaceC15735dM44349h = this.f59293x.reducer.m44349h((C11982b) obj);
                    c41640a.f59300y = null;
                    c41640a.f59294E = null;
                    c41640a.f59295F = null;
                    c41640a.f59296G = null;
                    c41640a.f59297H = 0;
                    c41640a.f59299x = 1;
                    if (interfaceC13062m.emit(interfaceC15735dM44349h, c41640a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C15734c c15734c) {
            this.f59290w = interfaceC13058l;
            this.f59291x = c15734c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59290w.collect(new a(interfaceC13062m, this.f59291x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ge1.c$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59302w;

        /* JADX INFO: renamed from: ge1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59303w;

            /* JADX INFO: renamed from: ge1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.editactivities.presentation.EditActivitiesDrawerViewModel$special$$inlined$map$3$2", m100430f = "EditActivitiesDrawerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41641a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59304E;

                /* JADX INFO: renamed from: F */
                Object f59305F;

                /* JADX INFO: renamed from: G */
                Object f59306G;

                /* JADX INFO: renamed from: H */
                int f59307H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59308w;

                /* JADX INFO: renamed from: x */
                int f59309x;

                /* JADX INFO: renamed from: y */
                Object f59310y;

                public C41641a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59308w = obj;
                    this.f59309x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f59303w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41641a c41641a;
                if (interfaceC30057d instanceof C41641a) {
                    c41641a = (C41641a) interfaceC30057d;
                    int i13 = c41641a.f59309x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41641a.f59309x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41641a = new C41641a(interfaceC30057d);
                    }
                } else {
                    c41641a = new C41641a(interfaceC30057d);
                }
                Object obj2 = c41641a.f59308w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41641a.f59309x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59303w;
                    Boolean bool = Boolean.TRUE;
                    c41641a.f59310y = null;
                    c41641a.f59304E = null;
                    c41641a.f59305F = null;
                    c41641a.f59306G = null;
                    c41641a.f59307H = 0;
                    c41641a.f59309x = 1;
                    if (interfaceC13062m.emit(bool, c41641a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f59302w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59302w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15734c(C11983c interactor, C15732a reducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interact(new c(c13096w1M36592b, this)), scope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new d(c13078q1M36586L, this);
        this.dismissEvents = new e(new b(c13078q1M36586L));
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC11981a m44356o(InterfaceC15733b viewEvent) {
        if (viewEvent instanceof InterfaceC15733b.e) {
            return new InterfaceC11981a.d(((InterfaceC15733b.e) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (viewEvent instanceof InterfaceC15733b.g) {
            InterfaceC15733b.g gVar = (InterfaceC15733b.g) viewEvent;
            return new InterfaceC11981a.g(gVar.getActivityV2Id(), gVar.getIsSelected());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC15733b.c.f59252a)) {
            return InterfaceC11981a.f.f39358a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC15733b.b.f59251a)) {
            return InterfaceC11981a.b.f39354a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC15733b.a.f59250a)) {
            return InterfaceC11981a.a.f39353a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC15733b.f.f59255a)) {
            return InterfaceC11981a.e.f39357a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC15733b.d.f59253a)) {
            return InterfaceC11981a.c.f39355a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getDismissEvents() {
        return this.dismissEvents;
    }

    /* JADX INFO: renamed from: p */
    public final void m44358p(InterfaceC15733b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C15734c(C11983c c11983c, C15732a c15732a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11983c, c15732a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
