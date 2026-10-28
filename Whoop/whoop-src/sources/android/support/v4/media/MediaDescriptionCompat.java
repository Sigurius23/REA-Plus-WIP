package android.support.v4.media;

import a10.C0113a;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0113a(21);

    /* JADX INFO: renamed from: E */
    public final Bitmap f4140E;

    /* JADX INFO: renamed from: F */
    public final Uri f4141F;

    /* JADX INFO: renamed from: G */
    public final Bundle f4142G;

    /* JADX INFO: renamed from: H */
    public final Uri f4143H;

    /* JADX INFO: renamed from: I */
    public MediaDescription f4144I;

    /* JADX INFO: renamed from: w */
    public final String f4145w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f4146x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f4147y;

    /* JADX INFO: renamed from: z */
    public final CharSequence f4148z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4145w = str;
        this.f4146x = charSequence;
        this.f4147y = charSequence2;
        this.f4148z = charSequence3;
        this.f4140E = bitmap;
        this.f4141F = uri;
        this.f4142G = bundle;
        this.f4143H = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f4146x) + ", " + ((Object) this.f4147y) + ", " + ((Object) this.f4148z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        MediaDescription mediaDescriptionM3135a = this.f4144I;
        if (mediaDescriptionM3135a == null) {
            MediaDescription.Builder builderM3136b = AbstractC1062a.m3136b();
            AbstractC1062a.m3148n(builderM3136b, this.f4145w);
            AbstractC1062a.m3150p(builderM3136b, this.f4146x);
            AbstractC1062a.m3149o(builderM3136b, this.f4147y);
            AbstractC1062a.m3144j(builderM3136b, this.f4148z);
            AbstractC1062a.m3146l(builderM3136b, this.f4140E);
            AbstractC1062a.m3147m(builderM3136b, this.f4141F);
            AbstractC1062a.m3145k(builderM3136b, this.f4142G);
            AbstractC1063b.m3152b(builderM3136b, this.f4143H);
            mediaDescriptionM3135a = AbstractC1062a.m3135a(builderM3136b);
            this.f4144I = mediaDescriptionM3135a;
        }
        mediaDescriptionM3135a.writeToParcel(parcel, i13);
    }
}
