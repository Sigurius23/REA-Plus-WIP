package p426qi;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.C1337q1;

/* JADX INFO: renamed from: qi.f */
/* JADX INFO: loaded from: classes.dex */
public final class C30381f extends View.BaseSavedState {
    public static final Parcelable.Creator<C30381f> CREATOR = new C1337q1(8);

    /* JADX INFO: renamed from: E */
    public String f124660E;

    /* JADX INFO: renamed from: F */
    public int f124661F;

    /* JADX INFO: renamed from: G */
    public int f124662G;

    /* JADX INFO: renamed from: w */
    public String f124663w;

    /* JADX INFO: renamed from: x */
    public int f124664x;

    /* JADX INFO: renamed from: y */
    public float f124665y;

    /* JADX INFO: renamed from: z */
    public boolean f124666z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f124663w);
        parcel.writeFloat(this.f124665y);
        parcel.writeInt(this.f124666z ? 1 : 0);
        parcel.writeString(this.f124660E);
        parcel.writeInt(this.f124661F);
        parcel.writeInt(this.f124662G);
    }
}
