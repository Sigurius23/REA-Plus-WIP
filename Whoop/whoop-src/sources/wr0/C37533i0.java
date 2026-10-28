package wr0;

import c93.InterfaceC4339a;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import zq0.AbstractC40965f;

/* JADX INFO: renamed from: wr0.i0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37533i0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f160503E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160504w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f160505x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f160506y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f160507z;

    public /* synthetic */ C37533i0(InterfaceC4339a interfaceC4339a, long j7, long j13, float f13, int i13) {
        this.f160504w = i13;
        this.f160505x = interfaceC4339a;
        this.f160506y = j7;
        this.f160507z = j13;
        this.f160503E = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160504w) {
            case 0:
                return AbstractC37535j0.m120396z(this.f160505x, this.f160506y, this.f160507z, this.f160503E, (InterfaceC22129c) obj);
            default:
                return AbstractC40965f.m132947S(this.f160505x, this.f160506y, this.f160507z, this.f160503E, (InterfaceC22129c) obj);
        }
    }
}
