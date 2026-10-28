.class public final enum Lq73/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# static fields
.field public static final enum w:Lq73/c;

.field public static final synthetic x:[Lq73/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq73/c;

    const-string v1, "DISPOSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq73/c;->w:Lq73/c;

    filled-new-array {v0}, [Lq73/c;

    move-result-object v0

    sput-object v0, Lq73/c;->x:[Lq73/c;

    return-void
.end method

.method public static a(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln73/b;

    sget-object v1, Lq73/c;->w:Lq73/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln73/b;

    if-eq p0, v1, :cond_0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ln73/b;->dispose()V

    :cond_0
    return-void
.end method

.method public static b(Ljava/util/concurrent/atomic/AtomicReference;Ln73/b;)Z
    .locals 1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ln73/b;->dispose()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lq73/c;->w:Lq73/c;

    if-eq p0, p1, :cond_2

    new-instance p0, Lio/reactivex/exceptions/ProtocolViolationException;

    const-string p1, "Disposable already set!"

    invoke-direct {p0, p1}, Lio/reactivex/exceptions/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ln73/b;Ln73/b;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ln73/b;->dispose()V

    new-instance p0, Lio/reactivex/exceptions/ProtocolViolationException;

    const-string p1, "Disposable already set!"

    invoke-direct {p0, p1}, Lio/reactivex/exceptions/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lq73/c;
    .locals 1

    const-class v0, Lq73/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq73/c;

    return-object p0
.end method

.method public static values()[Lq73/c;
    .locals 1

    sget-object v0, Lq73/c;->x:[Lq73/c;

    invoke-virtual {v0}, [Lq73/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq73/c;

    return-object v0
.end method


# virtual methods
.method public final dispose()V
    .locals 0

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
