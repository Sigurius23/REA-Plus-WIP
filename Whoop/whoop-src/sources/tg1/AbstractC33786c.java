package tg1;

import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Ltg1/b;", "", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "a", "(Ljava/util/Map;)Ljava/util/List;", "firmware-update-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33786c {
    /* JADX INFO: renamed from: a */
    public static final List<ChipFirmwareVersion> m106851a(Map<EnumC33785b, String> map) {
        AbstractC22676k.m65750j(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<EnumC33785b, String> entry : map.entrySet()) {
            arrayList.add(new ChipFirmwareVersion(entry.getKey().getSerializedValue(), entry.getValue()));
        }
        return arrayList;
    }
}
