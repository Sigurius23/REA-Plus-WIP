.class public abstract enum Lgh3/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final w:Ljava/lang/Throwable;

.field public static final synthetic x:[Lgh3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lgh3/c;

    sput-object v0, Lgh3/c;->x:[Lgh3/c;

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Terminated"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    sput-object v0, Lgh3/c;->w:Ljava/lang/Throwable;

    return-void
.end method

.method public static a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z
    .locals 3

    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lgh3/c;->w:Ljava/lang/Throwable;

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez v0, :cond_1

    move-object v2, p1

    goto :goto_1

    :cond_1
    instance-of v1, v0, Lrx/exceptions/CompositeException;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    move-object v2, v0

    check-cast v2, Lrx/exceptions/CompositeException;

    iget-object v2, v2, Lrx/exceptions/CompositeException;->w:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lrx/exceptions/CompositeException;

    invoke-direct {v2, v1}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    new-instance v2, Lrx/exceptions/CompositeException;

    filled-new-array {v0, p1}, [Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v2, v1}, Lrx/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    invoke-virtual {p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_3

    goto :goto_0
.end method

.method public static b(Ljava/lang/Throwable;)Z
    .locals 1

    sget-object v0, Lgh3/c;->w:Ljava/lang/Throwable;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lgh3/c;->w:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgh3/c;
    .locals 1

    const-class v0, Lgh3/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    invoke-static {p0}, Lr;->t(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static values()[Lgh3/c;
    .locals 1

    sget-object v0, Lgh3/c;->x:[Lgh3/c;

    invoke-virtual {v0}, [Lgh3/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgh3/c;

    return-object v0
.end method
