package ym2;

import c93.InterfaceC4339a;
import com.whoop.p069ui.home.redesign.view.MainActivity;

/* JADX INFO: renamed from: ym2.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C39654b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170605w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MainActivity f170606x;

    public /* synthetic */ C39654b(MainActivity mainActivity, int i13) {
        this.f170605w = i13;
        this.f170606x = mainActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f170605w) {
            case 0:
                return MainActivity.m27292f0(this.f170606x);
            case 1:
                return MainActivity.m27282Z(this.f170606x);
            case 2:
                return MainActivity.m27275V0(this.f170606x);
            case 3:
                return Boolean.valueOf(MainActivity.m27288c0(this.f170606x));
            default:
                return Boolean.valueOf(MainActivity.m27290d0(this.f170606x));
        }
    }
}
