package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import p088dc.AbstractC11895b;
import p126eq.C13433b;

/* JADX INFO: renamed from: gp.b */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16021b implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC16021b> CREATOR = new C13433b(22);

    /* JADX INFO: renamed from: w */
    public final String f60619w;

    EnumC16021b(String str) {
        this.f60619w = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16021b m45339b(String str) throws Attachment$UnsupportedAttachmentException {
        for (EnumC16021b enumC16021b : values()) {
            if (str.equals(enumC16021b.f60619w)) {
                return enumC16021b;
            }
        }
        throw new Attachment$UnsupportedAttachmentException(AbstractC11895b.m31996o("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60619w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f60619w);
    }
}
