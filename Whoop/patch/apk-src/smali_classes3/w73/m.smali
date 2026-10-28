.class public final Lw73/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ln73/b;


# instance fields
.field public final w:Ll73/d;

.field public x:Ln73/b;


# direct methods
.method public constructor <init>(Ll73/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/m;->w:Ll73/d;

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 1

    iget-object v0, p0, Lw73/m;->x:Ln73/b;

    invoke-static {v0, p1}, Lq73/c;->c(Ln73/b;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lw73/m;->x:Ln73/b;

    iget-object p1, p0, Lw73/m;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    :cond_0
    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lw73/m;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lw73/m;->x:Ln73/b;

    invoke-interface {v0}, Ln73/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final onComplete()V
    .locals 1

    iget-object v0, p0, Lw73/m;->w:Ll73/d;

    invoke-interface {v0}, Ll73/d;->onComplete()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lw73/m;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw73/m;->w:Ll73/d;

    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
