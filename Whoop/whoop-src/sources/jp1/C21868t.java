package jp1;

import hp1.C17553m;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jp1.t */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21868t implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C39967p f84450E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84451w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17553m f84452x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39967p f84453y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39967p f84454z;

    public /* synthetic */ C21868t(C17553m c17553m, C39967p c39967p, C39967p c39967p2, C39967p c39967p3) {
        this.f84452x = c17553m;
        this.f84453y = c39967p;
        this.f84454z = c39967p2;
        this.f84450E = c39967p3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84451w) {
            case 0:
                return AbstractC21869u.m61986p(this.f84453y, this.f84452x, this.f84454z, this.f84450E, (C28624i0) obj);
            default:
                return AbstractC21869u.m61988r(this.f84452x, this.f84453y, this.f84454z, this.f84450E, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C21868t(C39967p c39967p, C17553m c17553m, C39967p c39967p2, C39967p c39967p3) {
        this.f84453y = c39967p;
        this.f84452x = c17553m;
        this.f84454z = c39967p2;
        this.f84450E = c39967p3;
    }
}
