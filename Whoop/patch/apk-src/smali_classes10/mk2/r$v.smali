.class final Lmk2/r$v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->J(Lmk2/p$k;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk2/r$v$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lmk2/n;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor$startHandoff$1"
    f = "TrackSessionMiniArchInteractor.kt"
    l = {
        0x5e,
        0x60,
        0x70,
        0x69,
        0x74,
        0x76,
        0x77,
        0x80
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:I

.field private synthetic M:Ljava/lang/Object;

.field final synthetic N:Lmk2/r;

.field final synthetic O:Lmk2/p$k;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmk2/r;Lmk2/p$k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/r;",
            "Lmk2/p$k;",
            "Lq83/d<",
            "-",
            "Lmk2/r$v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$v;->N:Lmk2/r;

    iput-object p2, p0, Lmk2/r$v;->O:Lmk2/p$k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmk2/r$v;

    iget-object v1, p0, Lmk2/r$v;->N:Lmk2/r;

    iget-object v2, p0, Lmk2/r$v;->O:Lmk2/p$k;

    invoke-direct {v0, v1, v2, p2}, Lmk2/r$v;-><init>(Lmk2/r;Lmk2/p$k;Lq83/d;)V

    iput-object p1, v0, Lmk2/r$v;->M:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lmk2/r$v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmk2/r$v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmk2/r$v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmk2/r$v;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v5, p0

    iget-object v0, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lec3/m;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lmk2/r$v;->L:I

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    check-cast v0, Lmk2/l;

    iget-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    check-cast v0, Lmk2/j;

    iget-object v0, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    check-cast v0, Lha0/d;

    iget-object v0, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-object v0, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    check-cast v0, Lmk2/l;

    iget-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    check-cast v0, Lmk2/j;

    iget-object v0, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    check-cast v0, Lha0/d;

    iget-object v0, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_2
    iget-object v0, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    check-cast v0, Lmk2/l;

    iget-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    check-cast v0, Lmk2/j;

    iget-object v0, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    check-cast v0, Lha0/d;

    iget-object v0, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v0, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_8

    :pswitch_3
    iget-object v0, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    check-cast v0, Lmk2/l;

    iget-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    check-cast v0, Lmk2/j;

    iget-object v1, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    check-cast v1, Lha0/d;

    iget-object v2, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v2, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v4, v0

    move-object v3, v1

    goto/16 :goto_7

    :pswitch_4
    iget-object v0, v5, Lmk2/r$v;->K:Ljava/lang/Object;

    check-cast v0, Lmk2/j;

    iget-object v1, v5, Lmk2/r$v;->J:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v5, Lmk2/r$v;->I:Ljava/lang/Object;

    check-cast v2, Lmk2/l;

    iget-object v3, v5, Lmk2/r$v;->H:Ljava/lang/Object;

    check-cast v3, Lx90/d;

    iget-object v4, v5, Lmk2/r$v;->G:Ljava/lang/Object;

    check-cast v4, Lmk2/p$k;

    iget-object v12, v5, Lmk2/r$v;->F:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    iget-object v13, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    check-cast v13, Lmk2/l;

    iget-object v13, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    check-cast v13, Lmk2/j;

    iget-object v14, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    check-cast v14, Lha0/d;

    iget-object v15, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v15, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v15, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v0

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    move-object/from16 v16, v3

    move-object v0, v13

    move-object v1, v14

    move-object v2, v15

    move-object/from16 v13, p1

    :goto_0
    move-object v15, v4

    goto/16 :goto_6

    :pswitch_5
    iget-object v0, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    check-cast v1, Lx90/d;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    move-object v3, v1

    goto :goto_2

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v0}, Lmk2/r;->g(Lmk2/r;)Lx90/f;

    move-result-object v0

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput v10, v5, Lmk2/r$v;->L:I

    invoke-interface {v0, v5}, Lx90/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1

    goto/16 :goto_a

    :cond_1
    :goto_1
    check-cast v0, Lx90/d;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lx90/d;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, v5, Lmk2/r$v;->O:Lmk2/p$k;

    invoke-virtual {v1}, Lmk2/p$k;->c()Ljava/lang/String;

    move-result-object v1

    :cond_3
    iget-object v2, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v2}, Lmk2/r;->h(Lmk2/r;)Lia0/a;

    move-result-object v2

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v0, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v1, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput v9, v5, Lmk2/r$v;->L:I

    invoke-virtual {v2, v5}, Lia0/a;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_4

    goto/16 :goto_a

    :cond_4
    move-object v3, v0

    move-object v0, v1

    :goto_2
    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lha0/d;

    invoke-virtual {v4}, Lha0/d;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_6
    move-object v2, v11

    :goto_3
    check-cast v2, Lha0/d;

    invoke-static {v2, v0}, Lmk2/b;->b(Lha0/d;Ljava/lang/String;)Lmk2/j;

    move-result-object v0

    if-eqz v3, :cond_7

    iget-object v1, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v1}, Lmk2/r;->m(Lmk2/r;)Lmk2/u;

    move-result-object v1

    invoke-interface {v1}, Lmk2/u;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v1}, Lmk2/r;->m(Lmk2/r;)Lmk2/u;

    move-result-object v1

    invoke-interface {v1}, Lmk2/u;->d()Lmk2/l;

    move-result-object v1

    goto :goto_4

    :cond_7
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lx90/d;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v10

    if-ne v1, v10, :cond_8

    new-instance v12, Lmk2/l;

    new-instance v1, Lmk2/d;

    invoke-virtual {v3}, Lx90/d;->b()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v11, v4, v10, v11}, Lmk2/d;-><init>(Ljava/time/Duration;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x17

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v12 .. v19}, Lmk2/l;-><init>(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v12

    goto :goto_4

    :cond_8
    move-object v1, v11

    :goto_4
    iget-object v4, v5, Lmk2/r$v;->O:Lmk2/p$k;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lha0/d;->c()Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :cond_9
    move-object v12, v11

    :goto_5
    if-nez v12, :cond_a

    const-string v12, ""

    :cond_a
    iget-object v13, v5, Lmk2/r$v;->N:Lmk2/r;

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v3, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v2, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    iput-object v6, v5, Lmk2/r$v;->F:Ljava/lang/Object;

    iput-object v4, v5, Lmk2/r$v;->G:Ljava/lang/Object;

    iput-object v3, v5, Lmk2/r$v;->H:Ljava/lang/Object;

    iput-object v1, v5, Lmk2/r$v;->I:Ljava/lang/Object;

    iput-object v12, v5, Lmk2/r$v;->J:Ljava/lang/Object;

    iput-object v0, v5, Lmk2/r$v;->K:Ljava/lang/Object;

    iput v8, v5, Lmk2/r$v;->L:I

    invoke-static {v13, v5}, Lmk2/r;->o(Lmk2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v7, :cond_b

    goto/16 :goto_a

    :cond_b
    move-object/from16 v19, v0

    move-object/from16 v17, v1

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v16, v2

    move-object/from16 v18, v12

    move-object v12, v6

    goto/16 :goto_0

    :goto_6
    move-object/from16 v20, v13

    check-cast v20, Lcom/whoop/domain/model/UnitSystem;

    new-instance v14, Lmk2/n$e;

    invoke-direct/range {v14 .. v20}, Lmk2/n$e;-><init>(Lmk2/p$k;Lx90/d;Lmk2/l;Ljava/lang/String;Lmk2/j;Lcom/whoop/domain/model/UnitSystem;)V

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v2, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v1, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v0, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->F:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->G:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->H:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->I:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->J:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->K:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, v5, Lmk2/r$v;->L:I

    invoke-interface {v12, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_0

    goto/16 :goto_a

    :goto_7
    iget-object v0, v5, Lmk2/r$v;->N:Lmk2/r;

    iget-object v1, v5, Lmk2/r$v;->O:Lmk2/p$k;

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    const/4 v12, 0x5

    iput v12, v5, Lmk2/r$v;->L:I

    invoke-static/range {v0 .. v5}, Lmk2/r;->d(Lmk2/r;Lmk2/p$k;Lx90/d;Lha0/d;Lmk2/j;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_c

    goto/16 :goto_a

    :cond_c
    :goto_8
    check-cast v0, Lmk2/c;

    sget-object v1, Lmk2/r$v$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v10, :cond_f

    if-eq v0, v9, :cond_e

    if-ne v0, v8, :cond_d

    goto/16 :goto_b

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    sget-object v0, Lmk2/n$d;->a:Lmk2/n$d;

    iput-object v11, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    const/16 v1, 0x8

    iput v1, v5, Lmk2/r$v;->L:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_11

    goto :goto_a

    :cond_f
    sget-object v0, Lmk2/n$f;->a:Lmk2/n$f;

    iput-object v6, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, v5, Lmk2/r$v;->L:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_10

    goto :goto_a

    :cond_10
    :goto_9
    iget-object v0, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v0}, Lmk2/r;->m(Lmk2/r;)Lmk2/u;

    move-result-object v0

    invoke-interface {v0}, Lmk2/u;->f()Lec3/l;

    move-result-object v0

    new-instance v1, Lmk2/r$v$b;

    invoke-direct {v1, v0}, Lmk2/r$v$b;-><init>(Lec3/l;)V

    iget-object v0, v5, Lmk2/r$v;->N:Lmk2/r;

    invoke-static {v0}, Lmk2/r;->m(Lmk2/r;)Lmk2/u;

    move-result-object v0

    invoke-interface {v0}, Lmk2/u;->e()Lec3/l;

    move-result-object v0

    new-instance v2, Lmk2/r$v$c;

    invoke-direct {v2, v0}, Lmk2/r$v$c;-><init>(Lec3/l;)V

    new-array v0, v9, [Lec3/l;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    aput-object v2, v0, v10

    invoke-static {v0}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object v0

    iput-object v11, v5, Lmk2/r$v;->M:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->w:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->x:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->y:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->z:Ljava/lang/Object;

    iput-object v11, v5, Lmk2/r$v;->E:Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, v5, Lmk2/r$v;->L:I

    invoke-static {v6, v0, v5}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_11

    :goto_a
    return-object v7

    :cond_11
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
