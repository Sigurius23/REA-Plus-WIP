.class final Lh80/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh80/c;->p(Lh80/b;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.presentation.analytics.ActivationAnalyticsHelper$recordAnalyticsEvent$1"
    f = "ActivationAnalyticsHelper.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lh80/c;

.field final synthetic y:Lh80/b;


# direct methods
.method public constructor <init>(Lh80/c;Lh80/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh80/c;",
            "Lh80/b;",
            "Lq83/d<",
            "-",
            "Lh80/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh80/c$f;->x:Lh80/c;

    iput-object p2, p0, Lh80/c$f;->y:Lh80/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lh80/c$f;

    iget-object v0, p0, Lh80/c$f;->x:Lh80/c;

    iget-object v1, p0, Lh80/c$f;->y:Lh80/b;

    invoke-direct {p1, v0, v1, p2}, Lh80/c$f;-><init>(Lh80/c;Lh80/b;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lh80/c$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh80/c$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh80/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh80/c$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh80/c$f;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    invoke-static {v2}, Lh80/c;->d(Lh80/c;)Lhf1/b;

    move-result-object v2

    iput v3, v0, Lh80/c$f;->w:I

    invoke-interface {v2, v0}, Lhf1/b;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Ljava/util/Map;

    iget-object v1, v0, Lh80/c$f;->x:Lh80/c;

    invoke-static {v1}, Lh80/c;->b(Lh80/c;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v8

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    instance-of v2, v1, Lh80/b$j;

    sget-object v3, Lm83/z;->w:Lm83/z;

    if-eqz v2, :cond_4

    check-cast v1, Lh80/b$j;

    invoke-virtual {v1}, Lh80/b$j;->b()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v1

    :goto_1
    invoke-static {v8, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    iget-object v3, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v3, Lh80/b$j;

    invoke-virtual {v3}, Lh80/b$j;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lh80/c;->c(Lh80/c;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v7

    iget-object v3, v0, Lh80/c$f;->x:Lh80/c;

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$j;

    invoke-virtual {v1}, Lh80/b$j;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$j;

    invoke-virtual {v1}, Lh80/b$j;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$j;

    invoke-virtual {v1}, Lh80/b$j;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lh80/c;->z(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    instance-of v2, v1, Lh80/b$i;

    if-eqz v2, :cond_6

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->c()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v3, v1

    :goto_2
    invoke-static {v8, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v15

    iget-object v9, v0, Lh80/c$f;->x:Lh80/c;

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->e()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->a()Ljava/lang/String;

    move-result-object v11

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->d()Ljava/lang/String;

    move-result-object v12

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->f()Ljava/lang/String;

    move-result-object v13

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$i;

    invoke-virtual {v1}, Lh80/b$i;->b()Ljava/lang/String;

    move-result-object v14

    const/16 v17, 0x40

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lh80/c;->x(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_7

    :cond_6
    instance-of v2, v1, Lh80/b$d;

    if-eqz v2, :cond_7

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$d;

    invoke-virtual {v1}, Lh80/b$d;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v3, Lh80/b$d;

    invoke-virtual {v3}, Lh80/b$d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3, v8}, Lh80/c;->g(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_7

    :cond_7
    instance-of v2, v1, Lh80/b$a;

    if-eqz v2, :cond_8

    iget-object v3, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$a;

    invoke-virtual {v1}, Lh80/b$a;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$a;

    invoke-virtual {v1}, Lh80/b$a;->b()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$a;

    invoke-virtual {v1}, Lh80/b$a;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$a;

    invoke-virtual {v1}, Lh80/b$a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v3 .. v8}, Lh80/c;->e(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_7

    :cond_8
    instance-of v2, v1, Lh80/b$g;

    if-eqz v2, :cond_9

    iget-object v3, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$g;

    invoke-virtual {v1}, Lh80/b$g;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$g;

    invoke-virtual {v1}, Lh80/b$g;->b()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$g;

    invoke-virtual {v1}, Lh80/b$g;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$g;

    invoke-virtual {v1}, Lh80/b$g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v3 .. v8}, Lh80/c;->i(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_7

    :cond_9
    instance-of v2, v1, Lh80/b$h;

    if-eqz v2, :cond_a

    iget-object v3, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$h;

    invoke-virtual {v1}, Lh80/b$h;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$h;

    invoke-virtual {v1}, Lh80/b$h;->b()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$h;

    invoke-virtual {v1}, Lh80/b$h;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$h;

    invoke-virtual {v1}, Lh80/b$h;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v3 .. v8}, Lh80/c;->j(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_7

    :cond_a
    instance-of v2, v1, Lh80/b$b;

    if-eqz v2, :cond_b

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$b;

    invoke-virtual {v1}, Lh80/b$b;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v3, Lh80/b$b;

    invoke-virtual {v3}, Lh80/b$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lh80/c;->f(Lh80/c;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_b
    instance-of v2, v1, Lh80/b$c;

    if-eqz v2, :cond_e

    check-cast v1, Lh80/b$c;

    invoke-virtual {v1}, Lh80/b$c;->a()Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "reset_password_challenge"

    :goto_3
    move-object v3, v1

    goto :goto_4

    :cond_c
    const-string v1, "forgot_password"

    goto :goto_3

    :goto_4
    iget-object v1, v0, Lh80/c$f;->x:Lh80/c;

    invoke-static {v1, v3}, Lh80/c;->c(Lh80/c;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v8, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    iget-object v1, v0, Lh80/c$f;->y:Lh80/b;

    check-cast v1, Lh80/b$c;

    invoke-virtual {v1}, Lh80/b$c;->a()Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "Auth Flow"

    :goto_5
    move-object v7, v1

    goto :goto_6

    :cond_d
    const-string v1, "Activation Flow"

    goto :goto_5

    :goto_6
    const/4 v4, 0x0

    const-string v5, "authentication"

    invoke-static/range {v2 .. v7}, Lh80/c;->l(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_7

    :cond_e
    instance-of v2, v1, Lh80/b$f;

    if-eqz v2, :cond_f

    iget-object v3, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$f;

    invoke-virtual {v1}, Lh80/b$f;->a()Ljava/lang/String;

    move-result-object v5

    move-object v9, v8

    const-string v8, "authentication"

    const-string v10, "Auth Flow"

    const-string v4, "reset_password_challenge"

    const-string v6, "screen"

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lh80/c;->k(Lh80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_7

    :cond_f
    instance-of v2, v1, Lh80/b$e;

    if-eqz v2, :cond_10

    iget-object v2, v0, Lh80/c$f;->x:Lh80/c;

    check-cast v1, Lh80/b$e;

    invoke-virtual {v1}, Lh80/b$e;->a()Lh80/d;

    move-result-object v1

    invoke-static {v2, v1, v8}, Lh80/c;->h(Lh80/c;Lh80/d;Ljava/util/Map;)V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
