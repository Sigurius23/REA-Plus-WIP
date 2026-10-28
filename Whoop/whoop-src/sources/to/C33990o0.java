package to;

import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.InterfaceC4981l;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.C0010c;
import p002a0.C0022g;
import p073cq.C11040i;
import p073cq.C11052u;

/* JADX INFO: renamed from: to.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33990o0 {

    /* JADX INFO: renamed from: d */
    public int f142468d;

    /* JADX INFO: renamed from: b */
    public final C0022g f142466b = new C0022g(0);

    /* JADX INFO: renamed from: c */
    public final C11040i f142467c = new C11040i();

    /* JADX INFO: renamed from: e */
    public boolean f142469e = false;

    /* JADX INFO: renamed from: a */
    public final C0022g f142465a = new C0022g(0);

    public C33990o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f142465a.put(((InterfaceC4981l) it.next()).getApiKey(), null);
        }
        this.f142468d = this.f142465a.f50y;
    }

    /* JADX INFO: renamed from: a */
    public final C0010c m107462a() {
        return (C0010c) this.f142465a.keySet();
    }

    /* JADX INFO: renamed from: b */
    public final C11052u m107463b() {
        return this.f142467c.f34644a;
    }

    /* JADX INFO: renamed from: c */
    public final void m107464c(C33961a c33961a, C4969a c4969a, String str) {
        C0022g c0022g = this.f142465a;
        c0022g.put(c33961a, c4969a);
        C0022g c0022g2 = this.f142466b;
        c0022g2.put(c33961a, str);
        this.f142468d--;
        if (!c4969a.m15588b()) {
            this.f142469e = true;
        }
        if (this.f142468d == 0) {
            boolean z4 = this.f142469e;
            C11040i c11040i = this.f142467c;
            if (z4) {
                c11040i.m29686a(new AvailabilityException(c0022g));
            } else {
                c11040i.m29687b(c0022g2);
            }
        }
    }
}
