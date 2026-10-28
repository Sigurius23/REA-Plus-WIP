package p710im1;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.ChatApiConfig;
import io.getstream.chat.android.client.p224di.ChatModule;
import p239j1.C21194l;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: im1.m0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18683m0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73298w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f73299x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73300y;

    public /* synthetic */ C18683m0(boolean z4, Object obj, int i13) {
        this.f73298w = i13;
        this.f73299x = z4;
        this.f73300y = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73298w) {
            case 0:
                return AbstractC18697t0.m54313a1(this.f73299x, (InterfaceC28601c1) this.f73300y);
            case 1:
                return Boolean.valueOf(ChatModule.getAnonymousProvider$lambda$17(this.f73299x, (ChatApiConfig) this.f73300y));
            default:
                return Boolean.valueOf(this.f73299x || ((C21194l) this.f73300y).f80760e.m87022x() > 0.5f);
        }
    }
}
