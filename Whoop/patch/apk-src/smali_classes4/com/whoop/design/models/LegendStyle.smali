.class public final enum Lcom/whoop/design/models/LegendStyle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/LegendStyle$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/LegendStyle;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0010\u0008\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/design/models/LegendStyle;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ASLEEP",
        "AWAKE",
        "EMPTY",
        "HEALTHY_MIN",
        "NEGATIVE_TREND_TARGET",
        "NEUTRAL_TREND_TARGET",
        "NO_TREND_TARGET",
        "POSITIVE_TREND_TARGET",
        "RECENT_STRAIN",
        "RESTORATIVE_SLEEP",
        "SLEEP_CONSISTENCY_BEDTIME_WAKETIME",
        "STRIPES",
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
    with = Lcom/whoop/design/models/LegendStyleSerializer;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/LegendStyle;

.field public static final enum ASLEEP:Lcom/whoop/design/models/LegendStyle;

.field public static final enum AWAKE:Lcom/whoop/design/models/LegendStyle;

.field public static final Companion:Lcom/whoop/design/models/LegendStyle$Companion;

.field public static final enum EMPTY:Lcom/whoop/design/models/LegendStyle;

.field public static final enum HEALTHY_MIN:Lcom/whoop/design/models/LegendStyle;

.field public static final enum NEGATIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

.field public static final enum NEUTRAL_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

.field public static final enum NO_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

.field public static final enum POSITIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

.field public static final enum RECENT_STRAIN:Lcom/whoop/design/models/LegendStyle;

.field public static final enum RESTORATIVE_SLEEP:Lcom/whoop/design/models/LegendStyle;

.field public static final enum SLEEP_CONSISTENCY_BEDTIME_WAKETIME:Lcom/whoop/design/models/LegendStyle;

.field public static final enum STRIPES:Lcom/whoop/design/models/LegendStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/LegendStyle;
    .locals 12

    sget-object v0, Lcom/whoop/design/models/LegendStyle;->ASLEEP:Lcom/whoop/design/models/LegendStyle;

    sget-object v1, Lcom/whoop/design/models/LegendStyle;->AWAKE:Lcom/whoop/design/models/LegendStyle;

    sget-object v2, Lcom/whoop/design/models/LegendStyle;->EMPTY:Lcom/whoop/design/models/LegendStyle;

    sget-object v3, Lcom/whoop/design/models/LegendStyle;->HEALTHY_MIN:Lcom/whoop/design/models/LegendStyle;

    sget-object v4, Lcom/whoop/design/models/LegendStyle;->NEGATIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    sget-object v5, Lcom/whoop/design/models/LegendStyle;->NEUTRAL_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    sget-object v6, Lcom/whoop/design/models/LegendStyle;->NO_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    sget-object v7, Lcom/whoop/design/models/LegendStyle;->POSITIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    sget-object v8, Lcom/whoop/design/models/LegendStyle;->RECENT_STRAIN:Lcom/whoop/design/models/LegendStyle;

    sget-object v9, Lcom/whoop/design/models/LegendStyle;->RESTORATIVE_SLEEP:Lcom/whoop/design/models/LegendStyle;

    sget-object v10, Lcom/whoop/design/models/LegendStyle;->SLEEP_CONSISTENCY_BEDTIME_WAKETIME:Lcom/whoop/design/models/LegendStyle;

    sget-object v11, Lcom/whoop/design/models/LegendStyle;->STRIPES:Lcom/whoop/design/models/LegendStyle;

    filled-new-array/range {v0 .. v11}, [Lcom/whoop/design/models/LegendStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "ASLEEP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->ASLEEP:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "AWAKE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->AWAKE:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "EMPTY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->EMPTY:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "HEALTHY_MIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->HEALTHY_MIN:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "NEGATIVE_TREND_TARGET"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->NEGATIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "NEUTRAL_TREND_TARGET"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->NEUTRAL_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "NO_TREND_TARGET"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->NO_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "POSITIVE_TREND_TARGET"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->POSITIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "RECENT_STRAIN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->RECENT_STRAIN:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "RESTORATIVE_SLEEP"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->RESTORATIVE_SLEEP:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "SLEEP_CONSISTENCY_BEDTIME_WAKETIME"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->SLEEP_CONSISTENCY_BEDTIME_WAKETIME:Lcom/whoop/design/models/LegendStyle;

    new-instance v0, Lcom/whoop/design/models/LegendStyle;

    const-string v1, "STRIPES"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/LegendStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->STRIPES:Lcom/whoop/design/models/LegendStyle;

    invoke-static {}, Lcom/whoop/design/models/LegendStyle;->$values()[Lcom/whoop/design/models/LegendStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->$VALUES:[Lcom/whoop/design/models/LegendStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/LegendStyle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/LegendStyle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/LegendStyle;->Companion:Lcom/whoop/design/models/LegendStyle$Companion;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/models/LegendStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/LegendStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/LegendStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/LegendStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/LegendStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/LegendStyle;->$VALUES:[Lcom/whoop/design/models/LegendStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/LegendStyle;

    return-object v0
.end method
