package ix0;

import com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsMetadata;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ix0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;", "", "", "b", "(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;)Ljava/util/Map;", "data-sync-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21014c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Map<String, String> m58585b(Rev2DataSettingsMetadata rev2DataSettingsMetadata) {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Encoding", "gzip"), new C23465k("X-WHOOP-Strap-ID", rev2DataSettingsMetadata.getStrapId()), new C23465k("X-WHOOP-HW-Version", rev2DataSettingsMetadata.getHardwareVersion()), new C23465k("X-WHOOP-FW-Version", rev2DataSettingsMetadata.getFirmwareVersion()), new C23465k("X-WHOOP-DSP-Version", rev2DataSettingsMetadata.getSigProcVersion()), new C23465k("X-WHOOP-Binary-Version", String.valueOf(rev2DataSettingsMetadata.getBinaryVersion())), new C23465k("X-WHOOP-Binary-Flags", String.valueOf(rev2DataSettingsMetadata.getBinaryFlags())));
    }
}
