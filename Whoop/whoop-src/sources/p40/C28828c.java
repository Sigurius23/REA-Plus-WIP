package p40;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import java.util.Map;
import l83.C23454a0;
import m40.C25046w;
import p026b2.C2314t;
import p097ds.AbstractC12314q;
import p181h2.C16620e;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28828c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Map.Entry f116703w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25046w f116704x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f116705y;

    public C28828c(Map.Entry entry, C25046w c25046w, long j7) {
        this.f116703w = entry;
        this.f116704x = c25046w;
        this.f116705y = j7;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String it = (String) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(it, "it");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                String str = (String) this.f116703w.getKey();
                C2314t c2314t = C2314t.f9131w;
                long j7 = this.f116705y;
                AbstractC12314q.m34329i(str, this.f116704x, AbstractC1102d.m3411h(C16620e.m47211c(j7), AbstractC1102d.m3424u(C16620e.m47213e(j7), c2314t)), null, null, null, null, false, null, null, composer, 384, 0, 2032);
            }
        } else {
            String str2 = (String) this.f116703w.getKey();
            C2314t c2314t2 = C2314t.f9131w;
            long j13 = this.f116705y;
            AbstractC12314q.m34329i(str2, this.f116704x, AbstractC1102d.m3411h(C16620e.m47211c(j13), AbstractC1102d.m3424u(C16620e.m47213e(j13), c2314t2)), null, null, null, null, false, null, null, composer, 384, 0, 2032);
        }
        return C23454a0.f92919a;
    }
}
