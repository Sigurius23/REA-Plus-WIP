package ci2;

import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.domain.model.WhoopStrapInfo;
import ht0.EnumC17623a;
import jk0.InterfaceC21750d;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ci2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ljk0/d;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "b", "(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "deviceName", "", "serial", "firmwareVersion", "a", "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4732a {

    /* JADX INFO: renamed from: ci2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19338a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f19338a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final WhoopFwDevice m14815a(WhoopDeviceName whoopDeviceName, String str, String str2) {
        return new WhoopFwDevice(whoopDeviceName, str, AbstractC37056f.m118958J(new ChipDetails(EnumC17623a.AMBIQ, str2)));
    }

    /* JADX INFO: renamed from: b */
    public static final WhoopFwDevice m14816b(InterfaceC21750d interfaceC21750d) throws IllegalAccessException {
        InterfaceC27939b bluetoothVersion;
        InterfaceC27939b maximVersion;
        AbstractC22676k.m65750j(interfaceC21750d, "<this>");
        WhoopStrapInfo whoopStrapInfo = interfaceC21750d.get_strapInfo();
        String strMo84319a = null;
        String rawSerialNumber = whoopStrapInfo != null ? whoopStrapInfo.getRawSerialNumber() : null;
        if (rawSerialNumber == null) {
            rawSerialNumber = "";
        }
        String strMo84319a2 = (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
        if (strMo84319a2 == null) {
            strMo84319a2 = "";
        }
        switch (a.f19338a[interfaceC21750d.mo24752w0().ordinal()]) {
            case 1:
                WhoopDeviceName whoopDeviceName = WhoopDeviceName.HARVARD;
                ChipDetails chipDetails = new ChipDetails(EnumC17623a.MAXIM, strMo84319a2);
                EnumC17623a enumC17623a = EnumC17623a.NORDIC;
                if (whoopStrapInfo != null && (bluetoothVersion = whoopStrapInfo.getBluetoothVersion()) != null) {
                    strMo84319a = bluetoothVersion.mo84319a();
                }
                return new WhoopFwDevice(whoopDeviceName, rawSerialNumber, AbstractC37056f.m118959K(chipDetails, new ChipDetails(enumC17623a, strMo84319a != null ? strMo84319a : "")));
            case 2:
                return m14815a(WhoopDeviceName.MAVERICK, rawSerialNumber, strMo84319a2);
            case 3:
                return m14815a(WhoopDeviceName.GOOSE, rawSerialNumber, strMo84319a2);
            case 4:
                return m14815a(WhoopDeviceName.MONUMENT, rawSerialNumber, strMo84319a2);
            case 5:
                return m14815a(WhoopDeviceName.SYMPHONY, rawSerialNumber, strMo84319a2);
            case 6:
                throw new IllegalAccessException("Puffin should not be checked here from IWhoopStrap extension method");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
