package live.hms.video.database.dao;

import java.util.List;
import l83.C23454a0;
import live.hms.video.database.entity.AnalyticsEntityModel;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/database/dao/AnalyticsEventsDao;", "", "Llive/hms/video/database/entity/AnalyticsEntityModel;", "analyticsModel", "Ll83/a0;", "addEvent", "(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;", "deleteLog", "", "eventId", "deleteLogById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "getAllEvents", "(Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface AnalyticsEventsDao {
    Object addEvent(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteLog(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteLogById(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getAllEvents(InterfaceC30057d<? super List<AnalyticsEntityModel>> interfaceC30057d);
}
