.class public final enum La83/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Leg3/b;


# static fields
.field public static final enum w:La83/c;

.field public static final synthetic x:[La83/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La83/c;

    const-string v1, "CANCELLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La83/c;->w:La83/c;

    filled-new-array {v0}, [La83/c;

    move-result-object v0

    sput-object v0, La83/c;->x:[La83/c;

    return-void
.end method

.method public static a(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leg3/b;

    sget-object v1, La83/c;->w:La83/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leg3/b;

    if-eq p0, v1, :cond_0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Leg3/b;->cancel()V

    :cond_0
    return-void
.end method

.method public static b(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n > 0 required but it was "

    invoke-static {p0, p1, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static c(Leg3/b;Leg3/b;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Leg3/b;->cancel()V

    new-instance p0, Lio/reactivex/exceptions/ProtocolViolationException;

    const-string p1, "Subscription already set!"

    invoke-direct {p0, p1}, Lio/reactivex/exceptions/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)La83/c;
    .locals 1

    const-class v0, La83/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La83/c;

    return-object p0
.end method

.method public static values()[La83/c;
    .locals 1

    sget-object v0, La83/c;->x:[La83/c;

    invoke-virtual {v0}, [La83/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La83/c;

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final request(J)V
    .locals 0

    return-void
.end method
