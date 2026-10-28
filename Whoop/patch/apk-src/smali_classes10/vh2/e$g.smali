.class final Lvh2/e$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/e;->b()V
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
    c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$retryUnlockIfLocked$1"
    f = "StrapUnlockServiceImpl.kt"
    l = {
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lvh2/e;

.field final synthetic y:Ljk0/d;

.field final synthetic z:Lcom/whoop/domain/model/WhoopStrapInfo;


# direct methods
.method public constructor <init>(Lvh2/e;Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/e;",
            "Ljk0/d;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvh2/e$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/e$g;->x:Lvh2/e;

    iput-object p2, p0, Lvh2/e$g;->y:Ljk0/d;

    iput-object p3, p0, Lvh2/e$g;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iput-object p4, p0, Lvh2/e$g;->E:Ljava/lang/String;

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

    new-instance v0, Lvh2/e$g;

    iget-object v1, p0, Lvh2/e$g;->x:Lvh2/e;

    iget-object v2, p0, Lvh2/e$g;->y:Ljk0/d;

    iget-object v3, p0, Lvh2/e$g;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v4, p0, Lvh2/e$g;->E:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvh2/e$g;-><init>(Lvh2/e;Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lvh2/e$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvh2/e$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvh2/e$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvh2/e$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const-string v0, "Unlock retry failed ("

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvh2/e$g;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v11, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v11, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v4

    :try_start_1
    iget-object v4, p0, Lvh2/e$g;->x:Lvh2/e;

    iget-object v5, p0, Lvh2/e$g;->y:Ljk0/d;

    iget-object v2, p0, Lvh2/e$g;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lvh2/e$g;->E:Ljava/lang/String;

    sget-object v8, Lsj2/a$a;->a:Lsj2/a$a;

    sget-object v9, Lvh2/i;->UNLOCK:Lvh2/i;

    iput p1, p0, Lvh2/e$g;->w:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v10, 0x1

    move-object v11, p0

    :try_start_2
    invoke-static/range {v4 .. v11}, Lvh2/e;->g(Lvh2/e;Ljk0/d;Ljava/lang/String;Ljava/lang/String;Lsj2/a;Lvh2/i;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lvh2/h;

    sget-object v1, Lvh2/h$c;->a:Lvh2/h$c;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, v11, Lvh2/e$g;->y:Ljk0/d;

    invoke-interface {p1}, Ljk0/d;->i0()V

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_3

    :cond_3
    instance-of v1, p1, Lvh2/h$a;

    if-eqz v1, :cond_4

    iget-object v1, v11, Lvh2/e$g;->x:Lvh2/e;

    invoke-static {v1}, Lvh2/e;->i(Lvh2/e;)Ltr2/n;

    move-result-object v1

    check-cast p1, Lvh2/h$a;

    invoke-virtual {p1}, Lvh2/h$a;->a()Lvh2/h$b;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "); strap remains Locked"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    iget-object p1, v11, Lvh2/e$g;->x:Lvh2/e;

    invoke-static {p1}, Lvh2/e;->h(Lvh2/e;)Lmc3/a;

    move-result-object p1

    invoke-interface {p1, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    :try_start_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_2
    move-exception v0

    move-object v11, p0

    goto :goto_1

    :goto_3
    iget-object v0, v11, Lvh2/e$g;->x:Lvh2/e;

    invoke-static {v0}, Lvh2/e;->h(Lvh2/e;)Lmc3/a;

    move-result-object v0

    invoke-interface {v0, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
