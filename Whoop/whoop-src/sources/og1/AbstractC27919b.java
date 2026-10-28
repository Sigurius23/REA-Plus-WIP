package og1;

import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg1.EnumC33784a;
import tg1.EnumC33785b;

/* JADX INFO: renamed from: og1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "Lcom/whoop/connectivityCore/firmware/models/ChipDetails;", "", "Ltg1/b;", "", "d", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "Ltg1/a;", "c", "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Ltg1/a;", "firmware-update-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27919b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public static final EnumC33784a m84257c(WhoopDeviceName whoopDeviceName) {
        String serializedValue = whoopDeviceName.getSerializedValue();
        EnumC33784a enumC33784a = EnumC33784a.UNKNOWN;
        for (EnumC33784a enumC33784a2 : EnumC33784a.values()) {
            if (AbstractC22676k.m65745e(enumC33784a2.getSerializedValue(), serializedValue)) {
                if (enumC33784a2 == null) {
                    return enumC33784a;
                }
                return enumC33784a2;
            }
        }
        enumC33784a2 = null;
        if (enumC33784a2 == null) {
            return enumC33784a;
        }
        return enumC33784a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Map<EnumC33785b, String> m84258d(List<ChipDetails> list) {
        EnumC33785b enumC33785b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ChipDetails> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ChipDetails chipDetails : list2) {
            String strName = chipDetails.getWhoopChip().name();
            EnumC33785b enumC33785b2 = EnumC33785b.UNKNOWN;
            EnumC33785b[] enumC33785bArrValues = EnumC33785b.values();
            int length = enumC33785bArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC33785b = null;
                    break;
                }
                enumC33785b = enumC33785bArrValues[i13];
                if (AbstractC22676k.m65745e(enumC33785b.getSerializedValue(), strName)) {
                    break;
                }
                i13++;
            }
            if (enumC33785b != null) {
                enumC33785b2 = enumC33785b;
            }
            arrayList.add((String) linkedHashMap.put(enumC33785b2, chipDetails.getFirmwareVersion()));
        }
        return linkedHashMap;
    }
}
