package p386oy;

import androidx.compose.runtime.Composer;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p163g1.AbstractC15047j1;
import p208i2.C17919x;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oy.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C28469f implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f114782E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f114783F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f114784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f114785x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23285v0 f114786y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f114787z;

    public C28469f(String str, long j7, C23285v0 c23285v0, boolean z4, boolean z13, boolean z14) {
        this.f114784w = str;
        this.f114785x = j7;
        this.f114786y = c23285v0;
        this.f114787z = z4;
        this.f114782E = z13;
        this.f114783F = z14;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                C28655q c28655q2 = (C28655q) composer;
                AbstractC20301a.m56342j(this.f114784w, C17919x.m51541c(((Number) c28655q2.m87161k(AbstractC15047j1.f56336a)).floatValue(), this.f114785x), this.f114786y, this.f114787z, this.f114782E, this.f114783F, c28655q2, 0);
            }
        } else {
            C28655q c28655q3 = (C28655q) composer;
            AbstractC20301a.m56342j(this.f114784w, C17919x.m51541c(((Number) c28655q3.m87161k(AbstractC15047j1.f56336a)).floatValue(), this.f114785x), this.f114786y, this.f114787z, this.f114782E, this.f114783F, c28655q3, 0);
        }
        return C23454a0.f92919a;
    }
}
