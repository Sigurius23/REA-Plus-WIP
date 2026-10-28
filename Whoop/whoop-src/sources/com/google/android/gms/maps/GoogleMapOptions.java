package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p460rg.AbstractC31375j;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;

/* JADX INFO: loaded from: classes6.dex */
public final class GoogleMapOptions extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C32854e(27);

    /* JADX INFO: renamed from: E */
    public Boolean f20591E;

    /* JADX INFO: renamed from: F */
    public Boolean f20592F;

    /* JADX INFO: renamed from: G */
    public Boolean f20593G;

    /* JADX INFO: renamed from: H */
    public Boolean f20594H;

    /* JADX INFO: renamed from: I */
    public Boolean f20595I;

    /* JADX INFO: renamed from: J */
    public Boolean f20596J;

    /* JADX INFO: renamed from: K */
    public Boolean f20597K;

    /* JADX INFO: renamed from: L */
    public Boolean f20598L;

    /* JADX INFO: renamed from: M */
    public Boolean f20599M;

    /* JADX INFO: renamed from: Q */
    public Boolean f20603Q;

    /* JADX INFO: renamed from: w */
    public Boolean f20606w;

    /* JADX INFO: renamed from: x */
    public Boolean f20607x;

    /* JADX INFO: renamed from: z */
    public CameraPosition f20609z;

    /* JADX INFO: renamed from: y */
    public int f20608y = -1;

    /* JADX INFO: renamed from: N */
    public Float f20600N = null;

    /* JADX INFO: renamed from: O */
    public Float f20601O = null;

    /* JADX INFO: renamed from: P */
    public LatLngBounds f20602P = null;

    /* JADX INFO: renamed from: R */
    public Integer f20604R = null;

    /* JADX INFO: renamed from: S */
    public String f20605S = null;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(Integer.valueOf(this.f20608y), "MapType");
        c29205p.m88707c(this.f20597K, "LiteMode");
        c29205p.m88707c(this.f20609z, "Camera");
        c29205p.m88707c(this.f20592F, "CompassEnabled");
        c29205p.m88707c(this.f20591E, "ZoomControlsEnabled");
        c29205p.m88707c(this.f20593G, "ScrollGesturesEnabled");
        c29205p.m88707c(this.f20594H, "ZoomGesturesEnabled");
        c29205p.m88707c(this.f20595I, "TiltGesturesEnabled");
        c29205p.m88707c(this.f20596J, "RotateGesturesEnabled");
        c29205p.m88707c(this.f20603Q, "ScrollGesturesEnabledDuringRotateOrZoom");
        c29205p.m88707c(this.f20598L, "MapToolbarEnabled");
        c29205p.m88707c(this.f20599M, "AmbientEnabled");
        c29205p.m88707c(this.f20600N, "MinZoomPreference");
        c29205p.m88707c(this.f20601O, "MaxZoomPreference");
        c29205p.m88707c(this.f20604R, "BackgroundColor");
        c29205p.m88707c(this.f20602P, "LatLngBoundsForCameraTarget");
        c29205p.m88707c(this.f20606w, "ZOrderOnTop");
        c29205p.m88707c(this.f20607x, "UseViewLifecycleInFragment");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        byte bM96501q = AbstractC31375j.m96501q(this.f20606w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(bM96501q);
        byte bM96501q2 = AbstractC31375j.m96501q(this.f20607x);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(bM96501q2);
        int i14 = this.f20608y;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115331l(parcel, 5, this.f20609z, i13);
        byte bM96501q3 = AbstractC31375j.m96501q(this.f20591E);
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(bM96501q3);
        byte bM96501q4 = AbstractC31375j.m96501q(this.f20592F);
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(bM96501q4);
        byte bM96501q5 = AbstractC31375j.m96501q(this.f20593G);
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(bM96501q5);
        byte bM96501q6 = AbstractC31375j.m96501q(this.f20594H);
        AbstractC36221c.m115337r(parcel, 9, 4);
        parcel.writeInt(bM96501q6);
        byte bM96501q7 = AbstractC31375j.m96501q(this.f20595I);
        AbstractC36221c.m115337r(parcel, 10, 4);
        parcel.writeInt(bM96501q7);
        byte bM96501q8 = AbstractC31375j.m96501q(this.f20596J);
        AbstractC36221c.m115337r(parcel, 11, 4);
        parcel.writeInt(bM96501q8);
        byte bM96501q9 = AbstractC31375j.m96501q(this.f20597K);
        AbstractC36221c.m115337r(parcel, 12, 4);
        parcel.writeInt(bM96501q9);
        byte bM96501q10 = AbstractC31375j.m96501q(this.f20598L);
        AbstractC36221c.m115337r(parcel, 14, 4);
        parcel.writeInt(bM96501q10);
        byte bM96501q11 = AbstractC31375j.m96501q(this.f20599M);
        AbstractC36221c.m115337r(parcel, 15, 4);
        parcel.writeInt(bM96501q11);
        AbstractC36221c.m115326g(parcel, 16, this.f20600N);
        AbstractC36221c.m115326g(parcel, 17, this.f20601O);
        AbstractC36221c.m115331l(parcel, 18, this.f20602P, i13);
        byte bM96501q12 = AbstractC31375j.m96501q(this.f20603Q);
        AbstractC36221c.m115337r(parcel, 19, 4);
        parcel.writeInt(bM96501q12);
        AbstractC36221c.m115330k(parcel, 20, this.f20604R);
        AbstractC36221c.m115332m(parcel, 21, this.f20605S);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
