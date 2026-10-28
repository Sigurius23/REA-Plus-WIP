package iw2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.whattoexpect.domain.WhatToExpectApi;
import com.whoop.whattoexpect.domain.models.WhatToExpectEntryPointResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: iw2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Liw2/c;", "", "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;)V", "Lq83/j;", "coroutineContext", "Liw2/d;", "c", "(Lq83/j;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;", "b", "Ltr2/n;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21008c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WhatToExpectApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: iw2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.domain.WhatToExpectEntryPointInteractor$interact$2", m100430f = "WhatToExpectEntryPointInteractor.kt", m100431l = {14}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Liw2/d;", "<anonymous>", "(Lbc3/c0;)Liw2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79505w;

        /* JADX INFO: renamed from: iw2.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.domain.WhatToExpectEntryPointInteractor$interact$2$response$1", m100430f = "WhatToExpectEntryPointInteractor.kt", m100431l = {15}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41807a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f79507w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21008c f79508x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41807a(C21008c c21008c, InterfaceC30057d<? super C41807a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f79508x = c21008c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41807a(this.f79508x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79507w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WhatToExpectApi whatToExpectApi = this.f79508x.api;
                this.f79507w = 1;
                Object whatToExpectEntryPoint = whatToExpectApi.getWhatToExpectEntryPoint(this);
                return whatToExpectEntryPoint == enumC31071a ? enumC31071a : whatToExpectEntryPoint;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super WhatToExpectEntryPointResponse> interfaceC30057d) {
                return ((C41807a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21008c.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC21009d> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79505w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C21008c.this.logger;
                C41807a c41807a = new C41807a(C21008c.this, null);
                this.f79505w = 1;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get What to Expect entry point", c41807a, this, 2, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return new InterfaceC21009d.b((WhatToExpectEntryPointResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return InterfaceC21009d.a.f79509a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C21008c(WhatToExpectApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    public final Object m58568c(InterfaceC30063j interfaceC30063j, InterfaceC30057d<? super InterfaceC21009d> interfaceC30057d) {
        return AbstractC3006f0.m8705K(interfaceC30063j, new a(null), interfaceC30057d);
    }
}
