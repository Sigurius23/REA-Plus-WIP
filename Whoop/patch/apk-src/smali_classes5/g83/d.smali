.class public final Lg83/d;
.super Lg83/i;
.source "SourceFile"


# static fields
.field public static final y:[Lg83/c;

.field public static final z:[Lg83/c;


# instance fields
.field public final w:Ljava/util/concurrent/atomic/AtomicReference;

.field public x:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lg83/c;

    sput-object v1, Lg83/d;->y:[Lg83/c;

    new-array v0, v0, [Lg83/c;

    sput-object v0, Lg83/d;->z:[Lg83/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lg83/d;->z:[Lg83/c;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final b(Ln73/b;)V
    .locals 2

    iget-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lg83/d;->y:[Lg83/c;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ln73/b;->dispose()V

    :cond_0
    return-void
.end method

.method public final d(Ll73/d;)V
    .locals 6

    new-instance v0, Lg83/c;

    invoke-direct {v0, p1, p0}, Lg83/c;-><init>(Ll73/d;Lg83/d;)V

    invoke-interface {p1, v0}, Ll73/d;->b(Ln73/b;)V

    :goto_0
    iget-object v1, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lg83/c;

    sget-object v3, Lg83/d;->y:[Lg83/c;

    if-ne v2, v3, :cond_1

    iget-object v0, p0, Lg83/d;->x:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface {p1}, Ll73/d;->onComplete()V

    return-void

    :cond_1
    array-length v3, v2

    add-int/lit8 v4, v3, 0x1

    new-array v4, v4, [Lg83/c;

    const/4 v5, 0x0

    invoke-static {v2, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v4, v3

    :cond_2
    invoke-virtual {v1, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, Lg83/d;->e(Lg83/c;)V

    :cond_3
    return-void

    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_2

    goto :goto_0
.end method

.method public final e(Lg83/c;)V
    .locals 7

    :goto_0
    iget-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lg83/c;

    sget-object v2, Lg83/d;->y:[Lg83/c;

    if-eq v1, v2, :cond_7

    sget-object v2, Lg83/d;->z:[Lg83/c;

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

    new-array v2, v2, [Lg83/c;

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

    iget-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lg83/d;->y:[Lg83/c;

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg83/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v3, v3, Lg83/c;->w:Ll73/d;

    invoke-interface {v3}, Ll73/d;->onComplete()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lg83/d;->y:[Lg83/c;

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lg83/d;->x:Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg83/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v3, v3, Lg83/c;->w:Ll73/d;

    invoke-interface {v3, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 5

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg83/d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg83/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v3, Lg83/c;->w:Ll73/d;

    invoke-interface {v3, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
