package rr2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import or2.AbstractC28165h;
import or2.C28162g;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import qc1.C30217a;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rm2.C31604d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: rr2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u001a\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001c\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J!\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J+\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020 2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010,J)\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00122\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u0012\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b2\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lrr2/h;", "Lrr2/c;", "Ltr2/n;", "log", "La6/g;", "Lf6/f;", "dataStore", "Lzr2/a;", "dateAndTimeProvider", "Lor2/g;", "buildConfigInfo", "<init>", "(Ltr2/n;La6/g;Lzr2/a;Lor2/g;)V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lq83/d;)Ljava/lang/Object;", "a", "()V", "", "message", "", "metadata", "l", "(Ljava/lang/String;Ljava/util/Map;)V", "from", "to", "", "additionalData", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "tag", "r", "", "thr", "g", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "p", "(Ljava/lang/Throwable;)V", "throwable", "tags", "o", "(Ljava/lang/Throwable;Ljava/util/Map;)V", "userId", "d", "(Ljava/lang/String;)V", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "section", "j", "Ltr2/n;", "x", "La6/g;", "y", "Lzr2/a;", "z", "Lor2/g;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31771h implements InterfaceC31766c {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28162g buildConfigInfo;

    /* JADX INFO: renamed from: rr2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.crash.LoggingCrashReporter$saveCrashEventToDataStore$2", m100430f = "LoggingCrashReporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131571w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f131572x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C31771h.this.new a(interfaceC30057d);
            aVar.f131572x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f131572x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f131571w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC31768e.m98639b(), Boolean.TRUE);
            c14129a.m40230g(AbstractC31768e.m98638a(), new Long(C31771h.this.dateAndTimeProvider.mo133363b()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rr2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.crash.LoggingCrashReporter$setup$1$1", m100430f = "LoggingCrashReporter.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131574w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31771h.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131574w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31771h c31771h = C31771h.this;
                this.f131574w = 1;
                if (c31771h.m98648w(this) == enumC31071a) {
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

    public C31771h(InterfaceC34116n log, InterfaceC0422g dataStore, InterfaceC41070a dateAndTimeProvider, C28162g buildConfigInfo) {
        AbstractC22676k.m65750j(log, "log");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(buildConfigInfo, "buildConfigInfo");
        this.log = log;
        this.dataStore = dataStore;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.buildConfigInfo = buildConfigInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final CharSequence m98646u(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final CharSequence m98647v(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final Object m98648w(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G;
        return (AbstractC28165h.m85266b(this.buildConfigInfo) || (objM48861G = AbstractC17269i.m48861G(this.dataStore, new a(null), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM48861G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m98649x(C31771h c31771h, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th3) {
        try {
            AbstractC3006f0.m8699E(C30064k.f122676w, c31771h.new b(null));
            String str = "Uncaught exception on thread " + thread.getName() + " (" + thread.getId() + ")";
            InterfaceC34116n interfaceC34116n = c31771h.log;
            AbstractC22676k.m65747g(th3);
            interfaceC34116n.mo85230v(str, th3, new AbstractC30556a.a[0]);
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final CharSequence m98650y(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: a */
    public void mo98622a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: rr2.g
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th3) {
                C31771h.m98649x(this.f131565w, defaultUncaughtExceptionHandler, thread, th3);
            }
        });
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: b */
    public void mo98623b(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        this.log.mo85228t("removeTag ".concat(tag), new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: c */
    public void mo98624c(String tag, String value) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        this.log.mo85228t(AbstractC31061c.m95640p("setTag ", tag, "=", value), new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: d */
    public void mo98625d(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        this.log.mo85228t("setUserId ".concat(userId), new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: f */
    public /* bridge */ String mo98636f(String str) {
        return super.mo98636f(str);
    }

    @Override // rr2.InterfaceC31766c
    @InterfaceC23457c
    /* JADX INFO: renamed from: g */
    public void mo98626g(Throwable thr, String message) {
        AbstractC22676k.m65750j(thr, "thr");
        this.log.mo85230v(mo98636f(message), thr, new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: j */
    public void mo98627j(String section, Map<String, ?> metadata) {
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(metadata, "metadata");
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: l */
    public void mo98628l(String message, Map<String, String> metadata) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.log.mo85216g(AbstractC39414r.m125869O0("breadcrumb " + message + " " + AbstractC25265s.m74110N0(metadata.entrySet(), null, null, null, null, 63)).toString(), new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: n */
    public void mo98629n(String from, String to3, Map<String, ? extends Object> additionalData) {
        AbstractC22676k.m65750j(to3, "to");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        this.log.mo85216g(AbstractC2875y.m8300m("breadcrumb navigation from=", from, " to=", to3, !additionalData.isEmpty() ? AbstractC25265s.m74110N0(additionalData.entrySet(), null, " data=", null, new C30217a(9), 29) : ""), new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: o */
    public void mo98630o(Throwable throwable, Map<String, String> tags) {
        AbstractC22676k.m65750j(throwable, "throwable");
        AbstractC22676k.m65750j(tags, "tags");
        this.log.mo85230v(AbstractC11895b.m31997p(mo98636f("Recording a handled exception"), " [tags: ", AbstractC25265s.m74110N0(tags.entrySet(), ", ", null, null, new C31604d(14), 30), "]"), throwable, new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: p */
    public void mo98631p(Throwable thr) {
        AbstractC22676k.m65750j(thr, "thr");
        this.log.mo85230v(mo98636f("Recording a handled exception"), thr, new AbstractC30556a.a[0]);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: r */
    public void mo98632r(String tag, Map<String, String> additionalData) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        this.log.mo85216g(AbstractC11895b.m31996o("breadcrumb uiClick tag=", tag, !additionalData.isEmpty() ? AbstractC25265s.m74110N0(additionalData.entrySet(), null, " data=", null, new C31604d(13), 29) : ""), new AbstractC30556a.a[0]);
    }

    public /* synthetic */ C31771h(InterfaceC34116n interfaceC34116n, InterfaceC0422g interfaceC0422g, InterfaceC41070a interfaceC41070a, C28162g c28162g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LoggingCrashReporter") : interfaceC34116n, interfaceC0422g, interfaceC41070a, c28162g);
    }
}
