package com.whoop.editactivities.network;

import com.mapbox.common.HttpHeaders;
import com.whoop.editactivities.network.model.EditActivitiesDrawerResponse;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;", "", "", HttpHeaders.DATE, "Lpg3/v0;", "Lcom/whoop/editactivities/network/model/EditActivitiesDrawerResponse;", "getEditActivitiesDrawerContent", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "Ll83/a0;", "deleteActivities", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "startTime", "endTime", "mergeActivities", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface EditActivitiesDrawerApi {
    @InterfaceC37271b("core-details-bff/v1/activities/merge")
    Object deleteActivities(@InterfaceC37289t("id") List<String> list, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("home-service/v1/home/activities/multi-modifications")
    Object getEditActivitiesDrawerContent(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super C29218v0<EditActivitiesDrawerResponse>> interfaceC30057d);

    @InterfaceC37283n("core-details-bff/v1/activities/merge")
    Object mergeActivities(@InterfaceC37289t("startTime") String str, @InterfaceC37289t("endTime") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
