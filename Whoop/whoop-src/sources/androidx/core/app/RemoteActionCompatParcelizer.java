package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p088dc.AbstractC11896c;
import p088dc.C11897d;
import p088dc.InterfaceC11898e;

/* JADX INFO: loaded from: classes5.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC11896c abstractC11896c) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC11898e interfaceC11898eM32015h = remoteActionCompat.mIcon;
        boolean z4 = true;
        if (abstractC11896c.mo32012e(1)) {
            interfaceC11898eM32015h = abstractC11896c.m32015h();
        }
        remoteActionCompat.mIcon = (IconCompat) interfaceC11898eM32015h;
        CharSequence charSequence = remoteActionCompat.mTitle;
        if (abstractC11896c.mo32012e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C11897d) abstractC11896c).f38888e);
        }
        remoteActionCompat.mTitle = charSequence;
        CharSequence charSequence2 = remoteActionCompat.mContentDescription;
        if (abstractC11896c.mo32012e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C11897d) abstractC11896c).f38888e);
        }
        remoteActionCompat.mContentDescription = charSequence2;
        remoteActionCompat.mActionIntent = (PendingIntent) abstractC11896c.m32014g(remoteActionCompat.mActionIntent, 4);
        boolean z13 = remoteActionCompat.mEnabled;
        if (abstractC11896c.mo32012e(5)) {
            z13 = ((C11897d) abstractC11896c).f38888e.readInt() != 0;
        }
        remoteActionCompat.mEnabled = z13;
        boolean z14 = remoteActionCompat.mShouldShowIcon;
        if (!abstractC11896c.mo32012e(6)) {
            z4 = z14;
        } else if (((C11897d) abstractC11896c).f38888e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.mShouldShowIcon = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        IconCompat iconCompat = remoteActionCompat.mIcon;
        abstractC11896c.mo32016i(1);
        abstractC11896c.m32019l(iconCompat);
        CharSequence charSequence = remoteActionCompat.mTitle;
        abstractC11896c.mo32016i(2);
        Parcel parcel = ((C11897d) abstractC11896c).f38888e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.mContentDescription;
        abstractC11896c.mo32016i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC11896c.m32018k(remoteActionCompat.mActionIntent, 4);
        boolean z4 = remoteActionCompat.mEnabled;
        abstractC11896c.mo32016i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z13 = remoteActionCompat.mShouldShowIcon;
        abstractC11896c.mo32016i(6);
        parcel.writeInt(z13 ? 1 : 0);
    }
}
