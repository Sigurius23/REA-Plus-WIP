package vr2;

import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.domain.model.event.LoggableEvent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import nf3.C26669a;
import of3.InterfaceC27903a;
import or2.C28185n1;
import or2.C28212w1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p222ij.RunnableC18575a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import rr2.InterfaceC31766c;
import tr2.C34107e;
import tr2.C34110h;
import tr2.C34112j;
import tr2.InterfaceC34108f;
import tr2.InterfaceC34113k;

/* JADX INFO: renamed from: vr2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b,\u0010-*\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lvr2/b;", "Lof3/a;", "Ltr2/k;", "Ltr2/f;", "logEventsDao", "Lcom/whoop/data/remote/commons/AppExecutors;", "appExecutors", "Lrr2/c;", "crashReporter", "Ltr2/j;", "logLineCreator", "<init>", "(Ltr2/f;Lcom/whoop/data/remote/commons/AppExecutors;Lrr2/c;Ltr2/j;)V", "Lorg/joda/time/DateTime;", "utcDateTime", "localDateTime", "", "logMessage", "Ll83/a0;", "e", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "", "timestamp", "d", "(J)Lorg/joda/time/DateTime;", "Lcom/whoop/domain/model/event/LoggableEvent;", NotificationCompat.CATEGORY_EVENT, "a", "(Lcom/whoop/domain/model/event/LoggableEvent;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/f;", "getLogEventsDao", "()Ltr2/f;", "x", "Lcom/whoop/data/remote/commons/AppExecutors;", "y", "Lrr2/c;", "z", "Ltr2/j;", "Ltr2/e;", "E", "Ltr2/e;", "logDistributor", "", "c", "()I", "getUserId$delegate", "(Lvr2/b;)Ljava/lang/Object;", "userId", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36309b implements InterfaceC27903a, InterfaceC34113k {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f155650F = {AbstractC22671h0.f89337a.property1(new C22693x(C36309b.class, "userId", "getUserId()I", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f155651G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C34107e logDistributor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34108f logEventsDao;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C34112j logLineCreator;

    public C36309b(InterfaceC34108f logEventsDao, AppExecutors appExecutors, InterfaceC31766c crashReporter, C34112j logLineCreator) {
        AbstractC22676k.m65750j(logEventsDao, "logEventsDao");
        AbstractC22676k.m65750j(appExecutors, "appExecutors");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(logLineCreator, "logLineCreator");
        this.logEventsDao = logEventsDao;
        this.appExecutors = appExecutors;
        this.crashReporter = crashReporter;
        this.logLineCreator = logLineCreator;
        C34107e c34107e = (C34107e) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34107e.class), null);
        this.logDistributor = c34107e;
        C28212w1 c28212w1 = C28212w1.f113986w;
        c34107e.m107806y(this);
    }

    /* JADX INFO: renamed from: c */
    private final int m116094c() {
        return C28212w1.f113986w.getValue(this, f155650F[0]).intValue();
    }

    /* JADX INFO: renamed from: d */
    private final DateTime m116095d(long timestamp) {
        return new DateTime(timestamp, DateTimeZone.UTC);
    }

    /* JADX INFO: renamed from: e */
    private final void m116096e(DateTime utcDateTime, DateTime localDateTime, String logMessage) {
        this.appExecutors.getDiskIO().execute(new RunnableC18575a(this, utcDateTime, localDateTime, logMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m116097f(C36309b c36309b, DateTime dateTime, DateTime dateTime2, String str) {
        try {
            c36309b.logEventsDao.mo107812f(new C34110h(Integer.valueOf(c36309b.m116094c()), dateTime.toString(), dateTime2.toString(), str));
        } catch (SQLiteFullException e5) {
            int iCount = c36309b.logEventsDao.count();
            long jM85308a = C28185n1.f113906a.m85308a();
            c36309b.logEventsDao.deleteAll();
            StringBuilder sb4 = new StringBuilder("Deleted everything (");
            sb4.append(iCount);
            sb4.append(" rows) from log table since device has ");
            c36309b.crashReporter.mo98626g(e5, AbstractC11266d.m30457k(jM85308a, " mb of free space!!", sb4));
        } catch (SQLiteException e13) {
            InterfaceC31766c.m98634e(c36309b.crashReporter, e13, null, 2, null);
        }
    }

    @Override // tr2.InterfaceC34113k
    /* JADX INFO: renamed from: a */
    public void mo107800a(LoggableEvent event) {
        AbstractC22676k.m65750j(event, "event");
        m116096e(m116095d(event.timestamp), new DateTime(event.timestamp), this.logLineCreator.m107841a(event));
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
