.class public final Lcom/whoop/domain/model/teams/LeadersEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0006\u0010>\u001a\u00020?J\u0019\u0010@\u001a\u0004\u0018\u00010\u00032\u0008\u0010A\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010BJ\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010H\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010I\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010J\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010K\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010L\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010M\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010N\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000f\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010W\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010X\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0094\u0002\u0010Y\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010ZJ\u0014\u0010[\u001a\u00020\u001b2\u0008\u0010\\\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010]\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010^\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008&\u0010\'R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008)\u0010\'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008*\u0010\'R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008+\u0010\'R\u0015\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008,\u0010\'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008-\u0010\'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008.\u0010\'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008/\u0010\'R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010!R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u00089\u0010:R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u0008<\u0010:R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u0008=\u0010:\u00a8\u0006_"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/LeadersEntry;",
        "",
        "name",
        "",
        "id",
        "",
        "avatarUrl",
        "rank",
        "dayStrain",
        "",
        "activityStrain",
        "calories",
        "recoveryScore",
        "hrv",
        "rhr",
        "sleepDuration",
        "sleepPerformance",
        "activities",
        "",
        "Lcom/whoop/ui/teams/LeaderActivityDto;",
        "peakActivity",
        "createdAt",
        "updatedAt",
        "cycleDayJoined",
        "period",
        "during",
        "waitingForData",
        "",
        "hasData",
        "compliant",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "getName",
        "()Ljava/lang/String;",
        "getId",
        "()I",
        "getAvatarUrl",
        "getRank",
        "getDayStrain",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getActivityStrain",
        "getCalories",
        "getRecoveryScore",
        "getHrv",
        "getRhr",
        "getSleepDuration",
        "getSleepPerformance",
        "getActivities",
        "()Ljava/util/List;",
        "getPeakActivity",
        "()Lcom/whoop/ui/teams/LeaderActivityDto;",
        "getCreatedAt",
        "getUpdatedAt",
        "getCycleDayJoined",
        "getPeriod",
        "getDuring",
        "getWaitingForData",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHasData",
        "getCompliant",
        "toTeamUserListing",
        "Lcom/whoop/domain/model/teams/TeamUserListing;",
        "getSleepDurationString",
        "duration",
        "(Ljava/lang/Double;)Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/LeadersEntry;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final activities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation
.end field

.field private final activityStrain:Ljava/lang/Double;

.field private final avatarUrl:Ljava/lang/String;

.field private final calories:Ljava/lang/Double;

.field private final compliant:Ljava/lang/Boolean;

.field private final createdAt:Ljava/lang/String;

.field private final cycleDayJoined:Ljava/lang/String;

.field private final dayStrain:Ljava/lang/Double;

.field private final during:Ljava/lang/String;

.field private final hasData:Ljava/lang/Boolean;

.field private final hrv:Ljava/lang/Double;

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

.field private final period:Ljava/lang/String;

.field private final rank:I

.field private final recoveryScore:Ljava/lang/Double;

.field private final rhr:Ljava/lang/Double;

.field private final sleepDuration:Ljava/lang/Double;

.field private final sleepPerformance:Ljava/lang/Double;

.field private final updatedAt:Ljava/lang/String;

.field private final waitingForData:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 25

    .line 1
    const v23, 0x3fffff

    const/16 v24, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v24}, Lcom/whoop/domain/model/teams/LeadersEntry;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activities"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    .line 7
    iput-object p5, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    .line 8
    iput-object p6, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    .line 12
    iput-object p10, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    .line 13
    iput-object p11, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    .line 14
    iput-object p12, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    .line 15
    iput-object p13, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    move-object p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 25
    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    .line 26
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v4, v0, 0x4000

    if-eqz v4, :cond_e

    const/4 v4, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v4, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    .line 27
    sget-object v20, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    .line 28
    sget-object v21, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v0, v0, v22

    if-eqz v0, :cond_15

    .line 29
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 p23, v0

    :goto_15
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p16, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    goto :goto_15

    .line 30
    :goto_16
    invoke-direct/range {p1 .. p23}, Lcom/whoop/domain/model/teams/LeadersEntry;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/ui/teams/LeaderActivityDto;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/whoop/domain/model/teams/LeadersEntry;->toTeamUserListing$lambda$0(Lcom/whoop/ui/teams/LeaderActivityDto;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/LeadersEntry;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/LeadersEntry;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lcom/whoop/domain/model/teams/LeadersEntry;->copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/LeadersEntry;

    move-result-object v0

    return-object v0
.end method

.method private final getSleepDurationString(Ljava/lang/Double;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-int p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const-wide/32 v1, 0x36ee80

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v3

    int-to-long v3, v3

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    if-eqz p1, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    mul-long/2addr v6, v1

    sub-long/2addr v4, v6

    const-wide/32 v1, 0xea60

    div-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    if-eqz v3, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v4, 0xa

    cmp-long v0, v0, v4

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method

.method private static final toTeamUserListing$lambda$0(Lcom/whoop/ui/teams/LeaderActivityDto;)Ljava/lang/CharSequence;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ui/teams/LeaderActivityDto;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/ui/teams/LeaderActivityDto;->getStrain()D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object p0

    const-string v1, " "

    invoke-static {v0, v1, p0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    return-object v0
.end method

.method public final component11()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    return-object v0
.end method

.method public final component12()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    return v0
.end method

.method public final component20()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component21()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component22()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    return v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/LeadersEntry;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/domain/model/teams/LeadersEntry;"
        }
    .end annotation

    const-string v0, "name"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activities"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/LeadersEntry;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    invoke-direct/range {v1 .. v23}, Lcom/whoop/domain/model/teams/LeadersEntry;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/LeadersEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/LeadersEntry;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    iget v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getActivities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    return-object v0
.end method

.method public final getActivityStrain()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalories()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCompliant()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleDayJoined()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayStrain()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHrv()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeakActivity()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final getPeriod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final getRank()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    return v0
.end method

.method public final getRecoveryScore()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final getRhr()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSleepDuration()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSleepPerformance()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getWaitingForData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/ui/teams/LeaderActivityDto;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    if-nez v1, :cond_11

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_11
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    iget v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    iget-object v3, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    iget v4, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    iget-object v5, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    iget-object v6, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    iget-object v7, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    iget-object v8, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    iget-object v9, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    iget-object v10, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    iget-object v11, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    iget-object v12, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    iget-object v13, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->during:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    const-string v0, ", id="

    move-object/from16 v23, v15

    const-string v15, ", avatarUrl="

    move-object/from16 v24, v14

    const-string v14, "LeadersEntry(name="

    invoke-static {v2, v14, v1, v0, v15}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rank="

    const-string v2, ", dayStrain="

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", activityStrain="

    const-string v2, ", calories="

    invoke-static {v0, v5, v1, v6, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", recoveryScore="

    const-string v2, ", hrv="

    invoke-static {v0, v7, v1, v8, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", rhr="

    const-string v2, ", sleepDuration="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", sleepPerformance="

    const-string v2, ", activities="

    invoke-static {v0, v11, v1, v12, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", peakActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", cycleDayJoined="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", period="

    const-string v2, ", during="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", waitingForData="

    const-string v2, ", hasData="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", compliant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTeamUserListing()Lcom/whoop/domain/model/teams/TeamUserListing;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activities:Ljava/util/List;

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Lsc2/n;

    const/4 v1, 0x2

    invoke-direct {v6, v1}, Lsc2/n;-><init>(I)V

    const/16 v7, 0x1e

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v11, v1

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/ui/teams/LeaderActivityDto;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    invoke-virtual {v2}, Lcom/whoop/ui/teams/LeaderActivityDto;->getStrain()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object v2

    const-string v3, " "

    invoke-static {v1, v3, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    goto :goto_0

    :goto_1
    new-instance v19, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    const/16 v22, 0x1ff

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v12, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v12 .. v23}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget v3, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->id:I

    iget v4, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rank:I

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->g()Lod1/u;

    move-result-object v1

    invoke-virtual {v1}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-ne v3, v1, :cond_3

    const/4 v2, 0x1

    :cond_3
    move v5, v2

    iget-object v6, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->name:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->avatarUrl:Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->dayStrain:Ljava/lang/Double;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    double-to-float v1, v9

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object v9, v1

    goto :goto_3

    :cond_4
    const/4 v9, 0x0

    :goto_3
    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->calories:Ljava/lang/Double;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    goto :goto_4

    :cond_5
    const-wide/16 v13, 0x0

    :goto_4
    invoke-static {v13, v14}, Le93/b;->W(D)I

    move-result v1

    iget-object v13, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->recoveryScore:Ljava/lang/Double;

    iget-object v7, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hrv:Ljava/lang/Double;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    const/16 v7, 0x3e8

    move v10, v3

    int-to-double v2, v7

    mul-double/2addr v14, v2

    double-to-int v2, v14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v14, v2

    goto :goto_5

    :cond_6
    move v10, v3

    const/4 v14, 0x0

    :goto_5
    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->rhr:Ljava/lang/Double;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v15, v2

    goto :goto_6

    :cond_7
    const/4 v15, 0x0

    :goto_6
    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepPerformance:Ljava/lang/Double;

    iget-object v3, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    move v7, v1

    move-object/from16 v17, v2

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    :goto_7
    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->sleepDuration:Ljava/lang/Double;

    invoke-direct {v0, v2}, Lcom/whoop/domain/model/teams/LeadersEntry;->getSleepDurationString(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v18

    iget-object v2, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->activityStrain:Ljava/lang/Double;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_8

    :cond_9
    const/4 v2, 0x0

    :goto_8
    iget-object v3, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->period:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->createdAt:Ljava/lang/String;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->updatedAt:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->hasData:Ljava/lang/Boolean;

    move-object/from16 v26, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/LeadersEntry;->compliant:Ljava/lang/Boolean;

    move-object/from16 v24, v3

    move v3, v10

    move-object v10, v2

    new-instance v2, Lcom/whoop/domain/model/teams/TeamUserListing;

    move/from16 v19, v7

    const-string v7, "???"

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    move-object/from16 v27, v19

    move-object/from16 v19, v12

    move-object/from16 v12, v27

    move-object/from16 v27, v17

    move-object/from16 v17, v16

    move-object/from16 v16, v27

    move-object/from16 v27, v1

    invoke-direct/range {v2 .. v27}, Lcom/whoop/domain/model/teams/TeamUserListing;-><init>(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v2
.end method
