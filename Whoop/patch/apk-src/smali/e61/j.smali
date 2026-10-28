.class public final Le61/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le61/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Le61/j;",
        "",
        "<init>",
        "()V",
        "Lj61/c;",
        "graphAnnotationState",
        "Ll83/a0;",
        "b",
        "(Lj61/c;Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le61/j;Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Le61/j;->c(Le61/j;Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Le61/j;Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {p0, p1, p3, p2}, Le61/j;->b(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "graphAnnotationState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x752e132c

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v1, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    move v2, v4

    :goto_3
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {p2, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lj61/c;->l()Lj61/e;

    move-result-object v2

    sget-object v5, Le61/j$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    if-eq v2, v3, :cond_6

    if-eq v2, v1, :cond_5

    const/4 v1, 0x3

    if-ne v2, v1, :cond_4

    const v1, 0x5ccf17f2

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, Le61/m;->p(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_4
    const p1, -0x1e09fd03

    invoke-static {p1, p2, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p1

    throw p1

    :cond_5
    const v1, 0x5ccd5273

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, Le61/m;->n(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const v1, 0x5ccb8572

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, Le61/m;->o(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, La11/j;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method
