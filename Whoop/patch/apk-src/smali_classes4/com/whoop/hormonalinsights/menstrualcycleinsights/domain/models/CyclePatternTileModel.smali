.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bo\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.Jn\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010!J\u0010\u00102\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00106\u001a\u00020\n2\u0008\u00105\u001a\u0004\u0018\u000104H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010!R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008D\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010E\u001a\u0004\u0008F\u0010.\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "titleDisplay",
        "type",
        "",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "cycles",
        "",
        "todayIndex",
        "",
        "showDividers",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;",
        "button",
        "emptyState",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/lang/Integer;",
        "component5",
        "()Z",
        "component6",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;",
        "component7",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component8",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "getType",
        "Ljava/util/List;",
        "getCycles",
        "Ljava/lang/Integer;",
        "getTodayIndex",
        "Z",
        "getShowDividers",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;",
        "getButton",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getEmptyState",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "Companion",
        "$serializer",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;


# instance fields
.field private final button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

.field private final cycles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
            ">;"
        }
    .end annotation
.end field

.field private final emptyState:Lcom/whoop/design/models/DesignSystemModel;

.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final showDividers:Z

.field private final titleDisplay:Ljava/lang/String;

.field private final todayIndex:Ljava/lang/Integer;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lqo1/a;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lqo1/a;

    const/16 v5, 0xc

    invoke-direct {v4, v5}, Lqo1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v4, 0x1

    aput-object v1, v0, v4

    const/4 v4, 0x2

    aput-object v3, v0, v4

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    iput-boolean p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
            ">;",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cycles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-boolean p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    return v0
.end method

.method public final component6()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
            ">;",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cycles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    iget-boolean v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getButton()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    return-object v0
.end method

.method public final getCycles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    return-object v0
.end method

.method public final getEmptyState()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getShowDividers()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    return v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTodayIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->type:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->cycles:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->todayIndex:Ljava/lang/Integer;

    iget-boolean v4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->showDividers:Z

    iget-object v5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->button:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->emptyState:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v8, ", type="

    const-string v9, ", cycles="

    const-string v10, "CyclePatternTileModel(titleDisplay="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", todayIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showDividers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", button="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emptyState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
