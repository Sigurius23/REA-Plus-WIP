package kj1;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj1.C17364a;
import java.util.Set;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj1.C29298b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: kj1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkj1/c;", "", "Lpj1/b;", "healthConnectRepository", "Lhj1/a;", "analyticsHelper", "<init>", "(Lpj1/b;Lhj1/a;)V", "Lkj1/b;", "c", "(Lq83/d;)Ljava/lang/Object;", "d", "()Lkj1/b;", "Lec3/l;", "Lkj1/a;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lpj1/b;", "b", "Lhj1/a;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22516c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29298b healthConnectRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17364a analyticsHelper;

    /* JADX INFO: renamed from: kj1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.domain.HealthConnectInteractor", m100430f = "HealthConnectInteractor.kt", m100431l = {29, 31, 31}, m100432m = "checkPermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f88250F;

        /* JADX INFO: renamed from: w */
        Object f88251w;

        /* JADX INFO: renamed from: x */
        int f88252x;

        /* JADX INFO: renamed from: y */
        boolean f88253y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f88254z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88254z = obj;
            this.f88250F |= Integer.MIN_VALUE;
            return C22516c.this.m65020c(this);
        }
    }

    /* JADX INFO: renamed from: kj1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88255w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22516c f88256x;

        /* JADX INFO: renamed from: kj1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88257w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22516c f88258x;

            /* JADX INFO: renamed from: kj1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.domain.HealthConnectInteractor$interact$$inlined$map$1$2", m100430f = "HealthConnectInteractor.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41902a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88259E;

                /* JADX INFO: renamed from: F */
                Object f88260F;

                /* JADX INFO: renamed from: G */
                Object f88261G;

                /* JADX INFO: renamed from: H */
                Object f88262H;

                /* JADX INFO: renamed from: I */
                Object f88263I;

                /* JADX INFO: renamed from: J */
                Object f88264J;

                /* JADX INFO: renamed from: K */
                int f88265K;

                /* JADX INFO: renamed from: L */
                int f88266L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88267w;

                /* JADX INFO: renamed from: x */
                int f88268x;

                /* JADX INFO: renamed from: y */
                Object f88269y;

                public C41902a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88267w = obj;
                    this.f88268x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22516c c22516c) {
                this.f88257w = interfaceC13062m;
                this.f88258x = c22516c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L32;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kj1.C22516c.b.a.C41902a
                    if (r0 == 0) goto L13
                    r0 = r9
                    kj1.c$b$a$a r0 = (kj1.C22516c.b.a.C41902a) r0
                    int r1 = r0.f88268x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f88268x = r1
                    goto L18
                L13:
                    kj1.c$b$a$a r0 = new kj1.c$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f88267w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f88268x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.f88261G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f88259E
                    kj1.c$b$a$a r8 = (kj1.C22516c.b.a.C41902a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto Lae
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f88265K
                    java.lang.Object r2 = r0.f88264J
                    kj1.a r2 = (kj1.AbstractC22514a) r2
                    java.lang.Object r2 = r0.f88263I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f88262H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f88261G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f88259E
                    kj1.c$b$a$a r4 = (kj1.C22516c.b.a.C41902a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L80
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f88257w
                    kj1.a r8 = (kj1.AbstractC22514a) r8
                    boolean r9 = r8 instanceof kj1.AbstractC22514a.a
                    r6 = 0
                    if (r9 == 0) goto L82
                    kj1.c r8 = r7.f88258x
                    r0.f88269y = r5
                    r0.f88259E = r5
                    r0.f88260F = r5
                    r0.f88261G = r5
                    r0.f88262H = r2
                    r0.f88263I = r5
                    r0.f88264J = r5
                    r0.f88265K = r6
                    r0.f88266L = r6
                    r0.f88268x = r4
                    java.lang.Object r9 = kj1.C22516c.m65018a(r8, r0)
                    if (r9 != r1) goto L7f
                    goto Lad
                L7f:
                    r8 = r6
                L80:
                    r6 = r8
                    goto L95
                L82:
                    boolean r9 = r8 instanceof kj1.AbstractC22514a.b
                    if (r9 == 0) goto L8e
                    kj1.c r8 = r7.f88258x
                    kj1.b r8 = kj1.C22516c.m65019b(r8)
                L8c:
                    r9 = r8
                    goto L95
                L8e:
                    boolean r8 = r8 instanceof kj1.AbstractC22514a.c
                    if (r8 == 0) goto Lb1
                    kj1.b$c r8 = kj1.InterfaceC22515b.c.f88243a
                    goto L8c
                L95:
                    r0.f88269y = r5
                    r0.f88259E = r5
                    r0.f88260F = r5
                    r0.f88261G = r5
                    r0.f88262H = r5
                    r0.f88263I = r5
                    r0.f88264J = r5
                    r0.f88265K = r6
                    r0.f88268x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto Lae
                Lad:
                    return r1
                Lae:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                Lb1:
                    kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kj1.C22516c.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C22516c c22516c) {
            this.f88255w = interfaceC13058l;
            this.f88256x = c22516c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88255w.collect(new a(interfaceC13062m, this.f88256x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22516c(C29298b healthConnectRepository, C17364a analyticsHelper) {
        AbstractC22676k.m65750j(healthConnectRepository, "healthConnectRepository");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.healthConnectRepository = healthConnectRepository;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m65020c(InterfaceC30057d<? super InterfaceC22515b> interfaceC30057d) {
        a aVar;
        int i13;
        C29298b c29298b;
        C29298b c29298b2;
        boolean zBooleanValue;
        Object objM88924e;
        boolean z4;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f88250F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f88250F = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM88935r = aVar.f88254z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f88250F;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM88935r);
            C29298b c29298b3 = this.healthConnectRepository;
            aVar.f88251w = c29298b3;
            i13 = 0;
            aVar.f88252x = 0;
            aVar.f88250F = 1;
            Object objM88925f = c29298b3.m88925f(aVar);
            if (objM88925f != enumC31071a) {
                c29298b = c29298b3;
                objM88935r = objM88925f;
            }
            return enumC31071a;
        }
        if (i15 == 1) {
            i13 = aVar.f88252x;
            c29298b = (C29298b) aVar.f88251w;
            AbstractC34132o.m107864I(objM88935r);
        } else {
            if (i15 == 2) {
                i13 = aVar.f88252x;
                c29298b2 = (C29298b) aVar.f88251w;
                AbstractC34132o.m107864I(objM88935r);
                zBooleanValue = ((Boolean) objM88935r).booleanValue();
                aVar.f88251w = null;
                aVar.f88252x = i13;
                aVar.f88253y = zBooleanValue;
                aVar.f88250F = 3;
                objM88924e = c29298b2.m88924e(aVar);
                if (objM88924e != enumC31071a) {
                    z4 = zBooleanValue;
                    objM88935r = objM88924e;
                }
                return enumC31071a;
            }
            if (i15 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = aVar.f88253y;
            AbstractC34132o.m107864I(objM88935r);
        }
        return new InterfaceC22515b.a(z4, (Set) objM88935r);
        if (!((Boolean) objM88935r).booleanValue()) {
            this.analyticsHelper.m49170e("Settings");
            return InterfaceC22515b.d.f88244a;
        }
        this.analyticsHelper.m49169d("Settings");
        aVar.f88251w = c29298b;
        aVar.f88252x = i13;
        aVar.f88250F = 2;
        objM88935r = c29298b.m88935r(aVar);
        if (objM88935r != enumC31071a) {
            c29298b2 = c29298b;
            zBooleanValue = ((Boolean) objM88935r).booleanValue();
            aVar.f88251w = null;
            aVar.f88252x = i13;
            aVar.f88253y = zBooleanValue;
            aVar.f88250F = 3;
            objM88924e = c29298b2.m88924e(aVar);
            if (objM88924e != enumC31071a) {
                z4 = zBooleanValue;
                objM88935r = objM88924e;
                return new InterfaceC22515b.a(z4, (Set) objM88935r);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC22515b m65021d() {
        C29298b c29298b = this.healthConnectRepository;
        if (c29298b.m88926g()) {
            return InterfaceC22515b.d.f88244a;
        }
        return c29298b.m88927h() ? InterfaceC22515b.e.f88245a : InterfaceC22515b.f.f88246a;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m65022e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
