.class final Ldw0/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldw0/c;",
        "domainState",
        "Ldw0/k;",
        "domainAction",
        "<anonymous>",
        "(Ldw0/c;Ldw0/k;)Ldw0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.core.details.domain.CoreDetailsInteractor$interact$2"
    f = "CoreDetailsInteractor.kt"
    l = {
        0x16a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldw0/d;


# direct methods
.method public constructor <init>(Ldw0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldw0/d;",
            "Lq83/d<",
            "-",
            "Ldw0/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldw0/d$f;->z:Ldw0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldw0/c;Ldw0/k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldw0/c;",
            "Ldw0/k;",
            "Lq83/d<",
            "-",
            "Ldw0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldw0/d$f;

    iget-object v1, p0, Ldw0/d$f;->z:Ldw0/d;

    invoke-direct {v0, v1, p3}, Ldw0/d$f;-><init>(Ldw0/d;Lq83/d;)V

    iput-object p1, v0, Ldw0/d$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldw0/d$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldw0/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldw0/c;

    check-cast p2, Ldw0/k;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldw0/d$f;->f(Ldw0/c;Ldw0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ldw0/d$f;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ldw0/c;

    iget-object v1, v0, Ldw0/d$f;->y:Ljava/lang/Object;

    check-cast v1, Ldw0/k;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Ldw0/d$f;->w:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v1, Ldw0/k$d;

    if-eqz v4, :cond_5

    iget-object v3, v0, Ldw0/d$f;->z:Ldw0/d;

    check-cast v1, Ldw0/k$d;

    invoke-virtual {v1}, Ldw0/k$d;->a()Ldw0/a;

    move-result-object v4

    invoke-virtual {v4}, Ldw0/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ldw0/k$d;->a()Ldw0/a;

    move-result-object v5

    invoke-virtual {v5}, Ldw0/a;->b()Lhw0/a;

    move-result-object v5

    invoke-virtual {v1}, Ldw0/k$d;->b()Lcom/whoop/core/details/network/model/CoreDetailsModelState;

    move-result-object v6

    invoke-static {v3, v4, v5, v2, v6}, Ldw0/d;->g(Ldw0/d;Ljava/lang/String;Lhw0/a;Ldw0/c;Lcom/whoop/core/details/network/model/CoreDetailsModelState;)Ldw0/c;

    move-result-object v2

    invoke-virtual {v2}, Ldw0/c;->c()Ldw0/g;

    move-result-object v3

    instance-of v3, v3, Ldw0/g$a;

    if-eqz v3, :cond_4

    iget-object v3, v0, Ldw0/d$f;->z:Ldw0/d;

    invoke-static {v3}, Ldw0/d;->f(Ldw0/d;)Lbw0/b;

    move-result-object v3

    new-instance v4, Lbw0/a$a;

    invoke-virtual {v2}, Ldw0/c;->h()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    if-nez v5, :cond_2

    move-object v5, v6

    :cond_2
    sget-object v7, Lhw0/a;->Companion:Lhw0/a$a;

    invoke-virtual {v2}, Ldw0/c;->d()Lhw0/a;

    move-result-object v8

    invoke-virtual {v7, v8}, Lhw0/a$a;->a(Lhw0/a;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Ldw0/k$d;->a()Ldw0/a;

    move-result-object v8

    invoke-virtual {v8}, Ldw0/a;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ldw0/c;->i()Lcom/whoop/core/details/network/model/CoreDetailsModelState;

    move-result-object v9

    if-eqz v9, :cond_3

    iget-object v10, v0, Ldw0/d$f;->z:Ldw0/d;

    invoke-static {v10, v9}, Ldw0/d;->c(Ldw0/d;Lcom/whoop/core/details/network/model/CoreDetailsModelState;)Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->getActivityTypeInternalName()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    move-object v6, v9

    :cond_3
    invoke-virtual {v1}, Ldw0/k$d;->a()Ldw0/a;

    move-result-object v1

    invoke-virtual {v1}, Ldw0/a;->d()Z

    move-result v9

    move-object/from16 v16, v8

    move-object v8, v6

    move-object v6, v7

    move-object/from16 v7, v16

    invoke-direct/range {v4 .. v9}, Lbw0/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v3, v4}, Lbw0/b;->e(Lbw0/a;)V

    :cond_4
    return-object v2

    :cond_5
    instance-of v4, v1, Ldw0/k$a;

    if-eqz v4, :cond_6

    check-cast v1, Ldw0/k$a;

    invoke-virtual {v1}, Ldw0/k$a;->a()Ldw0/a;

    move-result-object v3

    invoke-virtual {v3}, Ldw0/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ldw0/k$a;->a()Ldw0/a;

    move-result-object v1

    invoke-virtual {v1}, Ldw0/a;->b()Lhw0/a;

    move-result-object v4

    new-instance v8, Ldw0/g$j;

    sget-object v1, Ldw0/i$b;->a:Ldw0/i$b;

    sget-object v5, Ldw0/h;->CLOSE_SCREEN:Ldw0/h;

    invoke-direct {v8, v1, v5}, Ldw0/g$j;-><init>(Ldw0/i;Ldw0/h;)V

    const/16 v14, 0x7dc

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Ldw0/c;->b(Ldw0/c;Ljava/lang/String;Lhw0/a;Lmc1/b;Ldw0/j;Lcom/whoop/core/details/network/model/CoreDetailsModelState;Ldw0/g;Ldw0/f;ZZIZILjava/lang/Object;)Ldw0/c;

    move-result-object v1

    return-object v1

    :cond_6
    sget-object v4, Ldw0/k$b;->a:Ldw0/k$b;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v8, Ldw0/g$g;->a:Ldw0/g$g;

    const/16 v14, 0x7df

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Ldw0/c;->b(Ldw0/c;Ljava/lang/String;Lhw0/a;Lmc1/b;Ldw0/j;Lcom/whoop/core/details/network/model/CoreDetailsModelState;Ldw0/g;Ldw0/f;ZZIZILjava/lang/Object;)Ldw0/c;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v4, v1, Ldw0/k$c;

    if-eqz v4, :cond_9

    iget-object v4, v0, Ldw0/d$f;->z:Ldw0/d;

    check-cast v1, Ldw0/k$c;

    invoke-virtual {v1}, Ldw0/k$c;->a()Ldw0/b;

    move-result-object v1

    const/4 v6, 0x0

    iput-object v6, v0, Ldw0/d$f;->x:Ljava/lang/Object;

    iput-object v6, v0, Ldw0/d$f;->y:Ljava/lang/Object;

    iput v5, v0, Ldw0/d$f;->w:I

    invoke-virtual {v4, v2, v1, v0}, Ldw0/d;->t(Ldw0/c;Ldw0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    return-object v3

    :cond_8
    :goto_0
    check-cast v1, Ldw0/c;

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
