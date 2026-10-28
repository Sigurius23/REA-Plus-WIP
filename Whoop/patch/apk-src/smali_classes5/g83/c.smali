.class public final Lg83/c;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# instance fields
.field public final w:Ll73/d;

.field public final x:Lg83/d;


# direct methods
.method public constructor <init>(Ll73/d;Lg83/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lg83/c;->w:Ll73/d;

    iput-object p2, p0, Lg83/c;->x:Lg83/d;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg83/c;->x:Lg83/d;

    invoke-virtual {v0, p0}, Lg83/d;->e(Lg83/c;)V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
