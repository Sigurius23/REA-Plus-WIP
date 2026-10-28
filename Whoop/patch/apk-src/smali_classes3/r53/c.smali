.class public abstract Lr53/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public w:Ljava/nio/ByteBuffer;

.field public x:[Lr53/f;

.field public final y:Landroid/graphics/Rect;

.field public final z:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Landroid/graphics/Rect;[Lr53/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr53/c;->w:Ljava/nio/ByteBuffer;

    iput-object p3, p0, Lr53/c;->x:[Lr53/f;

    iput-object p2, p0, Lr53/c;->y:Landroid/graphics/Rect;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lr53/c;->z:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public abstract b(IIII)I
.end method

.method public final close()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lr53/c;->w:Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lr53/c;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lr53/f;

    iput-object v0, p0, Lr53/c;->x:[Lr53/f;

    return-void
.end method
