package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C5623m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        FinancialConnectionsAccount.Category categoryValueOf = FinancialConnectionsAccount.Category.valueOf(parcel.readString());
        int i13 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        boolean z4 = parcel.readInt() != 0;
        FinancialConnectionsAccount.Status statusValueOf = FinancialConnectionsAccount.Status.valueOf(parcel.readString());
        FinancialConnectionsAccount.Subcategory subcategoryValueOf = FinancialConnectionsAccount.Subcategory.valueOf(parcel.readString());
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 != i14; i15++) {
            arrayList.add(FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()));
        }
        ArrayList arrayList2 = null;
        Balance balanceCreateFromParcel = parcel.readInt() == 0 ? null : Balance.CREATOR.createFromParcel(parcel);
        BalanceRefresh balanceRefreshCreateFromParcel = parcel.readInt() == 0 ? null : BalanceRefresh.CREATOR.createFromParcel(parcel);
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        OwnershipRefresh ownershipRefreshCreateFromParcel = parcel.readInt() == 0 ? null : OwnershipRefresh.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList3.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
            }
            arrayList2 = arrayList3;
        }
        return new FinancialConnectionsAccount(categoryValueOf, i13, string, string2, z4, statusValueOf, subcategoryValueOf, arrayList, balanceCreateFromParcel, balanceRefreshCreateFromParcel, string3, string4, string5, ownershipRefreshCreateFromParcel, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new FinancialConnectionsAccount[i13];
    }
}
