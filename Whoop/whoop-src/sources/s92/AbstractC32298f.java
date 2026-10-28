package s92;

import jk0.AbstractC21754h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: s92.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "", "b", "(I)Ljava/lang/String;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32298f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m100548b(int i13) {
        if (i13 == -100) {
            return AbstractC2875y.m8296i(i13, "Bluetooth disabled (", ")");
        }
        if (i13 == 10) {
            return AbstractC2875y.m8296i(i13, "The connection timed out (", ")");
        }
        switch (i13) {
            case DfuBaseService.PROGRESS_ABORTED /* -7 */:
                return AbstractC2875y.m8296i(i13, "Cancelled (", ")");
            case DfuBaseService.PROGRESS_COMPLETED /* -6 */:
                return AbstractC2875y.m8296i(i13, "Validation issue (", ")");
            case DfuBaseService.PROGRESS_DISCONNECTING /* -5 */:
                return AbstractC2875y.m8296i(i13, "Timeout (", ")");
            case DfuBaseService.PROGRESS_VALIDATING /* -4 */:
                return AbstractC2875y.m8296i(i13, "Request failed (", ")");
            case DfuBaseService.PROGRESS_ENABLING_DFU_MODE /* -3 */:
                return AbstractC2875y.m8296i(i13, "Null attribute (", ")");
            case -2:
                return AbstractC2875y.m8296i(i13, "Device not supported (", ")");
            case -1:
                return AbstractC2875y.m8296i(i13, "Device disconnected (", ")");
            case 0:
                return AbstractC2875y.m8296i(i13, "The disconnection was initiated by the user (", ")");
            case 1:
                return AbstractC2875y.m8296i(i13, "The local device initiated disconnection (", ")");
            case 2:
                return AbstractC2875y.m8296i(i13, "The remote device initiated graceful disconnection (", ")");
            case 3:
                return AbstractC2875y.m8296i(i13, "Connection lost (", ")");
            case 4:
                return AbstractC2875y.m8296i(i13, "The device does not hav required services (", ")");
            default:
                return AbstractC21754h.m61390a(i13);
        }
    }
}
