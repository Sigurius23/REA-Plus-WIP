package sc2;

import android.view.View;
import com.whoop.settings.strap.StrapSettingsFragment;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p377or.C28134h;
import p377or.InterfaceC28139m;

/* JADX INFO: renamed from: sc2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32371j implements InterfaceC16915u, InterfaceC28139m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ StrapSettingsFragment f133985w;

    public /* synthetic */ C32371j(StrapSettingsFragment strapSettingsFragment) {
        this.f133985w = strapSettingsFragment;
    }

    @Override // p377or.InterfaceC28139m
    /* JADX INFO: renamed from: f */
    public void mo71065f(C28134h c28134h, int i13) {
        StrapSettingsFragment.m25749H0(this.f133985w, c28134h, i13);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        return StrapSettingsFragment.m25771b0(this.f133985w, view, c16905q1);
    }
}
