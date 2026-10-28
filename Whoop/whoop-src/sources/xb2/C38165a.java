package xb2;

import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.CachedDataLanguageRefresher;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import l83.C23454a0;
import or2.InterfaceC28197r1;
import p007a6.InterfaceC0422g;
import p029b5.C2728g;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: xb2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lxb2/a;", "", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lor2/r1;", "systemResources", "La6/g;", "Lf6/f;", "prefsDataStore", "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;", "languageRefresher", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/LanguageRepository;Lor2/r1;La6/g;Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Ltr2/n;)V", "Lb5/g;", "newLocales", "", "userInitiated", "Ll83/a0;", "e", "(Lb5/g;ZLq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/data/repositories/LanguageRepository;", "b", "Lor2/r1;", "c", "La6/g;", "d", "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38165a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28197r1 systemResources;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CachedDataLanguageRefresher languageRefresher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xb2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.AppSpecificLanguageUpdater$setAppSpecificLanguage$2", m100430f = "AppSpecificLanguageUpdater.kt", m100431l = {31, 34, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f163454w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C2728g f163456y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f163457z;

        /* JADX INFO: renamed from: xb2.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.settings.language.AppSpecificLanguageUpdater$setAppSpecificLanguage$2$1", m100430f = "AppSpecificLanguageUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42634a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f163458w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f163459x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f163460y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42634a(boolean z4, InterfaceC30057d<? super C42634a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f163460y = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C42634a c42634a = new C42634a(this.f163460y, interfaceC30057d);
                c42634a.f163459x = obj;
                return c42634a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42634a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f163459x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f163458w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40230g(LanguageRepositoryKt.getKEY_USER_LANGUAGE_OVERRIDE(), Boolean.valueOf(this.f163460y));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2728g c2728g, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f163456y = c2728g;
            this.f163457z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38165a.this.new a(this.f163456y, this.f163457z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r8.refreshForLanguageChange(r7) == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f163454w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                p505ts.AbstractC34132o.m107864I(r8)
                goto L66
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L57
            L1f:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L48
            L23:
                p505ts.AbstractC34132o.m107864I(r8)
                xb2.a r8 = xb2.C38165a.this
                or2.r1 r8 = xb2.C38165a.m122263d(r8)
                b5.g r1 = r7.f163456y
                r8.mo85334d(r1)
                xb2.a r8 = xb2.C38165a.this
                a6.g r8 = xb2.C38165a.m122262c(r8)
                xb2.a$a$a r1 = new xb2.a$a$a
                boolean r5 = r7.f163457z
                r6 = 0
                r1.<init>(r5, r6)
                r7.f163454w = r4
                java.lang.Object r8 = hg3.AbstractC17269i.m48861G(r8, r1, r7)
                if (r8 != r0) goto L48
                goto L65
            L48:
                xb2.a r8 = xb2.C38165a.this
                com.whoop.data.repositories.LanguageRepository r8 = xb2.C38165a.m122261b(r8)
                r7.f163454w = r3
                java.lang.Object r8 = r8.onLanguageChanged(r7)
                if (r8 != r0) goto L57
                goto L65
            L57:
                xb2.a r8 = xb2.C38165a.this
                com.whoop.data.repositories.CachedDataLanguageRefresher r8 = xb2.C38165a.m122260a(r8)
                r7.f163454w = r2
                java.lang.Object r8 = r8.refreshForLanguageChange(r7)
                if (r8 != r0) goto L66
            L65:
                return r0
            L66:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xb2.C38165a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C38165a(LanguageRepository languageRepository, InterfaceC28197r1 systemResources, InterfaceC0422g prefsDataStore, CachedDataLanguageRefresher languageRefresher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(languageRefresher, "languageRefresher");
        AbstractC22676k.m65750j(logger, "logger");
        this.languageRepository = languageRepository;
        this.systemResources = systemResources;
        this.prefsDataStore = prefsDataStore;
        this.languageRefresher = languageRefresher;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e */
    public final Object m122264e(C2728g c2728g, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        this.logger.mo85216g("Setting new language to " + c2728g + " userInitiated=" + z4, new AbstractC30556a.a[0]);
        Object objM8705K = AbstractC3006f0.m8705K(C3075y1.f12109w, new a(c2728g, z4, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public /* synthetic */ C38165a(LanguageRepository languageRepository, InterfaceC28197r1 interfaceC28197r1, InterfaceC0422g interfaceC0422g, CachedDataLanguageRefresher cachedDataLanguageRefresher, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(languageRepository, interfaceC28197r1, interfaceC0422g, cachedDataLanguageRefresher, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LanguageUpdater") : interfaceC34116n);
    }
}
