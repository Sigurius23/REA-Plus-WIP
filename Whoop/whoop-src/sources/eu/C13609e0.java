package eu;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import l83.C23454a0;
import p291l0.InterfaceC22973k1;
import p375op.AbstractC28076h;
import p508ty.C34249c;
import p530up.C35146b;
import p558vp.C36258b;
import p558vp.C36261e;
import p591wp.C37486g;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13609e0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48171w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35146b f48172x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13609e0(C35146b c35146b, int i13) {
        super(2);
        this.f48171w = i13;
        this.f48172x = c35146b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f48171w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C35146b c35146b = this.f48172x;
        switch (i13) {
            case 0:
                C13603b0 set = (C13603b0) obj;
                C37486g c37486g = (C37486g) obj2;
                AbstractC22676k.m65750j(set, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e = c35146b.f149130a;
                    Parcel parcelM57322k0 = c36261e.m57322k0();
                    AbstractC28076h.m84851c(parcelM57322k0, c37486g);
                    Parcel parcelM57321j0 = c36261e.m57321j0(parcelM57322k0, 91);
                    parcelM57321j0.readInt();
                    parcelM57321j0.recycle();
                    return c23454a0;
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            case 1:
                C13603b0 set2 = (C13603b0) obj;
                EnumC13605c0 it = (EnumC13605c0) obj2;
                AbstractC22676k.m65750j(set2, "$this$set");
                AbstractC22676k.m65750j(it, "it");
                int i14 = it.f48155w;
                c35146b.getClass();
                try {
                    C36261e c36261e2 = c35146b.f149130a;
                    Parcel parcelM57322k1 = c36261e2.m57322k0();
                    parcelM57322k1.writeInt(i14);
                    c36261e2.m57323l0(parcelM57322k1, 16);
                    return c23454a0;
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
            case 2:
                C13603b0 set3 = (C13603b0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set3, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e3 = c35146b.f149130a;
                    Parcel parcelM57322k2 = c36261e3.m57322k0();
                    parcelM57322k2.writeFloat(fFloatValue);
                    c36261e3.m57323l0(parcelM57322k2, 93);
                    return c23454a0;
                } catch (RemoteException e14) {
                    throw new RuntimeRemoteException(e14);
                }
            case 3:
                C13603b0 set4 = (C13603b0) obj;
                float fFloatValue2 = ((Number) obj2).floatValue();
                AbstractC22676k.m65750j(set4, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e4 = c35146b.f149130a;
                    Parcel parcelM57322k3 = c36261e4.m57322k0();
                    parcelM57322k3.writeFloat(fFloatValue2);
                    c36261e4.m57323l0(parcelM57322k3, 92);
                    return c23454a0;
                } catch (RemoteException e15) {
                    throw new RuntimeRemoteException(e15);
                }
            case 4:
                C13603b0 set5 = (C13603b0) obj;
                InterfaceC22973k1 it3 = (InterfaceC22973k1) obj2;
                AbstractC22676k.m65750j(set5, "$this$set");
                AbstractC22676k.m65750j(it3, "it");
                InterfaceC39171c interfaceC39171c = set5.f48134c;
                int iMo724F = interfaceC39171c.mo724F(it3.mo43110b(set5.f48135d));
                int iMo724F2 = interfaceC39171c.mo724F(it3.mo43112d());
                int iMo724F3 = interfaceC39171c.mo724F(it3.mo43111c(set5.f48135d));
                int iMo724F4 = interfaceC39171c.mo724F(it3.mo43109a());
                c35146b.getClass();
                try {
                    C36261e c36261e5 = c35146b.f149130a;
                    Parcel parcelM57322k4 = c36261e5.m57322k0();
                    parcelM57322k4.writeInt(iMo724F);
                    parcelM57322k4.writeInt(iMo724F2);
                    parcelM57322k4.writeInt(iMo724F3);
                    parcelM57322k4.writeInt(iMo724F4);
                    c36261e5.m57323l0(parcelM57322k4, 39);
                    return c23454a0;
                } catch (RemoteException e16) {
                    throw new RuntimeRemoteException(e16);
                }
            case 5:
                C13603b0 set6 = (C13603b0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set6, "$this$set");
                C34249c c34249cM111147b = c35146b.m111147b();
                c34249cM111147b.getClass();
                try {
                    C36258b c36258b = (C36258b) c34249cM111147b.f143660x;
                    Parcel parcelM57322k5 = c36258b.m57322k0();
                    int i15 = AbstractC28076h.f113570a;
                    parcelM57322k5.writeInt(zBooleanValue ? 1 : 0);
                    c36258b.m57323l0(parcelM57322k5, 2);
                    return c23454a0;
                } catch (RemoteException e17) {
                    throw new RuntimeRemoteException(e17);
                }
            case 6:
                C13603b0 set7 = (C13603b0) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set7, "$this$set");
                C34249c c34249cM111147b2 = c35146b.m111147b();
                c34249cM111147b2.getClass();
                try {
                    C36258b c36258b2 = (C36258b) c34249cM111147b2.f143660x;
                    Parcel parcelM57322k6 = c36258b2.m57322k0();
                    int i16 = AbstractC28076h.f113570a;
                    parcelM57322k6.writeInt(zBooleanValue2 ? 1 : 0);
                    c36258b2.m57323l0(parcelM57322k6, 16);
                    return c23454a0;
                } catch (RemoteException e18) {
                    throw new RuntimeRemoteException(e18);
                }
            case 7:
                C13603b0 set8 = (C13603b0) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set8, "$this$set");
                C34249c c34249cM111147b3 = c35146b.m111147b();
                c34249cM111147b3.getClass();
                try {
                    C36258b c36258b3 = (C36258b) c34249cM111147b3.f143660x;
                    Parcel parcelM57322k7 = c36258b3.m57322k0();
                    int i17 = AbstractC28076h.f113570a;
                    parcelM57322k7.writeInt(zBooleanValue3 ? 1 : 0);
                    c36258b3.m57323l0(parcelM57322k7, 18);
                    return c23454a0;
                } catch (RemoteException e19) {
                    throw new RuntimeRemoteException(e19);
                }
            case 8:
                C13603b0 set9 = (C13603b0) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set9, "$this$set");
                C34249c c34249cM111147b4 = c35146b.m111147b();
                c34249cM111147b4.getClass();
                try {
                    C36258b c36258b4 = (C36258b) c34249cM111147b4.f143660x;
                    Parcel parcelM57322k8 = c36258b4.m57322k0();
                    int i18 = AbstractC28076h.f113570a;
                    parcelM57322k8.writeInt(zBooleanValue4 ? 1 : 0);
                    c36258b4.m57323l0(parcelM57322k8, 3);
                    return c23454a0;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            case 9:
                C13603b0 set10 = (C13603b0) obj;
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set10, "$this$set");
                C34249c c34249cM111147b5 = c35146b.m111147b();
                c34249cM111147b5.getClass();
                try {
                    C36258b c36258b5 = (C36258b) c34249cM111147b5.f143660x;
                    Parcel parcelM57322k9 = c36258b5.m57322k0();
                    int i19 = AbstractC28076h.f113570a;
                    parcelM57322k9.writeInt(zBooleanValue5 ? 1 : 0);
                    c36258b5.m57323l0(parcelM57322k9, 7);
                    return c23454a0;
                } catch (RemoteException e24) {
                    throw new RuntimeRemoteException(e24);
                }
            case 10:
                C13603b0 set11 = (C13603b0) obj;
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set11, "$this$set");
                C34249c c34249cM111147b6 = c35146b.m111147b();
                c34249cM111147b6.getClass();
                try {
                    C36258b c36258b6 = (C36258b) c34249cM111147b6.f143660x;
                    Parcel parcelM57322k10 = c36258b6.m57322k0();
                    int i24 = AbstractC28076h.f113570a;
                    parcelM57322k10.writeInt(zBooleanValue6 ? 1 : 0);
                    c36258b6.m57323l0(parcelM57322k10, 4);
                    return c23454a0;
                } catch (RemoteException e25) {
                    throw new RuntimeRemoteException(e25);
                }
            case 11:
                C13603b0 set12 = (C13603b0) obj;
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set12, "$this$set");
                C34249c c34249cM111147b7 = c35146b.m111147b();
                c34249cM111147b7.getClass();
                try {
                    C36258b c36258b7 = (C36258b) c34249cM111147b7.f143660x;
                    Parcel parcelM57322k11 = c36258b7.m57322k0();
                    int i25 = AbstractC28076h.f113570a;
                    parcelM57322k11.writeInt(zBooleanValue7 ? 1 : 0);
                    c36258b7.m57323l0(parcelM57322k11, 20);
                    return c23454a0;
                } catch (RemoteException e26) {
                    throw new RuntimeRemoteException(e26);
                }
            case 12:
                C13603b0 set13 = (C13603b0) obj;
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set13, "$this$set");
                C34249c c34249cM111147b8 = c35146b.m111147b();
                c34249cM111147b8.getClass();
                try {
                    C36258b c36258b8 = (C36258b) c34249cM111147b8.f143660x;
                    Parcel parcelM57322k12 = c36258b8.m57322k0();
                    int i26 = AbstractC28076h.f113570a;
                    parcelM57322k12.writeInt(zBooleanValue8 ? 1 : 0);
                    c36258b8.m57323l0(parcelM57322k12, 6);
                    return c23454a0;
                } catch (RemoteException e27) {
                    throw new RuntimeRemoteException(e27);
                }
            case 13:
                C13603b0 set14 = (C13603b0) obj;
                boolean zBooleanValue9 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set14, "$this$set");
                C34249c c34249cM111147b9 = c35146b.m111147b();
                c34249cM111147b9.getClass();
                try {
                    C36258b c36258b9 = (C36258b) c34249cM111147b9.f143660x;
                    Parcel parcelM57322k13 = c36258b9.m57322k0();
                    int i27 = AbstractC28076h.f113570a;
                    parcelM57322k13.writeInt(zBooleanValue9 ? 1 : 0);
                    c36258b9.m57323l0(parcelM57322k13, 1);
                    return c23454a0;
                } catch (RemoteException e28) {
                    throw new RuntimeRemoteException(e28);
                }
            case 14:
                C13603b0 set15 = (C13603b0) obj;
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set15, "$this$set");
                C34249c c34249cM111147b10 = c35146b.m111147b();
                c34249cM111147b10.getClass();
                try {
                    C36258b c36258b10 = (C36258b) c34249cM111147b10.f143660x;
                    Parcel parcelM57322k14 = c36258b10.m57322k0();
                    int i28 = AbstractC28076h.f113570a;
                    parcelM57322k14.writeInt(zBooleanValue10 ? 1 : 0);
                    c36258b10.m57323l0(parcelM57322k14, 5);
                    return c23454a0;
                } catch (RemoteException e29) {
                    throw new RuntimeRemoteException(e29);
                }
            case 15:
                C13603b0 set16 = (C13603b0) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                AbstractC22676k.m65750j(set16, "$this$set");
                C36261e c36261e6 = c35146b.f149130a;
                try {
                    Parcel parcelM57322k15 = c36261e6.m57322k0();
                    AbstractC28076h.m84852d(parcelM57322k15, null);
                    c36261e6.m57323l0(parcelM57322k15, 24);
                    return c23454a0;
                } catch (RemoteException e34) {
                    throw new RuntimeRemoteException(e34);
                }
            case 16:
                C13603b0 set17 = (C13603b0) obj;
                boolean zBooleanValue11 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set17, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e7 = c35146b.f149130a;
                    Parcel parcelM57322k16 = c36261e7.m57322k0();
                    int i29 = AbstractC28076h.f113570a;
                    parcelM57322k16.writeInt(zBooleanValue11 ? 1 : 0);
                    c36261e7.m57323l0(parcelM57322k16, 41);
                    return c23454a0;
                } catch (RemoteException e35) {
                    throw new RuntimeRemoteException(e35);
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C13603b0 set18 = (C13603b0) obj;
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set18, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e8 = c35146b.f149130a;
                    Parcel parcelM57322k17 = c36261e8.m57322k0();
                    int i34 = AbstractC28076h.f113570a;
                    parcelM57322k17.writeInt(zBooleanValue12 ? 1 : 0);
                    Parcel parcelM57321j1 = c36261e8.m57321j0(parcelM57322k17, 20);
                    parcelM57321j1.readInt();
                    parcelM57321j1.recycle();
                    return c23454a0;
                } catch (RemoteException e36) {
                    throw new RuntimeRemoteException(e36);
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C13603b0 set19 = (C13603b0) obj;
                boolean zBooleanValue13 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set19, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e9 = c35146b.f149130a;
                    Parcel parcelM57322k18 = c36261e9.m57322k0();
                    int i35 = AbstractC28076h.f113570a;
                    parcelM57322k18.writeInt(zBooleanValue13 ? 1 : 0);
                    c36261e9.m57323l0(parcelM57322k18, 22);
                    return c23454a0;
                } catch (RemoteException e37) {
                    throw new RuntimeRemoteException(e37);
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C13603b0 set20 = (C13603b0) obj;
                boolean zBooleanValue14 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(set20, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e10 = c35146b.f149130a;
                    Parcel parcelM57322k19 = c36261e10.m57322k0();
                    int i36 = AbstractC28076h.f113570a;
                    parcelM57322k19.writeInt(zBooleanValue14 ? 1 : 0);
                    c36261e10.m57323l0(parcelM57322k19, 18);
                    return c23454a0;
                } catch (RemoteException e38) {
                    throw new RuntimeRemoteException(e38);
                }
            default:
                C13603b0 set21 = (C13603b0) obj;
                LatLngBounds latLngBounds = (LatLngBounds) obj2;
                AbstractC22676k.m65750j(set21, "$this$set");
                c35146b.getClass();
                try {
                    C36261e c36261e11 = c35146b.f149130a;
                    Parcel parcelM57322k20 = c36261e11.m57322k0();
                    AbstractC28076h.m84851c(parcelM57322k20, latLngBounds);
                    c36261e11.m57323l0(parcelM57322k20, 95);
                    return c23454a0;
                } catch (RemoteException e39) {
                    throw new RuntimeRemoteException(e39);
                }
        }
    }
}
