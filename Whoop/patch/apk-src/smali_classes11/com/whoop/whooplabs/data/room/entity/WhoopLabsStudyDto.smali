.class public final Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;,
        Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 V2\u00020\u0001:\u0002VWBu\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0092\u0001\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010 J\u0010\u00100\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00103\u001a\u00020\u00082\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010>\u0012\u0004\u0008@\u0010A\u001a\u0004\u0008?\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010>\u0012\u0004\u0008C\u0010A\u001a\u0004\u0008B\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010D\u0012\u0004\u0008F\u0010A\u001a\u0004\u0008E\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010D\u001a\u0004\u0008G\u0010 R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010H\u0012\u0004\u0008J\u0010A\u001a\u0004\u0008I\u0010#R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010K\u001a\u0004\u0008L\u0010%R&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010M\u0012\u0004\u0008O\u0010A\u001a\u0004\u0008N\u0010\'R&\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010M\u0012\u0004\u0008Q\u0010A\u001a\u0004\u0008P\u0010\'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010R\u001a\u0004\u0008S\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010T\u001a\u0004\u0008U\u0010,\u00a8\u0006X"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
        "",
        "Ljava/util/Date;",
        "startTime",
        "endTime",
        "",
        "activity",
        "deviceName",
        "",
        "hrDeviceConnected",
        "",
        "",
        "campaignIds",
        "",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
        "studyTags",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
        "protocolStepResults",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "session",
        "",
        "strapBacklog",
        "<init>",
        "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/Date;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "()Z",
        "component6",
        "()[Ljava/lang/Integer;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "component9",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "component10",
        "()Ljava/lang/Long;",
        "copy",
        "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/Date;",
        "getStartTime",
        "getStartTime$annotations",
        "()V",
        "getEndTime",
        "getEndTime$annotations",
        "Ljava/lang/String;",
        "getActivity",
        "getActivity$annotations",
        "getDeviceName",
        "Z",
        "getHrDeviceConnected",
        "getHrDeviceConnected$annotations",
        "[Ljava/lang/Integer;",
        "getCampaignIds",
        "Ljava/util/List;",
        "getStudyTags",
        "getStudyTags$annotations",
        "getProtocolStepResults",
        "getProtocolStepResults$annotations",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "getSession",
        "Ljava/lang/Long;",
        "getStrapBacklog",
        "Companion",
        "$serializer",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;


# instance fields
.field private final activity:Ljava/lang/String;

.field private final campaignIds:[Ljava/lang/Integer;

.field private final deviceName:Ljava/lang/String;

.field private final endTime:Ljava/util/Date;

.field private final hrDeviceConnected:Z

.field private final protocolStepResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
            ">;"
        }
    .end annotation
.end field

.field private final session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

.field private final startTime:Ljava/util/Date;

.field private final strapBacklog:Ljava/lang/Long;

.field private final studyTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->Companion:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lgw1/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lgw1/a;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lgw1/a;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xa

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v1, v5, v6

    const/4 v6, 0x5

    aput-object v3, v5, v6

    const/4 v3, 0x6

    aput-object v4, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;

    invoke-virtual {p12}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    iput-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z[",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
            ">;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const-string v0, "campaignIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "studyTags"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolStepResults"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    .line 12
    iput-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/ReferenceArraySerializer;

    const-class v1, Ljava/lang/Integer;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/ReferenceArraySerializer;-><init>(Lj93/d;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->copy(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivity$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "study_type"
    .end annotation

    return-void
.end method

.method public static synthetic getEndTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "end"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getHrDeviceConnected$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "external_device_connected"
    .end annotation

    return-void
.end method

.method public static synthetic getProtocolStepResults$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "steps"
    .end annotation

    return-void
.end method

.method public static synthetic getStartTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "start"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getStudyTags$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "user_timestamps"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lu82/b;->a:Lu82/b;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    return-object v0
.end method

.method public final component10()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    return v0
.end method

.method public final component6()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    return-object v0
.end method

.method public final copy(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z[",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
            ">;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
            "Ljava/lang/Long;",
            ")",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;"
        }
    .end annotation

    const-string v0, "campaignIds"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "studyTags"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolStepResults"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getActivity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaignIds()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDeviceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTime()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public final getHrDeviceConnected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    return v0
.end method

.method public final getProtocolStepResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    return-object v0
.end method

.method public final getSession()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    return-object v0
.end method

.method public final getStartTime()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    return-object v0
.end method

.method public final getStrapBacklog()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    return-object v0
.end method

.method public final getStudyTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->startTime:Ljava/util/Date;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->endTime:Ljava/util/Date;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->activity:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->deviceName:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->hrDeviceConnected:Z

    iget-object v5, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->campaignIds:[Ljava/lang/Integer;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->studyTags:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->protocolStepResults:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;->strapBacklog:Ljava/lang/Long;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "WhoopLabsStudyDto(startTime="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endTime="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activity="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceName="

    const-string v1, ", hrDeviceConnected="

    invoke-static {v10, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", campaignIds="

    const-string v1, ", studyTags="

    invoke-static {v10, v4, v0, v5, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", protocolStepResults="

    const-string v1, ", session="

    invoke-static {v10, v6, v0, v7, v1}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strapBacklog="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
