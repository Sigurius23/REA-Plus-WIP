package p92;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.data.local.room.dao.wipeable.GpsDao;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.data.local.room.entity.GpsMetaDataDto;
import com.whoop.data.remote.commons.AppExecutors;
import io.sentry.android.core.RunnableC20151r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lp92/c;", "", "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "gpsDao", "Lcom/whoop/data/remote/commons/AppExecutors;", "appExecutors", "<init>", "(Lcom/whoop/data/local/room/dao/wipeable/GpsDao;Lcom/whoop/data/remote/commons/AppExecutors;)V", "Lcom/whoop/data/local/room/entity/GpsDto;", "gpsDto", "Ll83/a0;", "g", "(Lcom/whoop/data/local/room/entity/GpsDto;)V", "Lp92/h$a;", "routePoint", "k", "(Lp92/h$a;)V", "", "start", "end", "i", "(JJ)V", "d", "Landroidx/lifecycle/p0;", "", "f", "(JJ)Landroidx/lifecycle/p0;", "a", "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "getGpsDao", "()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "b", "Lcom/whoop/data/remote/commons/AppExecutors;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29014c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GpsDao gpsDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AppExecutors appExecutors;

    public C29014c(GpsDao gpsDao, AppExecutors appExecutors) {
        AbstractC22676k.m65750j(gpsDao, "gpsDao");
        AbstractC22676k.m65750j(appExecutors, "appExecutors");
        this.gpsDao = gpsDao;
        this.appExecutors = appExecutors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m88160e(C29014c c29014c, long j7, long j13) {
        c29014c.gpsDao.removeGpsData(j7, j13);
    }

    /* JADX INFO: renamed from: g */
    private final void m88161g(GpsDto gpsDto) {
        this.appExecutors.getDiskIO().execute(new RunnableC20151r0(26, this, gpsDto));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m88162h(C29014c c29014c, GpsDto gpsDto) {
        c29014c.gpsDao.saveGpsDto(gpsDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m88163j(C29014c c29014c, long j7, long j13) {
        c29014c.gpsDao.saveGpsMetaData(new GpsMetaDataDto(j7, j13));
    }

    /* JADX INFO: renamed from: d */
    public final void m88164d(long start, long end) {
        this.appExecutors.getDiskIO().execute(new RunnableC29013b(this, start, end, 0));
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1615p0 m88165f(long start, long end) {
        return this.gpsDao.getGpsLiveData(start, end);
    }

    /* JADX INFO: renamed from: i */
    public final void m88166i(long start, long end) {
        this.appExecutors.getDiskIO().execute(new RunnableC29013b(this, start, end, 1));
    }

    /* JADX INFO: renamed from: k */
    public final void m88167k(C29019h.a routePoint) {
        AbstractC22676k.m65750j(routePoint, "routePoint");
        m88161g(new GpsDto(routePoint.getTime(), routePoint.getLocation().getLatitude(), routePoint.getLocation().getLongitude(), routePoint.getLocation().getAltitude(), routePoint.getLocation().getAccuracy(), routePoint.getLocation().getVerticalAccuracyMeters()));
    }
}
