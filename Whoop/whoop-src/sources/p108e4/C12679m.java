package p108e4;

import android.os.Handler;
import java.util.ArrayList;
import p390p1.InterfaceC28691z1;
import p668z1.C39973v;
import vd1.C35909c;

/* JADX INFO: renamed from: e4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C12679m implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: w */
    public final C12677k f43359w;

    /* JADX INFO: renamed from: x */
    public Handler f43360x;

    /* JADX INFO: renamed from: y */
    public final C39973v f43361y = new C39973v(new C12678l(this, 0));

    /* JADX INFO: renamed from: z */
    public boolean f43362z = true;

    /* JADX INFO: renamed from: E */
    public final C12678l f43357E = new C12678l(this, 1);

    /* JADX INFO: renamed from: F */
    public final ArrayList f43358F = new ArrayList();

    public C12679m(C12677k c12677k) {
        this.f43359w = c12677k;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        this.f43361y.m128205e();
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        C39973v c39973v = this.f43361y;
        C35909c c35909c = c39973v.f172501h;
        if (c35909c != null) {
            c35909c.m114042a();
        }
        c39973v.m128201a();
    }
}
