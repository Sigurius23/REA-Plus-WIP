package j43;

import c93.InterfaceC4339a;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import l83.C23454a0;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: j43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21318b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81519w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CallService f81520x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21318b(CallService callService, int i13) {
        super(0);
        this.f81519w = i13;
        this.f81520x = callService;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f81519w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        CallService callService = this.f81520x;
        switch (i13) {
            case 0:
                C23470p c23470p = CallService.f74912I;
                callService.m55785e(null);
                break;
            case 1:
                C23470p c23470p2 = CallService.f74912I;
                callService.m55785e(null);
                break;
            default:
                C23470p c23470p3 = CallService.f74912I;
                callService.m55782b();
                break;
        }
        return c23454a0;
    }
}
