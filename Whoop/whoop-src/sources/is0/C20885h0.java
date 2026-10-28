package is0;

import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;
import ti0.C33840e;
import ti0.C33842g;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: is0.h0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20885h0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f78598E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78599w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f78600x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78601y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f78602z;

    public /* synthetic */ C20885h0(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1) {
        this.f78600x = f13;
        this.f78601y = interfaceC28670t2;
        this.f78602z = interfaceC28690z0;
        this.f78598E = interfaceC28690z1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78599w) {
            case 0:
                return AbstractC20889j0.m57768f0(this.f78600x, (InterfaceC28670t2) this.f78601y, (InterfaceC28690z0) this.f78602z, (InterfaceC28690z0) this.f78598E, ((Integer) obj).intValue());
            default:
                return AbstractC40662a.m131947C((C33840e) this.f78601y, (C33842g) this.f78602z, this.f78600x, (Function1) this.f78598E, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C20885h0(C33840e c33840e, C33842g c33842g, float f13, Function1 function1) {
        this.f78601y = c33840e;
        this.f78602z = c33842g;
        this.f78600x = f13;
        this.f78598E = function1;
    }
}
