package rn0;

import p132f0.C13821r1;
import p208i2.InterfaceC17886g0;
import p715kotlin.jvm.functions.Function1;
import ue1.AbstractC34859b;

/* JADX INFO: renamed from: rn0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31608a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130622w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13821r1 f130623x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f130624y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f130625z;

    public /* synthetic */ C31608a(C13821r1 c13821r1, float f13, float f14, int i13) {
        this.f130622w = i13;
        this.f130623x = c13821r1;
        this.f130624y = f13;
        this.f130625z = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130622w) {
            case 0:
                return AbstractC31609b.m97641d(this.f130623x, this.f130624y, this.f130625z, (InterfaceC17886g0) obj);
            default:
                return AbstractC34859b.m109944d(this.f130623x, this.f130624y, this.f130625z, (InterfaceC17886g0) obj);
        }
    }
}
