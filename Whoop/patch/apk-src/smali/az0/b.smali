.class public abstract Laz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li91/a;",
        "background",
        "Lk91/a;",
        "roundedCorners",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Laz0/b;->c(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x6448a6fd

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v5, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, p4, 0x6

    if-nez v5, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int/2addr v5, p4

    goto :goto_1

    :cond_2
    move v5, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, p5, 0x2

    if-nez v6, :cond_3

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, p4, 0x180

    if-nez v6, :cond_6

    and-int/lit8 v6, p5, 0x4

    if-nez v6, :cond_5

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_7

    move v6, v9

    goto :goto_4

    :cond_7
    move v6, v8

    :goto_4
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v5, p4, 0x1

    if-eqz v5, :cond_9

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_6

    :cond_9
    :goto_5
    if-eqz v1, :cond_a

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_a
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_b

    sget-object p1, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v5

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object p1

    :cond_b
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_c

    sget-object p2, Lk91/a;->e:Lk91/a$a;

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v5

    int-to-float v3, v3

    mul-float/2addr v1, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {p2, v1, v3, v2, v5}, Lk91/a$a;->d(Lk91/a$a;FFILjava/lang/Object;)Lk91/a;

    move-result-object p2

    :cond_c
    :goto_6
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-virtual {p2}, Lk91/a;->c()Lt0/i;

    move-result-object v1

    invoke-static {p0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, p1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v0, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_e

    new-instance v0, Laz0/a;

    const/4 v6, 0x0

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
