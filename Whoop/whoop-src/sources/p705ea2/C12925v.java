package p705ea2;

import android.view.View;
import com.whoop.community.CommunityLandingHostFragment;
import com.whoop.settings.SettingsLandingFragment;
import io.C18742d;
import io.C18744f;
import io.InterfaceC19980j;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import sn.C32766w0;

/* JADX INFO: renamed from: ea2.v */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12925v implements InterfaceC16915u, InterfaceC19980j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44648w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f44649x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f44650y;

    public /* synthetic */ C12925v(Object obj, boolean z4, int i13) {
        this.f44648w = i13;
        this.f44650y = obj;
        this.f44649x = z4;
    }

    @Override // io.InterfaceC19980j
    /* JADX INFO: renamed from: b */
    public C41060w0 mo13592b(int i13, C32766w0 c32766w0, int[] iArr) {
        C18744f c18744f = (C18744f) this.f44650y;
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i14 = 0; i14 < c32766w0.f136260w; i14++) {
            c41014d0M133251l.m133222a(new C18742d(i13, c32766w0, i14, c18744f, iArr[i14], this.f44649x));
        }
        return c41014d0M133251l.m133239f();
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f44648w) {
            case 0:
                return SettingsLandingFragment.m25184b1((SettingsLandingFragment) this.f44650y, this.f44649x, view, c16905q1);
            default:
                return CommunityLandingHostFragment.m18982n0(this.f44649x, (CommunityLandingHostFragment) this.f44650y, view, c16905q1);
        }
    }

    public /* synthetic */ C12925v(boolean z4, CommunityLandingHostFragment communityLandingHostFragment) {
        this.f44648w = 2;
        this.f44649x = z4;
        this.f44650y = communityLandingHostFragment;
    }
}
