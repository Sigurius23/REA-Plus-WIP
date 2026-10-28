.class public final Lch3/u0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:Z

.field public final synthetic G:Lxg3/s;

.field public final synthetic H:Lch3/v0;


# direct methods
.method public constructor <init>(Lch3/v0;Lxg3/s;)V
    .locals 0

    iput-object p1, p0, Lch3/u0;->H:Lch3/v0;

    iput-object p2, p0, Lch3/u0;->G:Lxg3/s;

    invoke-direct {p0}, Lxg3/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Lxg3/i;)V
    .locals 1

    new-instance v0, La33/d;

    invoke-direct {v0, p0, p1}, La33/d;-><init>(Lch3/u0;Lxg3/i;)V

    iget-object p1, p0, Lch3/u0;->G:Lxg3/s;

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    iget-boolean v0, p0, Lch3/u0;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/u0;->F:Z

    iget-object v0, p0, Lch3/u0;->G:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lch3/u0;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/u0;->F:Z

    :try_start_0
    iget-object v0, p0, Lch3/u0;->G:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lxg3/s;->b()V

    throw p1

    :cond_0
    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lch3/u0;->E:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lch3/u0;->E:I

    iget-object v2, p0, Lch3/u0;->H:Lch3/v0;

    iget v2, v2, Lch3/v0;->w:I

    if-ge v0, v2, :cond_1

    const/4 v0, 0x1

    if-ne v1, v2, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lch3/u0;->G:Lxg3/s;

    invoke-interface {v2, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    if-eqz v1, :cond_1

    iget-boolean p1, p0, Lch3/u0;->F:Z

    if-nez p1, :cond_1

    iput-boolean v0, p0, Lch3/u0;->F:Z

    :try_start_0
    invoke-interface {v2}, Lxg3/h;->onCompleted()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lxg3/s;->b()V

    throw p1

    :cond_1
    return-void
.end method
