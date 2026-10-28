.class public abstract Lis0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lis0/z$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a\u0014\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\t\u001aG\u0010\u0014\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a7\u0010\u0017\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "id",
        "u",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "t",
        "s",
        "Lf0/r1;",
        "Ll83/a0;",
        "x",
        "(Lf0/r1;Lq83/d;)Ljava/lang/Object;",
        "v",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "Lis0/e;",
        "comments",
        "scrollState",
        "Lkotlin/Function1;",
        "Lis0/r0;",
        "onEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "comment",
        "l",
        "(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/o;",
        "a",
        "J",
        "EMOJI_ONLY_COMMENT_SIZE",
        "b",
        "EMOJI_ONLY_COMMENT_LINE_HEIGHT",
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

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x38

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v0

    sput-wide v0, Lis0/z;->a:J

    invoke-static {v0, v1}, Lv63/c;->a(J)V

    const-wide v2, 0xff00000000L

    and-long/2addr v2, v0

    const/high16 v4, 0x3fa00000    # 1.25f

    invoke-static {v0, v1, v2, v3, v4}, Ld13/a;->d(JJF)J

    move-result-wide v0

    sput-wide v0, Lis0/z;->b:J

    return-void
.end method

.method public static synthetic a(Lis0/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/z;->j(Lis0/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lis0/z;->k(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lis0/z;->p(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lis0/z;->n(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(J)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/z;->y(J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lis0/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis0/z;->m(Lis0/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lis0/z;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lf0/r1;)I
    .locals 0

    invoke-static {p0}, Lis0/z;->w(Lf0/r1;)I

    move-result p0

    return p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/List<",
            "Lis0/e;",
            ">;",
            "Lf0/r1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "comments"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x5568160

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v5, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move v10, v8

    goto :goto_3

    :cond_5
    move-object/from16 v7, p2

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v6, v10

    goto :goto_4

    :cond_7
    move-object/from16 v7, p2

    :goto_4
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v6, v12

    :goto_6
    and-int/lit16 v12, v6, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_b

    move v12, v15

    goto :goto_7

    :cond_b
    move v12, v14

    :goto_7
    and-int/lit8 v13, v6, 0x1

    invoke-virtual {v9, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_2e

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v12, v5, 0x1

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_e

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_d

    and-int/lit16 v6, v6, -0x381

    :cond_d
    move-object v0, v4

    move v3, v6

    move-object v4, v7

    goto :goto_b

    :cond_e
    :goto_8
    if-eqz v0, :cond_f

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_f
    move-object v0, v4

    :goto_9
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_10

    invoke-static {v14, v9, v15}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    and-int/lit16 v6, v6, -0x381

    goto :goto_a

    :cond_10
    move-object v4, v7

    :goto_a
    if-eqz v10, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_11

    new-instance v7, Lis0/y;

    invoke-direct {v7, v3}, Lis0/y;-><init>(I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v3, v7

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v11, v3

    :cond_12
    move v3, v6

    :goto_b
    invoke-virtual {v9}, Lp1/q;->r()V

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lis0/e;

    const/4 v7, 0x0

    if-eqz v6, :cond_14

    invoke-virtual {v6}, Lis0/e;->j()Z

    move-result v10

    if-eqz v10, :cond_13

    goto :goto_c

    :cond_13
    move-object v6, v7

    :goto_c
    if-eqz v6, :cond_14

    invoke-virtual {v6}, Lis0/e;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :cond_14
    move-object v6, v7

    :goto_d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v13, :cond_15

    new-instance v10, Ljava/util/LinkedHashSet;

    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v10, Ljava/util/Set;

    sget-object v12, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v9}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v12

    iget-object v12, v12, Ll0/c2;->c:Ll0/b;

    iget-object v12, v12, Ll0/b;->d:Lp1/k1;

    invoke-virtual {v12}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    and-int/lit16 v14, v3, 0x380

    xor-int/lit16 v14, v14, 0x180

    if-le v14, v8, :cond_16

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_17

    :cond_16
    and-int/lit16 v1, v3, 0x180

    if-ne v1, v8, :cond_18

    :cond_17
    const/4 v1, 0x1

    goto :goto_e

    :cond_18
    const/4 v1, 0x0

    :goto_e
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_19

    if-ne v8, v13, :cond_1a

    :cond_19
    new-instance v8, Lis0/z$a;

    invoke-direct {v8, v4, v7}, Lis0/z$a;-><init>(Lf0/r1;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v8, Lc93/m;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v8, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v1, v8

    const/16 v8, 0x100

    if-le v14, v8, :cond_1b

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_1c

    :cond_1b
    and-int/lit16 v7, v3, 0x180

    if-ne v7, v8, :cond_1d

    :cond_1c
    const/4 v7, 0x1

    goto :goto_f

    :cond_1d
    const/4 v7, 0x0

    :goto_f
    or-int/2addr v1, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_1e

    if-ne v7, v13, :cond_1f

    :cond_1e
    new-instance v7, Lis0/z$b;

    const/4 v1, 0x0

    invoke-direct {v7, v6, v10, v4, v1}, Lis0/z$b;-><init>(Ljava/lang/String;Ljava/util/Set;Lf0/r1;Lq83/d;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v7, Lc93/m;

    invoke-static {v9, v7, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9, v15}, Lp1/q;->h(Z)Z

    move-result v1

    const/16 v8, 0x100

    if-le v14, v8, :cond_20

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_21

    :cond_20
    and-int/lit16 v6, v3, 0x180

    if-ne v6, v8, :cond_22

    :cond_21
    const/4 v6, 0x1

    goto :goto_10

    :cond_22
    const/4 v6, 0x0

    :goto_10
    or-int/2addr v1, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_23

    if-ne v6, v13, :cond_24

    :cond_23
    new-instance v6, Lis0/z$c;

    const/4 v1, 0x0

    invoke-direct {v6, v15, v4, v1}, Lis0/z$c;-><init>(ZLf0/r1;Lq83/d;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v6, Lc93/m;

    invoke-static {v9, v6, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v8, 0x100

    if-le v14, v8, :cond_25

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    :cond_25
    and-int/lit16 v1, v3, 0x180

    if-ne v1, v8, :cond_27

    :cond_26
    const/4 v1, 0x1

    goto :goto_11

    :cond_27
    const/4 v1, 0x0

    :goto_11
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_28

    if-ne v6, v13, :cond_29

    :cond_28
    new-instance v6, Lis0/z$d;

    const/4 v1, 0x0

    invoke-direct {v6, v4, v1}, Lis0/z$d;-><init>(Lf0/r1;Lq83/d;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v6, Lc93/m;

    invoke-static {v9, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "ReactionsCommentList"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v6, 0xe

    invoke-static {v1, v4, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v18, v1, v6

    const-wide/high16 v7, 0x400c000000000000L    # 3.5

    double-to-float v1, v7

    mul-float v21, v1, v6

    const/16 v22, 0x2

    const/16 v19, 0x0

    move/from16 v20, v18

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x3

    int-to-float v7, v12

    mul-float/2addr v7, v6

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v6, v7, v9, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_2a

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_2a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_12
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_2b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2c

    :cond_2b
    invoke-static {v7, v9, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x45cb818

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lis0/e;

    const v6, 0x5517b733

    invoke-virtual {v7}, Lis0/e;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v6, v8}, Lp1/q;->b0(ILjava/lang/Object;)V

    sget v6, Lkd1/o;->a:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v6, v8

    or-int/2addr v6, v8

    or-int/2addr v6, v8

    sget v8, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    or-int/2addr v6, v8

    shl-int/2addr v6, v12

    shr-int/lit8 v8, v3, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int v10, v6, v8

    move-object v8, v11

    const/4 v11, 0x1

    const/4 v6, 0x0

    invoke-static/range {v6 .. v11}, Lis0/z;->l(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    move-object v11, v8

    goto :goto_13

    :cond_2d
    move-object v8, v11

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move-object v1, v0

    move-object v3, v4

    move-object v4, v8

    goto :goto_14

    :cond_2e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v4

    move-object v3, v7

    move-object v4, v11

    :goto_14
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2f

    new-instance v0, Lg1/m3;

    const/16 v7, 0x10

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final j(Lis0/r0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lis0/z;->i(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lis0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "comment"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, -0x322367e5

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v8

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v6, v10

    :goto_5
    and-int/lit16 v10, v6, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    const/4 v14, 0x1

    if-eq v10, v11, :cond_9

    move v10, v14

    goto :goto_6

    :cond_9
    move v10, v12

    :goto_6
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v13, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_28

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v4, v15

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_b

    new-instance v7, Lis0/y;

    const/4 v9, 0x6

    invoke-direct {v7, v9}, Lis0/y;-><init>(I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_c
    move-object v7, v9

    :goto_7
    invoke-virtual {v5}, Lis0/e;->f()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v9

    invoke-virtual {v5}, Lis0/e;->j()Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_8

    :cond_d
    const/4 v9, 0x0

    :goto_8
    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v5}, Lis0/e;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lis0/z;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    if-nez v9, :cond_e

    const v0, 0x59cee897

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    move-object v0, v15

    goto :goto_a

    :cond_e
    const v11, 0x59d051ef

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_f

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v11

    :cond_f
    check-cast v11, Lj0/i;

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v8, :cond_10

    move v6, v14

    goto :goto_9

    :cond_10
    move v6, v12

    :goto_9
    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_11

    if-ne v8, v0, :cond_12

    :cond_11
    new-instance v8, Lis0/i0;

    const/4 v6, 0x2

    invoke-direct {v8, v6, v7, v9}, Lis0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v8, Lc93/a;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_13

    new-instance v6, Lis0/i;

    const/4 v0, 0x4

    invoke-direct {v6, v0}, Lis0/i;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v6, Lc93/a;

    const/16 v0, 0x1bc

    invoke-static {v15, v11, v8, v6, v0}, Landroidx/compose/foundation/a;->h(Landroidx/compose/ui/Modifier;Lj0/i;Lc93/a;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    :goto_a
    invoke-interface {v10, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v6, v14

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v9, v6, v8

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v10, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v9, v10, v13, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    invoke-static {v11, v13, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lis0/e;->j()Z

    move-result v0

    sget-object v3, Li2/w0;->a:Li2/v0;

    if-eqz v0, :cond_17

    const v0, -0x2adad3b8

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lis0/e;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lis0/z;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v32, v4

    const/4 v11, 0x4

    int-to-float v4, v11

    mul-float/2addr v4, v8

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v4, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v4

    invoke-static {v0, v4, v5, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v13, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    move-object/from16 v17, v1

    move-object/from16 p2, v3

    move v0, v4

    move/from16 v16, v6

    move-object/from16 p0, v7

    move/from16 v20, v8

    move-object v4, v9

    move-object/from16 v33, v10

    move-object v3, v12

    move-object v9, v13

    move-object v5, v14

    move-object/from16 p3, v15

    const/4 v1, 0x1

    :goto_c
    const/high16 v6, 0x3f800000    # 1.0f

    goto/16 :goto_d

    :cond_17
    move-object/from16 v32, v4

    const/4 v4, 0x0

    const v0, -0x2ad63a34

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    move v0, v6

    invoke-virtual/range {p1 .. p1}, Lis0/e;->c()Lkd1/o;

    move-result-object v6

    move-object v5, v10

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move-object v4, v9

    move-object v9, v13

    move-object v13, v5

    move v5, v0

    move-object/from16 v0, v19

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lis0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v9, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    int-to-float v8, v11

    mul-float v8, v8, v20

    invoke-static {v8, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lt0/j;->a:Lt0/i;

    invoke-static {v8, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v10, v14

    const/16 v14, 0x6000

    move-object v11, v15

    const/16 v15, 0x68

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 p0, v16

    move/from16 v16, v5

    move-object/from16 v5, p0

    move-object/from16 p0, v0

    move-object/from16 v17, v1

    move-object/from16 p2, v3

    move-object/from16 v33, v13

    move-object/from16 p3, v19

    move-object/from16 v3, v21

    move-object/from16 v13, v28

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    float-to-double v7, v6

    const-wide/16 v10, 0x0

    cmpl-double v7, v7, v10

    if-lez v7, :cond_18

    move v12, v1

    goto :goto_e

    :cond_18
    move v12, v0

    :goto_e
    if-nez v12, :cond_19

    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_19
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v6, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v10

    mul-float v6, v6, v20

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v8, v10, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_1a

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_1c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1b

    goto :goto_11

    :cond_1b
    :goto_10
    move-object/from16 v8, v17

    goto :goto_12

    :cond_1c
    :goto_11
    invoke-static {v10, v9, v10, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v9, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lis0/e;->j()Z

    move-result v7

    if-eqz v7, :cond_1d

    const v2, -0x379f412b

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lis0/e;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lis0/z;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v7, p3

    invoke-static {v7, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0xc

    int-to-float v3, v3

    const/4 v11, 0x4

    int-to-float v4, v11

    mul-float/2addr v3, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    mul-float v3, v4, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v5, v16

    invoke-static {v2, v5, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    move-object/from16 v5, p2

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v9, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_13
    move-object v4, v7

    goto/16 :goto_18

    :cond_1d
    move-object/from16 v7, p3

    invoke-virtual/range {p1 .. p1}, Lis0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v10

    if-nez v10, :cond_1f

    invoke-virtual/range {p1 .. p1}, Lis0/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-eqz v10, :cond_1e

    goto :goto_14

    :cond_1e
    const v2, -0x378d5fd3

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1f
    :goto_14
    const v10, -0x37987206

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    move-object/from16 v13, v33

    invoke-static {v6, v13, v9, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_20

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_20
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v9, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_21

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    :cond_21
    invoke-static {v10, v9, v10, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v9, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lis0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v2

    if-eqz v2, :cond_23

    const v2, -0x26d9c37d

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lis0/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v30, v4, 0x12

    const v31, 0x2fffa

    move-object v11, v7

    const/4 v7, 0x0

    move-object/from16 v19, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v4, v19

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide v8, v2

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_23
    move-object v4, v7

    const v2, -0x26d61ddb

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual/range {p1 .. p1}, Lis0/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_24

    const v2, -0x26d570d1    # -3.000511E15f

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_24
    const v3, -0x26d570d0    # -3.0005114E15f

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v2

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v30, v5, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide v8, v2

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual/range {p1 .. p1}, Lis0/e;->j()Z

    move-result v2

    if-eqz v2, :cond_25

    const v2, 0x3ecccccd    # 0.4f

    invoke-static {v2, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object v7, v15

    goto :goto_19

    :cond_25
    move-object v7, v4

    :goto_19
    invoke-virtual/range {p1 .. p1}, Lis0/e;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lis0/e;->h()Les0/a;

    move-result-object v2

    sget-object v3, Lis0/z$e;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v1, :cond_27

    const/4 v3, 0x2

    if-ne v2, v3, :cond_26

    const v2, -0xa0ca49a

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    new-instance v0, Lb91/a;

    new-instance v10, Ll3/v0;

    sget-wide v13, Lis0/z;->a:J

    sget-wide v23, Lis0/z;->b:J

    const v25, 0xfdfffd

    const-wide/16 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v10 .. v25}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v10, v2, v3, v2}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v0

    goto :goto_1a

    :cond_26
    const v1, -0xa0cb78b

    invoke-static {v1, v9, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_27
    const v2, -0xa0cacc9

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v2

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v26, v2

    :goto_1a
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v2

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v30, v0, 0x12

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide v8, v2

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v6, p0

    move-object/from16 v4, v32

    goto :goto_1b

    :cond_28
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v6, v9

    :goto_1b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_29

    new-instance v0, Lhy0/v;

    const/16 v3, 0x15

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final m(Lis0/r0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 1

    new-instance v0, Lis0/r0$b;

    invoke-direct {v0, p1}, Lis0/r0$b;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lis0/z;->l(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic q(Lf0/r1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lis0/z;->v(Lf0/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lf0/r1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lis0/z;->x(Lf0/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ReactionsCommentAvatarSkeleton_"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ReactionsCommentNameSkeleton_"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ReactionsCommentRow_"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lf0/r1;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iput v1, v0, Lkotlin/jvm/internal/e0;->w:I

    new-instance v1, Lis0/u;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lis0/u;-><init>(Lf0/r1;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v1

    new-instance v2, Lis0/z$f;

    invoke-direct {v2, v0, p0}, Lis0/z$f;-><init>(Lkotlin/jvm/internal/e0;Lf0/r1;)V

    invoke-virtual {v1, v2, p1}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lf0/r1;)I
    .locals 0

    iget-object p0, p0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final x(Lf0/r1;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lis0/z$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lis0/z$g;

    iget v1, v0, Lis0/z$g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lis0/z$g;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lis0/z$g;

    invoke-direct {v0, p1}, Lis0/z$g;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lis0/z$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lis0/z$g;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lis0/z$g;->w:Ljava/lang/Object;

    check-cast p0, Lf0/r1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lis0/z$g;->w:Ljava/lang/Object;

    check-cast p0, Lf0/r1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lis0/y;

    const/4 v2, 0x5

    invoke-direct {p1, v2}, Lis0/y;-><init>(I)V

    iput-object p0, v0, Lis0/z$g;->w:Ljava/lang/Object;

    iput v4, v0, Lis0/z$g;->y:I

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v2

    invoke-interface {v2, p1, v0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    const/4 v2, 0x0

    iput-object v2, v0, Lis0/z$g;->w:Ljava/lang/Object;

    iput v3, v0, Lis0/z$g;->y:I

    invoke-virtual {p0, p1, v0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(J)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
