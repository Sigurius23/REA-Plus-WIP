package live.hms.video.database;

import android.content.Context;
import androidx.room.AbstractC1848z0;
import androidx.room.C1818p0;
import hc3.AbstractC17176i;
import live.hms.video.database.dao.AnalyticsEventsDao;
import p249jc.AbstractC21598x;
import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llive/hms/video/database/EventsDatabase;", "Landroidx/room/z0;", "<init>", "()V", "Llive/hms/video/database/dao/AnalyticsEventsDao;", "logDao", "()Llive/hms/video/database/dao/AnalyticsEventsDao;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class EventsDatabase extends AbstractC1848z0 {
    private static volatile EventsDatabase INSTANCE = null;
    public static final String TABLE_NAME = "analytics_table";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbstractC25380b MIGRATION_1_2 = new AbstractC25380b() { // from class: live.hms.video.database.EventsDatabase$Companion$MIGRATION_1_2$1
        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("ALTER TABLE analytics_table ADD COLUMN isQa INTEGER DEFAULT 0 NOT NULL");
        }
    };
    private static final AbstractC25380b MIGRATION_2_3 = new AbstractC25380b() { // from class: live.hms.video.database.EventsDatabase$Companion$MIGRATION_2_3$1
        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC17176i.m48517s(database, "database", "CREATE TABLE IF NOT EXISTS `temp_analytics_table` (`timestamp` INTEGER NOT NULL, `eventId` TEXT NOT NULL, `payload` TEXT NOT NULL, `eventName` TEXT NOT NULL, `token` TEXT NOT NULL, `isQa` INTEGER NOT NULL, `peerId` TEXT, `role` TEXT, `joinedAt` INTEGER, `leftAt` INTEGER, `roomName` TEXT, `sessionStartedAt` INTEGER, `userData` TEXT, `userName` TEXT, `templateId` TEXT, `sessionId` TEXT, PRIMARY KEY(`eventId`))", "INSERT INTO `temp_analytics_table` (timestamp, eventId, payload, eventName, token, isQa, peerId, role, joinedAt, leftAt, roomName, sessionStartedAt, userData, userName, templateId, sessionId) SELECT timestamp as timeStamp,eventId as eventId,payload as payload,eventName as eventName,token as token,isQa as isQa,peerId as peerId,null as role,null as joinedAt,null as leftAt,null as roomName,null as sessionStartedAt,null as userData,null as userName,null as templateId,sessionId as sessionId FROM analytics_table ", "DROP TABLE analytics_table");
            database.mo109660E("ALTER TABLE `temp_analytics_table` RENAME TO analytics_table");
        }
    };
    private static final AbstractC25380b MIGRATION_3_4 = new AbstractC25380b() { // from class: live.hms.video.database.EventsDatabase$Companion$MIGRATION_3_4$1
        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("ALTER TABLE analytics_table ADD COLUMN `websocketUrl` TEXT");
        }
    };

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/database/EventsDatabase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "dbName", "Llive/hms/video/database/EventsDatabase;", "getInstance", "(Landroid/content/Context;Ljava/lang/String;)Llive/hms/video/database/EventsDatabase;", "Lmb/b;", "MIGRATION_1_2", "Lmb/b;", "getMIGRATION_1_2", "()Lmb/b;", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "TABLE_NAME", "Ljava/lang/String;", "INSTANCE", "Llive/hms/video/database/EventsDatabase;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ EventsDatabase getInstance$default(Companion companion, Context context, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = EventsDatabase.TABLE_NAME;
            }
            return companion.getInstance(context, str);
        }

        public final EventsDatabase getInstance(Context context, String dbName) {
            EventsDatabase eventsDatabase;
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(dbName, "dbName");
            EventsDatabase eventsDatabase2 = EventsDatabase.INSTANCE;
            if (eventsDatabase2 != null) {
                return eventsDatabase2;
            }
            synchronized (this) {
                C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(context, EventsDatabase.class, dbName);
                c1818p0M60645C.m5449a(getMIGRATION_1_2(), getMIGRATION_2_3(), getMIGRATION_3_4());
                EventsDatabase.INSTANCE = (EventsDatabase) c1818p0M60645C.m5450b();
                eventsDatabase = EventsDatabase.INSTANCE;
                AbstractC22676k.m65747g(eventsDatabase);
            }
            return eventsDatabase;
        }

        public final AbstractC25380b getMIGRATION_1_2() {
            return EventsDatabase.MIGRATION_1_2;
        }

        public final AbstractC25380b getMIGRATION_2_3() {
            return EventsDatabase.MIGRATION_2_3;
        }

        public final AbstractC25380b getMIGRATION_3_4() {
            return EventsDatabase.MIGRATION_3_4;
        }

        private Companion() {
        }
    }

    public abstract AnalyticsEventsDao logDao();
}
