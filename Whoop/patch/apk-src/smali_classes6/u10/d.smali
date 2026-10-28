.class public final Lu10/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk83/a;

.field public final b:Lv00/c0;

.field public final c:Lh20/f;

.field public final d:Ls10/f;

.field public final e:Lk20/a;

.field public final f:Lk83/a;


# direct methods
.method public constructor <init>(Lk83/a;Lv00/c0;Lh20/f;Ls10/f;Lk20/a;Lk83/a;)V
    .locals 1

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageNavigatorProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu10/d;->a:Lk83/a;

    iput-object p2, p0, Lu10/d;->b:Lv00/c0;

    iput-object p3, p0, Lu10/d;->c:Lh20/f;

    iput-object p4, p0, Lu10/d;->d:Ls10/f;

    iput-object p5, p0, Lu10/d;->e:Lk20/a;

    iput-object p6, p0, Lu10/d;->f:Lk83/a;

    return-void
.end method


# virtual methods
.method public final a(Lh20/l;)Lb30/y0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const-string v1, "displayableSavedPaymentMethod"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lu10/d;->b:Lv00/c0;

    iget-object v2, v1, Lv00/c0;->w:Ly00/c8;

    invoke-interface {v2}, Ly00/c8;->q0()Z

    move-result v2

    iget-object v3, v0, Lu10/d;->c:Lh20/f;

    iget-object v5, v3, Lh20/f;->f:Ln53/e;

    iget-object v5, v5, Ln53/e;->y:Ll83/e;

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v6, v3, Lh20/f;->g:Ln53/e;

    iget-object v6, v6, Ln53/e;->y:Ll83/e;

    check-cast v6, Lc93/a;

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move v6, v5

    iget-object v5, v1, Lv00/c0;->X:Lux/a;

    iget-object v7, v1, Lv00/c0;->x:Lh20/l1;

    move v9, v6

    iget-object v6, v7, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v7}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v7

    iget-object v10, v1, Lv00/c0;->P:Lv00/p;

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    iget-boolean v12, v10, Lv00/p;->z:Z

    const/4 v13, 0x1

    if-ne v12, v13, :cond_0

    move v11, v13

    :cond_0
    iget-object v3, v3, Lh20/f;->b:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La30/a;

    const/4 v12, 0x0

    if-eqz v3, :cond_1

    iget-object v3, v3, La30/a;->x:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v3, v12

    :goto_0
    iget-object v13, v4, Lh20/l;->b:Ly00/o4;

    iget-object v13, v13, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v10, :cond_2

    iget-object v10, v10, Lv00/p;->E:Lv00/o;

    if-eqz v10, :cond_2

    iget-object v10, v10, Lv00/o;->w:Lmy/b;

    if-eqz v10, :cond_2

    iget-object v1, v1, Lv00/c0;->I:Ljava/lang/String;

    invoke-virtual {v10, v1}, Lmy/b;->a(Ljava/lang/String;)Lzy/b;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v12

    :goto_1
    new-instance v10, Lb30/y0;

    new-instance v13, Lu10/c;

    const/4 v14, 0x0

    invoke-direct {v13, v0, v12, v14}, Lu10/c;-><init>(Lu10/d;Lq83/d;I)V

    move-object v14, v13

    new-instance v13, Lbe/d;

    const/4 v15, 0x7

    invoke-direct {v13, v0, v12, v15}, Lbe/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    move-object v15, v14

    new-instance v14, Lu10/c;

    move-object/from16 v16, v1

    const/4 v1, 0x1

    invoke-direct {v14, v0, v12, v1}, Lu10/c;-><init>(Lu10/d;Lq83/d;I)V

    move-object v12, v15

    new-instance v15, Lu10/b;

    const/4 v1, 0x0

    invoke-direct {v15, v0, v1}, Lu10/b;-><init>(Lu10/d;I)V

    new-instance v1, Lsc0/c;

    move/from16 v17, v2

    const/16 v2, 0xe

    invoke-direct {v1, v0, v2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v2, v16

    move-object/from16 v16, v1

    move-object v1, v10

    move v10, v3

    move v3, v9

    move-object v9, v2

    move/from16 v2, v17

    invoke-direct/range {v1 .. v16}, Lb30/y0;-><init>(ZZLh20/l;Lux/a;Lh20/j1;Ljava/util/Set;ZLzy/b;ZZLc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    return-object v1
.end method
