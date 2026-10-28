package eu;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import l83.C23454a0;
import p072cp.InterfaceC10934a;
import p181h2.C16617b;
import p375op.AbstractC28076h;
import p375op.C28069a;
import p375op.C28073e;
import p375op.InterfaceC28071c;
import p530up.C35146b;
import p558vp.C36261e;
import p591wp.C37481b;
import p591wp.C37487h;
import p591wp.C37491l;
import p634y1.C39029b;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C13602b extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C13602b f48101E;

    /* JADX INFO: renamed from: F */
    public static final C13602b f48102F;

    /* JADX INFO: renamed from: G */
    public static final C13602b f48103G;

    /* JADX INFO: renamed from: H */
    public static final C13602b f48104H;

    /* JADX INFO: renamed from: I */
    public static final C13602b f48105I;

    /* JADX INFO: renamed from: J */
    public static final C13602b f48106J;

    /* JADX INFO: renamed from: K */
    public static final C13602b f48107K;

    /* JADX INFO: renamed from: L */
    public static final C13602b f48108L;

    /* JADX INFO: renamed from: M */
    public static final C13602b f48109M;

    /* JADX INFO: renamed from: N */
    public static final C13602b f48110N;

    /* JADX INFO: renamed from: O */
    public static final C13602b f48111O;

    /* JADX INFO: renamed from: P */
    public static final C13602b f48112P;

    /* JADX INFO: renamed from: Q */
    public static final C13602b f48113Q;

    /* JADX INFO: renamed from: R */
    public static final C13602b f48114R;

    /* JADX INFO: renamed from: S */
    public static final C13602b f48115S;

    /* JADX INFO: renamed from: T */
    public static final C13602b f48116T;

    /* JADX INFO: renamed from: U */
    public static final C13602b f48117U;

    /* JADX INFO: renamed from: V */
    public static final C13602b f48118V;

    /* JADX INFO: renamed from: W */
    public static final C13602b f48119W;

    /* JADX INFO: renamed from: X */
    public static final C13602b f48120X;

    /* JADX INFO: renamed from: Y */
    public static final C13602b f48121Y;

    /* JADX INFO: renamed from: Z */
    public static final C13602b f48122Z;

    /* JADX INFO: renamed from: a0 */
    public static final C13602b f48123a0;

    /* JADX INFO: renamed from: b0 */
    public static final C13602b f48124b0;

    /* JADX INFO: renamed from: c0 */
    public static final C13602b f48125c0;

    /* JADX INFO: renamed from: d0 */
    public static final C13602b f48126d0;

    /* JADX INFO: renamed from: e0 */
    public static final C13602b f48127e0;

    /* JADX INFO: renamed from: x */
    public static final C13602b f48128x;

    /* JADX INFO: renamed from: y */
    public static final C13602b f48129y;

    /* JADX INFO: renamed from: z */
    public static final C13602b f48130z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48131w;

    static {
        int i13 = 2;
        f48128x = new C13602b(i13, 0);
        f48129y = new C13602b(i13, 1);
        f48130z = new C13602b(i13, 2);
        f48101E = new C13602b(i13, 3);
        f48102F = new C13602b(i13, 4);
        f48103G = new C13602b(i13, 5);
        f48104H = new C13602b(i13, 6);
        f48105I = new C13602b(i13, 7);
        f48106J = new C13602b(i13, 8);
        f48107K = new C13602b(i13, 9);
        f48108L = new C13602b(i13, 10);
        f48109M = new C13602b(i13, 11);
        f48110N = new C13602b(i13, 12);
        f48111O = new C13602b(i13, 13);
        f48112P = new C13602b(i13, 14);
        f48113Q = new C13602b(i13, 15);
        f48114R = new C13602b(i13, 16);
        f48115S = new C13602b(i13, 17);
        f48116T = new C13602b(i13, 18);
        f48117U = new C13602b(i13, 19);
        f48118V = new C13602b(i13, 20);
        f48119W = new C13602b(i13, 21);
        f48120X = new C13602b(i13, 22);
        f48121Y = new C13602b(i13, 23);
        f48122Z = new C13602b(i13, 24);
        f48123a0 = new C13602b(i13, 25);
        f48124b0 = new C13602b(i13, 26);
        f48125c0 = new C13602b(i13, 27);
        f48126d0 = new C13602b(i13, 28);
        f48127e0 = new C13602b(i13, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13602b(int i13, int i14) {
        super(i13);
        this.f48131w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f48131w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C39029b Saver = (C39029b) obj;
                C13612g it = (C13612g) obj2;
                AbstractC22676k.m65750j(Saver, "$this$Saver");
                AbstractC22676k.m65750j(it, "it");
                return (CameraPosition) it.f48189c.getValue();
            case 1:
                C13603b0 update = (C13603b0) obj;
                InterfaceC39171c it3 = (InterfaceC39171c) obj2;
                AbstractC22676k.m65750j(update, "$this$update");
                AbstractC22676k.m65750j(it3, "it");
                update.f48134c = it3;
                return c23454a0;
            case 2:
                C13603b0 update2 = (C13603b0) obj;
                C13612g it4 = (C13612g) obj2;
                AbstractC22676k.m65750j(update2, "$this$update");
                AbstractC22676k.m65750j(it4, "it");
                if (!it4.equals(update2.f48136e)) {
                    update2.f48136e.m38431c(null);
                    update2.f48136e = it4;
                    it4.m38431c(update2.f48132a);
                }
                return c23454a0;
            case 3:
                C13603b0 update3 = (C13603b0) obj;
                C13636w it5 = (C13636w) obj2;
                AbstractC22676k.m65750j(update3, "$this$update");
                AbstractC22676k.m65750j(it5, "it");
                update3.f48133b = it5;
                return c23454a0;
            case 4:
                C13603b0 update4 = (C13603b0) obj;
                EnumC39181m it6 = (EnumC39181m) obj2;
                AbstractC22676k.m65750j(update4, "$this$update");
                AbstractC22676k.m65750j(it6, "it");
                update4.f48135d = it6;
                return c23454a0;
            case 5:
                C13603b0 update5 = (C13603b0) obj;
                String str = (String) obj2;
                AbstractC22676k.m65750j(update5, "$this$update");
                C35146b c35146b = update5.f48132a;
                c35146b.getClass();
                try {
                    C36261e c36261e = c35146b.f149130a;
                    Parcel parcelM57322k0 = c36261e.m57322k0();
                    parcelM57322k0.writeString(str);
                    c36261e.m57323l0(parcelM57322k0, 61);
                    return c23454a0;
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            case 6:
                C13617i0 set = (C13617i0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set, "$this$set");
                C37487h c37487h = set.f48225b;
                c37487h.getClass();
                try {
                    C28069a c28069a = (C28069a) c37487h.f160331a;
                    Parcel parcelM57322k1 = c28069a.m57322k0();
                    int i14 = AbstractC28076h.f113570a;
                    parcelM57322k1.writeInt(zBooleanValue ? 1 : 0);
                    c28069a.m57323l0(parcelM57322k1, 20);
                    return c23454a0;
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
            case 7:
                C13617i0 set2 = (C13617i0) obj;
                C37481b c37481b = (C37481b) obj2;
                AbstractC22676k.m65750j(set2, "$this$set");
                InterfaceC28071c interfaceC28071c = set2.f48225b.f160331a;
                try {
                    if (c37481b == null) {
                        C28069a c28069a2 = (C28069a) interfaceC28071c;
                        Parcel parcelM57322k2 = c28069a2.m57322k0();
                        AbstractC28076h.m84852d(parcelM57322k2, null);
                        c28069a2.m57323l0(parcelM57322k2, 18);
                    } else {
                        InterfaceC10934a interfaceC10934a = c37481b.f160319a;
                        C28069a c28069a3 = (C28069a) interfaceC28071c;
                        Parcel parcelM57322k3 = c28069a3.m57322k0();
                        AbstractC28076h.m84852d(parcelM57322k3, interfaceC10934a);
                        c28069a3.m57323l0(parcelM57322k3, 18);
                    }
                    return c23454a0;
                } catch (RemoteException e14) {
                    throw new RuntimeRemoteException(e14);
                }
            case 8:
                C13617i0 set3 = (C13617i0) obj;
                long j7 = ((C16617b) obj2).f63937a;
                AbstractC22676k.m65750j(set3, "$this$set");
                C37487h c37487h2 = set3.f48225b;
                float fM47189e = C16617b.m47189e(j7);
                float fM47190f = C16617b.m47190f(j7);
                try {
                    C28069a c28069a4 = (C28069a) c37487h2.f160331a;
                    Parcel parcelM57322k4 = c28069a4.m57322k0();
                    parcelM57322k4.writeFloat(fM47189e);
                    parcelM57322k4.writeFloat(fM47190f);
                    c28069a4.m57323l0(parcelM57322k4, 24);
                    return c23454a0;
                } catch (RemoteException e15) {
                    throw new RuntimeRemoteException(e15);
                }
            case 9:
                C13617i0 set4 = (C13617i0) obj;
                LatLng it7 = (LatLng) obj2;
                AbstractC22676k.m65750j(set4, "$this$set");
                AbstractC22676k.m65750j(it7, "it");
                C37487h c37487h3 = set4.f48225b;
                c37487h3.getClass();
                try {
                    C28069a c28069a5 = (C28069a) c37487h3.f160331a;
                    Parcel parcelM57322k5 = c28069a5.m57322k0();
                    AbstractC28076h.m84851c(parcelM57322k5, it7);
                    c28069a5.m57323l0(parcelM57322k5, 3);
                    return c23454a0;
                } catch (RemoteException e16) {
                    throw new RuntimeRemoteException(e16);
                }
            case 10:
                C13617i0 set5 = (C13617i0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set5, "$this$set");
                C37487h c37487h4 = set5.f48225b;
                c37487h4.getClass();
                try {
                    C28069a c28069a6 = (C28069a) c37487h4.f160331a;
                    Parcel parcelM57322k6 = c28069a6.m57322k0();
                    parcelM57322k6.writeFloat(fFloatValue);
                    c28069a6.m57323l0(parcelM57322k6, 22);
                    return c23454a0;
                } catch (RemoteException e17) {
                    throw new RuntimeRemoteException(e17);
                }
            case 11:
                C13617i0 set6 = (C13617i0) obj;
                String str2 = (String) obj2;
                AbstractC22676k.m65750j(set6, "$this$set");
                C37487h c37487h5 = set6.f48225b;
                c37487h5.getClass();
                try {
                    C28069a c28069a7 = (C28069a) c37487h5.f160331a;
                    Parcel parcelM57322k7 = c28069a7.m57322k0();
                    parcelM57322k7.writeString(str2);
                    c28069a7.m57323l0(parcelM57322k7, 7);
                    if (c37487h5.m120173b()) {
                        c37487h5.m120175d();
                    }
                    return c23454a0;
                } catch (RemoteException e18) {
                    throw new RuntimeRemoteException(e18);
                }
            case 12:
                C13617i0 set7 = (C13617i0) obj;
                AbstractC22676k.m65750j(set7, "$this$set");
                set7.f48225b.m120174c(obj2);
                return c23454a0;
            case 13:
                C13617i0 set8 = (C13617i0) obj;
                String str3 = (String) obj2;
                AbstractC22676k.m65750j(set8, "$this$set");
                C37487h c37487h6 = set8.f48225b;
                c37487h6.getClass();
                try {
                    C28069a c28069a8 = (C28069a) c37487h6.f160331a;
                    Parcel parcelM57322k8 = c28069a8.m57322k0();
                    parcelM57322k8.writeString(str3);
                    c28069a8.m57323l0(parcelM57322k8, 5);
                    if (c37487h6.m120173b()) {
                        c37487h6.m120175d();
                    }
                    return c23454a0;
                } catch (RemoteException e19) {
                    throw new RuntimeRemoteException(e19);
                }
            case 14:
                C13617i0 set9 = (C13617i0) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set9, "$this$set");
                C37487h c37487h7 = set9.f48225b;
                c37487h7.getClass();
                try {
                    C28069a c28069a9 = (C28069a) c37487h7.f160331a;
                    Parcel parcelM57322k9 = c28069a9.m57322k0();
                    int i15 = AbstractC28076h.f113570a;
                    parcelM57322k9.writeInt(zBooleanValue2 ? 1 : 0);
                    c28069a9.m57323l0(parcelM57322k9, 14);
                    return c23454a0;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            case 15:
                C13617i0 set10 = (C13617i0) obj;
                float fFloatValue2 = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set10, "$this$set");
                C37487h c37487h8 = set10.f48225b;
                c37487h8.getClass();
                try {
                    C28069a c28069a10 = (C28069a) c37487h8.f160331a;
                    Parcel parcelM57322k10 = c28069a10.m57322k0();
                    parcelM57322k10.writeFloat(fFloatValue2);
                    c28069a10.m57323l0(parcelM57322k10, 27);
                    return c23454a0;
                } catch (RemoteException e24) {
                    throw new RuntimeRemoteException(e24);
                }
            case 16:
                C13617i0 update6 = (C13617i0) obj;
                Function1 it8 = (Function1) obj2;
                AbstractC22676k.m65750j(update6, "$this$update");
                AbstractC22676k.m65750j(it8, "it");
                update6.f48227d = it8;
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C13617i0 update7 = (C13617i0) obj;
                Function1 it9 = (Function1) obj2;
                AbstractC22676k.m65750j(update7, "$this$update");
                AbstractC22676k.m65750j(it9, "it");
                update7.f48228e = it9;
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C13617i0 update8 = (C13617i0) obj;
                Function1 it10 = (Function1) obj2;
                AbstractC22676k.m65750j(update8, "$this$update");
                AbstractC22676k.m65750j(it10, "it");
                update8.f48229f = it10;
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C13617i0 update9 = (C13617i0) obj;
                Function1 it11 = (Function1) obj2;
                AbstractC22676k.m65750j(update9, "$this$update");
                AbstractC22676k.m65750j(it11, "it");
                update9.f48230g = it11;
                return c23454a0;
            case 20:
                C13617i0 update10 = (C13617i0) obj;
                AbstractC22676k.m65750j(update10, "$this$update");
                update10.f48232i = (Function3) obj2;
                return c23454a0;
            case 21:
                C13617i0 update11 = (C13617i0) obj;
                AbstractC22676k.m65750j(update11, "$this$update");
                update11.f48231h = (Function3) obj2;
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C13617i0 set11 = (C13617i0) obj;
                float fFloatValue3 = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set11, "$this$set");
                C37487h c37487h9 = set11.f48225b;
                c37487h9.getClass();
                try {
                    C28069a c28069a11 = (C28069a) c37487h9.f160331a;
                    Parcel parcelM57322k11 = c28069a11.m57322k0();
                    parcelM57322k11.writeFloat(fFloatValue3);
                    c28069a11.m57323l0(parcelM57322k11, 25);
                    return c23454a0;
                } catch (RemoteException e25) {
                    throw new RuntimeRemoteException(e25);
                }
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C13617i0 set12 = (C13617i0) obj;
                long j13 = ((C16617b) obj2).f63937a;
                AbstractC22676k.m65750j(set12, "$this$set");
                C37487h c37487h10 = set12.f48225b;
                float fM47189e2 = C16617b.m47189e(j13);
                float fM47190f2 = C16617b.m47190f(j13);
                try {
                    C28069a c28069a12 = (C28069a) c37487h10.f160331a;
                    Parcel parcelM57322k12 = c28069a12.m57322k0();
                    parcelM57322k12.writeFloat(fM47189e2);
                    parcelM57322k12.writeFloat(fM47190f2);
                    c28069a12.m57323l0(parcelM57322k12, 19);
                    return c23454a0;
                } catch (RemoteException e26) {
                    throw new RuntimeRemoteException(e26);
                }
            case 24:
                C13617i0 set13 = (C13617i0) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set13, "$this$set");
                C37487h c37487h11 = set13.f48225b;
                c37487h11.getClass();
                try {
                    C28069a c28069a13 = (C28069a) c37487h11.f160331a;
                    Parcel parcelM57322k13 = c28069a13.m57322k0();
                    int i16 = AbstractC28076h.f113570a;
                    parcelM57322k13.writeInt(zBooleanValue3 ? 1 : 0);
                    c28069a13.m57323l0(parcelM57322k13, 9);
                    return c23454a0;
                } catch (RemoteException e27) {
                    throw new RuntimeRemoteException(e27);
                }
            case 25:
                C39029b Saver2 = (C39029b) obj;
                C13619j0 it12 = (C13619j0) obj2;
                AbstractC22676k.m65750j(Saver2, "$this$Saver");
                AbstractC22676k.m65750j(it12, "it");
                return (LatLng) it12.f48237a.getValue();
            case 26:
                C13627n0 set14 = (C13627n0) obj;
                AbstractC22676k.m65750j(set14, "$this$set");
                set14.f48299a.m120176a(obj2);
                return c23454a0;
            case 27:
                C13627n0 set15 = (C13627n0) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set15, "$this$set");
                C37491l c37491l = set15.f48299a;
                c37491l.getClass();
                try {
                    C28073e c28073e = (C28073e) c37491l.f160356a;
                    Parcel parcelM57322k14 = c28073e.m57322k0();
                    int i17 = AbstractC28076h.f113570a;
                    parcelM57322k14.writeInt(zBooleanValue4 ? 1 : 0);
                    c28073e.m57323l0(parcelM57322k14, 11);
                    return c23454a0;
                } catch (RemoteException e28) {
                    throw new RuntimeRemoteException(e28);
                }
            case 28:
                C13627n0 set16 = (C13627n0) obj;
                float fFloatValue4 = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set16, "$this$set");
                C37491l c37491l2 = set16.f48299a;
                c37491l2.getClass();
                try {
                    C28073e c28073e2 = (C28073e) c37491l2.f160356a;
                    Parcel parcelM57322k15 = c28073e2.m57322k0();
                    parcelM57322k15.writeFloat(fFloatValue4);
                    c28073e2.m57323l0(parcelM57322k15, 5);
                    return c23454a0;
                } catch (RemoteException e29) {
                    throw new RuntimeRemoteException(e29);
                }
            default:
                C13627n0 set17 = (C13627n0) obj;
                float fFloatValue5 = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set17, "$this$set");
                C37491l c37491l3 = set17.f48299a;
                c37491l3.getClass();
                try {
                    C28073e c28073e3 = (C28073e) c37491l3.f160356a;
                    Parcel parcelM57322k16 = c28073e3.m57322k0();
                    parcelM57322k16.writeFloat(fFloatValue5);
                    c28073e3.m57323l0(parcelM57322k16, 9);
                    return c23454a0;
                } catch (RemoteException e34) {
                    throw new RuntimeRemoteException(e34);
                }
        }
    }
}
