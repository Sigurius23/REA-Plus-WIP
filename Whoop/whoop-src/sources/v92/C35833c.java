package v92;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.AuthMaterial;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: v92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 +2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\r*\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lv92/c;", "", "Lv92/d;", "keyStore", "La6/g;", "Lf6/f;", "dataStore", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lv92/d;La6/g;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "input", "l", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "k", "", "p", "(Ljava/lang/String;)[B", "q", "([B)Ljava/lang/String;", "accessToken", "refreshToken", "", "expirationSeconds", "refreshTokenExpirationSeconds", "Ll83/a0;", "o", "(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/AuthMaterial;", "m", "(Lq83/d;)Ljava/lang/Object;", "n", "a", "Lv92/d;", "b", "La6/g;", "c", "Lrr2/c;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35833c {

    /* JADX INFO: renamed from: f */
    private static final C14132d f152491f = AbstractC15751g.m44441U("encryptedAccessToken");

    /* JADX INFO: renamed from: g */
    private static final C14132d f152492g = AbstractC15751g.m44441U("encryptedRefreshToken");

    /* JADX INFO: renamed from: h */
    private static final C14132d f152493h = AbstractC15751g.m44441U("accessToken");

    /* JADX INFO: renamed from: i */
    private static final C14132d f152494i = AbstractC15751g.m44441U("refreshToken");

    /* JADX INFO: renamed from: j */
    private static final C14132d f152495j = AbstractC15751g.m44423C("expirationSeconds");

    /* JADX INFO: renamed from: k */
    private static final C14132d f152496k = AbstractC15751g.m44423C("refreshTokenExpirationSeconds");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35834d keyStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: v92.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore", m100430f = "EncryptedAuthStore.kt", m100431l = {123}, m100432m = "decrypt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f152502F;

        /* JADX INFO: renamed from: w */
        Object f152503w;

        /* JADX INFO: renamed from: x */
        Object f152504x;

        /* JADX INFO: renamed from: y */
        Object f152505y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f152506z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152506z = obj;
            this.f152502F |= Integer.MIN_VALUE;
            return C35833c.this.m113733k(null, this);
        }
    }

    /* JADX INFO: renamed from: v92.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore", m100430f = "EncryptedAuthStore.kt", m100431l = {118}, m100432m = "encrypt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f152507E;

        /* JADX INFO: renamed from: w */
        Object f152508w;

        /* JADX INFO: renamed from: x */
        Object f152509x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152510y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152510y = obj;
            this.f152507E |= Integer.MIN_VALUE;
            return C35833c.this.m113734l(null, this);
        }
    }

    /* JADX INFO: renamed from: v92.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore", m100430f = "EncryptedAuthStore.kt", m100431l = {70, 81, 82}, m100432m = "getAuthMaterialDataStore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f152512E;

        /* JADX INFO: renamed from: F */
        Object f152513F;

        /* JADX INFO: renamed from: G */
        Object f152514G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f152515H;

        /* JADX INFO: renamed from: J */
        int f152517J;

        /* JADX INFO: renamed from: w */
        Object f152518w;

        /* JADX INFO: renamed from: x */
        Object f152519x;

        /* JADX INFO: renamed from: y */
        Object f152520y;

        /* JADX INFO: renamed from: z */
        Object f152521z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152515H = obj;
            this.f152517J |= Integer.MIN_VALUE;
            return C35833c.this.m113737m(this);
        }
    }

    /* JADX INFO: renamed from: v92.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore$nukeMaterialDataStore$2", m100430f = "EncryptedAuthStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152522w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152523x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f152523x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f152523x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152522w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(C35833c.f152491f);
            c14129a.m40229f(C35833c.f152492g);
            c14129a.m40229f(C35833c.f152493h);
            c14129a.m40229f(C35833c.f152494i);
            c14129a.m40229f(C35833c.f152495j);
            c14129a.m40229f(C35833c.f152496k);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v92.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore", m100430f = "EncryptedAuthStore.kt", m100431l = {37, 38, 39, 47}, m100432m = "storeAuthMaterialDataStore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f152524E;

        /* JADX INFO: renamed from: F */
        int f152525F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f152526G;

        /* JADX INFO: renamed from: I */
        int f152528I;

        /* JADX INFO: renamed from: w */
        Object f152529w;

        /* JADX INFO: renamed from: x */
        Object f152530x;

        /* JADX INFO: renamed from: y */
        Object f152531y;

        /* JADX INFO: renamed from: z */
        Object f152532z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152526G = obj;
            this.f152528I |= Integer.MIN_VALUE;
            return C35833c.this.m113739o(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: v92.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore$storeAuthMaterialDataStore$2", m100430f = "EncryptedAuthStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f152533E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f152534F;

        /* JADX INFO: renamed from: w */
        int f152535w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152536x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f152537y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f152538z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, int i13, int i14, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152537y = str;
            this.f152538z = str2;
            this.f152533E = i13;
            this.f152534F = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f152537y, this.f152538z, this.f152533E, this.f152534F, interfaceC30057d);
            gVar.f152536x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f152536x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152535w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C35833c.f152491f, this.f152537y);
            c14129a.m40230g(C35833c.f152492g, this.f152538z);
            c14129a.m40230g(C35833c.f152495j, new Integer(this.f152533E));
            c14129a.m40230g(C35833c.f152496k, new Integer(this.f152534F));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v92.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedAuthStore$storeAuthMaterialDataStore$3", m100430f = "EncryptedAuthStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f152539E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f152540F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C35833c f152541G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Exception f152542H;

        /* JADX INFO: renamed from: w */
        int f152543w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152544x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f152545y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f152546z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, int i13, int i14, C35833c c35833c, Exception exc, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152545y = str;
            this.f152546z = str2;
            this.f152539E = i13;
            this.f152540F = i14;
            this.f152541G = c35833c;
            this.f152542H = exc;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f152545y, this.f152546z, this.f152539E, this.f152540F, this.f152541G, this.f152542H, interfaceC30057d);
            hVar.f152544x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f152544x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152543w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C35833c.f152493h, this.f152545y);
            c14129a.m40230g(C35833c.f152494i, this.f152546z);
            c14129a.m40230g(C35833c.f152495j, new Integer(this.f152539E));
            c14129a.m40230g(C35833c.f152496k, new Integer(this.f152540F));
            c14129a.m40229f(C35833c.f152491f);
            c14129a.m40229f(C35833c.f152492g);
            if (this.f152541G.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ENCRYPTION_FAILURE_LOGGING)) {
                this.f152541G.crashReporter.mo98631p(this.f152542H);
            }
            return C23454a0.f92919a;
        }
    }

    public C35833c(C35834d keyStore, InterfaceC0422g dataStore, InterfaceC31766c crashReporter, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(keyStore, "keyStore");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.keyStore = keyStore;
        this.dataStore = dataStore;
        this.crashReporter = crashReporter;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m113733k(String str, InterfaceC30057d<? super String> interfaceC30057d) throws Throwable {
        b bVar;
        C35833c c35833c;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f152502F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f152502F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM113745c = bVar.f152506z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f152502F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM113745c);
            byte[] bArrM113735p = m113735p(str);
            C35834d c35834d = this.keyStore;
            bVar.f152503w = null;
            bVar.f152504x = null;
            bVar.f152505y = this;
            bVar.f152502F = 1;
            objM113745c = c35834d.m113745c(bArrM113735p, bVar);
            if (objM113745c == enumC31071a) {
                return enumC31071a;
            }
            c35833c = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35833c = (C35833c) bVar.f152505y;
            AbstractC34132o.m107864I(objM113745c);
        }
        return c35833c.m113736q((byte[]) objM113745c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m113734l(String str, InterfaceC30057d<? super String> interfaceC30057d) throws Throwable {
        c cVar;
        C35833c c35833c;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f152507E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f152507E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM113746d = cVar.f152510y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f152507E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM113746d);
            C35834d c35834d = this.keyStore;
            cVar.f152508w = null;
            cVar.f152509x = this;
            cVar.f152507E = 1;
            objM113746d = c35834d.m113746d(str, cVar);
            if (objM113746d == enumC31071a) {
                return enumC31071a;
            }
            c35833c = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35833c = (C35833c) cVar.f152509x;
            AbstractC34132o.m107864I(objM113746d);
        }
        return c35833c.m113736q((byte[]) objM113746d);
    }

    /* JADX INFO: renamed from: p */
    private final byte[] m113735p(String str) {
        byte[] bytes = str.getBytes(AbstractC39397a.f169550e);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX INFO: renamed from: q */
    private final String m113736q(byte[] bArr) {
        return new String(bArr, AbstractC39397a.f169550e);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m113737m(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) throws Throwable {
        d dVar;
        String str;
        Integer num;
        Integer num2;
        String str2;
        Object objM113733k;
        String str3;
        Integer num3;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f152517J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f152517J = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM36575A = dVar.f152515H;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f152517J;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.dataStore.getData();
                dVar.f152518w = null;
                dVar.f152517J = 1;
                objM36575A = AbstractC13091v.m36575A(data, dVar);
                if (objM36575A != obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM36575A);
            } else {
                if (i14 == 2) {
                    num2 = (Integer) dVar.f152513F;
                    num = (Integer) dVar.f152512E;
                    str = (String) dVar.f152521z;
                    AbstractC34132o.m107864I(objM36575A);
                    str2 = (String) objM36575A;
                    dVar.f152518w = null;
                    dVar.f152519x = null;
                    dVar.f152520y = null;
                    dVar.f152521z = null;
                    dVar.f152512E = num;
                    dVar.f152513F = num2;
                    dVar.f152514G = str2;
                    dVar.f152517J = 3;
                    objM113733k = m113733k(str, dVar);
                    if (objM113733k != obj) {
                        str3 = str2;
                        objM36575A = objM113733k;
                        num3 = num;
                    }
                    return obj;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) dVar.f152514G;
                num2 = (Integer) dVar.f152513F;
                num3 = (Integer) dVar.f152512E;
                AbstractC34132o.m107864I(objM36575A);
            }
            return new AuthMaterial(str3, (String) objM36575A, num3.intValue(), num2.intValue());
            AbstractC14134f abstractC14134f = (AbstractC14134f) objM36575A;
            String str4 = (String) abstractC14134f.mo40227b(f152491f);
            str = (String) abstractC14134f.mo40227b(f152492g);
            Integer num4 = (Integer) abstractC14134f.mo40227b(f152495j);
            Integer num5 = (Integer) abstractC14134f.mo40227b(f152496k);
            if (num4 != null && num5 != null) {
                if (str4 != null && str != null) {
                    dVar.f152518w = null;
                    dVar.f152519x = null;
                    dVar.f152520y = null;
                    dVar.f152521z = str;
                    dVar.f152512E = num4;
                    dVar.f152513F = num5;
                    dVar.f152517J = 2;
                    objM36575A = m113733k(str4, dVar);
                    if (objM36575A != obj) {
                        num = num4;
                        num2 = num5;
                        str2 = (String) objM36575A;
                        dVar.f152518w = null;
                        dVar.f152519x = null;
                        dVar.f152520y = null;
                        dVar.f152521z = null;
                        dVar.f152512E = num;
                        dVar.f152513F = num2;
                        dVar.f152514G = str2;
                        dVar.f152517J = 3;
                        objM113733k = m113733k(str, dVar);
                        if (objM113733k != obj) {
                            str3 = str2;
                            objM36575A = objM113733k;
                            num3 = num;
                            return new AuthMaterial(str3, (String) objM36575A, num3.intValue(), num2.intValue());
                        }
                    }
                    return obj;
                }
                String str5 = (String) abstractC14134f.mo40227b(f152493h);
                String str6 = (String) abstractC14134f.mo40227b(f152494i);
                if (str5 != null && str6 != null) {
                    return new AuthMaterial(str5, str6, num4.intValue(), num5.intValue());
                }
            }
        } catch (Exception e5) {
            if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ENCRYPTION_FAILURE_LOGGING)) {
                this.crashReporter.mo98631p(e5);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final Object m113738n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStore, new e(null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:
    
        if (r0 == r9) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0093: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:28:0x0090 */
    /* JADX WARN: Type inference failed for: r18v0, types: [v92.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m113739o(java.lang.String r19, java.lang.String r20, int r21, int r22, q83.InterfaceC30057d<? super l83.C23454a0> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v92.C35833c.m113739o(java.lang.String, java.lang.String, int, int, q83.d):java.lang.Object");
    }
}
