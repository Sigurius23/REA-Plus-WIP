package o92;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import j93.InterfaceC21461d;
import jk0.EnumC21747a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import m83.C25272z;
import m92.AbstractC25319b;
import m92.C25323f;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import wu0.C37638a;
import wu0.C37641d;
import wu0.InterfaceC37639b;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: o92.f0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0001 BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\u00020.8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, m65681d2 = {"Lo92/f0;", "Lm92/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lo92/s;", "pushContext", "Landroid/content/Context;", "context", "Lwu0/b;", "strapBodyStatusNotifier", "Lwu0/a;", "analyticsHelper", "Ljs0/c;", "configRepo", "Ltd1/b;", "whoopStrapProxy", "Lbc3/c0;", "backgroundScope", "<init>", "(Lo92/s;Landroid/content/Context;Lwu0/b;Lwu0/a;Ljs0/c;Ltd1/b;Lbc3/c0;)V", "Ljk0/a;", "strapBodyStatus", "Ll83/a0;", "D", "(Ljk0/a;)V", "B", "()V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "Lm92/f;", "dataMap", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Landroid/content/Context;", "J", "Lwu0/b;", "K", "Lwu0/a;", "L", "Ljs0/c;", "M", "Ltd1/b;", "N", "Lbc3/c0;", "", "O", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "", "C", "()J", "timeDelay", "P", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27702f0 extends AbstractC25319b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Q */
    public static final int f111570Q = 8;

    /* JADX INFO: renamed from: R */
    public static final C3853d f111571R;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC37639b strapBodyStatusNotifier;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C37638a analyticsHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC21909c configRepo;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.f0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lo92/f0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m83738a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C27702f0.f111571R.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o92.f0$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StrapOffBodyNotification$onCreate$1", m100430f = "StrapOffBodyNotification.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111579w;

        /* JADX INFO: renamed from: o92.f0$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StrapOffBodyNotification$onCreate$1$2", m100430f = "StrapOffBodyNotification.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ljk0/a;", "it", "Ll83/a0;", "<anonymous>", "(Ljk0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f111581w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f111582x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C27702f0 f111583y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C27702f0 c27702f0, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f111583y = c27702f0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f111583y, interfaceC30057d);
                aVar.f111582x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC21747a enumC21747a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(enumC21747a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC21747a enumC21747a = (EnumC21747a) this.f111582x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f111581w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f111583y.m83736D(enumC21747a);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: o92.f0$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42113b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f111584w;

            /* JADX INFO: renamed from: o92.f0$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f111585w;

                /* JADX INFO: renamed from: o92.f0$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StrapOffBodyNotification$onCreate$1$invokeSuspend$$inlined$filter$1$2", m100430f = "StrapOffBodyNotification.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42114a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f111587F;

                    /* JADX INFO: renamed from: G */
                    Object f111588G;

                    /* JADX INFO: renamed from: H */
                    int f111589H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f111590w;

                    /* JADX INFO: renamed from: x */
                    int f111591x;

                    /* JADX INFO: renamed from: y */
                    Object f111592y;

                    /* JADX INFO: renamed from: z */
                    Object f111593z;

                    public C42114a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f111590w = obj;
                        this.f111591x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f111585w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42114a c42114a;
                    if (interfaceC30057d instanceof C42114a) {
                        c42114a = (C42114a) interfaceC30057d;
                        int i13 = c42114a.f111591x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42114a.f111591x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42114a = new C42114a(interfaceC30057d);
                        }
                    } else {
                        c42114a = new C42114a(interfaceC30057d);
                    }
                    Object obj2 = c42114a.f111590w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42114a.f111591x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f111585w;
                        if (((EnumC21747a) obj) != EnumC21747a.UNKNOWN) {
                            c42114a.f111592y = null;
                            c42114a.f111593z = null;
                            c42114a.f111587F = null;
                            c42114a.f111588G = null;
                            c42114a.f111589H = 0;
                            c42114a.f111591x = 1;
                            if (interfaceC13062m.emit(obj, c42114a) == enumC31071a) {
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

            public C42113b(InterfaceC13058l interfaceC13058l) {
                this.f111584w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f111584w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27702f0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111579w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C42113b c42113b = new C42113b(InterfaceC37639b.m120962a(C27702f0.this.strapBodyStatusNotifier, false, 1, null));
                a aVar = new a(C27702f0.this, null);
                this.f111579w = 1;
                if (AbstractC13091v.m36604n(c42113b, aVar, this) == enumC31071a) {
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

    static {
        C3853d c3853dM11807f = AbstractC25319b.INSTANCE.m74357a("00500_StrapOffBody", AbstractC17312j.f66931I0).m11807f(AbstractC17312j.f67005n);
        AbstractC22676k.m65749i(c3853dM11807f, "setChannelDescriptionResId(...)");
        f111571R = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27702f0(C27721s pushContext, Context context, InterfaceC37639b strapBodyStatusNotifier, C37638a analyticsHelper, AbstractC21909c configRepo, InterfaceC33704b whoopStrapProxy, InterfaceC2994c0 backgroundScope) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(strapBodyStatusNotifier, "strapBodyStatusNotifier");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(configRepo, "configRepo");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        this.context = context;
        this.strapBodyStatusNotifier = strapBodyStatusNotifier;
        this.analyticsHelper = analyticsHelper;
        this.configRepo = configRepo;
        this.whoopStrapProxy = whoopStrapProxy;
        this.backgroundScope = backgroundScope;
        this.logTag = "StrapOffBodyNotification";
    }

    /* JADX INFO: renamed from: B */
    private final void m83734B() {
        Object systemService = this.context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(107);
    }

    /* JADX INFO: renamed from: C */
    private final long m83735C() {
        AbstractC21909c abstractC21909c = this.configRepo;
        C37641d c37641d = C37641d.f161196a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c37641d.getName();
        Object defaultValue = c37641d.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return (((Long) defaultValue).longValue() / ((long) 1000)) / ((long) 60);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final void m83736D(EnumC21747a strapBodyStatus) {
        if (strapBodyStatus == EnumC21747a.STRAP_ON_BODY) {
            m83734B();
        } else {
            mo24524a(new C25323f(C25272z.f99163w), this.context);
        }
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String string = context.getString(AbstractC17312j.f66933J0);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = context.getString(AbstractC17312j.f66929H0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        NotificationCompat.Builder contentText = AbstractC25319b.m74341e(this, context, null, 2, null).setContentTitle(string).setContentText(string2);
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        f111571R.m11805a(contentText);
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66562D2);
        contentText.setContentIntent(c12966j0M74345c.m36444b());
        this.analyticsHelper.m120960a(String.valueOf(m83735C()), String.valueOf((int) this.whoopStrapProxy.getBatteryLevel().getUserDisplayPercent()), this.whoopStrapProxy.mo106491d().analyticsName());
        Notification notificationBuild = contentText.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, 107, notificationBuild, context, string, string2, null, 32, null);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.backgroundScope, null, null, new b(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    public /* synthetic */ C27702f0(C27721s c27721s, Context context, InterfaceC37639b interfaceC37639b, C37638a c37638a, AbstractC21909c abstractC21909c, InterfaceC33704b interfaceC33704b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27721s, context, interfaceC37639b, c37638a, abstractC21909c, interfaceC33704b, (i13 & 64) != 0 ? c27721s.getScope() : interfaceC2994c0);
    }
}
