package z10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import java.util.ArrayList;
import p557vo.AbstractC36220b;
import p692zt.C41112p;
import p695zx.C41179a;
import p696zy.C41209a;
import p696zy.C41210b;
import p696zy.C41212d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: z10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C39988k implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172558a;

    public /* synthetic */ C39988k(int i13) {
        this.f172558a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f172558a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39989l(C38915o4.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39990m((FinancialConnectionsSession) parcel.readParcelable(C39990m.class.getClassLoader()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C39992o.f172567w;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39993p(C39991n.CREATOR.createFromParcel(parcel));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39994q((Throwable) parcel.readSerializable());
            case 5:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                Bundle bundleM115298c = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        bundleM115298c = AbstractC36220b.m115298c(parcel, i13);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C41112p(bundleM115298c);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C41179a(parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C41209a((InterfaceC41211c) parcel.readParcelable(C41209a.class.getClassLoader()), (InterfaceC41211c) parcel.readParcelable(C41209a.class.getClassLoader()));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(parcel.readParcelable(C41210b.class.getClassLoader()));
                }
                int i17 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList2.add(parcel.readValue(C41210b.class.getClassLoader()));
                }
                return new C41210b(i14, arrayList, arrayList2);
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                int i19 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList3.add(parcel.readValue(C41212d.class.getClassLoader()));
                }
                return new C41212d(string, arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f172558a) {
            case 0:
                return new C39989l[i13];
            case 1:
                return new C39990m[i13];
            case 2:
                return new C39992o[i13];
            case 3:
                return new C39993p[i13];
            case 4:
                return new C39994q[i13];
            case 5:
                return new C41112p[i13];
            case 6:
                return new C41179a[i13];
            case 7:
                return new C41209a[i13];
            case 8:
                return new C41210b[i13];
            default:
                return new C41212d[i13];
        }
    }
}
