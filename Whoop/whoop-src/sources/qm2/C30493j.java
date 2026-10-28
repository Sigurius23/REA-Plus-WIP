package qm2;

import android.os.Bundle;
import androidx.fragment.app.InterfaceC1357w1;
import com.whoop.membership.management.MembershipManagementFragment;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;

/* JADX INFO: renamed from: qm2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30493j implements InterfaceC1357w1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f125325b;

    public /* synthetic */ C30493j(Object obj, int i13) {
        this.f125324a = i13;
        this.f125325b = obj;
    }

    @Override // androidx.fragment.app.InterfaceC1357w1
    /* JADX INFO: renamed from: a */
    public final void mo4108a(Bundle bundle, String str) {
        switch (this.f125324a) {
            case 0:
                BleConnectStrapActivity.m27052K0((BleConnectStrapActivity) this.f125325b, str, bundle);
                break;
            default:
                MembershipManagementFragment.m22768Q((MembershipManagementFragment) this.f125325b, str, bundle);
                break;
        }
    }
}
