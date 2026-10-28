package id2;

import c31.EnumC3919c;
import c93.InterfaceC4339a;
import cd2.AbstractC4446a;
import l83.InterfaceC23462h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: id2.r */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18433r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71694w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71695x;

    public /* synthetic */ C18433r(Object obj, int i13) {
        this.f71694w = i13;
        this.f71695x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f71694w) {
            case 0:
                return AbstractC18435t.m53078C((InterfaceC4339a) this.f71695x, (EnumC3919c) obj);
            default:
                return AbstractC18435t.m53099X((InterfaceC23462h) this.f71695x, (AbstractC4446a) obj);
        }
    }
}
