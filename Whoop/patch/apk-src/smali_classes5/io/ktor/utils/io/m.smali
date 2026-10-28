.class public final Lio/ktor/utils/io/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/n;
.implements Lio/ktor/utils/io/q;
.implements Lio/ktor/utils/io/s;


# static fields
.field public static final synthetic j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _closed:Ljava/lang/Object;

.field private volatile synthetic _readOp:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;

.field volatile synthetic _writeOp:Ljava/lang/Object;

.field private volatile attachedJob:Lbc3/k1;

.field public final b:Z

.field public final c:Lx63/f;

.field public final d:I

.field public e:I

.field public f:I

.field public final g:Lio/ktor/utils/io/internal/b;

.field public final h:Lio/ktor/utils/io/internal/b;

.field public final i:Lio/ktor/utils/io/l;

.field private volatile joining:Lio/ktor/utils/io/internal/d;

.field private volatile totalBytesRead:J

.field private volatile totalBytesWritten:J

.field private volatile writeSuspensionSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, Lio/ktor/utils/io/m;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closed"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_readOp"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_writeOp"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/utils/io/internal/g;->d:Lio/ktor/utils/io/internal/e;

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v1, v0, v1}, Lio/ktor/utils/io/m;-><init>(ZLx63/f;I)V

    .line 3
    new-instance v0, Lio/ktor/utils/io/internal/j;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v2, "content.slice()"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1}, Lio/ktor/utils/io/internal/j;-><init>(Ljava/nio/ByteBuffer;I)V

    .line 4
    iget-object p1, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {p1}, Lio/ktor/utils/io/internal/o;->e()V

    .line 5
    iget-object p1, v0, Lio/ktor/utils/io/internal/j;->g:Lio/ktor/utils/io/internal/k;

    .line 6
    iput-object p1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    .line 7
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    .line 9
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    return-void
.end method

.method public constructor <init>(ZLx63/f;I)V
    .locals 1

    const-string v0, "pool"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-boolean p1, p0, Lio/ktor/utils/io/m;->b:Z

    .line 12
    iput-object p2, p0, Lio/ktor/utils/io/m;->c:Lx63/f;

    .line 13
    iput p3, p0, Lio/ktor/utils/io/m;->d:I

    .line 14
    sget-object p1, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    iput-object p1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    .line 16
    iput-object p1, p0, Lio/ktor/utils/io/m;->_readOp:Ljava/lang/Object;

    .line 17
    iput-object p1, p0, Lio/ktor/utils/io/m;->_writeOp:Ljava/lang/Object;

    .line 18
    sget-object p1, Lw63/a;->m:Lw63/a;

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iget-object p1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/internal/m;

    .line 21
    iget-object p1, p1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    .line 22
    new-instance p1, Lio/ktor/utils/io/internal/b;

    invoke-direct {p1}, Lio/ktor/utils/io/internal/b;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/m;->g:Lio/ktor/utils/io/internal/b;

    .line 23
    new-instance p1, Lio/ktor/utils/io/internal/b;

    invoke-direct {p1}, Lio/ktor/utils/io/internal/b;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/m;->h:Lio/ktor/utils/io/internal/b;

    .line 24
    new-instance p1, Lio/ktor/utils/io/l;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/ktor/utils/io/l;-><init>(Lio/ktor/utils/io/m;I)V

    iput-object p1, p0, Lio/ktor/utils/io/m;->i:Lio/ktor/utils/io/l;

    return-void
.end method

.method public static J(Lio/ktor/utils/io/m;ILc0/h;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lio/ktor/utils/io/g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/ktor/utils/io/g;

    iget v1, v0, Lio/ktor/utils/io/g;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/g;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/g;

    invoke-direct {v0, p0, p3}, Lio/ktor/utils/io/g;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/g;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/g;->F:I

    const-string v3, "Min("

    const-string v4, "min should be positive"

    const/16 v5, 0xff8

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget p0, v0, Lio/ktor/utils/io/g;->y:I

    iget-object p1, v0, Lio/ktor/utils/io/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object p2, v0, Lio/ktor/utils/io/g;->w:Lio/ktor/utils/io/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p1

    move p1, p0

    move-object p0, p2

    move-object p2, v11

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-lez p1, :cond_15

    if-gt p1, v5, :cond_14

    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "block"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p1, :cond_13

    if-gt p1, v5, :cond_12

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->F()Ljava/nio/ByteBuffer;

    move-result-object p3

    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/internal/m;

    iget-object v2, v2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    :try_start_0
    iget-object v7, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/internal/c;

    if-nez v7, :cond_f

    :cond_4
    iget v7, v2, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    const/4 v8, 0x0

    if-ge v7, p1, :cond_5

    move v7, v8

    goto :goto_2

    :cond_5
    sget-object v9, Lio/ktor/utils/io/internal/o;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v9, v2, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_4

    :goto_2
    if-gtz v7, :cond_6

    move p3, v8

    goto :goto_4

    :cond_6
    iget v8, p0, Lio/ktor/utils/io/m;->f:I

    invoke-virtual {p0, p3, v8, v7}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    invoke-virtual {p3}, Ljava/nio/Buffer;->position()I

    move-result v8

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v9

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v10

    if-ne v9, v10, :cond_e

    invoke-virtual {p3}, Ljava/nio/Buffer;->position()I

    move-result v9

    sub-int v8, v9, v8

    if-ltz v8, :cond_d

    if-ltz v8, :cond_c

    invoke-virtual {p0, p3, v2, v8}, Lio/ktor/utils/io/m;->g(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V

    if-ge v8, v7, :cond_7

    sub-int/2addr v7, v8

    invoke-virtual {v2, v7}, Lio/ktor/utils/io/internal/o;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_7
    :goto_3
    move p3, v6

    :goto_4
    invoke-virtual {v2}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result v2

    if-nez v2, :cond_8

    iget-boolean v2, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz v2, :cond_9

    :cond_8
    invoke-virtual {p0, v6}, Lio/ktor/utils/io/m;->k(I)V

    :cond_9
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    if-nez p3, :cond_a

    const/4 v8, -0x1

    :cond_a
    if-ltz v8, :cond_b

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_b
    iput-object p0, v0, Lio/ktor/utils/io/g;->w:Lio/ktor/utils/io/m;

    iput-object p2, v0, Lio/ktor/utils/io/g;->x:Lkotlin/jvm/functions/Function1;

    iput p1, v0, Lio/ktor/utils/io/g;->y:I

    iput v6, v0, Lio/ktor/utils/io/g;->F:I

    invoke-virtual {p0, p1, p2, v0}, Lio/ktor/utils/io/m;->e(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_c
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_d
    const-string p1, "Position has been moved backward: pushback is not supported"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e
    const-string p1, "Buffer limit modified"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_f
    invoke-virtual {v7}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    invoke-virtual {v2}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result p2

    if-nez p2, :cond_10

    iget-boolean p2, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz p2, :cond_11

    :cond_10
    invoke-virtual {p0, v6}, Lio/ktor/utils/io/m;->k(I)V

    :cond_11
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    throw p1

    :cond_12
    const-string p0, ") shouldn\'t be greater than 4088"

    invoke-static {p1, v3, p0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    const-string p0, ") should\'nt be greater than (4088)"

    invoke-static {p1, v3, p0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(Lio/ktor/utils/io/m;)Lio/ktor/utils/io/internal/c;
    .locals 0

    iget-object p0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast p0, Lio/ktor/utils/io/internal/c;

    return-object p0
.end method

.method public static final synthetic b(Lio/ktor/utils/io/m;)I
    .locals 0

    iget p0, p0, Lio/ktor/utils/io/m;->writeSuspensionSize:I

    return p0
.end method

.method public static final synthetic c(Lio/ktor/utils/io/m;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/ktor/utils/io/m;->attachedJob:Lbc3/k1;

    return-void
.end method

.method public static q(Lio/ktor/utils/io/m;Lw63/a;)I
    .locals 10

    iget v0, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget v1, p1, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->E()Ljava/nio/ByteBuffer;

    move-result-object v3

    if-nez v3, :cond_1

    :goto_0
    move v3, v1

    move v6, v3

    goto :goto_4

    :cond_1
    iget-object v4, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/internal/m;

    iget-object v4, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    :try_start_0
    iget v5, v4, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    goto :goto_0

    :cond_2
    :try_start_1
    iget v5, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget v6, p1, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v5, v6

    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_3
    iget v7, v4, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-nez v8, :cond_4

    move v6, v1

    goto :goto_1

    :cond_4
    sub-int v8, v7, v8

    sget-object v9, Lio/ktor/utils/io/internal/o;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v9, v4, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_1
    if-gtz v6, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    if-ge v5, v7, :cond_6

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_2
    invoke-static {p1, v3}, Lv63/b;->n(Lio/seon/androidsdk/service/e1;Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, v3, v4, v6}, Lio/ktor/utils/io/m;->f(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x1

    :goto_3
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    :goto_4
    add-int/2addr v2, v6

    sub-int/2addr v0, v6

    if-eqz v3, :cond_7

    iget v3, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget v4, p1, Lio/seon/androidsdk/service/e1;->c:I

    if-le v3, v4, :cond_7

    iget-object v3, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/internal/m;

    iget-object v3, v3, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v3, v3, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-gtz v3, :cond_0

    :cond_7
    return v2

    :goto_5
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    throw p1
.end method


# virtual methods
.method public final A()V
    .locals 7

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lio/ktor/utils/io/internal/m;

    move-object v4, v1

    check-cast v4, Lio/ktor/utils/io/internal/i;

    if-eqz v4, :cond_0

    iget-object v1, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->f()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    move-object v1, v0

    :cond_0
    invoke-virtual {v3}, Lio/ktor/utils/io/internal/m;->e()Lio/ktor/utils/io/internal/m;

    move-result-object v4

    instance-of v5, v4, Lio/ktor/utils/io/internal/i;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v5, Lio/ktor/utils/io/internal/m;

    if-ne v5, v3, :cond_1

    iget-object v3, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v3}, Lio/ktor/utils/io/internal/o;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v1, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    :cond_1
    sget-object v3, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v3, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v0, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-ne v4, v0, :cond_4

    check-cast v1, Lio/ktor/utils/io/internal/i;

    if-eqz v1, :cond_3

    iget-object v0, v1, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    :cond_3
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    return-void

    :cond_4
    instance-of v1, v4, Lio/ktor/utils/io/internal/i;

    if-eqz v1, :cond_7

    iget-object v1, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v2, v1, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    iget v1, v1, Lio/ktor/utils/io/internal/o;->a:I

    if-ne v2, v1, :cond_7

    iget-object v1, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->g()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_5
    invoke-virtual {v1, p0, v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/o;->f()V

    check-cast v4, Lio/ktor/utils/io/internal/i;

    iget-object v0, v4, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    return-void

    :cond_6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v4, :cond_5

    nop

    :cond_7
    return-void

    :cond_8
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v2, :cond_2

    goto/16 :goto_0
.end method

.method public final B()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lio/ktor/utils/io/internal/m;

    invoke-virtual {v2}, Lio/ktor/utils/io/internal/m;->f()Lio/ktor/utils/io/internal/m;

    move-result-object v2

    instance-of v3, v2, Lio/ktor/utils/io/internal/i;

    if-eqz v3, :cond_0

    iget-object v3, v2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v4, v3, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    iget v3, v3, Lio/ktor/utils/io/internal/o;->a:I

    if-ne v4, v3, :cond_0

    sget-object v0, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    :cond_0
    sget-object v3, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_1
    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v1, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-ne v2, v1, :cond_2

    check-cast v0, Lio/ktor/utils/io/internal/i;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v1, :cond_1

    goto :goto_0
.end method

.method public final C()V
    .locals 3

    sget-object v0, Lio/ktor/utils/io/m;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/d;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/internal/c;

    if-eqz v2, :cond_0

    iget-object v1, v2, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final D()V
    .locals 4

    :goto_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_writeOp:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/c;

    sget-object v2, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v2, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v1, :cond_2

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    goto :goto_1

    :cond_3
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_1

    goto :goto_0
.end method

.method public final E()Ljava/nio/ByteBuffer;
    .locals 5

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/ktor/utils/io/internal/m;

    sget-object v2, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    sget-object v2, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v2, :cond_3

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v0}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v4

    :cond_3
    iget-object v2, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/internal/c;

    if-eqz v2, :cond_5

    iget-object v2, v2, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v2}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v4

    :cond_5
    :goto_1
    iget-object v2, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v2, v2, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-nez v2, :cond_7

    :cond_6
    :goto_2
    return-object v4

    :cond_7
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/m;->c()Lio/ktor/utils/io/internal/m;

    move-result-object v1

    sget-object v2, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_8
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v0, :cond_8

    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/m;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, Lio/ktor/utils/io/m;->e:I

    iget-object v1, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v1, v1, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    invoke-virtual {p0, v0, v2, v1}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    return-object v0
.end method

.method public final F()Ljava/nio/ByteBuffer;
    .locals 7

    iget-object v0, p0, Lio/ktor/utils/io/m;->_writeOp:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    if-nez v0, :cond_b

    const/4 v1, 0x0

    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lio/ktor/utils/io/internal/m;

    iget-object v4, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/internal/c;

    if-eqz v4, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    sget-object v4, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-ne v3, v4, :cond_3

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/ktor/utils/io/m;->c:Lx63/f;

    invoke-interface {v0}, Lx63/f;->t0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/internal/j;

    iget-object v4, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v4}, Lio/ktor/utils/io/internal/o;->f()V

    :cond_2
    iget-object v4, v0, Lio/ktor/utils/io/internal/j;->g:Lio/ktor/utils/io/internal/k;

    :goto_1
    move-object v5, v4

    move-object v4, v0

    goto :goto_2

    :cond_3
    sget-object v4, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-ne v3, v4, :cond_5

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    :cond_4
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v1

    :cond_5
    invoke-virtual {v3}, Lio/ktor/utils/io/internal/m;->d()Lio/ktor/utils/io/internal/m;

    move-result-object v4

    goto :goto_1

    :goto_2
    sget-object v6, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v6, p0, v2, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-nez v0, :cond_9

    invoke-virtual {v5}, Lio/ktor/utils/io/internal/m;->b()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v4, :cond_8

    if-eqz v3, :cond_7

    sget-object v1, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-eq v3, v1, :cond_8

    invoke-virtual {p0, v4}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    goto :goto_3

    :cond_7
    const-string v0, "old"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_3
    iget v1, p0, Lio/ktor/utils/io/m;->f:I

    iget-object v2, v5, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v2, v2, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    invoke-virtual {p0, v0, v1, v2}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    return-object v0

    :cond_9
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v2, :cond_6

    move-object v0, v4

    goto/16 :goto_0

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Write operation is already in progress: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final G(ILq83/d;)V
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-ge v0, p1, :cond_b

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-interface {p2, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-void

    :cond_1
    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/o;->c()Z

    move-result v0

    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/m;

    iget-object v1, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v1, v1, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, p1, :cond_2

    move p1, v3

    goto :goto_1

    :cond_2
    move p1, v2

    :goto_1
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    move v2, v3

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-void

    :cond_4
    :goto_2
    iget-object v0, p0, Lio/ktor/utils/io/m;->_readOp:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    if-nez v0, :cond_a

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-ge v0, p1, :cond_0

    sget-object v0, Lio/ktor/utils/io/m;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_5
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-nez v0, :cond_6

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-ge v0, p1, :cond_6

    goto :goto_3

    :cond_6
    sget-object v2, Lio/ktor/utils/io/m;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_7
    invoke-virtual {v2, p0, p2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_7

    goto :goto_3

    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation is already in progress"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :goto_3
    sget-object p1, Lr83/a;->w:Lr83/a;

    return-void
.end method

.method public final H()V
    .locals 7

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lio/ktor/utils/io/internal/m;

    iget-object v4, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/internal/c;

    if-eqz v1, :cond_2

    if-eqz v4, :cond_0

    iget-object v5, v4, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_0
    move-object v5, v0

    :goto_1
    if-nez v5, :cond_1

    iget-object v1, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->f()V

    :cond_1
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    move-object v1, v0

    :cond_2
    sget-object v5, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-ne v3, v5, :cond_3

    goto :goto_3

    :cond_3
    sget-object v6, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-ne v3, v6, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_a

    instance-of v1, v3, Lio/ktor/utils/io/internal/i;

    if-eqz v1, :cond_a

    iget-object v1, v3, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->g()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v4, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-eqz v1, :cond_a

    :cond_5
    iget-object v1, v4, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-eqz v1, :cond_6

    iget-object v1, v3, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lio/ktor/utils/io/internal/o;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v6, 0x0

    invoke-virtual {v4, v1, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    :cond_6
    check-cast v3, Lio/ktor/utils/io/internal/i;

    iget-object v1, v3, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    :goto_2
    sget-object v3, Lio/ktor/utils/io/m;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_7
    invoke-virtual {v3, p0, v2, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    if-eqz v1, :cond_8

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    sget-object v2, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-ne v0, v2, :cond_8

    invoke-virtual {p0, v1}, Lio/ktor/utils/io/m;->z(Lio/ktor/utils/io/internal/j;)V

    :cond_8
    :goto_3
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->C()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    return-void

    :cond_9
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v2, :cond_7

    goto :goto_0

    :cond_a
    return-void
.end method

.method public final I(Ls83/c;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object p1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/internal/c;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    iput v1, p0, Lio/ktor/utils/io/m;->writeSuspensionSize:I

    iget-object v1, p0, Lio/ktor/utils/io/m;->attachedJob:Lbc3/k1;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/ktor/utils/io/m;->i:Lio/ktor/utils/io/l;

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :cond_2
    iget-object v1, p0, Lio/ktor/utils/io/m;->h:Lio/ktor/utils/io/internal/b;

    iget-object v2, p0, Lio/ktor/utils/io/m;->i:Lio/ktor/utils/io/l;

    invoke-virtual {v2, v1}, Lio/ktor/utils/io/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/ktor/utils/io/internal/b;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_3

    return-object p1

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final K([BII)I
    .locals 6

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->F()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/m;

    iget-object v1, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/internal/c;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    :goto_0
    sub-int v4, p3, v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v1, v4}, Lio/ktor/utils/io/internal/o;->h(I)I

    move-result v4

    if-eqz v4, :cond_1

    if-lez v4, :cond_0

    add-int v5, p2, v3

    invoke-virtual {v0, p1, v5, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    add-int/2addr v3, v4

    iget v4, p0, Lio/ktor/utils/io/m;->f:I

    add-int/2addr v4, v3

    invoke-virtual {p0, v4, v0}, Lio/ktor/utils/io/m;->h(ILjava/nio/ByteBuffer;)I

    move-result v4

    iget v5, v1, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    invoke-virtual {p0, v0, v4, v5}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-virtual {p0, v0, v1, v3}, Lio/ktor/utils/io/m;->g(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0, v2}, Lio/ktor/utils/io/m;->k(I)V

    :cond_3
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    return v3

    :cond_4
    :try_start_1
    invoke-virtual {v3}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result p2

    if-nez p2, :cond_5

    iget-boolean p2, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz p2, :cond_6

    :cond_5
    invoke-virtual {p0, v2}, Lio/ktor/utils/io/m;->k(I)V

    :cond_6
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    throw p1
.end method

.method public final L(Lio/seon/androidsdk/service/e1;)V
    .locals 6

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->F()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/m;

    iget-object v1, v1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/internal/c;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    :goto_0
    iget v4, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v5, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v4, v5

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v1, v4}, Lio/ktor/utils/io/internal/o;->h(I)I

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v0, v4}, Ls30/e;->o(Lio/seon/androidsdk/service/e1;Ljava/nio/ByteBuffer;I)V

    add-int/2addr v3, v4

    iget v4, p0, Lio/ktor/utils/io/m;->f:I

    add-int/2addr v4, v3

    invoke-virtual {p0, v4, v0}, Lio/ktor/utils/io/m;->h(ILjava/nio/ByteBuffer;)I

    move-result v4

    iget v5, v1, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    invoke-virtual {p0, v0, v4, v5}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0, v1, v3}, Lio/ktor/utils/io/m;->g(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz p1, :cond_2

    :cond_1
    invoke-virtual {p0, v2}, Lio/ktor/utils/io/m;->k(I)V

    :cond_2
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    return-void

    :cond_3
    :try_start_1
    invoke-virtual {v3}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lio/ktor/utils/io/m;->b:Z

    if-eqz v0, :cond_5

    :cond_4
    invoke-virtual {p0, v2}, Lio/ktor/utils/io/m;->k(I)V

    :cond_5
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    throw p1
.end method

.method public final M([BILs83/i;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-lez p2, :cond_0

    invoke-virtual {p0, p1, v0, p2}, Lio/ktor/utils/io/m;->K([BII)I

    move-result v1

    if-eqz v1, :cond_0

    add-int/2addr v0, v1

    sub-int/2addr p2, v1

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v0, p2, p3}, Lio/ktor/utils/io/m;->O([BIILs83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final N(Lio/seon/androidsdk/service/e1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lio/ktor/utils/io/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/ktor/utils/io/h;

    iget v1, v0, Lio/ktor/utils/io/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/h;

    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/h;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/h;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    const/4 p1, 0x2

    if-ne v2, p1, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/ktor/utils/io/h;->x:Lio/seon/androidsdk/service/e1;

    iget-object v2, v0, Lio/ktor/utils/io/h;->w:Lio/ktor/utils/io/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p0

    :goto_1
    iget p2, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v5, p1, Lio/seon/androidsdk/service/e1;->b:I

    if-le p2, v5, :cond_5

    iput-object v2, v0, Lio/ktor/utils/io/h;->w:Lio/ktor/utils/io/m;

    iput-object p1, v0, Lio/ktor/utils/io/h;->x:Lio/seon/androidsdk/service/e1;

    iput v4, v0, Lio/ktor/utils/io/h;->E:I

    invoke-virtual {v2, v0}, Lio/ktor/utils/io/m;->I(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1}, Lio/ktor/utils/io/m;->L(Lio/seon/androidsdk/service/e1;)V

    goto :goto_1

    :cond_5
    return-object v3
.end method

.method public final O([BIILs83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lio/ktor/utils/io/i;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/ktor/utils/io/i;

    iget v1, v0, Lio/ktor/utils/io/i;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/i;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/i;

    invoke-direct {v0, p0, p4}, Lio/ktor/utils/io/i;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/i;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/i;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/ktor/utils/io/i;->z:I

    iget p2, v0, Lio/ktor/utils/io/i;->y:I

    iget-object p3, v0, Lio/ktor/utils/io/i;->x:[B

    iget-object v2, v0, Lio/ktor/utils/io/i;->w:Lio/ktor/utils/io/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p0

    :goto_1
    if-lez p3, :cond_5

    iput-object v2, v0, Lio/ktor/utils/io/i;->w:Lio/ktor/utils/io/m;

    iput-object p1, v0, Lio/ktor/utils/io/i;->x:[B

    iput p2, v0, Lio/ktor/utils/io/i;->y:I

    iput p3, v0, Lio/ktor/utils/io/i;->z:I

    iput v3, v0, Lio/ktor/utils/io/i;->G:I

    invoke-virtual {v2, p1, p2, p3}, Lio/ktor/utils/io/m;->K([BII)I

    move-result p4

    if-lez p4, :cond_3

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p4}, Ljava/lang/Integer;-><init>(I)V

    move-object p4, v4

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1, p2, p3, v0}, Lio/ktor/utils/io/m;->Q([BIILs83/c;)Ljava/lang/Object;

    move-result-object p4

    :goto_2
    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    move v5, p3

    move-object p3, p1

    move p1, v5

    :goto_3
    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    add-int/2addr p2, p4

    sub-int/2addr p1, p4

    move-object v5, p3

    move p3, p1

    move-object p1, v5

    goto :goto_1

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final P(ILs83/c;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    instance-of v1, p2, Lio/ktor/utils/io/k;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lio/ktor/utils/io/k;

    iget v2, v1, Lio/ktor/utils/io/k;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/ktor/utils/io/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/ktor/utils/io/k;

    invoke-direct {v1, p0, p2}, Lio/ktor/utils/io/k;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lio/ktor/utils/io/k;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/ktor/utils/io/k;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget p1, v1, Lio/ktor/utils/io/k;->x:I

    iget-object v3, v1, Lio/ktor/utils/io/k;->w:Lio/ktor/utils/io/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, p0

    :cond_3
    :goto_1
    invoke-virtual {v3, p1}, Lio/ktor/utils/io/m;->R(I)Z

    move-result p2

    const/4 v5, 0x0

    if-eqz p2, :cond_d

    iput-object v3, v1, Lio/ktor/utils/io/k;->w:Lio/ktor/utils/io/m;

    iput p1, v1, Lio/ktor/utils/io/k;->x:I

    iput v4, v1, Lio/ktor/utils/io/k;->E:I

    new-instance p2, Lbc3/m;

    invoke-static {v1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v6

    invoke-direct {p2, v4, v6}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    :goto_2
    iget-object v6, v3, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/internal/c;

    if-nez v6, :cond_c

    invoke-virtual {v3, p1}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {p2, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v6, v3, Lio/ktor/utils/io/m;->_writeOp:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    if-nez v6, :cond_b

    invoke-virtual {v3, p1}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    sget-object v6, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v6, v3, v5, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v3, p1}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v6

    if-nez v6, :cond_9

    sget-object v6, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_7
    invoke-virtual {v6, v3, p2, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, p2, :cond_7

    :cond_9
    :goto_4
    invoke-virtual {v3, p1}, Lio/ktor/utils/io/m;->k(I)V

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p2

    sget-object v5, Lr83/a;->w:Lr83/a;

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_a
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_6

    goto :goto_3

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation is already in progress"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-virtual {v6}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v5

    :cond_d
    iget-object p1, v3, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/internal/c;

    if-nez p1, :cond_e

    return-object v0

    :cond_e
    invoke-virtual {p1}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v5
.end method

.method public final Q([BIILs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lio/ktor/utils/io/j;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/ktor/utils/io/j;

    iget v1, v0, Lio/ktor/utils/io/j;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/j;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/j;

    invoke-direct {v0, p0, p4}, Lio/ktor/utils/io/j;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/j;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/j;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    const/4 p1, 0x2

    if-ne v2, p1, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/ktor/utils/io/j;->z:I

    iget p2, v0, Lio/ktor/utils/io/j;->y:I

    iget-object p3, v0, Lio/ktor/utils/io/j;->x:[B

    iget-object v2, v0, Lio/ktor/utils/io/j;->w:Lio/ktor/utils/io/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, p3

    move p3, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p0

    :cond_4
    iput-object v2, v0, Lio/ktor/utils/io/j;->w:Lio/ktor/utils/io/m;

    iput-object p1, v0, Lio/ktor/utils/io/j;->x:[B

    iput p2, v0, Lio/ktor/utils/io/j;->y:I

    iput p3, v0, Lio/ktor/utils/io/j;->z:I

    iput v3, v0, Lio/ktor/utils/io/j;->G:I

    invoke-virtual {v2, v0}, Lio/ktor/utils/io/m;->I(Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1, p2, p3}, Lio/ktor/utils/io/m;->K([BII)I

    move-result p4

    if-lez p4, :cond_4

    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, p4}, Ljava/lang/Integer;-><init>(I)V

    return-object p1
.end method

.method public final R(I)Z
    .locals 3

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v1, v1, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    if-ge v1, p1, :cond_1

    sget-object p1, Lio/ktor/utils/io/internal/h;->c:Lio/ktor/utils/io/internal/h;

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public final d(Lbc3/k1;)V
    .locals 2

    iget-object v0, p0, Lio/ktor/utils/io/m;->attachedJob:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object p1, p0, Lio/ktor/utils/io/m;->attachedJob:Lbc3/k1;

    new-instance v0, Lio/ktor/utils/io/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/ktor/utils/io/l;-><init>(Lio/ktor/utils/io/m;I)V

    invoke-interface {p1, v1, v1, v0}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-void
.end method

.method public final e(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lio/ktor/utils/io/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/ktor/utils/io/a;

    iget v1, v0, Lio/ktor/utils/io/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/a;

    invoke-direct {v0, p0, p3}, Lio/ktor/utils/io/a;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/a;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    const/4 p1, 0x2

    if-ne v2, p1, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/ktor/utils/io/a;->w:Lio/ktor/utils/io/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lio/ktor/utils/io/a;->w:Lio/ktor/utils/io/m;

    iput-object p2, v0, Lio/ktor/utils/io/a;->x:Lkotlin/jvm/functions/Function1;

    iput v4, v0, Lio/ktor/utils/io/a;->E:I

    invoke-virtual {p0, p1, v0}, Lio/ktor/utils/io/m;->P(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v3
.end method

.method public final f(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    .locals 2

    if-ltz p3, :cond_0

    iget v0, p0, Lio/ktor/utils/io/m;->e:I

    add-int/2addr v0, p3

    invoke-virtual {p0, v0, p1}, Lio/ktor/utils/io/m;->h(ILjava/nio/ByteBuffer;)I

    move-result p1

    iput p1, p0, Lio/ktor/utils/io/m;->e:I

    invoke-virtual {p2, p3}, Lio/ktor/utils/io/internal/o;->a(I)V

    iget-wide p1, p0, Lio/ktor/utils/io/m;->totalBytesRead:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lio/ktor/utils/io/m;->totalBytesRead:J

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    .locals 2

    if-ltz p3, :cond_0

    iget v0, p0, Lio/ktor/utils/io/m;->f:I

    add-int/2addr v0, p3

    invoke-virtual {p0, v0, p1}, Lio/ktor/utils/io/m;->h(ILjava/nio/ByteBuffer;)I

    move-result p1

    iput p1, p0, Lio/ktor/utils/io/m;->f:I

    invoke-virtual {p2, p3}, Lio/ktor/utils/io/internal/o;->b(I)V

    iget-wide p1, p0, Lio/ktor/utils/io/m;->totalBytesWritten:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lio/ktor/utils/io/m;->totalBytesWritten:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(ILjava/nio/ByteBuffer;)I
    .locals 2

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, Lio/ktor/utils/io/m;->d:I

    sub-int/2addr v0, v1

    if-lt p1, v0, :cond_0

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    sub-int/2addr p2, v1

    sub-int/2addr p1, p2

    :cond_0
    return p1
.end method

.method public final i(Ljava/lang/Throwable;)Z
    .locals 5

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    if-nez p1, :cond_1

    sget-object v0, Lio/ktor/utils/io/internal/c;->b:Lio/ktor/utils/io/internal/c;

    goto :goto_0

    :cond_1
    new-instance v0, Lio/ktor/utils/io/internal/c;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/internal/c;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/internal/m;

    iget-object v2, v2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v2}, Lio/ktor/utils/io/internal/o;->c()Z

    sget-object v2, Lio/ktor/utils/io/m;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/o;->c()Z

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v2, v0, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    iget v0, v0, Lio/ktor/utils/io/internal/o;->a:I

    if-ne v2, v0, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    :goto_1
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    :cond_4
    sget-object v0, Lio/ktor/utils/io/m;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/d;

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    if-eqz p1, :cond_5

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object v4, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/internal/m;

    iget-object v4, v4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v4, v4, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-lez v4, :cond_6

    move v1, v2

    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_7
    :goto_2
    sget-object v0, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/d;

    const-string v1, "Byte channel was closed"

    if-eqz v0, :cond_9

    if-nez p1, :cond_8

    new-instance v4, Lio/ktor/utils/io/ClosedWriteChannelException;

    invoke-direct {v4, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v4, p1

    :goto_3
    invoke-static {v4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v4

    invoke-interface {v0, v4}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_9
    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    sget-object v0, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-eqz p1, :cond_b

    iget-object v0, p0, Lio/ktor/utils/io/m;->attachedJob:Lbc3/k1;

    if-eqz v0, :cond_a

    invoke-interface {v0, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_a
    iget-object v0, p0, Lio/ktor/utils/io/m;->g:Lio/ktor/utils/io/internal/b;

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/internal/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/ktor/utils/io/m;->h:Lio/ktor/utils/io/internal/b;

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/internal/b;->b(Ljava/lang/Throwable;)V

    return v2

    :cond_b
    iget-object p1, p0, Lio/ktor/utils/io/m;->h:Lio/ktor/utils/io/internal/b;

    new-instance v0, Lio/ktor/utils/io/ClosedWriteChannelException;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lio/ktor/utils/io/internal/b;->b(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lio/ktor/utils/io/m;->g:Lio/ktor/utils/io/internal/b;

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/o;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lio/ktor/utils/io/internal/b;->resumeWith(Ljava/lang/Object;)V

    sget-object v0, Lio/ktor/utils/io/internal/b;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/ktor/utils/io/internal/a;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lio/ktor/utils/io/internal/a;->a()V

    :cond_c
    return v2

    :cond_d
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    :goto_4
    return v1
.end method

.method public final j(Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    instance-of v2, v0, Lio/ktor/utils/io/b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lio/ktor/utils/io/b;

    iget v3, v2, Lio/ktor/utils/io/b;->O:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/ktor/utils/io/b;->O:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/ktor/utils/io/b;

    invoke-direct {v2, v1, v0}, Lio/ktor/utils/io/b;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lio/ktor/utils/io/b;->M:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/ktor/utils/io/b;->O:I

    const/4 v5, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v5, :cond_2

    const/4 v8, 0x3

    if-ne v4, v8, :cond_1

    iget-boolean v4, v2, Lio/ktor/utils/io/b;->L:Z

    iget-wide v8, v2, Lio/ktor/utils/io/b;->J:J

    iget-object v10, v2, Lio/ktor/utils/io/b;->y:Lkotlin/jvm/internal/f0;

    iget-object v11, v2, Lio/ktor/utils/io/b;->x:Lio/ktor/utils/io/m;

    iget-object v12, v2, Lio/ktor/utils/io/b;->w:Lio/ktor/utils/io/m;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_19

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v4, v2, Lio/ktor/utils/io/b;->L:Z

    iget-wide v8, v2, Lio/ktor/utils/io/b;->J:J

    iget-object v10, v2, Lio/ktor/utils/io/b;->y:Lkotlin/jvm/internal/f0;

    iget-object v11, v2, Lio/ktor/utils/io/b;->x:Lio/ktor/utils/io/m;

    iget-object v12, v2, Lio/ktor/utils/io/b;->w:Lio/ktor/utils/io/m;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v1, v5

    move-object v5, v3

    goto/16 :goto_14

    :cond_3
    iget-wide v8, v2, Lio/ktor/utils/io/b;->K:J

    iget-boolean v4, v2, Lio/ktor/utils/io/b;->L:Z

    iget-wide v10, v2, Lio/ktor/utils/io/b;->J:J

    iget-object v12, v2, Lio/ktor/utils/io/b;->I:Lio/ktor/utils/io/m;

    iget-object v13, v2, Lio/ktor/utils/io/b;->H:Ljava/nio/ByteBuffer;

    iget-object v14, v2, Lio/ktor/utils/io/b;->G:Lio/ktor/utils/io/internal/o;

    iget-object v15, v2, Lio/ktor/utils/io/b;->F:Lio/ktor/utils/io/internal/o;

    iget-object v5, v2, Lio/ktor/utils/io/b;->E:Lio/ktor/utils/io/m;

    iget-object v6, v2, Lio/ktor/utils/io/b;->z:Lio/ktor/utils/io/m;

    iget-object v7, v2, Lio/ktor/utils/io/b;->y:Lkotlin/jvm/internal/f0;

    move-object/from16 v17, v0

    iget-object v0, v2, Lio/ktor/utils/io/b;->x:Lio/ktor/utils/io/m;

    move/from16 p1, v4

    iget-object v4, v2, Lio/ktor/utils/io/b;->w:Lio/ktor/utils/io/m;

    :try_start_2
    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v17, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v5

    move/from16 v5, p1

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    :goto_1
    move-object v12, v4

    goto/16 :goto_17

    :cond_4
    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lio/ktor/utils/io/m;->m()Ljava/lang/Throwable;

    move-result-object v0

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lio/ktor/utils/io/m;->m()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    return-object v0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lio/ktor/utils/io/m;->n()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    return-object v0

    :cond_6
    iget-boolean v4, v1, Lio/ktor/utils/io/m;->b:Z

    :try_start_3
    new-instance v10, Lkotlin/jvm/internal/f0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_d

    move-object/from16 v11, p1

    move-wide/from16 v8, p2

    move-object v12, v1

    :goto_2
    :try_start_4
    iget-wide v5, v10, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v0, v5, v8

    if-gez v0, :cond_1c

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Lio/ktor/utils/io/m;->F()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v5, v12, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v5, Lio/ktor/utils/io/internal/m;

    iget-object v15, v5, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget-wide v5, v12, Lio/ktor/utils/io/m;->totalBytesWritten:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v7, v12, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/internal/c;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_c

    if-nez v7, :cond_18

    move-object v14, v0

    move-wide/from16 p1, v5

    move-object v7, v10

    move-object v0, v11

    move-object v6, v12

    move-object v13, v6

    move-object v1, v15

    move v5, v4

    move-wide v10, v8

    move-object v4, v13

    :goto_3
    :try_start_6
    iget-wide v8, v7, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v8, v8, v10

    if-gez v8, :cond_11

    iget v8, v15, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    if-nez v8, :cond_8

    :try_start_7
    iput-object v4, v2, Lio/ktor/utils/io/b;->w:Lio/ktor/utils/io/m;

    iput-object v0, v2, Lio/ktor/utils/io/b;->x:Lio/ktor/utils/io/m;

    iput-object v7, v2, Lio/ktor/utils/io/b;->y:Lkotlin/jvm/internal/f0;

    iput-object v6, v2, Lio/ktor/utils/io/b;->z:Lio/ktor/utils/io/m;

    iput-object v12, v2, Lio/ktor/utils/io/b;->E:Lio/ktor/utils/io/m;

    iput-object v1, v2, Lio/ktor/utils/io/b;->F:Lio/ktor/utils/io/internal/o;

    iput-object v15, v2, Lio/ktor/utils/io/b;->G:Lio/ktor/utils/io/internal/o;

    iput-object v14, v2, Lio/ktor/utils/io/b;->H:Ljava/nio/ByteBuffer;

    iput-object v13, v2, Lio/ktor/utils/io/b;->I:Lio/ktor/utils/io/m;

    iput-wide v10, v2, Lio/ktor/utils/io/b;->J:J

    iput-boolean v5, v2, Lio/ktor/utils/io/b;->L:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-wide/from16 v8, p1

    :try_start_8
    iput-wide v8, v2, Lio/ktor/utils/io/b;->K:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move-object/from16 v17, v1

    const/4 v1, 0x1

    :try_start_9
    iput v1, v2, Lio/ktor/utils/io/b;->O:I

    invoke-virtual {v13, v2}, Lio/ktor/utils/io/m;->I(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    move-object v5, v3

    goto/16 :goto_13

    :cond_7
    :goto_4
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v15, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    move-wide/from16 v18, v8

    move v8, v1

    :goto_5
    move-object v1, v0

    goto :goto_8

    :catchall_2
    move-exception v0

    :goto_6
    move-object v5, v12

    move-object/from16 v15, v17

    goto/16 :goto_1

    :catchall_3
    move-exception v0

    :goto_7
    move-object/from16 v17, v1

    goto :goto_6

    :catchall_4
    move-exception v0

    move-wide/from16 v8, p1

    goto :goto_7

    :cond_8
    move-wide/from16 v18, p1

    move-object/from16 v17, v1

    goto :goto_5

    :goto_8
    :try_start_a
    iget v0, v13, Lio/ktor/utils/io/m;->f:I

    invoke-virtual {v13, v14, v0, v8}, Lio/ktor/utils/io/m;->o(Ljava/nio/ByteBuffer;II)V

    invoke-virtual {v1}, Lio/ktor/utils/io/m;->E()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_9

    move-object/from16 p2, v2

    :goto_9
    move-object/from16 v23, v3

    move-object/from16 p3, v4

    move/from16 v20, v5

    move-wide/from16 v21, v10

    const/4 v9, 0x0

    goto :goto_d

    :cond_9
    iget-object v9, v1, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v9, Lio/ktor/utils/io/internal/m;

    iget-object v9, v9, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    move-object/from16 p2, v2

    :try_start_b
    iget v2, v9, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    if-nez v2, :cond_a

    :try_start_c
    invoke-virtual {v1}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {v1}, Lio/ktor/utils/io/m;->H()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_9

    :catchall_5
    move-exception v0

    :goto_a
    move-object v5, v12

    move-object/from16 v15, v17

    move-wide/from16 v8, v18

    goto/16 :goto_1

    :cond_a
    :try_start_d
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    move-object/from16 p3, v4

    move/from16 v20, v5

    int-to-long v4, v2

    :try_start_e
    invoke-virtual {v14}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    move-wide/from16 v21, v10

    int-to-long v10, v2

    move-object/from16 v23, v3

    iget-wide v2, v7, Lkotlin/jvm/internal/f0;->w:J

    sub-long v2, v21, v2

    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lio/ktor/utils/io/internal/o;->h(I)I

    move-result v2

    if-gtz v2, :cond_b

    const/4 v9, 0x0

    goto :goto_c

    :cond_b
    :goto_b
    iget v3, v9, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-lt v3, v2, :cond_10

    sub-int v4, v3, v2

    sget-object v5, Lio/ktor/utils/io/internal/o;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v5, v9, v3, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0, v9, v2}, Lio/ktor/utils/io/m;->f(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    move v9, v2

    :goto_c
    :try_start_f
    invoke-virtual {v1}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {v1}, Lio/ktor/utils/io/m;->H()V

    :goto_d
    if-gtz v9, :cond_d

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v0, v1

    move/from16 v4, v20

    move-wide/from16 v10, v21

    move-object/from16 v1, v17

    :goto_e
    move-wide/from16 v8, v18

    goto :goto_11

    :cond_d
    invoke-virtual {v13, v14, v15, v9}, Lio/ktor/utils/io/m;->g(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V

    iget-wide v2, v7, Lkotlin/jvm/internal/f0;->w:J

    int-to-long v4, v9

    add-long/2addr v2, v4

    iput-wide v2, v7, Lkotlin/jvm/internal/f0;->w:J

    sub-int/2addr v8, v9

    if-eqz v8, :cond_e

    if-eqz v20, :cond_f

    :cond_e
    const/4 v2, 0x1

    invoke-virtual {v13, v2}, Lio/ktor/utils/io/m;->k(I)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :cond_f
    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object v0, v1

    move-object/from16 v1, v17

    move-wide/from16 p1, v18

    move/from16 v5, v20

    move-wide/from16 v10, v21

    move-object/from16 v3, v23

    goto/16 :goto_3

    :catchall_6
    move-exception v0

    :goto_f
    move-object v5, v12

    move-object/from16 v15, v17

    move-wide/from16 v8, v18

    move-object/from16 v12, p3

    goto/16 :goto_17

    :catchall_7
    move-exception v0

    goto :goto_10

    :cond_10
    :try_start_10
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    :catchall_8
    move-exception v0

    move-object/from16 p3, v4

    :goto_10
    :try_start_11
    invoke-virtual {v1}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {v1}, Lio/ktor/utils/io/m;->H()V

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    :catchall_9
    move-exception v0

    move-object/from16 p3, v4

    goto :goto_f

    :catchall_a
    move-exception v0

    move-wide/from16 v18, p1

    move-object/from16 v17, v1

    goto/16 :goto_a

    :cond_11
    move-wide/from16 v18, p1

    move-object/from16 v17, v1

    move-object/from16 v23, v3

    move-object v3, v4

    move v4, v5

    goto :goto_e

    :goto_11
    :try_start_12
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result v1

    if-nez v1, :cond_12

    iget-boolean v1, v12, Lio/ktor/utils/io/m;->b:Z

    if-eqz v1, :cond_13

    :cond_12
    const/4 v1, 0x1

    goto :goto_12

    :catchall_b
    move-exception v0

    move-object v12, v3

    goto/16 :goto_19

    :goto_12
    invoke-virtual {v12, v1}, Lio/ktor/utils/io/m;->k(I)V

    :cond_13
    if-eq v12, v6, :cond_14

    iget-wide v13, v6, Lio/ktor/utils/io/m;->totalBytesWritten:J

    move-wide/from16 p1, v8

    iget-wide v8, v12, Lio/ktor/utils/io/m;->totalBytesWritten:J

    sub-long v8, v8, p1

    add-long/2addr v8, v13

    iput-wide v8, v6, Lio/ktor/utils/io/m;->totalBytesWritten:J

    :cond_14
    invoke-virtual {v12}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {v12}, Lio/ktor/utils/io/m;->H()V

    iget-wide v5, v7, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v1, v5, v10

    if-gez v1, :cond_17

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Lio/ktor/utils/io/m;->k(I)V

    invoke-virtual {v0}, Lio/ktor/utils/io/m;->l()I

    move-result v1

    if-nez v1, :cond_16

    iput-object v3, v2, Lio/ktor/utils/io/b;->w:Lio/ktor/utils/io/m;

    iput-object v0, v2, Lio/ktor/utils/io/b;->x:Lio/ktor/utils/io/m;

    iput-object v7, v2, Lio/ktor/utils/io/b;->y:Lkotlin/jvm/internal/f0;

    const/4 v1, 0x0

    iput-object v1, v2, Lio/ktor/utils/io/b;->z:Lio/ktor/utils/io/m;

    iput-object v1, v2, Lio/ktor/utils/io/b;->E:Lio/ktor/utils/io/m;

    iput-object v1, v2, Lio/ktor/utils/io/b;->F:Lio/ktor/utils/io/internal/o;

    iput-object v1, v2, Lio/ktor/utils/io/b;->G:Lio/ktor/utils/io/internal/o;

    iput-object v1, v2, Lio/ktor/utils/io/b;->H:Ljava/nio/ByteBuffer;

    iput-object v1, v2, Lio/ktor/utils/io/b;->I:Lio/ktor/utils/io/m;

    iput-wide v10, v2, Lio/ktor/utils/io/b;->J:J

    iput-boolean v4, v2, Lio/ktor/utils/io/b;->L:Z

    const/4 v1, 0x2

    iput v1, v2, Lio/ktor/utils/io/b;->O:I

    const/4 v5, 0x1

    invoke-virtual {v0, v5, v2}, Lio/ktor/utils/io/m;->y(ILs83/c;)Ljava/lang/Object;

    move-result-object v6
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    move-object/from16 v5, v23

    if-ne v6, v5, :cond_15

    :goto_13
    return-object v5

    :cond_15
    move-object v12, v3

    move-wide v8, v10

    move-object v11, v0

    move-object v0, v6

    move-object v10, v7

    :goto_14
    :try_start_13
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_15

    :cond_16
    move-object/from16 v5, v23

    const/4 v1, 0x2

    move-object v12, v3

    move-wide v8, v10

    move-object v11, v0

    move-object v10, v7

    :goto_15
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    move-object/from16 v1, p0

    move-object v3, v5

    goto/16 :goto_2

    :cond_17
    move-object v12, v3

    move-object v10, v7

    goto :goto_18

    :cond_18
    :try_start_14
    invoke-virtual {v7}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/16 v16, 0x0

    throw v16
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :goto_16
    move-wide v8, v5

    move-object v5, v12

    move-object v6, v5

    goto :goto_17

    :catchall_c
    move-exception v0

    goto :goto_16

    :goto_17
    :try_start_15
    invoke-virtual {v15}, Lio/ktor/utils/io/internal/o;->d()Z

    move-result v1

    if-nez v1, :cond_19

    iget-boolean v1, v5, Lio/ktor/utils/io/m;->b:Z

    if-eqz v1, :cond_1a

    :cond_19
    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Lio/ktor/utils/io/m;->k(I)V

    :cond_1a
    if-eq v5, v6, :cond_1b

    iget-wide v1, v6, Lio/ktor/utils/io/m;->totalBytesWritten:J

    iget-wide v3, v5, Lio/ktor/utils/io/m;->totalBytesWritten:J

    sub-long/2addr v3, v8

    add-long/2addr v3, v1

    iput-wide v3, v6, Lio/ktor/utils/io/m;->totalBytesWritten:J

    :cond_1b
    invoke-virtual {v5}, Lio/ktor/utils/io/m;->B()V

    invoke-virtual {v5}, Lio/ktor/utils/io/m;->H()V

    throw v0

    :cond_1c
    :goto_18
    if-eqz v4, :cond_1d

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lio/ktor/utils/io/m;->k(I)V

    :cond_1d
    iget-wide v0, v10, Lkotlin/jvm/internal/f0;->w:J

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    return-object v2

    :catchall_d
    move-exception v0

    move-object/from16 v12, p0

    :goto_19
    invoke-virtual {v12, v0}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    throw v0
.end method

.method public final k(I)V
    .locals 3

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    sget-object v1, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {v1}, Lio/ktor/utils/io/internal/o;->c()Z

    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/m;

    if-ne v0, v1, :cond_0

    iget-object v1, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v1, v1, Lio/ktor/utils/io/internal/o;->_availableForWrite$internal:I

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    const/4 v2, 0x1

    if-lt v0, v2, :cond_2

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->C()V

    :cond_2
    if-lt v1, p1, :cond_3

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->D()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    return v0
.end method

.method public final m()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n()Z
    .locals 2

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    sget-object v1, Lio/ktor/utils/io/internal/l;->c:Lio/ktor/utils/io/internal/l;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o(Ljava/nio/ByteBuffer;II)V
    .locals 2

    const-string v0, "Failed requirement."

    if-ltz p2, :cond_2

    if-ltz p3, :cond_1

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, Lio/ktor/utils/io/m;->d:I

    sub-int/2addr v0, v1

    add-int/2addr p3, p2

    if-le p3, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p3

    :goto_0
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p([BII)I
    .locals 10

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->E()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/internal/m;

    iget-object v2, v2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    :try_start_0
    iget v3, v2, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    return v1

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    iget v4, p0, Lio/ktor/utils/io/m;->d:I

    sub-int/2addr v3, v4

    move v4, v1

    :goto_0
    sub-int v5, p3, v4

    if-eqz v5, :cond_4

    iget v6, p0, Lio/ktor/utils/io/m;->e:I

    sub-int v7, v3, v6

    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    :cond_2
    iget v7, v2, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-nez v8, :cond_3

    move v5, v1

    goto :goto_1

    :cond_3
    sub-int v8, v7, v8

    sget-object v9, Lio/ktor/utils/io/internal/o;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v9, v2, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    :goto_1
    if-eqz v5, :cond_4

    add-int v7, v6, v5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int v6, p2, v4

    invoke-virtual {v0, p1, v6, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0, v2, v5}, Lio/ktor/utils/io/m;->f(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v4, v5

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    return v4

    :goto_2
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->A()V

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->H()V

    throw p1
.end method

.method public final r(Lw63/a;Ls83/c;)Ljava/lang/Object;
    .locals 3

    invoke-static {p0, p1}, Lio/ktor/utils/io/m;->q(Lio/ktor/utils/io/m;Lw63/a;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/c;

    if-eqz v1, :cond_1

    iget-object p2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast p2, Lio/ktor/utils/io/internal/m;

    iget-object p2, p2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {p2}, Lio/ktor/utils/io/internal/o;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p0, p1}, Lio/ktor/utils/io/m;->q(Lio/ktor/utils/io/m;Lw63/a;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    if-gtz v0, :cond_2

    iget v1, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget v2, p1, Lio/seon/androidsdk/service/e1;->c:I

    if-le v1, v2, :cond_2

    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/m;->t(Lw63/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object p1
.end method

.method public final s([BIILs83/c;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/utils/io/m;->p([BII)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/c;

    if-eqz v1, :cond_1

    iget-object p4, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast p4, Lio/ktor/utils/io/internal/m;

    iget-object p4, p4, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {p4}, Lio/ktor/utils/io/internal/o;->c()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/utils/io/m;->p([BII)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    if-gtz v0, :cond_3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/ktor/utils/io/m;->u([BIILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object p1
.end method

.method public final t(Lw63/a;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lio/ktor/utils/io/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/ktor/utils/io/d;

    iget v1, v0, Lio/ktor/utils/io/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/d;

    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/d;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/d;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/ktor/utils/io/d;->x:Lw63/a;

    iget-object v2, v0, Lio/ktor/utils/io/d;->w:Lio/ktor/utils/io/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lio/ktor/utils/io/d;->w:Lio/ktor/utils/io/m;

    iput-object p1, v0, Lio/ktor/utils/io/d;->x:Lw63/a;

    iput v4, v0, Lio/ktor/utils/io/d;->E:I

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->x(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p1, Ljava/lang/Integer;

    const/4 p2, -0x1

    invoke-direct {p1, p2}, Ljava/lang/Integer;-><init>(I)V

    return-object p1

    :cond_5
    const/4 p2, 0x0

    iput-object p2, v0, Lio/ktor/utils/io/d;->w:Lio/ktor/utils/io/m;

    iput-object p2, v0, Lio/ktor/utils/io/d;->x:Lw63/a;

    iput v3, v0, Lio/ktor/utils/io/d;->E:I

    invoke-virtual {v2, p1, v0}, Lio/ktor/utils/io/m;->r(Lw63/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ByteBufferChannel("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/internal/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u([BIILs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lio/ktor/utils/io/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/ktor/utils/io/c;

    iget v1, v0, Lio/ktor/utils/io/c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/c;

    invoke-direct {v0, p0, p4}, Lio/ktor/utils/io/c;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/c;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v0, Lio/ktor/utils/io/c;->z:I

    iget p2, v0, Lio/ktor/utils/io/c;->y:I

    iget-object p1, v0, Lio/ktor/utils/io/c;->x:[B

    iget-object v2, v0, Lio/ktor/utils/io/c;->w:Lio/ktor/utils/io/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lio/ktor/utils/io/c;->w:Lio/ktor/utils/io/m;

    iput-object p1, v0, Lio/ktor/utils/io/c;->x:[B

    iput p2, v0, Lio/ktor/utils/io/c;->y:I

    iput p3, v0, Lio/ktor/utils/io/c;->z:I

    iput v4, v0, Lio/ktor/utils/io/c;->G:I

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->x(Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_5

    new-instance p1, Ljava/lang/Integer;

    const/4 p2, -0x1

    invoke-direct {p1, p2}, Ljava/lang/Integer;-><init>(I)V

    return-object p1

    :cond_5
    const/4 p4, 0x0

    iput-object p4, v0, Lio/ktor/utils/io/c;->w:Lio/ktor/utils/io/m;

    iput-object p4, v0, Lio/ktor/utils/io/c;->x:[B

    iput v3, v0, Lio/ktor/utils/io/c;->G:I

    invoke-virtual {v2, p1, p2, p3, v0}, Lio/ktor/utils/io/m;->s([BIILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method

.method public final v(Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    const-wide v1, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->m()Ljava/lang/Throwable;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    new-instance p1, Lv63/d;

    invoke-direct {p1}, Lv63/d;-><init>()V

    const/4 v3, 0x1

    :try_start_0
    invoke-static {p1, v3, v0}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget v4, v0, Lio/seon/androidsdk/service/e1;->e:I

    iget v5, v0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v4, v5

    int-to-long v4, v4

    cmp-long v4, v4, v1

    if-lez v4, :cond_0

    long-to-int v4, v1

    iget v5, v0, Lio/seon/androidsdk/service/e1;->d:I

    iput v5, v0, Lio/seon/androidsdk/service/e1;->b:I

    iput v5, v0, Lio/seon/androidsdk/service/e1;->c:I

    iput v4, v0, Lio/seon/androidsdk/service/e1;->e:I

    :cond_0
    invoke-static {p0, v0}, Lio/ktor/utils/io/m;->q(Lio/ktor/utils/io/m;Lw63/a;)I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v1, v4

    const-wide/16 v4, 0x0

    cmp-long v4, v1, v4

    if-lez v4, :cond_1

    invoke-virtual {p0}, Lio/ktor/utils/io/m;->n()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {p1, v3, v0}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lv63/d;->b()V

    invoke-virtual {p1}, Lv63/d;->i()Lv63/e;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Lv63/d;->b()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    invoke-virtual {p1}, Lv63/d;->close()V

    throw v0

    :cond_2
    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-virtual {p0, v1, v2, p1}, Lio/ktor/utils/io/m;->w(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final w(JLs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lio/ktor/utils/io/e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/ktor/utils/io/e;

    iget v1, v0, Lio/ktor/utils/io/e;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/e;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/e;

    invoke-direct {v0, p0, p3}, Lio/ktor/utils/io/e;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/e;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/e;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/ktor/utils/io/e;->E:Lw63/a;

    iget-object p2, v0, Lio/ktor/utils/io/e;->z:Lv63/d;

    iget-object v2, v0, Lio/ktor/utils/io/e;->y:Lkotlin/jvm/internal/f0;

    iget-object v4, v0, Lio/ktor/utils/io/e;->x:Lv63/d;

    iget-object v5, v0, Lio/ktor/utils/io/e;->w:Lio/ktor/utils/io/m;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lv63/d;

    invoke-direct {p3}, Lv63/d;-><init>()V

    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-wide p1, v2, Lkotlin/jvm/internal/f0;->w:J

    const/4 p1, 0x0

    invoke-static {p3, v3, p1}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v5, p0

    move-object p2, p3

    move-object v4, p2

    :goto_1
    :try_start_2
    iget p3, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget v6, p1, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr p3, v6

    int-to-long v6, p3

    iget-wide v8, v2, Lkotlin/jvm/internal/f0;->w:J

    cmp-long p3, v6, v8

    if-lez p3, :cond_3

    long-to-int p3, v8

    iget v6, p1, Lio/seon/androidsdk/service/e1;->d:I

    iput v6, p1, Lio/seon/androidsdk/service/e1;->b:I

    iput v6, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput p3, p1, Lio/seon/androidsdk/service/e1;->e:I

    :cond_3
    invoke-static {v5, p1}, Lio/ktor/utils/io/m;->q(Lio/ktor/utils/io/m;Lw63/a;)I

    move-result p3

    iget-wide v6, v2, Lkotlin/jvm/internal/f0;->w:J

    int-to-long v8, p3

    sub-long/2addr v6, v8

    iput-wide v6, v2, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v8, 0x0

    cmp-long p3, v6, v8

    if-lez p3, :cond_5

    invoke-virtual {v5}, Lio/ktor/utils/io/m;->n()Z

    move-result p3

    if-nez p3, :cond_5

    iput-object v5, v0, Lio/ktor/utils/io/e;->w:Lio/ktor/utils/io/m;

    iput-object v4, v0, Lio/ktor/utils/io/e;->x:Lv63/d;

    iput-object v2, v0, Lio/ktor/utils/io/e;->y:Lkotlin/jvm/internal/f0;

    iput-object p2, v0, Lio/ktor/utils/io/e;->z:Lv63/d;

    iput-object p1, v0, Lio/ktor/utils/io/e;->E:Lw63/a;

    iput v3, v0, Lio/ktor/utils/io/e;->H:I

    invoke-virtual {v5, v0}, Lio/ktor/utils/io/m;->x(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_5

    move p3, v3

    goto :goto_3

    :cond_5
    const/4 p3, 0x0

    :goto_3
    if-eqz p3, :cond_6

    invoke-static {p2, v3, p1}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_6
    :try_start_3
    invoke-virtual {p2}, Lv63/d;->b()V

    invoke-virtual {v5}, Lio/ktor/utils/io/m;->m()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_7

    invoke-virtual {v4}, Lv63/d;->i()Lv63/e;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception p1

    move-object p3, v4

    goto :goto_5

    :cond_7
    throw p1

    :goto_4
    invoke-virtual {p2}, Lv63/d;->b()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_2
    move-exception p1

    :goto_5
    invoke-virtual {p3}, Lv63/d;->close()V

    throw p1
.end method

.method public final x(Ls83/c;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/m;

    iget-object v0, v0, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget v0, v0, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closed:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/internal/c;

    if-eqz v0, :cond_4

    iget-object p1, v0, Lio/ktor/utils/io/internal/c;->a:Ljava/lang/Throwable;

    if-nez p1, :cond_3

    iget-object p1, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/internal/m;

    iget-object p1, p1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-virtual {p1}, Lio/ktor/utils/io/internal/o;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-lt p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, Lio/ktor/utils/io/m;->_readOp:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    if-nez p1, :cond_2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Read operation is already in progress"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1

    :cond_4
    invoke-virtual {p0, v1, p1}, Lio/ktor/utils/io/m;->y(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(ILs83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lio/ktor/utils/io/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/ktor/utils/io/f;

    iget v1, v0, Lio/ktor/utils/io/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/f;

    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/f;-><init>(Lio/ktor/utils/io/m;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/f;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/ktor/utils/io/f;->w:Lio/ktor/utils/io/m;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/ktor/utils/io/m;->_state:Ljava/lang/Object;

    check-cast p2, Lio/ktor/utils/io/internal/m;

    iget-object p2, p2, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    iget p2, p2, Lio/ktor/utils/io/internal/o;->_availableForRead$internal:I

    if-ge p2, p1, :cond_4

    :try_start_1
    iput-object p0, v0, Lio/ktor/utils/io/f;->w:Lio/ktor/utils/io/m;

    iput v3, v0, Lio/ktor/utils/io/f;->z:I

    iget-object p2, p0, Lio/ktor/utils/io/m;->g:Lio/ktor/utils/io/internal/b;

    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/m;->G(ILq83/d;)V

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/ktor/utils/io/internal/b;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p1, Lio/ktor/utils/io/m;->_readOp:Ljava/lang/Object;

    throw p2

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final z(Lio/ktor/utils/io/internal/j;)V
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/m;->c:Lx63/f;

    invoke-interface {v0, p1}, Lx63/f;->a1(Ljava/lang/Object;)V

    return-void
.end method
