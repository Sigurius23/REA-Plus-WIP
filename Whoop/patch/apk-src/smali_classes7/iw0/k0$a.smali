.class final Liw0/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liw0/k0;->j(Landroidx/compose/ui/Modifier;Liw0/l0;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3;"
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
.field final synthetic E:Z

.field final synthetic w:Liw0/y;

.field final synthetic x:Liw0/l0;

.field final synthetic y:Z

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Liw0/y;Liw0/l0;ZLkotlin/jvm/functions/Function1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw0/y;",
            "Liw0/l0;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, Liw0/k0$a;->w:Liw0/y;

    iput-object p2, p0, Liw0/k0$a;->x:Liw0/l0;

    iput-boolean p3, p0, Liw0/k0$a;->y:Z

    iput-object p4, p0, Liw0/k0$a;->z:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Liw0/k0$a;->E:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll0/y;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    const-string v1, "$this$WorkoutGroupWrapper"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Liw0/k0$a;->w:Liw0/y;

    invoke-virtual {v1}, Liw0/y;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Liw0/k0$a;->x:Liw0/l0;

    iget-boolean v3, v0, Liw0/k0$a;->y:Z

    iget-object v4, v0, Liw0/k0$a;->z:Lkotlin/jvm/functions/Function1;

    iget-boolean v5, v0, Liw0/k0$a;->E:Z

    iget-object v6, v0, Liw0/k0$a;->w:Liw0/y;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Liw0/b;

    invoke-virtual {v9}, Liw0/b;->c()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    if-eqz v10, :cond_2

    if-eqz v5, :cond_1

    invoke-static {v10}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    goto :goto_2

    :cond_1
    move-object v10, v11

    :goto_2
    if-eqz v10, :cond_2

    new-instance v12, Liw0/i$a;

    invoke-direct {v12, v10}, Liw0/i$a;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    move-object v12, v11

    :goto_3
    invoke-virtual {v9}, Liw0/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-virtual {v9}, Liw0/b;->d()Ljava/lang/String;

    move-result-object v26

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    if-nez v12, :cond_3

    move-object/from16 v27, v10

    goto :goto_4

    :cond_3
    move-object/from16 v27, v12

    :goto_4
    if-eqz v12, :cond_4

    invoke-virtual {v9}, Liw0/b;->b()Ljava/lang/Integer;

    move-result-object v11

    :cond_4
    move-object/from16 v28, v11

    if-nez v12, :cond_5

    move-object/from16 v29, v10

    :goto_5
    move-object v11, v9

    goto :goto_6

    :cond_5
    move-object/from16 v29, v12

    goto :goto_5

    :goto_6
    invoke-virtual {v11}, Liw0/b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v12

    invoke-virtual {v12}, Liw0/d0;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v13

    invoke-virtual {v13}, Liw0/d0;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v14

    invoke-virtual {v14}, Liw0/d0;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v15

    invoke-virtual {v15}, Liw0/d0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v11}, Liw0/b;->a()Liw0/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Liw0/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v11}, Liw0/b;->a()Liw0/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Liw0/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v11}, Liw0/b;->a()Liw0/a;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Liw0/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Liw0/d0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Liw0/d0;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v11}, Liw0/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v11}, Liw0/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v2}, Liw0/l0;->a()Liw0/d0;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Liw0/d0;->c()Z

    move-result v19

    move-object/from16 v18, v11

    move-object v11, v13

    move-object v13, v15

    move-object/from16 v15, v17

    invoke-virtual/range {v18 .. v18}, Liw0/b;->f()Ljava/util/List;

    move-result-object v17

    invoke-virtual/range {v18 .. v18}, Liw0/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    move-object/from16 v30, v8

    new-instance v8, Lo11/h$a;

    move-object/from16 v31, v18

    move/from16 v18, v3

    move-object v3, v10

    move-object v10, v12

    move-object v12, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v31

    invoke-direct/range {v8 .. v24}, Lo11/h$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v20, v8

    move/from16 v10, v18

    new-instance v13, Lo11/m$d$a;

    move-object/from16 v14, v25

    move-object/from16 v25, v28

    const/16 v28, 0x279a

    move-object/from16 v16, v26

    move-object/from16 v26, v29

    const/16 v29, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v19, v27

    const/16 v27, 0x0

    invoke-direct/range {v13 .. v29}, Lo11/m$d$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Lo11/h;ZLjava/lang/Object;ZZLjava/lang/Integer;Ljava/lang/Object;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v8, v5

    new-instance v5, Liw0/k0$a$a;

    invoke-direct {v5, v6}, Liw0/k0$a$a;-><init>(Liw0/y;)V

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v11, v9, :cond_7

    :cond_6
    new-instance v11, Liw0/k0$a$b;

    invoke-direct {v11, v4}, Liw0/k0$a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lkotlin/jvm/functions/Function1;

    move v9, v8

    sget v8, Lo11/m$d$a;->O:I

    move v12, v9

    const/4 v9, 0x2

    move-object v14, v4

    const/4 v4, 0x0

    move-object v15, v11

    move-object v11, v6

    move-object v6, v15

    move-object v15, v3

    move-object v3, v13

    move-object/from16 v13, v30

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v10

    move-object v6, v11

    move v5, v12

    move-object v8, v13

    move-object v4, v14

    goto/16 :goto_1

    :cond_8
    return-void

    :cond_9
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Liw0/k0$a;->a(Ll0/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
