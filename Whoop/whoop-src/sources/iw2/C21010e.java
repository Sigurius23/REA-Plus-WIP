package iw2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.whattoexpect.domain.WhatToExpectApi;
import com.whoop.whattoexpect.domain.models.WhatToExpectResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import gw2.C16269a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s21.C32085h;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: iw2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Liw2/e;", "", "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;", "api", "Ltr2/n;", "logger", "Lgw2/a;", "analyticsHelper", "<init>", "(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;Lgw2/a;)V", "Liw2/b;", "accumulator", "Liw2/a$b;", "action", "g", "(Liw2/b;Liw2/a$b;)Liw2/b;", "f", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Liw2/a;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;", "b", "Ltr2/n;", "c", "Lgw2/a;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21010e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WhatToExpectApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16269a analyticsHelper;

    /* JADX INFO: renamed from: iw2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.domain.WhatToExpectInteractor$interact$1", m100430f = "WhatToExpectInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Liw2/b;", "accumulator", "Liw2/a;", "action", "<anonymous>", "(Liw2/b;Liw2/a;)Liw2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79514w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79515x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79516y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC21007b interfaceC21007b, InterfaceC21006a interfaceC21006a, InterfaceC30057d<? super InterfaceC21007b> interfaceC30057d) {
            a aVar = C21010e.this.new a(interfaceC30057d);
            aVar.f79515x = interfaceC21007b;
            aVar.f79516y = interfaceC21006a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC21007b interfaceC21007b = (InterfaceC21007b) this.f79515x;
            InterfaceC21006a interfaceC21006a = (InterfaceC21006a) this.f79516y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79514w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(interfaceC21006a instanceof InterfaceC21006a.a)) {
                    if (!(interfaceC21006a instanceof InterfaceC21006a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC21006a.b bVar = (InterfaceC21006a.b) interfaceC21006a;
                    C32085h milestone = bVar.getMilestone();
                    if (milestone != null) {
                        C21010e.this.analyticsHelper.m46086a(false, milestone.getId());
                    }
                    return C21010e.this.m58575g(interfaceC21007b, bVar);
                }
                C21010e c21010e = C21010e.this;
                this.f79515x = null;
                this.f79516y = interfaceC21006a;
                this.f79514w = 1;
                obj = c21010e.m58574f(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C21010e c21010e2 = C21010e.this;
            InterfaceC21007b interfaceC21007b2 = (InterfaceC21007b) obj;
            if (((InterfaceC21006a.a) interfaceC21006a).getIsInitialLoad()) {
                c21010e2.analyticsHelper.m46088c();
            }
            return interfaceC21007b2;
        }
    }

    /* JADX INFO: renamed from: iw2.e$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.domain.WhatToExpectInteractor", m100430f = "WhatToExpectInteractor.kt", m100431l = {44}, m100432m = "loadBffData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f79518w;

        /* JADX INFO: renamed from: y */
        int f79520y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79518w = obj;
            this.f79520y |= Integer.MIN_VALUE;
            return C21010e.this.m58574f(this);
        }
    }

    /* JADX INFO: renamed from: iw2.e$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.domain.WhatToExpectInteractor$loadBffData$response$1", m100430f = "WhatToExpectInteractor.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79521w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21010e.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79521w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhatToExpectApi whatToExpectApi = C21010e.this.api;
            this.f79521w = 1;
            Object whatToExpectData = whatToExpectApi.getWhatToExpectData(this);
            return whatToExpectData == enumC31071a ? enumC31071a : whatToExpectData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WhatToExpectResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C21010e(WhatToExpectApi api, InterfaceC34116n logger, C16269a analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m58574f(InterfaceC30057d<? super InterfaceC21007b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f79520y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f79520y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f79518w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f79520y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f79520y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get What to Expect data", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC21007b.c((WhatToExpectResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, 2, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC21007b.a.f79499a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC21007b m58575g(InterfaceC21007b accumulator, InterfaceC21006a.b action) {
        return accumulator instanceof InterfaceC21007b.c ? InterfaceC21007b.c.m58562b((InterfaceC21007b.c) accumulator, null, action.getMilestone(), 1, null) : accumulator;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m58576e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC21007b.b.f79500a, upstream, new a(null));
    }

    public /* synthetic */ C21010e(WhatToExpectApi whatToExpectApi, InterfaceC34116n interfaceC34116n, C16269a c16269a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(whatToExpectApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("WhatToExpectInteractor") : interfaceC34116n, c16269a);
    }
}
