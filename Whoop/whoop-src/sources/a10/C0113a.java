package a10;

import a10.C0113a;
import a30.AbstractC0287e1;
import a30.C0273a;
import a30.C0289f0;
import a30.C0290f1;
import a30.C0292g0;
import a30.C0295h0;
import a30.C0298i0;
import a30.C0307l0;
import a30.C0316o0;
import a30.C0318p0;
import a30.C0320q0;
import a30.C0322r0;
import a30.C0324s0;
import a30.C0330v0;
import a30.EnumC0304k0;
import a30.InterfaceC0301j0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC1062a;
import android.support.v4.media.AbstractC1063b;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.C1082p;
import androidx.fragment.app.C1275b;
import androidx.fragment.app.C1279c;
import androidx.fragment.app.C1305i1;
import androidx.health.platform.client.proto.C1533u;
import aq.C1885b;
import aq.C1888e;
import aq.C1889f;
import com.google.android.gms.common.C4969a;
import h20.C16744u2;
import j00.EnumC21096d0;
import java.util.ArrayList;
import my.C26027a;
import p529uo.C35132t;
import p557vo.AbstractC36220b;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;
import y00.C38793c;
import y00.EnumC38913o2;
import y00.EnumC38958t2;

/* JADX INFO: renamed from: a10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0113a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f353a;

    public /* synthetic */ C0113a(int i13) {
        this.f353a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        switch (this.f353a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0114b(parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0115c(parcel.readString());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0116d(parcel.readString());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0117e(parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0118f(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C38793c.CREATOR.createFromParcel(parcel) : null);
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0119g(parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0121i(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C38793c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(C0273a.class.getClassLoader()));
                }
                return new C0273a(arrayList, parcel.readString());
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(EnumC38913o2.valueOf(parcel.readString()));
                }
                return new C0289f0(arrayList2);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C0292g0.f1025w;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(EnumC38958t2.valueOf(parcel.readString()));
                }
                return new C0295h0(arrayList3);
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0298i0(EnumC21096d0.valueOf(parcel.readString()));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0307l0(C37718g0.CREATOR.createFromParcel(parcel), EnumC0304k0.valueOf(parcel.readString()), (InterfaceC0301j0) parcel.readParcelable(C0307l0.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0316o0(parcel.readString());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C0318p0.f1095w;
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0320q0(C16744u2.CREATOR.createFromParcel(parcel));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0322r0(parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0324s0(parcel.readString());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0330v0((C26027a) parcel.readParcelable(C0330v0.class.getClassLoader()), (C0273a) parcel.readParcelable(C0330v0.class.getClassLoader()), (AbstractC29840y) parcel.readParcelable(C0330v0.class.getClassLoader()), (AbstractC0287e1) parcel.readSerializable(), C35459c0.CREATOR.createFromParcel(parcel));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C0290f1((C26027a) parcel.readParcelable(C0290f1.class.getClassLoader()), (C0273a) parcel.readParcelable(C0290f1.class.getClassLoader()), (AbstractC29840y) parcel.readParcelable(C0290f1.class.getClassLoader()), (AbstractC0287e1) parcel.readSerializable(), (C35459c0) parcel.readParcelable(C0290f1.class.getClassLoader()));
            case 20:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0113a(20);

                    /* JADX INFO: renamed from: w */
                    public final int f4138w;

                    /* JADX INFO: renamed from: x */
                    public final MediaDescriptionCompat f4139x;

                    {
                        this.f4138w = parcel.readInt();
                        this.f4139x = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f4138w + ", mDescription=" + this.f4139x + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i19) {
                        parcel2.writeInt(this.f4138w);
                        this.f4139x.writeToParcel(parcel2, i19);
                    }
                };
            case 21:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM3141g = AbstractC1062a.m3141g(mediaDescription);
                CharSequence charSequenceM3143i = AbstractC1062a.m3143i(mediaDescription);
                CharSequence charSequenceM3142h = AbstractC1062a.m3142h(mediaDescription);
                CharSequence charSequenceM3137c = AbstractC1062a.m3137c(mediaDescription);
                Bitmap bitmapM3139e = AbstractC1062a.m3139e(mediaDescription);
                Uri uriM3140f = AbstractC1062a.m3140f(mediaDescription);
                Bundle bundleM3138d = AbstractC1062a.m3138d(mediaDescription);
                if (bundleM3138d != null) {
                    bundleM3138d = C1082p.m3219d(bundleM3138d);
                }
                Uri uriM3151a = bundleM3138d != null ? (Uri) bundleM3138d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM3151a == null) {
                    bundle = bundleM3138d;
                } else if (bundleM3138d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM3138d.size() == 2) {
                    bundle = null;
                } else {
                    bundleM3138d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM3138d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM3138d;
                }
                if (uriM3151a == null) {
                    uriM3151a = AbstractC1063b.m3151a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM3141g, charSequenceM3143i, charSequenceM3142h, charSequenceM3137c, bitmapM3139e, uriM3140f, bundle, uriM3151a);
                mediaDescriptionCompat.f4144I = mediaDescription;
                return mediaDescriptionCompat;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new MediaMetadataCompat(parcel);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 24:
                return new C1275b(parcel);
            case 25:
                return new C1279c(parcel);
            case 26:
                C1305i1 c1305i1 = new C1305i1();
                c1305i1.f5649w = parcel.readString();
                c1305i1.f5650x = parcel.readInt();
                return c1305i1;
            case 27:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                Intent intent = null;
                int iM115317y = 0;
                int iM115317y2 = 0;
                while (parcel.dataPosition() < iM115294F) {
                    int i19 = parcel.readInt();
                    char c3 = (char) i19;
                    if (c3 == 1) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i19);
                    } else if (c3 == 2) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i19);
                    } else if (c3 != 3) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        intent = (Intent) AbstractC36220b.m115302g(parcel, i19, Intent.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C1885b(iM115317y, iM115317y2, intent);
            case 28:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115305j = null;
                String strM115303h = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i24 = parcel.readInt();
                    char c7 = (char) i24;
                    if (c7 == 1) {
                        arrayListM115305j = AbstractC36220b.m115305j(parcel, i24);
                    } else if (c7 != 2) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C1888e(strM115303h, arrayListM115305j);
            default:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                C4969a c4969a = null;
                int iM115317y3 = 0;
                C35132t c35132t = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i25);
                    } else if (c14 == 2) {
                        c4969a = (C4969a) AbstractC36220b.m115302g(parcel, i25, C4969a.CREATOR);
                    } else if (c14 != 3) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        c35132t = (C35132t) AbstractC36220b.m115302g(parcel, i25, C35132t.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C1889f(iM115317y3, c4969a, c35132t);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f353a) {
            case 0:
                return new C0114b[i13];
            case 1:
                return new C0115c[i13];
            case 2:
                return new C0116d[i13];
            case 3:
                return new C0117e[i13];
            case 4:
                return new C0118f[i13];
            case 5:
                return new C0119g[i13];
            case 6:
                return new C0121i[i13];
            case 7:
                return new C0273a[i13];
            case 8:
                return new C0289f0[i13];
            case 9:
                return new C0292g0[i13];
            case 10:
                return new C0295h0[i13];
            case 11:
                return new C0298i0[i13];
            case 12:
                return new C0307l0[i13];
            case 13:
                return new C0316o0[i13];
            case 14:
                return new C0318p0[i13];
            case 15:
                return new C0320q0[i13];
            case 16:
                return new C0322r0[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C0324s0[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C0330v0[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C0290f1[i13];
            case 20:
                return new MediaBrowserCompat$MediaItem[i13];
            case 21:
                return new MediaDescriptionCompat[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new MediaMetadataCompat[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new RatingCompat[i13];
            case 24:
                return new C1275b[i13];
            case 25:
                return new C1279c[i13];
            case 26:
                return new C1305i1[i13];
            case 27:
                return new C1885b[i13];
            case 28:
                return new C1888e[i13];
            default:
                return new C1889f[i13];
        }
    }
}
