package p420qc;

import l83.C23454a0;
import p002a0.C0022g;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30196f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f123594w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30197g f123595x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC33687a f123596y;

    public /* synthetic */ C30196f(C30197g c30197g, InterfaceC33687a interfaceC33687a, int i13) {
        this.f123594w = i13;
        this.f123595x = c30197g;
        this.f123596y = interfaceC33687a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0022g _tmpMap = (C0022g) obj;
        switch (this.f123594w) {
            case 0:
                AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
                this.f123595x.m92419a(this.f123596y, _tmpMap);
                break;
            default:
                AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
                this.f123595x.m92420b(this.f123596y, _tmpMap);
                break;
        }
        return C23454a0.f92919a;
    }
}
