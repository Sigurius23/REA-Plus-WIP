.class public final enum Lcom/amplitude/android/engagement/types/StepCounterFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "lj/c0",
        "VERBOSE",
        "NUMERIC",
        "DOTS",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/StepCounterFormat;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Llj/c0;

.field public static final enum DOTS:Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .annotation runtime Lwc3/h;
        value = "dots"
    .end annotation
.end field

.field public static final enum NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .annotation runtime Lwc3/h;
        value = "numeric"
    .end annotation
.end field

.field public static final enum VERBOSE:Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .annotation runtime Lwc3/h;
        value = "verbose"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .locals 3

    sget-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->VERBOSE:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    sget-object v1, Lcom/amplitude/android/engagement/types/StepCounterFormat;->NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    sget-object v2, Lcom/amplitude/android/engagement/types/StepCounterFormat;->DOTS:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    filled-new-array {v0, v1, v2}, [Lcom/amplitude/android/engagement/types/StepCounterFormat;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    const-string v1, "VERBOSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/StepCounterFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->VERBOSE:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    new-instance v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    const-string v1, "NUMERIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/StepCounterFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    new-instance v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    const-string v1, "DOTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/StepCounterFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->DOTS:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-static {}, Lcom/amplitude/android/engagement/types/StepCounterFormat;->$values()[Lcom/amplitude/android/engagement/types/StepCounterFormat;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->$VALUES:[Lcom/amplitude/android/engagement/types/StepCounterFormat;

    new-instance v0, Llj/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->Companion:Llj/c0;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->W:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->$cachedSerializer$delegate:Ll83/h;

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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/StepCounterFormat;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/StepCounterFormat;->$VALUES:[Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/StepCounterFormat;

    return-object v0
.end method
