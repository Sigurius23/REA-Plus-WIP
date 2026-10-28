package hl2;

import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.Introduction;
import com.whoop.training.data.network.response.hrsettings.ManualHeartRateZonesForm;
import m83.C25271y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: hl2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "a", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "()Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "defaultHrSettingResponse", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17410e {

    /* JADX INFO: renamed from: a */
    private static final HrSettingsResponse f67431a;

    static {
        Introduction introduction = new Introduction("", "");
        C25271y c25271y = C25271y.f99162w;
        f67431a = new HrSettingsResponse("", introduction, c25271y, c25271y, new ManualHeartRateZonesForm(false, "", "", "", "", "", "", c25271y));
    }

    /* JADX INFO: renamed from: a */
    public static final HrSettingsResponse m49390a() {
        return f67431a;
    }
}
