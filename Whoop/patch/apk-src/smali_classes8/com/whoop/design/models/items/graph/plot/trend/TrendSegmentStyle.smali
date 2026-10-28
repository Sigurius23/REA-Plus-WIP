.class public final enum Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000e\u0008\u0087\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "POSITIVE",
        "NEGATIVE",
        "SLEEP_NEED",
        "SLEEP_HOURS",
        "HIGH_STRESS",
        "MEDIUM_STRESS",
        "LOW_STRESS",
        "BODY_COMPOSITION_LEAN",
        "BODY_COMPOSITION_FAT",
        "NONE",
        "Companion",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum BODY_COMPOSITION_FAT:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum BODY_COMPOSITION_LEAN:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle$Companion;

.field public static final enum HIGH_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum LOW_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum MEDIUM_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum NEGATIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum POSITIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum SLEEP_HOURS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

.field public static final enum SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;
    .locals 10

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->POSITIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->NEGATIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_HOURS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v4, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->HIGH_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v5, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->MEDIUM_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v6, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->LOW_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v7, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->BODY_COMPOSITION_LEAN:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v8, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->BODY_COMPOSITION_FAT:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    sget-object v9, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    filled-new-array/range {v0 .. v9}, [Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "POSITIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->POSITIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "NEGATIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->NEGATIVE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "SLEEP_NEED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "SLEEP_HOURS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_HOURS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "HIGH_STRESS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->HIGH_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "MEDIUM_STRESS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->MEDIUM_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "LOW_STRESS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->LOW_STRESS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "BODY_COMPOSITION_LEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->BODY_COMPOSITION_LEAN:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "BODY_COMPOSITION_FAT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->BODY_COMPOSITION_FAT:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    const-string v1, "NONE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->Companion:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lt91/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lt91/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.trend.TrendSegmentStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    return-object v0
.end method
