package p027b3;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p399pb.C29047d;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2349a2 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f9287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29047d f9288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f9289y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2349a2(boolean z4, C29047d c29047d, String str) {
        super(0);
        this.f9287w = z4;
        this.f9288x = c29047d;
        this.f9289y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        if (this.f9287w) {
            C29047d c29047d = this.f9288x;
            String str = this.f9289y;
            C31183a c31183a = c29047d.f117548a;
            synchronized (c31183a.f128497c) {
            }
        }
        return C23454a0.f92919a;
    }
}
