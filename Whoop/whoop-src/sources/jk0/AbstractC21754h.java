package jk0;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: jk0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "", "a", "(I)Ljava/lang/String;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21754h {
    /* JADX INFO: renamed from: a */
    public static final String m61390a(int i13) {
        if (i13 == 0) {
            return AbstractC2875y.m8296i(i13, "GATT_SUCCESS [", "]");
        }
        if (i13 == 13) {
            return AbstractC2875y.m8296i(i13, "GATT_INVALID_ATTRIBUTE_LENGTH [", "]");
        }
        if (i13 == 15) {
            return AbstractC2875y.m8296i(i13, "GATT_INSUFFICIENT_ENCRYPTION [", "]");
        }
        if (i13 == 143) {
            return AbstractC2875y.m8296i(i13, "GATT_CONNECTION_CONGESTED [", "]");
        }
        if (i13 == 257) {
            return AbstractC2875y.m8296i(i13, "GATT_FAILURE [", "]");
        }
        if (i13 == 2) {
            return AbstractC2875y.m8296i(i13, "GATT_READ_NOT_PERMITTED [", "]");
        }
        if (i13 == 3) {
            return AbstractC2875y.m8296i(i13, "GATT_WRITE_NOT_PERMITTED [", "]");
        }
        if (i13 == 5) {
            return AbstractC2875y.m8296i(i13, "GATT_INSUFFICIENT_AUTHENTICATION [", "]");
        }
        if (i13 != 6) {
            return i13 != 7 ? AbstractC2875y.m8296i(i13, "Unknown status: [", "]") : AbstractC2875y.m8296i(i13, "GATT_INVALID_OFFSET [", "]");
        }
        return AbstractC2875y.m8296i(i13, "GATT_REQUEST_NOT_SUPPORTED [", "]");
    }
}
