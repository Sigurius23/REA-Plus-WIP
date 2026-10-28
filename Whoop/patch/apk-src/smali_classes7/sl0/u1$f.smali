.class public final Lsl0/u1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u1;->d(Lsl0/v1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lsl0/v1;

.field final synthetic F:Lp1/c1;

.field final synthetic G:Lp1/c1;

.field final synthetic H:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic y:Z

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicReference;ZLkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lsl0/u1$f;->w:Ljava/util/List;

    iput-object p2, p0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean p3, p0, Lsl0/u1$f;->y:Z

    iput-object p4, p0, Lsl0/u1$f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lsl0/u1$f;->E:Lsl0/v1;

    iput-object p6, p0, Lsl0/u1$f;->F:Lp1/c1;

    iput-object p7, p0, Lsl0/u1$f;->G:Lp1/c1;

    iput-object p8, p0, Lsl0/u1$f;->H:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v4, p2

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v4}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v8, 0x0

    if-eq v2, v5, :cond_4

    move v2, v6

    goto :goto_3

    :cond_4
    move v2, v8

    :goto_3
    and-int/lit8 v5, v1, 0x1

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v0, Lsl0/u1$f;->w:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v5, 0x6e90b445

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    new-instance v9, Lsl0/z2;

    iget-object v5, v0, Lsl0/u1$f;->F:Lp1/c1;

    invoke-static {v5}, Lsl0/u1;->r(Lp1/c1;)Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v4, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    :goto_4
    move v5, v8

    :goto_5
    iget-object v7, v0, Lsl0/u1$f;->G:Lp1/c1;

    invoke-static {v7}, Lsl0/u1;->t(Lp1/c1;)Z

    move-result v7

    iget-object v10, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_7

    move v10, v6

    goto :goto_6

    :cond_7
    move v10, v8

    :goto_6
    invoke-direct {v9, v2, v5, v7, v10}, Lsl0/z2;-><init>(Ljava/lang/String;ZZZ)V

    iget-boolean v5, v0, Lsl0/u1$f;->y:Z

    invoke-virtual {v12, v5}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    and-int/lit8 v7, v1, 0x70

    xor-int/lit8 v7, v7, 0x30

    if-le v7, v3, :cond_8

    invoke-virtual {v12, v4}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_8
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v3, :cond_9

    goto :goto_7

    :cond_9
    move v6, v8

    :cond_a
    :goto_7
    or-int v1, v5, v6

    iget-object v3, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_b

    if-ne v3, v10, :cond_c

    :cond_b
    new-instance v1, Lsl0/u1$c;

    move-object v3, v2

    iget-boolean v2, v0, Lsl0/u1$f;->y:Z

    iget-object v5, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v6, v0, Lsl0/u1$f;->F:Lp1/c1;

    iget-object v7, v0, Lsl0/u1$f;->G:Lp1/c1;

    invoke-direct/range {v1 .. v7}, Lsl0/u1$c;-><init>(ZLjava/lang/String;ILjava/util/concurrent/atomic/AtomicReference;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v1

    :cond_c
    check-cast v3, Lc93/a;

    iget-object v1, v0, Lsl0/u1$f;->F:Lp1/c1;

    invoke-static {v1}, Lsl0/u1;->r(Lp1/c1;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_10

    iget-object v1, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_10

    const v1, 0x6e9e1d65

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lsl0/u1$f;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lsl0/u1$f;->E:Lsl0/v1;

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_e

    if-ne v2, v10, :cond_f

    :cond_e
    new-instance v13, Lsl0/u1$d;

    iget-object v14, v0, Lsl0/u1$f;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v15, v0, Lsl0/u1$f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lsl0/u1$f;->E:Lsl0/v1;

    iget-object v2, v0, Lsl0/u1$f;->F:Lp1/c1;

    iget-object v4, v0, Lsl0/u1$f;->G:Lp1/c1;

    iget-object v5, v0, Lsl0/u1$f;->H:Lp1/c1;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v13 .. v19}, Lsl0/u1$d;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v13

    :cond_f
    check-cast v2, Lc93/a;

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_8
    move-object v11, v2

    goto :goto_a

    :cond_10
    :goto_9
    const v1, 0x6eae984d

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    goto :goto_8

    :goto_a
    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v3

    invoke-static/range {v9 .. v14}, Lsl0/y2;->d(Lsl0/z2;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    return-void

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lsl0/u1$f;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
