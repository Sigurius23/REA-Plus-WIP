package t61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p077d0.C11344e;
import u61.C34555d;
import wn1.AbstractC37422f;

/* JADX INFO: renamed from: t61.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C33551a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f140023x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f140024y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f140025z;

    public /* synthetic */ C33551a(float f13, C11344e c11344e, int i13) {
        this.f140022w = 2;
        this.f140024y = f13;
        this.f140023x = c11344e;
        this.f140025z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140022w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33552b.m105953h((C34555d) this.f140023x, this.f140024y, this.f140025z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33552b.m105954i((C34555d) this.f140023x, this.f140024y, this.f140025z, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37422f.m119793c(this.f140024y, (C11344e) this.f140023x, this.f140025z, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C33551a(C34555d c34555d, float f13, int i13, int i14) {
        this.f140022w = i14;
        this.f140023x = c34555d;
        this.f140024y = f13;
        this.f140025z = i13;
    }
}
