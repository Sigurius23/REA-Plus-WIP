package lw1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.NativeOrderDetailsItem;
import com.whoop.membership.extensions.domain.models.NativeOrderLineItem;

/* JADX INFO: renamed from: lw1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24766b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96872w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f96873x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f96874y;

    public /* synthetic */ C24766b(Object obj, int i13, int i14) {
        this.f96872w = i14;
        this.f96874y = obj;
        this.f96873x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f96872w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC24767c.m72523g((NativeOrderDetailsItem) this.f96874y, this.f96873x, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC24767c.m72525i((NativeOrderLineItem) this.f96874y, this.f96873x, (Composer) obj, iIntValue2);
        }
    }
}
