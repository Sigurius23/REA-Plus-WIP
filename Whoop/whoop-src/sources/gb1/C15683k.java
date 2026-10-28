package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;
import zk2.AbstractC40862w;

/* JADX INFO: renamed from: gb1.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15683k implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58869w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f58870x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f58871y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f58872z;

    public /* synthetic */ C15683k(int i13, float f13, float f14, float f15) {
        this.f58869w = i13;
        this.f58870x = f13;
        this.f58871y = f14;
        this.f58872z = f15;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f58869w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC15684l.m44123g(this.f58870x, this.f58871y, this.f58872z, (Modifier) obj, (Composer) obj2, iIntValue);
            default:
                return AbstractC40862w.m132445l(this.f58870x, this.f58871y, this.f58872z, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
        }
    }
}
