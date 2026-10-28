package p114eb;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import androidx.lifecycle.EnumC1635w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12984r implements Parcelable {
    public static final Parcelable.Creator<C12984r> CREATOR = new C1337q1(5);

    /* JADX INFO: renamed from: w */
    public final String f44850w;

    /* JADX INFO: renamed from: x */
    public final int f44851x;

    /* JADX INFO: renamed from: y */
    public final Bundle f44852y;

    /* JADX INFO: renamed from: z */
    public final Bundle f44853z;

    public C12984r(C12982q entry) {
        AbstractC22676k.m65750j(entry, "entry");
        this.f44850w = entry.f44835F;
        this.f44851x = entry.f44844x.f44819H;
        this.f44852y = entry.m36479a();
        Bundle bundle = new Bundle();
        this.f44853z = bundle;
        entry.f44838I.m88296b(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final C12982q m36483b(Context context, C12977n0 c12977n0, EnumC1635w hostLifecycleState, C12942b0 c12942b0) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f44852y;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String id4 = this.f44850w;
        AbstractC22676k.m65750j(id4, "id");
        return new C12982q(context, c12977n0, bundle2, hostLifecycleState, c12942b0, id4, this.f44853z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC22676k.m65750j(parcel, "parcel");
        parcel.writeString(this.f44850w);
        parcel.writeInt(this.f44851x);
        parcel.writeBundle(this.f44852y);
        parcel.writeBundle(this.f44853z);
    }

    public C12984r(Parcel parcel) {
        String string = parcel.readString();
        AbstractC22676k.m65747g(string);
        this.f44850w = string;
        this.f44851x = parcel.readInt();
        this.f44852y = parcel.readBundle(C12984r.class.getClassLoader());
        Bundle bundle = parcel.readBundle(C12984r.class.getClassLoader());
        AbstractC22676k.m65747g(bundle);
        this.f44853z = bundle;
    }
}
