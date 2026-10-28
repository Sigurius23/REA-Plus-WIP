package d82;

import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import zj0.C40726g1;

/* JADX INFO: renamed from: d82.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Ld82/b;", "Ld82/a;", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "Ltd1/b;", "whoopStrapProxy", "<init>", "(Lci2/b;Ltr2/n;Ltd1/b;)V", "", "enabled", "Lzj0/g1;", "a", "(ZLq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Ltd1/b;", "Lec3/l;", "Ldk0/h;", "c", "Lec3/l;", "getImuDataStreamFlow", "()Lec3/l;", "getImuDataStreamFlow$annotations", "()V", "imuDataStreamFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11778b implements InterfaceC11777a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l imuDataStreamFlow;

    /* JADX INFO: renamed from: d82.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.sdk.imustream.ImuSdkImpl$special$$inlined$flatMapLatest$1", m100430f = "ImuSdk.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f38170w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f38171x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f38172y;

        public a(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f38171x = interfaceC13062m;
            aVar.f38172y = interfaceC21750d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lMo24745q0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38170w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f38171x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f38172y;
                if (interfaceC21750d == null || (interfaceC13058lMo24745q0 = interfaceC21750d.mo24745q0()) == null) {
                    interfaceC13058lMo24745q0 = C13054k.f45116w;
                }
                this.f38171x = null;
                this.f38172y = null;
                this.f38170w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo24745q0, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C11778b(InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger, InterfaceC33704b whoopStrapProxy) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        this.logger = logger;
        this.whoopStrapProxy = whoopStrapProxy;
        this.imuDataStreamFlow = AbstractC13091v.m36590P(whoopStrapProvider.mo14819c(), new a(null));
    }

    @Override // d82.InterfaceC11777a
    /* JADX INFO: renamed from: a */
    public Object mo31571a(boolean z4, InterfaceC30057d<? super C40726g1> interfaceC30057d) {
        return InterfaceC33704b.m106482s(this.whoopStrapProxy, z4, 0L, interfaceC30057d, 2, null);
    }
}
