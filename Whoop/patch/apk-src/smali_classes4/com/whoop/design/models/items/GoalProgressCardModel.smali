.class public final Lcom/whoop/design/models/items/GoalProgressCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/GoalProgressCardModel$$serializer;,
        Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bk\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"Jn\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00089\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010:\u0012\u0004\u0008<\u0010=\u001a\u0004\u0008;\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010>\u001a\u0004\u0008?\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008A\u0010\u001fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u0008B\u0010\u0017R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010C\u0012\u0004\u0008E\u0010=\u001a\u0004\u0008D\u0010\"\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/design/models/items/GoalProgressCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "progressDisplay",
        "sevenDayVow",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "progressBreakdown",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "checkmarkStyle",
        "ctaText",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "circularProgressIndicator",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/e;",
        "component5",
        "()Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "component6",
        "()Lcom/whoop/design/models/items/CheckmarkStyle;",
        "component7",
        "component8",
        "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lcom/whoop/design/models/items/GoalProgressCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/GoalProgressCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getProgressDisplay",
        "getSevenDayVow",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "getProgressBreakdown",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "getCheckmarkStyle",
        "getCtaText",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "getCircularProgressIndicator",
        "getCircularProgressIndicator$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;


# instance fields
.field private final checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

.field private final circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

.field private final ctaText:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

.field private final progressDisplay:Ljava/lang/String;

.field private final sevenDayVow:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/GoalProgressCardModel;->Companion:Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/GoalProgressCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/e;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lw91/e;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/e;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lw91/e;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/e;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lw91/e;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v0, v7

    const/4 v7, 0x1

    aput-object v1, v0, v7

    aput-object v1, v0, v4

    aput-object v3, v0, v6

    aput-object v1, v0, v8

    const/4 v3, 0x5

    aput-object v5, v0, v3

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v1, 0x7

    aput-object v2, v0, v1

    sput-object v0, Lcom/whoop/design/models/items/GoalProgressCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/GoalProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GoalProgressCardModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/GoalProgressCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    iput-object p6, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    iput-object p7, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iput-object p8, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/GoalProgressCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)V

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

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.CheckmarkStyle"

    invoke-static {}, Lcom/whoop/design/models/items/CheckmarkStyle;->values()[Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalProgressCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/GoalProgressCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalProgressCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalProgressCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/GoalProgressCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalProgressCardModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/GoalProgressCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lcom/whoop/design/models/items/GoalProgressCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCircularProgressIndicator$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/GoalProgressCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/GoalProgressCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/ProgressBreakdownModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lcom/whoop/design/models/items/GoalProgressCardModel;
    .locals 10

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/GoalProgressCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/GoalProgressCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/GoalProgressCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object p1, p1, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCheckmarkStyle()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getProgressBreakdown()Lcom/whoop/design/models/items/ProgressBreakdownModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    return-object v0
.end method

.method public final getProgressDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSevenDayVow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->sevenDayVow:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->progressBreakdown:Lcom/whoop/design/models/items/ProgressBreakdownModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->ctaText:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/GoalProgressCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    const-string v8, ", progressDisplay="

    const-string v9, ", sevenDayVow="

    const-string v10, "GoalProgressCardModel(title="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", destination="

    const-string v8, ", progressBreakdown="

    invoke-static {v0, v2, v1, v3, v8}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", checkmarkStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", circularProgressIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
