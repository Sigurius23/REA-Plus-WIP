.class public final Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$$serializer;,
        Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?@BY\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jb\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010$J\u0010\u0010-\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00100\u001a\u00020\u00022\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008:\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010\'R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008\r\u0010)\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;",
        "",
        "",
        "answeredYes",
        "",
        "behaviorTrackerId",
        "",
        "timeInputValue",
        "",
        "timeInputLabel",
        "magnitudeInputLabel",
        "",
        "magnitudeInputValue",
        "isSuggested",
        "<init>",
        "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Boolean;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "()Ljava/lang/Double;",
        "component7",
        "()Z",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Boolean;",
        "getAnsweredYes",
        "Ljava/lang/Integer;",
        "getBehaviorTrackerId",
        "Ljava/lang/Long;",
        "getTimeInputValue",
        "Ljava/lang/String;",
        "getTimeInputLabel",
        "getMagnitudeInputLabel",
        "Ljava/lang/Double;",
        "getMagnitudeInputValue",
        "Z",
        "Companion",
        "$serializer",
        "a",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;


# instance fields
.field private final answeredYes:Ljava/lang/Boolean;

.field private final behaviorTrackerId:Ljava/lang/Integer;

.field private final isSuggested:Z

.field private final magnitudeInputLabel:Ljava/lang/String;

.field private final magnitudeInputValue:Ljava/lang/Double;

.field private final timeInputLabel:Ljava/lang/String;

.field private final timeInputValue:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->Companion:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x0

    if-nez p9, :cond_0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    return-void

    :cond_6
    iput-boolean p8, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    .line 5
    iput-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    .line 6
    iput-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    .line 7
    iput-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    .line 10
    iput-boolean p7, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, 0x0

    :cond_6
    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p8}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->copy(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    if-eqz v1, :cond_d

    :goto_6
    iget-boolean p0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    return v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;
    .locals 8

    new-instance v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    iget-boolean p1, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnsweredYes()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBehaviorTrackerId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMagnitudeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getMagnitudeInputValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTimeInputLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeInputValue()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSuggested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->answeredYes:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->behaviorTrackerId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputValue:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->timeInputLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->magnitudeInputValue:Ljava/lang/Double;

    iget-boolean v6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;->isSuggested:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "SymptomTrackerInput(answeredYes="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", behaviorTrackerId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInputLabel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputLabel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", magnitudeInputValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSuggested="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
