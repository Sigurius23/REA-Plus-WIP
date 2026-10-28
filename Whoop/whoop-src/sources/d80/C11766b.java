package d80;

import androidx.compose.runtime.Composer;
import g80.C15562c;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function3;
import q80.AbstractC30037i;

/* JADX INFO: renamed from: d80.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11766b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38093w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15562c f38094x;

    public /* synthetic */ C11766b(C15562c c15562c, int i13) {
        this.f38093w = i13;
        this.f38094x = c15562c;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f38093w;
        InterfaceC22997s1 interfaceC22997s1 = (InterfaceC22997s1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC11769e.m31529u(this.f38094x, interfaceC22997s1, composer, iIntValue);
            default:
                return AbstractC30037i.m91966x(this.f38094x, interfaceC22997s1, composer, iIntValue);
        }
    }
}
