.class public final enum Lrv2/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrv2/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrv2/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lrv2/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "EXERCISE_PROGRESSION",
        "PERSONAL_WORKOUTS",
        "WHOOP_WORKOUTS",
        "PENDING_SESSIONS",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lrv2/f;

.field public static final Companion:Lrv2/f$a;

.field public static final enum EXERCISE_PROGRESSION:Lrv2/f;

.field public static final enum PENDING_SESSIONS:Lrv2/f;

.field public static final enum PERSONAL_WORKOUTS:Lrv2/f;

.field public static final enum WHOOP_WORKOUTS:Lrv2/f;


# direct methods
.method private static final synthetic $values()[Lrv2/f;
    .locals 4

    sget-object v0, Lrv2/f;->EXERCISE_PROGRESSION:Lrv2/f;

    sget-object v1, Lrv2/f;->PERSONAL_WORKOUTS:Lrv2/f;

    sget-object v2, Lrv2/f;->WHOOP_WORKOUTS:Lrv2/f;

    sget-object v3, Lrv2/f;->PENDING_SESSIONS:Lrv2/f;

    filled-new-array {v0, v1, v2, v3}, [Lrv2/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrv2/f;

    const-string v1, "EXERCISE_PROGRESSION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrv2/f;->EXERCISE_PROGRESSION:Lrv2/f;

    new-instance v0, Lrv2/f;

    const-string v1, "PERSONAL_WORKOUTS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrv2/f;->PERSONAL_WORKOUTS:Lrv2/f;

    new-instance v0, Lrv2/f;

    const-string v1, "WHOOP_WORKOUTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrv2/f;->WHOOP_WORKOUTS:Lrv2/f;

    new-instance v0, Lrv2/f;

    const-string v1, "PENDING_SESSIONS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrv2/f;->PENDING_SESSIONS:Lrv2/f;

    invoke-static {}, Lrv2/f;->$values()[Lrv2/f;

    move-result-object v0

    sput-object v0, Lrv2/f;->$VALUES:[Lrv2/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrv2/f;->$ENTRIES:Lt83/a;

    new-instance v0, Lrv2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrv2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrv2/f;->Companion:Lrv2/f$a;

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

    sget-object v0, Lrv2/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrv2/f;
    .locals 1

    const-class v0, Lrv2/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrv2/f;

    return-object p0
.end method

.method public static values()[Lrv2/f;
    .locals 1

    sget-object v0, Lrv2/f;->$VALUES:[Lrv2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrv2/f;

    return-object v0
.end method
