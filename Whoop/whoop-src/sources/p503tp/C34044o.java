package p503tp;

import android.content.Context;
import android.os.Parcel;
import cd3.C4455g;
import com.google.android.gms.location.LocationAvailability;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import p014aj.C0928c;
import p073cq.C11040i;
import to.InterfaceC33987n;

/* JADX INFO: renamed from: tp.o */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34044o implements InterfaceC33987n {

    /* JADX INFO: renamed from: x */
    public static final C34044o f142718x = new C34044o(0);

    /* JADX INFO: renamed from: y */
    public static final C34044o f142719y = new C34044o(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142720w;

    public /* synthetic */ C34044o(int i13) {
        this.f142720w = i13;
    }

    @Override // to.InterfaceC33987n
    public final void accept(Object obj, Object obj2) {
        C27004i c27004i = (C27004i) obj;
        C11040i c11040i = (C11040i) obj2;
        switch (this.f142720w) {
            case 0:
                C4455g c4455g = c27004i.f107683A;
                C0928c c0928c = (C0928c) c4455g.f17959E;
                ((C27004i) c0928c.f3421x).m111058c();
                C27000e c27000eM2318a0 = c0928c.m2318a0();
                String packageName = ((Context) c4455g.f17960F).getPackageName();
                Parcel parcelM80981s = c27000eM2318a0.m80981s();
                parcelM80981s.writeString(packageName);
                Parcel parcelM80979X = c27000eM2318a0.m80979X(parcelM80981s, 34);
                LocationAvailability locationAvailability = (LocationAvailability) AbstractC27007l.m80995b(parcelM80979X, LocationAvailability.CREATOR);
                parcelM80979X.recycle();
                c11040i.m29687b(locationAvailability);
                break;
            default:
                BinderC34048s binderC34048s = new BinderC34048s(1, c11040i);
                C0928c c0928c2 = (C0928c) c27004i.f107683A.f17959E;
                ((C27004i) c0928c2.f3421x).m111058c();
                C27000e c27000eM2318a1 = c0928c2.m2318a0();
                Parcel parcelM80981s2 = c27000eM2318a1.m80981s();
                AbstractC27007l.m80997d(parcelM80981s2, binderC34048s);
                c27000eM2318a1.m80980c0(parcelM80981s2, 67);
                break;
        }
    }
}
