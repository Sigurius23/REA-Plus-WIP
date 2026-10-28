.class public final Lw73/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ln73/b;


# instance fields
.field public final w:Ll73/d;

.field public final x:Lcom/whoop/data/repositories/c;

.field public y:Ln73/b;

.field public z:Z


# direct methods
.method public constructor <init>(Ll73/d;Lcom/whoop/data/repositories/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/g;->w:Ll73/d;

    iput-object p2, p0, Lw73/g;->x:Lcom/whoop/data/repositories/c;

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 1

    iget-object v0, p0, Lw73/g;->y:Ln73/b;

    invoke-static {v0, p1}, Lq73/c;->c(Ln73/b;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lw73/g;->y:Ln73/b;

    iget-object p1, p0, Lw73/g;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    :cond_0
    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lw73/g;->y:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lw73/g;->y:Ln73/b;

    invoke-interface {v0}, Ln73/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final onComplete()V
    .locals 1

    iget-boolean v0, p0, Lw73/g;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/g;->z:Z

    iget-object v0, p0, Lw73/g;->w:Ll73/d;

    invoke-interface {v0}, Ll73/d;->onComplete()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lw73/g;->z:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/g;->z:Z

    iget-object v0, p0, Lw73/g;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lw73/g;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw73/g;->x:Lcom/whoop/data/repositories/c;

    invoke-virtual {v0, p1}, Lcom/whoop/data/repositories/c;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lw73/g;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw73/g;->y:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    invoke-virtual {p0, p1}, Lw73/g;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
