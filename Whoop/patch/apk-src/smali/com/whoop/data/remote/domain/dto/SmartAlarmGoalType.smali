.class public final enum Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0087\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "",
        "goalType",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getGoalType",
        "()Ljava/lang/String;",
        "SLEEP_HEALTH_PEAK",
        "SLEEP_HEALTH_PERFORM",
        "SLEEP_HEALTH_GET_BY",
        "IN_THE_GREEN",
        "EXACT_TIME_GET_BY",
        "EXACT_TIME_PERFORM",
        "EXACT_TIME_PEAK",
        "EXACT_TIME_WEEKLY_PLAN",
        "EXACT_TIME_SLEEP_HOURS",
        "EXACT_TIME_OPTIMIZE_SLEEP",
        "Companion",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;

.field public static final enum EXACT_TIME_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_GET_BY"
    .end annotation
.end field

.field public static final enum EXACT_TIME_OPTIMIZE_SLEEP:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_OPTIMIZE_SLEEP"
    .end annotation
.end field

.field public static final enum EXACT_TIME_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_PEAK"
    .end annotation
.end field

.field public static final enum EXACT_TIME_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_PERFORM"
    .end annotation
.end field

.field public static final enum EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_SLEEP_HOURS"
    .end annotation
.end field

.field public static final enum EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "EXACT_TIME_WEEKLY_PLAN"
    .end annotation
.end field

.field public static final enum IN_THE_GREEN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "IN_THE_GREEN"
    .end annotation
.end field

.field public static final enum SLEEP_HEALTH_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SLEEP_HEALTH_GET_BY"
    .end annotation
.end field

.field public static final enum SLEEP_HEALTH_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SLEEP_HEALTH_PEAK"
    .end annotation
.end field

.field public static final enum SLEEP_HEALTH_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SLEEP_HEALTH_PERFORM"
    .end annotation
.end field


# instance fields
.field private final goalType:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 10

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v2, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v3, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->IN_THE_GREEN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v4, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v5, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v6, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v7, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v8, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    sget-object v9, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_OPTIMIZE_SLEEP:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    filled-new-array/range {v0 .. v9}, [Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "SLEEP_HEALTH_PEAK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "SLEEP_HEALTH_PERFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "SLEEP_HEALTH_GET_BY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "IN_THE_GREEN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->IN_THE_GREEN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_GET_BY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_PERFORM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_PEAK"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_WEEKLY_PLAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_SLEEP_HOURS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    const-string v1, "EXACT_TIME_OPTIMIZE_SLEEP"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_OPTIMIZE_SLEEP:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$values()[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$VALUES:[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lun1/f;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lun1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->goalType:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.data.remote.domain.dto.SmartAlarmGoalType"

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->values()[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    const-class v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->$VALUES:[Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method


# virtual methods
.method public final getGoalType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->goalType:Ljava/lang/String;

    return-object v0
.end method
