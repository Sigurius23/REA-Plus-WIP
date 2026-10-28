package p031b9;

import p309lo.InterfaceC24550h;
import p465rm.InterfaceC31582z0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.w */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2871w implements InterfaceC38051f, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11413w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f11414x;

    public /* synthetic */ C2871w(boolean z4, int i13) {
        this.f11413w = i13;
        this.f11414x = z4;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public final void mo134038invoke(Object obj) {
        switch (this.f11413w) {
            case 0:
                ((InterfaceC34595h0) obj).onShuffleModeEnabledChanged(this.f11414x);
                break;
            case 1:
                ((InterfaceC34595h0) obj).onSkipSilenceEnabledChanged(this.f11414x);
                break;
            case 2:
                ((InterfaceC31582z0) obj).onShuffleModeEnabledChanged(this.f11414x);
                break;
            default:
                ((InterfaceC31582z0) obj).onSkipSilenceEnabledChanged(this.f11414x);
                break;
        }
    }
}
