package vm0;

import fy1.InterfaceC14865a;
import mm0.InterfaceC25682a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vm0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lvm0/i;", "Lfy1/a;", "Lmm0/a;", "bffCache", "<init>", "(Lmm0/a;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmm0/a;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36151i implements InterfaceC14865a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a bffCache;

    /* JADX INFO: renamed from: vm0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.reporting.RealBffCacheSizeProvider", m100430f = "RealBffCacheSizeProvider.kt", m100431l = {9}, m100432m = "sizeBytes", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f154666w;

        /* JADX INFO: renamed from: y */
        int f154668y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154666w = obj;
            this.f154668y |= Integer.MIN_VALUE;
            return C36151i.this.mo42890a(this);
        }
    }

    public C36151i(InterfaceC25682a bffCache) {
        AbstractC22676k.m65750j(bffCache, "bffCache");
        this.bffCache = bffCache;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fy1.InterfaceC14865a
    /* JADX INFO: renamed from: a */
    public Object mo42890a(InterfaceC30057d<? super Long> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f154668y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f154668y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo75626i = aVar.f154666w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f154668y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75626i);
            InterfaceC25682a interfaceC25682a = this.bffCache;
            aVar.f154668y = 1;
            objMo75626i = interfaceC25682a.mo75626i(aVar);
            if (objMo75626i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75626i);
        }
        return new Long(((Number) objMo75626i).intValue());
    }
}
