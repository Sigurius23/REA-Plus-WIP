.class public abstract Lkm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u0008\"\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "Li2/x;",
        "colors",
        "Li2/t;",
        "d",
        "(Ljava/util/List;)Li2/t;",
        "",
        "a",
        "(Ljava/lang/String;)Li2/t;",
        "Lf0/t;",
        "c",
        "(Ljava/lang/String;)Lf0/t;",
        "b",
        "Ljava/util/List;",
        "patrioticGradientColors",
        "Li2/t;",
        "patrioticGradientBrush",
        "patrioticBackgroundBrush",
        "home_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Li2/t;

.field private static final c:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Ly81/f;->PATRIOTIC_BLUE:Ly81/f;

    invoke-virtual {v0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    sget-object v1, Ly81/f;->PATRIOTIC_RED:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v5

    new-instance v2, Li2/x;

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sput-object v2, Lkm1/d;->a:Ljava/util/List;

    invoke-static {v2}, Lkm1/d;->d(Ljava/util/List;)Li2/t;

    move-result-object v2

    sput-object v2, Lkm1/d;->b:Li2/t;

    invoke-virtual {v0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v2

    const v0, 0x3e19999a    # 0.15f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    sget-wide v2, Li2/x;->m:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkm1/d;->d(Ljava/util/List;)Li2/t;

    move-result-object v0

    sput-object v0, Lkm1/d;->c:Li2/t;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Li2/t;
    .locals 4

    const-string v0, "BLUE_WHITE_RED"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lkm1/d;->b:Li2/t;

    return-object p0

    :cond_0
    sget-object p0, Li2/t;->b:Li2/s;

    sget-wide v0, Li2/x;->f:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v2, v1}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Li2/t;
    .locals 1

    const-string v0, "AMERICA_250"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lkm1/d;->c:Li2/t;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Lf0/t;
    .locals 2

    const-string v0, "AMERICA_250"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lf0/t;

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    sget-object v1, Lkm1/d;->b:Li2/t;

    invoke-direct {p0, v0, v1}, Lf0/t;-><init>(FLi2/t;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Ljava/util/List;)Li2/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/x;",
            ">;)",
            "Li2/t;"
        }
    .end annotation

    new-instance v0, Lkm1/d$a;

    invoke-direct {v0, p0}, Lkm1/d$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method
