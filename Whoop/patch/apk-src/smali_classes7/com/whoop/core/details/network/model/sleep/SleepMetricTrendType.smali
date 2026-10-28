.class public final enum Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "POSITIVE",
        "NEUTRAL",
        "NEGATIVE",
        "POSITIVE_RANGE",
        "CONCERN_RANGE",
        "ALERT_RANGE",
        "Companion",
        "core-details_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum ALERT_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field public static final enum CONCERN_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field public static final Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;

.field public static final enum NEGATIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field public static final enum NEUTRAL:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field public static final enum POSITIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

.field public static final enum POSITIVE_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 6

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEUTRAL:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEGATIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    sget-object v3, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    sget-object v4, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->CONCERN_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    sget-object v5, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->ALERT_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "POSITIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEUTRAL:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "NEGATIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEGATIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "POSITIVE_RANGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "CONCERN_RANGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->CONCERN_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    const-string v1, "ALERT_RANGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->ALERT_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$values()[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    move-result-object v0

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$VALUES:[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lgp1/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$cachedSerializer$delegate:Ll83/h;

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

    const-string v0, "com.whoop.core.details.network.model.sleep.SleepMetricTrendType"

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->values()[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    const-class v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->$VALUES:[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    return-object v0
.end method
