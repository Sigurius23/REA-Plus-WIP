package p000;

import c93.InterfaceC4339a;
import e81.AbstractC12836k;
import kk1.AbstractC22546g;
import p077d0.C11384o;
import p133f1.AbstractC13976s0;
import p181h2.C16617b;
import p390p1.InterfaceC28670t2;
import v41.AbstractC35661d0;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C33241t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138634w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f138635x;

    public /* synthetic */ C33241t(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f138634w = i13;
        this.f138635x = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f138634w;
        InterfaceC28670t2 interfaceC28670t2 = this.f138635x;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) interfaceC28670t2.getValue();
                bool.getClass();
                return bool;
            case 1:
                return Float.valueOf(AbstractC12836k.m35975H(interfaceC28670t2));
            case 2:
                return new C16617b(((C16617b) interfaceC28670t2.getValue()).f63937a);
            case 3:
                C11384o c11384o = AbstractC13976s0.f49839a;
                return new C16617b(((C16617b) interfaceC28670t2.getValue()).f63937a);
            case 4:
                return Float.valueOf(AbstractC22546g.m65195E0(0.75f, interfaceC28670t2));
            case 5:
                return Float.valueOf(AbstractC22546g.m65260t0(interfaceC28670t2));
            case 6:
                return Boolean.valueOf(((Number) interfaceC28670t2.getValue()).floatValue() > 0.0f);
            case 7:
                return Boolean.valueOf(((Number) interfaceC28670t2.getValue()).floatValue() > 0.0f);
            default:
                return Integer.valueOf(AbstractC35661d0.m112887C(interfaceC28670t2));
        }
    }
}
