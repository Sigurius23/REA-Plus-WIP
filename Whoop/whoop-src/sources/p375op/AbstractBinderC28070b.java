package p375op;

import android.os.IBinder;
import android.os.IInterface;
import p229ip.AbstractBinderC20797h;

/* JADX INFO: renamed from: op.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractBinderC28070b extends AbstractBinderC20797h implements InterfaceC28071c {
    /* JADX INFO: renamed from: n0 */
    public static InterfaceC28071c m84848n0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC28071c ? (InterfaceC28071c) iInterfaceQueryLocalInterface : new C28069a(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
    }
}
