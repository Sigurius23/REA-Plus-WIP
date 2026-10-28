.class public final Ly2/e1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/a0;


# instance fields
.field public O:Lkotlin/jvm/functions/Function1;

.field public P:J


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(J)V
    .locals 2

    iget-wide v0, p0, Ly2/e1;->P:J

    invoke-static {v0, v1, p1, p2}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly2/e1;->O:Lkotlin/jvm/functions/Function1;

    new-instance v1, Ly3/l;

    invoke-direct {v1, p1, p2}, Ly3/l;-><init>(J)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-wide p1, p0, Ly2/e1;->P:J

    :cond_0
    return-void
.end method
