.class public final Lcom/whoop/domain/model/teams/TeamUserListing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008N\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00f3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\"\u0010#J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0006H\u00c6\u0003J\t\u0010L\u001a\u00020\u0008H\u00c6\u0003J\t\u0010M\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010P\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\t\u0010Q\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010V\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010X\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0018H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010`\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u00ac\u0002\u0010b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010cJ\u0014\u0010d\u001a\u00020\u00062\u0008\u0010e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010f\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010g\u001a\u00020\u0008H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010)R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\u0008,\u0010-R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\u0008/\u0010-R\u0011\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\u00081\u00102R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00084\u00105R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\u00087\u00102R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\u00088\u00102R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00089\u00105R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\u0008:\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010)R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010F\u001a\u0004\u0008D\u0010ER\u0015\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010F\u001a\u0004\u0008G\u0010ER\u0015\u0010!\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010F\u001a\u0004\u0008H\u0010E\u00a8\u0006h"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/TeamUserListing;",
        "",
        "id",
        "",
        "rank",
        "isCurrentUser",
        "",
        "fullName",
        "",
        "userName",
        "avatarUrl",
        "dayStrain",
        "",
        "activity",
        "activityString",
        "calories",
        "recovery",
        "",
        "HRV",
        "RHR",
        "sleepPerf",
        "sleepDuration",
        "sleepDurationString",
        "privacyProfile",
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "peakActivity",
        "Lcom/whoop/ui/teams/LeaderActivityDto;",
        "createdAt",
        "updatedAt",
        "cycleDayJoined",
        "period",
        "waitingForData",
        "hasData",
        "compliant",
        "<init>",
        "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "getId",
        "()I",
        "getRank",
        "()Z",
        "getFullName",
        "()Ljava/lang/String;",
        "getUserName",
        "getAvatarUrl",
        "getDayStrain",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getActivity",
        "getActivityString",
        "getCalories",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRecovery",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getHRV",
        "getRHR",
        "getSleepPerf",
        "getSleepDuration",
        "getSleepDurationString",
        "getPrivacyProfile",
        "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "getPeakActivity",
        "()Lcom/whoop/ui/teams/LeaderActivityDto;",
        "getCreatedAt",
        "getUpdatedAt",
        "getCycleDayJoined",
        "getPeriod",
        "getWaitingForData",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHasData",
        "getCompliant",
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
        "component23",
        "component24",
        "component25",
        "copy",
        "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/TeamUserListing;",
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
.field private final HRV:Ljava/lang/Integer;

.field private final RHR:Ljava/lang/Integer;

.field private final activity:Ljava/lang/Float;

.field private final activityString:Ljava/lang/String;

.field private final avatarUrl:Ljava/lang/String;

.field private final calories:Ljava/lang/Integer;

.field private final compliant:Ljava/lang/Boolean;

.field private final createdAt:Ljava/lang/String;

.field private final cycleDayJoined:Ljava/lang/String;

.field private final dayStrain:Ljava/lang/Float;

.field private final fullName:Ljava/lang/String;

.field private final hasData:Ljava/lang/Boolean;

.field private final id:I

.field private final isCurrentUser:Z

.field private final peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

.field private final period:Ljava/lang/String;

.field private final privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

.field private final rank:I

.field private final recovery:Ljava/lang/Double;

.field private final sleepDuration:Ljava/lang/Integer;

.field private final sleepDurationString:Ljava/lang/String;

.field private final sleepPerf:Ljava/lang/Double;

.field private final updatedAt:Ljava/lang/String;

.field private final userName:Ljava/lang/String;

.field private final waitingForData:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 2

    move-object/from16 v0, p17

    const-string v1, "fullName"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "userName"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "activityString"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "privacyProfile"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    iput p2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    iput-object p4, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    iput-object p8, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    iput-object p9, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    iput-object p11, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    iput-object p12, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    iput-object p13, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    iput-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/TeamUserListing;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/TeamUserListing;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p26

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p26, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p26, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p26, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p26, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p26, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p26, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p26, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p26, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p26, v16

    if-eqz v16, :cond_18

    move-object/from16 p10, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    move-object/from16 p25, p10

    move-object/from16 p26, v1

    :goto_18
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

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

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_19

    :cond_18
    move-object/from16 p26, p25

    move-object/from16 p25, v1

    goto :goto_18

    :goto_19
    invoke-virtual/range {p1 .. p26}, Lcom/whoop/domain/model/teams/TeamUserListing;->copy(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/TeamUserListing;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    return-object v0
.end method

.method public final component12()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final component18()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component24()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component25()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    return-object v0
.end method

.method public final component8()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/TeamUserListing;
    .locals 27

    const-string v0, "fullName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityString"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/TeamUserListing;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    invoke-direct/range {v1 .. v26}, Lcom/whoop/domain/model/teams/TeamUserListing;-><init>(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/TeamUserListing;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/TeamUserListing;

    iget v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final getActivity()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    return-object v0
.end method

.method public final getActivityString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalories()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCompliant()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleDayJoined()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayStrain()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    return-object v0
.end method

.method public final getFullName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHRV()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHasData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    return v0
.end method

.method public final getPeakActivity()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final getPeriod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final getRHR()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRank()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    return v0
.end method

.method public final getRecovery()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSleepDuration()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSleepDurationString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepPerf()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final getWaitingForData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    if-nez v0, :cond_a

    move v0, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Lcom/whoop/ui/teams/LeaderActivityDto;->hashCode()I

    move-result v0

    :goto_a
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    if-nez v0, :cond_b

    move v0, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_b
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    if-nez v0, :cond_c

    move v0, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_c
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    if-nez v0, :cond_d

    move v0, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_d
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    if-nez v0, :cond_e

    move v0, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_e
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    if-nez v0, :cond_f

    move v0, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_f
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    if-nez v0, :cond_10

    move v0, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_10
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    if-nez v0, :cond_11

    goto :goto_11

    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_11
    add-int/2addr v2, v3

    return v2
.end method

.method public final isCurrentUser()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->id:I

    iget v2, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->rank:I

    iget-boolean v3, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->isCurrentUser:Z

    iget-object v4, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->fullName:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->userName:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->avatarUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->dayStrain:Ljava/lang/Float;

    iget-object v8, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->activity:Ljava/lang/Float;

    iget-object v9, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->activityString:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->calories:Ljava/lang/Integer;

    iget-object v11, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->recovery:Ljava/lang/Double;

    iget-object v12, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->HRV:Ljava/lang/Integer;

    iget-object v13, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->RHR:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepPerf:Ljava/lang/Double;

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDuration:Ljava/lang/Integer;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->sleepDurationString:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->createdAt:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->updatedAt:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->period:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->hasData:Ljava/lang/Boolean;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/TeamUserListing;->compliant:Ljava/lang/Boolean;

    const-string v0, ", rank="

    move-object/from16 v26, v15

    const-string v15, ", isCurrentUser="

    move-object/from16 v27, v14

    const-string v14, "TeamUserListing(id="

    invoke-static {v1, v2, v14, v0, v15}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fullName="

    const-string v2, ", userName="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", avatarUrl="

    const-string v2, ", dayStrain="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", calories="

    const-string v2, ", recovery="

    invoke-static {v10, v9, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", HRV="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", RHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepPerf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepDurationString="

    const-string v2, ", privacyProfile="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", peakActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", cycleDayJoined="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", period="

    const-string v2, ", waitingForData="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", hasData="

    const-string v2, ", compliant="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v1, ")"

    move-object/from16 v2, v26

    invoke-static {v0, v2, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
