package ht1;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ht1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lht1/c;", "", "Ltr2/n;", "logger", "Lqk1/b;", "dao", "<init>", "(Ltr2/n;Lqk1/b;)V", "", "b", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lht1/a;", "upstream", "Lht1/b;", "c", "(Lec3/l;)Lec3/l;", "a", "Ltr2/n;", "Lqk1/b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17626c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30444b dao;

    /* JADX INFO: renamed from: ht1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.deviceloaction.domain.LabradorDeviceLocationInteractor", m100430f = "LabradorDeviceLocationInteractor.kt", m100431l = {32}, m100432m = "getWillOverwriteReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f68354w;

        /* JADX INFO: renamed from: y */
        int f68356y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68354w = obj;
            this.f68356y |= Integer.MIN_VALUE;
            return C17626c.this.m50182b(this);
        }
    }

    /* JADX INFO: renamed from: ht1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.deviceloaction.domain.LabradorDeviceLocationInteractor$interact$1", m100430f = "LabradorDeviceLocationInteractor.kt", m100431l = {20, 25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lht1/b;", "domainState", "Lht1/a;", "domainAction", "<anonymous>", "(Lht1/b;Lht1/a;)Lht1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f68357E;

        /* JADX INFO: renamed from: w */
        Object f68359w;

        /* JADX INFO: renamed from: x */
        Object f68360x;

        /* JADX INFO: renamed from: y */
        int f68361y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f68362z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C17625b c17625b, InterfaceC17624a interfaceC17624a, InterfaceC30057d<? super C17625b> interfaceC30057d) {
            b bVar = C17626c.this.new b(interfaceC30057d);
            bVar.f68362z = c17625b;
            bVar.f68357E = interfaceC17624a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC17628e enumC17628e;
            InterfaceC17627d interfaceC17627d;
            C17625b c17625b = (C17625b) this.f68362z;
            InterfaceC17624a interfaceC17624a = (InterfaceC17624a) this.f68357E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f68361y;
            if (i13 != 0) {
                if (i13 == 1) {
                    InterfaceC17627d interfaceC17627d2 = (InterfaceC17627d) this.f68360x;
                    C17625b c17625b2 = (C17625b) this.f68359w;
                    AbstractC34132o.m107864I(obj);
                    interfaceC17627d = interfaceC17627d2;
                    c17625b = c17625b2;
                    return c17625b.m50177a(interfaceC17627d, null, ((Boolean) obj).booleanValue());
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                EnumC17628e enumC17628e2 = (EnumC17628e) this.f68360x;
                C17625b c17625b3 = (C17625b) this.f68359w;
                AbstractC34132o.m107864I(obj);
                enumC17628e = enumC17628e2;
                c17625b = c17625b3;
                return C17625b.m50176b(c17625b, null, enumC17628e, ((Boolean) obj).booleanValue(), 1, null);
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(interfaceC17624a, InterfaceC17624a.a.f68347a)) {
                InterfaceC17627d.a aVar = InterfaceC17627d.a.f68363a;
                C17626c c17626c = C17626c.this;
                this.f68362z = null;
                this.f68357E = null;
                this.f68359w = c17625b;
                this.f68360x = aVar;
                this.f68361y = 1;
                Object objM50182b = c17626c.m50182b(this);
                if (objM50182b != enumC31071a) {
                    interfaceC17627d = aVar;
                    obj = objM50182b;
                    return c17625b.m50177a(interfaceC17627d, null, ((Boolean) obj).booleanValue());
                }
            } else {
                if (!(interfaceC17624a instanceof InterfaceC17624a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC17628e selectedWrist = ((InterfaceC17624a.b) interfaceC17624a).getSelectedWrist();
                C17626c c17626c2 = C17626c.this;
                this.f68362z = null;
                this.f68357E = null;
                this.f68359w = c17625b;
                this.f68360x = selectedWrist;
                this.f68361y = 2;
                Object objM50182b2 = c17626c2.m50182b(this);
                if (objM50182b2 != enumC31071a) {
                    enumC17628e = selectedWrist;
                    obj = objM50182b2;
                    return C17625b.m50176b(c17625b, null, enumC17628e, ((Boolean) obj).booleanValue(), 1, null);
                }
            }
            return enumC31071a;
        }
    }

    public C17626c(InterfaceC34116n logger, InterfaceC30444b dao) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dao, "dao");
        this.logger = logger;
        this.dao = dao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m50182b(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f68356y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f68356y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo93126b = aVar.f68354w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f68356y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            InterfaceC30444b interfaceC30444b = this.dao;
            aVar.f68356y = 1;
            objMo93126b = interfaceC30444b.mo93126b(aVar);
            if (objMo93126b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo93126b);
        }
        C30443a c30443a = (C30443a) objMo93126b;
        return Boolean.valueOf((c30443a == null || c30443a.getUploaded()) ? false : true);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m50183c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C17625b(InterfaceC17627d.b.f68364a, null, false, 6, null), upstream, new b(null));
    }
}
