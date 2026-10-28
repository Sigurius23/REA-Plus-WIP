package com.whoop.gps.network;

import com.whoop.gps.upload.dto.GpsUploadModel;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/gps/network/GpsTrackingApi;", "", "", "Lcom/whoop/gps/upload/dto/GpsUploadModel;", "locations", "Lpg3/v0;", "Ll83/a0;", "uploadGpsLocations", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface GpsTrackingApi {
    @InterfaceC37284o("gps-service/v1/gps/location/live")
    Object uploadGpsLocations(@InterfaceC37270a List<GpsUploadModel> list, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
