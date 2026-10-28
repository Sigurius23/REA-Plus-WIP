package rr2;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.C20315e;
import io.sentry.InterfaceC20259b1;
import io.sentry.protocol.C20481h0;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import p392p3.C28761b0;
import p714k80.C22276e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ze1.C40587c;

/* JADX INFO: renamed from: rr2.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010 \u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0018H\u0016¢\u0006\u0004\b \u0010!J-\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00162\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0018H\u0016¢\u0006\u0004\b#\u0010\u001bJ!\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020$2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J)\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00162\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u0016\u0012\u0002\b\u00030\u0018H\u0016¢\u0006\u0004\b2\u0010\u001bJ\u001f\u00104\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b6\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m65681d2 = {"Lrr2/o;", "Lrr2/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lrr2/l;", "sentryClient", "Ll83/h;", "Lyu0/b;", "dataBacklogReporter", "Lze1/c;", "lifecycleScopeProvider", "Lq83/j;", "ioContext", "<init>", "(Lrr2/l;Ll83/h;Lze1/c;Lq83/j;)V", "Ll83/a0;", "A", "()V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "a", "", "message", "", "metadata", "l", "(Ljava/lang/String;Ljava/util/Map;)V", "from", "to", "", "additionalData", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "tag", "r", "", "thr", "g", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "p", "(Ljava/lang/Throwable;)V", "throwable", "tags", "o", "(Ljava/lang/Throwable;Ljava/util/Map;)V", "userId", "d", "(Ljava/lang/String;)V", "section", "j", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lrr2/l;", "x", "Ll83/h;", "y", "Lze1/c;", "z", "Lq83/j;", "Ltr2/n;", "E", "Ltr2/n;", "log", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31778o implements InterfaceC31766c, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC31775l sentryClient;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h dataBacklogReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C40587c lifecycleScopeProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: rr2.o$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.crash.SentryReporter$onCreate$1", m100430f = "SentryReporter.kt", m100431l = {27, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131586w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31778o.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            if (r7.m127495b(r6) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f131586w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L67
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L32
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                kotlin.time.Duration$Companion r7 = p715kotlin.time.Duration.INSTANCE
                r7 = 500(0x1f4, float:7.0E-43)
                kotlin.time.DurationUnit r1 = p715kotlin.time.DurationUnit.MILLISECONDS
                long r4 = p715kotlin.time.DurationKt.toDuration(r7, r1)
                r6.f131586w = r3
                java.lang.Object r7 = bc3.AbstractC3034m0.m8783c(r4, r6)
                if (r7 != r0) goto L32
                goto L66
            L32:
                rr2.o r7 = rr2.C31778o.this
                rr2.l r7 = rr2.C31778o.m98677z(r7)
                java.lang.Boolean r7 = r7.mo98659f()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r7, r1)
                if (r7 == 0) goto L67
                rr2.o r7 = rr2.C31778o.this
                tr2.n r7 = rr2.C31778o.m98676y(r7)
                r1 = 0
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                java.lang.String r3 = "crashed last run"
                r7.mo85228t(r3, r1)
                rr2.o r7 = rr2.C31778o.this
                l83.h r7 = rr2.C31778o.m98675w(r7)
                java.lang.Object r7 = r7.getValue()
                yu0.b r7 = (yu0.C39785b) r7
                r6.f131586w = r2
                java.lang.Object r7 = r7.m127495b(r6)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rr2.C31778o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C31778o(InterfaceC31775l sentryClient, InterfaceC23462h dataBacklogReporter, C40587c lifecycleScopeProvider, InterfaceC30063j ioContext) {
        AbstractC22676k.m65750j(sentryClient, "sentryClient");
        AbstractC22676k.m65750j(dataBacklogReporter, "dataBacklogReporter");
        AbstractC22676k.m65750j(lifecycleScopeProvider, "lifecycleScopeProvider");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        this.sentryClient = sentryClient;
        this.dataBacklogReporter = dataBacklogReporter;
        this.lifecycleScopeProvider = lifecycleScopeProvider;
        this.ioContext = ioContext;
        this.log = InterfaceC34116n.INSTANCE.m107848a("SentryReporter");
    }

    /* JADX INFO: renamed from: A */
    private final void m98668A() {
        this.sentryClient.mo98662i(new C22276e(AbstractC25247g0.m73990Y(new C23465k("version", "v2"), new C23465k("changelog", "Sample rate is now configurable via config service.")), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m98669B(Map map, String str, InterfaceC20259b1 it) {
        AbstractC22676k.m65750j(it, "it");
        it.mo56188J(map, "whoop sentry engine");
        it.mo56197c("whoop.sentry.version", str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m98670C(Map map, InterfaceC20259b1 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        for (Map.Entry entry : map.entrySet()) {
            scope.mo56197c((String) entry.getKey(), (String) entry.getValue());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m98671D(String str, Map map, InterfaceC20259b1 it) {
        AbstractC22676k.m65750j(it, "it");
        it.mo56188J(map, str);
        return C23454a0.f92919a;
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: a */
    public void mo98622a() {
        m98668A();
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: b */
    public void mo98623b(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        this.sentryClient.mo98655b(tag);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: c */
    public void mo98624c(String tag, String value) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        this.sentryClient.mo98656c(tag, value);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: d */
    public void mo98625d(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        C20481h0 c20481h0 = new C20481h0();
        c20481h0.f76688x = userId;
        this.sentryClient.mo98658e(c20481h0);
    }

    @Override // rr2.InterfaceC31766c
    @InterfaceC23457c
    /* JADX INFO: renamed from: g */
    public void mo98626g(Throwable thr, String message) {
        AbstractC22676k.m65750j(thr, "thr");
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: j */
    public void mo98627j(String section, Map<String, ?> metadata) {
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.sentryClient.mo98662i(new C28761b0(8, section, metadata));
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: l */
    public void mo98628l(String message, Map<String, String> metadata) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(metadata, "metadata");
        C20315e c20315e = new C20315e();
        c20315e.f76295z = message;
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            c20315e.m56470c(entry.getValue(), entry.getKey());
        }
        this.sentryClient.mo98661h(c20315e);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: n */
    public void mo98629n(String from, String to3, Map<String, ? extends Object> additionalData) {
        AbstractC22676k.m65750j(to3, "to");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        this.sentryClient.mo98663j(from, to3, additionalData);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: o */
    public void mo98630o(Throwable throwable, Map<String, String> tags) {
        AbstractC22676k.m65750j(throwable, "throwable");
        AbstractC22676k.m65750j(tags, "tags");
        this.sentryClient.mo98654a(throwable, new C31777n(tags, 0));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.lifecycleScopeProvider.m131621a(owner), this.ioContext, null, new a(null), 2);
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

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: p */
    public void mo98631p(Throwable thr) {
        AbstractC22676k.m65750j(thr, "thr");
        this.sentryClient.mo98660g(thr);
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: r */
    public void mo98632r(String tag, Map<String, String> additionalData) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        this.sentryClient.mo98657d(tag, additionalData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31778o(InterfaceC31775l interfaceC31775l, InterfaceC23462h interfaceC23462h, C40587c c40587c, InterfaceC30063j interfaceC30063j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        c40587c = (i13 & 4) != 0 ? new C40587c() : c40587c;
        if ((i13 & 8) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(interfaceC31775l, interfaceC23462h, c40587c, interfaceC30063j);
    }
}
