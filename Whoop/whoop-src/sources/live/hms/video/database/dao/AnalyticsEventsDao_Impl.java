package live.hms.video.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.AbstractC1782f;
import androidx.room.AbstractC1798j;
import androidx.room.AbstractC1805l;
import androidx.room.AbstractC1825r1;
import androidx.room.AbstractC1848z0;
import androidx.room.C1813n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import l83.C23454a0;
import live.hms.video.database.converters.TypeConverter;
import live.hms.video.database.entity.AnalyticsCluster;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.database.entity.AnalyticsPeer;
import p477s2.AbstractC32073e;
import p518ub.InterfaceC34735h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsEventsDao_Impl implements AnalyticsEventsDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1798j __deletionAdapterOfAnalyticsEntityModel;
    private final AbstractC1805l __insertionAdapterOfAnalyticsEntityModel;
    private final AbstractC1825r1 __preparedStmtOfDeleteLogById;

    public AnalyticsEventsDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
        this.__insertionAdapterOfAnalyticsEntityModel = new AbstractC1805l(abstractC1848z0) { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(abstractC1848z0);
                AbstractC22676k.m65750j(abstractC1848z0, "database");
            }

            @Override // androidx.room.AbstractC1825r1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `analytics_table` (`timestamp`,`eventId`,`payload`,`eventName`,`token`,`isQa`,`peerId`,`role`,`joinedAt`,`leftAt`,`roomName`,`sessionStartedAt`,`userData`,`userName`,`templateId`,`sessionId`,`websocketUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1805l
            public void bind(InterfaceC34735h interfaceC34735h, AnalyticsEntityModel analyticsEntityModel) {
                interfaceC34735h.mo5433p(1, analyticsEntityModel.getTimestamp());
                if (analyticsEntityModel.getEventId() == null) {
                    interfaceC34735h.mo5436u(2);
                } else {
                    interfaceC34735h.mo5432n0(2, analyticsEntityModel.getEventId());
                }
                String strMapToString = TypeConverter.mapToString(analyticsEntityModel.getPayload());
                if (strMapToString == null) {
                    interfaceC34735h.mo5436u(3);
                } else {
                    interfaceC34735h.mo5432n0(3, strMapToString);
                }
                if (analyticsEntityModel.getEventName() == null) {
                    interfaceC34735h.mo5436u(4);
                } else {
                    interfaceC34735h.mo5432n0(4, analyticsEntityModel.getEventName());
                }
                if (analyticsEntityModel.getToken() == null) {
                    interfaceC34735h.mo5436u(5);
                } else {
                    interfaceC34735h.mo5432n0(5, analyticsEntityModel.getToken());
                }
                interfaceC34735h.mo5433p(6, analyticsEntityModel.isQa() ? 1L : 0L);
                AnalyticsPeer analyticsPeer = analyticsEntityModel.getAnalyticsPeer();
                if (analyticsPeer != null) {
                    if (analyticsPeer.getPeerId() == null) {
                        interfaceC34735h.mo5436u(7);
                    } else {
                        interfaceC34735h.mo5432n0(7, analyticsPeer.getPeerId());
                    }
                    if (analyticsPeer.getRole() == null) {
                        interfaceC34735h.mo5436u(8);
                    } else {
                        interfaceC34735h.mo5432n0(8, analyticsPeer.getRole());
                    }
                    if (analyticsPeer.getJoinedAt() == null) {
                        interfaceC34735h.mo5436u(9);
                    } else {
                        interfaceC34735h.mo5433p(9, analyticsPeer.getJoinedAt().longValue());
                    }
                    if (analyticsPeer.getLeftAt() == null) {
                        interfaceC34735h.mo5436u(10);
                    } else {
                        interfaceC34735h.mo5433p(10, analyticsPeer.getLeftAt().longValue());
                    }
                    if (analyticsPeer.getRoomName() == null) {
                        interfaceC34735h.mo5436u(11);
                    } else {
                        interfaceC34735h.mo5432n0(11, analyticsPeer.getRoomName());
                    }
                    if (analyticsPeer.getSessionStartedAt() == null) {
                        interfaceC34735h.mo5436u(12);
                    } else {
                        interfaceC34735h.mo5433p(12, analyticsPeer.getSessionStartedAt().longValue());
                    }
                    if (analyticsPeer.getUserData() == null) {
                        interfaceC34735h.mo5436u(13);
                    } else {
                        interfaceC34735h.mo5432n0(13, analyticsPeer.getUserData());
                    }
                    if (analyticsPeer.getUserName() == null) {
                        interfaceC34735h.mo5436u(14);
                    } else {
                        interfaceC34735h.mo5432n0(14, analyticsPeer.getUserName());
                    }
                    if (analyticsPeer.getTemplateId() == null) {
                        interfaceC34735h.mo5436u(15);
                    } else {
                        interfaceC34735h.mo5432n0(15, analyticsPeer.getTemplateId());
                    }
                    if (analyticsPeer.getSessionId() == null) {
                        interfaceC34735h.mo5436u(16);
                    } else {
                        interfaceC34735h.mo5432n0(16, analyticsPeer.getSessionId());
                    }
                } else {
                    interfaceC34735h.mo5436u(7);
                    interfaceC34735h.mo5436u(8);
                    interfaceC34735h.mo5436u(9);
                    interfaceC34735h.mo5436u(10);
                    interfaceC34735h.mo5436u(11);
                    interfaceC34735h.mo5436u(12);
                    interfaceC34735h.mo5436u(13);
                    interfaceC34735h.mo5436u(14);
                    interfaceC34735h.mo5436u(15);
                    interfaceC34735h.mo5436u(16);
                }
                AnalyticsCluster analyticsCluster = analyticsEntityModel.getAnalyticsCluster();
                if (analyticsCluster == null) {
                    interfaceC34735h.mo5436u(17);
                } else if (analyticsCluster.getWebsocketUrl() == null) {
                    interfaceC34735h.mo5436u(17);
                } else {
                    interfaceC34735h.mo5432n0(17, analyticsCluster.getWebsocketUrl());
                }
            }
        };
        this.__deletionAdapterOfAnalyticsEntityModel = new AbstractC1798j(abstractC1848z0) { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(abstractC1848z0);
                AbstractC22676k.m65750j(abstractC1848z0, "database");
            }

            @Override // androidx.room.AbstractC1825r1
            public String createQuery() {
                return "DELETE FROM `analytics_table` WHERE `eventId` = ?";
            }

            @Override // androidx.room.AbstractC1798j
            public void bind(InterfaceC34735h interfaceC34735h, AnalyticsEntityModel analyticsEntityModel) {
                if (analyticsEntityModel.getEventId() == null) {
                    interfaceC34735h.mo5436u(1);
                } else {
                    interfaceC34735h.mo5432n0(1, analyticsEntityModel.getEventId());
                }
            }
        };
        this.__preparedStmtOfDeleteLogById = new AbstractC1825r1(abstractC1848z0) { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.3
            @Override // androidx.room.AbstractC1825r1
            public String createQuery() {
                return "Delete FROM analytics_table WHERE eventId = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // live.hms.video.database.dao.AnalyticsEventsDao
    public Object addEvent(final AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC1782f.f7027a.m108678s(this.__db, true, new Callable<C23454a0>() { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.4
            @Override // java.util.concurrent.Callable
            public C23454a0 call() throws Exception {
                AnalyticsEventsDao_Impl.this.__db.beginTransaction();
                try {
                    AnalyticsEventsDao_Impl.this.__insertionAdapterOfAnalyticsEntityModel.insert(analyticsEntityModel);
                    AnalyticsEventsDao_Impl.this.__db.setTransactionSuccessful();
                    return C23454a0.f92919a;
                } finally {
                    AnalyticsEventsDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC30057d);
    }

    @Override // live.hms.video.database.dao.AnalyticsEventsDao
    public Object deleteLog(final AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC1782f.f7027a.m108678s(this.__db, true, new Callable<C23454a0>() { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.5
            @Override // java.util.concurrent.Callable
            public C23454a0 call() throws Exception {
                AnalyticsEventsDao_Impl.this.__db.beginTransaction();
                try {
                    AnalyticsEventsDao_Impl.this.__deletionAdapterOfAnalyticsEntityModel.handle(analyticsEntityModel);
                    AnalyticsEventsDao_Impl.this.__db.setTransactionSuccessful();
                    return C23454a0.f92919a;
                } finally {
                    AnalyticsEventsDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC30057d);
    }

    @Override // live.hms.video.database.dao.AnalyticsEventsDao
    public Object deleteLogById(final String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC1782f.f7027a.m108678s(this.__db, true, new Callable<C23454a0>() { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.6
            @Override // java.util.concurrent.Callable
            public C23454a0 call() throws Exception {
                InterfaceC34735h interfaceC34735hAcquire = AnalyticsEventsDao_Impl.this.__preparedStmtOfDeleteLogById.acquire();
                String str2 = str;
                if (str2 == null) {
                    interfaceC34735hAcquire.mo5436u(1);
                } else {
                    interfaceC34735hAcquire.mo5432n0(1, str2);
                }
                try {
                    AnalyticsEventsDao_Impl.this.__db.beginTransaction();
                    try {
                        interfaceC34735hAcquire.mo109676F();
                        AnalyticsEventsDao_Impl.this.__db.setTransactionSuccessful();
                        C23454a0 c23454a0 = C23454a0.f92919a;
                        AnalyticsEventsDao_Impl.this.__db.endTransaction();
                        AnalyticsEventsDao_Impl.this.__preparedStmtOfDeleteLogById.release(interfaceC34735hAcquire);
                        return c23454a0;
                    } catch (Throwable th3) {
                        AnalyticsEventsDao_Impl.this.__db.endTransaction();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    AnalyticsEventsDao_Impl.this.__preparedStmtOfDeleteLogById.release(interfaceC34735hAcquire);
                    throw th4;
                }
            }
        }, interfaceC30057d);
    }

    @Override // live.hms.video.database.dao.AnalyticsEventsDao
    public Object getAllEvents(InterfaceC30057d<? super List<AnalyticsEntityModel>> interfaceC30057d) {
        TreeMap treeMap = C1813n1.f7126I;
        final C1813n1 c1813n1M92118h = AbstractC30060g.m92118h(0, "Select * FROM analytics_table");
        CancellationSignal cancellationSignal = new CancellationSignal();
        return AbstractC1782f.f7027a.m108677r(this.__db, cancellationSignal, new Callable<List<AnalyticsEntityModel>>() { // from class: live.hms.video.database.dao.AnalyticsEventsDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<AnalyticsEntityModel> call() throws Exception {
                AnalyticsPeer analyticsPeer;
                AnalyticsCluster analyticsCluster;
                CallableC241337 callableC241337 = this;
                AbstractC1848z0 db4 = AnalyticsEventsDao_Impl.this.__db;
                C1813n1 sqLiteQuery = c1813n1M92118h;
                AbstractC22676k.m65750j(db4, "db");
                AbstractC22676k.m65750j(sqLiteQuery, "sqLiteQuery");
                Cursor cursorQuery = db4.query(sqLiteQuery, (CancellationSignal) null);
                try {
                    int iM99766y = AbstractC32073e.m99766y(cursorQuery, "timestamp");
                    int iM99766y2 = AbstractC32073e.m99766y(cursorQuery, "eventId");
                    int iM99766y3 = AbstractC32073e.m99766y(cursorQuery, "payload");
                    int iM99766y4 = AbstractC32073e.m99766y(cursorQuery, "eventName");
                    int iM99766y5 = AbstractC32073e.m99766y(cursorQuery, "token");
                    int iM99766y6 = AbstractC32073e.m99766y(cursorQuery, "isQa");
                    int iM99766y7 = AbstractC32073e.m99766y(cursorQuery, "peerId");
                    int iM99766y8 = AbstractC32073e.m99766y(cursorQuery, "role");
                    int iM99766y9 = AbstractC32073e.m99766y(cursorQuery, "joinedAt");
                    int iM99766y10 = AbstractC32073e.m99766y(cursorQuery, "leftAt");
                    int iM99766y11 = AbstractC32073e.m99766y(cursorQuery, "roomName");
                    int iM99766y12 = AbstractC32073e.m99766y(cursorQuery, "sessionStartedAt");
                    int iM99766y13 = AbstractC32073e.m99766y(cursorQuery, "userData");
                    int iM99766y14 = AbstractC32073e.m99766y(cursorQuery, "userName");
                    try {
                        int iM99766y15 = AbstractC32073e.m99766y(cursorQuery, "templateId");
                        int i13 = iM99766y6;
                        int iM99766y16 = AbstractC32073e.m99766y(cursorQuery, "sessionId");
                        int i14 = iM99766y5;
                        int iM99766y17 = AbstractC32073e.m99766y(cursorQuery, "websocketUrl");
                        int i15 = iM99766y4;
                        int i16 = iM99766y3;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            if (cursorQuery.isNull(iM99766y7) && cursorQuery.isNull(iM99766y8) && cursorQuery.isNull(iM99766y9) && cursorQuery.isNull(iM99766y10) && cursorQuery.isNull(iM99766y11) && cursorQuery.isNull(iM99766y12) && cursorQuery.isNull(iM99766y13) && cursorQuery.isNull(iM99766y14) && cursorQuery.isNull(iM99766y15) && cursorQuery.isNull(iM99766y16)) {
                                analyticsPeer = null;
                            } else {
                                analyticsPeer = new AnalyticsPeer(cursorQuery.isNull(iM99766y7) ? null : cursorQuery.getString(iM99766y7), cursorQuery.isNull(iM99766y8) ? null : cursorQuery.getString(iM99766y8), cursorQuery.isNull(iM99766y9) ? null : Long.valueOf(cursorQuery.getLong(iM99766y9)), cursorQuery.isNull(iM99766y10) ? null : Long.valueOf(cursorQuery.getLong(iM99766y10)), cursorQuery.isNull(iM99766y11) ? null : cursorQuery.getString(iM99766y11), cursorQuery.isNull(iM99766y12) ? null : Long.valueOf(cursorQuery.getLong(iM99766y12)), cursorQuery.isNull(iM99766y13) ? null : cursorQuery.getString(iM99766y13), cursorQuery.isNull(iM99766y14) ? null : cursorQuery.getString(iM99766y14), cursorQuery.isNull(iM99766y15) ? null : cursorQuery.getString(iM99766y15), cursorQuery.isNull(iM99766y16) ? null : cursorQuery.getString(iM99766y16));
                            }
                            if (cursorQuery.isNull(iM99766y17)) {
                                iM99766y15 = iM99766y15;
                                analyticsCluster = null;
                            } else {
                                analyticsCluster = new AnalyticsCluster(cursorQuery.isNull(iM99766y17) ? null : cursorQuery.getString(iM99766y17));
                            }
                            AnalyticsEntityModel analyticsEntityModel = new AnalyticsEntityModel();
                            int i17 = iM99766y17;
                            int i18 = iM99766y16;
                            analyticsEntityModel.setTimestamp(cursorQuery.getLong(iM99766y));
                            analyticsEntityModel.setEventId(cursorQuery.isNull(iM99766y2) ? null : cursorQuery.getString(iM99766y2));
                            int i19 = i16;
                            analyticsEntityModel.setPayload(TypeConverter.toHashMap(cursorQuery.isNull(i19) ? null : cursorQuery.getString(i19)));
                            int i24 = i15;
                            analyticsEntityModel.setEventName(cursorQuery.isNull(i24) ? null : cursorQuery.getString(i24));
                            int i25 = i14;
                            analyticsEntityModel.setToken(cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25));
                            int i26 = i13;
                            analyticsEntityModel.setQa(cursorQuery.getInt(i26) != 0);
                            analyticsEntityModel.setAnalyticsPeer(analyticsPeer);
                            analyticsEntityModel.setAnalyticsCluster(analyticsCluster);
                            arrayList.add(analyticsEntityModel);
                            i13 = i26;
                            i14 = i25;
                            iM99766y = iM99766y;
                            iM99766y14 = iM99766y14;
                            iM99766y15 = iM99766y15;
                            i16 = i19;
                            i15 = i24;
                            iM99766y16 = i18;
                            iM99766y17 = i17;
                        }
                        cursorQuery.close();
                        c1813n1M92118h.m5448k();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        callableC241337 = this;
                        cursorQuery.close();
                        c1813n1M92118h.m5448k();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }, interfaceC30057d);
    }
}
