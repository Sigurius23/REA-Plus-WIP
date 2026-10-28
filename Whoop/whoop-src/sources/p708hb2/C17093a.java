package p708hb2;

import a71.C0520a;
import lf0.AbstractC23970t;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hb2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17093a implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f65671E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65672w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f65673x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f65674y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f65675z;

    public /* synthetic */ C17093a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, int i13) {
        this.f65672w = i13;
        this.f65673x = interfaceC28601c1;
        this.f65674y = interfaceC28601c2;
        this.f65675z = interfaceC28601c3;
        this.f65671E = interfaceC28601c4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65672w) {
            case 0:
                return Function0.m48271j(this.f65673x, this.f65674y, this.f65675z, this.f65671E, obj);
            default:
                return AbstractC23970t.m70683t(this.f65673x, this.f65674y, this.f65675z, this.f65671E, (C0520a) obj);
        }
    }
}
