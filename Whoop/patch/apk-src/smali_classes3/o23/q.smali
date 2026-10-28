.class public final Lo23/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final a:Lo23/d;

.field public final b:Ls83/i;

.field public final c:Lhc3/d;


# direct methods
.method public constructor <init>(Lo23/d;Lbc3/c0;Lc93/m;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo23/q;->a:Lo23/d;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lo23/q;->b:Ls83/i;

    invoke-interface {p2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    new-instance p3, Lbc3/e2;

    invoke-direct {p3, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-static {p2, p3}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lo23/q;->c:Lhc3/d;

    return-void
.end method

.method public static final a(Lo23/q;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_1

    iget-object p0, p0, Lo23/q;->b:Ls83/i;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Landroidx/room/v0;

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v1, 0x2

    const-class v3, Lo23/q;

    const-string v4, "map"

    const-string v5, "map(Lio/getstream/result/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, La6/e;

    const/4 v3, 0x0

    const/16 v4, 0xd

    invoke-direct {v1, p0, v3, v4}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v3, Lo23/c;->a:Lo23/c;

    invoke-virtual {v3, v0, v1, p1}, Lo23/c;->a(Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lo23/q;->a:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/q;->c:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void
.end method

.method public final enqueue()V
    .locals 2

    .line 2
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/q;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final enqueue(Lo23/a;)V
    .locals 3

    .line 1
    new-instance v0, Lo23/p;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lo23/q;->c:Lhc3/d;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final execute()Ln23/h;
    .locals 3

    new-instance v0, Lkd/f;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0
.end method
