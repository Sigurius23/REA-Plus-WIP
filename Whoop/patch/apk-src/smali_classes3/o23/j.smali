.class public final Lo23/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final a:Lc93/a;

.field public final b:Lc93/a;

.field public final c:Lhc3/d;

.field public final d:Le53/d;

.field public final e:Lac3/b;


# direct methods
.method public constructor <init>(Lbc3/c0;Lc93/a;Lc93/a;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo23/j;->a:Lc93/a;

    iput-object p3, p0, Lo23/j;->b:Lc93/a;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p2

    new-instance p3, Lbc3/e2;

    invoke-direct {p3, p2}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-static {p1, p3}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lo23/j;->c:Lhc3/d;

    new-instance p1, Le53/d;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-object p2, p1, Le53/d;->a:Ljava/lang/Object;

    iput-object p1, p0, Lo23/j;->d:Le53/d;

    new-instance p1, Lac3/b;

    invoke-direct {p1, p2}, Lac3/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lo23/j;->e:Lac3/b;

    return-void
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, La6/e;

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-direct {v0, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lo23/j;->e:Lac3/b;

    invoke-virtual {v0}, Lac3/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo23/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lo23/d;->cancel()V

    :cond_0
    iget-object v0, p0, Lo23/j;->c:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    iget-object v0, p0, Lo23/j;->d:Le53/d;

    iget-object v1, v0, Le53/d;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Le53/d;->a:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lo23/j;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final enqueue()V
    .locals 2

    .line 2
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/j;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final enqueue(Lo23/a;)V
    .locals 3

    .line 1
    new-instance v0, Ln20/j;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lo23/j;->c:Lhc3/d;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final execute()Ln23/h;
    .locals 3

    new-instance v0, Lo23/i;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lo23/i;-><init>(Lo23/j;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0
.end method
