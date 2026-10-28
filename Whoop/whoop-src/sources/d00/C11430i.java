package d00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsentUi;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C11430i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new C11431j((ConsentUi.ConsentSection) parcel.readParcelable(C11431j.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C11431j[i13];
    }
}
