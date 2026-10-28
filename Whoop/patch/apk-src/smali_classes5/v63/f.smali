.class public final Lv63/f;
.super Lx63/d;
.source "SourceFile"


# instance fields
.field public final F:I

.field public final G:Lt63/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x3e8

    invoke-direct {p0, v0}, Lx63/d;-><init>(I)V

    const/16 v0, 0x1000

    iput v0, p0, Lv63/f;->F:I

    sget-object v0, Lt63/a;->a:Lt63/a;

    iput-object v0, p0, Lv63/f;->G:Lt63/a;

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw63/a;

    invoke-virtual {p1}, Lw63/a;->m()V

    invoke-virtual {p1}, Lw63/a;->k()V

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lw63/a;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lv63/f;->G:Lt63/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lw63/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to unlink: buffer is in use."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lw63/a;

    iget-object v1, p0, Lv63/f;->G:Lt63/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lv63/f;->F:I

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v2, "allocate(size)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lt63/b;->a:Ljava/nio/ByteBuffer;

    invoke-direct {v0, v1, p0}, Lw63/a;-><init>(Ljava/nio/ByteBuffer;Lx63/f;)V

    return-object v0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lw63/a;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    int-to-long v1, v1

    iget v3, p0, Lv63/f;->F:I

    int-to-long v4, v3

    cmp-long v1, v1, v4

    if-nez v1, :cond_4

    sget-object v0, Lw63/a;->m:Lw63/a;

    if-eq p1, v0, :cond_3

    if-eq p1, v0, :cond_2

    invoke-virtual {p1}, Lw63/a;->i()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lw63/a;->h()Lw63/a;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recycled instance shouldn\'t be a part of a chain."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to clear buffer: it is still in use."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Empty instance couldn\'t be recycled"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ChunkBuffer.Empty couldn\'t be recycled"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "Buffer size mismatch. Expected: "

    const-string v1, ", actual: "

    invoke-static {v3, p1, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
