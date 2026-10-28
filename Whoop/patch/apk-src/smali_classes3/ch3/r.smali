.class public final Lch3/r;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Z

.field public G:Ljava/lang/Object;

.field public final synthetic H:Lxg3/r;


# direct methods
.method public constructor <init>(Lxg3/r;)V
    .locals 0

    iput-object p1, p0, Lch3/r;->H:Lxg3/r;

    invoke-direct {p0}, Lxg3/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void
.end method

.method public final onCompleted()V
    .locals 3

    iget-boolean v0, p0, Lch3/r;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lch3/r;->F:Z

    iget-object v1, p0, Lch3/r;->H:Lxg3/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lch3/r;->G:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lxg3/r;->e(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Observable emitted no items"

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lch3/r;->H:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lch3/r;->F:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lch3/r;->E:Z

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Observable emitted too many elements"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lch3/r;->H:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void

    :cond_0
    iput-boolean v1, p0, Lch3/r;->F:Z

    iput-object p1, p0, Lch3/r;->G:Ljava/lang/Object;

    return-void
.end method
