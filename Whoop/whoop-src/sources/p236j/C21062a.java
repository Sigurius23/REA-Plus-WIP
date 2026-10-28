package p236j;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21062a implements Parcelable {
    public static final Parcelable.Creator<C21062a> CREATOR = new C16054r0(19);

    /* JADX INFO: renamed from: w */
    public final int f79915w;

    /* JADX INFO: renamed from: x */
    public final Intent f79916x;

    public C21062a(int i13, Intent intent) {
        this.f79915w = i13;
        this.f79916x = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + AbstractC32411b.m101084a0(this.f79915w) + ", data=" + this.f79916x + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f79915w);
        Intent intent = this.f79916x;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i13);
        }
    }
}
