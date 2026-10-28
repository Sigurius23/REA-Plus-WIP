.class public final enum Li51/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li51/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li51/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Li51/g;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "scale",
        "Ly3/f;",
        "unitSize",
        "Ly3/h;",
        "streakLottieSquareSize-ISypg3U",
        "(IF)J",
        "streakLottieSquareSize",
        "height",
        "streakLottieRectangleSize-0ZcVfYs",
        "(F)J",
        "streakLottieRectangleSize",
        "getMediaSize-0ZcVfYs",
        "getMediaSize",
        "getStreakLottieSize-MYxV2XQ",
        "()J",
        "getStreakLottieSize",
        "SMALL",
        "MEDIUM",
        "LARGE",
        "STREAK_LOTTIE_MEDIUM",
        "STREAK_LOTTIE_LARGE",
        "design_release"
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

.field private static final synthetic $VALUES:[Li51/g;

.field public static final enum LARGE:Li51/g;

.field public static final enum MEDIUM:Li51/g;

.field public static final enum SMALL:Li51/g;

.field public static final enum STREAK_LOTTIE_LARGE:Li51/g;

.field public static final enum STREAK_LOTTIE_MEDIUM:Li51/g;


# direct methods
.method private static final synthetic $values()[Li51/g;
    .locals 5

    sget-object v0, Li51/g;->SMALL:Li51/g;

    sget-object v1, Li51/g;->MEDIUM:Li51/g;

    sget-object v2, Li51/g;->LARGE:Li51/g;

    sget-object v3, Li51/g;->STREAK_LOTTIE_MEDIUM:Li51/g;

    sget-object v4, Li51/g;->STREAK_LOTTIE_LARGE:Li51/g;

    filled-new-array {v0, v1, v2, v3, v4}, [Li51/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li51/g;

    const-string v1, "SMALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li51/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li51/g;->SMALL:Li51/g;

    new-instance v0, Li51/g;

    const-string v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li51/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li51/g;->MEDIUM:Li51/g;

    new-instance v0, Li51/g;

    const-string v1, "LARGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li51/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li51/g;->LARGE:Li51/g;

    new-instance v0, Li51/g;

    const-string v1, "STREAK_LOTTIE_MEDIUM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Li51/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li51/g;->STREAK_LOTTIE_MEDIUM:Li51/g;

    new-instance v0, Li51/g;

    const-string v1, "STREAK_LOTTIE_LARGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Li51/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li51/g;->STREAK_LOTTIE_LARGE:Li51/g;

    invoke-static {}, Li51/g;->$values()[Li51/g;

    move-result-object v0

    sput-object v0, Li51/g;->$VALUES:[Li51/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Li51/g;->$ENTRIES:Lt83/a;

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

    sget-object v0, Li51/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method private final streakLottieRectangleSize-0ZcVfYs(F)J
    .locals 2

    const/high16 v0, 0x42a00000    # 80.0f

    mul-float/2addr v0, p1

    const/high16 v1, 0x43110000    # 145.0f

    div-float/2addr v0, v1

    invoke-static {v0, p1}, Lvf3/b;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private final streakLottieSquareSize-ISypg3U(IF)J
    .locals 0

    int-to-float p1, p1

    mul-float/2addr p1, p2

    invoke-static {p1, p1}, Lvf3/b;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public static valueOf(Ljava/lang/String;)Li51/g;
    .locals 1

    const-class v0, Li51/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li51/g;

    return-object p0
.end method

.method public static values()[Li51/g;
    .locals 1

    sget-object v0, Li51/g;->$VALUES:[Li51/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li51/g;

    return-object v0
.end method


# virtual methods
.method public final getMediaSize-0ZcVfYs(F)J
    .locals 3

    sget-object v0, Li51/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x5

    if-eq v0, v1, :cond_2

    const/4 p1, 0x4

    if-eq v0, p1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Li51/g;->getStreakLottieSize-MYxV2XQ()J

    move-result-wide v0

    return-wide v0

    :cond_2
    int-to-float v0, v2

    mul-float/2addr v0, p1

    invoke-static {v0, v0}, Lvf3/b;->a(FF)J

    move-result-wide v0

    return-wide v0

    :cond_3
    int-to-float v0, v1

    mul-float/2addr v0, p1

    invoke-static {v0, v0}, Lvf3/b;->a(FF)J

    move-result-wide v0

    return-wide v0

    :cond_4
    int-to-float v0, v2

    mul-float/2addr v0, p1

    invoke-static {v0, v0}, Lvf3/b;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getStreakLottieSize-MYxV2XQ()J
    .locals 4

    sget-object v0, Li51/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x3c

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    int-to-float v0, v1

    int-to-float v1, v2

    mul-float/2addr v0, v1

    invoke-direct {p0, v0}, Li51/g;->streakLottieRectangleSize-0ZcVfYs(F)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const/16 v0, 0x50

    int-to-float v0, v0

    int-to-float v1, v2

    mul-float/2addr v0, v1

    invoke-direct {p0, v0}, Li51/g;->streakLottieRectangleSize-0ZcVfYs(F)J

    move-result-wide v0

    return-wide v0

    :cond_1
    int-to-float v0, v1

    int-to-float v1, v2

    mul-float/2addr v0, v1

    invoke-direct {p0, v0}, Li51/g;->streakLottieRectangleSize-0ZcVfYs(F)J

    move-result-wide v0

    return-wide v0
.end method
