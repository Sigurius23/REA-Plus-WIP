package j51;

import c93.InterfaceC4351m;
import p390p1.InterfaceC28690z0;

/* JADX INFO: renamed from: j51.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21337e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81571w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28690z0 f81572x;

    public /* synthetic */ C21337e(InterfaceC28690z0 interfaceC28690z0, int i13) {
        this.f81571w = i13;
        this.f81572x = interfaceC28690z0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f81571w;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i13) {
            case 0:
                return AbstractC21338f.a.C41829a.m59915h(this.f81572x, fFloatValue, fFloatValue2);
            default:
                return AbstractC21338f.a.b.m59917h(this.f81572x, fFloatValue, fFloatValue2);
        }
    }
}
