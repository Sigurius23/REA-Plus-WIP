package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Locale;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: gp.n */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16045n implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC16045n> CREATOR = new C16040k0(29);

    /* JADX INFO: renamed from: w */
    public final int f60693w;

    EnumC16045n(int i13) {
        this.f60693w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16045n m45353b(int i13) throws ErrorCode$UnsupportedErrorCodeException {
        for (EnumC16045n enumC16045n : values()) {
            if (i13 == enumC16045n.f60693w) {
                return enumC16045n;
            }
        }
        Locale locale = Locale.US;
        throw new ErrorCode$UnsupportedErrorCodeException(AbstractC2875y.m8296i(i13, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f60693w);
    }
}
