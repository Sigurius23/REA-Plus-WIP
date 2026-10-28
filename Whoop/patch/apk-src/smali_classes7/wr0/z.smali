.class public abstract Lwr0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwr0/z$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001c\u00a8\u0006\""
    }
    d2 = {
        "Lwr0/b0;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lwr0/v;",
        "dateBadge",
        "i",
        "(Lwr0/v;Landroidx/compose/runtime/Composer;I)V",
        "Lwr0/a0;",
        "profile",
        "s",
        "(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lwr0/u;",
        "badge",
        "q",
        "(Lwr0/u;Landroidx/compose/runtime/Composer;I)V",
        "Lwr0/w;",
        "footer",
        "k",
        "(Lwr0/w;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "F",
        "MomentCardFitContentWidth",
        "b",
        "AvatarSize",
        "c",
        "FooterIconSize",
        "community-moments_release"
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

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xaf

    int-to-float v0, v0

    sput v0, Lwr0/z;->a:F

    const/16 v0, 0xa

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lwr0/z;->b:F

    const/4 v0, 0x7

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lwr0/z;->c:F

    return-void
.end method

.method public static synthetic a(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lwr0/z;->t(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwr0/z;->p(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwr0/w;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwr0/z;->l(Lwr0/w;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwr0/z;->u(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwr0/v;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwr0/z;->j(Lwr0/v;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lwr0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwr0/z;->r(Lwr0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/z;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lwr0/z;->o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lwr0/v;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x5b515a1f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, p2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int v3, p2, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p2

    :goto_2
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    if-eq v6, v4, :cond_3

    move v4, v7

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x3

    int-to-float v3, v3

    int-to-float v4, v5

    mul-float/2addr v3, v4

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->r()J

    move-result-wide v8

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v8, v9, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v6, v8

    int-to-float v9, v7

    mul-float/2addr v9, v8

    invoke-static {v3, v6, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v6, v2, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v8, v2, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwr0/v;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->Q()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v10, v10, 0x12

    or-int/lit16 v10, v10, 0xc00

    const v27, 0x2dffa

    move-object/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v11, v6

    move v12, v7

    const-wide/16 v6, 0x0

    move v13, v5

    move-wide/from16 v32, v8

    move-object v9, v4

    move-wide/from16 v4, v32

    const/4 v8, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move/from16 v26, v10

    const/4 v10, 0x0

    move v15, v11

    move/from16 v16, v12

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x1

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v1, v29

    move/from16 v0, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lwr0/v;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, v30

    invoke-virtual {v14, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v4

    const/4 v3, 0x0

    const/4 v14, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lwr0/y;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lwr0/y;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final j(Lwr0/v;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwr0/z;->i(Lwr0/v;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lwr0/w;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x5bc6667b

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v4, v2, 0x3

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v4, v3, :cond_3

    move v3, v12

    goto :goto_3

    :cond_3
    move v3, v13

    :goto_3
    and-int/2addr v2, v12

    invoke-virtual {v5, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v3, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwr0/w;->a()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_7

    const v2, -0x5e4b9d82

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v3, -0x5e4b9d81

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    sget v3, Lwr0/z;->c:F

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v8, Li2/p;

    const/4 v3, 0x5

    invoke-direct {v8, v6, v7, v3}, Li2/p;-><init>(JI)V

    const/16 v10, 0x61b0

    const/16 v11, 0x28

    const/4 v3, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    sget-object v6, Ly2/j;->b:Ly2/b1;

    const/4 v7, 0x0

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v0}, Lwr0/w;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_8

    const v2, -0x5e465123

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    move v0, v13

    goto/16 :goto_8

    :cond_8
    const v3, -0x5e465122

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lwr0/w;->e()Lb91/a;

    move-result-object v3

    if-nez v3, :cond_9

    const v3, -0x60e8b660

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->Q()Lb91/a;

    move-result-object v3

    :goto_6
    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    move-object/from16 v22, v3

    goto :goto_7

    :cond_9
    const v4, -0x60e8bb95

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    goto :goto_6

    :goto_7
    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0x12

    or-int/lit16 v6, v6, 0xc30

    const v27, 0x2d7fa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    move/from16 v26, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v14, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x2

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x1

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lwr0/w;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_a

    const v2, -0x5e416d83

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v14, 0x1

    goto :goto_c

    :cond_a
    const v3, -0x5e416d82

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lwr0/w;->c()Lb91/a;

    move-result-object v3

    if-nez v3, :cond_b

    const v3, 0x2bcda441

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v3

    :goto_a
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v22, v3

    goto :goto_b

    :cond_b
    const v4, 0x2bcd9eaf

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    goto :goto_a

    :goto_b
    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0x12

    or-int/lit16 v6, v6, 0xc30

    const v27, 0x2d7fa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    move/from16 v26, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_c
    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v2, Lsl0/j2;

    const/16 v3, 0x1d

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final l(Lwr0/w;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwr0/z;->k(Lwr0/w;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr0/b0;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x5207db4c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, p5, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v8

    goto :goto_5

    :cond_8
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v0, v11

    :goto_6
    and-int/lit16 v11, v0, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v11, v12, :cond_9

    move v11, v13

    goto :goto_7

    :cond_9
    move v11, v14

    :goto_7
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_26

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_a

    move-object v5, v15

    :cond_a
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_b

    new-instance v7, Lwo1/e0;

    const/16 v9, 0xf

    invoke-direct {v7, v9}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v9

    :goto_8
    invoke-virtual {v6}, Lwr0/b0;->f()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    move-result-object v9

    sget-object v11, Lwr0/z$a;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v11, v9

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f400000    # 0.75f

    if-eq v9, v13, :cond_e

    if-ne v9, v3, :cond_d

    invoke-static {v11, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9, v14, v12}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    goto :goto_9

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    sget v9, Lwr0/z;->a:F

    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9, v14, v12}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    :goto_9
    invoke-virtual {v6}, Lwr0/b0;->i()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    invoke-interface {v5, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v3, 0x3

    int-to-float v13, v3

    int-to-float v2, v2

    invoke-static {v9, v13, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v13, 0x0

    if-eqz v12, :cond_13

    const v9, -0x3d819a

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_f

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_f
    move-object/from16 v16, v9

    check-cast v16, Lj0/i;

    move/from16 p2, v3

    move-object/from16 p1, v4

    const-wide/16 v3, 0x0

    const/4 v9, 0x7

    invoke-static {v3, v4, v9, v14, v13}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v17

    new-instance v3, Li3/i;

    invoke-direct {v3, v14}, Li3/i;-><init>(I)V

    and-int/lit16 v4, v0, 0x380

    if-ne v4, v8, :cond_10

    const/4 v4, 0x1

    goto :goto_a

    :cond_10
    move v4, v14

    :goto_a
    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_11

    move-object/from16 v4, p1

    if-ne v8, v4, :cond_12

    :cond_11
    new-instance v8, Lcw2/b;

    const/4 v4, 0x7

    invoke-direct {v8, v7, v12, v4}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v8

    check-cast v20, Lc93/a;

    const/16 v21, 0xc

    const/16 v18, 0x0

    move-object/from16 v19, v3

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v4, v15

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v15, v3

    goto :goto_b

    :cond_13
    move/from16 p2, v3

    move-object v4, v15

    const v3, -0x39b7e2

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_b
    invoke-interface {v2, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_14

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    :cond_15
    invoke-static {v8, v10, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v10, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v8, v7

    invoke-virtual {v6}, Lwr0/b0;->h()Lkd1/o;

    move-result-object v7

    if-nez v7, :cond_17

    const v2, 0xe65f2a7

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move/from16 v21, v0

    move-object/from16 v17, v5

    move-object/from16 v18, v8

    move-object/from16 v22, v9

    move-object v2, v12

    move-object v1, v13

    move v5, v14

    move-object v0, v15

    :goto_d
    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_17
    const v2, 0xe65f2a8

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget v11, Lkd1/o;->a:I

    move-object/from16 v17, v12

    const/4 v12, 0x3

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v2, v17

    move-object/from16 v22, v19

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object v8, v15

    const/16 v15, 0x61b0

    move-object/from16 v9, v16

    const/16 v16, 0x68

    move-object v11, v8

    const/4 v8, 0x0

    move v12, v14

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v20

    move-object/from16 v17, v5

    move/from16 v5, v19

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Li2/t;->b:Li2/s;

    sget-wide v11, Li2/x;->m:J

    new-instance v9, Li2/x;

    invoke-direct {v9, v11, v12}, Li2/x;-><init>(J)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->w()J

    move-result-wide v11

    new-instance v14, Li2/x;

    invoke-direct {v14, v11, v12}, Li2/x;-><init>(J)V

    filled-new-array {v9, v14}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v11, 0xe

    const/4 v12, 0x0

    invoke-static {v8, v9, v12, v12, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x6

    invoke-static {v7, v8, v9, v12, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v10, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x2

    int-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_18

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_18
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    :cond_19
    move-object/from16 v8, v22

    goto :goto_10

    :cond_1a
    move-object/from16 v8, v22

    goto :goto_11

    :goto_10
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_11
    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->J:Lb2/l;

    sget-object v11, Ll0/m;->g:Ll0/h;

    const/16 v12, 0x36

    invoke-static {v11, v9, v10, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_1b

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v10, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    invoke-static {v11, v10, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lwr0/b0;->e()Lwr0/v;

    move-result-object v0

    const-string v1, "invalid weight; must be greater than zero"

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_1e

    const v0, -0x7cf03f4e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lwr0/b0;->e()Lwr0/v;

    move-result-object v0

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v4}, Lwr0/z;->i(Lwr0/v;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1e
    invoke-virtual {v6}, Lwr0/b0;->j()Lwr0/a0;

    move-result-object v0

    if-eqz v0, :cond_21

    const v0, -0x7cf0349b

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lwr0/b0;->j()Lwr0/a0;

    move-result-object v7

    float-to-double v8, v13

    cmpl-double v0, v8, v2

    if-lez v0, :cond_1f

    const/4 v0, 0x1

    goto :goto_13

    :cond_1f
    move v0, v5

    :goto_13
    if-nez v0, :cond_20

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_20
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v9, v13, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v4, Lkd1/o;->a:I

    or-int/2addr v0, v4

    sget v4, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    or-int/2addr v0, v4

    shr-int/lit8 v4, v21, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int v11, v0, v4

    const/4 v12, 0x0

    move-object/from16 v8, v18

    invoke-static/range {v7 .. v12}, Lwr0/z;->s(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_21
    const v0, -0x7cf01786

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v5

    invoke-static {v4, v0, v10, v5}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_14
    invoke-virtual {v6}, Lwr0/b0;->c()Lwr0/u;

    move-result-object v0

    if-nez v0, :cond_22

    const v0, -0x21117ea7

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    :goto_15
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    goto :goto_16

    :cond_22
    const v4, -0x21117ea6

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v4}, Lwr0/z;->q(Lwr0/u;Landroidx/compose/runtime/Composer;I)V

    goto :goto_15

    :goto_16
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    float-to-double v7, v13

    cmpl-double v2, v7, v2

    if-lez v2, :cond_23

    move v2, v0

    goto :goto_17

    :cond_23
    move v2, v5

    :goto_17
    if-nez v2, :cond_24

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_24
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v13, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v6}, Lwr0/b0;->g()Lwr0/w;

    move-result-object v0

    if-nez v0, :cond_25

    const v0, 0x46c6351f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    :goto_18
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    goto :goto_19

    :cond_25
    const v1, 0x46c63520    # 25370.562f

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    sget v1, Lkd1/o;->a:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v1, v2

    or-int/2addr v1, v2

    sget v2, Lb91/a;->d:I

    or-int/2addr v1, v2

    or-int/2addr v1, v2

    invoke-static {v0, v10, v1}, Lwr0/z;->k(Lwr0/w;Landroidx/compose/runtime/Composer;I)V

    goto :goto_18

    :goto_19
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    goto :goto_1a

    :cond_26
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v9

    :goto_1a
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_27

    new-instance v0, Lwr0/f;

    const/4 v3, 0x3

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwr0/z;->m(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lwr0/u;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x7102d269

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int/2addr v3, v1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    if-eq v6, v5, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lwr0/u;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v6, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    sget-object v13, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v14

    const/high16 v4, 0x30000000

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v28, v5, v4

    const/16 v30, 0x0

    const v31, 0x7ff9f4

    const/4 v5, 0x0

    move-object/from16 v27, v2

    move-object v2, v3

    move-wide v3, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    invoke-static/range {v2 .. v31}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    goto :goto_4

    :cond_4
    move-object/from16 v27, v2

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v3, Lsl0/j2;

    const/16 v4, 0x1c

    invoke-direct {v3, v0, v1, v4}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final r(Lwr0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwr0/z;->q(Lwr0/u;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr0/a0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x2b3cd34f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v4, 0x30

    const/16 v5, 0x20

    if-nez v3, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v15, 0x1

    const/4 v11, 0x0

    if-eq v7, v8, :cond_8

    move v7, v15

    goto :goto_6

    :cond_8
    move v7, v11

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_19

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object/from16 v3, v16

    goto :goto_7

    :cond_9
    move-object v3, v6

    :goto_7
    invoke-virtual {v1}, Lwr0/a0;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    if-eqz v6, :cond_e

    const v7, 0x64b1d71a

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_a

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_a
    move-object/from16 v17, v7

    check-cast v17, Lj0/i;

    const-wide/16 v9, 0x0

    const/4 v7, 0x7

    const/4 v13, 0x0

    invoke-static {v9, v10, v7, v11, v13}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v18

    new-instance v7, Li3/i;

    invoke-direct {v7, v11}, Li3/i;-><init>(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_b

    move v0, v15

    goto :goto_8

    :cond_b
    move v0, v11

    :goto_8
    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_c

    if-ne v5, v8, :cond_d

    :cond_c
    new-instance v5, Lcw2/b;

    const/16 v0, 0x8

    invoke-direct {v5, v2, v6, v0}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v21, v5

    check-cast v21, Lc93/a;

    const/16 v22, 0xc

    const/16 v19, 0x0

    move-object/from16 v20, v7

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v13, v16

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    move-object/from16 v13, v16

    const v0, 0x64b55089

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move-object v0, v13

    :goto_9
    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->K:Lb2/l;

    int-to-float v6, v15

    const/16 v7, 0x8

    int-to-float v14, v7

    const/16 v7, 0x36

    invoke-static {v6, v14, v5, v12, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    invoke-static {v6, v12, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v12, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v5

    invoke-virtual {v1}, Lwr0/a0;->b()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_12

    const v5, -0x7fcebb4d

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move-object/from16 p2, v3

    move-object/from16 v31, v7

    move-object v2, v9

    move v1, v11

    move/from16 v17, v14

    move-object v3, v0

    move-object v0, v8

    goto :goto_b

    :cond_12
    const v6, -0x7fcebb4c

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    move-object v6, v9

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v31, v12

    move-object v12, v0

    move-object v0, v8

    move-object/from16 v8, v31

    move-object/from16 v31, v17

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object/from16 v27, v8

    sget v6, Lwr0/z;->b:F

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lt0/j;->a:Lt0/i;

    invoke-static {v6, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x6030

    move v6, v14

    const/16 v14, 0x68

    move v8, v6

    const/4 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 p2, v3

    move-object v3, v12

    move-object/from16 v2, v16

    move/from16 v1, v18

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_b
    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_13

    const/4 v11, 0x1

    goto :goto_c

    :cond_13
    move v11, v1

    :goto_c
    if-nez v11, :cond_14

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v5, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v7, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v7

    mul-float v5, v5, v17

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v5, v7, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_15

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    move-object/from16 v0, v31

    invoke-static {v7, v12, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v12, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwr0/a0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v12, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0x12

    or-int/lit16 v6, v6, 0xc30

    const v30, 0x2d7fa

    move/from16 v29, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-virtual/range {p0 .. p0}, Lwr0/a0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_18

    const v0, -0x33e95e67    # -3.9487076E7f

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v0, 0x1

    goto :goto_f

    :cond_18
    const v6, -0x33e95e66    # -3.948708E7f

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {v5, v12, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    goto :goto_10

    :cond_19
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v6

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lwr0/f;

    const/4 v6, 0x4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Ll83/e;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwr0/z;->s(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
