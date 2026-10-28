package p730qt2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import f41.C14063a;
import p291l0.InterfaceC22996s0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: qt2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30591a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125848w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14063a f125849x;

    public /* synthetic */ C30591a(C14063a c14063a, int i13) {
        this.f125848w = i13;
        this.f125849x = c14063a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f125848w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC30593b.m93843g(this.f125849x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC30593b.m93844h(this.f125849x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
