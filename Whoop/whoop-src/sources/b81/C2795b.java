package b81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cy0.C11184c;
import eu.C13612g;
import ey0.AbstractC13740g;
import l83.InterfaceC23459e;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import w41.AbstractC36800a;

/* JADX INFO: renamed from: b81.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2795b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10972w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10973x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC23459e f10974y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10975z;

    public /* synthetic */ C2795b(Object obj, boolean z4, InterfaceC23459e interfaceC23459e, int i13) {
        this.f10972w = i13;
        this.f10975z = obj;
        this.f10973x = z4;
        this.f10974y = interfaceC23459e;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10972w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC2797d.m7966g((C2799f) this.f10975z, this.f10973x, (Function1) this.f10974y, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC13740g.m39024C((C11184c.b) this.f10975z, this.f10973x, (Function1) this.f10974y, (InterfaceC23001u) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC36800a.m117928h((C13612g) this.f10975z, this.f10973x, (InterfaceC4351m) this.f10974y, (InterfaceC23004v) obj, (Composer) obj2, iIntValue3);
        }
    }
}
