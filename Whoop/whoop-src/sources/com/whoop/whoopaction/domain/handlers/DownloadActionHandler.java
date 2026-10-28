package com.whoop.whoopaction.domain.handlers;

import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.DownloadAction;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import l83.C23454a0;
import or2.C28144a0;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import rw2.InterfaceC31871a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b\u001a\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;", "Lrw2/a;", "Lu02/c;", "apiClient", "Lor2/a0;", "fileManager", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Lor2/a0;Ljava/time/Clock;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/DownloadAction;", "action", "Lqw2/b;", "e", "(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;", "", "filename", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Lec3/l;", "Lqw2/a;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "Lor2/a0;", "c", "Ljava/time/Clock;", "d", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DownloadActionHandler implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: com.whoop.whoopaction.domain.handlers.DownloadActionHandler$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.DownloadActionHandler", m100430f = "DownloadActionHandler.kt", m100431l = {66, 73, 73}, m100432m = "executeDownload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10807a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f33108E;

        /* JADX INFO: renamed from: G */
        int f33110G;

        /* JADX INFO: renamed from: w */
        Object f33111w;

        /* JADX INFO: renamed from: x */
        Object f33112x;

        /* JADX INFO: renamed from: y */
        Object f33113y;

        /* JADX INFO: renamed from: z */
        Object f33114z;

        public C10807a(InterfaceC30057d<? super C10807a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33108E = obj;
            this.f33110G |= Integer.MIN_VALUE;
            return DownloadActionHandler.this.m28412e(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whoopaction.domain.handlers.DownloadActionHandler$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.DownloadActionHandler$handleActions$1", m100430f = "DownloadActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10808b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33115w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33116x;

        /* JADX INFO: renamed from: com.whoop.whoopaction.domain.handlers.DownloadActionHandler$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.DownloadActionHandler$handleActions$1$1", m100430f = "DownloadActionHandler.kt", m100431l = {45, 46, 47}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ DownloadActionHandler f33118E;

            /* JADX INFO: renamed from: w */
            Object f33119w;

            /* JADX INFO: renamed from: x */
            int f33120x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f33121y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ DownloadAction f33122z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DownloadAction downloadAction, DownloadActionHandler downloadActionHandler, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f33122z = downloadAction;
                this.f33118E = downloadActionHandler;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f33122z, this.f33118E, interfaceC30057d);
                aVar.f33121y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
            
                if (r0.emit((qw2.AbstractC30694b) r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f33121y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f33120x
                    r3 = 3
                    r4 = 1
                    r5 = 2
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r4) goto L28
                    if (r2 == r5) goto L24
                    if (r2 != r3) goto L1c
                    java.lang.Object r0 = r7.f33119w
                    qw2.b r0 = (qw2.AbstractC30694b) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5f
                L1c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L24:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L50
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L41
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    qw2.b$c r8 = new qw2.b$c
                    com.whoop.whoopaction.domain.models.DownloadAction r2 = r7.f33122z
                    r8.<init>(r2, r6, r5, r6)
                    r7.f33121y = r0
                    r7.f33120x = r4
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L41
                    goto L5e
                L41:
                    com.whoop.whoopaction.domain.handlers.DownloadActionHandler r8 = r7.f33118E
                    com.whoop.whoopaction.domain.models.DownloadAction r2 = r7.f33122z
                    r7.f33121y = r0
                    r7.f33120x = r5
                    java.lang.Object r8 = com.whoop.whoopaction.domain.handlers.DownloadActionHandler.m28410c(r8, r2, r7)
                    if (r8 != r1) goto L50
                    goto L5e
                L50:
                    qw2.b r8 = (qw2.AbstractC30694b) r8
                    r7.f33121y = r6
                    r7.f33119w = r6
                    r7.f33120x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.whoopaction.domain.handlers.DownloadActionHandler.C10808b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C10808b(InterfaceC30057d<? super C10808b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10808b c10808b = DownloadActionHandler.this.new C10808b(interfaceC30057d);
            c10808b.f33116x = obj;
            return c10808b;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((C10808b) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f33116x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33115w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Action action = interfaceC30693a.getAction();
            AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.DownloadAction");
            DownloadAction downloadAction = (DownloadAction) action;
            InterfaceC34116n interfaceC34116n = DownloadActionHandler.this.logger;
            String path = downloadAction.getPath();
            String filename = downloadAction.getFilename();
            Long timeoutMillis = downloadAction.getTimeoutMillis();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("DownloadAction received — path: '", path, "', filename: '", filename, "', timeoutMillis: ");
            sbM32001t.append(timeoutMillis);
            interfaceC34116n.mo85228t(sbM32001t.toString(), new AbstractC30556a.a[0]);
            return new C13084s1(new a(downloadAction, DownloadActionHandler.this, null));
        }
    }

    public DownloadActionHandler(C34387c apiClient, C28144a0 fileManager, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.fileManager = fileManager;
        this.clock = clock;
        this.logger = logger;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DownloadAction.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c0, code lost:
    
        if (r3 == r14) goto L47;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28412e(com.whoop.whoopaction.domain.models.DownloadAction r23, q83.InterfaceC30057d<? super qw2.AbstractC30694b> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.whoopaction.domain.handlers.DownloadActionHandler.m28412e(com.whoop.whoopaction.domain.models.DownloadAction, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    private final String m28413f(String filename) {
        String str = LocalDateTime.now(this.clock).format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        int iM125892k0 = AbstractC39414r.m125892k0(filename, '.', 0, 6);
        if (iM125892k0 <= 0) {
            return AbstractC18489d0.m53370k(filename, "_", str);
        }
        String strSubstring = filename.substring(0, iM125892k0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String strSubstring2 = filename.substring(iM125892k0);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        return AbstractC11895b.m31997p(strSubstring, "_", str, strSubstring2);
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new C10808b(null), upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DownloadActionHandler(C34387c c34387c, C28144a0 c28144a0, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(c34387c, c28144a0, clock, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DownloadActionHandler") : interfaceC34116n);
    }
}
