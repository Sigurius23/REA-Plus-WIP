package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import bc3.AbstractC3006f0;
import p003a1.C0109h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: androidx.room.z */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC1847z extends Binder implements InterfaceC1814o {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1771c0 f7228f;

    public BinderC1847z(C1771c0 c1771c0) {
        this.f7228f = c1771c0;
        attachInterface(this, InterfaceC1814o.f7135b);
    }

    @Override // androidx.room.InterfaceC1814o
    /* JADX INFO: renamed from: a */
    public final void mo5438a(String[] tables) {
        AbstractC22676k.m65750j(tables, "tables");
        C1771c0 c1771c0 = this.f7228f;
        AbstractC3006f0.m8732z(c1771c0.f6983d, null, null, new C0109h(tables, c1771c0, (InterfaceC30057d) null, 7), 3);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = InterfaceC1814o.f7135b;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i13 != 1) {
            return super.onTransact(i13, parcel, parcel2, i14);
        }
        mo5438a(parcel.createStringArray());
        return true;
    }
}
