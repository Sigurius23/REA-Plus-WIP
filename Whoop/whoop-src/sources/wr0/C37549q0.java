package wr0;

import java.util.List;
import p390p1.InterfaceC28593a1;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40458s0;

/* JADX INFO: renamed from: wr0.q0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37549q0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160559w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f160560x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28593a1 f160561y;

    public /* synthetic */ C37549q0(List list, InterfaceC28593a1 interfaceC28593a1, int i13) {
        this.f160559w = i13;
        this.f160560x = list;
        this.f160561y = interfaceC28593a1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160559w) {
            case 0:
                return AbstractC37557u0.m120481C(this.f160560x, this.f160561y, ((Integer) obj).intValue());
            default:
                return AbstractC40458s0.m130811n(this.f160560x, this.f160561y, (String) obj);
        }
    }
}
