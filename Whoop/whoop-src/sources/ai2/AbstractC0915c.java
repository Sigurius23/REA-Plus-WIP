package ai2;

import com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsMetadata;
import hk0.C17370e;
import lt0.InterfaceC24729f;
import oh2.C27938a;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ai2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Llt0/f;", "Lhk0/e;", "c", "(Llt0/f;)Lhk0/e;", "Loh2/a;", "", "binaryFlags", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "d", "(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "strap-history-sync_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0915c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C17370e m2266c(InterfaceC24729f interfaceC24729f) {
        C17370e c17370e = interfaceC24729f instanceof C17370e ? (C17370e) interfaceC24729f : null;
        if (c17370e != null) {
            return c17370e;
        }
        throw new IllegalStateException(("Expected a Rev2 data settings packet, got " + interfaceC24729f.getClass().getSimpleName() + " with format revision " + interfaceC24729f.mo49181g()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Rev2DataSettingsMetadata m2267d(C27938a c27938a, int i13) {
        String strM84332d;
        String strMo84319a;
        String strM84360f;
        String strapId = c27938a.getStrapId();
        String str = "";
        if (strapId == null) {
            strapId = "";
        }
        C27940c hardwareVersion = c27938a.getHardwareVersion();
        if (hardwareVersion == null || (strM84332d = hardwareVersion.m84332d()) == null) {
            strM84332d = "";
        }
        InterfaceC27939b firmwareVersion = c27938a.getFirmwareVersion();
        if (firmwareVersion == null || (strMo84319a = firmwareVersion.mo84319a()) == null) {
            strMo84319a = "";
        }
        C27942e sigProcVersion = c27938a.getSigProcVersion();
        if (sigProcVersion != null && (strM84360f = sigProcVersion.m84360f()) != null) {
            str = strM84360f;
        }
        return new Rev2DataSettingsMetadata(strapId, strM84332d, strMo84319a, str, c27938a.getVersion(), i13);
    }
}
