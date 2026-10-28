.class public final Llh3/b;
.super Llh3/k;
.source "SourceFile"


# static fields
.field public static final y:[Ljava/lang/Object;


# instance fields
.field public final x:Llh3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Llh3/b;->y:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llh3/n;Llh3/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg3/g;-><init>(Lxg3/e;)V

    iput-object p2, p0, Llh3/b;->x:Llh3/n;

    return-void
.end method

.method public static Y(Ljava/lang/Object;Z)Llh3/b;
    .locals 2

    new-instance v0, Llh3/n;

    sget-object v1, Llh3/l;->e:Llh3/l;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Llh3/n;->x:Z

    sget-object v1, Lbh3/e;->a:Lbh3/d;

    iput-object v1, v0, Llh3/n;->y:Lbh3/d;

    iput-object v1, v0, Llh3/n;->z:Lbh3/b;

    iput-object v1, v0, Llh3/n;->E:Lbh3/b;

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    sget-object p0, Lch3/d;->b:Lch3/b;

    :cond_0
    iput-object p0, v0, Llh3/n;->w:Ljava/lang/Object;

    :cond_1
    new-instance p0, Llh3/a;

    invoke-direct {p0, v0}, Llh3/a;-><init>(Llh3/n;)V

    iput-object p0, v0, Llh3/n;->z:Lbh3/b;

    iput-object p0, v0, Llh3/n;->E:Lbh3/b;

    new-instance p0, Llh3/b;

    invoke-direct {p0, v0, v0}, Llh3/b;-><init>(Llh3/n;Llh3/n;)V

    return-object p0
.end method


# virtual methods
.method public final Z()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-object v0, v0, Llh3/n;->w:Ljava/lang/Object;

    if-eqz v0, :cond_1

    instance-of v1, v0, Lch3/c;

    if-nez v1, :cond_1

    sget-object v1, Lch3/d;->a:Lch3/b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final onCompleted()V
    .locals 5

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-object v0, v0, Llh3/n;->w:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-boolean v0, v0, Llh3/n;->x:Z

    if-eqz v0, :cond_2

    :cond_0
    sget-object v0, Lch3/d;->a:Lch3/b;

    iget-object v1, p0, Llh3/b;->x:Llh3/n;

    iput-object v0, v1, Llh3/n;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-boolean v2, v1, Llh3/n;->x:Z

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llh3/l;

    iget-boolean v3, v3, Llh3/l;->a:Z

    if-eqz v3, :cond_1

    sget-object v1, Llh3/l;->c:[Llh3/m;

    goto :goto_0

    :cond_1
    sget-object v3, Llh3/l;->d:Llh3/l;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh3/l;

    iget-object v1, v1, Llh3/l;->b:[Llh3/m;

    :goto_0
    array-length v3, v1

    :goto_1
    if-ge v2, v3, :cond_2

    aget-object v4, v1, v2

    invoke-virtual {v4, v0}, Llh3/m;->a(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-object v0, v0, Llh3/n;->w:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-boolean v0, v0, Llh3/n;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lch3/c;

    invoke-direct {v0, p1}, Lch3/c;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p0, Llh3/b;->x:Llh3/n;

    iput-object v0, p1, Llh3/n;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, p1, Llh3/n;->x:Z

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llh3/l;

    iget-boolean v2, v2, Llh3/l;->a:Z

    if-eqz v2, :cond_2

    sget-object p1, Llh3/l;->c:[Llh3/m;

    goto :goto_1

    :cond_2
    sget-object v2, Llh3/l;->d:Llh3/l;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llh3/l;

    iget-object p1, p1, Llh3/l;->b:[Llh3/m;

    :goto_1
    array-length v2, p1

    const/4 v3, 0x0

    :goto_2
    if-ge v1, v2, :cond_4

    aget-object v4, p1, v1

    :try_start_0
    invoke-virtual {v4, v0}, Llh3/m;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v4

    if-nez v3, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-static {v3}, Ldt/b;->U(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-object v0, v0, Llh3/n;->w:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iget-boolean v0, v0, Llh3/n;->x:Z

    if-eqz v0, :cond_2

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_1
    iget-object v0, p0, Llh3/b;->x:Llh3/n;

    iput-object p1, v0, Llh3/n;->w:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh3/l;

    iget-object v0, v0, Llh3/l;->b:[Llh3/m;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Llh3/m;->a(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
