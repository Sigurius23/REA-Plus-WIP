package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1404m0 {

    /* JADX INFO: renamed from: b */
    public static final C1427x f5941b = new C1427x(1);

    /* JADX INFO: renamed from: a */
    public final Object f5942a;

    public C1404m0(AbstractC1411p abstractC1411p) {
        Charset charset = AbstractC1383f0.f5887a;
        this.f5942a = abstractC1411p;
        abstractC1411p.f5955d = this;
    }

    /* JADX INFO: renamed from: a */
    public void m4464a(int i13, Object obj, InterfaceC1372b1 interfaceC1372b1) {
        AbstractC1411p abstractC1411p = (AbstractC1411p) this.f5942a;
        abstractC1411p.mo4480x0(i13, 3);
        interfaceC1372b1.mo4295i((AbstractC1367a) obj, abstractC1411p.f5955d);
        abstractC1411p.mo4480x0(i13, 4);
    }

    public C1404m0() {
        InterfaceC1414q0 interfaceC1414q0;
        C1430y0 c1430y0 = C1430y0.f5993c;
        try {
            interfaceC1414q0 = (InterfaceC1414q0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1414q0 = f5941b;
        }
        InterfaceC1414q0[] interfaceC1414q0Arr = {C1427x.f5989b, interfaceC1414q0};
        C1401l0 c1401l0 = new C1401l0();
        c1401l0.f5935a = interfaceC1414q0Arr;
        Charset charset = AbstractC1383f0.f5887a;
        this.f5942a = c1401l0;
    }
}
