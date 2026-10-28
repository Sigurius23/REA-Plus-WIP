package androidx.glance.appwidget.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p095dp.AbstractC12240d;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1411p extends AbstractC12240d {

    /* JADX INFO: renamed from: e */
    public static final Logger f5953e = Logger.getLogger(AbstractC1411p.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f5954f = AbstractC1399k1.f5930e;

    /* JADX INFO: renamed from: d */
    public C1404m0 f5955d;

    /* JADX INFO: renamed from: e0 */
    public static int m4499e0(int i13, AbstractC1391i abstractC1391i) {
        int iM4503i0 = m4503i0(i13);
        int size = abstractC1391i.size();
        return m4504j0(size) + size + iM4503i0;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m4500f0(int i13) {
        return m4504j0((i13 >> 31) ^ (i13 << 1));
    }

    /* JADX INFO: renamed from: g0 */
    public static int m4501g0(long j7) {
        return m4505k0((j7 >> 63) ^ (j7 << 1));
    }

    /* JADX INFO: renamed from: h0 */
    public static int m4502h0(String str) {
        int length;
        try {
            length = AbstractC1408n1.m4487b(str);
        } catch (C1405m1 unused) {
            length = str.getBytes(AbstractC1383f0.f5887a).length;
        }
        return m4504j0(length) + length;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m4503i0(int i13) {
        return m4504j0(i13 << 3);
    }

    /* JADX INFO: renamed from: j0 */
    public static int m4504j0(int i13) {
        return (352 - (Integer.numberOfLeadingZeros(i13) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m4505k0(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo4465A0(int i13, long j7);

    /* JADX INFO: renamed from: B0 */
    public abstract void mo4466B0(long j7);

    /* JADX INFO: renamed from: l0 */
    public final void m4506l0(String str, C1405m1 c1405m1) throws CodedOutputStream$OutOfSpaceException {
        f5953e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1405m1);
        byte[] bytes = str.getBytes(AbstractC1383f0.f5887a);
        try {
            mo4482z0(bytes.length);
            mo4468c0(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(e5);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract void mo4469m0(byte b);

    /* JADX INFO: renamed from: n0 */
    public abstract void mo4470n0(int i13, boolean z4);

    /* JADX INFO: renamed from: o0 */
    public abstract void mo4471o0(int i13, AbstractC1391i abstractC1391i);

    /* JADX INFO: renamed from: p0 */
    public abstract void mo4472p0(int i13, int i14);

    /* JADX INFO: renamed from: q0 */
    public abstract void mo4473q0(int i13);

    /* JADX INFO: renamed from: r0 */
    public abstract void mo4474r0(int i13, long j7);

    /* JADX INFO: renamed from: s0 */
    public abstract void mo4475s0(long j7);

    /* JADX INFO: renamed from: t0 */
    public abstract void mo4476t0(int i13, int i14);

    /* JADX INFO: renamed from: u0 */
    public abstract void mo4477u0(int i13);

    /* JADX INFO: renamed from: v0 */
    public abstract void mo4478v0(int i13, AbstractC1367a abstractC1367a, InterfaceC1372b1 interfaceC1372b1);

    /* JADX INFO: renamed from: w0 */
    public abstract void mo4479w0(int i13, String str);

    /* JADX INFO: renamed from: x0 */
    public abstract void mo4480x0(int i13, int i14);

    /* JADX INFO: renamed from: y0 */
    public abstract void mo4481y0(int i13, int i14);

    /* JADX INFO: renamed from: z0 */
    public abstract void mo4482z0(int i13);
}
