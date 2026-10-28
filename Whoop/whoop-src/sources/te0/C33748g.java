package te0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.DownloadAction;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import re0.AbstractC31311a;
import re0.AbstractC31312b;
import re0.C31313c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se0.AbstractC32419a;
import ue0.C34857a;
import vw2.AbstractC36547b;
import vw2.InterfaceC36546a;

/* JADX INFO: renamed from: te0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001IB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f*\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\f*\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010,R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u0002030\f8\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010C¨\u0006J"}, m65681d2 = {"Lte0/g;", "Landroidx/lifecycle/w1;", "Lre0/c;", "interactor", "Lue0/a;", "reducer", "Lqw2/c;", "actionInteractor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lre0/c;Lue0/a;Lqw2/c;Lbc3/c0;)V", "Lec3/l;", "Lqw2/a;", "Lqw2/b;", "o", "(Lec3/l;)Lec3/l;", "Lte0/f;", "Lre0/a;", "t", "(Lte0/f;)Lre0/a;", "Lre0/b;", "Lte0/h;", "p", "(Lec3/l;Lue0/a;)Lec3/l;", "interact", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Lte0/f;)V", "Lvw2/a;", "actionViewEvent", "q", "(Lvw2/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lre0/c;", "x", "Lue0/a;", "y", "Lqw2/c;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/p1;", "Lte0/e;", "F", "Lec3/p1;", "dialogState", "Lse0/a;", "G", "navigationEventFlow", "H", "Lec3/l;", "domainState", "I", "actionFlow", "Lec3/t1;", "J", "Lec3/t1;", "actionStateFlow", "K", "baseViewState", "L", "getViewState", "()Lec3/l;", "viewState", "M", "n", "navigationEvents", "N", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33748g extends AbstractC1637w1 {

    /* JADX INFO: renamed from: N */
    private static final a f141156N = new a(null);

    /* JADX INFO: renamed from: O */
    public static final int f141157O = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 dialogState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 navigationEventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13087t1 actionStateFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13058l baseViewState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C31313c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C34857a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: te0.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lte0/g$a;", "", "<init>", "()V", "", "DELETE_METHOD", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: te0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$sendAction$1", m100430f = "TestResultsViewModel.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C33748g f141171E;

        /* JADX INFO: renamed from: w */
        Object f141172w;

        /* JADX INFO: renamed from: x */
        int f141173x;

        /* JADX INFO: renamed from: y */
        int f141174y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36546a f141175z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC36546a interfaceC36546a, C33748g c33748g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141175z = interfaceC36546a;
            this.f141171E = c33748g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f141175z, this.f141171E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141174y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30693a interfaceC30693aM117178a = AbstractC36547b.m117178a(this.f141175z);
                if (interfaceC30693aM117178a != null) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f141171E.actionFlow;
                    this.f141172w = null;
                    this.f141173x = 0;
                    this.f141174y = 1;
                    if (interfaceC13072o1.emit(interfaceC30693aM117178a, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: te0.g$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$sendViewEvent$1", m100430f = "TestResultsViewModel.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141176w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33747f f141178y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC33747f abstractC33747f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141178y = abstractC33747f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33748g.this.new c(this.f141178y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141176w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33748g.this.eventFlow;
                AbstractC33747f abstractC33747f = this.f141178y;
                this.f141176w = 1;
                if (interfaceC13072o1.emit(abstractC33747f, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: te0.g$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141179w;

        /* JADX INFO: renamed from: te0.g$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141180w;

            /* JADX INFO: renamed from: te0.g$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "TestResultsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42380a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f141182F;

                /* JADX INFO: renamed from: G */
                Object f141183G;

                /* JADX INFO: renamed from: H */
                int f141184H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141185w;

                /* JADX INFO: renamed from: x */
                int f141186x;

                /* JADX INFO: renamed from: y */
                Object f141187y;

                /* JADX INFO: renamed from: z */
                Object f141188z;

                public C42380a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141185w = obj;
                    this.f141186x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f141180w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42380a c42380a;
                if (interfaceC30057d instanceof C42380a) {
                    c42380a = (C42380a) interfaceC30057d;
                    int i13 = c42380a.f141186x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42380a.f141186x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42380a = new C42380a(interfaceC30057d);
                    }
                } else {
                    c42380a = new C42380a(interfaceC30057d);
                }
                Object obj2 = c42380a.f141185w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42380a.f141186x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141180w;
                    if (obj instanceof AbstractC30694b.d) {
                        c42380a.f141187y = null;
                        c42380a.f141188z = null;
                        c42380a.f141182F = null;
                        c42380a.f141183G = null;
                        c42380a.f141184H = 0;
                        c42380a.f141186x = 1;
                        if (interfaceC13062m.emit(obj, c42380a) == enumC31071a) {
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
            this.f141179w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141179w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: te0.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141189w;

        /* JADX INFO: renamed from: te0.g$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141190w;

            /* JADX INFO: renamed from: te0.g$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$special$$inlined$map$1$2", m100430f = "TestResultsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42381a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141191E;

                /* JADX INFO: renamed from: F */
                Object f141192F;

                /* JADX INFO: renamed from: G */
                Object f141193G;

                /* JADX INFO: renamed from: H */
                int f141194H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141195w;

                /* JADX INFO: renamed from: x */
                int f141196x;

                /* JADX INFO: renamed from: y */
                Object f141197y;

                public C42381a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141195w = obj;
                    this.f141196x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f141190w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42381a c42381a;
                if (interfaceC30057d instanceof C42381a) {
                    c42381a = (C42381a) interfaceC30057d;
                    int i13 = c42381a.f141196x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42381a.f141196x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42381a = new C42381a(interfaceC30057d);
                    }
                } else {
                    c42381a = new C42381a(interfaceC30057d);
                }
                Object obj2 = c42381a.f141195w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42381a.f141196x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141190w;
                    AbstractC32419a.c cVar = new AbstractC32419a.c(((AbstractC30694b.d) obj).getDestination());
                    c42381a.f141197y = null;
                    c42381a.f141191E = null;
                    c42381a.f141192F = null;
                    c42381a.f141193G = null;
                    c42381a.f141194H = 0;
                    c42381a.f141196x = 1;
                    if (interfaceC13062m.emit(cVar, c42381a) == enumC31071a) {
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
            this.f141189w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141189w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: te0.g$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141199w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33748g f141200x;

        /* JADX INFO: renamed from: te0.g$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141201w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33748g f141202x;

            /* JADX INFO: renamed from: te0.g$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "TestResultsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42382a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141203E;

                /* JADX INFO: renamed from: F */
                Object f141204F;

                /* JADX INFO: renamed from: G */
                Object f141205G;

                /* JADX INFO: renamed from: H */
                Object f141206H;

                /* JADX INFO: renamed from: I */
                int f141207I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141208w;

                /* JADX INFO: renamed from: x */
                int f141209x;

                /* JADX INFO: renamed from: y */
                Object f141210y;

                public C42382a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141208w = obj;
                    this.f141209x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33748g c33748g) {
                this.f141201w = interfaceC13062m;
                this.f141202x = c33748g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42382a c42382a;
                if (interfaceC30057d instanceof C42382a) {
                    c42382a = (C42382a) interfaceC30057d;
                    int i13 = c42382a.f141209x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42382a.f141209x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42382a = new C42382a(interfaceC30057d);
                    }
                } else {
                    c42382a = new C42382a(interfaceC30057d);
                }
                Object obj2 = c42382a.f141208w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42382a.f141209x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141201w;
                    AbstractC31311a abstractC31311aM106685t = this.f141202x.m106685t((AbstractC33747f) obj);
                    if (abstractC31311aM106685t != null) {
                        c42382a.f141210y = null;
                        c42382a.f141203E = null;
                        c42382a.f141204F = null;
                        c42382a.f141205G = null;
                        c42382a.f141206H = null;
                        c42382a.f141207I = 0;
                        c42382a.f141209x = 1;
                        if (interfaceC13062m.emit(abstractC31311aM106685t, c42382a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C33748g c33748g) {
            this.f141199w = interfaceC13058l;
            this.f141200x = c33748g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141199w.collect(new a(interfaceC13062m, this.f141200x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: te0.g$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141212w;

        /* JADX INFO: renamed from: te0.g$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141213w;

            /* JADX INFO: renamed from: te0.g$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$special$$inlined$mapNotNull$2$2", m100430f = "TestResultsViewModel.kt", m100431l = {64}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42383a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141214E;

                /* JADX INFO: renamed from: F */
                Object f141215F;

                /* JADX INFO: renamed from: G */
                Object f141216G;

                /* JADX INFO: renamed from: H */
                Object f141217H;

                /* JADX INFO: renamed from: I */
                int f141218I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141219w;

                /* JADX INFO: renamed from: x */
                int f141220x;

                /* JADX INFO: renamed from: y */
                Object f141221y;

                public C42383a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141219w = obj;
                    this.f141220x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f141213w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42383a c42383a;
                Object fVar;
                if (interfaceC30057d instanceof C42383a) {
                    c42383a = (C42383a) interfaceC30057d;
                    int i13 = c42383a.f141220x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42383a.f141220x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42383a = new C42383a(interfaceC30057d);
                    }
                } else {
                    c42383a = new C42383a(interfaceC30057d);
                }
                Object obj2 = c42383a.f141219w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42383a.f141220x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141213w;
                    AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                    Action action = abstractC30694b.getAction();
                    boolean z4 = action instanceof UpdateAction;
                    boolean z13 = z4 && AbstractC22676k.m65745e(((UpdateAction) action).getRequest().getMethod(), "DELETE");
                    if ((abstractC30694b instanceof AbstractC30694b.a) && (z4 || (action instanceof DownloadAction))) {
                        fVar = new AbstractC31312b.f(action);
                    } else if ((abstractC30694b instanceof AbstractC30694b.i) && z13) {
                        fVar = AbstractC31312b.b.f128865a;
                    } else if ((abstractC30694b instanceof AbstractC30694b.f) && z13) {
                        fVar = AbstractC31312b.a.f128864a;
                    } else {
                        fVar = ((abstractC30694b instanceof AbstractC30694b.c) && (action instanceof DownloadAction)) ? AbstractC31312b.d.f128867a : null;
                    }
                    if (fVar != null) {
                        c42383a.f141221y = null;
                        c42383a.f141214E = null;
                        c42383a.f141215F = null;
                        c42383a.f141216G = null;
                        c42383a.f141217H = null;
                        c42383a.f141218I = 0;
                        c42383a.f141220x = 1;
                        if (interfaceC13062m.emit(fVar, c42383a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f141212w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141212w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: te0.g$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.TestResultsViewModel$viewState$1", m100430f = "TestResultsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lte0/h;", "base", "Lte0/e;", "dialog", "<anonymous>", "(Lte0/h;Lte0/e;)Lte0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141223w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f141224x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141225y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC33749h abstractC33749h, C33746e c33746e, InterfaceC30057d<? super AbstractC33749h> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f141224x = abstractC33749h;
            hVar.f141225y = c33746e;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC33749h abstractC33749h = (AbstractC33749h) this.f141224x;
            C33746e c33746e = (C33746e) this.f141225y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f141223w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return abstractC33749h instanceof AbstractC33749h.e ? AbstractC33749h.e.m106690c((AbstractC33749h.e) abstractC33749h, null, null, null, null, null, null, c33746e, 63, null) : abstractC33749h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33748g(C31313c interactor, C34857a reducer, C30695c actionInteractor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.actionInteractor = actionInteractor;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.dialogState = c13045h2M36593c;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.navigationEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lInteract = interact(new f(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        C13096w1 c13096w1M36592b3 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b3;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(m106683o(c13096w1M36592b3), coroutineScope, C13105z1.f45289b, 0);
        this.actionStateFlow = c13078q1M36586L2;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(m106684p(AbstractC13091v.m36584J(c13078q1M36586L, new g(c13078q1M36586L2)), reducer), coroutineScope, c13021b2, 1);
        this.baseViewState = c13078q1M36586L3;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(c13078q1M36586L3, c13045h2M36593c, new h(null), 1), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36584J(new e(new d(c13078q1M36586L2)), c13096w1M36592b2);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m106683o(InterfaceC13058l interfaceC13058l) {
        return this.actionInteractor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m106684p(InterfaceC13058l interfaceC13058l, C34857a c34857a) {
        return c34857a.m109939b(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC31311a m106685t(AbstractC33747f abstractC33747f) {
        if (abstractC33747f instanceof AbstractC33747f.b) {
            return new AbstractC31311a.a(((AbstractC33747f.b) abstractC33747f).getId());
        }
        if (abstractC33747f instanceof AbstractC33747f.c) {
            ((C13045h2) this.dialogState).m36570j(((AbstractC33747f.c) abstractC33747f).getDialog());
            return null;
        }
        if (!(abstractC33747f instanceof AbstractC33747f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((C13045h2) this.dialogState).m36570j(null);
        return null;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: q */
    public final void m106687q(InterfaceC36546a actionViewEvent) {
        AbstractC22676k.m65750j(actionViewEvent, "actionViewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(actionViewEvent, this, null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m106688r(AbstractC33747f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(event, null), 3);
    }

    public /* synthetic */ C33748g(C31313c c31313c, C34857a c34857a, C30695c c30695c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31313c, c34857a, c30695c, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
