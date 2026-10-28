package de2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseRequest;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdSettingsUpdateRequest;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge2.InterfaceC15736a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: de2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lde2/a;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "shepherdApi", "Lde2/e;", "repository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Lde2/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "f", "()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "Lec3/l;", "Lge2/a;", "upstream", "Lge2/c;", "g", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Lde2/e;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11985a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi shepherdApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11989e repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: de2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ShepherdSubmitTermsOfUseInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39435w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39436x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39437y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11985a f39438z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C11985a c11985a) {
            super(3, interfaceC30057d);
            this.f39438z = c11985a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC15736a interfaceC15736a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f39438z);
            aVar.f39436x = interfaceC13062m;
            aVar.f39437y = interfaceC15736a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39435w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39436x;
                if (!AbstractC22676k.m65745e((InterfaceC15736a) this.f39437y, InterfaceC15736a.a.f59328a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f39438z.new b(null));
                this.f39436x = null;
                this.f39437y = null;
                this.f39435w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC15736a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: de2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1", m100430f = "ShepherdSubmitTermsOfUseInteractor.kt", m100431l = {29, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lge2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39439w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39440x;

        /* JADX INFO: renamed from: de2.a$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1$1", m100430f = "ShepherdSubmitTermsOfUseInteractor.kt", m100431l = {33, 35, 37, 46, 47}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f39442E;

            /* JADX INFO: renamed from: w */
            Object f39443w;

            /* JADX INFO: renamed from: x */
            Object f39444x;

            /* JADX INFO: renamed from: y */
            int f39445y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C11985a f39446z;

            /* JADX INFO: renamed from: de2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1$1$result$1", m100430f = "ShepherdSubmitTermsOfUseInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41464a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f39447w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C11985a f39448x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ ShepherdTermsOfUseRequest f39449y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41464a(C11985a c11985a, ShepherdTermsOfUseRequest shepherdTermsOfUseRequest, InterfaceC30057d<? super C41464a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f39448x = c11985a;
                    this.f39449y = shepherdTermsOfUseRequest;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41464a(this.f39448x, this.f39449y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f39447w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    ShepherdApi shepherdApi = this.f39448x.shepherdApi;
                    ShepherdTermsOfUseRequest shepherdTermsOfUseRequest = this.f39449y;
                    this.f39447w = 1;
                    Object objSaveTermsOfUse = shepherdApi.saveTermsOfUse(shepherdTermsOfUseRequest, this);
                    return objSaveTermsOfUse == enumC31071a ? enumC31071a : objSaveTermsOfUse;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((C41464a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX INFO: renamed from: de2.a$b$a$b, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1$1$result$2", m100430f = "ShepherdSubmitTermsOfUseInteractor.kt", m100431l = {40, 42}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "it", "", "<anonymous>", "(Lpg3/v0;)Ljava/lang/Object;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41465b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                Object f39450w;

                /* JADX INFO: renamed from: x */
                int f39451x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C11985a f39452y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41465b(C11985a c11985a, InterfaceC30057d<? super C41465b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f39452y = c11985a;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41465b(this.f39452y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f39451x;
                    if (i13 != 0) {
                        if (i13 != 1 && i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    ShepherdSettingsUpdateRequest shepherdSettingsUpdateRequestM33019f = this.f39452y.m33019f();
                    if (this.f39452y.featureFlagChecker.isFeatureEnabled("android-updated-samd-contract")) {
                        ShepherdApi shepherdApi = this.f39452y.shepherdApi;
                        this.f39450w = null;
                        this.f39451x = 1;
                        Object objUpdateShepherdSettings = shepherdApi.updateShepherdSettings(shepherdSettingsUpdateRequestM33019f, this);
                        if (objUpdateShepherdSettings != enumC31071a) {
                            return objUpdateShepherdSettings;
                        }
                    } else {
                        ShepherdApi shepherdApi2 = this.f39452y.shepherdApi;
                        this.f39450w = null;
                        this.f39451x = 2;
                        Object objUpdateShepherdSettingsLegacy = shepherdApi2.updateShepherdSettingsLegacy(shepherdSettingsUpdateRequestM33019f, this);
                        if (objUpdateShepherdSettingsLegacy != enumC31071a) {
                            return objUpdateShepherdSettingsLegacy;
                        }
                    }
                    return enumC31071a;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(C29218v0<C23454a0> c29218v0, InterfaceC30057d<Object> interfaceC30057d) {
                    return ((C41465b) create(c29218v0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11985a c11985a, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39446z = c11985a;
                this.f39442E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f39446z, this.f39442E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
            
                if (r15.emit(r1, r14) == r0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
            
                if (r15.emit(r1, r14) == r0) goto L35;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: de2.C11985a.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C11985a.this.new b(interfaceC30057d);
            bVar.f39440x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (or2.AbstractC28190p0.m85321a(2000, r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f39440x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f39439w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L45
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ge2.c$b r6 = ge2.InterfaceC15738c.b.f59338a
                r5.f39440x = r0
                r5.f39439w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L44
            L30:
                de2.a$b$a r6 = new de2.a$b$a
                de2.a r2 = de2.C11985a.this
                r4 = 0
                r6.<init>(r2, r0, r4)
                r5.f39440x = r4
                r5.f39439w = r3
                r2 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r6 = or2.AbstractC28190p0.m85321a(r2, r6, r5)
                if (r6 != r1) goto L45
            L44:
                return r1
            L45:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: de2.C11985a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C11985a(ShepherdApi shepherdApi, C11989e repository, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(shepherdApi, "shepherdApi");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.shepherdApi = shepherdApi;
        this.repository = repository;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final ShepherdSettingsUpdateRequest m33019f() {
        return new ShepherdSettingsUpdateRequest(true, true);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m33020g(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C11985a(ShepherdApi shepherdApi, C11989e c11989e, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(shepherdApi, c11989e, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ArrhythmiaSubmitTermsOfUseInteractor") : interfaceC34116n);
    }
}
