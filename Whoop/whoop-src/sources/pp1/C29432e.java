package pp1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;
import vo1.AbstractC36243r;
import zk2.AbstractC40862w;

/* JADX INFO: renamed from: pp1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29432e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119498w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f119499x;

    public /* synthetic */ C29432e(long j7, int i13) {
        this.f119498w = i13;
        this.f119499x = j7;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f119498w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC29436i.m89749U0(this.f119499x, (Modifier) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC36243r.m115503M0(this.f119499x, (Modifier) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC40862w.m132441h(this.f119499x, (InterfaceC23004v) obj, (Composer) obj2, iIntValue3);
        }
    }
}
