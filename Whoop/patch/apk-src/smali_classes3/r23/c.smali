.class public final Lr23/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final a:Lo23/d;

.field public final b:Lbc3/c0;

.field public final c:Lq30/w0;

.field public d:Lbc3/c2;

.field public final e:Lac3/a;


# direct methods
.method public constructor <init>(Lo23/d;Lbc3/c0;Lq30/w0;)V
    .locals 1

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr23/c;->a:Lo23/d;

    iput-object p2, p0, Lr23/c;->b:Lbc3/c0;

    iput-object p3, p0, Lr23/c;->c:Lq30/w0;

    new-instance p1, Lac3/a;

    invoke-direct {p1}, Lac3/a;-><init>()V

    iput-object p1, p0, Lr23/c;->e:Lac3/a;

    return-void
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lr23/c;->b:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lr23/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lr23/b;-><init>(Lr23/c;Lq83/d;I)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lr23/c;->e:Lac3/a;

    invoke-virtual {v0}, Lac3/a;->b()V

    iget-object v0, p0, Lr23/c;->a:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lr23/c;->d:Lbc3/c2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final enqueue()V
    .locals 2

    .line 2
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lr23/c;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final enqueue(Lo23/a;)V
    .locals 3

    .line 1
    new-instance v0, Ln20/j;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lr23/c;->b:Lbc3/c0;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lr23/c;->d:Lbc3/c2;

    return-void
.end method

.method public final execute()Ln23/h;
    .locals 3

    new-instance v0, Lr23/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lr23/b;-><init>(Lr23/c;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0
.end method
