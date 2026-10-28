package kc2;

import com.whoop.settings.referafriend.ReferAFriendCtaTileApi;
import com.whoop.settings.referafriend.model.ReferAFriendModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: kc2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkc2/g;", "Lod1/g;", "Lkc2/c;", "Lkc2/d;", "Lcom/whoop/settings/referafriend/ReferAFriendCtaTileApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/settings/referafriend/ReferAFriendCtaTileApi;Ltr2/n;)V", "", "source", "Lcom/whoop/settings/referafriend/model/ReferAFriendModel;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/settings/referafriend/ReferAFriendCtaTileApi;", "b", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22357g implements InterfaceC27844g<AbstractC22353c, AbstractC22354d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReferAFriendCtaTileApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kc2.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendInteractor", m100430f = "SettingsReferAFriendInteractor.kt", m100431l = {29}, m100432m = "fetchRafData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f87230w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87231x;

        /* JADX INFO: renamed from: z */
        int f87233z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87231x = obj;
            this.f87233z |= Integer.MIN_VALUE;
            return C22357g.this.m64264e(null, this);
        }
    }

    /* JADX INFO: renamed from: kc2.g$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendInteractor$fetchRafData$response$1", m100430f = "SettingsReferAFriendInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/referafriend/model/ReferAFriendModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f87234w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f87236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f87236y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22357g.this.new b(this.f87236y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87234w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReferAFriendCtaTileApi referAFriendCtaTileApi = C22357g.this.api;
            String str = this.f87236y;
            this.f87234w = 1;
            Object rafData = referAFriendCtaTileApi.getRafData(str, this);
            return rafData == enumC31071a ? enumC31071a : rafData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReferAFriendModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: kc2.g$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22357g f87238x;

        /* JADX INFO: renamed from: kc2.g$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87239w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22357g f87240x;

            /* JADX INFO: renamed from: kc2.g$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriend.SettingsReferAFriendInteractor$interact$$inlined$map$1$2", m100430f = "SettingsReferAFriendInteractor.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41882a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87241E;

                /* JADX INFO: renamed from: F */
                Object f87242F;

                /* JADX INFO: renamed from: G */
                Object f87243G;

                /* JADX INFO: renamed from: H */
                Object f87244H;

                /* JADX INFO: renamed from: I */
                Object f87245I;

                /* JADX INFO: renamed from: J */
                Object f87246J;

                /* JADX INFO: renamed from: K */
                int f87247K;

                /* JADX INFO: renamed from: L */
                int f87248L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87249w;

                /* JADX INFO: renamed from: x */
                int f87250x;

                /* JADX INFO: renamed from: y */
                Object f87251y;

                public C41882a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87249w = obj;
                    this.f87250x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22357g c22357g) {
                this.f87239w = interfaceC13062m;
                this.f87240x = c22357g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
            
                if (r2.emit(r4, r0) == r1) goto L28;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kc2.C22357g.c.a.C41882a
                    if (r0 == 0) goto L13
                    r0 = r9
                    kc2.g$c$a$a r0 = (kc2.C22357g.c.a.C41882a) r0
                    int r1 = r0.f87250x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f87250x = r1
                    goto L18
                L13:
                    kc2.g$c$a$a r0 = new kc2.g$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f87249w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f87250x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.f87243G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f87241E
                    kc2.g$c$a$a r8 = (kc2.C22357g.c.a.C41882a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto Lab
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f87247K
                    java.lang.Object r2 = r0.f87246J
                    kc2.c r2 = (kc2.AbstractC22353c) r2
                    java.lang.Object r2 = r0.f87245I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f87244H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f87243G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f87241E
                    kc2.g$c$a$a r4 = (kc2.C22357g.c.a.C41882a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L86
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f87239w
                    kc2.c r8 = (kc2.AbstractC22353c) r8
                    boolean r9 = r8 instanceof kc2.AbstractC22353c.a
                    if (r9 == 0) goto Lae
                    kc2.g r9 = r7.f87240x
                    kc2.c$a r8 = (kc2.AbstractC22353c.a) r8
                    java.lang.String r8 = r8.getSource()
                    r0.f87251y = r5
                    r0.f87241E = r5
                    r0.f87242F = r5
                    r0.f87243G = r5
                    r0.f87244H = r2
                    r0.f87245I = r5
                    r0.f87246J = r5
                    r6 = 0
                    r0.f87247K = r6
                    r0.f87248L = r6
                    r0.f87250x = r4
                    java.lang.Object r9 = kc2.C22357g.m64262c(r9, r8, r0)
                    if (r9 != r1) goto L85
                    goto Laa
                L85:
                    r8 = r6
                L86:
                    com.whoop.settings.referafriend.model.ReferAFriendModel r9 = (com.whoop.settings.referafriend.model.ReferAFriendModel) r9
                    if (r9 == 0) goto L90
                    kc2.d$b r4 = new kc2.d$b
                    r4.<init>(r9)
                    goto L92
                L90:
                    kc2.d$a r4 = kc2.AbstractC22354d.a.f87215a
                L92:
                    r0.f87251y = r5
                    r0.f87241E = r5
                    r0.f87242F = r5
                    r0.f87243G = r5
                    r0.f87244H = r5
                    r0.f87245I = r5
                    r0.f87246J = r5
                    r0.f87247K = r8
                    r0.f87250x = r3
                    java.lang.Object r8 = r2.emit(r4, r0)
                    if (r8 != r1) goto Lab
                Laa:
                    return r1
                Lab:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                Lae:
                    kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kc2.C22357g.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C22357g c22357g) {
            this.f87237w = interfaceC13058l;
            this.f87238x = c22357g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87237w.collect(new a(interfaceC13062m, this.f87238x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22357g(ReferAFriendCtaTileApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m64264e(String str, InterfaceC30057d<? super ReferAFriendModel> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f87233z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f87233z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f87231x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f87233z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f87230w = null;
            aVar2.f87233z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(upstream, this);
    }
}
