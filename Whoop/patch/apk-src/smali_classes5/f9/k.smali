.class public final Lf9/k;
.super Lf9/m;
.source "SourceFile"

# interfaces
.implements Le9/i;


# instance fields
.field public final F:Lf9/n;


# direct methods
.method public constructor <init>(Lu8/p;Lzr/g0;Lf9/n;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf9/m;-><init>(Lu8/p;Ljava/util/List;Lf9/s;Ljava/util/List;)V

    iput-object p3, p0, Lf9/k;->F:Lf9/n;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0}, Lf9/n;->i()Z

    move-result v0

    return v0
.end method

.method public final B()J
    .locals 2

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    iget-wide v0, v0, Lf9/n;->d:J

    return-wide v0
.end method

.method public final D(JJ)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->b(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final a(J)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2}, Lf9/n;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Le9/i;
    .locals 0

    return-object p0
.end method

.method public final d()Lf9/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final q(JJ)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->e(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final r(JJ)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final s(JJ)J
    .locals 3

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    iget-object v1, v0, Lf9/n;->f:Ljava/util/List;

    if-eqz v1, :cond_0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->c(JJ)J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->b(JJ)J

    move-result-wide p3

    add-long/2addr p3, v1

    invoke-virtual {v0, p3, p4}, Lf9/n;->g(J)J

    move-result-wide v1

    invoke-virtual {v0, p3, p4, p1, p2}, Lf9/n;->e(JJ)J

    move-result-wide p1

    add-long/2addr p1, v1

    iget-wide p3, v0, Lf9/n;->i:J

    sub-long/2addr p1, p3

    return-wide p1
.end method

.method public final t(J)Lf9/j;
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p0, p1, p2}, Lf9/n;->h(Lf9/k;J)Lf9/j;

    move-result-object p1

    return-object p1
.end method

.method public final u(JJ)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf9/n;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final w(J)J
    .locals 1

    iget-object v0, p0, Lf9/k;->F:Lf9/n;

    invoke-virtual {v0, p1, p2}, Lf9/n;->d(J)J

    move-result-wide p1

    return-wide p1
.end method
