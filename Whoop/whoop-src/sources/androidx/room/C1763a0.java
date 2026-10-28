package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1763a0 extends AbstractC1826s {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1771c0 f6950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763a0(C1771c0 c1771c0, String[] strArr) {
        super(strArr);
        this.f6950b = c1771c0;
    }

    @Override // androidx.room.AbstractC1826s
    /* JADX INFO: renamed from: a */
    public final void mo5361a(Set tables) {
        AbstractC22676k.m65750j(tables, "tables");
        C1771c0 c1771c0 = this.f6950b;
        if (c1771c0.f6984e.get()) {
            return;
        }
        try {
            InterfaceC1820q interfaceC1820q = c1771c0.f6986g;
            if (interfaceC1820q != null) {
                interfaceC1820q.mo5415y(c1771c0.f6985f, (String[]) tables.toArray(new String[0]));
            }
        } catch (RemoteException e5) {
            Log.w("ROOM", "Cannot broadcast invalidation", e5);
        }
    }
}
