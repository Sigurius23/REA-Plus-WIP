package z32;

import c93.InterfaceC4351m;
import com.whoop.pregnancy.api.EnablePregnancyCoachingBody;
import com.whoop.pregnancy.api.PregnancyCoachingApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import v32.C35613a;

/* JADX INFO: renamed from: z32.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lz32/c;", "", "Lcom/whoop/pregnancy/api/PregnancyCoachingApi;", "api", "Lv32/a;", "pregnancyAnalytics", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/pregnancy/api/PregnancyCoachingApi;Lv32/a;Ltr2/n;)V", "Lec3/l;", "Lz32/b;", "i", "()Lec3/l;", "j", "k", "", "dueDate", "", "fromOnboarding", "l", "(Ljava/lang/String;Z)Lec3/l;", "Lz32/a;", "upstream", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/pregnancy/api/PregnancyCoachingApi;", "b", "Lv32/a;", "c", "Ltr2/n;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40051c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PregnancyCoachingApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35613a pregnancyAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z32.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f172795w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f172796x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f172797y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40051c f172798z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C40051c c40051c) {
            super(3, interfaceC30057d);
            this.f172798z = c40051c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40049a abstractC40049a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f172798z);
            aVar.f172796x = interfaceC13062m;
            aVar.f172797y = abstractC40049a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM128392l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f172795w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f172796x;
                AbstractC40049a abstractC40049a = (AbstractC40049a) this.f172797y;
                if (abstractC40049a instanceof AbstractC40049a.a) {
                    interfaceC13058lM128392l = this.f172798z.m128389i();
                } else if (abstractC40049a instanceof AbstractC40049a.b) {
                    interfaceC13058lM128392l = ((AbstractC40049a.b) abstractC40049a).getIsCurrentlyEnabled() ? this.f172798z.m128390j() : this.f172798z.m128391k();
                } else {
                    if (!(abstractC40049a instanceof AbstractC40049a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC40049a.c cVar = (AbstractC40049a.c) abstractC40049a;
                    interfaceC13058lM128392l = this.f172798z.m128392l(cVar.getDueDate(), cVar.getFromOnboarding());
                }
                this.f172796x = null;
                this.f172797y = null;
                this.f172795w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM128392l, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC40049a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: z32.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$refreshSettings$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {33, 35, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lz32/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172799w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f172800x;

        /* JADX INFO: renamed from: z32.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$refreshSettings$1$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {36, 37, 39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f172802E;

            /* JADX INFO: renamed from: w */
            Object f172803w;

            /* JADX INFO: renamed from: x */
            Object f172804x;

            /* JADX INFO: renamed from: y */
            int f172805y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C40051c f172806z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40051c c40051c, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f172806z = c40051c;
                this.f172802E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f172806z, this.f172802E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
            
                if (r3.emit(r4, r5) == r0) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f172805y
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L2b
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r5.f172804x
                    com.whoop.educationModels.FeatureEducationDto r0 = (com.whoop.educationModels.FeatureEducationDto) r0
                    java.lang.Object r0 = r5.f172803w
                    com.whoop.pregnancy.api.PregnancySettingsDto r0 = (com.whoop.pregnancy.api.PregnancySettingsDto) r0
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L6c
                L1b:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L23:
                    java.lang.Object r1 = r5.f172803w
                    com.whoop.pregnancy.api.PregnancySettingsDto r1 = (com.whoop.pregnancy.api.PregnancySettingsDto) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L55
                L2b:
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L41
                L2f:
                    p505ts.AbstractC34132o.m107864I(r6)
                    z32.c r6 = r5.f172806z
                    com.whoop.pregnancy.api.PregnancyCoachingApi r6 = z32.C40051c.m128382a(r6)
                    r5.f172805y = r4
                    java.lang.Object r6 = r6.getPregnancySettingsBff(r5)
                    if (r6 != r0) goto L41
                    goto L6b
                L41:
                    r1 = r6
                    com.whoop.pregnancy.api.PregnancySettingsDto r1 = (com.whoop.pregnancy.api.PregnancySettingsDto) r1
                    z32.c r6 = r5.f172806z
                    com.whoop.pregnancy.api.PregnancyCoachingApi r6 = z32.C40051c.m128382a(r6)
                    r5.f172803w = r1
                    r5.f172805y = r3
                    java.lang.Object r6 = r6.getPregnancyEducation(r5)
                    if (r6 != r0) goto L55
                    goto L6b
                L55:
                    com.whoop.educationModels.FeatureEducationDto r6 = (com.whoop.educationModels.FeatureEducationDto) r6
                    ec3.m r3 = r5.f172802E
                    z32.b$e r4 = new z32.b$e
                    r4.<init>(r1, r6)
                    r6 = 0
                    r5.f172803w = r6
                    r5.f172804x = r6
                    r5.f172805y = r2
                    java.lang.Object r6 = r3.emit(r4, r5)
                    if (r6 != r0) goto L6c
                L6b:
                    return r0
                L6c:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: z32.c$b$b, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$refreshSettings$1$2", m100430f = "PregnancySettingsInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42723b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f172807w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f172808x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42723b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C42723b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f172808x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42723b(this.f172808x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42723b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172807w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f172808x;
                    AbstractC40050b.c cVar = AbstractC40050b.c.f172783a;
                    this.f172807w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C40051c.this.new b(interfaceC30057d);
            bVar.f172800x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r0, r1, r12) == r9) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f172800x
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f172799w
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2a
                if (r0 == r2) goto L26
                if (r0 == r1) goto L21
                if (r0 != r10) goto L19
                p505ts.AbstractC34132o.m107864I(r13)
                goto L6d
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L5b
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3a
            L2a:
                p505ts.AbstractC34132o.m107864I(r13)
                z32.b$f r0 = z32.AbstractC40050b.f.f172789a
                r12.f172800x = r8
                r12.f172799w = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3a
                goto L6c
            L3a:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                z32.c r2 = z32.C40051c.this
                tr2.n r2 = z32.C40051c.m128383b(r2)
                z32.c$b$a r4 = new z32.c$b$a
                z32.c r3 = z32.C40051c.this
                r4.<init>(r3, r8, r11)
                r12.f172800x = r8
                r12.f172799w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "refreshSettings"
                r6 = 2
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L5b
                goto L6c
            L5b:
                u02.a r0 = (u02.InterfaceC34385a) r0
                z32.c$b$b r1 = new z32.c$b$b
                r1.<init>(r8, r11)
                r12.f172800x = r11
                r12.f172799w = r10
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r12)
                if (r0 != r9) goto L6d
            L6c:
                return r9
            L6d:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z32.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOffPregnancyCoaching$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {44, 50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lz32/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172809w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f172810x;

        /* JADX INFO: renamed from: z32.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOffPregnancyCoaching$1$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {45, 46, 47, 49}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f172812E;

            /* JADX INFO: renamed from: w */
            Object f172813w;

            /* JADX INFO: renamed from: x */
            Object f172814x;

            /* JADX INFO: renamed from: y */
            int f172815y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C40051c f172816z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40051c c40051c, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f172816z = c40051c;
                this.f172812E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f172816z, this.f172812E, interfaceC30057d);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x006b A[PHI: r1 r7
              0x006b: PHI (r1v3 com.whoop.pregnancy.api.PregnancySettingsDto) = (r1v2 com.whoop.pregnancy.api.PregnancySettingsDto), (r1v5 com.whoop.pregnancy.api.PregnancySettingsDto) binds: [B:21:0x0068, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
              0x006b: PHI (r7v11 java.lang.Object) = (r7v10 java.lang.Object), (r7v0 java.lang.Object) binds: [B:21:0x0068, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
            
                if (r3.emit(r4, r6) == r0) goto L25;
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
                    int r1 = r6.f172815y
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L36
                    if (r1 == r5) goto L32
                    if (r1 == r4) goto L2e
                    if (r1 == r3) goto L26
                    if (r1 != r2) goto L1e
                    java.lang.Object r0 = r6.f172814x
                    com.whoop.educationModels.FeatureEducationDto r0 = (com.whoop.educationModels.FeatureEducationDto) r0
                    java.lang.Object r0 = r6.f172813w
                    com.whoop.pregnancy.api.PregnancySettingsDto r0 = (com.whoop.pregnancy.api.PregnancySettingsDto) r0
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L82
                L1e:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L26:
                    java.lang.Object r1 = r6.f172813w
                    com.whoop.pregnancy.api.PregnancySettingsDto r1 = (com.whoop.pregnancy.api.PregnancySettingsDto) r1
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L6b
                L2e:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L57
                L32:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L48
                L36:
                    p505ts.AbstractC34132o.m107864I(r7)
                    z32.c r7 = r6.f172816z
                    com.whoop.pregnancy.api.PregnancyCoachingApi r7 = z32.C40051c.m128382a(r7)
                    r6.f172815y = r5
                    java.lang.Object r7 = r7.togglePregnancyCoachingOff(r6)
                    if (r7 != r0) goto L48
                    goto L81
                L48:
                    z32.c r7 = r6.f172816z
                    com.whoop.pregnancy.api.PregnancyCoachingApi r7 = z32.C40051c.m128382a(r7)
                    r6.f172815y = r4
                    java.lang.Object r7 = r7.getPregnancySettingsBff(r6)
                    if (r7 != r0) goto L57
                    goto L81
                L57:
                    r1 = r7
                    com.whoop.pregnancy.api.PregnancySettingsDto r1 = (com.whoop.pregnancy.api.PregnancySettingsDto) r1
                    z32.c r7 = r6.f172816z
                    com.whoop.pregnancy.api.PregnancyCoachingApi r7 = z32.C40051c.m128382a(r7)
                    r6.f172813w = r1
                    r6.f172815y = r3
                    java.lang.Object r7 = r7.getPregnancyEducation(r6)
                    if (r7 != r0) goto L6b
                    goto L81
                L6b:
                    com.whoop.educationModels.FeatureEducationDto r7 = (com.whoop.educationModels.FeatureEducationDto) r7
                    ec3.m r3 = r6.f172812E
                    z32.b$b r4 = new z32.b$b
                    r4.<init>(r1, r7)
                    r7 = 0
                    r6.f172813w = r7
                    r6.f172814x = r7
                    r6.f172815y = r2
                    java.lang.Object r7 = r3.emit(r4, r6)
                    if (r7 != r0) goto L82
                L81:
                    return r0
                L82:
                    l83.a0 r7 = l83.C23454a0.f92919a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: z32.c$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOffPregnancyCoaching$1$2", m100430f = "PregnancySettingsInteractor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f172817w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f172818x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f172818x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f172818x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172817w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f172818x;
                    AbstractC40050b.c cVar = AbstractC40050b.c.f172783a;
                    this.f172817w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C40051c.this.new c(interfaceC30057d);
            cVar.f172810x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r15, r2, r14) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f172810x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f172809w
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L58
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L46
            L23:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                z32.c r15 = z32.C40051c.this
                tr2.n r7 = z32.C40051c.m128383b(r15)
                z32.c$c$a r10 = new z32.c$c$a
                z32.c r15 = z32.C40051c.this
                r10.<init>(r15, r0, r5)
                r14.f172810x = r0
                r14.f172809w = r4
                r8 = 0
                java.lang.String r9 = "turnOffPregnancyCoaching"
                r12 = 2
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L46
                goto L57
            L46:
                u02.a r15 = (u02.InterfaceC34385a) r15
                z32.c$c$b r2 = new z32.c$c$b
                r2.<init>(r0, r5)
                r11.f172810x = r5
                r11.f172809w = r3
                java.lang.Object r15 = u02.AbstractC34386b.m108741f(r15, r2, r14)
                if (r15 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z32.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOnPregnancyCoaching$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {54, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lz32/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172819w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f172820x;

        /* JADX INFO: renamed from: z32.c$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOnPregnancyCoaching$1$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {55, 59}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            Object f172822w;

            /* JADX INFO: renamed from: x */
            int f172823x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C40051c f172824y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC13062m f172825z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40051c c40051c, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f172824y = c40051c;
                this.f172825z = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f172824y, this.f172825z, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
            
                if (r1.emit(r3, r4) == r0) goto L15;
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
                    int r1 = r4.f172823x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r0 = r4.f172822w
                    com.whoop.pregnancy.api.PregnancyOnboardingDto r0 = (com.whoop.pregnancy.api.PregnancyOnboardingDto) r0
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L50
                L14:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L32
                L20:
                    p505ts.AbstractC34132o.m107864I(r5)
                    z32.c r5 = r4.f172824y
                    com.whoop.pregnancy.api.PregnancyCoachingApi r5 = z32.C40051c.m128382a(r5)
                    r4.f172823x = r3
                    java.lang.Object r5 = r5.getPregnancyCoachingOnboarding(r4)
                    if (r5 != r0) goto L32
                    goto L4f
                L32:
                    com.whoop.pregnancy.api.PregnancyOnboardingDto r5 = (com.whoop.pregnancy.api.PregnancyOnboardingDto) r5
                    z32.c r1 = r4.f172824y
                    v32.a r1 = z32.C40051c.m128384c(r1)
                    r1.m112826b()
                    ec3.m r1 = r4.f172825z
                    z32.b$a r3 = new z32.b$a
                    r3.<init>(r5)
                    r5 = 0
                    r4.f172822w = r5
                    r4.f172823x = r2
                    java.lang.Object r5 = r1.emit(r3, r4)
                    if (r5 != r0) goto L50
                L4f:
                    return r0
                L50:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: z32.c$d$b */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOnPregnancyCoaching$1$2", m100430f = "PregnancySettingsInteractor.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f172826w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f172827x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f172827x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f172827x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172826w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f172827x;
                    AbstractC40050b.c cVar = AbstractC40050b.c.f172783a;
                    this.f172826w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C40051c.this.new d(interfaceC30057d);
            dVar.f172820x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r15, r2, r14) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f172820x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f172819w
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L58
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L46
            L23:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                z32.c r15 = z32.C40051c.this
                tr2.n r7 = z32.C40051c.m128383b(r15)
                z32.c$d$a r10 = new z32.c$d$a
                z32.c r15 = z32.C40051c.this
                r10.<init>(r15, r0, r5)
                r14.f172820x = r0
                r14.f172819w = r4
                r8 = 0
                java.lang.String r9 = "turnOnPregnancyCoaching"
                r12 = 2
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L46
                goto L57
            L46:
                u02.a r15 = (u02.InterfaceC34385a) r15
                z32.c$d$b r2 = new z32.c$d$b
                r2.<init>(r0, r5)
                r11.f172820x = r5
                r11.f172819w = r3
                java.lang.Object r15 = u02.AbstractC34386b.m108741f(r15, r2, r14)
                if (r15 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z32.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {64, 66, 80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lz32/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f172828E;

        /* JADX INFO: renamed from: w */
        int f172829w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f172830x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f172832z;

        /* JADX INFO: renamed from: z32.c$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {67, 69, 79}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a;", "Ll83/a0;", "<anonymous>", "()Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f172833E;

            /* JADX INFO: renamed from: w */
            int f172834w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40051c f172835x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f172836y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f172837z;

            /* JADX INFO: renamed from: z32.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$1$1", m100430f = "PregnancySettingsInteractor.kt", m100431l = {70, 71, 74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 77}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42724a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ C40051c f172838E;

                /* JADX INFO: renamed from: F */
                final /* synthetic */ boolean f172839F;

                /* JADX INFO: renamed from: G */
                final /* synthetic */ InterfaceC13062m f172840G;

                /* JADX INFO: renamed from: w */
                Object f172841w;

                /* JADX INFO: renamed from: x */
                Object f172842x;

                /* JADX INFO: renamed from: y */
                Object f172843y;

                /* JADX INFO: renamed from: z */
                int f172844z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42724a(C40051c c40051c, boolean z4, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C42724a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f172838E = c40051c;
                    this.f172839F = z4;
                    this.f172840G = interfaceC13062m;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C42724a(this.f172838E, this.f172839F, this.f172840G, interfaceC30057d);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0076  */
                /* JADX WARN: Code duplicated, block: B:29:0x0089  */
                /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
                
                    if (r4.emit(r5, r9) == r0) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
                
                    if (r3.emit(r4, r9) == r0) goto L35;
                 */
                @Override // s83.AbstractC32267a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        r83.a r0 = r83.EnumC31071a.f128113w
                        int r1 = r9.f172844z
                        r2 = 5
                        r3 = 4
                        r4 = 3
                        r5 = 2
                        r6 = 1
                        r7 = 0
                        if (r1 == 0) goto L48
                        if (r1 == r6) goto L44
                        if (r1 == r5) goto L3c
                        if (r1 == r4) goto L30
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        goto L23
                    L17:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1f:
                        java.lang.Object r0 = r9.f172843y
                        com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto r0 = (com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto) r0
                    L23:
                        java.lang.Object r0 = r9.f172842x
                        com.whoop.educationModels.FeatureEducationDto r0 = (com.whoop.educationModels.FeatureEducationDto) r0
                        java.lang.Object r0 = r9.f172841w
                        com.whoop.pregnancy.api.PregnancySettingsDto r0 = (com.whoop.pregnancy.api.PregnancySettingsDto) r0
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto Lb9
                    L30:
                        java.lang.Object r1 = r9.f172842x
                        com.whoop.educationModels.FeatureEducationDto r1 = (com.whoop.educationModels.FeatureEducationDto) r1
                        java.lang.Object r2 = r9.f172841w
                        com.whoop.pregnancy.api.PregnancySettingsDto r2 = (com.whoop.pregnancy.api.PregnancySettingsDto) r2
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto L8d
                    L3c:
                        java.lang.Object r1 = r9.f172841w
                        com.whoop.pregnancy.api.PregnancySettingsDto r1 = (com.whoop.pregnancy.api.PregnancySettingsDto) r1
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto L70
                    L44:
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto L5a
                    L48:
                        p505ts.AbstractC34132o.m107864I(r10)
                        z32.c r10 = r9.f172838E
                        com.whoop.pregnancy.api.PregnancyCoachingApi r10 = z32.C40051c.m128382a(r10)
                        r9.f172844z = r6
                        java.lang.Object r10 = r10.getPregnancySettingsBff(r9)
                        if (r10 != r0) goto L5a
                        goto Lb8
                    L5a:
                        com.whoop.pregnancy.api.PregnancySettingsDto r10 = (com.whoop.pregnancy.api.PregnancySettingsDto) r10
                        z32.c r1 = r9.f172838E
                        com.whoop.pregnancy.api.PregnancyCoachingApi r1 = z32.C40051c.m128382a(r1)
                        r9.f172841w = r10
                        r9.f172844z = r5
                        java.lang.Object r1 = r1.getPregnancyEducation(r9)
                        if (r1 != r0) goto L6d
                        goto Lb8
                    L6d:
                        r8 = r1
                        r1 = r10
                        r10 = r8
                    L70:
                        com.whoop.educationModels.FeatureEducationDto r10 = (com.whoop.educationModels.FeatureEducationDto) r10
                        boolean r5 = r9.f172839F
                        if (r5 == 0) goto La5
                        z32.c r2 = r9.f172838E
                        com.whoop.pregnancy.api.PregnancyCoachingApi r2 = z32.C40051c.m128382a(r2)
                        r9.f172841w = r1
                        r9.f172842x = r10
                        r9.f172844z = r4
                        java.lang.Object r2 = r2.onboardingDueDateSaved(r9)
                        if (r2 != r0) goto L89
                        goto Lb8
                    L89:
                        r8 = r1
                        r1 = r10
                        r10 = r2
                        r2 = r8
                    L8d:
                        com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto r10 = (com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto) r10
                        ec3.m r4 = r9.f172840G
                        z32.b$d r5 = new z32.b$d
                        r5.<init>(r10, r2, r1)
                        r9.f172841w = r7
                        r9.f172842x = r7
                        r9.f172843y = r7
                        r9.f172844z = r3
                        java.lang.Object r10 = r4.emit(r5, r9)
                        if (r10 != r0) goto Lb9
                        goto Lb8
                    La5:
                        ec3.m r3 = r9.f172840G
                        z32.b$e r4 = new z32.b$e
                        r4.<init>(r1, r10)
                        r9.f172841w = r7
                        r9.f172842x = r7
                        r9.f172844z = r2
                        java.lang.Object r10 = r3.emit(r4, r9)
                        if (r10 != r0) goto Lb9
                    Lb8:
                        return r0
                    Lb9:
                        l83.a0 r10 = l83.C23454a0.f92919a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.e.a.C42724a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C42724a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX INFO: renamed from: z32.c$e$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$1$2", m100430f = "PregnancySettingsInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f172845w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC13062m f172846x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f172846x = interfaceC13062m;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new b(this.f172846x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f172845w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = this.f172846x;
                        AbstractC40050b.c cVar = AbstractC40050b.c.f172783a;
                        this.f172845w = 1;
                        if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40051c c40051c, String str, boolean z4, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f172835x = c40051c;
                this.f172836y = str;
                this.f172837z = z4;
                this.f172833E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f172835x, this.f172836y, this.f172837z, this.f172833E, interfaceC30057d);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0073 A[RETURN] */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objM108741f;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172834w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    PregnancyCoachingApi pregnancyCoachingApi = this.f172835x.api;
                    EnablePregnancyCoachingBody enablePregnancyCoachingBody = new EnablePregnancyCoachingBody(this.f172836y);
                    this.f172834w = 1;
                    if (pregnancyCoachingApi.updateDueDate(enablePregnancyCoachingBody, this) == enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    aVar = this;
                }
                b bVar = new b(aVar.f172833E, null);
                aVar.f172834w = 3;
                objM108741f = AbstractC34386b.m108741f((InterfaceC34385a) obj, bVar, this);
                if (objM108741f != enumC31071a) {
                    return enumC31071a;
                }
                return objM108741f;
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f172835x.logger;
                C42724a c42724a = new C42724a(this.f172835x, this.f172837z, this.f172833E, null);
                this.f172834w = 2;
                aVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "updateDueDate - refresh data", c42724a, aVar, 2, null);
                if (obj != enumC31071a) {
                    b bVar2 = new b(aVar.f172833E, null);
                    aVar.f172834w = 3;
                    objM108741f = AbstractC34386b.m108741f((InterfaceC34385a) obj, bVar2, this);
                    if (objM108741f != enumC31071a) {
                        return objM108741f;
                    }
                }
                return enumC31071a;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super InterfaceC34385a<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: z32.c$e$b */
        @InterfaceC32271e(m100429c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$2", m100430f = "PregnancySettingsInteractor.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lu02/a;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f172847w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f172848x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f172849y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, String str, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f172848x = interfaceC13062m;
                this.f172849y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f172848x, this.f172849y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<? extends InterfaceC34385a<C23454a0>> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172847w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f172848x;
                    AbstractC40050b.g gVar = new AbstractC40050b.g(this.f172849y);
                    this.f172847w = 1;
                    if (interfaceC13062m.emit(gVar, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z4, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172832z = str;
            this.f172828E = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C40051c.this.new e(this.f172832z, this.f172828E, interfaceC30057d);
            eVar.f172830x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r0, r1, r14) == r12) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f172830x
                r10 = r0
                ec3.m r10 = (ec3.InterfaceC13062m) r10
                r83.a r12 = r83.EnumC31071a.f128113w
                int r0 = r14.f172829w
                r13 = 3
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L29
                if (r0 == r2) goto L25
                if (r0 == r1) goto L20
                if (r0 != r13) goto L18
                p505ts.AbstractC34132o.m107864I(r15)
                goto L75
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L60
            L25:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L39
            L29:
                p505ts.AbstractC34132o.m107864I(r15)
                z32.b$h r0 = z32.AbstractC40050b.h.f172791a
                r14.f172830x = r10
                r14.f172829w = r2
                java.lang.Object r0 = r10.emit(r0, r14)
                if (r0 != r12) goto L39
                goto L74
            L39:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                z32.c r2 = z32.C40051c.this
                tr2.n r2 = z32.C40051c.m128383b(r2)
                z32.c$e$a r4 = new z32.c$e$a
                z32.c r7 = z32.C40051c.this
                java.lang.String r8 = r14.f172832z
                boolean r9 = r14.f172828E
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r14.f172830x = r10
                r14.f172829w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "updateDueDate"
                r6 = 2
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r12) goto L60
                goto L74
            L60:
                u02.a r0 = (u02.InterfaceC34385a) r0
                z32.c$e$b r1 = new z32.c$e$b
                java.lang.String r2 = r14.f172832z
                r3 = 0
                r1.<init>(r10, r2, r3)
                r14.f172830x = r3
                r14.f172829w = r13
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r14)
                if (r0 != r12) goto L75
            L74:
                return r12
            L75:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z32.C40051c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C40051c(PregnancyCoachingApi api, C35613a pregnancyAnalytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(pregnancyAnalytics, "pregnancyAnalytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.pregnancyAnalytics = pregnancyAnalytics;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m128389i() {
        return new C13084s1(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m128390j() {
        return new C13084s1(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m128391k() {
        return new C13084s1(new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m128392l(String dueDate, boolean fromOnboarding) {
        return new C13084s1(new e(dueDate, fromOnboarding, null));
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m128393h(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }
}
