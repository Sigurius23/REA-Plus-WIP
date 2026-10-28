.class public abstract Luj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luj/a;

.field public static final b:Luj/a;

.field public static final c:Luj/a;

.field public static final d:Luj/a;

.field public static final e:Luj/a;

.field public static final f:Luj/a;

.field public static final g:Lp1/u2;

.field public static final h:Lp1/u2;

.field public static final i:Lp1/u2;

.field public static final j:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Luj/a;

    sget-wide v1, Luj/f;->c:J

    sget-wide v5, Luj/f;->a:J

    sget-wide v8, Luj/f;->b:J

    move-wide v3, v1

    move-wide v7, v8

    invoke-direct/range {v0 .. v8}, Luj/a;-><init>(JJJJ)V

    move-wide v8, v7

    sput-object v0, Luj/e;->a:Luj/a;

    sput-object v0, Luj/e;->b:Luj/a;

    new-instance v7, Luj/a;

    sget-wide v10, Luj/f;->m:J

    sget-wide v12, Luj/f;->d:J

    move-wide v14, v8

    invoke-direct/range {v7 .. v15}, Luj/a;-><init>(JJJJ)V

    move-wide v0, v12

    sput-object v7, Luj/e;->c:Luj/a;

    new-instance v7, Luj/a;

    sget-wide v10, Luj/f;->n:J

    sget-wide v12, Luj/f;->e:J

    invoke-direct/range {v7 .. v15}, Luj/a;-><init>(JJJJ)V

    move-wide v2, v12

    sput-object v7, Luj/e;->d:Luj/a;

    new-instance v7, Luj/a;

    move-wide v10, v8

    move-wide v12, v0

    invoke-direct/range {v7 .. v15}, Luj/a;-><init>(JJJJ)V

    sput-object v7, Luj/e;->e:Luj/a;

    new-instance v7, Luj/a;

    move-wide v12, v2

    invoke-direct/range {v7 .. v15}, Luj/a;-><init>(JJJJ)V

    sput-object v7, Luj/e;->f:Luj/a;

    sget-object v0, Luj/c;->x:Luj/c;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Luj/e;->g:Lp1/u2;

    sget-object v0, Luj/c;->E:Luj/c;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Luj/e;->h:Lp1/u2;

    sget-object v0, Luj/c;->z:Luj/c;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Luj/e;->i:Lp1/u2;

    sget-object v0, Luj/c;->y:Luj/c;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Luj/e;->j:Lp1/u2;

    return-void
.end method

.method public static final a(Lcom/amplitude/android/engagement/types/ButtonType;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v1, p0

    const-string v0, "type"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0xedcddb3

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p4, v2

    or-int/lit8 v2, v2, 0x10

    and-int/lit16 v2, v2, 0x2db

    const/16 v5, 0x92

    if-ne v2, v5, :cond_2

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v2, p1

    move-object/from16 v5, p2

    goto/16 :goto_e

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v2, p1

    goto :goto_3

    :cond_4
    :goto_2
    invoke-static {v0}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    :goto_3
    invoke-virtual {v0}, Lp1/q;->r()V

    const v5, -0x1896950d

    invoke-virtual {v0, v5}, Lp1/q;->f0(I)V

    sget-object v5, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luj/m;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    sget-object v6, Luj/d;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v6, v7

    const/4 v8, 0x3

    const/4 v9, 0x1

    if-eq v7, v9, :cond_7

    if-eq v7, v4, :cond_6

    if-eq v7, v8, :cond_6

    if-ne v7, v3, :cond_5

    iget-object v5, v5, Luj/m;->a0:Luj/i;

    goto :goto_4

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    iget-object v5, v5, Luj/m;->Z:Luj/i;

    goto :goto_4

    :cond_7
    iget-object v5, v5, Luj/m;->Y:Luj/i;

    :goto_4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    if-eq v6, v9, :cond_c

    if-eq v6, v4, :cond_a

    if-eq v6, v8, :cond_a

    if-ne v6, v3, :cond_9

    if-eqz v2, :cond_8

    sget-object v3, Luj/e;->f:Luj/a;

    goto :goto_5

    :cond_8
    sget-object v3, Luj/e;->e:Luj/a;

    goto :goto_5

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    if-eqz v2, :cond_b

    sget-object v3, Luj/e;->d:Luj/a;

    goto :goto_5

    :cond_b
    sget-object v3, Luj/e;->c:Luj/a;

    goto :goto_5

    :cond_c
    if-eqz v2, :cond_d

    sget-object v3, Luj/e;->b:Luj/a;

    goto :goto_5

    :cond_d
    sget-object v3, Luj/e;->a:Luj/a;

    :goto_5
    iget-wide v6, v5, Luj/i;->e:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v6, v7}, Li2/x;-><init>(J)V

    sget-wide v8, Li2/x;->n:J

    invoke-static {v6, v7, v8, v9}, Li2/x;->d(JJ)Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_e

    goto :goto_6

    :cond_e
    move-object v4, v7

    :goto_6
    if-eqz v4, :cond_f

    iget-wide v10, v4, Li2/x;->a:J

    :goto_7
    move-wide v13, v10

    goto :goto_8

    :cond_f
    iget-wide v10, v3, Luj/a;->a:J

    goto :goto_7

    :goto_8
    iget-wide v10, v5, Luj/i;->f:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v10, v11}, Li2/x;-><init>(J)V

    invoke-static {v10, v11, v8, v9}, Li2/x;->d(JJ)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_9

    :cond_10
    move-object v4, v7

    :goto_9
    if-eqz v4, :cond_11

    iget-wide v10, v4, Li2/x;->a:J

    :goto_a
    move-wide v15, v10

    goto :goto_b

    :cond_11
    iget-wide v10, v3, Luj/a;->b:J

    goto :goto_a

    :goto_b
    iget-wide v10, v5, Luj/i;->g:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v10, v11}, Li2/x;-><init>(J)V

    invoke-static {v10, v11, v8, v9}, Li2/x;->d(JJ)Z

    move-result v6

    if-nez v6, :cond_12

    move-object v7, v4

    :cond_12
    if-eqz v7, :cond_13

    iget-wide v6, v7, Li2/x;->a:J

    :goto_c
    move-wide/from16 v17, v6

    goto :goto_d

    :cond_13
    iget-wide v6, v3, Luj/a;->c:J

    goto :goto_c

    :goto_d
    iget-wide v3, v3, Luj/a;->d:J

    new-instance v12, Luj/a;

    move-wide/from16 v19, v3

    invoke-direct/range {v12 .. v20}, Luj/a;-><init>(JJJJ)V

    new-instance v3, Luj/b;

    iget v4, v5, Luj/i;->d:F

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-direct {v3, v4}, Luj/b;-><init>(Li2/a1;)V

    iget v4, v5, Luj/i;->c:F

    iget v5, v5, Luj/i;->a:F

    sget-object v6, Luj/e;->g:Lp1/u2;

    invoke-virtual {v6, v12}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    sget-object v7, Luj/e;->h:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    new-instance v7, Ly3/f;

    invoke-direct {v7, v4}, Ly3/f;-><init>(F)V

    sget-object v4, Luj/e;->i:Lp1/u2;

    invoke-virtual {v4, v7}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v7, Ly3/f;

    invoke-direct {v7, v5}, Ly3/f;-><init>(F)V

    sget-object v5, Luj/e;->j:Lp1/u2;

    invoke-virtual {v5, v7}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    filled-new-array {v6, v3, v4, v5}, [Lp1/u1;

    move-result-object v3

    const/16 v4, 0x38

    move-object/from16 v5, p2

    invoke-static {v3, v5, v0, v4}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_14

    return-void

    :cond_14
    new-instance v0, Lqj/a;

    const/4 v5, 0x1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqj/a;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method
