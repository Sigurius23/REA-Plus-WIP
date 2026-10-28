package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gp.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C16041l implements Parcelable {
    public static final Parcelable.Creator<C16041l> CREATOR = new C16040k0(25);

    /* JADX INFO: renamed from: w */
    public final Enum f60674w;

    /* JADX WARN: Multi-variable type inference failed */
    public C16041l(InterfaceC16019a interfaceC16019a) {
        this.f60674w = (Enum) interfaceC16019a;
    }

    /* JADX INFO: renamed from: b */
    public static C16041l m45352b(int i13) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        InterfaceC16019a interfaceC16019a;
        if (i13 != -262) {
            for (EnumC16061x enumC16061x : EnumC16061x.values()) {
                if (enumC16061x.f60741w == i13) {
                    interfaceC16019a = enumC16061x;
                }
            }
            for (EnumC16043m enumC16043m : EnumC16043m.values()) {
                if (enumC16043m.f60677w == i13) {
                    interfaceC16019a = enumC16043m;
                }
            }
            throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(AbstractC2875y.m8296i(i13, "Algorithm with COSE value ", " not supported"));
        }
        interfaceC16019a = EnumC16061x.RS1;
        return new C16041l(interfaceC16019a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gp.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gp.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof C16041l) && this.f60674w.mo45338a() == ((C16041l) obj).f60674w.mo45338a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60674w});
    }

    public final String toString() {
        return AbstractC11895b.m31996o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f60674w), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gp.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f60674w.mo45338a());
    }
}
