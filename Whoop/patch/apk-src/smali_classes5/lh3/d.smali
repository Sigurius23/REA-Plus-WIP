.class public final Llh3/d;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lxg3/e;
.implements Lxg3/h;


# static fields
.field public static final E:[Llh3/f;

.field public static final F:[Llh3/f;

.field public static final y:[Llh3/c;

.field public static final z:[Llh3/c;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Llh3/c;

    sput-object v1, Llh3/d;->y:[Llh3/c;

    new-array v0, v0, [Llh3/c;

    sput-object v0, Llh3/d;->z:[Llh3/c;

    const/4 v0, 0x0

    new-array v1, v0, [Llh3/f;

    sput-object v1, Llh3/d;->E:[Llh3/f;

    new-array v0, v0, [Llh3/f;

    sput-object v0, Llh3/d;->F:[Llh3/f;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llh3/d;->w:I

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method

.method public constructor <init>(Llh3/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Llh3/d;->w:I

    .line 2
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3
    iput-object p1, p0, Llh3/d;->x:Ljava/lang/Object;

    .line 4
    sget-object p1, Llh3/d;->E:[Llh3/f;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Llh3/c;)V
    .locals 6

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llh3/c;

    sget-object v1, Llh3/d;->z:[Llh3/c;

    if-eq v0, v1, :cond_6

    sget-object v1, Llh3/d;->y:[Llh3/c;

    if-ne v0, v1, :cond_1

    goto :goto_3

    :cond_1
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v0, v4

    if-ne v5, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, -0x1

    :goto_1
    if-gez v4, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x1

    if-ne v2, v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v2, -0x1

    new-array v1, v1, [Llh3/c;

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v4, 0x1

    sub-int/2addr v2, v4

    sub-int/2addr v2, v5

    invoke-static {v0, v3, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Llh3/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Llh3/f;

    invoke-direct {v0, p0, p1}, Llh3/f;-><init>(Llh3/d;Lxg3/s;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Llh3/f;

    sget-object v1, Llh3/d;->F:[Llh3/f;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    array-length v1, p1

    add-int/lit8 v2, v1, 0x1

    new-array v2, v2, [Llh3/f;

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v2, v1

    invoke-virtual {p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, v0, Llh3/f;->w:Lxg3/s;

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Llh3/d;->c(Llh3/f;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Llh3/d;->x:Ljava/lang/Object;

    check-cast p1, Llh3/h;

    invoke-virtual {p1, v0}, Llh3/h;->a(Llh3/f;)V

    :goto_1
    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    new-instance v0, Llh3/c;

    invoke-direct {v0, p0, p1}, Llh3/c;-><init>(Llh3/d;Lxg3/s;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    :cond_3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Llh3/c;

    sget-object v2, Llh3/d;->z:[Llh3/c;

    if-ne v1, v2, :cond_5

    iget-object v0, p0, Llh3/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    invoke-interface {p1, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    goto :goto_2

    :cond_5
    array-length v2, v1

    add-int/lit8 v3, v2, 0x1

    new-array v3, v3, [Llh3/c;

    const/4 v4, 0x0

    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v3, v2

    invoke-virtual {p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Llh3/c;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v0}, Llh3/d;->a(Llh3/c;)V

    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Llh3/f;)V
    .locals 6

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llh3/f;

    sget-object v1, Llh3/d;->F:[Llh3/f;

    if-eq v0, v1, :cond_6

    sget-object v1, Llh3/d;->E:[Llh3/f;

    if-ne v0, v1, :cond_1

    goto :goto_3

    :cond_1
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v0, v4

    if-ne v5, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, -0x1

    :goto_1
    if-gez v4, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x1

    if-ne v2, v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v2, -0x1

    new-array v1, v1, [Llh3/f;

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v4, 0x1

    sub-int/2addr v2, v4

    sub-int/2addr v2, v5

    invoke-static {v0, v3, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final onCompleted()V
    .locals 5

    iget v0, p0, Llh3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh3/d;->x:Ljava/lang/Object;

    check-cast v0, Llh3/h;

    const/4 v1, 0x1

    iput-boolean v1, v0, Llh3/h;->e:Z

    sget-object v1, Llh3/d;->F:[Llh3/f;

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Llh3/f;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Llh3/h;->a(Llh3/f;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    sget-object v0, Llh3/d;->z:[Llh3/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llh3/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Llh3/c;->onCompleted()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 6

    iget v0, p0, Llh3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh3/d;->x:Ljava/lang/Object;

    check-cast v0, Llh3/h;

    iput-object p1, v0, Llh3/h;->f:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, v0, Llh3/h;->e:Z

    sget-object p1, Llh3/d;->F:[Llh3/f;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Llh3/f;

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    :try_start_0
    invoke-virtual {v0, v4}, Llh3/h;->a(Llh3/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ldt/b;->U(Ljava/util/ArrayList;)V

    return-void

    :pswitch_0
    iput-object p1, p0, Llh3/d;->x:Ljava/lang/Object;

    sget-object v0, Llh3/d;->z:[Llh3/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llh3/c;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    :try_start_1
    invoke-virtual {v4, p1}, Llh3/c;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v4

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    const/4 v5, 0x1

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    :cond_2
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-static {v2}, Ldt/b;->U(Ljava/util/ArrayList;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Llh3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh3/d;->x:Ljava/lang/Object;

    check-cast v0, Llh3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Llh3/g;

    invoke-direct {v1, p1}, Llh3/g;-><init>(Ljava/lang/Object;)V

    iget-object p1, v0, Llh3/h;->c:Llh3/g;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object v1, v0, Llh3/h;->c:Llh3/g;

    iget p1, v0, Llh3/h;->d:I

    iget v1, v0, Llh3/h;->a:I

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Llh3/h;->b:Llh3/g;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llh3/g;

    iput-object p1, v0, Llh3/h;->b:Llh3/g;

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Llh3/h;->d:I

    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Llh3/f;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v0, v3}, Llh3/h;->a(Llh3/f;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :pswitch_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llh3/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Llh3/c;->onNext(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
