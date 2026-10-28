package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p088dc.AbstractC11896c;
import p088dc.C11897d;

/* JADX INFO: loaded from: classes5.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC11896c abstractC11896c) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5265a = abstractC11896c.m32013f(iconCompat.f5265a, 1);
        byte[] bArr = iconCompat.f5267c;
        if (abstractC11896c.mo32012e(2)) {
            Parcel parcel = ((C11897d) abstractC11896c).f38888e;
            int i13 = parcel.readInt();
            if (i13 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i13];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5267c = bArr;
        iconCompat.f5268d = abstractC11896c.m32014g(iconCompat.f5268d, 3);
        iconCompat.f5269e = abstractC11896c.m32013f(iconCompat.f5269e, 4);
        iconCompat.f5270f = abstractC11896c.m32013f(iconCompat.f5270f, 5);
        iconCompat.f5271g = (ColorStateList) abstractC11896c.m32014g(iconCompat.f5271g, 6);
        String string = iconCompat.f5273i;
        if (abstractC11896c.mo32012e(7)) {
            string = ((C11897d) abstractC11896c).f38888e.readString();
        }
        iconCompat.f5273i = string;
        String string2 = iconCompat.f5274j;
        if (abstractC11896c.mo32012e(8)) {
            string2 = ((C11897d) abstractC11896c).f38888e.readString();
        }
        iconCompat.f5274j = string2;
        iconCompat.f5272h = PorterDuff.Mode.valueOf(iconCompat.f5273i);
        switch (iconCompat.f5265a) {
            case -1:
                Parcelable parcelable = iconCompat.f5268d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5266b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5268d;
                if (parcelable2 != null) {
                    iconCompat.f5266b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f5267c;
                iconCompat.f5266b = bArr3;
                iconCompat.f5265a = 3;
                iconCompat.f5269e = 0;
                iconCompat.f5270f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f5267c, Charset.forName("UTF-16"));
                iconCompat.f5266b = str;
                if (iconCompat.f5265a == 2 && iconCompat.f5274j == null) {
                    iconCompat.f5274j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5266b = iconCompat.f5267c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        iconCompat.f5273i = iconCompat.f5272h.name();
        switch (iconCompat.f5265a) {
            case -1:
                iconCompat.f5268d = (Parcelable) iconCompat.f5266b;
                break;
            case 1:
            case 5:
                iconCompat.f5268d = (Parcelable) iconCompat.f5266b;
                break;
            case 2:
                iconCompat.f5267c = ((String) iconCompat.f5266b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5267c = (byte[]) iconCompat.f5266b;
                break;
            case 4:
            case 6:
                iconCompat.f5267c = iconCompat.f5266b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i13 = iconCompat.f5265a;
        if (-1 != i13) {
            abstractC11896c.m32017j(i13, 1);
        }
        byte[] bArr = iconCompat.f5267c;
        if (bArr != null) {
            abstractC11896c.mo32016i(2);
            Parcel parcel = ((C11897d) abstractC11896c).f38888e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f5268d;
        if (parcelable != null) {
            abstractC11896c.m32018k(parcelable, 3);
        }
        int i14 = iconCompat.f5269e;
        if (i14 != 0) {
            abstractC11896c.m32017j(i14, 4);
        }
        int i15 = iconCompat.f5270f;
        if (i15 != 0) {
            abstractC11896c.m32017j(i15, 5);
        }
        ColorStateList colorStateList = iconCompat.f5271g;
        if (colorStateList != null) {
            abstractC11896c.m32018k(colorStateList, 6);
        }
        String str = iconCompat.f5273i;
        if (str != null) {
            abstractC11896c.mo32016i(7);
            ((C11897d) abstractC11896c).f38888e.writeString(str);
        }
        String str2 = iconCompat.f5274j;
        if (str2 != null) {
            abstractC11896c.mo32016i(8);
            ((C11897d) abstractC11896c).f38888e.writeString(str2);
        }
    }
}
