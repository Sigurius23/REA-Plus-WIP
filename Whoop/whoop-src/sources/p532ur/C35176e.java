package p532ur;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.ServiceConnectionC1767b0;
import java.util.HashMap;
import java.util.Iterator;
import p073cq.C11040i;
import p087db.C11856j0;
import p559vr.AbstractBinderC36293c;
import p559vr.AbstractC36291a;
import p559vr.AbstractRunnableC36295e;
import p559vr.C36292b;
import p559vr.C36299i;
import p559vr.InterfaceC36294d;

/* JADX INFO: renamed from: ur.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35176e extends AbstractRunnableC36295e {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f149284x = 1;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f149285y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f149286z;

    public C35176e(ServiceConnectionC1767b0 serviceConnectionC1767b0, IBinder iBinder) {
        this.f149285y = iBinder;
        this.f149286z = serviceConnectionC1767b0;
    }

    @Override // p559vr.AbstractRunnableC36295e
    /* JADX INFO: renamed from: a */
    public final void mo111312a() {
        HashMap map;
        InterfaceC36294d c36292b = null;
        switch (this.f149284x) {
            case 0:
                try {
                    C35178g c35178g = (C35178g) this.f149286z;
                    InterfaceC36294d interfaceC36294d = c35178g.f149291a.f155554m;
                    String str = c35178g.f149292b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = AbstractC35179h.f149293a;
                    synchronized (AbstractC35179h.class) {
                        map = AbstractC35179h.f149293a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    C35178g c35178g2 = (C35178g) this.f149286z;
                    C11040i c11040i = (C11040i) this.f149285y;
                    String str2 = c35178g2.f149292b;
                    BinderC35177f binderC35177f = new BinderC35177f(c35178g2, c11040i);
                    C36292b c36292b2 = (C36292b) interfaceC36294d;
                    c36292b2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i13 = AbstractC36291a.f155530a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(binderC35177f);
                    try {
                        c36292b2.f155531f.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e5) {
                    C35178g c35178g3 = (C35178g) this.f149286z;
                    C11856j0 c11856j0 = C35178g.f149290c;
                    Object[] objArr = {c35178g3.f149292b};
                    c11856j0.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", C11856j0.m31817s(c11856j0.f38685x, "error requesting in-app review for %s", objArr), e5);
                    }
                    ((C11040i) this.f149285y).m29688c(new RuntimeException(e5));
                    return;
                }
            default:
                C36299i c36299i = (C36299i) ((ServiceConnectionC1767b0) this.f149286z).f6963x;
                IBinder iBinder = (IBinder) this.f149285y;
                int i14 = AbstractBinderC36293c.f155532g;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    c36292b = iInterfaceQueryLocalInterface instanceof InterfaceC36294d ? (InterfaceC36294d) iInterfaceQueryLocalInterface : new C36292b(iBinder);
                }
                c36299i.f155554m = c36292b;
                C11856j0 c11856j1 = c36299i.f155543b;
                c11856j1.m31831q("linkToDeath", new Object[0]);
                try {
                    ((C36292b) c36299i.f155554m).f155531f.linkToDeath(c36299i.f155551j, 0);
                    break;
                } catch (RemoteException e13) {
                    Object[] objArr2 = new Object[0];
                    c11856j1.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", C11856j0.m31817s(c11856j1.f38685x, "linkToDeath failed", objArr2), e13);
                    }
                }
                c36299i.f155548g = false;
                Iterator it = c36299i.f155545d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                c36299i.f155545d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35176e(C35178g c35178g, C11040i c11040i, C11040i c11040i2) {
        super(c11040i);
        this.f149285y = c11040i2;
        this.f149286z = c35178g;
    }
}
