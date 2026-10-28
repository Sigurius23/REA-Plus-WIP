package j53;

import ec3.InterfaceC13062m;
import java.util.Comparator;
import java.util.Map;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: j53.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C21351i implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81671w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21355m f81672x;

    public /* synthetic */ C21351i(C21355m c21355m, int i13) {
        this.f81671w = i13;
        this.f81672x = c21355m;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f81671w) {
            case 0:
                Object objM59951a = C21355m.m59951a(this.f81672x, (C21353k) obj, interfaceC30057d);
                return objM59951a == EnumC31071a.f128113w ? objM59951a : C23454a0.f92919a;
            default:
                C21355m c21355m = this.f81672x;
                Object objM59951a2 = C21355m.m59951a(c21355m, new C21353k((Map) c21355m.f81687b.getValue(), (Map) c21355m.f81688c.f45200w.getValue(), (InterfaceC21348f) c21355m.f81690e.getValue(), (Comparator) c21355m.f81691f.getValue()), interfaceC30057d);
                return objM59951a2 == EnumC31071a.f128113w ? objM59951a2 : C23454a0.f92919a;
        }
    }
}
