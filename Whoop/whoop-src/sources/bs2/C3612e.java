package bs2;

import ax.InterfaceC2118c;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import java.util.ArrayList;
import jo.InterfaceC21824m;

/* JADX INFO: renamed from: bs2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3612e implements InterfaceC21824m, InterfaceC2118c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4339a f14698w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f14699x;

    public /* synthetic */ C3612e(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f14698w = interfaceC4339a;
        this.f14699x = interfaceC4339a2;
    }

    @Override // ax.InterfaceC2118c
    /* JADX INFO: renamed from: a */
    public void mo6684a(boolean z4, ArrayList arrayList, ArrayList arrayList2) {
        PermissionChecker.checkPermissions$lambda$11(this.f14698w, this.f14699x, z4, arrayList, arrayList2);
    }
}
