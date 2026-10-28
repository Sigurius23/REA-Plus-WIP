package p296l5;

import android.os.Parcel;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l5.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C23346j {

    /* JADX INFO: renamed from: a */
    public final byte[] f92556a;

    /* JADX INFO: renamed from: b */
    public final String f92557b;

    /* JADX INFO: renamed from: c */
    public final long f92558c;

    public C23346j(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.f92556a = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        AbstractC22676k.m65747g(string);
        this.f92557b = string;
        this.f92558c = parcel.readLong();
    }
}
