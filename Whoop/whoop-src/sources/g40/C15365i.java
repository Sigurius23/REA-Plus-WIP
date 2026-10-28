package g40;

import android.os.Parcel;
import android.os.Parcelable;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: g40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C15365i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57764a;

    public /* synthetic */ C15365i(int i13) {
        this.f57764a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        switch (this.f57764a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i13 = parcel.readInt();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(i13);
                    int iM106646e = 0;
                    while (iM106646e != i13) {
                        iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet3, iM106646e, 1);
                    }
                    linkedHashSet = linkedHashSet3;
                }
                return new C15371j(string, linkedHashSet, AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), (InterfaceC4339a) parcel.readSerializable());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(i14);
                    int iM106646e2 = 0;
                    while (iM106646e2 != i14) {
                        iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet4, iM106646e2, 1);
                    }
                    linkedHashSet2 = linkedHashSet4;
                }
                return new C15377k(string2, linkedHashSet2, AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), (InterfaceC4339a) parcel.readSerializable());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C15382l(AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new IdentifierSpec(parcel.readString(), parcel.readInt() != 0, (InterfaceC15439w1) parcel.readParcelable(IdentifierSpec.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC15429u1.valueOf(parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC15434v1.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f57764a) {
            case 0:
                return new C15371j[i13];
            case 1:
                return new C15377k[i13];
            case 2:
                return new C15382l[i13];
            case 3:
                return new IdentifierSpec[i13];
            case 4:
                return new EnumC15429u1[i13];
            default:
                return new EnumC15434v1[i13];
        }
    }
}
