.class final Lvx0/e$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/e;->n(Lmj0/e;)V
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
    c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$pair$1"
    f = "WhoopBleDebugViewModel.kt"
    l = {
        0x6c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvx0/e;

.field final synthetic y:Lmj0/e;


# direct methods
.method public constructor <init>(Lvx0/e;Lmj0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvx0/e;",
            "Lmj0/e;",
            "Lq83/d<",
            "-",
            "Lvx0/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvx0/e$c;->x:Lvx0/e;

    iput-object p2, p0, Lvx0/e$c;->y:Lmj0/e;

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

    new-instance p1, Lvx0/e$c;

    iget-object v0, p0, Lvx0/e$c;->x:Lvx0/e;

    iget-object v1, p0, Lvx0/e$c;->y:Lmj0/e;

    invoke-direct {p1, v0, v1, p2}, Lvx0/e$c;-><init>(Lvx0/e;Lmj0/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvx0/e$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvx0/e$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvx0/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvx0/e$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvx0/e$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvx0/e$c;->x:Lvx0/e;

    invoke-static {p1}, Lvx0/e;->j(Lvx0/e;)Lec3/p1;

    move-result-object p1

    iget-object v1, p0, Lvx0/e$c;->y:Lmj0/e;

    :cond_2
    move-object v3, p1

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lvx0/d;

    invoke-virtual {v1}, Lmj0/e;->b()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Pairing "

    const-string v8, "\u2026"

    invoke-static {v7, v6, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    invoke-static/range {v5 .. v13}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p1, p0, Lvx0/e$c;->x:Lvx0/e;

    invoke-static {p1}, Lvx0/e;->g(Lvx0/e;)Lft0/c;

    move-result-object p1

    iget-object v1, p0, Lvx0/e$c;->y:Lmj0/e;

    iput v2, p0, Lvx0/e$c;->w:I

    invoke-interface {p1, v1, p0}, Lft0/c;->e(Lmj0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lvx0/e$c;->x:Lvx0/e;

    iget-object v1, p0, Lvx0/e$c;->y:Lmj0/e;

    instance-of v2, p1, Ll83/m;

    if-nez v2, :cond_7

    move-object v2, p1

    check-cast v2, Lft0/b;

    invoke-static {v0}, Lvx0/e;->j(Lvx0/e;)Lec3/p1;

    move-result-object v0

    :cond_4
    move-object v3, v0

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lvx0/d;

    invoke-interface {v2}, Lft0/b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Lft0/b;->getProtocol()Lnj0/f;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Paired "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " ("

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "). Connected to Ready."

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lvx0/d;->d()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lmj0/e;

    invoke-virtual {v8}, Lmj0/e;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lmj0/e;->a()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lmj0/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_7
    iget-object v0, p0, Lvx0/e$c;->x:Lvx0/e;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {v0}, Lvx0/e;->j(Lvx0/e;)Lec3/p1;

    move-result-object v0

    :cond_8
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lvx0/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Pair failed: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
