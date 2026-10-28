package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e10.C12554k0;
import java.util.Arrays;
import p096dq.C12280x;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class ButtonOptions extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new C12280x(29);

    /* JADX INFO: renamed from: w */
    public int f20650w;

    /* JADX INFO: renamed from: x */
    public int f20651x;

    /* JADX INFO: renamed from: y */
    public int f20652y;

    /* JADX INFO: renamed from: z */
    public String f20653z;

    private ButtonOptions() {
    }

    /* JADX INFO: renamed from: b */
    public static C12554k0 m15642b() {
        return new C12554k0(new ButtonOptions(), 4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (AbstractC35135w.m111097i(Integer.valueOf(this.f20650w), Integer.valueOf(buttonOptions.f20650w)) && AbstractC35135w.m111097i(Integer.valueOf(this.f20651x), Integer.valueOf(buttonOptions.f20651x)) && AbstractC35135w.m111097i(Integer.valueOf(this.f20652y), Integer.valueOf(buttonOptions.f20652y)) && AbstractC35135w.m111097i(this.f20653z, buttonOptions.f20653z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20650w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f20650w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        int i15 = this.f20651x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i15);
        int i16 = this.f20652y;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(i16);
        AbstractC36221c.m115332m(parcel, 4, this.f20653z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
