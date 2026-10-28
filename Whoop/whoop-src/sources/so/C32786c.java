package so;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36220b;

/* JADX INFO: renamed from: so.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32786c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136473a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f136473a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        intent = (Intent) AbstractC36220b.m115302g(parcel, i13, Intent.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C32784a(intent);
            default:
                return new C32791h(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f136473a) {
            case 0:
                return new C32784a[i13];
            default:
                return new C32791h[i13];
        }
    }
}
