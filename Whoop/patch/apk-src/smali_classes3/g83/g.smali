.class public final Lg83/g;
.super Lg83/i;
.source "SourceFile"


# static fields
.field public static final E:[Lg83/e;

.field public static final F:[Ljava/lang/Object;

.field public static final z:[Lg83/e;


# instance fields
.field public final w:Lg83/f;

.field public final x:Ljava/util/concurrent/atomic/AtomicReference;

.field public y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lg83/e;

    sput-object v1, Lg83/g;->z:[Lg83/e;

    new-array v1, v0, [Lg83/e;

    sput-object v1, Lg83/g;->E:[Lg83/e;

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lg83/g;->F:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg83/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg83/g;->w:Lg83/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lg83/g;->z:[Lg83/e;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static e()Lg83/g;
    .locals 2

    new-instance v0, Lg83/g;

    new-instance v1, Lg83/f;

    invoke-direct {v1}, Lg83/f;-><init>()V

    invoke-direct {v0, v1}, Lg83/g;-><init>(Lg83/f;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 1

    iget-boolean v0, p0, Lg83/g;->y:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ln73/b;->dispose()V

    :cond_0
    return-void
.end method

.method public final d(Ll73/d;)V
    .locals 5

    new-instance v0, Lg83/e;

    invoke-direct {v0, p1, p0}, Lg83/e;-><init>(Ll73/d;Lg83/g;)V

    invoke-interface {p1, v0}, Ll73/d;->b(Ln73/b;)V

    iget-boolean p1, v0, Lg83/e;->z:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lg83/e;

    sget-object v2, Lg83/g;->E:[Lg83/e;

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, v1

    add-int/lit8 v3, v2, 0x1

    new-array v3, v3, [Lg83/e;

    const/4 v4, 0x0

    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v3, v2

    :cond_1
    invoke-virtual {p1, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean p1, v0, Lg83/e;->z:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Lg83/g;->f(Lg83/e;)V

    return-void

    :cond_2
    :goto_1
    iget-object p1, p0, Lg83/g;->w:Lg83/f;

    invoke-virtual {p1, v0}, Lg83/f;->a(Lg83/e;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final f(Lg83/e;)V
    .locals 7

    :goto_0
    iget-object v0, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lg83/e;

    sget-object v2, Lg83/g;->E:[Lg83/e;

    if-eq v1, v2, :cond_7

    sget-object v2, Lg83/g;->z:[Lg83/e;

    if-ne v1, v2, :cond_0

    goto :goto_4

    :cond_0
    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    if-ne v6, p1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, -0x1

    :goto_2
    if-gez v5, :cond_3

    goto :goto_4

    :cond_3
    const/4 v6, 0x1

    if-ne v3, v6, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v3, -0x1

    new-array v2, v2, [Lg83/e;

    invoke-static {v1, v4, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v5, 0x1

    sub-int/2addr v3, v5

    sub-int/2addr v3, v6

    invoke-static {v1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_3
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_5

    goto :goto_0

    :cond_7
    :goto_4
    return-void
.end method

.method public final onComplete()V
    .locals 5

    iget-boolean v0, p0, Lg83/g;->y:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg83/g;->y:Z

    sget-object v1, Lb83/h;->w:Lb83/h;

    iget-object v2, p0, Lg83/g;->w:Lg83/f;

    iget-object v3, v2, Lg83/f;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v3, v2, Lg83/f;->y:I

    add-int/2addr v3, v0

    iput v3, v2, Lg83/f;->y:I

    iput-boolean v0, v2, Lg83/f;->x:Z

    sget-object v0, Lg83/g;->E:[Lg83/e;

    iget-object v3, p0, Lg83/g;->w:Lg83/f;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg83/e;

    :cond_1
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v2, v4}, Lg83/f;->a(Lg83/e;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lg83/g;->y:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg83/g;->y:Z

    new-instance v1, Lb83/f;

    invoke-direct {v1, p1}, Lb83/f;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lg83/g;->w:Lg83/f;

    iget-object v2, p1, Lg83/f;->w:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v2, p1, Lg83/f;->y:I

    add-int/2addr v2, v0

    iput v2, p1, Lg83/f;->y:I

    iput-boolean v0, p1, Lg83/f;->x:Z

    sget-object v0, Lg83/g;->E:[Lg83/e;

    iget-object v2, p0, Lg83/g;->w:Lg83/f;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg83/e;

    :cond_1
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {p1, v3}, Lg83/f;->a(Lg83/e;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lg83/g;->y:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg83/g;->w:Lg83/f;

    iget-object v1, v0, Lg83/f;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, v0, Lg83/f;->y:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Lg83/f;->y:I

    iget-object p1, p0, Lg83/g;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lg83/e;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v0, v3}, Lg83/f;->a(Lg83/e;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
