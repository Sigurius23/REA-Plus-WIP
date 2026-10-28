package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1225j0 {

    /* JADX INFO: renamed from: b */
    public static final C1263w f5410b = new C1263w(1);

    /* JADX INFO: renamed from: a */
    public final Object f5411a;

    public C1225j0(C1236n c1236n) {
        AbstractC1204c0.m3788a(c1236n, "output");
        this.f5411a = c1236n;
        c1236n.f5440d = this;
    }

    /* JADX INFO: renamed from: a */
    public void m3851a(int i13, Object obj, InterfaceC1270z0 interfaceC1270z0) {
        C1236n c1236n = (C1236n) this.f5411a;
        c1236n.m3946L0(i13, 3);
        interfaceC1270z0.mo3992e((AbstractC1197a) obj, c1236n.f5440d);
        c1236n.m3946L0(i13, 4);
    }

    public C1225j0() {
        InterfaceC1240o0 interfaceC1240o0;
        C1264w0 c1264w0 = C1264w0.f5502c;
        try {
            interfaceC1240o0 = (InterfaceC1240o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1240o0 = f5410b;
        }
        InterfaceC1240o0[] interfaceC1240o0Arr = {C1263w.f5500b, interfaceC1240o0};
        C1222i0 c1222i0 = new C1222i0();
        c1222i0.f5402a = interfaceC1240o0Arr;
        Charset charset = AbstractC1204c0.f5362a;
        this.f5411a = c1222i0;
    }
}
