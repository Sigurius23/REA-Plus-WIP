package ys1;

import com.whoop.labrador.domain.LabradorApi;
import com.whoop.labrador.feature.about.domain.models.LabradorAboutResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ys1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lys1/c;", "", "Lcom/whoop/labrador/domain/LabradorApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/labrador/domain/LabradorApi;Ltr2/n;)V", "Lys1/b;", "c", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lys1/a;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/labrador/domain/LabradorApi;", "b", "Ltr2/n;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39753c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LabradorApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ys1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.about.domain.LabradorAboutInteractor", m100430f = "LabradorAboutInteractor.kt", m100431l = {20}, m100432m = "getLabradorAboutBff", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171137w;

        /* JADX INFO: renamed from: y */
        int f171139y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171137w = obj;
            this.f171139y |= Integer.MIN_VALUE;
            return C39753c.this.m127166c(this);
        }
    }

    /* JADX INFO: renamed from: ys1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.about.domain.LabradorAboutInteractor$getLabradorAboutBff$2", m100430f = "LabradorAboutInteractor.kt", m100431l = {21}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f171140w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C39753c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171140w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LabradorApi labradorApi = C39753c.this.api;
            this.f171140w = 1;
            Object labradorAboutScreen = labradorApi.getLabradorAboutScreen(this);
            return labradorAboutScreen == enumC31071a ? enumC31071a : labradorAboutScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super LabradorAboutResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ys1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.about.domain.LabradorAboutInteractor$interact$1", m100430f = "LabradorAboutInteractor.kt", m100431l = {16}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lys1/b;", "<unused var>", "Lys1/a;", "domainAction", "<anonymous>", "(Lys1/b;Lys1/a;)Lys1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f171142w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171143x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC39752b interfaceC39752b, InterfaceC39751a interfaceC39751a, InterfaceC30057d<? super InterfaceC39752b> interfaceC30057d) {
            c cVar = C39753c.this.new c(interfaceC30057d);
            cVar.f171143x = interfaceC39751a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC39751a interfaceC39751a = (InterfaceC39751a) this.f171143x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171142w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC22676k.m65745e(interfaceC39751a, InterfaceC39751a.a.f171131a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C39753c c39753c = C39753c.this;
                this.f171143x = null;
                this.f171142w = 1;
                obj = c39753c.m127166c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC39752b) obj;
        }
    }

    public C39753c(LabradorApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m127166c(InterfaceC30057d<? super InterfaceC39752b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f171139y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f171139y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f171137w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f171139y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f171139y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch labrador about screen", bVar, aVar2, 2, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC39752b.a.f171132a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC39752b.b((LabradorAboutResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m127167d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC39752b.c.f171134a, upstream, new c(null));
    }
}
