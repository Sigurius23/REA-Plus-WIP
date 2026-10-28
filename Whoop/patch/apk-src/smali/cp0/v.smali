.class public abstract Lcp0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcp0/v$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/navigation/DrawerPresentation;",
        "presentation",
        "Lcp0/l;",
        "e",
        "(Lcom/whoop/navigation/DrawerPresentation;)Lcp0/l;",
        "",
        "halfDrawerExpansionSpanPx",
        "fullDrawerExpansionSpanPx",
        "barExpansionSpanPx",
        "gaugeExpansionSpanPx",
        "Lcp0/t;",
        "c",
        "(FFFFLandroidx/compose/runtime/Composer;II)Lcp0/t;",
        "Ld0/e2;",
        "a",
        "Ld0/e2;",
        "COACH_DRAWER_SETTLE_ANIMATION",
        "coach-everywhere_release"
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
.field private static final a:Ld0/e2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lcp0/v;->a:Ld0/e2;

    return-void
.end method

.method public static synthetic a(Lcp0/t;FFFF)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcp0/v;->d(Lcp0/t;FFFF)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ld0/e2;
    .locals 1

    sget-object v0, Lcp0/v;->a:Ld0/e2;

    return-object v0
.end method

.method public static final c(FFFFLandroidx/compose/runtime/Composer;II)Lcp0/t;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v5, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-ne p3, p6, :cond_1

    new-instance p3, Lcp0/t;

    invoke-direct {p3}, Lcp0/t;-><init>()V

    invoke-virtual {p4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p3

    check-cast v1, Lcp0/t;

    and-int/lit8 p3, p5, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 v0, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-le p3, v0, :cond_2

    invoke-virtual {p4, p0}, Lp1/q;->d(F)Z

    move-result p3

    if-nez p3, :cond_3

    :cond_2
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v0, :cond_4

    :cond_3
    move p3, v2

    goto :goto_0

    :cond_4
    move p3, v3

    :goto_0
    and-int/lit8 v0, p5, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v4, 0x20

    if-le v0, v4, :cond_5

    invoke-virtual {p4, p1}, Lp1/q;->d(F)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    and-int/lit8 v0, p5, 0x30

    if-ne v0, v4, :cond_7

    :cond_6
    move v0, v2

    goto :goto_1

    :cond_7
    move v0, v3

    :goto_1
    or-int/2addr p3, v0

    and-int/lit16 v0, p5, 0x380

    xor-int/lit16 v0, v0, 0x180

    const/16 v4, 0x100

    if-le v0, v4, :cond_8

    invoke-virtual {p4, p2}, Lp1/q;->d(F)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    and-int/lit16 v0, p5, 0x180

    if-ne v0, v4, :cond_a

    :cond_9
    move v0, v2

    goto :goto_2

    :cond_a
    move v0, v3

    :goto_2
    or-int/2addr p3, v0

    and-int/lit16 v0, p5, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/16 v4, 0x800

    if-le v0, v4, :cond_b

    invoke-virtual {p4, v5}, Lp1/q;->d(F)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_b
    and-int/lit16 p5, p5, 0xc00

    if-ne p5, v4, :cond_c

    goto :goto_3

    :cond_c
    move v2, v3

    :cond_d
    :goto_3
    or-int/2addr p3, v2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_e

    if-ne p5, p6, :cond_f

    :cond_e
    new-instance v0, Lcp0/u;

    move v2, p0

    move v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lcp0/u;-><init>(Lcp0/t;FFFF)V

    invoke-virtual {p4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, v0

    :cond_f
    check-cast p5, Lc93/a;

    invoke-static {p5, p4}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    return-object v1
.end method

.method private static final d(Lcp0/t;FFFF)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcp0/t;->v(FFFF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lcom/whoop/navigation/DrawerPresentation;)Lcp0/l;
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lcp0/v$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    if-eq p0, v0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lcp0/l;->GaugeLevel:Lcp0/l;

    return-object p0

    :cond_3
    sget-object p0, Lcp0/l;->HalfDrawer:Lcp0/l;

    return-object p0

    :cond_4
    :goto_1
    sget-object p0, Lcp0/l;->FullDrawer:Lcp0/l;

    return-object p0
.end method
