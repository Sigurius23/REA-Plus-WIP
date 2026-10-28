package com.whoop.common.network.api;

import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.EditedActivityPayload;
import com.whoop.edit.network.model.EditSleepModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/common/network/api/AddActivitiesApi;", "", "", "activityId", "Lcom/whoop/addactivity/network/EditedActivityPayload;", "coreEditDetails", "Lpg3/v0;", "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;", "editCardioActivity", "(Ljava/lang/String;Lcom/whoop/addactivity/network/EditedActivityPayload;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "editRecoveryActivity", "Lcom/whoop/edit/network/model/EditSleepModel;", "editSleepModel", "editSleep", "(Ljava/lang/String;Lcom/whoop/edit/network/model/EditSleepModel;Lq83/d;)Ljava/lang/Object;", "sleepId", "deleteSleep", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AddActivitiesApi {
    @InterfaceC37271b("core-details-bff/v2/sleep-details/{activityId}")
    Object deleteSleep(@InterfaceC37288s("activityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("core-details-bff/v2/cardio-details")
    Object editCardioActivity(@InterfaceC37289t("activityId") String str, @InterfaceC37270a EditedActivityPayload editedActivityPayload, InterfaceC30057d<? super C29218v0<CoreDetailsActivityResponse>> interfaceC30057d);

    @InterfaceC37285p("core-details-bff/v1/recovery-details")
    Object editRecoveryActivity(@InterfaceC37289t("recoveryActivityId") String str, @InterfaceC37270a EditedActivityPayload editedActivityPayload, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("core-details-bff/v2/sleep-details/{activityId}")
    Object editSleep(@InterfaceC37288s("activityId") String str, @InterfaceC37270a EditSleepModel editSleepModel, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
