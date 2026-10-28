package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;

/* JADX INFO: renamed from: com.google.android.gms.common.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4986c extends AbstractC36219a {
    public static final Parcelable.Creator<C4986c> CREATOR = new C1337q1(4);

    /* JADX INFO: renamed from: w */
    public final String f20522w;

    /* JADX INFO: renamed from: x */
    public final int f20523x;

    /* JADX INFO: renamed from: y */
    public final long f20524y;

    public C4986c(String str, int i13, long j7) {
        this.f20522w = str;
        this.f20523x = i13;
        this.f20524y = j7;
    }

    /* JADX INFO: renamed from: b */
    public final long m15611b() {
        long j7 = this.f20524y;
        return j7 == -1 ? this.f20523x : j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4986c) {
            C4986c c4986c = (C4986c) obj;
            String str = c4986c.f20522w;
            String str2 = this.f20522w;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && m15611b() == c4986c.m15611b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20522w, Long.valueOf(m15611b())});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f20522w, "name");
        c29205p.m88707c(Long.valueOf(m15611b()), "version");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f20522w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f20523x);
        long jM15611b = m15611b();
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(jM15611b);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }

    public C4986c(String str, long j7) {
        this.f20522w = str;
        this.f20524y = j7;
        this.f20523x = -1;
    }
}
