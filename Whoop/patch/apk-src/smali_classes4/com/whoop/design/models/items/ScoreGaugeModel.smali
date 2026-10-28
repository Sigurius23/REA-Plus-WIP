.class public final Lcom/whoop/design/models/items/ScoreGaugeModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ScoreGaugeModel$$serializer;,
        Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0081\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0097\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u00a0\u0001\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008B\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008C\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010@\u001a\u0004\u0008D\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008F\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008H\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010E\u001a\u0004\u0008I\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010E\u001a\u0004\u0008J\u0010!R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010@\u001a\u0004\u0008K\u0010\u001cR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010L\u001a\u0004\u0008M\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008O\u0010*R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010P\u0012\u0004\u0008R\u0010S\u001a\u0004\u0008Q\u0010,\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ScoreGaugeModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "scoreDisplay",
        "scoreDisplaySuffix",
        "scoreDisplayTitle",
        "",
        "scoreTarget",
        "gaugeFillPercentage",
        "lowerOptimalPercentage",
        "higherOptimalPercentage",
        "progressFillStyle",
        "",
        "Lcom/whoop/design/models/LegendStyle;",
        "barStyles",
        "Lcom/whoop/design/models/items/DisplayStyle;",
        "scoreDisplayStyle",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Float;",
        "component6",
        "()F",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Ljava/util/List;",
        "component11",
        "()Lcom/whoop/design/models/items/DisplayStyle;",
        "component12",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ScoreGaugeModel;",
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
        "(Lcom/whoop/design/models/items/ScoreGaugeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getScoreDisplay",
        "getScoreDisplaySuffix",
        "getScoreDisplayTitle",
        "Ljava/lang/Float;",
        "getScoreTarget",
        "F",
        "getGaugeFillPercentage",
        "getLowerOptimalPercentage",
        "getHigherOptimalPercentage",
        "getProgressFillStyle",
        "Ljava/util/List;",
        "getBarStyles",
        "Lcom/whoop/design/models/items/DisplayStyle;",
        "getScoreDisplayStyle",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;


# instance fields
.field private final barStyles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation
.end field

.field private final destination:Lcom/whoop/navigation/e;

.field private final gaugeFillPercentage:F

.field private final higherOptimalPercentage:Ljava/lang/Float;

.field private final id:Ljava/lang/String;

.field private final lowerOptimalPercentage:Ljava/lang/Float;

.field private final progressFillStyle:Ljava/lang/String;

.field private final scoreDisplay:Ljava/lang/String;

.field private final scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

.field private final scoreDisplaySuffix:Ljava/lang/String;

.field private final scoreDisplayTitle:Ljava/lang/String;

.field private final scoreTarget:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ScoreGaugeModel;->Companion:Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ScoreGaugeModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/i;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lw91/i;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/i;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lw91/i;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/i;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lw91/i;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xc

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

    aput-object v1, v5, v6

    const/4 v6, 0x6

    aput-object v1, v5, v6

    const/4 v6, 0x7

    aput-object v1, v5, v6

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v3, v5, v0

    const/16 v0, 0xa

    aput-object v4, v5, v0

    const/16 v0, 0xb

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/design/models/items/ScoreGaugeModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xbff

    const/16 v0, 0xbff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/design/models/items/ScoreGaugeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ScoreGaugeModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/design/models/items/ScoreGaugeModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    iput p7, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    iput-object p8, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    iput-object p9, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    iput-object p10, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    goto :goto_0

    :cond_1
    iput-object p12, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    :goto_0
    iput-object p13, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "F",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;",
            "Lcom/whoop/design/models/items/DisplayStyle;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "scoreDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreDisplayTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    .line 8
    iput p6, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p13

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v12, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    goto :goto_1

    :cond_0
    move-object/from16 v12, p11

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/items/ScoreGaugeModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/LegendStyle;->Companion:Lcom/whoop/design/models/LegendStyle$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/LegendStyle$Companion;->serializer()Lwc3/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.DisplayStyle"

    invoke-static {}, Lcom/whoop/design/models/items/DisplayStyle;->values()[Lcom/whoop/design/models/items/DisplayStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/items/ScoreGaugeModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ScoreGaugeModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ScoreGaugeModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ScoreGaugeModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ScoreGaugeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/ScoreGaugeModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/items/ScoreGaugeModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ScoreGaugeModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ScoreGaugeModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ScoreGaugeModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x5

    iget v4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    invoke-interface {p1, p2, v3, v4}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/DisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    return-object v0
.end method

.method public final component12()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    return v0
.end method

.method public final component7()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component8()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ScoreGaugeModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "F",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;",
            "Lcom/whoop/design/models/items/DisplayStyle;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/design/models/items/ScoreGaugeModel;"
        }
    .end annotation

    const-string v0, "scoreDisplay"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreDisplayTitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ScoreGaugeModel;

    move-object v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/items/ScoreGaugeModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ScoreGaugeModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBarStyles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/LegendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getGaugeFillPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    return v0
.end method

.method public final getHigherOptimalPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLowerOptimalPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getProgressFillStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreDisplayStyle()Lcom/whoop/design/models/items/DisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    return-object v0
.end method

.method public final getScoreDisplaySuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreDisplayTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreTarget()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplaySuffix:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreTarget:Ljava/lang/Float;

    iget v5, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->gaugeFillPercentage:F

    iget-object v6, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->lowerOptimalPercentage:Ljava/lang/Float;

    iget-object v7, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->higherOptimalPercentage:Ljava/lang/Float;

    iget-object v8, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->progressFillStyle:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->barStyles:Ljava/util/List;

    iget-object v10, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->scoreDisplayStyle:Lcom/whoop/design/models/items/DisplayStyle;

    iget-object v11, p0, Lcom/whoop/design/models/items/ScoreGaugeModel;->destination:Lcom/whoop/navigation/e;

    const-string v12, ", scoreDisplay="

    const-string v13, ", scoreDisplaySuffix="

    const-string v14, "ScoreGaugeModel(id="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scoreDisplayTitle="

    const-string v12, ", scoreTarget="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lowerOptimalPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", higherOptimalPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressFillStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", barStyles="

    const-string v2, ", scoreDisplayStyle="

    invoke-static {v8, v1, v2, v0, v9}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
