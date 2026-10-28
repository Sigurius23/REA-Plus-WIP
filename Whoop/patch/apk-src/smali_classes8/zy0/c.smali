.class public abstract Lzy0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lzy0/d;",
        "type",
        "Li2/x;",
        "color",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lzy0/d;JLandroidx/compose/runtime/Composer;II)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lzy0/d;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzy0/c;->c(Landroidx/compose/ui/Modifier;Lzy0/d;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lzy0/d;JLandroidx/compose/runtime/Composer;II)V
    .locals 8

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x1488c6c7

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_2
    move v2, p5

    :goto_1
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    and-int/lit16 v3, p5, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v0, p2, p3}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_3

    :cond_5
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_6
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v4, :cond_7

    move v3, v7

    goto :goto_4

    :cond_7
    move v3, v6

    :goto_4
    and-int/2addr v2, v7

    invoke-virtual {v0, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v1, :cond_8

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_8
    invoke-virtual {p1}, Lzy0/d;->getStartCornerPadding-D9Ej5fM()F

    move-result v1

    invoke-virtual {p1}, Lzy0/d;->getStartCornerPadding-D9Ej5fM()F

    move-result v2

    invoke-virtual {p1}, Lzy0/d;->getEndCornerPadding-D9Ej5fM()F

    move-result v3

    invoke-virtual {p1}, Lzy0/d;->getEndCornerPadding-D9Ej5fM()F

    move-result v4

    invoke-static {v1, v3, v4, v2}, Lt0/j;->f(FFFF)Lt0/i;

    move-result-object v1

    invoke-static {p0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v1, p2, p3, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v0, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    move-object v1, p0

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance v0, Lbr2/g;

    const/4 v7, 0x6

    move-object v2, p1

    move-wide v3, p2

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lbr2/g;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Enum;JIII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lzy0/d;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lzy0/c;->b(Landroidx/compose/ui/Modifier;Lzy0/d;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
