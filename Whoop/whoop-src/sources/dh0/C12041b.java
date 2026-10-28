package dh0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import nl0.EnumC26800b;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: dh0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12041b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39815w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC26800b f39816x;

    public /* synthetic */ C12041b(EnumC26800b enumC26800b, int i13) {
        this.f39815w = i13;
        this.f39816x = enumC26800b;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f39815w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC12042c.m33164i(this.f39816x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC12042c.m33167l(this.f39816x, (Modifier) obj, (Composer) obj2, iIntValue2);
        }
    }
}
