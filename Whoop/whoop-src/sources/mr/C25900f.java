package mr;

import android.view.View;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;

/* JADX INFO: renamed from: mr.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C25900f implements InterfaceC16915u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC25906l f102228w;

    public /* synthetic */ C25900f(AbstractC25906l abstractC25906l) {
        this.f102228w = abstractC25906l;
    }

    /* JADX INFO: renamed from: a */
    public void m76607a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f102228w.m76610a(0);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        int iM47597a = c16905q1.m47597a();
        AbstractC25906l abstractC25906l = this.f102228w;
        abstractC25906l.f102264n = iM47597a;
        abstractC25906l.f102265o = c16905q1.m47598b();
        abstractC25906l.f102266p = c16905q1.m47599c();
        abstractC25906l.m76616g();
        return c16905q1;
    }
}
