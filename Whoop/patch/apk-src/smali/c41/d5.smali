.class public abstract Lc41/d5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lc41/e5;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lc41/e5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lc41/e5;",
        "splitContainerCardHeaderTitleLongTextSample",
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


# static fields
.field private static final a:Lc41/e5;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    new-instance v0, Lc41/e5;

    new-instance v1, Lf01/u;

    new-instance v5, Lf01/q0;

    sget-object v12, Lgz0/m0;->MEMBERS_LIKE_YOU:Lgz0/m0;

    sget-object v13, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/4 v14, 0x0

    const-string v2, "Membership & Billing Settings"

    invoke-direct {v5, v12, v14, v2, v13}, Lf01/q0;-><init>(Lgz0/m0;Lkd1/o;Ljava/lang/String;Lgz0/m0;)V

    invoke-static {}, Lsz0/j1;->i()Lsz0/k1;

    move-result-object v15

    const-string v2, "My Account"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v2, "Save on your extension"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v21, Lb91/c;->B1:Lb91/c;

    sget-object v22, Lb91/c;->B4:Lb91/c;

    const/16 v27, 0x799

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v15 .. v28}, Lsz0/k1;->b(Lsz0/k1;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILjava/lang/Object;)Lsz0/k1;

    move-result-object v6

    new-instance v8, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v8

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x80

    const/4 v11, 0x0

    const-string v2, "my_account_long_title"

    const-string v3, ""

    const/4 v4, 0x0

    const-string v7, "MY_ACCOUNT"

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lf01/u;

    new-instance v3, Lf01/q0;

    const-string v4, "Refer Friends & Family"

    invoke-direct {v3, v12, v14, v4, v13}, Lf01/q0;-><init>(Lgz0/m0;Lkd1/o;Ljava/lang/String;Lgz0/m0;)V

    invoke-static {}, Lsz0/j1;->i()Lsz0/k1;

    move-result-object v19

    const-string v4, "Get a free month"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "Invite a friend, earn rewards"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v24, Ly81/f;->COACH_BLUE:Ly81/f;

    const/16 v31, 0x789

    const/16 v32, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v25, v21

    move-object/from16 v26, v22

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    invoke-static/range {v19 .. v32}, Lsz0/k1;->b(Lsz0/k1;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILjava/lang/Object;)Lsz0/k1;

    move-result-object v28

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v32, 0x80

    const/16 v33, 0x0

    const-string v24, "invite_friends_long_title"

    const-string v25, ""

    const/16 v26, 0x0

    const-string v29, "INVITE_FRIENDS"

    const/16 v31, 0x0

    move-object/from16 v23, v2

    move-object/from16 v27, v3

    move-object/from16 v30, v4

    invoke-direct/range {v23 .. v33}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lc41/e5;-><init>(Lm91/u;Lm91/u;Z)V

    sput-object v0, Lc41/d5;->a:Lc41/e5;

    return-void
.end method

.method public static synthetic a(Lc41/e5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc41/d5;->i(Lc41/e5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/d5;->h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/d5;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/d5;->g(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc41/e5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/e5;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "itemState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x4aa7ed7e    # 5502655.0f

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_17

    if-eqz v2, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_7

    new-instance v2, La11/g;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, La11/g;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, v2

    goto :goto_6

    :cond_8
    move-object v5, v3

    :goto_6
    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/a1;->x:Ll0/a1;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x6

    invoke-static {v3, v4, v6, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 p1, v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_8

    :cond_a
    move/from16 p1, v13

    :goto_8
    invoke-static {v4, v6, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v6, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v10, v12

    const-wide/16 v16, 0x0

    cmpl-double v2, v10, v16

    const-string v10, "invalid weight; must be greater than zero"

    if-lez v2, :cond_c

    goto :goto_9

    :cond_c
    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v12, v11

    if-lez v4, :cond_d

    move v4, v11

    :goto_a
    const/4 v8, 0x1

    goto :goto_b

    :cond_d
    move v4, v12

    goto :goto_a

    :goto_b
    invoke-direct {v2, v4, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lb2/e;->w:Lb2/m;

    move/from16 v18, v11

    const/4 v8, 0x0

    invoke-static {v4, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 v19, v13

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v6, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_e

    :cond_f
    :goto_d
    move-object/from16 v11, v19

    goto :goto_f

    :cond_10
    :goto_e
    invoke-static {v8, v6, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v6, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lc41/e5;->f()Lm91/u;

    move-result-object v2

    move-object v8, v4

    new-instance v4, Lc41/c5;

    const/4 v12, 0x0

    invoke-direct {v4, v12}, Lc41/c5;-><init>(I)V

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    move-object v12, v8

    const/4 v8, 0x2

    move-object v13, v3

    const/4 v3, 0x0

    move-object/from16 v21, v7

    move v7, v0

    move-object/from16 v0, v21

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v19, v5

    move/from16 v20, v7

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lc41/e5;->e()Z

    move-result v2

    if-eqz v2, :cond_11

    const v2, -0x66d36683

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v8

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    move/from16 v4, p1

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    const/4 v8, 0x6

    const/16 v9, 0xc

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_10
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_11

    :cond_11
    const/4 v8, 0x0

    const v2, -0x66d06c78

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    float-to-double v3, v2

    cmpl-double v3, v3, v16

    if-lez v3, :cond_12

    goto :goto_12

    :cond_12
    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v2, v18

    if-lez v4, :cond_13

    move/from16 v2, v18

    :cond_13
    const/4 v8, 0x1

    invoke-direct {v3, v2, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v8, 0x0

    invoke-static {v12, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_14

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_14
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v6, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_15

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    invoke-static {v4, v6, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v6, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lc41/e5;->c()Lm91/u;

    move-result-object v2

    new-instance v4, Lc41/c5;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Lc41/c5;-><init>(I)V

    const/4 v8, 0x2

    const/4 v3, 0x0

    move-object/from16 v5, v19

    move/from16 v7, v20

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    move-object v3, v5

    goto :goto_14

    :cond_17
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_18

    new-instance v0, Lbz0/a;

    const/4 v5, 0x1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lbz0/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0xec63544

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x64d7bc2d

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final i(Lc41/e5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lc41/d5;->e(Lc41/e5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
