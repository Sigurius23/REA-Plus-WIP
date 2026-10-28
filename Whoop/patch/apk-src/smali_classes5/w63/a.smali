.class public final Lw63/a;
.super Lio/seon/androidsdk/service/e1;
.source "SourceFile"


# static fields
.field public static final synthetic i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final k:Lio/ktor/utils/io/internal/e;

.field public static final l:Lio/ktor/utils/io/internal/e;

.field public static final m:Lw63/a;


# instance fields
.field public final h:Lx63/f;

.field private volatile synthetic nextRef:Ljava/lang/Object;

.field private volatile synthetic refCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/ktor/utils/io/internal/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/ktor/utils/io/internal/e;-><init>(I)V

    sput-object v0, Lw63/a;->k:Lio/ktor/utils/io/internal/e;

    new-instance v0, Lio/ktor/utils/io/internal/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/ktor/utils/io/internal/e;-><init>(I)V

    sput-object v0, Lw63/a;->l:Lio/ktor/utils/io/internal/e;

    new-instance v1, Lw63/a;

    sget-object v2, Lt63/b;->a:Ljava/nio/ByteBuffer;

    invoke-direct {v1, v2, v0}, Lw63/a;-><init>(Ljava/nio/ByteBuffer;Lx63/f;)V

    sput-object v1, Lw63/a;->m:Lw63/a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "nextRef"

    const-class v2, Lw63/a;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lw63/a;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "refCount"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lw63/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;Lx63/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/seon/androidsdk/service/e1;-><init>(Ljava/nio/ByteBuffer;)V

    iput-object p2, p0, Lw63/a;->h:Lx63/f;

    const/4 p1, 0x0

    iput-object p1, p0, Lw63/a;->nextRef:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lw63/a;->refCount:I

    return-void
.end method


# virtual methods
.method public final g()Lw63/a;
    .locals 2

    sget-object v0, Lw63/a;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw63/a;

    return-object v0
.end method

.method public final h()Lw63/a;
    .locals 1

    iget-object v0, p0, Lw63/a;->nextRef:Ljava/lang/Object;

    check-cast v0, Lw63/a;

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lw63/a;->refCount:I

    return v0
.end method

.method public final j(Lx63/f;)V
    .locals 3

    const-string v0, "pool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lw63/a;->refCount:I

    if-lez v0, :cond_3

    add-int/lit8 v1, v0, -0x1

    sget-object v2, Lw63/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez v1, :cond_2

    iget-object v0, p0, Lw63/a;->h:Lx63/f;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    invoke-interface {p1, p0}, Lx63/f;->a1(Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to release: it is already released."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/seon/androidsdk/service/e1;->e(I)V

    iget v0, p0, Lio/seon/androidsdk/service/e1;->f:I

    iget v1, p0, Lio/seon/androidsdk/service/e1;->d:I

    sub-int/2addr v0, v1

    iput v1, p0, Lio/seon/androidsdk/service/e1;->b:I

    iput v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    iput v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, Lw63/a;->nextRef:Ljava/lang/Object;

    return-void
.end method

.method public final l(Lw63/a;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lw63/a;->g()Lw63/a;

    return-void

    :cond_0
    :goto_0
    sget-object v0, Lw63/a;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This chunk has already a next chunk."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()V
    .locals 3

    :goto_0
    iget v0, p0, Lw63/a;->refCount:I

    if-ltz v0, :cond_2

    if-gtz v0, :cond_1

    const/4 v1, 0x1

    sget-object v2, Lw63/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This instance is already in use but somehow appeared in the pool."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This instance is already disposed and couldn\'t be borrowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
