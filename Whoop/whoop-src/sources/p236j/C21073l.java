package p236j;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C21073l implements Parcelable {
    public static final Parcelable.Creator<C21073l> CREATOR = new C16054r0(20);

    /* JADX INFO: renamed from: w */
    public final IntentSender f79937w;

    /* JADX INFO: renamed from: x */
    public final Intent f79938x;

    /* JADX INFO: renamed from: y */
    public final int f79939y;

    /* JADX INFO: renamed from: z */
    public final int f79940z;

    public C21073l(IntentSender intentSender, Intent intent, int i13, int i14) {
        AbstractC22676k.m65750j(intentSender, "intentSender");
        this.f79937w = intentSender;
        this.f79938x = intent;
        this.f79939y = i13;
        this.f79940z = i14;
    }

    /* JADX INFO: renamed from: b */
    public final Intent m58917b() {
        return this.f79938x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m58918f() {
        return this.f79939y;
    }

    /* JADX INFO: renamed from: h */
    public final int m58919h() {
        return this.f79940z;
    }

    /* JADX INFO: renamed from: i */
    public final IntentSender m58920i() {
        return this.f79937w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f79937w, i13);
        dest.writeParcelable(this.f79938x, i13);
        dest.writeInt(this.f79939y);
        dest.writeInt(this.f79940z);
    }
}
