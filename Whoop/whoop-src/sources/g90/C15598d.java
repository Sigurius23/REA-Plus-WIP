package g90;

import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.membership.management.navigation.AbstractC9126a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g90.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15598d implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58556w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f58557x;

    public /* synthetic */ C15598d(Function1 function1, int i13) {
        this.f58556w = i13;
        this.f58557x = function1;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        switch (this.f58556w) {
            case 0:
                AbstractC15600f.m43909k(this.f58557x, interfaceC1585g0, enumC1632v);
                break;
            case 1:
                AbstractC9126a.m22812t(this.f58557x, interfaceC1585g0, enumC1632v);
                break;
            default:
                AbstractC9126a.m22808p(this.f58557x, interfaceC1585g0, enumC1632v);
                break;
        }
    }
}
