package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C1081o(4);

    /* JADX INFO: renamed from: E */
    public final long f4168E;

    /* JADX INFO: renamed from: F */
    public final int f4169F;

    /* JADX INFO: renamed from: G */
    public final CharSequence f4170G;

    /* JADX INFO: renamed from: H */
    public final long f4171H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f4172I;

    /* JADX INFO: renamed from: J */
    public final long f4173J;

    /* JADX INFO: renamed from: K */
    public final Bundle f4174K;

    /* JADX INFO: renamed from: L */
    public PlaybackState f4175L;

    /* JADX INFO: renamed from: w */
    public final int f4176w;

    /* JADX INFO: renamed from: x */
    public final long f4177x;

    /* JADX INFO: renamed from: y */
    public final long f4178y;

    /* JADX INFO: renamed from: z */
    public final float f4179z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1086t();

        /* JADX INFO: renamed from: w */
        public final String f4180w;

        /* JADX INFO: renamed from: x */
        public final CharSequence f4181x;

        /* JADX INFO: renamed from: y */
        public final int f4182y;

        /* JADX INFO: renamed from: z */
        public final Bundle f4183z;

        public CustomAction(Parcel parcel) {
            this.f4180w = parcel.readString();
            this.f4181x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4182y = parcel.readInt();
            this.f4183z = parcel.readBundle(C1082p.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f4181x) + ", mIcon=" + this.f4182y + ", mExtras=" + this.f4183z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeString(this.f4180w);
            TextUtils.writeToParcel(this.f4181x, parcel, i13);
            parcel.writeInt(this.f4182y);
            parcel.writeBundle(this.f4183z);
        }
    }

    public PlaybackStateCompat(int i13, long j7, long j13, float f13, long j14, int i14, CharSequence charSequence, long j15, ArrayList arrayList, long j16, Bundle bundle) {
        this.f4176w = i13;
        this.f4177x = j7;
        this.f4178y = j13;
        this.f4179z = f13;
        this.f4168E = j14;
        this.f4169F = i14;
        this.f4170G = charSequence;
        this.f4171H = j15;
        this.f4172I = new ArrayList(arrayList);
        this.f4173J = j16;
        this.f4174K = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PlaybackState {state=");
        sb4.append(this.f4176w);
        sb4.append(", position=");
        sb4.append(this.f4177x);
        sb4.append(", buffered position=");
        sb4.append(this.f4178y);
        sb4.append(", speed=");
        sb4.append(this.f4179z);
        sb4.append(", updated=");
        sb4.append(this.f4171H);
        sb4.append(", actions=");
        sb4.append(this.f4168E);
        sb4.append(", error code=");
        sb4.append(this.f4169F);
        sb4.append(", error message=");
        sb4.append(this.f4170G);
        sb4.append(", custom actions=");
        sb4.append(this.f4172I);
        sb4.append(", active item id=");
        return AbstractC11266d.m30457k(this.f4173J, "}", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f4176w);
        parcel.writeLong(this.f4177x);
        parcel.writeFloat(this.f4179z);
        parcel.writeLong(this.f4171H);
        parcel.writeLong(this.f4178y);
        parcel.writeLong(this.f4168E);
        TextUtils.writeToParcel(this.f4170G, parcel, i13);
        parcel.writeTypedList(this.f4172I);
        parcel.writeLong(this.f4173J);
        parcel.writeBundle(this.f4174K);
        parcel.writeInt(this.f4169F);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4176w = parcel.readInt();
        this.f4177x = parcel.readLong();
        this.f4179z = parcel.readFloat();
        this.f4171H = parcel.readLong();
        this.f4178y = parcel.readLong();
        this.f4168E = parcel.readLong();
        this.f4170G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4172I = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4173J = parcel.readLong();
        this.f4174K = parcel.readBundle(C1082p.class.getClassLoader());
        this.f4169F = parcel.readInt();
    }
}
