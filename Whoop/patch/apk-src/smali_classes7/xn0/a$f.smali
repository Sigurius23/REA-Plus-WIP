.class final Lxn0/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxn0/a;->interact(Lec3/l;)Lec3/l;
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
        "Lxn0/c;",
        "currentResult",
        "Lxn0/a$a;",
        "internalAction",
        "<anonymous>",
        "(Lxn0/c;Lxn0/a$a;)Lxn0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$2"
    f = "PasswordResetInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lxn0/a$f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lxn0/c;Lxn0/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxn0/c;",
            "Lxn0/a$a;",
            "Lq83/d<",
            "-",
            "Lxn0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lxn0/a$f;

    invoke-direct {v0, p3}, Lxn0/a$f;-><init>(Lq83/d;)V

    iput-object p1, v0, Lxn0/a$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lxn0/a$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lxn0/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxn0/c;

    check-cast p2, Lxn0/a$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lxn0/a$f;->f(Lxn0/c;Lxn0/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lxn0/a$f;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lxn0/c;

    iget-object v1, v0, Lxn0/a$f;->y:Ljava/lang/Object;

    check-cast v1, Lxn0/a$a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lxn0/a$f;->w:I

    if-nez v3, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lxn0/a$a$i;

    if-eqz v3, :cond_0

    const/16 v14, 0x7ef

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lxn0/a$a$g;

    if-eqz v3, :cond_3

    check-cast v1, Lxn0/a$a$g;

    invoke-virtual {v1}, Lxn0/a$a$g;->a()Lwn0/a;

    move-result-object v3

    instance-of v4, v3, Lwn0/a$b;

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lxn0/a$a$g;->a()Lwn0/a;

    move-result-object v1

    check-cast v1, Lwn0/a$b;

    invoke-virtual {v1}, Lwn0/a$b;->a()Ljava/util/List;

    move-result-object v4

    const/16 v14, 0x7cd

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v3, v3, Lwn0/a$a;

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lxn0/a$a$g;->a()Lwn0/a;

    move-result-object v1

    check-cast v1, Lwn0/a$a;

    invoke-virtual {v1}, Lwn0/a$a;->a()Lwn0/c;

    move-result-object v8

    const/16 v14, 0x7cf

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

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3
    instance-of v3, v1, Lxn0/a$a$f;

    if-eqz v3, :cond_4

    check-cast v1, Lxn0/a$a$f;

    invoke-virtual {v1}, Lxn0/a$a$f;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v14, 0x7fe

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v3, v1, Lxn0/a$a$j;

    if-eqz v3, :cond_7

    check-cast v1, Lxn0/a$a$j;

    invoke-virtual {v1}, Lxn0/a$a$j;->a()Lwn0/f;

    move-result-object v3

    instance-of v4, v3, Lwn0/f$b;

    if-eqz v4, :cond_5

    const/16 v14, 0x72f

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v3, v3, Lwn0/f$a;

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lxn0/a$a$j;->a()Lwn0/f;

    move-result-object v1

    check-cast v1, Lwn0/f$a;

    invoke-virtual {v1}, Lwn0/f$a;->a()Lwn0/e;

    move-result-object v9

    const/16 v14, 0x7af

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    instance-of v3, v1, Lxn0/a$a$b;

    if-eqz v3, :cond_8

    const/16 v14, 0x79f

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v3, v1, Lxn0/a$a$e;

    if-eqz v3, :cond_b

    check-cast v1, Lxn0/a$a$e;

    invoke-virtual {v1}, Lxn0/a$a$e;->a()Lxn0/e;

    move-result-object v1

    instance-of v3, v1, Lxn0/e$b;

    if-eqz v3, :cond_9

    const/16 v14, 0x6ef

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v1, v1, Lxn0/e$a;

    if-eqz v1, :cond_a

    new-instance v8, Lwn0/c$b;

    const-string v1, "Failed to send new reset link"

    const/4 v3, 0x1

    invoke-direct {v8, v1, v3}, Lwn0/c$b;-><init>(Ljava/lang/String;Z)V

    const/16 v14, 0x7cf

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

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    instance-of v3, v1, Lxn0/a$a$h;

    if-eqz v3, :cond_c

    const/16 v14, 0x5ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_c
    instance-of v3, v1, Lxn0/a$a$c;

    if-eqz v3, :cond_d

    const/16 v14, 0x5ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_d
    instance-of v3, v1, Lxn0/a$a$d;

    if-eqz v3, :cond_e

    const/16 v14, 0x3ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v1, v1, Lxn0/a$a$a;

    if-eqz v1, :cond_f

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v2 .. v15}, Lxn0/c;->b(Lxn0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZILjava/lang/Object;)Lxn0/c;

    move-result-object v1

    return-object v1

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
