.class public final Lt92/b$m;
.super Lc83/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;->p2(Llt0/c;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt92/b$m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc83/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0005\u00a8\u0006\u000e"
    }
    d2 = {
        "t92/b$m",
        "Lc83/a;",
        "Lzj0/h;",
        "Ll83/a0;",
        "a",
        "()V",
        "commandResponsePacket",
        "c",
        "(Lzj0/h;)V",
        "",
        "throwable",
        "onError",
        "(Ljava/lang/Throwable;)V",
        "onComplete",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field

.field final synthetic x:Lt92/b;

.field final synthetic y:Llt0/c;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lt92/b;Llt0/c;ZLbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt92/b;",
            "Llt0/c;",
            "Z",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lt92/b$m;->x:Lt92/b;

    iput-object p2, p0, Lt92/b$m;->y:Llt0/c;

    iput-boolean p3, p0, Lt92/b$m;->z:Z

    iput-object p4, p0, Lt92/b$m;->E:Lbc3/k;

    invoke-direct {p0}, Lc83/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lt92/b$m;->x:Lt92/b;

    iget-object v1, p0, Lt92/b$m;->y:Llt0/c;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lnk0/a;->Q0(Lnk0/a;Llt0/c;JILjava/lang/Object;)Lnk0/a$a;

    return-void
.end method

.method public c(Lzj0/h;)V
    .locals 8

    const-string v0, "commandResponsePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt92/b$m;->y:Llt0/c;

    invoke-virtual {v0}, Llt0/c;->N()B

    move-result v0

    invoke-virtual {p1}, Lzj0/h;->T()B

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {p1}, Lzj0/h;->T()B

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lt92/b$m;->y:Llt0/c;

    instance-of v4, v1, Lxj0/b;

    if-eqz v4, :cond_1

    check-cast v1, Lxj0/b;

    iget-object v4, p0, Lt92/b$m;->x:Lt92/b;

    invoke-virtual {v4}, Lt92/b;->W1()Lst0/v;

    move-result-object v4

    invoke-virtual {v1, v4}, Lxj0/b;->s(Lst0/v;)Llt0/a;

    move-result-object v1

    invoke-virtual {p1}, Lzj0/h;->Q()Llt0/e;

    move-result-object v4

    if-ne v1, v4, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    if-nez v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v4, p0, Lt92/b$m;->x:Lt92/b;

    invoke-static {v4}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object v4

    invoke-virtual {p1}, Lzj0/h;->Q()Llt0/e;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Seq#0 workaround: matched by command type instead of sequence number for "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    if-nez v0, :cond_3

    if-eqz v1, :cond_5

    :cond_3
    iget-object v0, p0, Lt92/b$m;->y:Llt0/c;

    instance-of v1, v0, Lxj0/b;

    if-eqz v1, :cond_4

    check-cast v0, Lxj0/b;

    iget-object v1, p0, Lt92/b$m;->x:Lt92/b;

    invoke-virtual {v1}, Lt92/b;->W1()Lst0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxj0/b;->s(Lst0/v;)Llt0/a;

    move-result-object v0

    invoke-virtual {p1}, Lzj0/h;->Q()Llt0/e;

    move-result-object v1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lt92/b$m;->y:Llt0/c;

    check-cast v0, Lxj0/b;

    iget-object v1, p0, Lt92/b$m;->x:Lt92/b;

    invoke-virtual {v1}, Lt92/b;->W1()Lst0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxj0/b;->s(Lst0/v;)Llt0/a;

    move-result-object v0

    invoke-virtual {p1}, Lzj0/h;->Q()Llt0/e;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sendCommandToStrapWithTimeout found ERRONEOUSLY MATCHING COMMAND NUMBERS to CommandNumbers: ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " | "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lt92/b$m;->x:Lt92/b;

    invoke-static {v0}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lt92/b$m;->x:Lt92/b;

    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "Disposing the whoopStrapCommandCallbacks subscription"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void

    :cond_4
    iget-object v0, p0, Lt92/b$m;->x:Lt92/b;

    invoke-static {v0}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lt92/b$m;->y:Llt0/c;

    invoke-virtual {v1}, Llt0/c;->N()B

    move-result v1

    const-string v4, "sendCommandToStrapWithTimeout matched sequenceNumber "

    invoke-static {v1, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-boolean v0, p0, Lt92/b$m;->z:Z

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lzj0/h;->V()Lwj0/b;

    move-result-object v0

    sget-object v1, Lt92/b$m$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    const/4 p1, 0x4

    if-ne v0, p1, :cond_6

    :cond_5
    return-void

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    iget-object v0, p0, Lt92/b$m;->E:Lbc3/k;

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void

    :cond_8
    iget-object v0, p0, Lt92/b$m;->E:Lbc3/k;

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lt92/b$m;->E:Lbc3/k;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt92/b$m;->E:Lbc3/k;

    invoke-interface {v0, p1}, Lbc3/k;->cancel(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzj0/h;

    invoke-virtual {p0, p1}, Lt92/b$m;->c(Lzj0/h;)V

    return-void
.end method
