.class public final Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;,
        Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002XWB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00b3\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0015\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010\u001fJ\u0010\u00100\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010#J\u00b6\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010\u001fJ\u0010\u00104\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010#J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008E\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010F\u001a\u0004\u0008G\u0010#R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008H\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008I\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010F\u001a\u0004\u0008J\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008K\u0010\u001fR\u001a\u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008L\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008M\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008N\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010B\u001a\u0004\u0008O\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010B\u001a\u0004\u0008P\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010B\u001a\u0004\u0008Q\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010B\u001a\u0004\u0008R\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010B\u001a\u0004\u0008S\u0010\u001fR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010F\u0012\u0004\u0008U\u0010V\u001a\u0004\u0008T\u0010#\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
        "",
        "",
        "id",
        "",
        "cycleId",
        "",
        "userId",
        "createdAt",
        "updatedAt",
        "version",
        "during",
        "timezone",
        "timezoneOffset",
        "source",
        "scoreState",
        "scoreType",
        "type",
        "translatedType",
        "sourceId",
        "activityV1Id",
        "<init>",
        "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/service/network/model/cycles/SleepActivity;",
        "toSleepActivity",
        "()Lcom/whoop/service/network/model/cycles/SleepActivity;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()J",
        "component3",
        "()I",
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
        "copy",
        "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "J",
        "getCycleId",
        "I",
        "getUserId",
        "getCreatedAt",
        "getUpdatedAt",
        "getVersion",
        "getDuring",
        "getTimezone",
        "getTimezoneOffset",
        "getSource",
        "getScoreState",
        "getScoreType",
        "getType",
        "getTranslatedType",
        "getSourceId",
        "getActivityV1Id",
        "getActivityV1Id$annotations",
        "()V",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;


# instance fields
.field private final activityV1Id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activity_v1_id"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final cycleId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_id"
    .end annotation
.end field

.field private final during:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "during"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final scoreState:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score_state"
    .end annotation
.end field

.field private final scoreType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score_type"
    .end annotation
.end field

.field private final source:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "source"
    .end annotation
.end field

.field private final sourceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "source_id"
    .end annotation
.end field

.field private final timezone:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timezone"
    .end annotation
.end field

.field private final timezoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timezone_offset"
    .end annotation
.end field

.field private final translatedType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "translated_type"
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final userId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final version:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->Companion:Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->INSTANCE:Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    iput p5, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    iput p8, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    iput-object p9, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    move/from16 p1, p18

    iput p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    move-object v0, p8

    move-object/from16 v1, p9

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object/from16 v5, p14

    const-string v6, "id"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "createdAt"

    invoke-static {p5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "updatedAt"

    invoke-static {p6, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "during"

    invoke-static {p8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "timezone"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "source"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "scoreState"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "scoreType"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "type"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    .line 5
    iput p4, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    .line 6
    iput-object p5, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    .line 9
    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    .line 10
    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    move-object/from16 p1, p10

    .line 11
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    .line 12
    iput-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    .line 13
    iput-object v3, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    .line 14
    iput-object v4, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    .line 15
    iput-object v5, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    move/from16 p18, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, v2

    move-wide/from16 p3, v3

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move/from16 p18, p17

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->copy(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getActivityV1Id$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_v1_id"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    iget p0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;
    .locals 19

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "during"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreState"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreType"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;-><init>(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    iget-wide v5, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    iget v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    iget v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    iget p1, p1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getActivityV1Id()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    return-wide v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimezone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimezoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslatedType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    return v0
.end method

.method public final getVersion()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toSleepActivity()Lcom/whoop/service/network/model/cycles/SleepActivity;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    const-string v2, "["

    invoke-static {v1, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ")"

    invoke-static {v1, v2}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "\'"

    invoke-static {v3, v4, v4}, Lyb3/r;->t0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v2

    new-instance v8, Lcom/whoop/service/network/model/cycles/Period;

    invoke-direct {v8, v1, v2}, Lcom/whoop/service/network/model/cycles/Period;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    iget-object v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    invoke-static {v2}, Lorg/joda/time/DateTimeZone;->forID(Ljava/lang/String;)Lorg/joda/time/DateTimeZone;

    move-result-object v2

    invoke-virtual {v1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lorg/joda/time/DateTimeZone;->getOffset(J)I

    move-result v1

    const v2, 0x36ee80

    div-int v2, v1, v2

    const v3, 0xea60

    div-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%+03d%02d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v9, v2

    new-instance v3, Lcom/whoop/service/network/model/cycles/SleepActivity;

    iget v4, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    iget-object v5, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "nap"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v23}, Lcom/whoop/service/network/model/cycles/SleepActivity;-><init>(ILjava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V

    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->id:Ljava/lang/String;

    iget-wide v2, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->cycleId:J

    iget v4, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->userId:I

    iget-object v5, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->createdAt:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->updatedAt:Ljava/lang/String;

    iget v7, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->version:I

    iget-object v8, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->during:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezone:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->timezoneOffset:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->source:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreState:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->scoreType:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->type:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->translatedType:Ljava/lang/String;

    move-object/from16 v16, v14

    iget-object v14, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->sourceId:Ljava/lang/String;

    move-object/from16 v17, v14

    iget v14, v0, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->activityV1Id:I

    const-string v0, "SleepActivityResponseV2(id="

    move/from16 v18, v14

    const-string v14, ", cycleId="

    invoke-static {v0, v1, v2, v3, v14}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", during="

    const-string v2, ", timezone="

    invoke-static {v0, v1, v8, v2, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", timezoneOffset="

    const-string v2, ", source="

    invoke-static {v0, v1, v10, v2, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", scoreState="

    const-string v2, ", scoreType="

    invoke-static {v0, v1, v12, v2, v13}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", type="

    const-string v2, ", translatedType="

    move-object/from16 v3, v16

    invoke-static {v0, v1, v3, v2, v15}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activityV1Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
