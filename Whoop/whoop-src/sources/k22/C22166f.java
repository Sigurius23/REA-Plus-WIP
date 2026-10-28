package k22;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j22.C21258g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l22.C23240a;
import l83.C23454a0;
import m32.EnumC25009e;
import m83.AbstractC25265s;
import m83.C25271y;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qt0.C30586b;
import qt0.InterfaceC30585a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: k22.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002090\u00108\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010<R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u0010<¨\u0006A"}, m65681d2 = {"Lk22/f;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Ll22/a;", "viewStateReducer", "Lk22/c;", "pairingDomainInteractor", "Lj22/g;", "pairingNavigationReducer", "Lqt0/a;", "bleScanner", "<init>", "(Lbc3/c0;Ltr2/n;Ll22/a;Lk22/c;Lj22/g;Lqt0/a;)V", "Lec3/l;", "Lk22/b;", "Lj22/f;", "p", "(Lec3/l;)Lec3/l;", "Ll83/a0;", "r", "()V", "u", "Lm32/e;", "result", "q", "(Lm32/e;)V", "Lk22/e;", NotificationCompat.CATEGORY_EVENT, "t", "(Lk22/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Ltr2/n;", "y", "Ll22/a;", "z", "Lj22/g;", "E", "Lqt0/a;", "Lec3/o1;", "Lk22/a;", "F", "Lec3/o1;", "eventFlow", "Lec3/p1;", "", "Lqt0/b;", "G", "Lec3/p1;", "scanFlow", "H", "Lec3/l;", "domainState", "Lk22/d;", "I", "getViewState", "()Lec3/l;", "viewState", "J", "o", "navigationState", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22166f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC30585a bleScanner;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13075p1 scanFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l navigationState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C23240a viewStateReducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C21258g pairingNavigationReducer;

    /* JADX INFO: renamed from: k22.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.presentation.PairingViewModel$domainState$1", m100430f = "PairingViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lk22/a;", "action", "", "Lqt0/b;", "devices", "Lk22/b;", "<anonymous>", "(Lk22/a;Ljava/util/List;)Lk22/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f85953w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f85954x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f85955y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22163c f85956z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22163c c22163c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f85956z = c22163c;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC22161a abstractC22161a, List<C30586b> list, InterfaceC30057d<? super AbstractC22162b> interfaceC30057d) {
            a aVar = new a(this.f85956z, interfaceC30057d);
            aVar.f85954x = abstractC22161a;
            aVar.f85955y = list;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC22161a abstractC22161a = (AbstractC22161a) this.f85954x;
            List<C30586b> list = (List) this.f85955y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85953w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return this.f85956z.m63440a(abstractC22161a, list);
        }
    }

    /* JADX INFO: renamed from: k22.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.presentation.PairingViewModel$onPermissionResult$1", m100430f = "PairingViewModel.kt", m100431l = {105, 108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85957w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC25009e f85958x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22166f f85959y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC25009e enumC25009e, C22166f c22166f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85958x = enumC25009e;
            this.f85959y = c22166f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f85958x, this.f85959y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f85957w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L54
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                m32.e r5 = r4.f85958x
                boolean r5 = r5.werePermissionsGranted()
                if (r5 == 0) goto L35
                k22.f r5 = r4.f85959y
                ec3.o1 r5 = k22.C22166f.m63448g(r5)
                k22.a$c r1 = k22.AbstractC22161a.c.f85925a
                r4.f85957w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L54
                goto L53
            L35:
                k22.f r5 = r4.f85959y
                tr2.n r5 = k22.C22166f.m63449j(r5)
                r1 = 0
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                java.lang.String r3 = "Ble scan permission result denied"
                r5.mo85228t(r3, r1)
                k22.f r5 = r4.f85959y
                ec3.o1 r5 = k22.C22166f.m63448g(r5)
                k22.a$a r1 = k22.AbstractC22161a.a.f85923a
                r4.f85957w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k22.C22166f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: k22.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.presentation.PairingViewModel$restartScan$1", m100430f = "PairingViewModel.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85960w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22166f.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f85960w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C22166f.this.scanFlow;
                this.f85960w = 1;
                ((C13045h2) interfaceC13075p1).emit(C25271y.f99162w, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: k22.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85962w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22166f f85963x;

        /* JADX INFO: renamed from: k22.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85964w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22166f f85965x;

            /* JADX INFO: renamed from: k22.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.presentation.PairingViewModel$special$$inlined$map$1$2", m100430f = "PairingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41872a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85966E;

                /* JADX INFO: renamed from: F */
                Object f85967F;

                /* JADX INFO: renamed from: G */
                Object f85968G;

                /* JADX INFO: renamed from: H */
                int f85969H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85970w;

                /* JADX INFO: renamed from: x */
                int f85971x;

                /* JADX INFO: renamed from: y */
                Object f85972y;

                public C41872a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85970w = obj;
                    this.f85971x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22166f c22166f) {
                this.f85964w = interfaceC13062m;
                this.f85965x = c22166f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41872a c41872a;
                if (interfaceC30057d instanceof C41872a) {
                    c41872a = (C41872a) interfaceC30057d;
                    int i13 = c41872a.f85971x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41872a.f85971x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41872a = new C41872a(interfaceC30057d);
                    }
                } else {
                    c41872a = new C41872a(interfaceC30057d);
                }
                Object obj2 = c41872a.f85970w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41872a.f85971x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85964w;
                    C22164d c22164dM67288a = this.f85965x.viewStateReducer.m67288a((AbstractC22162b) obj);
                    c41872a.f85972y = null;
                    c41872a.f85966E = null;
                    c41872a.f85967F = null;
                    c41872a.f85968G = null;
                    c41872a.f85969H = 0;
                    c41872a.f85971x = 1;
                    if (interfaceC13062m.emit(c22164dM67288a, c41872a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22166f c22166f) {
            this.f85962w = interfaceC13058l;
            this.f85963x = c22166f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85962w.collect(new a(interfaceC13062m, this.f85963x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k22.f$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.presentation.PairingViewModel$startScan$1", m100430f = "PairingViewModel.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lqt0/b;", "device", "Ll83/a0;", "<anonymous>", "(Lqt0/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85974w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f85975x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C22166f.this.new e(interfaceC30057d);
            eVar.f85975x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C30586b c30586b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c30586b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            C30586b c30586b = (C30586b) this.f85975x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f85974w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            Iterator it = ((Iterable) ((C13045h2) C22166f.this.scanFlow).getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C30586b) next).getAddress(), c30586b.getAddress()));
            if (next == null) {
                InterfaceC13075p1 interfaceC13075p1 = C22166f.this.scanFlow;
                ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(c30586b, (Collection) ((C13045h2) C22166f.this.scanFlow).getValue());
                this.f85975x = null;
                this.f85974w = 1;
                ((C13045h2) interfaceC13075p1).emit(arrayListM74128f1, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22166f(InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, C23240a viewStateReducer, C22163c pairingDomainInteractor, C21258g pairingNavigationReducer, InterfaceC30585a bleScanner) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(pairingDomainInteractor, "pairingDomainInteractor");
        AbstractC22676k.m65750j(pairingNavigationReducer, "pairingNavigationReducer");
        AbstractC22676k.m65750j(bleScanner, "bleScanner");
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.viewStateReducer = viewStateReducer;
        this.pairingNavigationReducer = pairingNavigationReducer;
        this.bleScanner = bleScanner;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this.scanFlow = c13045h2M36593c;
        C13060l1 c13060l1 = new C13060l1(c13096w1M36592b, c13045h2M36593c, new a(pairingDomainInteractor, null), 1);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c13060l1, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new d(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationState = m63452p(c13078q1M36586L);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m63452p(InterfaceC13058l interfaceC13058l) {
        return this.pairingNavigationReducer.m59660a(interfaceC13058l);
    }

    /* JADX INFO: renamed from: q */
    private final void m63453q(EnumC25009e result) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(result, this, null), 3);
    }

    /* JADX INFO: renamed from: r */
    private final void m63454r() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: u */
    private final void m63455u() {
        AbstractC13091v.m36582H(new C13052j1(this.bleScanner.getStartScan(), new e(null), 0), this.coroutineScope);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13058l getNavigationState() {
        return this.navigationState;
    }

    /* JADX INFO: renamed from: t */
    public final void m63457t(InterfaceC22165e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC22165e.g) {
            this.eventFlow.mo36564a(AbstractC22161a.b.f85924a);
            return;
        }
        if ((event instanceof InterfaceC22165e.c) || (event instanceof InterfaceC22165e.b)) {
            return;
        }
        if (event instanceof InterfaceC22165e.a) {
            if (((InterfaceC22165e.a) event).getTriggerRescan()) {
                m63454r();
            }
        } else if (event instanceof InterfaceC22165e.f) {
            m63455u();
        } else if (event instanceof InterfaceC22165e.d) {
            m63454r();
        } else {
            if (!(event instanceof InterfaceC22165e.e)) {
                throw new NoWhenBranchMatchedException();
            }
            m63453q(((InterfaceC22165e.e) event).getResult());
        }
    }

    public /* synthetic */ C22166f(InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, C23240a c23240a, C22163c c22163c, C21258g c21258g, InterfaceC30585a interfaceC30585a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC34116n, c23240a, c22163c, c21258g, interfaceC30585a);
    }
}
