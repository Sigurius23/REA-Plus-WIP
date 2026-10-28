.class public final Lcom/whoop/design/models/items/BehaviorTrackerModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;,
        Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`_B\u00a1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00b5\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0010\u0010-\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010\"J\u0012\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u00ca\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010\"J\u0010\u00109\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010 J\u001a\u0010;\u001a\u00020\n2\u0008\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001\u00a2\u0006\u0004\u0008C\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008G\u0010 \"\u0004\u0008H\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010J\u001a\u0004\u0008K\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010J\u001a\u0004\u0008L\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010J\u001a\u0004\u0008M\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010J\u001a\u0004\u0008N\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010J\u001a\u0004\u0008O\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010P\u001a\u0004\u0008Q\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010R\u001a\u0004\u0008S\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010J\u001a\u0004\u0008T\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010P\u001a\u0004\u0008U\u0010(R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010V\u001a\u0004\u0008W\u0010.R\u0017\u0010\u0012\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010V\u001a\u0004\u0008X\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010J\u001a\u0004\u0008Y\u0010\"R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010J\u001a\u0004\u0008Z\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010[\u001a\u0004\u0008\\\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010]\u001a\u0004\u0008^\u00105\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "",
        "",
        "id",
        "",
        "questionType",
        "title",
        "questionText",
        "description",
        "status",
        "",
        "sticky",
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "magnitude",
        "category",
        "deprecated",
        "",
        "createdAt",
        "updatedAt",
        "timeLabel",
        "timeContextLabel",
        "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "weeklyPlanGoal",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/lang/Boolean;",
        "component8",
        "()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "component9",
        "component10",
        "component11",
        "()D",
        "component12",
        "component13",
        "component14",
        "component15",
        "()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "component16",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "setId",
        "(I)V",
        "Ljava/lang/String;",
        "getQuestionType",
        "getTitle",
        "getQuestionText",
        "getDescription",
        "getStatus",
        "Ljava/lang/Boolean;",
        "getSticky",
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "getMagnitude",
        "getCategory",
        "getDeprecated",
        "D",
        "getCreatedAt",
        "getUpdatedAt",
        "getTimeLabel",
        "getTimeContextLabel",
        "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "getWeeklyPlanGoal",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;


# instance fields
.field private final category:Ljava/lang/String;

.field private final createdAt:D

.field private final deprecated:Ljava/lang/Boolean;

.field private final description:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private id:I

.field private final magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

.field private final questionText:Ljava/lang/String;

.field private final questionType:Ljava/lang/String;

.field private final status:Ljava/lang/String;

.field private final sticky:Ljava/lang/Boolean;

.field private final timeContextLabel:Ljava/lang/String;

.field private final timeLabel:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final updatedAt:D

.field private final weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->Companion:Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/a;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lw91/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x10

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v1, v3, v5

    const/4 v5, 0x6

    aput-object v1, v3, v5

    const/4 v5, 0x7

    aput-object v1, v3, v5

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    aput-object v1, v3, v4

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v1, v3, v0

    const/16 v0, 0xf

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/BehaviorTrackerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    iput-object p3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    iput-object p9, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iput-object p10, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    iput-wide p12, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    move-wide/from16 p1, p14

    iput-wide p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    .line 13
    iput-wide p11, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    .line 14
    iput-wide p13, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    .line 15
    iput-object p15, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/BehaviorTrackerModel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/BehaviorTrackerModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-wide v12, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    goto :goto_a

    :cond_a
    move-wide/from16 v12, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-wide v14, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p13

    :goto_b
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    move-object/from16 p19, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, p3

    move-object/from16 p18, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-wide/from16 p12, v12

    move-wide/from16 p14, v14

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move-object/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    const/4 v4, 0x6

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    const/4 v5, 0x7

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-wide v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v2, 0xb

    iget-wide v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    const/16 v3, 0xe

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    return-wide v0
.end method

.method public final component12()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    return-wide v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    return-object v0
.end method

.method public final component16()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/BehaviorTrackerModel;
    .locals 19

    new-instance v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Lcom/whoop/design/models/items/BehaviorTrackerModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;

    iget v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    iget v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    return-wide v0
.end method

.method public final getDeprecated()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    return v0
.end method

.method public final getMagnitude()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    return-object v0
.end method

.method public final getQuestionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuestionType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getSticky()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTimeContextLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    return-wide v0
.end method

.method public final getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    return v0
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->id:I

    iget-object v2, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionType:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->questionText:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->description:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->status:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->sticky:Ljava/lang/Boolean;

    iget-object v8, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iget-object v9, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->category:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->deprecated:Ljava/lang/Boolean;

    iget-wide v11, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->createdAt:D

    iget-wide v13, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->updatedAt:D

    iget-object v15, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeLabel:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->timeContextLabel:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/BehaviorTrackerModel;->destination:Lcom/whoop/navigation/e;

    const-string v0, ", questionType="

    move-object/from16 v19, v15

    const-string v15, ", title="

    move-wide/from16 v20, v13

    const-string v13, "BehaviorTrackerModel(id="

    invoke-static {v1, v13, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", questionText="

    const-string v2, ", description="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", status="

    const-string v2, ", sticky="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", magnitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deprecated="

    const-string v2, ", createdAt="

    invoke-static {v10, v9, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", timeLabel="

    move-wide/from16 v3, v20

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ", timeContextLabel="

    const-string v2, ", weeklyPlanGoal="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
