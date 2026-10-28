package c82;

import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.InterfaceC23457c;
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

/* JADX INFO: renamed from: c82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lc82/a;", "", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "Ltd1/b;", "whoopStrapProxy", "<init>", "(Lci2/b;Ltr2/n;Ltd1/b;)V", "a", "Ltr2/n;", "b", "Ltd1/b;", "Lec3/l;", "Lsj0/a;", "c", "Lec3/l;", "getHrRealtimeStreamFlow", "()Lec3/l;", "getHrRealtimeStreamFlow$annotations", "()V", "hrRealtimeStreamFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C4308a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l hrRealtimeStreamFlow;

    /* JADX INFO: renamed from: c82.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sdk.hrstream.HrSdk$special$$inlined$flatMapLatest$1", m100430f = "HrSdk.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f17491w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f17492x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f17493y;

        public a(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f17492x = interfaceC13062m;
            aVar.f17493y = interfaceC21750d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lMo24712Y0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17491w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f17492x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f17493y;
                if (interfaceC21750d == null || (interfaceC13058lMo24712Y0 = interfaceC21750d.mo24712Y0()) == null) {
                    interfaceC13058lMo24712Y0 = C13054k.f45116w;
                }
                this.f17492x = null;
                this.f17493y = null;
                this.f17491w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo24712Y0, this) == enumC31071a) {
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

    public C4308a(InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger, InterfaceC33704b whoopStrapProxy) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        this.logger = logger;
        this.whoopStrapProxy = whoopStrapProxy;
        this.hrRealtimeStreamFlow = AbstractC13091v.m36590P(whoopStrapProvider.mo14819c(), new a(null));
    }
}
