package td3;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: td3.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC33727g {

    /* JADX INFO: renamed from: a */
    public static final ParcelUuid f141058a = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: a */
    public static ParcelUuid m106612a(byte[] bArr) {
        long j7;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(length, "uuidBytes length invalid - "));
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j7 = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j7 = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        ParcelUuid parcelUuid = f141058a;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j7 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }
}
