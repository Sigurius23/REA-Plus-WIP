package no0;

import c93.InterfaceC4339a;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.models.modal.AnyModal;
import hy0.C17749h0;
import lo0.C24568a;
import lo0.C24571b0;
import lo0.C24575d0;
import lo0.C24589k0;
import lo0.C24611v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p636y3.InterfaceC39171c;
import p668z1.C39970s;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.o0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26964o0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107584x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107585y;

    public /* synthetic */ C26964o0(int i13, Object obj, Object obj2) {
        this.f107583w = i13;
        this.f107584x = obj;
        this.f107585y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f107583w) {
            case 0:
                return Boolean.valueOf(AbstractC26962n0.b.m80726h((InterfaceC28670t2) this.f107584x, (InterfaceC39171c) this.f107585y));
            case 1:
                return AbstractC26935b.m80429f((C24568a) this.f107584x, (Function1) this.f107585y);
            case 2:
                return AbstractC26965p.m80739l((Function1) this.f107584x, (C17749h0) this.f107585y);
            case 3:
                return AbstractC26965p.m80741n((Function1) this.f107584x, (AnyModal) this.f107585y);
            case 4:
                return AbstractC26948g0.m80494q((C39970s) this.f107584x, (C24571b0.b) this.f107585y);
            case 5:
                return AbstractC26958l0.m80617S((C24575d0) this.f107584x, (InterfaceC28601c1) this.f107585y);
            case 6:
                return AbstractC26966p0.m80766w((Function1) this.f107584x, (C24589k0) this.f107585y);
            case 7:
                return AbstractC26980w0.m80901g((Function1) this.f107584x, (AppointmentButtonModel) this.f107585y);
            default:
                return AbstractC26940c1.m80463f((Function1) this.f107584x, (C24611v0) this.f107585y);
        }
    }
}
