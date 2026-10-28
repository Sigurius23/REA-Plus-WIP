package live.hms.video.database;

import java.util.List;
import l83.C23454a0;
import live.hms.video.database.dao.AnalyticsEventsDao;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.events.HMSApiClient;
import live.hms.video.utils.HMSAgentOs;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0010\u0010\fJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/database/OfflineAnalyticsRepository;", "", "Llive/hms/video/database/dao/AnalyticsEventsDao;", "analyticsEventsDao", "Llive/hms/video/utils/HMSAgentOs;", "hmsAgentOs", "<init>", "(Llive/hms/video/database/dao/AnalyticsEventsDao;Llive/hms/video/utils/HMSAgentOs;)V", "Llive/hms/video/database/entity/AnalyticsEntityModel;", "analyticsEntityModel", "Ll83/a0;", "insertLog", "(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;", "", "getAllLogs", "(Lq83/d;)Ljava/lang/Object;", "deleteLog", "", "eventId", "deleteLogById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "flushLog", "Llive/hms/video/database/dao/AnalyticsEventsDao;", "Llive/hms/video/utils/HMSAgentOs;", "getHmsAgentOs", "()Llive/hms/video/utils/HMSAgentOs;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OfflineAnalyticsRepository {
    private final AnalyticsEventsDao analyticsEventsDao;
    private final HMSAgentOs hmsAgentOs;

    public OfflineAnalyticsRepository(AnalyticsEventsDao analyticsEventsDao, HMSAgentOs hmsAgentOs) {
        AbstractC22676k.m65750j(analyticsEventsDao, "analyticsEventsDao");
        AbstractC22676k.m65750j(hmsAgentOs, "hmsAgentOs");
        this.analyticsEventsDao = analyticsEventsDao;
        this.hmsAgentOs = hmsAgentOs;
    }

    public final Object deleteLog(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteLog = this.analyticsEventsDao.deleteLog(analyticsEntityModel, interfaceC30057d);
        return objDeleteLog == EnumC31071a.f128113w ? objDeleteLog : C23454a0.f92919a;
    }

    public final Object deleteLogById(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteLogById = this.analyticsEventsDao.deleteLogById(str, interfaceC30057d);
        return objDeleteLogById == EnumC31071a.f128113w ? objDeleteLogById : C23454a0.f92919a;
    }

    public final Object flushLog(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return HMSApiClient.INSTANCE.reportAnalyticsEvent(analyticsEntityModel, this.hmsAgentOs, interfaceC30057d);
    }

    public final Object getAllLogs(InterfaceC30057d<? super List<AnalyticsEntityModel>> interfaceC30057d) {
        return this.analyticsEventsDao.getAllEvents(interfaceC30057d);
    }

    public final HMSAgentOs getHmsAgentOs() {
        return this.hmsAgentOs;
    }

    public final Object insertLog(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objAddEvent = this.analyticsEventsDao.addEvent(analyticsEntityModel, interfaceC30057d);
        return objAddEvent == EnumC31071a.f128113w ? objAddEvent : C23454a0.f92919a;
    }
}
