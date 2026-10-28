package p005a3;

import io.sentry.InterfaceC20408l1;
import java.util.Comparator;
import p390p1.C28648o0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.e0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0194e0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f624w;

    public /* synthetic */ C0194e0(int i13) {
        this.f624w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f624w) {
            case 0:
                C0230n0 c0230n0 = (C0230n0) obj;
                C0230n0 c0230n1 = (C0230n0) obj2;
                return c0230n0.m593K() == c0230n1.m593K() ? AbstractC22676k.m65751k(c0230n0.m590H(), c0230n1.m590H()) : Float.compare(c0230n0.m593K(), c0230n1.m593K());
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b = bArr[i13];
                    byte b6 = bArr2[i13];
                    if (b != b6) {
                        return b - b6;
                    }
                }
                return 0;
            case 2:
                InterfaceC20408l1 interfaceC20408l1 = (InterfaceC20408l1) obj;
                InterfaceC20408l1 interfaceC20408l2 = (InterfaceC20408l1) obj2;
                if (interfaceC20408l1 == interfaceC20408l2) {
                    return 0;
                }
                int iCompareTo = interfaceC20408l1.mo56466x().compareTo(interfaceC20408l2.mo56466x());
                return iCompareTo != 0 ? iCompareTo : interfaceC20408l1.mo56462t().f76322x.toString().compareTo(interfaceC20408l2.mo56462t().f76322x.toString());
            default:
                return AbstractC22676k.m65751k(((C28648o0) obj).f115868b, ((C28648o0) obj2).f115868b);
        }
    }
}
