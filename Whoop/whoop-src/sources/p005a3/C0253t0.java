package p005a3;

import java.util.Arrays;
import m83.AbstractC25260n;
import p635y2.C39117o;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0253t0 implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public boolean f866w;

    /* JADX INFO: renamed from: x */
    public long f867x = 9223372034707292159L;

    /* JADX INFO: renamed from: y */
    public long f868y = 0;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC0262w0 f869z;

    public C0253t0(AbstractC0262w0 abstractC0262w0) {
        this.f869z = abstractC0262w0;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m771a(C39117o c39117o, float f13) {
        AbstractC0262w0 abstractC0262w0 = this.f869z;
        C0212i2 c0212i2 = abstractC0262w0.f900M;
        if (c0212i2 == null) {
            c0212i2 = new C0212i2();
            abstractC0262w0.f900M = c0212i2;
        }
        int iM74085z0 = AbstractC25260n.m74085z0((C39117o[]) c0212i2.f705b, c39117o);
        if (iM74085z0 >= 0) {
            float[] fArr = (float[]) c0212i2.f706c;
            if (fArr[iM74085z0] != f13) {
                fArr[iM74085z0] = f13;
                ((byte[]) c0212i2.f707d)[iM74085z0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c0212i2.f707d;
                if (bArr[iM74085z0] == 2) {
                    bArr[iM74085z0] = 0;
                    return;
                }
                return;
            }
        }
        int i13 = c0212i2.f704a;
        C39117o[] c39117oArr = (C39117o[]) c0212i2.f705b;
        if (i13 == c39117oArr.length) {
            int i14 = i13 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(c39117oArr, i14);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            c0212i2.f705b = (C39117o[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) c0212i2.f706c, i14);
            AbstractC22676k.m65749i(fArrCopyOf, "copyOf(...)");
            c0212i2.f706c = fArrCopyOf;
            ?? CopyOf = Arrays.copyOf((byte[]) c0212i2.f707d, i14);
            AbstractC22676k.m65749i(CopyOf, "copyOf(...)");
            c0212i2.f707d = CopyOf;
        }
        ((C39117o[]) c0212i2.f705b)[i13] = c39117o;
        ((byte[]) c0212i2.f707d)[i13] = 3;
        ((float[]) c0212i2.f706c)[i13] = f13;
        c0212i2.f704a++;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f869z.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f869z.getFontScale();
    }
}
