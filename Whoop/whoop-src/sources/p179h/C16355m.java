package p179h;

import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16355m extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f62876w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f62877x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16355m(boolean z4, InterfaceC4351m interfaceC4351m, int i13) {
        super(2);
        this.f62876w = z4;
        this.f62877x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(1);
        AbstractC1772c1.m5386c(this.f62876w, this.f62877x, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
