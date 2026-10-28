package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1761z2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1757y2 f6943a;

    /* JADX INFO: renamed from: b */
    public final C1753x2 f6944b;

    public C1761z2(InterfaceC1757y2 interfaceC1757y2) {
        this.f6943a = interfaceC1757y2;
        C1753x2 c1753x2 = new C1753x2();
        c1753x2.f6931a = 0;
        this.f6944b = c1753x2;
    }

    /* JADX INFO: renamed from: a */
    public final View m5350a(int i13, int i14, int i15, int i16) {
        InterfaceC1757y2 interfaceC1757y2 = this.f6943a;
        int iMo5317b = interfaceC1757y2.mo5317b();
        int iMo5318c = interfaceC1757y2.mo5318c();
        int i17 = i14 > i13 ? 1 : -1;
        View view = null;
        while (i13 != i14) {
            View viewMo5319d = interfaceC1757y2.mo5319d(i13);
            int iMo5316a = interfaceC1757y2.mo5316a(viewMo5319d);
            int iMo5320e = interfaceC1757y2.mo5320e(viewMo5319d);
            C1753x2 c1753x2 = this.f6944b;
            c1753x2.f6932b = iMo5317b;
            c1753x2.f6933c = iMo5318c;
            c1753x2.f6934d = iMo5316a;
            c1753x2.f6935e = iMo5320e;
            if (i15 != 0) {
                c1753x2.f6931a = i15;
                if (c1753x2.m5349a()) {
                    return viewMo5319d;
                }
            }
            if (i16 != 0) {
                c1753x2.f6931a = i16;
                if (c1753x2.m5349a()) {
                    view = viewMo5319d;
                }
            }
            i13 += i17;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5351b(View view) {
        InterfaceC1757y2 interfaceC1757y2 = this.f6943a;
        int iMo5317b = interfaceC1757y2.mo5317b();
        int iMo5318c = interfaceC1757y2.mo5318c();
        int iMo5316a = interfaceC1757y2.mo5316a(view);
        int iMo5320e = interfaceC1757y2.mo5320e(view);
        C1753x2 c1753x2 = this.f6944b;
        c1753x2.f6932b = iMo5317b;
        c1753x2.f6933c = iMo5318c;
        c1753x2.f6934d = iMo5316a;
        c1753x2.f6935e = iMo5320e;
        c1753x2.f6931a = 24579;
        return c1753x2.m5349a();
    }
}
