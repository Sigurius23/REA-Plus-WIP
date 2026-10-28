package eu;

import android.os.Parcel;
import android.os.RemoteException;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;
import l83.C23454a0;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p375op.AbstractC28076h;
import p375op.C28073e;
import p591wp.C37483d;
import p591wp.C37491l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13623l0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C13623l0 f48255E;

    /* JADX INFO: renamed from: F */
    public static final C13623l0 f48256F;

    /* JADX INFO: renamed from: G */
    public static final C13623l0 f48257G;

    /* JADX INFO: renamed from: H */
    public static final C13623l0 f48258H;

    /* JADX INFO: renamed from: I */
    public static final C13623l0 f48259I;

    /* JADX INFO: renamed from: J */
    public static final C13623l0 f48260J;

    /* JADX INFO: renamed from: x */
    public static final C13623l0 f48261x;

    /* JADX INFO: renamed from: y */
    public static final C13623l0 f48262y;

    /* JADX INFO: renamed from: z */
    public static final C13623l0 f48263z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48264w;

    static {
        int i13 = 2;
        f48261x = new C13623l0(i13, 0);
        f48262y = new C13623l0(i13, 1);
        f48263z = new C13623l0(i13, 2);
        f48255E = new C13623l0(i13, 3);
        f48256F = new C13623l0(i13, 4);
        f48257G = new C13623l0(i13, 5);
        f48258H = new C13623l0(i13, 6);
        f48259I = new C13623l0(i13, 7);
        f48260J = new C13623l0(i13, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13623l0(int i13, int i14) {
        super(i13);
        this.f48264w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f48264w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C13627n0 update = (C13627n0) obj;
                Function1 it = (Function1) obj2;
                AbstractC22676k.m65750j(update, "$this$update");
                AbstractC22676k.m65750j(it, "it");
                update.f48300b = it;
                return c23454a0;
            case 1:
                C13627n0 set = (C13627n0) obj;
                List it3 = (List) obj2;
                AbstractC22676k.m65750j(set, "$this$set");
                AbstractC22676k.m65750j(it3, "it");
                C37491l c37491l = set.f48299a;
                c37491l.getClass();
                try {
                    C28073e c28073e = (C28073e) c37491l.f160356a;
                    Parcel parcelM57322k0 = c28073e.m57322k0();
                    parcelM57322k0.writeTypedList(it3);
                    c28073e.m57323l0(parcelM57322k0, 3);
                    return c23454a0;
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            case 2:
                C13627n0 set2 = (C13627n0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set2, "$this$set");
                C37491l c37491l2 = set2.f48299a;
                c37491l2.getClass();
                try {
                    C28073e c28073e2 = (C28073e) c37491l2.f160356a;
                    Parcel parcelM57322k1 = c28073e2.m57322k0();
                    int i14 = AbstractC28076h.f113570a;
                    parcelM57322k1.writeInt(zBooleanValue ? 1 : 0);
                    c28073e2.m57323l0(parcelM57322k1, 17);
                    return c23454a0;
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
            case 3:
                C13627n0 set3 = (C13627n0) obj;
                long j7 = ((C17919x) obj2).f69639a;
                AbstractC22676k.m65750j(set3, "$this$set");
                C37491l c37491l3 = set3.f48299a;
                int iM51506H = AbstractC17918w0.m51506H(j7);
                c37491l3.getClass();
                try {
                    C28073e c28073e3 = (C28073e) c37491l3.f160356a;
                    Parcel parcelM57322k2 = c28073e3.m57322k0();
                    parcelM57322k2.writeInt(iM51506H);
                    c28073e3.m57323l0(parcelM57322k2, 7);
                    return c23454a0;
                } catch (RemoteException e14) {
                    throw new RuntimeRemoteException(e14);
                }
            case 4:
                C13627n0 set4 = (C13627n0) obj;
                C37483d it4 = (C37483d) obj2;
                AbstractC22676k.m65750j(set4, "$this$set");
                AbstractC22676k.m65750j(it4, "it");
                C37491l c37491l4 = set4.f48299a;
                c37491l4.getClass();
                try {
                    C28073e c28073e4 = (C28073e) c37491l4.f160356a;
                    Parcel parcelM57322k3 = c28073e4.m57322k0();
                    AbstractC28076h.m84851c(parcelM57322k3, it4);
                    c28073e4.m57323l0(parcelM57322k3, 21);
                    return c23454a0;
                } catch (RemoteException e15) {
                    throw new RuntimeRemoteException(e15);
                }
            case 5:
                C13627n0 set5 = (C13627n0) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set5, "$this$set");
                C37491l c37491l5 = set5.f48299a;
                c37491l5.getClass();
                try {
                    C28073e c28073e5 = (C28073e) c37491l5.f160356a;
                    Parcel parcelM57322k4 = c28073e5.m57322k0();
                    int i15 = AbstractC28076h.f113570a;
                    parcelM57322k4.writeInt(zBooleanValue2 ? 1 : 0);
                    c28073e5.m57323l0(parcelM57322k4, 13);
                    return c23454a0;
                } catch (RemoteException e16) {
                    throw new RuntimeRemoteException(e16);
                }
            case 6:
                C13627n0 set6 = (C13627n0) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC22676k.m65750j(set6, "$this$set");
                C37491l c37491l6 = set6.f48299a;
                c37491l6.getClass();
                try {
                    C28073e c28073e6 = (C28073e) c37491l6.f160356a;
                    Parcel parcelM57322k5 = c28073e6.m57322k0();
                    parcelM57322k5.writeInt(iIntValue);
                    c28073e6.m57323l0(parcelM57322k5, 23);
                    return c23454a0;
                } catch (RemoteException e17) {
                    throw new RuntimeRemoteException(e17);
                }
            case 7:
                C13627n0 set7 = (C13627n0) obj;
                List list = (List) obj2;
                AbstractC22676k.m65750j(set7, "$this$set");
                C37491l c37491l7 = set7.f48299a;
                c37491l7.getClass();
                try {
                    C28073e c28073e7 = (C28073e) c37491l7.f160356a;
                    Parcel parcelM57322k6 = c28073e7.m57322k0();
                    parcelM57322k6.writeTypedList(list);
                    c28073e7.m57323l0(parcelM57322k6, 25);
                    return c23454a0;
                } catch (RemoteException e18) {
                    throw new RuntimeRemoteException(e18);
                }
            default:
                C13627n0 set8 = (C13627n0) obj;
                C37483d it5 = (C37483d) obj2;
                AbstractC22676k.m65750j(set8, "$this$set");
                AbstractC22676k.m65750j(it5, "it");
                C37491l c37491l8 = set8.f48299a;
                c37491l8.getClass();
                try {
                    C28073e c28073e8 = (C28073e) c37491l8.f160356a;
                    Parcel parcelM57322k7 = c28073e8.m57322k0();
                    AbstractC28076h.m84851c(parcelM57322k7, it5);
                    c28073e8.m57323l0(parcelM57322k7, 19);
                    return c23454a0;
                } catch (RemoteException e19) {
                    throw new RuntimeRemoteException(e19);
                }
        }
    }
}
