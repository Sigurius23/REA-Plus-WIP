.class public final Lch3/y0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lxg3/r;

.field public F:Ljava/lang/Object;

.field public G:I


# direct methods
.method public constructor <init>(Lxg3/r;)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/y0;->E:Lxg3/r;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 3

    iget v0, p0, Lch3/y0;->G:I

    iget-object v1, p0, Lch3/y0;->E:Lxg3/r;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-virtual {v1, v0}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x2

    iput v0, p0, Lch3/y0;->G:I

    iget-object v0, p0, Lch3/y0;->F:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lch3/y0;->F:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lxg3/r;->e(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Lch3/y0;->G:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lch3/y0;->F:Ljava/lang/Object;

    iget-object v0, p0, Lch3/y0;->E:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lch3/y0;->G:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput v1, p0, Lch3/y0;->G:I

    iput-object p1, p0, Lch3/y0;->F:Ljava/lang/Object;

    return-void

    :cond_0
    if-ne v0, v1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lch3/y0;->G:I

    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "The upstream produced more than one value"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lch3/y0;->E:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
