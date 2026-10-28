.class public final enum Lpt1/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpt1/e$a;,
        Lpt1/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpt1/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u000c\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpt1/e;",
        "",
        "",
        "rawValue",
        "<init>",
        "(Ljava/lang/String;IS)V",
        "S",
        "getRawValue",
        "()S",
        "",
        "getAnalyticsLabel",
        "()Ljava/lang/String;",
        "analyticsLabel",
        "Companion",
        "a",
        "LOW_AMPLITUDE",
        "SIGNIFICANT_NOISE",
        "UNSTABLE_SIGNAL",
        "NOT_ENOUGH_DATA",
        "labrador_release"
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

.field private static final synthetic $VALUES:[Lpt1/e;

.field public static final Companion:Lpt1/e$a;

.field public static final enum LOW_AMPLITUDE:Lpt1/e;

.field public static final enum NOT_ENOUGH_DATA:Lpt1/e;

.field public static final enum SIGNIFICANT_NOISE:Lpt1/e;

.field public static final enum UNSTABLE_SIGNAL:Lpt1/e;


# instance fields
.field private final rawValue:S


# direct methods
.method private static final synthetic $values()[Lpt1/e;
    .locals 4

    sget-object v0, Lpt1/e;->LOW_AMPLITUDE:Lpt1/e;

    sget-object v1, Lpt1/e;->SIGNIFICANT_NOISE:Lpt1/e;

    sget-object v2, Lpt1/e;->UNSTABLE_SIGNAL:Lpt1/e;

    sget-object v3, Lpt1/e;->NOT_ENOUGH_DATA:Lpt1/e;

    filled-new-array {v0, v1, v2, v3}, [Lpt1/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lpt1/e;

    const-string v1, "LOW_AMPLITUDE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lpt1/e;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lpt1/e;->LOW_AMPLITUDE:Lpt1/e;

    new-instance v0, Lpt1/e;

    const-string v1, "SIGNIFICANT_NOISE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lpt1/e;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lpt1/e;->SIGNIFICANT_NOISE:Lpt1/e;

    new-instance v0, Lpt1/e;

    const-string v1, "UNSTABLE_SIGNAL"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lpt1/e;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lpt1/e;->UNSTABLE_SIGNAL:Lpt1/e;

    new-instance v0, Lpt1/e;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v3, "NOT_ENOUGH_DATA"

    invoke-direct {v0, v3, v1, v2}, Lpt1/e;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lpt1/e;->NOT_ENOUGH_DATA:Lpt1/e;

    invoke-static {}, Lpt1/e;->$values()[Lpt1/e;

    move-result-object v0

    sput-object v0, Lpt1/e;->$VALUES:[Lpt1/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lpt1/e;->$ENTRIES:Lt83/a;

    new-instance v0, Lpt1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpt1/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpt1/e;->Companion:Lpt1/e$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IS)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lpt1/e;->rawValue:S

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

    sget-object v0, Lpt1/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpt1/e;
    .locals 1

    const-class v0, Lpt1/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpt1/e;

    return-object p0
.end method

.method public static values()[Lpt1/e;
    .locals 1

    sget-object v0, Lpt1/e;->$VALUES:[Lpt1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpt1/e;

    return-object v0
.end method


# virtual methods
.method public final getAnalyticsLabel()Ljava/lang/String;
    .locals 2

    sget-object v0, Lpt1/e$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string v0, "not_enough_data"

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "unstable_signal"

    return-object v0

    :cond_2
    const-string v0, "significant_noise"

    return-object v0

    :cond_3
    const-string v0, "low_amplitude"

    return-object v0
.end method

.method public final getRawValue()S
    .locals 1

    iget-short v0, p0, Lpt1/e;->rawValue:S

    return v0
.end method
