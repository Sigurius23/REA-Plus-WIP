package p698au1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p329n0.C26068u;
import yd2.AbstractC39462d;

/* JADX INFO: renamed from: au1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2069n implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f8195E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f8196F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f8197G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8198w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f8199x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8200y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f8201z;

    public /* synthetic */ C2069n(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, int i14, int i15, int i16) {
        this.f8198w = i16;
        this.f8199x = c26068u;
        this.f8200y = i13;
        this.f8201z = str;
        this.f8195E = interfaceC4339a;
        this.f8196F = i14;
        this.f8197G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8198w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2072q.m6530P(this.f8199x, this.f8200y, this.f8201z, this.f8195E, this.f8196F, this.f8197G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39462d.m126028p(this.f8199x, this.f8200y, this.f8201z, this.f8195E, this.f8196F, this.f8197G, (Composer) obj, iIntValue2);
        }
    }
}
