package p503tp;

import android.app.PendingIntent;
import android.os.Parcel;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import np.C27006k;
import p014aj.C0928c;
import p073cq.C11040i;
import p073cq.C11048q;
import p229ip.BinderC20793d;
import p529uo.AbstractC35135w;
import to.InterfaceC33987n;

/* JADX INFO: renamed from: tp.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34045p implements InterfaceC33987n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142721w;

    /* JADX INFO: renamed from: x */
    public final PendingIntent f142722x;

    public /* synthetic */ C34045p(int i13, PendingIntent pendingIntent) {
        this.f142721w = i13;
        this.f142722x = pendingIntent;
    }

    @Override // to.InterfaceC33987n
    public final void accept(Object obj, Object obj2) {
        C27004i c27004i = (C27004i) obj;
        C11040i c11040i = (C11040i) obj2;
        switch (this.f142721w) {
            case 0:
                BinderC34048s binderC34048s = new BinderC34048s(1, c11040i);
                C0928c c0928c = (C0928c) c27004i.f107683A.f17959E;
                ((C27004i) c0928c.f3421x).m111058c();
                c0928c.m2318a0().m80984j0(new C27006k(2, null, null, this.f142722x, null, binderC34048s));
                break;
            case 1:
                c27004i.m111058c();
                PendingIntent pendingIntent = this.f142722x;
                AbstractC35135w.m111094f(pendingIntent);
                C27000e c27000e = (C27000e) c27004i.m111061j();
                Parcel parcelM80981s = c27000e.m80981s();
                AbstractC27007l.m80996c(parcelM80981s, pendingIntent);
                c27000e.m80980c0(parcelM80981s, 6);
                c11040i.m29687b(null);
                break;
            case 2:
                C11048q c11048q = new C11048q(4, c11040i);
                c27004i.m111058c();
                BinderC20793d binderC20793d = new BinderC20793d(c11048q);
                C27000e c27000e2 = (C27000e) c27004i.m111061j();
                Parcel parcelM80981s2 = c27000e2.m80981s();
                AbstractC27007l.m80996c(parcelM80981s2, this.f142722x);
                AbstractC27007l.m80997d(parcelM80981s2, binderC20793d);
                c27000e2.m80980c0(parcelM80981s2, 73);
                break;
            default:
                C11048q c11048q2 = new C11048q(4, c11040i);
                c27004i.m111058c();
                PendingIntent pendingIntent2 = this.f142722x;
                AbstractC35135w.m111095g(pendingIntent2, "PendingIntent must be specified.");
                BinderC20793d binderC20793d2 = new BinderC20793d(c11048q2);
                C27000e c27000e3 = (C27000e) c27004i.m111061j();
                Parcel parcelM80981s3 = c27000e3.m80981s();
                AbstractC27007l.m80996c(parcelM80981s3, pendingIntent2);
                AbstractC27007l.m80997d(parcelM80981s3, binderC20793d2);
                c27000e3.m80980c0(parcelM80981s3, 69);
                break;
        }
    }
}
