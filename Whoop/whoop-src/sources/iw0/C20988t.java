package iw0;

import androidx.compose.runtime.Composer;
import java.util.Map;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: iw0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20988t implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79295w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map f79296x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f79297y;

    public /* synthetic */ C20988t(Map map, Function1 function1, int i13) {
        this.f79295w = i13;
        this.f79296x = map;
        this.f79297y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f79295w;
        InterfaceC23013y interfaceC23013y = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC20992x.m58446p1(this.f79296x, this.f79297y, interfaceC23013y, composer, iIntValue);
            default:
                return AbstractC20992x.m58396Y0(this.f79296x, this.f79297y, interfaceC23013y, composer, iIntValue);
        }
    }
}
