.class public final Li20/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lbc3/c2;


# virtual methods
.method public a(Lhc3/d;Ln53/g;Lt23/n0;)V
    .locals 7

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li20/q0;->a:Lbc3/c2;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object p2, p2, Ln53/g;->a:Lt23/n0;

    invoke-virtual {p2}, Lt23/n0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const-wide/16 v0, 0x0

    cmp-long p2, v2, v0

    if-gtz p2, :cond_1

    invoke-virtual {p3}, Lt23/n0;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    sget-object p2, Lbc3/q0;->b:Lbc3/l2;

    new-instance v1, Lb4/i;

    const/4 v6, 0x3

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(JLjava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x2

    invoke-static {p1, p2, v5, v1, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Li20/q0;->a:Lbc3/c2;

    return-void
.end method
