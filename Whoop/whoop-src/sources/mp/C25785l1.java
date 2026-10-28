package mp;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: mp.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25785l1 implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f101510f;

    /* JADX INFO: renamed from: g */
    public final String f101511g;

    public C25785l1(IBinder iBinder, String str) {
        this.f101510f = iBinder;
        this.f101511g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f101510f;
    }
}
