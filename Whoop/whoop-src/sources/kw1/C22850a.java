package kw1;

import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.OrderOption;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import rs2.AbstractC31795a;
import x31.AbstractC37947f;

/* JADX INFO: renamed from: kw1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22850a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90091w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f90092x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f90093y;

    public /* synthetic */ C22850a(InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f90091w = i14;
        this.f90092x = interfaceC4351m;
        this.f90093y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90091w) {
            case 0:
                return AbstractC22853d.m66307T(this.f90092x, this.f90093y, (OrderOption) obj);
            case 1:
                return AbstractC31795a.m98753x(this.f90092x, this.f90093y, obj);
            default:
                return AbstractC37947f.m121501H(this.f90092x, this.f90093y, (C39180l) obj);
        }
    }
}
