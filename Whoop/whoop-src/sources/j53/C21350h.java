package j53;

import c93.InterfaceC4353o;
import java.util.Comparator;
import java.util.Map;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j53.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C21350h extends AbstractC32275i implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Map f81667w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Map f81668x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ InterfaceC21348f f81669y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Comparator f81670z;

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C21350h c21350h = new C21350h(5, (InterfaceC30057d) obj5);
        c21350h.f81667w = (Map) obj;
        c21350h.f81668x = (Map) obj2;
        c21350h.f81669y = (InterfaceC21348f) obj3;
        c21350h.f81670z = (Comparator) obj4;
        return c21350h.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return new C21353k(this.f81667w, this.f81668x, this.f81669y, this.f81670z);
    }
}
