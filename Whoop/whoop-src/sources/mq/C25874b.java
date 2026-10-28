package mq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import mn.C25704b;

/* JADX INFO: renamed from: mq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25874b implements Parcelable {
    public static final Parcelable.Creator<C25874b> CREATOR = new C25704b(2);

    /* JADX INFO: renamed from: E */
    public Integer f102023E;

    /* JADX INFO: renamed from: F */
    public Integer f102024F;

    /* JADX INFO: renamed from: G */
    public Integer f102025G;

    /* JADX INFO: renamed from: H */
    public Integer f102026H;

    /* JADX INFO: renamed from: J */
    public String f102028J;

    /* JADX INFO: renamed from: N */
    public Locale f102032N;

    /* JADX INFO: renamed from: O */
    public CharSequence f102033O;

    /* JADX INFO: renamed from: P */
    public CharSequence f102034P;

    /* JADX INFO: renamed from: Q */
    public int f102035Q;

    /* JADX INFO: renamed from: R */
    public int f102036R;

    /* JADX INFO: renamed from: S */
    public Integer f102037S;

    /* JADX INFO: renamed from: U */
    public Integer f102039U;

    /* JADX INFO: renamed from: V */
    public Integer f102040V;

    /* JADX INFO: renamed from: W */
    public Integer f102041W;

    /* JADX INFO: renamed from: X */
    public Integer f102042X;

    /* JADX INFO: renamed from: Y */
    public Integer f102043Y;

    /* JADX INFO: renamed from: Z */
    public Integer f102044Z;

    /* JADX INFO: renamed from: a0 */
    public Integer f102045a0;

    /* JADX INFO: renamed from: b0 */
    public Integer f102046b0;

    /* JADX INFO: renamed from: c0 */
    public Integer f102047c0;

    /* JADX INFO: renamed from: d0 */
    public Boolean f102048d0;

    /* JADX INFO: renamed from: w */
    public int f102049w;

    /* JADX INFO: renamed from: x */
    public Integer f102050x;

    /* JADX INFO: renamed from: y */
    public Integer f102051y;

    /* JADX INFO: renamed from: z */
    public Integer f102052z;

    /* JADX INFO: renamed from: I */
    public int f102027I = 255;

    /* JADX INFO: renamed from: K */
    public int f102029K = -2;

    /* JADX INFO: renamed from: L */
    public int f102030L = -2;

    /* JADX INFO: renamed from: M */
    public int f102031M = -2;

    /* JADX INFO: renamed from: T */
    public Boolean f102038T = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f102049w);
        parcel.writeSerializable(this.f102050x);
        parcel.writeSerializable(this.f102051y);
        parcel.writeSerializable(this.f102052z);
        parcel.writeSerializable(this.f102023E);
        parcel.writeSerializable(this.f102024F);
        parcel.writeSerializable(this.f102025G);
        parcel.writeSerializable(this.f102026H);
        parcel.writeInt(this.f102027I);
        parcel.writeString(this.f102028J);
        parcel.writeInt(this.f102029K);
        parcel.writeInt(this.f102030L);
        parcel.writeInt(this.f102031M);
        CharSequence charSequence = this.f102033O;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f102034P;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f102035Q);
        parcel.writeSerializable(this.f102037S);
        parcel.writeSerializable(this.f102039U);
        parcel.writeSerializable(this.f102040V);
        parcel.writeSerializable(this.f102041W);
        parcel.writeSerializable(this.f102042X);
        parcel.writeSerializable(this.f102043Y);
        parcel.writeSerializable(this.f102044Z);
        parcel.writeSerializable(this.f102047c0);
        parcel.writeSerializable(this.f102045a0);
        parcel.writeSerializable(this.f102046b0);
        parcel.writeSerializable(this.f102038T);
        parcel.writeSerializable(this.f102032N);
        parcel.writeSerializable(this.f102048d0);
    }
}
