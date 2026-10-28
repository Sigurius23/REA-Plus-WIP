.class public final Lb30/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/f2;

.field public final b:Lec3/f2;

.field public final c:Lec3/t1;

.field public final d:La1/e;

.field public final e:La1/e;

.field public final f:Lb30/i0;

.field public final g:La1/e;

.field public final h:Landroidx/room/v0;

.field public final i:La1/e;

.field public final j:Lq;

.field public final k:Lhc3/d;

.field public final l:Lq83/j;

.field public final m:Lb30/h0;

.field public final n:Z

.field public final o:Lec3/h2;

.field public final p:Lec3/h2;

.field public final q:Lec3/h2;

.field public final r:Lec3/h2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lec3/r1;Lec3/r1;Lec3/w1;Lec3/r1;Ljava/util/ArrayList;La1/e;La1/e;Lb30/i0;La1/e;Landroidx/room/v0;La1/e;Lq;Lhc3/d;Lq83/j;Lb30/h0;Z)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p13

    move-object/from16 v8, p14

    move-object/from16 v9, p15

    const-string v10, "initiallySelectedPaymentMethodType"

    move-object/from16 v11, p1

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "selection"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "processing"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "validationRequested"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "incentive"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "uiContext"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lb30/j0;->a:Lec3/f2;

    iput-object v2, v0, Lb30/j0;->b:Lec3/f2;

    iput-object v3, v0, Lb30/j0;->c:Lec3/t1;

    iput-object v5, v0, Lb30/j0;->d:La1/e;

    iput-object v6, v0, Lb30/j0;->e:La1/e;

    move-object/from16 v3, p9

    iput-object v3, v0, Lb30/j0;->f:Lb30/i0;

    move-object/from16 v3, p10

    iput-object v3, v0, Lb30/j0;->g:La1/e;

    move-object/from16 v3, p11

    iput-object v3, v0, Lb30/j0;->h:Landroidx/room/v0;

    move-object/from16 v3, p12

    iput-object v3, v0, Lb30/j0;->i:La1/e;

    iput-object v7, v0, Lb30/j0;->j:Lq;

    iput-object v8, v0, Lb30/j0;->k:Lhc3/d;

    iput-object v9, v0, Lb30/j0;->l:Lq83/j;

    move-object/from16 v3, p16

    iput-object v3, v0, Lb30/j0;->m:Lb30/h0;

    move/from16 v3, p17

    iput-boolean v3, v0, Lb30/j0;->n:Z

    invoke-static {v11}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v3

    iput-object v3, v0, Lb30/j0;->o:Lec3/h2;

    iput-object v3, v0, Lb30/j0;->p:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5, v10}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ls20/a;

    invoke-virtual {v6, v10}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/List;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lq20/y;

    iget-object v1, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    iget-object v1, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lq20/c;

    invoke-virtual {v7, v10}, Lq;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lt20/n;

    new-instance v9, Lb30/b;

    const/16 v16, 0x0

    move-object/from16 v11, p6

    invoke-direct/range {v9 .. v18}, Lb30/b;-><init>(Ljava/lang/String;Ljava/util/List;Ls20/a;Ljava/util/List;Lq20/y;ZZLq20/c;Lt20/n;)V

    invoke-static {v9}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lb30/j0;->q:Lec3/h2;

    iput-object v1, v0, Lb30/j0;->r:Lec3/h2;

    new-instance v1, Lb30/g0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Lb30/g0;-><init>(Lb30/j0;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v8, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lb30/g0;

    const/4 v4, 0x1

    invoke-direct {v1, v0, v3, v4}, Lb30/g0;-><init>(Lb30/j0;Lq83/d;I)V

    invoke-static {v8, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lb30/g0;

    const/4 v4, 0x2

    invoke-direct {v1, v0, v3, v4}, Lb30/g0;-><init>(Lb30/j0;Lq83/d;I)V

    invoke-static {v8, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lb30/g0;

    const/4 v4, 0x3

    invoke-direct {v1, v0, v3, v4}, Lb30/g0;-><init>(Lb30/j0;Lq83/d;I)V

    invoke-static {v8, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lb30/g0;

    const/4 v4, 0x4

    invoke-direct {v1, v0, v3, v4}, Lb30/g0;-><init>(Lb30/j0;Lq83/d;I)V

    invoke-static {v8, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final a(Ls2/e;)V
    .locals 7

    instance-of v0, p1, Lb30/e;

    if-eqz v0, :cond_0

    check-cast p1, Lb30/e;

    iget-object p1, p1, Lb30/e;->a:Ljava/lang/String;

    iget-object v0, p0, Lb30/j0;->g:La1/e;

    invoke-virtual {v0, p1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p1, Lb30/c;

    if-eqz v0, :cond_1

    check-cast p1, Lb30/c;

    iget-object v0, p1, Lb30/c;->a:Lo20/b;

    iget-object p1, p1, Lb30/c;->b:Ljava/lang/String;

    iget-object v1, p0, Lb30/j0;->h:Landroidx/room/v0;

    invoke-virtual {v1, v0, p1}, Landroidx/room/v0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p1, Lb30/d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb30/j0;->p:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast p1, Lb30/d;

    iget-object p1, p1, Lb30/d;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lb30/j0;->o:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lb30/j0;->i:La1/e;

    invoke-virtual {v0, p1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void

    :cond_3
    instance-of v0, p1, Lb30/f;

    if-eqz v0, :cond_7

    check-cast p1, Lb30/f;

    iget-object p1, p1, Lb30/f;->a:Lb30/a;

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lb30/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p1, Lb30/a;->b:F

    iget p1, p1, Lb30/a;->c:F

    sget v3, Lb30/n2;->a:F

    if-gtz v1, :cond_4

    const/4 p1, 0x0

    goto :goto_0

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    move p1, v4

    goto :goto_0

    :cond_5
    add-float/2addr v3, v2

    div-float v5, p1, v3

    float-to-int v5, v5

    int-to-float v6, v5

    mul-float/2addr v6, v3

    sub-float/2addr p1, v6

    const v3, 0x3f733333    # 0.95f

    mul-float/2addr v2, v3

    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-ltz p1, :cond_6

    add-int/lit8 v5, v5, 0x1

    :cond_6
    invoke-static {v5, v4, v1}, Le93/b;->n(III)I

    move-result p1

    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p1}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lb30/j0;->m:Lb30/h0;

    invoke-virtual {v0, v1, p1}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
