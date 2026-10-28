.class public final Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_2_3$1;
.super Lmb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/database/EventsDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/video/database/EventsDatabase$Companion$MIGRATION_2_3$1",
        "Lmb/b;",
        "Lub/a;",
        "database",
        "Ll83/a0;",
        "migrate",
        "(Lub/a;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 4

    const-string v0, "INSERT INTO `temp_analytics_table` (timestamp, eventId, payload, eventName, token, isQa, peerId, role, joinedAt, leftAt, roomName, sessionStartedAt, userData, userName, templateId, sessionId) SELECT timestamp as timeStamp,eventId as eventId,payload as payload,eventName as eventName,token as token,isQa as isQa,peerId as peerId,null as role,null as joinedAt,null as leftAt,null as roomName,null as sessionStartedAt,null as userData,null as userName,null as templateId,sessionId as sessionId FROM analytics_table "

    const-string v1, "DROP TABLE analytics_table"

    const-string v2, "database"

    const-string v3, "CREATE TABLE IF NOT EXISTS `temp_analytics_table` (`timestamp` INTEGER NOT NULL, `eventId` TEXT NOT NULL, `payload` TEXT NOT NULL, `eventName` TEXT NOT NULL, `token` TEXT NOT NULL, `isQa` INTEGER NOT NULL, `peerId` TEXT, `role` TEXT, `joinedAt` INTEGER, `leftAt` INTEGER, `roomName` TEXT, `sessionStartedAt` INTEGER, `userData` TEXT, `userName` TEXT, `templateId` TEXT, `sessionId` TEXT, PRIMARY KEY(`eventId`))"

    invoke-static {p1, v2, v3, v0, v1}, Lhc3/i;->s(Lub/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `temp_analytics_table` RENAME TO analytics_table"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
