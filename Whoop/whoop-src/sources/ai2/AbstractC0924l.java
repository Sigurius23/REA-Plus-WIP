package ai2;

import com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2RawDataMetadata;
import cu0.C11115c;
import oh2.C27938a;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ai2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Loh2/a;", "Lcu0/c;", "c", "(Loh2/a;)Lcu0/c;", "", "binaryFlags", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;", "d", "(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;", "strap-history-sync_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0924l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C11115c m2282c(C27938a c27938a) {
        String strM84332d;
        String strMo84319a;
        C27940c hardwareVersion = c27938a.getHardwareVersion();
        if (hardwareVersion == null || (strM84332d = hardwareVersion.m84332d()) == null) {
            strM84332d = "";
        }
        InterfaceC27939b firmwareVersion = c27938a.getFirmwareVersion();
        if (firmwareVersion == null || (strMo84319a = firmwareVersion.mo84319a()) == null) {
            strMo84319a = "";
        }
        C27942e sigProcVersion = c27938a.getSigProcVersion();
        String strM84360f = sigProcVersion != null ? sigProcVersion.m84360f() : null;
        String strapId = c27938a.getStrapId();
        return new C11115c(strM84332d, strMo84319a, strM84360f, strapId != null ? strapId : "", c27938a.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Rev2RawDataMetadata m2283d(C27938a c27938a, int i13) {
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
        return new Rev2RawDataMetadata(strapId, strM84332d, strMo84319a, str, c27938a.getVersion(), i13);
    }
}
