.class public final enum Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "WAKE_MODE",
        "WAKE_TIME",
        "SLEEP_GOAL",
        "Companion",
        "sleep-coach_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;

.field public static final enum SLEEP_GOAL:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_goal"
    .end annotation

    .annotation runtime Lwc3/h;
        value = "sleep_goal"
    .end annotation
.end field

.field public static final enum WAKE_MODE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_mode"
    .end annotation

    .annotation runtime Lwc3/h;
        value = "wake_mode"
    .end annotation
.end field

.field public static final enum WAKE_TIME:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "wake_time"
    .end annotation

    .annotation runtime Lwc3/h;
        value = "wake_time"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .locals 3

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_MODE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    sget-object v1, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_TIME:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    sget-object v2, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->SLEEP_GOAL:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    const-string v1, "WAKE_MODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_MODE:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    const-string v1, "WAKE_TIME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->WAKE_TIME:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    const-string v1, "SLEEP_GOAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->SLEEP_GOAL:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    move-result-object v0

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$VALUES:[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Ldb2/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Ldb2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$cachedSerializer$delegate:Ll83/h;

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
    .locals 5

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    move-result-object v0

    const-string v1, "wake_time"

    const-string v2, "sleep_goal"

    const-string v3, "wake_mode"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.NextStateDto"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .locals 1

    const-class v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-object p0
.end method

.method public static values()[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;
    .locals 1

    sget-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->$VALUES:[Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;

    return-object v0
.end method
