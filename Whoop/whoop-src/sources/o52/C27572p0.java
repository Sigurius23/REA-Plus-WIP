package o52;

import android.view.View;
import com.whoop.realtime.presentation.StartActivityActivity;
import p073cq.InterfaceC11036e;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;

/* JADX INFO: renamed from: o52.p0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27572p0 implements InterfaceC11036e, InterfaceC16915u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ StartActivityActivity f111011w;

    public /* synthetic */ C27572p0(StartActivityActivity startActivityActivity) {
        this.f111011w = startActivityActivity;
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        StartActivityActivity.m23899O1(this.f111011w, exc);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        return StartActivityActivity.m23865D0(this.f111011w, view, c16905q1);
    }
}
