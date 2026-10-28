.class public abstract Lsg2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a#\u0010\u001c\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lrg2/n;",
        "backgroundState",
        "",
        "hasStatusMessage",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "j",
        "(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "h",
        "(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "Lw41/w;",
        "userLocation",
        "p",
        "(Lw41/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "r",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "Ln71/q;",
        "hrState",
        "",
        "contentAlpha",
        "n",
        "(Ln71/q;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "l",
        "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "horizontal",
        "top",
        "s",
        "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;",
        "a",
        "F",
        "preSessionBackgroundTopFadeHeight",
        "b",
        "preSessionBackgroundBottomFadeHeight",
        "start-activity_release"
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
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x78

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lsg2/p;->a:F

    const/16 v0, 0x23

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lsg2/p;->b:F

    return-void
.end method

.method public static synthetic a(Ln71/q;FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsg2/p;->o(Ln71/q;FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrg2/n;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsg2/p;->k(Lrg2/n;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsg2/p;->u(Ly2/j1;IILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(FFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsg2/p;->t(FFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lrg2/n;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsg2/p;->i(Lrg2/n;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lw41/w;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsg2/p;->q(Lw41/w;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsg2/p;->m(FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, -0x186f7680

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x0

    if-eq v1, v2, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz p1, :cond_7

    const v1, 0x3f0ccccd    # 0.55f

    goto :goto_5

    :cond_7
    const v1, 0x3f333333    # 0.7f

    :goto_5
    instance-of v2, p0, Lrg2/n$c;

    if-eqz v2, :cond_9

    const v0, 0x45945a13

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    move-object v0, p0

    check-cast v0, Lrg2/n$c;

    invoke-virtual {v0}, Lrg2/n$c;->a()Lw41/w;

    move-result-object v0

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_6
    invoke-static {v1, p2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Lw41/w;->c:I

    invoke-static {v0, v1, p3, v2}, Lsg2/p;->p(Lw41/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    instance-of v2, p0, Lrg2/n$b;

    if-eqz v2, :cond_a

    const v2, 0x45947824

    invoke-virtual {p3, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Lrg2/n$b;

    invoke-virtual {v2}, Lrg2/n$b;->a()Ln71/q;

    move-result-object v2

    sget v4, Ln71/q;->d:I

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v4

    invoke-static {v2, v1, p2, p3, v0}, Lsg2/p;->n(Ln71/q;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    sget-object v2, Lrg2/n$a;->a:Lrg2/n$a;

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const v2, 0x459493f8

    invoke-virtual {p3, v2}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p2, p3, v0}, Lsg2/p;->l(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const p0, 0x459451ff

    invoke-static {p0, p3, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_c
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_d

    new-instance v0, Lsg2/o;

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final i(Lrg2/n;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsg2/p;->h(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "backgroundState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x49b03ffd

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit16 v9, v2, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_6

    :cond_8
    move v9, v11

    :goto_6
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_f

    if-eqz v5, :cond_9

    move v6, v11

    :cond_9
    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_a

    move-object v8, v5

    :cond_a
    int-to-float v3, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-static {v8, v3, v3}, Lsg2/p;->s(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Lsg2/p;->r(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_d

    :cond_c
    invoke-static {v10, v0, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v9, v2, 0xe

    or-int/lit16 v9, v9, 0x180

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v9

    invoke-static {v1, v6, v3, v0, v2}, Lsg2/p;->h(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    if-eqz v6, :cond_e

    const v2, -0x235b2f4

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "pre_session_background_status_message_scrim"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->r()J

    move-result-wide v9

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v9, v10, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    const v2, -0x231f5b5

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    :goto_9
    move v2, v6

    move-object v3, v8

    goto :goto_a

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lbg0/h;

    const/16 v6, 0x1d

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final k(Lrg2/n;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsg2/p;->j(Lrg2/n;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x5af8091c

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->d(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p0, p2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Ln71/o;->B(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lbd1/s;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p3, v1}, Lbd1/s;-><init>(FLjava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final m(FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsg2/p;->l(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ln71/q;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x2d8ec23d

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v14, 0x0

    if-eq v5, v6, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    move v5, v14

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v10, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    :cond_9
    invoke-static {v9, v10, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v10, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v9, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/16 v12, 0xe

    move/from16 v18, v5

    move-object v5, v6

    move-object/from16 v17, v7

    const-wide/16 v6, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move/from16 v21, v0

    move-object/from16 v2, v16

    move-object/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    invoke-static/range {v5 .. v12}, Ln71/o;->B(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    sget-object v5, Lb2/e;->x:Lb2/m;

    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v6, v14, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Lsg2/v;->Q(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0xc

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v5, v8, v7, v9}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v10, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {v6, v10, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v10, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v6, 0x0

    invoke-static {v0, v6, v1}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Ln71/q;->d:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x6

    shl-int/lit8 v2, v21, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    move-object/from16 v2, p0

    invoke-static {v0, v2, v10, v1, v6}, Ln71/o;->F(Landroidx/compose/ui/Modifier;Ln71/q;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    move-object v2, v1

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lcom/whoop/bot/settings/h;

    const/4 v5, 0x4

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v1, v2

    move/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/bot/settings/h;-><init>(Ljava/lang/Object;FLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final o(Ln71/q;FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsg2/p;->n(Ln71/q;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lw41/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, -0x7f0e0462

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lw41/a;->n()Lp1/t1;

    move-result-object v0

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/p;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, p1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Lsg2/a;->a:Lsg2/a;

    invoke-virtual {v2}, Lsg2/a;->b()Lc93/m;

    move-result-object v4

    sget v2, Lw41/w;->c:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit16 v2, v2, 0xd80

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v2, p0

    invoke-interface/range {v0 .. v6}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_6
    move-object v2, p0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance p2, Lq81/e;

    const/16 v0, 0x19

    invoke-direct {p2, v2, p1, p3, v0}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final q(Lw41/w;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsg2/p;->p(Lw41/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    sget v0, Lsg2/p;->a:F

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget v0, Lsg2/p;->b:F

    invoke-static {p0, v0}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Lsg2/n;

    invoke-direct {v0, p1, p2}, Lsg2/n;-><init>(FF)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final t(FFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 4

    const-string v0, "$this$layout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ly3/c;->F(F)I

    move-result p0

    invoke-interface {p2, p1}, Ly3/c;->F(F)I

    move-result p1

    iget-wide v0, p4, Ly3/a;->a:J

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result v0

    mul-int/lit8 v1, p0, 0x2

    add-int/2addr v1, v0

    iget-wide v2, p4, Ly3/a;->a:J

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result p4

    add-int/2addr p4, p1

    invoke-static {v1, v1, p4, p4}, Ly3/a;->a(IIII)J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p3

    invoke-static {v2, v3}, Ly3/a;->i(J)I

    move-result p4

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result v0

    new-instance v1, Ll1/y1;

    const/4 v2, 0x1

    invoke-direct {v1, p3, p0, p1, v2}, Ll1/y1;-><init>(Ly2/j1;III)V

    sget-object p0, Lm83/z;->w:Lm83/z;

    invoke-interface {p2, p4, v0, p0, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    neg-int p1, p1

    neg-int p2, p2

    const/4 v0, 0x0

    invoke-virtual {p3, p0, p1, p2, v0}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
