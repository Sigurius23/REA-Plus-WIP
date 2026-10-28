package pg1;

import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: pg1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "", "a", "(I)Ljava/lang/String;", "firmware-update-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29164b {
    /* JADX INFO: renamed from: a */
    public static final String m88614a(int i13) {
        if (i13 == -1) {
            return AbstractC2875y.m8296i(i13, "DFU Scan Timeout[", "]");
        }
        if (i13 == 0) {
            return AbstractC2875y.m8296i(i13, "Other[", "]");
        }
        if (i13 == 1) {
            return AbstractC2875y.m8296i(i13, "Communication State[", "]");
        }
        if (i13 == 2) {
            return AbstractC2875y.m8296i(i13, "Communication[", "]");
        }
        if (i13 == 3) {
            return AbstractC2875y.m8296i(i13, "DFU Remote[", "]");
        }
        switch (i13) {
            case DfuBaseService.ERROR_FILE_ERROR /* 4098 */:
                return AbstractC2875y.m8296i(i13, "DFU File Error[", "]");
            case DfuBaseService.ERROR_FILE_INVALID /* 4099 */:
                return AbstractC2875y.m8296i(i13, "DFU File Invalid[", "]");
            case DfuBaseService.ERROR_FILE_IO_EXCEPTION /* 4100 */:
                return AbstractC2875y.m8296i(i13, "DFU File IO Exception[", "]");
            default:
                return AbstractC2875y.m8296i(i13, "Unknown[", "]");
        }
    }
}
