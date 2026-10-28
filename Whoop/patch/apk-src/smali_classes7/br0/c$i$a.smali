.class final Lbr0/c$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbr0/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lbr0/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lbr0/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lbr0/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lbr0/c$i$a;->x:Lbr0/c;

    iput-object p3, p0, Lbr0/c$i$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lbr0/a;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbr0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lbr0/c$i$a$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lbr0/c$i$a$a;

    iget v4, v3, Lbr0/c$i$a$a;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lbr0/c$i$a$a;->E:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lbr0/c$i$a$a;

    invoke-direct {v3, v0, v2}, Lbr0/c$i$a$a;-><init>(Lbr0/c$i$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lbr0/c$i$a$a;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lbr0/c$i$a$a;->E:I

    const/4 v12, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v13, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v8, :cond_5

    if-eq v4, v7, :cond_4

    if-eq v4, v6, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lbr0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    check-cast v4, Lbr0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-object v1, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    check-cast v4, Lbr0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget-object v1, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    check-cast v4, Lbr0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_5
    iget-object v1, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v4, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    check-cast v4, Lbr0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v4, v1, Lbr0/a$d;

    if-eqz v4, :cond_8

    iget-object v4, v0, Lbr0/c$i$a;->x:Lbr0/c;

    iget-object v5, v0, Lbr0/c$i$a;->y:Lec3/m;

    check-cast v1, Lbr0/a$d;

    invoke-virtual {v1}, Lbr0/a$d;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lbr0/b;

    iput-object v13, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    iput-object v2, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    iput v8, v9, Lbr0/c$i$a$a;->E:I

    const/4 v8, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lbr0/c;->q(Lbr0/c;Lec3/m;Ljava/lang/String;Lbr0/b;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_8

    :cond_7
    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    :goto_2
    check-cast v2, Lbr0/b;

    :goto_3
    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    goto/16 :goto_7

    :cond_8
    instance-of v4, v1, Lbr0/a$e;

    if-eqz v4, :cond_a

    iget-object v4, v0, Lbr0/c$i$a;->x:Lbr0/c;

    iget-object v5, v0, Lbr0/c$i$a;->y:Lec3/m;

    check-cast v1, Lbr0/a$e;

    invoke-virtual {v1}, Lbr0/a$e;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    iget-object v6, v0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v6, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Lbr0/b;

    iput-object v13, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    iput-object v2, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    iput v7, v9, Lbr0/c$i$a$a;->E:I

    invoke-static {v4, v5, v1, v6, v9}, Lbr0/c;->i(Lbr0/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lbr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_8

    :cond_9
    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    :goto_4
    check-cast v2, Lbr0/b;

    goto :goto_3

    :cond_a
    instance-of v4, v1, Lbr0/a$a;

    if-eqz v4, :cond_c

    iget-object v4, v0, Lbr0/c$i$a;->x:Lbr0/c;

    iget-object v5, v0, Lbr0/c$i$a;->y:Lec3/m;

    check-cast v1, Lbr0/a$a;

    invoke-virtual {v1}, Lbr0/a$a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lbr0/a$a;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v8, v0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v8, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v8, Lbr0/b;

    iput-object v13, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    iput-object v2, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    iput v6, v9, Lbr0/c$i$a$a;->E:I

    move-object v6, v7

    move-object v7, v1

    invoke-static/range {v4 .. v9}, Lbr0/c;->f(Lbr0/c;Lec3/m;Ljava/lang/String;Ljava/lang/String;Lbr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_8

    :cond_b
    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    :goto_5
    check-cast v2, Lbr0/b;

    goto :goto_3

    :cond_c
    instance-of v4, v1, Lbr0/a$b;

    if-eqz v4, :cond_d

    iget-object v1, v0, Lbr0/c$i$a;->x:Lbr0/c;

    iget-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lbr0/b;

    invoke-static {v1, v4}, Lbr0/c;->g(Lbr0/c;Lbr0/b;)Lbr0/b;

    move-result-object v1

    goto :goto_7

    :cond_d
    instance-of v4, v1, Lbr0/a$g;

    if-eqz v4, :cond_e

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lbr0/b;

    const/16 v21, 0x1f

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    invoke-static/range {v14 .. v22}, Lbr0/b;->b(Lbr0/b;ZZLcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Ljava/lang/String;Lbr0/d;ZILjava/lang/Object;)Lbr0/b;

    move-result-object v1

    goto :goto_7

    :cond_e
    instance-of v4, v1, Lbr0/a$c;

    if-eqz v4, :cond_f

    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lbr0/b;

    const/16 v21, 0x1f

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, Lbr0/b;->b(Lbr0/b;ZZLcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Ljava/lang/String;Lbr0/d;ZILjava/lang/Object;)Lbr0/b;

    move-result-object v1

    goto :goto_7

    :cond_f
    instance-of v1, v1, Lbr0/a$f;

    if-eqz v1, :cond_12

    iget-object v1, v0, Lbr0/c$i$a;->x:Lbr0/c;

    iget-object v4, v0, Lbr0/c$i$a;->y:Lec3/m;

    iget-object v6, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Lbr0/b;

    iput-object v13, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    iput-object v2, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    iput v5, v9, Lbr0/c$i$a$a;->E:I

    invoke-static {v1, v4, v6, v9}, Lbr0/c;->j(Lbr0/c;Lec3/m;Lbr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    goto :goto_8

    :cond_10
    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    :goto_6
    check-cast v2, Lbr0/b;

    goto/16 :goto_3

    :goto_7
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lbr0/c$i$a;->y:Lec3/m;

    iget-object v2, v0, Lbr0/c$i$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v13, v9, Lbr0/c$i$a$a;->w:Ljava/lang/Object;

    iput-object v13, v9, Lbr0/c$i$a$a;->x:Ljava/lang/Object;

    iput v12, v9, Lbr0/c$i$a$a;->E:I

    invoke-interface {v1, v2, v9}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_8
    return-object v3

    :cond_11
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbr0/a;

    invoke-virtual {p0, p1, p2}, Lbr0/c$i$a;->b(Lbr0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
