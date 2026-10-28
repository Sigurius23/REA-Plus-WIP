.class public abstract Lch3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lch3/b;

.field public static final b:Lch3/b;

.field public static final c:Lch3/v;

.field public static final d:Lch3/v;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lch3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch3/b;-><init>(I)V

    sput-object v0, Lch3/d;->a:Lch3/b;

    new-instance v0, Lch3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lch3/b;-><init>(I)V

    sput-object v0, Lch3/d;->b:Lch3/b;

    new-instance v0, Lch3/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch3/v;-><init>(I)V

    sput-object v0, Lch3/d;->c:Lch3/v;

    new-instance v0, Lch3/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lch3/v;-><init>(I)V

    sput-object v0, Lch3/d;->d:Lch3/v;

    return-void
.end method

.method public static a(Lxg3/h;Ljava/lang/Object;)Z
    .locals 4

    sget-object v0, Lch3/d;->a:Lch3/b;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, Lxg3/h;->onCompleted()V

    return v1

    :cond_0
    sget-object v0, Lch3/d;->b:Lch3/b;

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return v2

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Lch3/c;

    if-ne v0, v3, :cond_2

    check-cast p1, Lch3/c;

    iget-object p1, p1, Lch3/c;->w:Ljava/lang/Throwable;

    invoke-interface {p0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_2
    invoke-interface {p0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return v2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The lite notification can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/util/concurrent/atomic/AtomicLong;J)J
    .locals 6

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    add-long v2, v0, p1

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-gez v4, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lch3/d;->b:Lch3/b;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static d(Ljava/util/concurrent/atomic/AtomicLong;J)J
    .locals 6

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    return-wide v2

    :cond_1
    sub-long v2, v0, p1

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_2

    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide v2

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "More produced than requested: "

    invoke-static {v2, v3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
