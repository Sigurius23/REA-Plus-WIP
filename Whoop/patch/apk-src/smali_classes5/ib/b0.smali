.class public final Lib/b0;
.super Lib/n;
.source "SourceFile"


# instance fields
.field public final L:Z

.field public final M:Ljava/lang/Object;

.field public final N:Lib/j;


# direct methods
.method public constructor <init>(Lib/n;)V
    .locals 4

    iget-object v0, p1, Lib/n;->z:Lib/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lib/r;

    invoke-direct {v1, v0}, Lib/r;-><init>(Lib/r;)V

    iget-object v0, p1, Lib/n;->w:Ljava/util/concurrent/Executor;

    iget-object v2, p1, Lib/n;->x:Ljava/util/concurrent/Executor;

    iget-object v3, p1, Lib/n;->y:Lib/m;

    invoke-direct {p0, v1, v0, v2, v3}, Lib/n;-><init>(Lib/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lib/m;)V

    invoke-virtual {p1}, Lib/n;->f()Lib/j;

    move-result-object v0

    iput-object v0, p0, Lib/b0;->N:Lib/j;

    invoke-virtual {p1}, Lib/n;->j()Z

    move-result v0

    iput-boolean v0, p0, Lib/b0;->L:Z

    iget v0, p1, Lib/n;->E:I

    iput v0, p0, Lib/n;->E:I

    invoke-virtual {p1}, Lib/n;->g()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lib/b0;->M:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Lib/n;Lib/a;)V
    .locals 0

    return-void
.end method

.method public final f()Lib/j;
    .locals 1

    iget-object v0, p0, Lib/b0;->N:Lib/j;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lib/b0;->M:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lib/b0;->L:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o(I)V
    .locals 0

    return-void
.end method
