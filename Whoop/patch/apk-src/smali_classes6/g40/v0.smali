.class public final Lg40/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lf0/r1;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:J

.field public final synthetic y:Lg40/r0;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(Ljava/util/List;JLg40/r0;Lp1/c1;Lp1/c1;Lf0/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/v0;->w:Ljava/util/List;

    iput-wide p2, p0, Lg40/v0;->x:J

    iput-object p4, p0, Lg40/v0;->y:Lg40/r0;

    iput-object p5, p0, Lg40/v0;->z:Lp1/t2;

    iput-object p6, p0, Lg40/v0;->E:Lp1/c1;

    iput-object p7, p0, Lg40/v0;->F:Lf0/r1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$DropdownMenu"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_1
    :goto_0
    new-instance v1, Lkotlin/jvm/internal/e0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, v0, Lg40/v0;->w:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    const/4 v8, 0x0

    if-ltz v5, :cond_a

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    new-instance v6, Lkotlin/jvm/internal/b0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v10, v0, Lg40/v0;->z:Lp1/t2;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_2

    :cond_2
    const/4 v11, -0x1

    :goto_2
    const/4 v12, 0x1

    sub-int/2addr v11, v12

    if-lt v5, v11, :cond_3

    move v11, v12

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    :goto_3
    iput-boolean v11, v6, Lkotlin/jvm/internal/b0;->w:Z

    move-object v15, v2

    check-cast v15, Lp1/q;

    const v11, 0x268749c7

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    iget-object v13, v0, Lg40/v0;->E:Lp1/c1;

    if-nez v11, :cond_5

    :cond_4
    :goto_4
    const/4 v4, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ne v5, v11, :cond_4

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    new-instance v14, Ld30/o;

    const/16 v12, 0x16

    iget-object v4, v0, Lg40/v0;->F:Lf0/r1;

    invoke-direct {v14, v4, v1, v8, v12}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v15, v14, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_4

    :goto_5
    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v5, v4, :cond_7

    const/4 v10, 0x1

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v10, 0x0

    :goto_7
    new-instance v4, Lfd3/a;

    const/16 v8, 0xf

    invoke-direct {v4, v8, v6, v1}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v4}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v6, 0xf34c035

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lg40/v0;->y:Lg40/r0;

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v15, v5}, Lp1/q;->e(I)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_8

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v11, v8, :cond_9

    :cond_8
    new-instance v11, La41/h;

    const/4 v8, 0x3

    invoke-direct {v11, v6, v5, v13, v8}, La41/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v14, v11

    check-cast v14, Lc93/a;

    const/4 v5, 0x0

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    const/16 v16, 0x0

    iget-wide v11, v0, Lg40/v0;->x:J

    move-object v13, v4

    invoke-static/range {v9 .. v16}, Lg40/y0;->b(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move v5, v7

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_b
    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
