package g90;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.membership.management.navigation.AbstractC9126a;
import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g90.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15599e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58558w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1585g0 f58559x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f58560y;

    public /* synthetic */ C15599e(InterfaceC1585g0 interfaceC1585g0, Function1 function1, int i13) {
        this.f58558w = i13;
        this.f58559x = interfaceC1585g0;
        this.f58560y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58558w) {
            case 0:
                return AbstractC15600f.m43908j(this.f58559x, this.f58560y, (C28624i0) obj);
            case 1:
                return AbstractC9126a.m22807o(this.f58559x, this.f58560y, (C28624i0) obj);
            default:
                return AbstractC9126a.m22811s(this.f58559x, this.f58560y, (C28624i0) obj);
        }
    }
}
