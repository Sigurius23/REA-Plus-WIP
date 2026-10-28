.class public abstract Lcom/whoop/data/local/room/WhoopDatabase;
.super Landroidx/room/z0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/data/local/room/WhoopDatabase;",
        "Landroidx/room/z0;",
        "<init>",
        "()V",
        "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;",
        "teamsDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;",
        "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;",
        "journalDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/JournalDao;",
        "Ltr2/f;",
        "logEventsDao",
        "()Ltr2/f;",
        "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "gpsDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;",
        "teamsInviteDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;",
        "Lyt0/a;",
        "consolePacketsDao",
        "()Lyt0/a;",
        "Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;",
        "featureTeamDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;",
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "rawDataDao",
        "()Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;",
        "memberStoryDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;",
        "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;",
        "smartAlarmDiagnosticDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract consolePacketsDao()Lyt0/a;
.end method

.method public abstract featureTeamDao()Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;
.end method

.method public abstract gpsDao()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;
.end method

.method public abstract journalDao()Lcom/whoop/data/local/room/dao/wipeable/JournalDao;
.end method

.method public abstract logEventsDao()Ltr2/f;
.end method

.method public abstract memberStoryDao()Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;
.end method

.method public abstract rawDataDao()Lcom/whoop/data/local/room/dao/persistent/RawDataDao;
.end method

.method public abstract smartAlarmDiagnosticDao()Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;
.end method

.method public abstract teamsDao()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;
.end method

.method public abstract teamsInviteDao()Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;
.end method
