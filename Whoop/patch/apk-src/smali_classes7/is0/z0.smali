.class public abstract Lis0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000c\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "commentCount",
        "Lkotlin/time/Duration;",
        "interval",
        "",
        "isPaused",
        "d",
        "(ILkotlin/time/Duration;ZLandroidx/compose/runtime/Composer;II)I",
        "a",
        "J",
        "getDEFAULT_ROTATION_INTERVAL",
        "()J",
        "DEFAULT_ROTATION_INTERVAL",
        "surfacedIndex",
        "community-reactions-arch-mini_release"
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
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x5

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Lis0/z0;->a:J

    return-void
.end method

.method public static synthetic a()Lp1/a1;
    .locals 1

    invoke-static {}, Lis0/z0;->e()Lp1/a1;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lis0/z0;->f(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lp1/a1;I)V
    .locals 0

    invoke-static {p0, p1}, Lis0/z0;->g(Lp1/a1;I)V

    return-void
.end method

.method public static final d(ILkotlin/time/Duration;ZLandroidx/compose/runtime/Composer;II)I
    .locals 6

    and-int/lit8 p4, p5, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move p2, p5

    :cond_0
    new-array p4, p5, [Ljava/lang/Object;

    check-cast p3, Lp1/q;

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lis0/i;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lis0/i;-><init>(I)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lc93/a;

    const/16 v2, 0x30

    invoke-static {p4, v0, p3, v2}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lp1/a1;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    goto :goto_0

    :cond_2
    sget-wide v2, Lis0/z0;->a:J

    :goto_0
    invoke-static {v2, v3}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v0}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v0

    const/4 v2, 0x0

    if-lez v0, :cond_3

    if-nez p2, :cond_3

    const/4 p2, 0x1

    if-le p0, p2, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_6

    const p0, 0x1542a415

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p3, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_4

    if-ne p2, v1, :cond_5

    :cond_4
    new-instance p2, Lis0/z0$a;

    invoke-direct {p2, p1, p4, v2}, Lis0/z0$a;-><init>(Lkotlin/time/Duration;Lp1/a1;Lq83/d;)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Lc93/m;

    invoke-static {p3, p2, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p3, p5}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    const p0, 0x15450076

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p5}, Lp1/q;->q(Z)V

    :goto_2
    invoke-static {p4}, Lis0/z0;->f(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method private static final e()Lp1/a1;
    .locals 2

    new-instance v0, Lp1/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/h1;-><init>(I)V

    return-object v0
.end method

.method private static final f(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final g(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method
