package wr0;

import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wr0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37534j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160508w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37542n f160509x;

    public /* synthetic */ C37534j(C37542n c37542n, int i13) {
        this.f160508w = i13;
        this.f160509x = c37542n;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160508w) {
            case 0:
                return AbstractC37540m.m120422n(this.f160509x, (InterfaceC18044z) obj);
            default:
                return AbstractC37540m.m120407B(this.f160509x, (InterfaceC18044z) obj);
        }
    }
}
