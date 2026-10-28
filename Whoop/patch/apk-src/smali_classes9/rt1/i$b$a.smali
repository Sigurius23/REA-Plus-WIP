.class public final Lrt1/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrt1/i$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lrt1/i$b$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lrt1/i$b$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lrt1/i$b$a$a;

    iget v3, v2, Lrt1/i$b$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lrt1/i$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lrt1/i$b$a$a;

    invoke-direct {v2, v0, v1}, Lrt1/i$b$a$a;-><init>(Lrt1/i$b$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lrt1/i$b$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lrt1/i$b$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lrt1/i$b$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lrt1/i$b$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lrt1/i$b$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lrt1/i$b$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpt1/b;

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v6

    instance-of v7, v6, Lpt1/c$g;

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    sget-object v6, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v6}, Lrt1/h$b$a;->a()Lrt1/h$b;

    move-result-object v9

    invoke-virtual {v6}, Lrt1/h$b$a;->a()Lrt1/h$b;

    move-result-object v6

    invoke-virtual {v6}, Lrt1/h$b;->j()Lrt1/a;

    move-result-object v10

    invoke-virtual {v4}, Lpt1/b;->e()Z

    move-result v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lrt1/a;->b(Lrt1/a;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lrt1/a;

    move-result-object v27

    const v28, 0x1ffff

    const/16 v29, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

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

    invoke-static/range {v9 .. v29}, Lrt1/h$b;->i(Lrt1/h$b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;ILjava/lang/Object;)Lrt1/h$b;

    move-result-object v4

    goto/16 :goto_2

    :cond_3
    instance-of v7, v6, Lpt1/c$e;

    if-eqz v7, :cond_4

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v6

    check-cast v6, Lpt1/c$e;

    invoke-virtual {v6}, Lpt1/c$e;->c()Ldk0/j;

    move-result-object v6

    invoke-virtual {v6}, Ldk0/j;->g0()S

    move-result v6

    invoke-static {v6}, Lrs1/a;->b(I)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v6, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v6}, Lrt1/h$b$a;->d()Lrt1/h$b;

    move-result-object v9

    sget-object v6, Lrt1/e;->c:Lrt1/e$a;

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v7

    check-cast v7, Lpt1/c$e;

    invoke-virtual {v7}, Lpt1/c$e;->c()Ldk0/j;

    move-result-object v7

    invoke-virtual {v7}, Ldk0/j;->h0()S

    move-result v7

    invoke-virtual {v6, v7}, Lrt1/e$a;->a(S)Lrt1/e;

    move-result-object v23

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v4

    check-cast v4, Lpt1/c$e;

    invoke-virtual {v4}, Lpt1/c$e;->d()Ljava/util/List;

    move-result-object v25

    const v28, 0x34fff

    const/16 v29, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v9 .. v29}, Lrt1/h$b;->i(Lrt1/h$b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;ILjava/lang/Object;)Lrt1/h$b;

    move-result-object v4

    goto/16 :goto_2

    :cond_4
    instance-of v7, v6, Lpt1/c$h;

    if-eqz v7, :cond_5

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v6

    check-cast v6, Lpt1/c$h;

    invoke-virtual {v6}, Lpt1/c$h;->a()Ldk0/j;

    move-result-object v6

    invoke-virtual {v6}, Ldk0/j;->g0()S

    move-result v6

    invoke-static {v6}, Lrs1/a;->b(I)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v6, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v6}, Lrt1/h$b$a;->f()Lrt1/h$b;

    move-result-object v9

    sget-object v6, Lrt1/e;->c:Lrt1/e$a;

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v4

    check-cast v4, Lpt1/c$h;

    invoke-virtual {v4}, Lpt1/c$h;->a()Ldk0/j;

    move-result-object v4

    invoke-virtual {v4}, Ldk0/j;->h0()S

    move-result v4

    invoke-virtual {v6, v4}, Lrt1/e$a;->a(S)Lrt1/e;

    move-result-object v23

    const v28, 0x3cfff

    const/16 v29, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v9 .. v29}, Lrt1/h$b;->i(Lrt1/h$b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;ILjava/lang/Object;)Lrt1/h$b;

    move-result-object v4

    goto/16 :goto_2

    :cond_5
    instance-of v7, v6, Lpt1/c$b;

    if-eqz v7, :cond_6

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v6

    check-cast v6, Lpt1/c$b;

    invoke-virtual {v6}, Lpt1/c$b;->b()Ldk0/j;

    move-result-object v6

    invoke-virtual {v6}, Ldk0/j;->f0()S

    move-result v6

    invoke-static {v6}, Lrs1/a;->b(I)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v6, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v6}, Lrt1/h$b$a;->b()Lrt1/h$b;

    move-result-object v9

    new-instance v6, Lrt1/k;

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v7

    check-cast v7, Lpt1/c$b;

    invoke-virtual {v7}, Lpt1/c$b;->a()Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x2

    invoke-direct {v6, v7, v8, v10, v8}, Lrt1/k;-><init>(Ljava/lang/String;Lrt1/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lpt1/b;->c()Lpt1/c;

    move-result-object v4

    check-cast v4, Lpt1/c$b;

    invoke-virtual {v4}, Lpt1/c$b;->c()Ljava/util/List;

    move-result-object v25

    const v28, 0x30fff

    const/16 v29, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v24, v6

    invoke-static/range {v9 .. v29}, Lrt1/h$b;->i(Lrt1/h$b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;ILjava/lang/Object;)Lrt1/h$b;

    move-result-object v4

    goto/16 :goto_2

    :cond_6
    instance-of v4, v6, Lpt1/c$a;

    if-eqz v4, :cond_7

    sget-object v4, Lrt1/h$a;->i:Lrt1/h$a$a;

    invoke-virtual {v4}, Lrt1/h$a$a;->a()Lrt1/h$a;

    move-result-object v9

    sget-object v16, Lrt1/b$b;->a:Lrt1/b$b;

    const/16 v18, 0xbf

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v9 .. v19}, Lrt1/h$a;->d(Lrt1/h$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;Lcom/whoop/design/util/TextResource;Lrt1/b;Lrt1/b;ZILjava/lang/Object;)Lrt1/h$a;

    move-result-object v4

    goto :goto_2

    :cond_7
    instance-of v4, v6, Lpt1/c$c;

    if-nez v4, :cond_c

    sget-object v4, Lpt1/c$d;->a:Lpt1/c$d;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_1

    :cond_8
    instance-of v4, v6, Lpt1/c$i;

    if-eqz v4, :cond_9

    sget-object v4, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v4}, Lrt1/h$b$a;->g()Lrt1/h$b;

    move-result-object v4

    goto :goto_2

    :cond_9
    instance-of v4, v6, Lpt1/c$j;

    if-eqz v4, :cond_a

    sget-object v4, Lrt1/h$a;->i:Lrt1/h$a$a;

    invoke-virtual {v4}, Lrt1/h$a$a;->b()Lrt1/h$a;

    move-result-object v9

    sget-object v13, Lrt1/b$b;->a:Lrt1/b$b;

    const/16 v18, 0x77

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-static/range {v9 .. v19}, Lrt1/h$a;->d(Lrt1/h$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;Lcom/whoop/design/util/TextResource;Lrt1/b;Lrt1/b;ZILjava/lang/Object;)Lrt1/h$a;

    move-result-object v4

    goto :goto_2

    :cond_a
    instance-of v4, v6, Lpt1/c$f;

    if-eqz v4, :cond_b

    sget-object v4, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v4}, Lrt1/h$b$a;->e()Lrt1/h$b;

    move-result-object v4

    goto :goto_2

    :cond_b
    sget-object v4, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v4}, Lrt1/h$b$a;->a()Lrt1/h$b;

    move-result-object v4

    goto :goto_2

    :cond_c
    :goto_1
    sget-object v4, Lrt1/h$b;->s:Lrt1/h$b$a;

    invoke-virtual {v4}, Lrt1/h$b$a;->c()Lrt1/h$b;

    move-result-object v4

    :goto_2
    iput-object v8, v2, Lrt1/i$b$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lrt1/i$b$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lrt1/i$b$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lrt1/i$b$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lrt1/i$b$a$a;->H:I

    iput v5, v2, Lrt1/i$b$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    return-object v3

    :cond_d
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
