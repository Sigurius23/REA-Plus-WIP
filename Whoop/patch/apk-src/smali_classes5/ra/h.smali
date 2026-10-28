.class public abstract Lra/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqa/f;


# instance fields
.field public final a:Ljava/util/ArrayDeque;

.field public final b:Ljava/util/ArrayDeque;

.field public final c:Ljava/util/ArrayDeque;

.field public d:Lra/g;

.field public e:J

.field public f:J

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    new-instance v3, Lra/g;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, La9/e;-><init>(I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lra/h;->b:Ljava/util/ArrayDeque;

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lra/h;->b:Ljava/util/ArrayDeque;

    new-instance v2, Lqa/d;

    new-instance v3, Lmm/d;

    const/16 v4, 0x1b

    invoke-direct {v3, p0, v4}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2}, Lqa/d;-><init>()V

    iput-object v3, v2, Lqa/d;->H:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lra/h;->c:Ljava/util/ArrayDeque;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lra/h;->g:J

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Lra/h;->e:J

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lra/h;->h()Lqa/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lra/h;->d:Lra/g;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lra/g;

    iput-object v0, p0, Lra/h;->d:Lra/g;

    return-object v0
.end method

.method public final d(J)V
    .locals 0

    iput-wide p1, p0, Lra/h;->g:J

    return-void
.end method

.method public final e(Lqa/i;)V
    .locals 6

    iget-object v0, p0, Lra/h;->d:Lra/g;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->d(Z)V

    check-cast p1, Lra/g;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, La9/e;->G:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lra/h;->g:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    invoke-virtual {p1}, La9/e;->o()V

    iget-object v0, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Lra/h;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lra/h;->f:J

    iput-wide v0, p1, Lra/g;->K:J

    iget-object v0, p0, Lra/h;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lra/h;->d:Lra/g;

    return-void
.end method

.method public abstract f()Lab/g;
.end method

.method public flush()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lra/h;->f:J

    iput-wide v0, p0, Lra/h;->e:J

    :goto_0
    iget-object v0, p0, Lra/h;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lra/g;

    sget v1, Lx8/t;->a:I

    invoke-virtual {v0}, La9/e;->o()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lra/h;->d:Lra/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La9/e;->o()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lra/h;->d:Lra/g;

    :cond_1
    return-void
.end method

.method public abstract g(Lra/g;)V
.end method

.method public h()Lqa/d;
    .locals 7

    iget-object v0, p0, Lra/h;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lra/h;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lra/g;

    sget v3, Lx8/t;->a:I

    iget-wide v2, v2, La9/e;->G:J

    iget-wide v4, p0, Lra/h;->e:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lra/g;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, La9/a;->f(I)Z

    move-result v3

    iget-object v4, p0, Lra/h;->a:Ljava/util/ArrayDeque;

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/d;

    invoke-virtual {v0, v2}, La9/a;->a(I)V

    invoke-virtual {v1}, La9/e;->o()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    invoke-virtual {p0, v1}, Lra/h;->g(Lra/g;)V

    invoke-virtual {p0}, Lra/h;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lra/h;->f()Lab/g;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/d;

    iget-wide v5, v1, La9/e;->G:J

    iput-wide v5, v0, La9/f;->y:J

    iput-object v2, v0, Lqa/d;->E:Lqa/e;

    iput-wide v5, v0, Lqa/d;->F:J

    invoke-virtual {v1}, La9/e;->o()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_2
    invoke-virtual {v1}, La9/e;->o()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract i()Z
.end method

.method public release()V
    .locals 0

    return-void
.end method
