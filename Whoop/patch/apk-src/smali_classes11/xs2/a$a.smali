.class public final enum Lxs2/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxs2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxs2/a$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000f\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lxs2/a$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SLEEP_CONSISTENCY",
        "SLEEP_PERFORMANCE",
        "STEPS",
        "STRAIN",
        "STRENGTH_TRAINING_TIME",
        "ACTIVITIES",
        "BEHAVIORS",
        "UNKNOWN",
        "WEIGHT",
        "SLEEP_HOURS",
        "HR_ZONES_ONE_TO_THREE",
        "HR_ZONES_FOUR_TO_FIVE",
        "weekly-plan_release"
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

.field private static final synthetic $VALUES:[Lxs2/a$a;

.field public static final enum ACTIVITIES:Lxs2/a$a;

.field public static final enum BEHAVIORS:Lxs2/a$a;

.field public static final enum HR_ZONES_FOUR_TO_FIVE:Lxs2/a$a;

.field public static final enum HR_ZONES_ONE_TO_THREE:Lxs2/a$a;

.field public static final enum SLEEP_CONSISTENCY:Lxs2/a$a;

.field public static final enum SLEEP_HOURS:Lxs2/a$a;

.field public static final enum SLEEP_PERFORMANCE:Lxs2/a$a;

.field public static final enum STEPS:Lxs2/a$a;

.field public static final enum STRAIN:Lxs2/a$a;

.field public static final enum STRENGTH_TRAINING_TIME:Lxs2/a$a;

.field public static final enum UNKNOWN:Lxs2/a$a;

.field public static final enum WEIGHT:Lxs2/a$a;


# direct methods
.method private static final synthetic $values()[Lxs2/a$a;
    .locals 12

    sget-object v0, Lxs2/a$a;->SLEEP_CONSISTENCY:Lxs2/a$a;

    sget-object v1, Lxs2/a$a;->SLEEP_PERFORMANCE:Lxs2/a$a;

    sget-object v2, Lxs2/a$a;->STEPS:Lxs2/a$a;

    sget-object v3, Lxs2/a$a;->STRAIN:Lxs2/a$a;

    sget-object v4, Lxs2/a$a;->STRENGTH_TRAINING_TIME:Lxs2/a$a;

    sget-object v5, Lxs2/a$a;->ACTIVITIES:Lxs2/a$a;

    sget-object v6, Lxs2/a$a;->BEHAVIORS:Lxs2/a$a;

    sget-object v7, Lxs2/a$a;->UNKNOWN:Lxs2/a$a;

    sget-object v8, Lxs2/a$a;->WEIGHT:Lxs2/a$a;

    sget-object v9, Lxs2/a$a;->SLEEP_HOURS:Lxs2/a$a;

    sget-object v10, Lxs2/a$a;->HR_ZONES_ONE_TO_THREE:Lxs2/a$a;

    sget-object v11, Lxs2/a$a;->HR_ZONES_FOUR_TO_FIVE:Lxs2/a$a;

    filled-new-array/range {v0 .. v11}, [Lxs2/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxs2/a$a;

    const-string v1, "SLEEP_CONSISTENCY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->SLEEP_CONSISTENCY:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "SLEEP_PERFORMANCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->SLEEP_PERFORMANCE:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "STEPS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->STEPS:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "STRAIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->STRAIN:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "STRENGTH_TRAINING_TIME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->STRENGTH_TRAINING_TIME:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "ACTIVITIES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->ACTIVITIES:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "BEHAVIORS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->BEHAVIORS:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->UNKNOWN:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "WEIGHT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->WEIGHT:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "SLEEP_HOURS"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->SLEEP_HOURS:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "HR_ZONES_ONE_TO_THREE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->HR_ZONES_ONE_TO_THREE:Lxs2/a$a;

    new-instance v0, Lxs2/a$a;

    const-string v1, "HR_ZONES_FOUR_TO_FIVE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lxs2/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxs2/a$a;->HR_ZONES_FOUR_TO_FIVE:Lxs2/a$a;

    invoke-static {}, Lxs2/a$a;->$values()[Lxs2/a$a;

    move-result-object v0

    sput-object v0, Lxs2/a$a;->$VALUES:[Lxs2/a$a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lxs2/a$a;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lxs2/a$a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxs2/a$a;
    .locals 1

    const-class v0, Lxs2/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxs2/a$a;

    return-object p0
.end method

.method public static values()[Lxs2/a$a;
    .locals 1

    sget-object v0, Lxs2/a$a;->$VALUES:[Lxs2/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxs2/a$a;

    return-object v0
.end method
