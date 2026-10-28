.class public final Lz1/e;
.super Lz1/f;
.source "SourceFile"


# instance fields
.field public final e:Lkotlin/jvm/functions/Function1;

.field public f:I


# direct methods
.method public constructor <init>(JLz1/j;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz1/f;-><init>(JLz1/j;)V

    iput-object p4, p0, Lz1/e;->e:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    iput p1, p0, Lz1/e;->f:I

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/e;->l()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1/f;->c:Z

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz1/f;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_0
    return-void
.end method

.method public final e()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/e;->e:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i()Lkotlin/jvm/functions/Function1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()V
    .locals 1

    iget v0, p0, Lz1/e;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lz1/e;->f:I

    return-void
.end method

.method public final l()V
    .locals 1

    iget v0, p0, Lz1/e;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lz1/e;->f:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/f;->a()V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 0

    return-void
.end method

.method public final n(Lz1/z;)V
    .locals 1

    sget-object p1, Lz1/l;->a:Lz1/k;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot modify a state object in a read-only snapshot"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u(Lkotlin/jvm/functions/Function1;)Lz1/f;
    .locals 6

    invoke-static {p0}, Lz1/l;->d(Lz1/f;)V

    new-instance v0, Lz1/d;

    iget-wide v1, p0, Lz1/f;->b:J

    iget-object v3, p0, Lz1/f;->a:Lz1/j;

    iget-object v4, p0, Lz1/e;->e:Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x1

    invoke-static {p1, v4, v5}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v4

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lz1/d;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lz1/f;)V

    return-object v0
.end method
