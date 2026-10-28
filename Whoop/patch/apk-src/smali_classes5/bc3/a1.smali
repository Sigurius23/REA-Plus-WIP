.class public abstract Lbc3/a1;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public w:J

.field public x:Z

.field public y:Lm83/m;


# virtual methods
.method public final T(Lbc3/o0;)V
    .locals 1

    iget-object v0, p0, Lbc3/a1;->y:Lm83/m;

    if-nez v0, :cond_0

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    iput-object v0, p0, Lbc3/a1;->y:Lm83/m;

    :cond_0
    invoke-virtual {v0, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract a0()Ljava/lang/Thread;
.end method

.method public final b0(Z)V
    .locals 4

    iget-wide v0, p0, Lbc3/a1;->w:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lbc3/a1;->w:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbc3/a1;->x:Z

    :cond_1
    return-void
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 0

    invoke-static {p1}, Lhc3/b;->a(I)V

    if-eqz p2, :cond_0

    new-instance p1, Lhc3/r;

    invoke-direct {p1, p0, p2}, Lhc3/r;-><init>(Lbc3/z;Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object p0
.end method

.method public abstract o0()J
.end method

.method public final p0()Z
    .locals 2

    iget-object v0, p0, Lbc3/a1;->y:Lm83/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lm83/m;->q()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/o0;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lbc3/o0;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public final s(Z)V
    .locals 4

    iget-wide v0, p0, Lbc3/a1;->w:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    sub-long/2addr v0, v2

    iput-wide v0, p0, Lbc3/a1;->w:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, Lbc3/a1;->x:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lbc3/a1;->shutdown()V

    :cond_2
    :goto_1
    return-void
.end method

.method public abstract shutdown()V
.end method

.method public x0(JLbc3/x0;)V
    .locals 1

    sget-object v0, Lbc3/g0;->H:Lbc3/g0;

    invoke-virtual {v0, p1, p2, p3}, Lbc3/z0;->T0(JLbc3/x0;)V

    return-void
.end method
