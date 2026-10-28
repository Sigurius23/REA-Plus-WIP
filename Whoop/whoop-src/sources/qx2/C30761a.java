package qx2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bm.C3383g;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lx2.AbstractC24796a;
import mx2.AbstractC26016c;
import mx2.AbstractC26017d;
import mx2.AbstractC26019f;
import mx2.C26021h;
import nx2.C27227a;
import nz2.AbstractC27308b;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import px2.InterfaceC29602e;
import px2.InterfaceC29603f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qv1.C30654e;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qx2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, m65681d2 = {"Lqx2/a;", "Landroidx/lifecycle/w1;", "Lmx2/h;", "interactor", "Lnx2/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lmx2/h;Lnx2/a;Lbc3/c0;)V", "Llx2/a;", "Lmx2/c;", "t", "(Llx2/a;)Lmx2/c;", "Lec3/l;", "Lmx2/f;", "reducer", "Lpx2/f;", "q", "(Lec3/l;Lnx2/a;)Lec3/l;", "Lmx2/h$a;", "o", "(Lec3/l;Lmx2/h;)Lec3/l;", "viewEvent", "Lbc3/k1;", "r", "(Llx2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Ltr2/n;", "x", "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/t1;", "z", "Lec3/t1;", "accumulator", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "Lmx2/d;", "F", "Lec3/l;", "n", "()Lec3/l;", "effects", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30761a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l effects;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 accumulator;

    /* JADX INFO: renamed from: qx2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$effects$3", m100430f = "CampaignDetailsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lmx2/d;", "it", "Lec3/l;", "<anonymous>", "(Ljava/util/List;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126640w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126641x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f126641x = obj;
            return aVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f126641x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126640w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C3383g(list, 1);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(List<? extends AbstractC26017d> list, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a) create(list, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qx2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$sendViewEvent$1", m100430f = "CampaignDetailsViewModel.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126642w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC24796a f126644y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC24796a abstractC24796a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126644y = abstractC24796a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30761a.this.new b(this.f126644y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126642w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30761a.this.eventFlow;
                AbstractC24796a abstractC24796a = this.f126644y;
                this.f126642w = 1;
                if (interfaceC13072o1.emit(abstractC24796a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qx2.a$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126645w;

        /* JADX INFO: renamed from: qx2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126646w;

            /* JADX INFO: renamed from: qx2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$special$$inlined$filter$1$2", m100430f = "CampaignDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42247a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f126648F;

                /* JADX INFO: renamed from: G */
                Object f126649G;

                /* JADX INFO: renamed from: H */
                int f126650H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126651w;

                /* JADX INFO: renamed from: x */
                int f126652x;

                /* JADX INFO: renamed from: y */
                Object f126653y;

                /* JADX INFO: renamed from: z */
                Object f126654z;

                public C42247a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126651w = obj;
                    this.f126652x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f126646w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42247a c42247a;
                if (interfaceC30057d instanceof C42247a) {
                    c42247a = (C42247a) interfaceC30057d;
                    int i13 = c42247a.f126652x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42247a.f126652x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42247a = new C42247a(interfaceC30057d);
                    }
                } else {
                    c42247a = new C42247a(interfaceC30057d);
                }
                Object obj2 = c42247a.f126651w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42247a.f126652x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126646w;
                    if (!((List) obj).isEmpty()) {
                        c42247a.f126653y = null;
                        c42247a.f126654z = null;
                        c42247a.f126648F = null;
                        c42247a.f126649G = null;
                        c42247a.f126650H = 0;
                        c42247a.f126652x = 1;
                        if (interfaceC13062m.emit(obj, c42247a) == enumC31071a) {
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
            this.f126645w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126645w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qx2.a$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126655w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30761a f126656x;

        /* JADX INFO: renamed from: qx2.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126657w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30761a f126658x;

            /* JADX INFO: renamed from: qx2.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$special$$inlined$map$1$2", m100430f = "CampaignDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42248a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f126659E;

                /* JADX INFO: renamed from: F */
                Object f126660F;

                /* JADX INFO: renamed from: G */
                Object f126661G;

                /* JADX INFO: renamed from: H */
                int f126662H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126663w;

                /* JADX INFO: renamed from: x */
                int f126664x;

                /* JADX INFO: renamed from: y */
                Object f126665y;

                public C42248a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126663w = obj;
                    this.f126664x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30761a c30761a) {
                this.f126657w = interfaceC13062m;
                this.f126658x = c30761a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42248a c42248a;
                if (interfaceC30057d instanceof C42248a) {
                    c42248a = (C42248a) interfaceC30057d;
                    int i13 = c42248a.f126664x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42248a.f126664x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42248a = new C42248a(interfaceC30057d);
                    }
                } else {
                    c42248a = new C42248a(interfaceC30057d);
                }
                Object obj2 = c42248a.f126663w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42248a.f126664x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126657w;
                    AbstractC26016c abstractC26016cM94506t = this.f126658x.m94506t((AbstractC24796a) obj);
                    c42248a.f126665y = null;
                    c42248a.f126659E = null;
                    c42248a.f126660F = null;
                    c42248a.f126661G = null;
                    c42248a.f126662H = 0;
                    c42248a.f126664x = 1;
                    if (interfaceC13062m.emit(abstractC26016cM94506t, c42248a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C30761a c30761a) {
            this.f126655w = interfaceC13058l;
            this.f126656x = c30761a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126655w.collect(new a(interfaceC13062m, this.f126656x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qx2.a$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126667w;

        /* JADX INFO: renamed from: qx2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126668w;

            /* JADX INFO: renamed from: qx2.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$special$$inlined$map$2$2", m100430f = "CampaignDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42249a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f126669E;

                /* JADX INFO: renamed from: F */
                Object f126670F;

                /* JADX INFO: renamed from: G */
                Object f126671G;

                /* JADX INFO: renamed from: H */
                int f126672H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126673w;

                /* JADX INFO: renamed from: x */
                int f126674x;

                /* JADX INFO: renamed from: y */
                Object f126675y;

                public C42249a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126673w = obj;
                    this.f126674x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f126668w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42249a c42249a;
                if (interfaceC30057d instanceof C42249a) {
                    c42249a = (C42249a) interfaceC30057d;
                    int i13 = c42249a.f126674x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42249a.f126674x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42249a = new C42249a(interfaceC30057d);
                    }
                } else {
                    c42249a = new C42249a(interfaceC30057d);
                }
                Object obj2 = c42249a.f126673w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42249a.f126674x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126668w;
                    AbstractC26019f state = ((C26021h.a) obj).getState();
                    c42249a.f126675y = null;
                    c42249a.f126669E = null;
                    c42249a.f126670F = null;
                    c42249a.f126671G = null;
                    c42249a.f126672H = 0;
                    c42249a.f126674x = 1;
                    if (interfaceC13062m.emit(state, c42249a) == enumC31071a) {
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
            this.f126667w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126667w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qx2.a$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126677w;

        /* JADX INFO: renamed from: qx2.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126678w;

            /* JADX INFO: renamed from: qx2.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.viewmodel.CampaignDetailsViewModel$special$$inlined$map$3$2", m100430f = "CampaignDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42250a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f126679E;

                /* JADX INFO: renamed from: F */
                Object f126680F;

                /* JADX INFO: renamed from: G */
                Object f126681G;

                /* JADX INFO: renamed from: H */
                int f126682H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126683w;

                /* JADX INFO: renamed from: x */
                int f126684x;

                /* JADX INFO: renamed from: y */
                Object f126685y;

                public C42250a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126683w = obj;
                    this.f126684x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f126678w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42250a c42250a;
                if (interfaceC30057d instanceof C42250a) {
                    c42250a = (C42250a) interfaceC30057d;
                    int i13 = c42250a.f126684x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42250a.f126684x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42250a = new C42250a(interfaceC30057d);
                    }
                } else {
                    c42250a = new C42250a(interfaceC30057d);
                }
                Object obj2 = c42250a.f126683w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42250a.f126684x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126678w;
                    List<AbstractC26017d> listM77380e = ((C26021h.a) obj).m77380e();
                    c42250a.f126685y = null;
                    c42250a.f126679E = null;
                    c42250a.f126680F = null;
                    c42250a.f126681G = null;
                    c42250a.f126682H = 0;
                    c42250a.f126684x = 1;
                    if (interfaceC13062m.emit(listM77380e, c42250a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f126677w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126677w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30761a(C26021h interactor, C27227a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.log = AbstractC30060g.m92088H(new C30654e(2));
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM94503o = m94503o(new d(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM94503o, coroutineScope, c13021b2, 1);
        this.accumulator = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36587M(m94505q(AbstractC13091v.m36610t(new e(c13078q1M36586L)), viewStateReducer), coroutineScope, c13021b2, new InterfaceC29603f.b(InterfaceC29602e.b.f120878a));
        this.effects = AbstractC13091v.m36586L(AbstractC13091v.m36578D(new a(null), new c(new f(c13078q1M36586L))), coroutineScope, c13021b2, 0);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m94503o(InterfaceC13058l interfaceC13058l, C26021h c26021h) {
        return c26021h.m77375n(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC34116n m94504p() {
        return AbstractC27308b.m82458a("CampaignDetailsViewModel");
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC13058l m94505q(InterfaceC13058l interfaceC13058l, C27227a c27227a) {
        return c27227a.m82041a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC26016c m94506t(AbstractC24796a abstractC24796a) {
        if (abstractC24796a instanceof AbstractC24796a.g) {
            return new AbstractC26016c.f(((AbstractC24796a.g) abstractC24796a).getCampaignId());
        }
        if (abstractC24796a instanceof AbstractC24796a.c) {
            return new AbstractC26016c.e(((AbstractC24796a.c) abstractC24796a).getAction());
        }
        if (abstractC24796a instanceof AbstractC24796a.d) {
            return new AbstractC26016c.d(((AbstractC24796a.d) abstractC24796a).getAction());
        }
        if (!AbstractC22676k.m65745e(abstractC24796a, AbstractC24796a.e.f97048a) && !AbstractC22676k.m65745e(abstractC24796a, AbstractC24796a.f.f97049a)) {
            if (abstractC24796a instanceof AbstractC24796a.i) {
                return new AbstractC26016c.c(((AbstractC24796a.i) abstractC24796a).getReasonKey());
            }
            if (AbstractC22676k.m65745e(abstractC24796a, AbstractC24796a.b.f97045a)) {
                return AbstractC26016c.b.f102832a;
            }
            if (abstractC24796a instanceof AbstractC24796a.a) {
                return new AbstractC26016c.a(((AbstractC24796a.a) abstractC24796a).getText());
            }
            if (abstractC24796a instanceof AbstractC24796a.j) {
                AbstractC24796a.j jVar = (AbstractC24796a.j) abstractC24796a;
                return new AbstractC26016c.i(jVar.getAction(), jVar.getSelection(), jVar.getAdditionalText());
            }
            if (AbstractC22676k.m65745e(abstractC24796a, AbstractC24796a.h.f97051a)) {
                return AbstractC26016c.g.f102837a;
            }
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC26016c.h.f102838a;
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getEffects() {
        return this.effects;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3027k1 m94508r(AbstractC24796a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C30761a(C26021h c26021h, C27227a c27227a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26021h, c27227a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
