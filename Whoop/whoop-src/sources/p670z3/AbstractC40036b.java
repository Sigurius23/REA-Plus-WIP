package p670z3;

import p002a0.AbstractC0064z;
import p002a0.C0024g1;
import p024b0.AbstractC2177a;
import p460rg.AbstractC31366a;
import p636y3.AbstractC39177i;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC40036b {

    /* JADX INFO: renamed from: a */
    public static final float[] f172746a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile C0024g1 f172747b = new C0024g1((Object) null);

    /* JADX INFO: renamed from: c */
    public static final Object[] f172748c;

    static {
        Object[] objArr = new Object[0];
        f172748c = objArr;
        synchronized (objArr) {
            f172747b.m57f((int) 115.0f, new C40037c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f172747b.m57f((int) 130.0f, new C40037c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f172747b.m57f((int) 150.0f, new C40037c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f172747b.m57f((int) 180.0f, new C40037c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f172747b.m57f((int) 200.0f, new C40037c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f172747b.m56e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC39177i.m124790b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC40035a m128366a(float f13) {
        float fM56e;
        InterfaceC40035a c40037c;
        float[] fArr = f172746a;
        if (f13 < 1.03f) {
            return null;
        }
        int i13 = (int) (f13 * 100.0f);
        InterfaceC40035a interfaceC40035a = (InterfaceC40035a) f172747b.m55d(i13);
        if (interfaceC40035a != null) {
            return interfaceC40035a;
        }
        C0024g1 c0024g1 = f172747b;
        if (c0024g1.f55w) {
            AbstractC0064z.m159a(c0024g1);
        }
        int iM6853a = AbstractC2177a.m6853a(c0024g1.f58z, i13, c0024g1.f56x);
        if (iM6853a >= 0) {
            return (InterfaceC40035a) f172747b.m59h(iM6853a);
        }
        int i14 = -(iM6853a + 1);
        int i15 = i14 - 1;
        if (i14 >= f172747b.m58g()) {
            C40037c c40037c2 = new C40037c(new float[]{1.0f}, new float[]{f13});
            m128367b(f13, c40037c2);
            return c40037c2;
        }
        if (i15 < 0) {
            c40037c = new C40037c(fArr, fArr);
            fM56e = 1.0f;
        } else {
            fM56e = f172747b.m56e(i15) / 100.0f;
            c40037c = (InterfaceC40035a) f172747b.m59h(i15);
        }
        float fM96469i = AbstractC31366a.m96469i(0.0f, 1.0f, fM56e, f172747b.m56e(i14) / 100.0f, f13);
        InterfaceC40035a interfaceC40035a2 = (InterfaceC40035a) f172747b.m59h(i14);
        float[] fArr2 = new float[9];
        for (int i16 = 0; i16 < 9; i16++) {
            float f14 = fArr[i16];
            fArr2[i16] = AbstractC31366a.m96475o(c40037c.mo124802b(f14), interfaceC40035a2.mo124802b(f14), fM96469i);
        }
        C40037c c40037c3 = new C40037c(fArr, fArr2);
        m128367b(f13, c40037c3);
        return c40037c3;
    }

    /* JADX INFO: renamed from: b */
    public static void m128367b(float f13, C40037c c40037c) {
        synchronized (f172748c) {
            C0024g1 c0024g1Clone = f172747b.clone();
            c0024g1Clone.m57f((int) (f13 * 100.0f), c40037c);
            f172747b = c0024g1Clone;
        }
    }
}
