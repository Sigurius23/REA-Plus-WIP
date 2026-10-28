package com.whoop.tiltgraph.api;

import com.mapbox.common.HttpHeaders;
import com.whoop.tiltgraph.domain.models.TiltGraphCalendar;
import com.whoop.tiltgraph.domain.models.TiltGraphResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/tiltgraph/api/TiltGraphApi;", "", "", HttpHeaders.DATE, "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "getTiltGraphData", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/tiltgraph/domain/models/TiltGraphCalendar;", "getTiltGraphCalendar", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TiltGraphApi {
    @InterfaceC37275f("home-service/v1/calendar/RECOVERY")
    Object getTiltGraphCalendar(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super TiltGraphCalendar> interfaceC30057d);

    @InterfaceC37275f("home-service/v1/tilt-view")
    Object getTiltGraphData(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super TiltGraphResponse> interfaceC30057d);
}
