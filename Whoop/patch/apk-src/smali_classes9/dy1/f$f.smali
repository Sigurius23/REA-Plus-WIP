.class final Ldy1/f$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/f;->u()V
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
    c = "com.whoop.memfault.PuffinMemfaultManager$sendChunks$1"
    f = "PuffinMemfaultManager.kt"
    l = {
        0x87
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldy1/f;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ldy1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldy1/f;",
            "Lq83/d<",
            "-",
            "Ldy1/f$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldy1/f$f;->E:Ldy1/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Ldy1/f$f;

    iget-object v0, p0, Ldy1/f$f;->E:Ldy1/f;

    invoke-direct {p1, v0, p2}, Ldy1/f$f;-><init>(Ldy1/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ldy1/f$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldy1/f$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldy1/f$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldy1/f$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldy1/f$f;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ldy1/f$f;->x:Ljava/lang/Object;

    check-cast v0, Ldy1/f;

    iget-object v1, p0, Ldy1/f$f;->w:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldy1/f$f;->E:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->j(Ldy1/f;)Lmc3/a;

    move-result-object v1

    iget-object p1, p0, Ldy1/f$f;->E:Ldy1/f;

    iput-object v1, p0, Ldy1/f$f;->w:Ljava/lang/Object;

    iput-object p1, p0, Ldy1/f$f;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Ldy1/f$f;->y:I

    iput v2, p0, Ldy1/f$f;->z:I

    invoke-interface {v1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    const/4 p1, 0x0

    :try_start_0
    invoke-static {v0}, Ldy1/f;->l(Ldy1/f;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v0}, Ldy1/f;->e(Ldy1/f;)Ldw/c;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Ldy1/f;->g(Ldy1/f;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldw/c;->a(Ljava/util/List;)V

    invoke-static {v0}, Ldy1/f;->g(Ldy1/f;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-static {v0}, Ldy1/f;->d(Ldy1/f;)Ldy1/f$a;

    move-result-object v0

    invoke-virtual {v2, v0}, Ldw/c;->b(Ldw/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_2
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
