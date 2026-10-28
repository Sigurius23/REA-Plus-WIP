package p031b9;

import java.util.List;
import p309lo.InterfaceC24550h;
import p465rm.InterfaceC31582z0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2815a0 implements InterfaceC38051f, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11013w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f11014x;

    public /* synthetic */ C2815a0(List list, int i13) {
        this.f11013w = i13;
        this.f11014x = list;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public final void mo134038invoke(Object obj) {
        switch (this.f11013w) {
            case 0:
                ((InterfaceC34595h0) obj).onCues(this.f11014x);
                break;
            default:
                ((InterfaceC31582z0) obj).onCues(this.f11014x);
                break;
        }
    }
}
