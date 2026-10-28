package ve;

import gf.C15762c;
import gf.C15768i;
import gf.InterfaceC15761b;
import p249jc.AbstractC21598x;
import p613xf.AbstractC38256b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: ve.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35919d {
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [gf.b] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [gf.i] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [gf.l] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [gf.b] */
    /* JADX INFO: renamed from: a */
    public static C35920e m114098a(String accessKeyId, String secretAccessKey, String str, C34913b c34913b, InterfaceC15761b interfaceC15761b, int i13) {
        String str2 = (i13 & 16) != 0 ? null : "IMDSv2";
        ?? M60709w0 = interfaceC15761b;
        if ((i13 & 32) != 0) {
            M60709w0 = 0;
        }
        AbstractC22676k.m65750j(accessKeyId, "accessKeyId");
        AbstractC22676k.m65750j(secretAccessKey, "secretAccessKey");
        if (str2 != null) {
            if (!AbstractC22676k.m65745e(M60709w0 != 0 ? (String) M60709w0.mo33082b(AbstractC38256b.f164024a) : null, str2)) {
                M60709w0 = M60709w0 != 0 ? AbstractC21598x.m60709w0(M60709w0) : new C15762c();
                AbstractC21598x.m60701s0(M60709w0, AbstractC38256b.f164024a, str2);
            } else if (M60709w0 == 0) {
                M60709w0 = C15768i.f59433w;
            }
        } else if (M60709w0 == 0) {
            M60709w0 = C15768i.f59433w;
        }
        return new C35920e(accessKeyId, secretAccessKey, str, c34913b, M60709w0);
    }
}
