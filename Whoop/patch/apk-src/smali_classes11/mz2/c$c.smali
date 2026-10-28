.class final Lmz2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmz2/c;->s(Lmz2/d;)V
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
    c = "com.whoop.whooplabs.io.HrConnectionMaintainer$waitAndRescan$2"
    f = "HrConnectionMaintainer.kt"
    l = {
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmz2/c;

.field final synthetic z:Lmz2/d;


# direct methods
.method public constructor <init>(Lmz2/c;Lmz2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmz2/c;",
            "Lmz2/d;",
            "Lq83/d<",
            "-",
            "Lmz2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmz2/c$c;->y:Lmz2/c;

    iput-object p2, p0, Lmz2/c$c;->z:Lmz2/d;

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

    new-instance v0, Lmz2/c$c;

    iget-object v1, p0, Lmz2/c$c;->y:Lmz2/c;

    iget-object v2, p0, Lmz2/c$c;->z:Lmz2/d;

    invoke-direct {v0, v1, v2, p2}, Lmz2/c$c;-><init>(Lmz2/c;Lmz2/d;Lq83/d;)V

    iput-object p1, v0, Lmz2/c$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmz2/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmz2/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmz2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmz2/c$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lmz2/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmz2/c$c;->w:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    :try_start_1
    iget-object p1, p0, Lmz2/c$c;->y:Lmz2/c;

    invoke-virtual {p1}, Lmz2/c;->m()Ltr2/n;

    move-result-object p1

    const-string v2, "waiting to rescan"

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v0, p0, Lmz2/c$c;->x:Ljava/lang/Object;

    iput v3, p0, Lmz2/c$c;->w:I

    const-wide/16 v5, 0x7530

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_1
    iget-object p1, p0, Lmz2/c$c;->y:Lmz2/c;

    invoke-virtual {p1}, Lmz2/c;->m()Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lmz2/c$c;->y:Lmz2/c;

    invoke-static {v2}, Lmz2/c;->d(Lmz2/c;)Lcom/whoop/whooplabs/io/HrDeviceConnection;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v5, "hrDeviceConnection"

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    :try_start_2
    invoke-virtual {v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->D()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "finished waiting to rescan; starting scan for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v8, p0, Lmz2/c$c;->z:Lmz2/d;

    iget-object p1, p0, Lmz2/c$c;->y:Lmz2/c;

    invoke-static {p1}, Lmz2/c;->d(Lmz2/c;)Lcom/whoop/whooplabs/io/HrDeviceConnection;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->D()Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lmz2/d;->o(Lmz2/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p1, Lmz2/c$c$a;

    iget-object v2, p0, Lmz2/c$c;->z:Lmz2/d;

    invoke-direct {p1, v2, v6}, Lmz2/c$c$a;-><init>(Lmz2/d;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v6, v6, p1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    iget-object v0, p0, Lmz2/c$c;->y:Lmz2/c;

    invoke-virtual {v0}, Lmz2/c;->m()Ltr2/n;

    move-result-object v0

    const-string v1, "waitAndRescanScope cancelled; stopping scan"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lmz2/c$c;->z:Lmz2/d;

    invoke-virtual {v0}, Lmz2/d;->p()V

    throw p1
.end method
