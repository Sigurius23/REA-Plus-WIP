.class final Li82/h$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li82/h;->r(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
        "Li82/h$b;",
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
    c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$performItemAction$1"
    f = "SearchArchMiniInteractor.kt"
    l = {
        0xb6,
        0xbc,
        0xcb,
        0xd0,
        0xd2,
        0xd4,
        0xda,
        0xde,
        0xe7,
        0xe7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Li82/h;

.field final synthetic J:Lcom/whoop/whoopaction/domain/models/Action;

.field final synthetic K:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Li82/h;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Li82/h;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Li82/h$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li82/h$h;->H:Ljava/lang/String;

    iput-object p2, p0, Li82/h$h;->I:Li82/h;

    iput-object p3, p0, Li82/h$h;->J:Lcom/whoop/whoopaction/domain/models/Action;

    iput-object p4, p0, Li82/h$h;->K:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Li82/h$h;

    iget-object v1, p0, Li82/h$h;->H:Ljava/lang/String;

    iget-object v2, p0, Li82/h$h;->I:Li82/h;

    iget-object v3, p0, Li82/h$h;->J:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v4, p0, Li82/h$h;->K:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Li82/h$h;-><init>(Ljava/lang/String;Li82/h;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Li82/h$h;->G:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Li82/h$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li82/h$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li82/h$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Li82/h$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const-string v0, "PerformItemAction failed: "

    iget-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Li82/h$h;->F:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v1, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v1, Li82/d$a;

    iget-object v1, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v1, Li82/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    iget-object v0, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v0, Li82/d$a;

    iget-object v0, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v0, Li82/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :pswitch_2
    iget-boolean v0, p0, Li82/h$h;->E:Z

    iget-object v3, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v3, Lqw2/b;

    iget-object v3, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v3, Li82/d$a;

    iget-object v3, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v3, Li82/a;

    :goto_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception p1

    move v3, v0

    :goto_1
    move-object v0, p1

    goto/16 :goto_a

    :pswitch_3
    iget-boolean v0, p0, Li82/h$h;->E:Z

    iget-object v3, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v3, Lqw2/b;

    iget-object v3, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v3, Li82/d$a;

    iget-object v3, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v3, Li82/a;

    goto :goto_0

    :pswitch_4
    iget-boolean v0, p0, Li82/h$h;->E:Z

    iget-object v3, p0, Li82/h$h;->z:Ljava/lang/Object;

    check-cast v3, Li82/h$b;

    iget-object v3, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v3, Lqw2/b;

    iget-object v3, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v3, Li82/d$a;

    iget-object v3, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v3, Li82/a;

    goto :goto_0

    :pswitch_5
    iget-boolean v0, p0, Li82/h$h;->E:Z

    iget-object v3, p0, Li82/h$h;->z:Ljava/lang/Object;

    check-cast v3, Li82/h;

    iget-object v6, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v6, Lqw2/b;

    iget-object v6, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v6, Li82/d$a;

    iget-object v6, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v6, Li82/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_8

    :pswitch_6
    iget-boolean v0, p0, Li82/h$h;->E:Z

    iget-object v3, p0, Li82/h$h;->y:Ljava/lang/Object;

    check-cast v3, Lqw2/b;

    iget-object v3, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v3, Li82/d$a;

    iget-object v3, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v3, Li82/a;

    goto :goto_0

    :pswitch_7
    iget-boolean v3, p0, Li82/h$h;->E:Z

    iget-object v6, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v6, Li82/d$a;

    iget-object v7, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v7, Li82/a;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_6

    :catchall_1
    move-exception p1

    goto :goto_1

    :pswitch_8
    iget-boolean v3, p0, Li82/h$h;->E:Z

    iget-object v6, p0, Li82/h$h;->x:Ljava/lang/Object;

    check-cast v6, Li82/d$a;

    iget-object v7, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v7, Li82/a;

    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_5

    :pswitch_9
    iget-boolean v3, p0, Li82/h$h;->E:Z

    iget-object v6, p0, Li82/h$h;->w:Ljava/lang/Object;

    check-cast v6, Li82/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li82/h$h;->H:Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->g(Li82/h;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v3, "search-arch-mini-follower-item-action-state"

    invoke-interface {p1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->i(Li82/h;)Li82/d;

    move-result-object p1

    iget-object v6, p0, Li82/h$h;->J:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {p1, v6}, Li82/d;->d(Lcom/whoop/whoopaction/domain/models/Action;)Li82/a;

    move-result-object v6

    if-eqz v3, :cond_2

    new-instance p1, Li82/h$b$i;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Li82/a;->a()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_1
    move-object v7, v5

    :goto_2
    invoke-direct {p1, v7}, Li82/h$b$i;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v6, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 v7, 0x1

    iput v7, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    goto/16 :goto_b

    :cond_2
    :goto_3
    if-eqz v6, :cond_3

    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->i(Li82/h;)Li82/d;

    move-result-object p1

    invoke-virtual {p1, v6}, Li82/d;->e(Li82/a;)Li82/d$a;

    move-result-object p1

    move-object v6, p1

    goto :goto_4

    :cond_3
    move-object v6, v5

    :goto_4
    if-nez v6, :cond_4

    :try_start_4
    new-instance p1, Li82/h$b$k;

    iget-object v7, p0, Li82/h$h;->H:Ljava/lang/String;

    iget-object v8, p0, Li82/h$h;->K:Ljava/lang/String;

    invoke-direct {p1, v7, v8, v3}, Li82/h$b$k;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v6, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 v7, 0x2

    iput v7, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto/16 :goto_b

    :cond_4
    :goto_5
    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->e(Li82/h;)Lqw2/c;

    move-result-object p1

    new-instance v7, Lqw2/f;

    iget-object v8, p0, Li82/h$h;->J:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v7, v8}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance v8, La6/u;

    const/4 v9, 0x1

    invoke-direct {v8, v7, v9}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v8}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v7, Li82/h$h$a;

    invoke-direct {v7, p1}, Li82/h$h$a;-><init>(Lec3/l;)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v6, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 p1, 0x3

    iput p1, p0, Li82/h$h;->F:I

    invoke-static {v7, p0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto/16 :goto_b

    :cond_5
    :goto_6
    check-cast p1, Lqw2/b;

    instance-of v7, p1, Lqw2/b$f;

    if-eqz v7, :cond_b

    if-eqz v6, :cond_8

    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->i(Li82/h;)Li82/d;

    move-result-object p1

    invoke-virtual {v6}, Li82/d$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Li82/d$a;->b()Li82/b;

    move-result-object v7

    invoke-virtual {p1, v0, v7}, Li82/d;->c(Ljava/lang/String;Li82/b;)V

    new-instance p1, Li82/h$b$e;

    invoke-virtual {v6}, Li82/d$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Li82/d$a;->b()Li82/b;

    move-result-object v6

    invoke-direct {p1, v0, v6}, Li82/h$b$e;-><init>(Ljava/lang/String;Li82/b;)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 v0, 0x4

    iput v0, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto/16 :goto_b

    :cond_6
    move v0, v3

    :cond_7
    :goto_7
    move v3, v0

    goto/16 :goto_9

    :cond_8
    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    iget-object v0, p0, Li82/h$h;->H:Ljava/lang/String;

    iget-object v6, p0, Li82/h$h;->K:Ljava/lang/String;

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-object p1, p0, Li82/h$h;->z:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 v7, 0x5

    iput v7, p0, Li82/h$h;->F:I

    invoke-static {p1, v0, v6, p0}, Li82/h;->d(Li82/h;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne v0, v2, :cond_9

    goto/16 :goto_b

    :cond_9
    move v10, v3

    move-object v3, p1

    move-object p1, v0

    move v0, v10

    :goto_8
    :try_start_5
    check-cast p1, Lu02/a;

    invoke-static {v3, p1}, Li82/h;->c(Li82/h;Lu02/a;)Li82/h$b;

    move-result-object p1

    instance-of v3, p1, Li82/h$b$b;

    if-eqz v3, :cond_a

    iget-object v3, p0, Li82/h$h;->I:Li82/h;

    invoke-static {v3}, Li82/h;->i(Li82/h;)Li82/d;

    move-result-object v3

    move-object v6, p1

    check-cast v6, Li82/h$b$b;

    invoke-virtual {v6}, Li82/h$b$b;->a()Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    move-result-object v6

    invoke-virtual {v3, v6}, Li82/d;->b(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V

    :cond_a
    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->z:Ljava/lang/Object;

    iput-boolean v0, p0, Li82/h$h;->E:Z

    const/4 v3, 0x6

    iput v3, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-ne p1, v2, :cond_7

    goto/16 :goto_b

    :cond_b
    :try_start_6
    instance-of v6, p1, Lqw2/b$a;

    const/4 v7, 0x0

    if-eqz v6, :cond_d

    iget-object v6, p0, Li82/h$h;->I:Li82/h;

    invoke-static {v6}, Li82/h;->h(Li82/h;)Ltr2/n;

    move-result-object v6

    move-object v8, p1

    check-cast v8, Lqw2/b$a;

    invoke-virtual {v8}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v7, v7, [Lqr2/a$a;

    invoke-interface {v6, v0, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Li82/h$b$h;

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_c

    const-string p1, ""

    :cond_c
    invoke-direct {v0, p1}, Li82/h$b$h;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/4 p1, 0x7

    iput p1, p0, Li82/h$h;->F:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_b

    :cond_d
    instance-of v0, p1, Lqw2/b$b;

    if-eqz v0, :cond_e

    new-instance v0, Li82/h$b$j;

    check-cast p1, Lqw2/b$b;

    invoke-virtual {p1}, Lqw2/b$b;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-direct {v0, p1}, Li82/h$b$j;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    iput-object v1, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/16 p1, 0x8

    iput p1, p0, Li82/h$h;->F:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_b

    :cond_e
    iget-object p1, p0, Li82/h$h;->I:Li82/h;

    invoke-static {p1}, Li82/h;->h(Li82/h;)Ltr2/n;

    move-result-object p1

    const-string v0, "PerformItemAction: no actionable terminal state, ignoring"

    new-array v6, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_9
    if-eqz v3, :cond_10

    sget-object p1, Li82/h$b$g;->a:Li82/h$b$g;

    iput-object v5, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->z:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/16 v0, 0x9

    iput v0, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_10

    goto :goto_b

    :goto_a
    if-eqz v3, :cond_f

    sget-object p1, Li82/h$b$g;->a:Li82/h$b$g;

    iput-object v5, p0, Li82/h$h;->G:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->w:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->x:Ljava/lang/Object;

    iput-object v0, p0, Li82/h$h;->y:Ljava/lang/Object;

    iput-object v5, p0, Li82/h$h;->z:Ljava/lang/Object;

    iput-boolean v3, p0, Li82/h$h;->E:Z

    const/16 v3, 0xa

    iput v3, p0, Li82/h$h;->F:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_f

    :goto_b
    return-object v2

    :cond_f
    :goto_c
    throw v0

    :cond_10
    :goto_d
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
