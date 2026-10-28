package y42;

import c52.C4253d;
import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import ht0.EnumC17623a;
import java.util.List;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y42.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ly42/a;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "a", "(Ly42/a;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "puffin_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39224f {
    /* JADX INFO: renamed from: a */
    public static final WhoopFwDevice m124963a(InterfaceC39219a interfaceC39219a) {
        InterfaceC27939b firmwareVersion;
        AbstractC22676k.m65750j(interfaceC39219a, "<this>");
        EnumC17623a enumC17623a = EnumC17623a.NORDIC;
        C4253d c4253dMo124935O = interfaceC39219a.mo124935O();
        String strMo84319a = (c4253dMo124935O == null || (firmwareVersion = c4253dMo124935O.getFirmwareVersion()) == null) ? null : firmwareVersion.mo84319a();
        if (strMo84319a == null) {
            strMo84319a = "";
        }
        List listM118958J = AbstractC37056f.m118958J(new ChipDetails(enumC17623a, strMo84319a));
        WhoopDeviceName whoopDeviceName = WhoopDeviceName.PUFFIN;
        C4253d c4253dMo124935O2 = interfaceC39219a.mo124935O();
        String serialNumber = c4253dMo124935O2 != null ? c4253dMo124935O2.getSerialNumber() : null;
        return new WhoopFwDevice(whoopDeviceName, serialNumber != null ? serialNumber : "", listM118958J);
    }
}
