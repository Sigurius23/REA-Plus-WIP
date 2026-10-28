package np;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import mn.C25704b;
import p503tp.BinderC34048s;
import p503tp.C34052w;
import p503tp.C34054y;
import p503tp.InterfaceC34053x;
import p503tp.InterfaceC34055z;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: np.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C27006k extends AbstractC36219a {
    public static final Parcelable.Creator<C27006k> CREATOR = new C25704b(18);

    /* JADX INFO: renamed from: E */
    public final InterfaceC34053x f107697E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC26999d f107698F;

    /* JADX INFO: renamed from: w */
    public final int f107699w;

    /* JADX INFO: renamed from: x */
    public final C27005j f107700x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC34055z f107701y;

    /* JADX INFO: renamed from: z */
    public final PendingIntent f107702z;

    public C27006k(int i13, C27005j c27005j, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        InterfaceC34055z c34054y;
        InterfaceC34053x c34052w;
        this.f107699w = i13;
        this.f107700x = c27005j;
        InterfaceC26999d c26998c = null;
        if (iBinder == null) {
            c34054y = null;
        } else {
            int i14 = AbstractBinderC27002g.f107681g;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            c34054y = iInterfaceQueryLocalInterface instanceof InterfaceC34055z ? (InterfaceC34055z) iInterfaceQueryLocalInterface : new C34054y(iBinder, "com.google.android.gms.location.ILocationListener");
        }
        this.f107701y = c34054y;
        this.f107702z = pendingIntent;
        if (iBinder2 == null) {
            c34052w = null;
        } else {
            int i15 = BinderC27001f.f107679h;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            c34052w = iInterfaceQueryLocalInterface2 instanceof InterfaceC34053x ? (InterfaceC34053x) iInterfaceQueryLocalInterface2 : new C34052w(iBinder2, "com.google.android.gms.location.ILocationCallback");
        }
        this.f107697E = c34052w;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            c26998c = iInterfaceQueryLocalInterface3 instanceof InterfaceC26999d ? (InterfaceC26999d) iInterfaceQueryLocalInterface3 : new C26998c(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }
        this.f107698F = c26998c;
    }

    /* JADX INFO: renamed from: b */
    public static C27006k m80992b(C27005j c27005j, PendingIntent pendingIntent, BinderC34048s binderC34048s) {
        return new C27006k(1, c27005j, null, pendingIntent, null, binderC34048s);
    }

    /* JADX INFO: renamed from: f */
    public static C27006k m80993f(BinderC27001f binderC27001f, BinderC34048s binderC34048s) {
        if (binderC34048s == null) {
            binderC34048s = null;
        }
        return new C27006k(2, null, null, null, binderC27001f, binderC34048s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f107699w);
        AbstractC36221c.m115331l(parcel, 2, this.f107700x, i13);
        IInterface iInterface = this.f107701y;
        AbstractC36221c.m115327h(parcel, 3, iInterface == null ? null : ((AbstractC26996a) iInterface).f107676f);
        AbstractC36221c.m115331l(parcel, 4, this.f107702z, i13);
        InterfaceC34053x interfaceC34053x = this.f107697E;
        AbstractC36221c.m115327h(parcel, 5, interfaceC34053x == null ? null : interfaceC34053x.asBinder());
        InterfaceC26999d interfaceC26999d = this.f107698F;
        AbstractC36221c.m115327h(parcel, 6, interfaceC26999d != null ? interfaceC26999d.asBinder() : null);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
