package com.whoop.trends.data;

import com.whoop.trends.data.model.ManualMeasurementRequestBody;
import com.whoop.trends.data.model.MeasurementRecord;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.Sections;
import com.whoop.trends.data.model.TrendTileProperties;
import com.whoop.trends.data.model.TrendsDtoV3;
import com.whoop.trends.data.model.Vo2ManualMeasurementRequest;
import l83.C23454a0;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020\u0004H§@¢\u0006\u0004\b\"\u0010\u001bJ*\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0004H§@¢\u0006\u0004\b$\u0010%J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020&H§@¢\u0006\u0004\b)\u0010(J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0012\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,¨\u0006-À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/trends/data/TrendsApi;", "", "Lor2/h0;", "graphKey", "", "dateTime", "firmWareVersion", "Lcom/whoop/trends/data/model/TrendsDtoV3;", "getTrendsV3", "(Lor2/h0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/RecordedData;", "getRecordedData", "(Lor2/h0;Lq83/d;)Ljava/lang/Object;", "nextToken", "Lcom/whoop/trends/data/model/Sections;", "getPaginatedRecordedData", "(Lor2/h0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "body", "Lpg3/v0;", "Ll83/a0;", "addManualMeasurement", "(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;", "id", "updateManualMeasurement", "(Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;", "deleteManualMeasurement", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/TrendTileProperties;", "properties", "updateTrendTileProperties", "(Lcom/whoop/trends/data/model/TrendTileProperties;Lq83/d;)Ljava/lang/Object;", "measurementType", "Lcom/whoop/trends/data/model/MeasurementRecord;", "fetchMeasurementReportData", "measurementId", "deleteMeasurementReport", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;", "addMeasurementReport", "(Ljava/lang/String;Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;", "editMeasurementReport", "Lcom/whoop/trends/data/DismissBody;", "dismissRequest", "(Lcom/whoop/trends/data/DismissBody;Lq83/d;)Ljava/lang/Object;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TrendsApi {
    @InterfaceC37284o("progression-service/v3/trends/WEIGHT/readings")
    Object addManualMeasurement(@InterfaceC37270a ManualMeasurementRequestBody manualMeasurementRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("vo2max-service/v2/{measurementType}/manual")
    Object addMeasurementReport(@InterfaceC37288s("measurementType") String str, @InterfaceC37270a Vo2ManualMeasurementRequest vo2ManualMeasurementRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("progression-service/v3/trends/WEIGHT/readings/{id}")
    Object deleteManualMeasurement(@InterfaceC37288s("id") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("vo2max-service/v2/{measurementType}/manual/{id}")
    Object deleteMeasurementReport(@InterfaceC37288s("measurementType") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-preferences-service/v1/components/dismissals")
    Object dismissRequest(@InterfaceC37270a DismissBody dismissBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("vo2max-service/v2/{measurementType}/manual")
    Object editMeasurementReport(@InterfaceC37288s("measurementType") String str, @InterfaceC37270a Vo2ManualMeasurementRequest vo2ManualMeasurementRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("progression-service/v3/{measurementType}/manual/readings")
    Object fetchMeasurementReportData(@InterfaceC37288s("measurementType") String str, InterfaceC30057d<? super MeasurementRecord> interfaceC30057d);

    @InterfaceC37275f("progression-service/v3/trends/{graphKey}/readings/paginated")
    Object getPaginatedRecordedData(@InterfaceC37288s("graphKey") EnumC28166h0 enumC28166h0, @InterfaceC37289t("next_token") String str, InterfaceC30057d<? super Sections> interfaceC30057d);

    @InterfaceC37275f("progression-service/v3/trends/{graphKey}/readings")
    Object getRecordedData(@InterfaceC37288s("graphKey") EnumC28166h0 enumC28166h0, InterfaceC30057d<? super RecordedData> interfaceC30057d);

    @InterfaceC37275f("progression-service/v3/trends/{graphKey}")
    Object getTrendsV3(@InterfaceC37288s("graphKey") EnumC28166h0 enumC28166h0, @InterfaceC37289t("endDate") String str, @InterfaceC37278i("X-WHOOP-FW-Version") String str2, InterfaceC30057d<? super TrendsDtoV3> interfaceC30057d);

    @InterfaceC37285p("progression-service/v3/trends/WEIGHT/readings/{id}")
    Object updateManualMeasurement(@InterfaceC37288s("id") String str, @InterfaceC37270a ManualMeasurementRequestBody manualMeasurementRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-preferences-service/v1/home/dashboard/customize/properties")
    Object updateTrendTileProperties(@InterfaceC37270a TrendTileProperties trendTileProperties, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
