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
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13050j;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gt0.EnumC16180b;
import gt0.EnumC16181c;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16186h;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import ih0.AbstractC18489d0;
import java.util.HashMap;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.C25323f;
import nl1.C26813a;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: o92.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001\u0018B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020$8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, m65681d2 = {"Lo92/i;", "Lm92/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lo92/s;", "pushContext", "Landroid/content/Context;", "context", "Lnl1/a;", "newFirmwareUpdateMonitor", "Lgt0/d;", "fwAnalyticsHelper", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "backgroundScope", "<init>", "(Lo92/s;Landroid/content/Context;Lnl1/a;Lgt0/d;Lci2/b;Lbc3/c0;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "Lm92/f;", "dataMap", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Landroid/content/Context;", "J", "Lnl1/a;", "K", "Lgt0/d;", "L", "Lci2/b;", "M", "Lbc3/c0;", "", "N", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "D", "deviceName", "O", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27707i extends AbstractC25319b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: P */
    public static final int f111613P = 8;

    /* JADX INFO: renamed from: Q */
    public static final C3853d f111614Q;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C26813a newFirmwareUpdateMonitor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC16182d fwAnalyticsHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lo92/i$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "BODY", "TITLE", "Lc12/d;", "SETTINGS", "Lc12/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m83753a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C27707i.f111614Q.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o92.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.FirmwareUpdateNotification$onCreate$1", m100430f = "FirmwareUpdateNotification.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111621w;

        /* JADX INFO: renamed from: o92.i$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C27707i f111623w;

            public a(C27707i c27707i) {
                this.f111623w = c27707i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                HashMap map = new HashMap();
                if (interfaceC16186h instanceof InterfaceC16186h.e) {
                    map.put("title", this.f111623w.context.getString(AbstractC17312j.f66982f0));
                    map.put("body", this.f111623w.context.getString(AbstractC17312j.f66979e0));
                    InterfaceC16182d.m45716a(this.f111623w.fwAnalyticsHelper, EnumC16180b.NOTIFICATION, EnumC16181c.UPDATE_SUCCESS, null, this.f111623w.m83751D(), null, null, 48, null);
                } else if (interfaceC16186h instanceof InterfaceC16186h.b) {
                    map.put("title", this.f111623w.context.getString(AbstractC17312j.f66988h0));
                    map.put("body", InterfaceC16186h.INSTANCE.m45725c(interfaceC16186h) ? this.f111623w.context.getString(AbstractC17312j.f66985g0) : this.f111623w.context.getString(AbstractC17312j.f66991i0));
                    InterfaceC16182d.m45716a(this.f111623w.fwAnalyticsHelper, EnumC16180b.NOTIFICATION, EnumC16181c.FAILURE, null, this.f111623w.m83751D(), null, null, 48, null);
                }
                this.f111623w.mo24524a(new C25323f(map), this.f111623w.context);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: o92.i$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42115b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f111624w;

            /* JADX INFO: renamed from: o92.i$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f111625w;

                /* JADX INFO: renamed from: o92.i$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.FirmwareUpdateNotification$onCreate$1$invokeSuspend$$inlined$filter$1$2", m100430f = "FirmwareUpdateNotification.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42116a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f111627F;

                    /* JADX INFO: renamed from: G */
                    Object f111628G;

                    /* JADX INFO: renamed from: H */
                    int f111629H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f111630w;

                    /* JADX INFO: renamed from: x */
                    int f111631x;

                    /* JADX INFO: renamed from: y */
                    Object f111632y;

                    /* JADX INFO: renamed from: z */
                    Object f111633z;

                    public C42116a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f111630w = obj;
                        this.f111631x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f111625w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42116a c42116a;
                    if (interfaceC30057d instanceof C42116a) {
                        c42116a = (C42116a) interfaceC30057d;
                        int i13 = c42116a.f111631x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42116a.f111631x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42116a = new C42116a(interfaceC30057d);
                        }
                    } else {
                        c42116a = new C42116a(interfaceC30057d);
                    }
                    Object obj2 = c42116a.f111630w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42116a.f111631x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f111625w;
                        InterfaceC16186h interfaceC16186h = (InterfaceC16186h) obj;
                        InterfaceC16186h.Companion companion = InterfaceC16186h.INSTANCE;
                        if (companion.m45727e(interfaceC16186h) || companion.m45725c(interfaceC16186h) || companion.m45723a(interfaceC16186h)) {
                            c42116a.f111632y = null;
                            c42116a.f111633z = null;
                            c42116a.f111627F = null;
                            c42116a.f111628G = null;
                            c42116a.f111629H = 0;
                            c42116a.f111631x = 1;
                            if (interfaceC13062m.emit(obj, c42116a) == enumC31071a) {
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

            public C42115b(InterfaceC13058l interfaceC13058l) {
                this.f111624w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f111624w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m83755h(InterfaceC16186h interfaceC16186h, InterfaceC16186h interfaceC16186h2) {
            return AbstractC22676k.m65745e(interfaceC16186h, interfaceC16186h2);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27707i.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111621w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13050j c13050jM36609s = AbstractC13091v.m36609s(new C27709j(), new C42115b(C27707i.this.newFirmwareUpdateMonitor.getStrapFwUpdateMonitorFlow()));
                a aVar = new a(C27707i.this);
                this.f111621w = 1;
                if (c13050jM36609s.collect(aVar, this) == enumC31071a) {
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
        C3853d c3853dM11807f = AbstractC25319b.INSTANCE.m74357a("06500_FirmwareUpdate", AbstractC17312j.f66976d0).m11807f(AbstractC17312j.f67005n);
        AbstractC22676k.m65749i(c3853dM11807f, "setChannelDescriptionResId(...)");
        f111614Q = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27707i(C27721s pushContext, Context context, C26813a newFirmwareUpdateMonitor, InterfaceC16182d fwAnalyticsHelper, InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 backgroundScope) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(newFirmwareUpdateMonitor, "newFirmwareUpdateMonitor");
        AbstractC22676k.m65750j(fwAnalyticsHelper, "fwAnalyticsHelper");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        this.context = context;
        this.newFirmwareUpdateMonitor = newFirmwareUpdateMonitor;
        this.fwAnalyticsHelper = fwAnalyticsHelper;
        this.whoopStrapProvider = whoopStrapProvider;
        this.backgroundScope = backgroundScope;
        this.logTag = "FirmwareUpdateNotification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final String m83751D() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.mo24752w0().getCodeName();
        }
        return null;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74368b = dataMap.m74368b("title");
        String str = strM74368b == null ? "" : strM74368b;
        String strM74368b2 = dataMap.m74368b("body");
        String str2 = strM74368b2 == null ? "" : strM74368b2;
        NotificationCompat.Builder contentText = AbstractC25319b.m74341e(this, context, null, 2, null).setContentTitle(str).setContentText(str2);
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        f111614Q.m11805a(contentText);
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66562D2);
        contentText.setContentIntent(c12966j0M74345c.m36444b());
        Notification notificationBuild = contentText.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, 113, notificationBuild, context, str, str2, null, 32, null);
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

    public /* synthetic */ C27707i(C27721s c27721s, Context context, C26813a c26813a, InterfaceC16182d interfaceC16182d, InterfaceC4733b interfaceC4733b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27721s, context, c26813a, interfaceC16182d, interfaceC4733b, (i13 & 32) != 0 ? c27721s.getScope() : interfaceC2994c0);
    }
}
