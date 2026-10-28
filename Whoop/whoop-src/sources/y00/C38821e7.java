package y00;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import f20.EnumC14023b;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import p661yv.C39797b;
import p715kotlin.jvm.internal.AbstractC22676k;
import w10.InterfaceC36692d;
import z10.AbstractC39995r;
import z10.C39978a;
import z10.C39979b;
import z10.C39980c;
import z10.C39981d;
import z10.C39983f;
import z10.C39984g;
import z10.C39985h;
import z10.C39986i;
import z10.C39989l;
import z10.C39990m;
import z10.C39991n;

/* JADX INFO: renamed from: y00.e7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38821e7 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167076a;

    public /* synthetic */ C38821e7(int i13) {
        this.f167076a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        boolean z14;
        float f13;
        boolean z15;
        switch (this.f167076a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new C38831f7(string, publicKey, arrayList, parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38851h7(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(C38851h7.class.getClassLoader()), parcel.readString());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38861i7.f167283w;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38871j7(parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38881k7(parcel.readString());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38891l7(parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38900m7(parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38909n7(parcel.readInt(), parcel.readString(), parcel.readString());
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38918o7(parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38927p7(parcel.readString());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38945r7((Uri) parcel.readParcelable(C38945r7.class.getClassLoader()), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38954s7.f167673w;
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38981v7(parcel.readString(), parcel.readString(), parcel.readString(), C38972u7.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38972u7(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38999x7(parcel.readString());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C39008y7.f167900w;
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39017z7(parcel.readLong(), parcel.readString(), EnumC39003y2.valueOf(parcel.readString()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38782a8(C38882k8.CREATOR.createFromParcel(parcel));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string2 = parcel.readString();
                EnumC38832f8 enumC38832f8ValueOf = EnumC38832f8.valueOf(parcel.readString());
                Date date = (Date) parcel.readSerializable();
                boolean z16 = false;
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                return new C38842g8(string2, enumC38832f8ValueOf, date, z16, parcel.readInt() != 0, parcel.readInt() == 0 ? null : C38813e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C38843h.CREATOR.createFromParcel(parcel) : null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38882k8(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z17 = false;
                if (parcel.readInt() != 0) {
                    z17 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                int i15 = parcel.readInt();
                boolean z18 = z4;
                float f14 = parcel.readFloat();
                float f15 = parcel.readFloat();
                float f16 = parcel.readFloat();
                float f17 = parcel.readFloat();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                float f18 = parcel.readFloat();
                float f19 = parcel.readFloat();
                float f24 = parcel.readFloat();
                float f25 = parcel.readFloat();
                boolean z19 = z18;
                float f26 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z19 = z17;
                }
                long j7 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z13 = z19;
                    z14 = z13;
                } else {
                    z13 = z19;
                    z14 = z17;
                }
                float f27 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z15 = z13;
                    f13 = f27;
                } else {
                    f13 = f27;
                    z15 = false;
                }
                return new C39797b(z17, i15, f14, f15, f16, f17, i16, i17, i18, f18, f19, f24, f25, f26, z19, j7, z14, f13, z15);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39978a(parcel.readString(), parcel.readString(), (InterfaceC36692d) parcel.readParcelable(C39978a.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC14023b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39979b(parcel.readString(), parcel.readString(), (InterfaceC36692d) parcel.readParcelable(C39979b.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : EnumC14023b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39980c(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC36692d) parcel.readParcelable(C39980c.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : EnumC14023b.valueOf(parcel.readString()), parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39981d(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC36692d) parcel.readParcelable(C39981d.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : EnumC14023b.valueOf(parcel.readString()), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39983f((AbstractC39995r) parcel.readParcelable(C39983f.class.getClassLoader()));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C39984g.f172551w;
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39985h((InterfaceC38802c8) parcel.readParcelable(C39985h.class.getClassLoader()), C38915o4.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39986i((Throwable) parcel.readSerializable());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39991n((InterfaceC38802c8) parcel.readParcelable(C39991n.class.getClassLoader()), parcel.readInt() == 0 ? null : C39990m.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C39989l.CREATOR.createFromParcel(parcel) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167076a) {
            case 0:
                return new C38831f7[i13];
            case 1:
                return new C38851h7[i13];
            case 2:
                return new C38861i7[i13];
            case 3:
                return new C38871j7[i13];
            case 4:
                return new C38881k7[i13];
            case 5:
                return new C38891l7[i13];
            case 6:
                return new C38900m7[i13];
            case 7:
                return new C38909n7[i13];
            case 8:
                return new C38918o7[i13];
            case 9:
                return new C38927p7[i13];
            case 10:
                return new C38945r7[i13];
            case 11:
                return new C38954s7[i13];
            case 12:
                return new C38981v7[i13];
            case 13:
                return new C38972u7[i13];
            case 14:
                return new C38999x7[i13];
            case 15:
                return new C39008y7[i13];
            case 16:
                return new C39017z7[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C38782a8[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C38842g8[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C38882k8[i13];
            case 20:
                return new C39797b[i13];
            case 21:
                return new C39978a[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C39979b[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C39980c[i13];
            case 24:
                return new C39981d[i13];
            case 25:
                return new C39983f[i13];
            case 26:
                return new C39984g[i13];
            case 27:
                return new C39985h[i13];
            case 28:
                return new C39986i[i13];
            default:
                return new C39991n[i13];
        }
    }
}
