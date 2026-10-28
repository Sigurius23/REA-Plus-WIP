.class public final Le1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/d1;


# instance fields
.field public a:J

.field public b:J

.field public final synthetic c:Le1/i;

.field public final synthetic d:Lf1/a1;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(JLe1/i;Lf1/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Le1/k;->c:Le1/i;

    iput-object p4, p0, Le1/k;->d:Lf1/a1;

    iput-wide p1, p0, Le1/k;->e:J

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Le1/k;->a:J

    iput-wide p1, p0, Le1/k;->b:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(J)V
    .locals 6

    iget-object v0, p0, Le1/k;->c:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    iget-object v1, p0, Le1/k;->d:Lf1/a1;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lf1/w;->e:Lf1/v;

    move-object v3, v1

    check-cast v3, Lf1/b1;

    iget-object v3, v3, Lf1/b1;->f:Las1/j;

    if-eqz v3, :cond_1

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v5, Lh2/b;

    invoke-direct {v5, p1, p2}, Lh2/b;-><init>(J)V

    invoke-virtual {v3, v4, v0, v5, v2}, Las1/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-wide p1, p0, Le1/k;->a:J

    :cond_2
    iget-wide p1, p0, Le1/k;->e:J

    invoke-static {v1, p1, p2}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    return-void

    :cond_3
    const-wide/16 p1, 0x0

    iput-wide p1, p0, Le1/k;->b:J

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(J)V
    .locals 9

    iget-object v0, p0, Le1/k;->c:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ly2/y;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ly2/y;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le1/k;->d:Lf1/a1;

    iget-wide v3, p0, Le1/k;->e:J

    invoke-static {v0, v3, v4}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v3, p0, Le1/k;->b:J

    invoke-static {v3, v4, p1, p2}, Lh2/b;->h(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Le1/k;->b:J

    iget-wide v3, p0, Le1/k;->a:J

    invoke-static {v3, v4, p1, p2}, Lh2/b;->h(JJ)J

    move-result-wide v3

    iget-wide v5, p0, Le1/k;->a:J

    sget-object v7, Lf1/w;->e:Lf1/v;

    const/4 v8, 0x1

    move-object v1, v0

    check-cast v1, Lf1/b1;

    invoke-virtual/range {v1 .. v8}, Lf1/b1;->d(Ly2/y;JJLf1/v;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-wide v3, p0, Le1/k;->a:J

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Le1/k;->b:J

    :cond_2
    :goto_0
    return-void
.end method

.method public final onCancel()V
    .locals 3

    iget-wide v0, p0, Le1/k;->e:J

    iget-object v2, p0, Le1/k;->d:Lf1/a1;

    invoke-static {v2, v0, v1}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast v2, Lf1/b1;

    iget-object v0, v2, Lf1/b1;->h:Lf1/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/d0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 3

    iget-wide v0, p0, Le1/k;->e:J

    iget-object v2, p0, Le1/k;->d:Lf1/a1;

    invoke-static {v2, v0, v1}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast v2, Lf1/b1;

    iget-object v0, v2, Lf1/b1;->h:Lf1/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/d0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
