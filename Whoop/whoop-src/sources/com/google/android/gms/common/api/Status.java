package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.sentry.config.AbstractC20301a;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC36219a implements InterfaceC4982m, ReflectedParcelable {

    /* JADX INFO: renamed from: w */
    public final int f20493w;

    /* JADX INFO: renamed from: x */
    public final String f20494x;

    /* JADX INFO: renamed from: y */
    public final PendingIntent f20495y;

    /* JADX INFO: renamed from: z */
    public final C4969a f20496z;

    /* JADX INFO: renamed from: E */
    public static final Status f20488E = new Status(0, null, null, null);

    /* JADX INFO: renamed from: F */
    public static final Status f20489F = new Status(14, null, null, null);

    /* JADX INFO: renamed from: G */
    public static final Status f20490G = new Status(8, null, null, null);

    /* JADX INFO: renamed from: H */
    public static final Status f20491H = new Status(15, null, null, null);

    /* JADX INFO: renamed from: I */
    public static final Status f20492I = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C1337q1(2);

    public Status(int i13, String str, PendingIntent pendingIntent, C4969a c4969a) {
        this.f20493w = i13;
        this.f20494x = str;
        this.f20495y = pendingIntent;
        this.f20496z = c4969a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15593b() {
        return this.f20493w <= 0;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4982m
    /* JADX INFO: renamed from: c */
    public final Status mo5671c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f20493w == status.f20493w && AbstractC35135w.m111097i(this.f20494x, status.f20494x) && AbstractC35135w.m111097i(this.f20495y, status.f20495y) && AbstractC35135w.m111097i(this.f20496z, status.f20496z);
    }

    /* JADX INFO: renamed from: f */
    public final void m15594f(Activity activity, int i13) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f20495y;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            AbstractC35135w.m111094f(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i13, null, 0, 0, 0, bundle);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20493w), this.f20494x, this.f20495y, this.f20496z});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        String strM56307F = this.f20494x;
        if (strM56307F == null) {
            strM56307F = AbstractC20301a.m56307F(this.f20493w);
        }
        c29205p.m88707c(strM56307F, "statusCode");
        c29205p.m88707c(this.f20495y, "resolution");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f20493w);
        AbstractC36221c.m115332m(parcel, 2, this.f20494x);
        AbstractC36221c.m115331l(parcel, 3, this.f20495y, i13);
        AbstractC36221c.m115331l(parcel, 4, this.f20496z, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
