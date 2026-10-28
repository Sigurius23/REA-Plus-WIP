.class final Lvn0/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvn0/d;->interact(Lec3/l;)Lec3/l;
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
        "Lvn0/c;",
        "currentDomainResult",
        "Lvn0/d$a;",
        "internalAction",
        "<anonymous>",
        "(Lvn0/c;Lvn0/d$a;)Lvn0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$2"
    f = "ChangePasswordInteractor.kt"
    l = {
        0x8b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvn0/d;


# direct methods
.method public constructor <init>(Lvn0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvn0/d;",
            "Lq83/d<",
            "-",
            "Lvn0/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvn0/d$e;->z:Lvn0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvn0/c;Lvn0/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvn0/c;",
            "Lvn0/d$a;",
            "Lq83/d<",
            "-",
            "Lvn0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvn0/d$e;

    iget-object v1, p0, Lvn0/d$e;->z:Lvn0/d;

    invoke-direct {v0, v1, p3}, Lvn0/d$e;-><init>(Lvn0/d;Lq83/d;)V

    iput-object p1, v0, Lvn0/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvn0/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvn0/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvn0/c;

    check-cast p2, Lvn0/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvn0/d$e;->f(Lvn0/c;Lvn0/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v5, p0

    iget-object v0, v5, Lvn0/d$e;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lvn0/c;

    iget-object v0, v5, Lvn0/d$e;->y:Ljava/lang/Object;

    check-cast v0, Lvn0/d$a;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lvn0/d$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v1, v0, Lvn0/d$a$f;

    if-eqz v1, :cond_2

    const/16 v20, 0x1ffe

    const/16 v21, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    invoke-static/range {v6 .. v21}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lvn0/d$a$g;

    if-eqz v1, :cond_3

    invoke-virtual {v6}, Lvn0/c;->p()Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v1, v0, Lvn0/d$a$e;

    if-eqz v1, :cond_6

    check-cast v0, Lvn0/d$a$e;

    invoke-virtual {v0}, Lvn0/d$a$e;->a()Lwn0/a;

    move-result-object v1

    instance-of v2, v1, Lwn0/a$b;

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lvn0/d$a$e;->a()Lwn0/a;

    move-result-object v0

    check-cast v0, Lwn0/a$b;

    invoke-virtual {v0}, Lwn0/a$b;->a()Ljava/util/List;

    move-result-object v18

    const/16 v20, 0x7fe

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v6 .. v21}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v1, v1, Lwn0/a$a;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lvn0/d$a$e;->a()Lwn0/a;

    move-result-object v0

    check-cast v0, Lwn0/a$a;

    invoke-virtual {v0}, Lwn0/a$a;->a()Lwn0/c;

    move-result-object v19

    const/16 v20, 0xffe

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v6 .. v21}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    instance-of v1, v0, Lvn0/d$a$d;

    if-eqz v1, :cond_7

    check-cast v0, Lvn0/d$a$d;

    invoke-virtual {v0}, Lvn0/d$a$d;->a()Ljava/lang/String;

    move-result-object v14

    const/16 v20, 0x1f7f

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v6 .. v21}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_7
    instance-of v1, v0, Lvn0/d$a$b;

    if-eqz v1, :cond_8

    check-cast v0, Lvn0/d$a$b;

    invoke-virtual {v0}, Lvn0/d$a$b;->a()Ljava/lang/String;

    move-result-object v15

    const/16 v20, 0x1eff

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v6 .. v21}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v1, v0, Lvn0/d$a$h;

    if-eqz v1, :cond_a

    move-object v1, v0

    iget-object v0, v5, Lvn0/d$e;->z:Lvn0/d;

    check-cast v1, Lvn0/d$a$h;

    move-object v3, v1

    invoke-virtual {v3}, Lvn0/d$a$h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lvn0/d$a$h;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lvn0/d$a$h;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    iput-object v8, v5, Lvn0/d$e;->x:Ljava/lang/Object;

    iput-object v8, v5, Lvn0/d$e;->y:Ljava/lang/Object;

    iput v2, v5, Lvn0/d$e;->w:I

    move-object v2, v4

    move-object v4, v6

    invoke-static/range {v0 .. v5}, Lvn0/d;->j(Lvn0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_9

    return-object v7

    :cond_9
    :goto_0
    check-cast v0, Lvn0/c;

    return-object v0

    :cond_a
    move-object v1, v0

    nop

    instance-of v0, v1, Lvn0/d$a$a;

    if-eqz v0, :cond_b

    move-object v0, v1

    check-cast v0, Lvn0/d$a$a;

    invoke-virtual {v0}, Lvn0/d$a$a;->a()Z

    move-result v5

    const/16 v15, 0x1ff7

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_b
    instance-of v0, v1, Lvn0/d$a$c;

    if-eqz v0, :cond_c

    const/16 v15, 0xbff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lvn0/c;->b(Lvn0/c;ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;ILjava/lang/Object;)Lvn0/c;

    move-result-object v0

    return-object v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
