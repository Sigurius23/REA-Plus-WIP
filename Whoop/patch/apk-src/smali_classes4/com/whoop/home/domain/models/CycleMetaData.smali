.class public final Lcom/whoop/home/domain/models/CycleMetaData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/CycleMetaData$$serializer;,
        Lcom/whoop/home/domain/models/CycleMetaData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008+\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bo\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,Jn\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010$J\u0010\u00100\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00103\u001a\u00020\n2\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010$R\u001a\u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008;\u0010$R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008<\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008>\u0010(R \u0010\u000c\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008\u000c\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00109\u001a\u0004\u0008A\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010B\u0012\u0004\u0008C\u0010@\u001a\u0004\u0008\u000e\u0010,\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/CycleMetaData;",
        "",
        "",
        "cycleId",
        "Lcom/whoop/home/domain/models/CycleDays;",
        "cycleDays",
        "",
        "cycleDateDisplay",
        "previousCycleDay",
        "nextCycleDay",
        "",
        "multiDayCycle",
        "isGDCFlow",
        "sleepState",
        "isDayZero",
        "<init>",
        "(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/CycleMetaData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Lcom/whoop/home/domain/models/CycleDays;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Boolean;",
        "copy",
        "(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/home/domain/models/CycleMetaData;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getCycleId",
        "Lcom/whoop/home/domain/models/CycleDays;",
        "getCycleDays",
        "Ljava/lang/String;",
        "getCycleDateDisplay",
        "getPreviousCycleDay",
        "getNextCycleDay",
        "Z",
        "getMultiDayCycle",
        "isGDCFlow$annotations",
        "()V",
        "getSleepState",
        "Ljava/lang/Boolean;",
        "isDayZero$annotations",
        "Companion",
        "$serializer",
        "home_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/home/domain/models/CycleMetaData$Companion;


# instance fields
.field private final cycleDateDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_date_display"
    .end annotation
.end field

.field private final cycleDays:Lcom/whoop/home/domain/models/CycleDays;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_days"
    .end annotation
.end field

.field private final cycleId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_id"
    .end annotation
.end field

.field private final isDayZero:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_zero"
    .end annotation
.end field

.field private final isGDCFlow:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_multi_day_cycle_cta_tile"
    .end annotation
.end field

.field private final multiDayCycle:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "multi_day_cycle"
    .end annotation
.end field

.field private final nextCycleDay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "next_cycle_day"
    .end annotation
.end field

.field private final previousCycleDay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "previous_cycle_day"
    .end annotation
.end field

.field private final sleepState:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_state"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/home/domain/models/CycleMetaData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/CycleMetaData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/CycleMetaData;->Companion:Lcom/whoop/home/domain/models/CycleMetaData$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleMetaData$$serializer;

    invoke-virtual {p12}, Lcom/whoop/home/domain/models/CycleMetaData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    iput-object p4, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    iput-object p5, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    iput-boolean p9, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    iput-object p10, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "cycleDays"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cycleDateDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousCycleDay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextCycleDay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    .line 4
    iput-object p3, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    .line 5
    iput-object p4, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    .line 9
    iput-boolean p8, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    .line 10
    iput-object p9, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/CycleMetaData;JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/home/domain/models/CycleMetaData;
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    move-object v5, p1

    goto :goto_0

    :cond_3
    move-object/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    move-object v6, p1

    goto :goto_1

    :cond_4
    move-object/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    move v7, p1

    goto :goto_2

    :cond_5
    move/from16 v7, p7

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    move v8, p1

    goto :goto_3

    :cond_6
    move/from16 v8, p8

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    move-object v9, p1

    goto :goto_4

    :cond_7
    move-object/from16 v9, p9

    :goto_4
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    move-object v10, p1

    :goto_5
    move-object v0, p0

    goto :goto_6

    :cond_8
    move-object/from16 v10, p10

    goto :goto_5

    :goto_6
    invoke-virtual/range {v0 .. v10}, Lcom/whoop/home/domain/models/CycleMetaData;->copy(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/home/domain/models/CycleMetaData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isDayZero$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "day_zero"
    .end annotation

    return-void
.end method

.method public static synthetic isGDCFlow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "has_multi_day_cycle_cta_tile"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/CycleMetaData;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    sget-object v0, Lcom/whoop/home/domain/models/CycleDays$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CycleDays$$serializer;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    return-wide v0
.end method

.method public final component2()Lcom/whoop/home/domain/models/CycleDays;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/home/domain/models/CycleMetaData;
    .locals 12

    const-string v0, "cycleDays"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cycleDateDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousCycleDay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextCycleDay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/CycleMetaData;

    move-wide v2, p1

    move-object v4, p3

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/home/domain/models/CycleMetaData;-><init>(JLcom/whoop/home/domain/models/CycleDays;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/CycleMetaData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/CycleMetaData;

    iget-wide v3, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    iget-wide v5, p1, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCycleDateDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleDays()Lcom/whoop/home/domain/models/CycleDays;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    return-object v0
.end method

.method public final getCycleId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    return-wide v0
.end method

.method public final getMultiDayCycle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    return v0
.end method

.method public final getNextCycleDay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreviousCycleDay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    invoke-virtual {v2}, Lcom/whoop/home/domain/models/CycleDays;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final isDayZero()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isGDCFlow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleId:J

    iget-object v2, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDays:Lcom/whoop/home/domain/models/CycleDays;

    iget-object v3, p0, Lcom/whoop/home/domain/models/CycleMetaData;->cycleDateDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/home/domain/models/CycleMetaData;->previousCycleDay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/home/domain/models/CycleMetaData;->nextCycleDay:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/home/domain/models/CycleMetaData;->multiDayCycle:Z

    iget-boolean v7, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isGDCFlow:Z

    iget-object v8, p0, Lcom/whoop/home/domain/models/CycleMetaData;->sleepState:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/home/domain/models/CycleMetaData;->isDayZero:Ljava/lang/Boolean;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "CycleMetaData(cycleId="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", cycleDays="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cycleDateDisplay="

    const-string v1, ", previousCycleDay="

    invoke-static {v10, v0, v3, v1, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", nextCycleDay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", multiDayCycle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isGDCFlow="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", sleepState="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isDayZero="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
