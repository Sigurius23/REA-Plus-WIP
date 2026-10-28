package ji2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ei2.C13223c;
import ei2.InterfaceC13222b;
import gi2.AbstractC15896b;
import gi2.AbstractC15898d;
import gi2.C15897c;
import ii2.C18574c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ki2.C22505a;
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

/* JADX INFO: renamed from: ji2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e*\b\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u00101¨\u00066"}, m65681d2 = {"Lji2/j;", "Landroidx/lifecycle/w1;", "Lgi2/c;", "interactor", "Lki2/a;", "viewStateReducer", "Lii2/c;", "navigationReducer", "Lei2/c;", "analyticsHelper", "Lbc3/c0;", "scope", "<init>", "(Lgi2/c;Lki2/a;Lii2/c;Lei2/c;Lbc3/c0;)V", "Lec3/l;", "Lgi2/b;", "Lgi2/d;", "n", "(Lec3/l;Lgi2/c;)Lec3/l;", "Lii2/b;", "p", "(Lec3/l;)Lec3/l;", "domainAction", "Ll83/a0;", "o", "(Lgi2/b;)V", "Lji2/i;", "viewEvent", "Lbc3/k1;", "q", "(Lji2/i;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lii2/c;", "x", "Lei2/c;", "y", "Lbc3/c0;", "getScope", "()Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lji2/l;", "F", "getViewState", "()Lec3/l;", "viewState", "G", "l", "navigationEvent", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21731j extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvent;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C18574c navigationReducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C13223c analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ji2.j$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.presentation.StravaViewModel$domainState$1", m100430f = "StravaViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lgi2/b;", "it", "Ll83/a0;", "<anonymous>", "(Lgi2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83541w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83542x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C21731j.this.new a(interfaceC30057d);
            aVar.f83542x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC15896b abstractC15896b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(abstractC15896b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC15896b abstractC15896b = (AbstractC15896b) this.f83542x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83541w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C21731j.this.m61288o(abstractC15896b);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ji2.j$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.presentation.StravaViewModel$sendEvent$1", m100430f = "StravaViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83544w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21730i f83546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC21730i interfaceC21730i, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83546y = interfaceC21730i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21731j.this.new b(this.f83546y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21731j.this.eventFlow;
                AbstractC15896b abstractC15896bM61293a = AbstractC21732k.m61293a(this.f83546y);
                this.f83544w = 1;
                if (interfaceC13072o1.emit(abstractC15896bM61293a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ji2.j$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83547w;

        /* JADX INFO: renamed from: ji2.j$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83548w;

            /* JADX INFO: renamed from: ji2.j$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.strava.presentation.StravaViewModel$special$$inlined$filter$1$2", m100430f = "StravaViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41848a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f83550F;

                /* JADX INFO: renamed from: G */
                Object f83551G;

                /* JADX INFO: renamed from: H */
                int f83552H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83553w;

                /* JADX INFO: renamed from: x */
                int f83554x;

                /* JADX INFO: renamed from: y */
                Object f83555y;

                /* JADX INFO: renamed from: z */
                Object f83556z;

                public C41848a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83553w = obj;
                    this.f83554x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f83548w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41848a c41848a;
                if (interfaceC30057d instanceof C41848a) {
                    c41848a = (C41848a) interfaceC30057d;
                    int i13 = c41848a.f83554x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41848a.f83554x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41848a = new C41848a(interfaceC30057d);
                    }
                } else {
                    c41848a = new C41848a(interfaceC30057d);
                }
                Object obj2 = c41848a.f83553w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41848a.f83554x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83548w;
                    AbstractC15898d abstractC15898d = (AbstractC15898d) obj;
                    if ((abstractC15898d instanceof AbstractC15898d.h) || (abstractC15898d instanceof AbstractC15898d.f) || (abstractC15898d instanceof AbstractC15898d.d)) {
                        c41848a.f83555y = null;
                        c41848a.f83556z = null;
                        c41848a.f83550F = null;
                        c41848a.f83551G = null;
                        c41848a.f83552H = 0;
                        c41848a.f83554x = 1;
                        if (interfaceC13062m.emit(obj, c41848a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f83547w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83547w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ji2.j$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83557w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22505a f83558x;

        /* JADX INFO: renamed from: ji2.j$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83559w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22505a f83560x;

            /* JADX INFO: renamed from: ji2.j$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.strava.presentation.StravaViewModel$special$$inlined$map$1$2", m100430f = "StravaViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41849a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83561E;

                /* JADX INFO: renamed from: F */
                Object f83562F;

                /* JADX INFO: renamed from: G */
                Object f83563G;

                /* JADX INFO: renamed from: H */
                int f83564H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83565w;

                /* JADX INFO: renamed from: x */
                int f83566x;

                /* JADX INFO: renamed from: y */
                Object f83567y;

                public C41849a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83565w = obj;
                    this.f83566x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22505a c22505a) {
                this.f83559w = interfaceC13062m;
                this.f83560x = c22505a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41849a c41849a;
                if (interfaceC30057d instanceof C41849a) {
                    c41849a = (C41849a) interfaceC30057d;
                    int i13 = c41849a.f83566x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41849a.f83566x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41849a = new C41849a(interfaceC30057d);
                    }
                } else {
                    c41849a = new C41849a(interfaceC30057d);
                }
                Object obj2 = c41849a.f83565w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41849a.f83566x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83559w;
                    C21733l c21733lM65008a = this.f83560x.m65008a((AbstractC15898d) obj);
                    c41849a.f83567y = null;
                    c41849a.f83561E = null;
                    c41849a.f83562F = null;
                    c41849a.f83563G = null;
                    c41849a.f83564H = 0;
                    c41849a.f83566x = 1;
                    if (interfaceC13062m.emit(c21733lM65008a, c41849a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22505a c22505a) {
            this.f83557w = interfaceC13058l;
            this.f83558x = c22505a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83557w.collect(new a(interfaceC13062m, this.f83558x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21731j(C15897c interactor, C22505a viewStateReducer, C18574c navigationReducer, C13223c analyticsHelper, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(scope, "scope");
        this.navigationReducer = navigationReducer;
        this.analyticsHelper = analyticsHelper;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM61287n = m61287n(new C13052j1(c13096w1M36592b, new a(null), 0), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM61287n, scope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new d(c13078q1M36586L, viewStateReducer), scope, c13021b2, 0);
        this.navigationEvent = AbstractC13091v.m36586L(m61289p(new c(c13078q1M36586L)), scope, c13021b2, 0);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m61287n(InterfaceC13058l interfaceC13058l, C15897c c15897c) {
        return c15897c.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m61288o(AbstractC15896b domainAction) {
        if (domainAction instanceof AbstractC15896b.f) {
            this.analyticsHelper.m37122b(InterfaceC13222b.e.f45807a);
        } else if (domainAction instanceof AbstractC15896b.d) {
            this.analyticsHelper.m37122b(InterfaceC13222b.b.f45804a);
        } else if (domainAction instanceof AbstractC15896b.c) {
            this.analyticsHelper.m37122b(InterfaceC13222b.c.f45805a);
        }
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m61289p(InterfaceC13058l interfaceC13058l) {
        return this.navigationReducer.m53796a(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m61291q(InterfaceC21730i viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C21731j(C15897c c15897c, C22505a c22505a, C18574c c18574c, C13223c c13223c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15897c, c22505a, c18574c, c13223c, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
