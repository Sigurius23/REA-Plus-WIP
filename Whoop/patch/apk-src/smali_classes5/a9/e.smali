.class public La9/e;
.super La9/a;
.source "SourceFile"


# instance fields
.field public E:Ljava/nio/ByteBuffer;

.field public F:Z

.field public G:J

.field public H:Ljava/nio/ByteBuffer;

.field public final I:I

.field public y:Lu8/p;

.field public final z:La9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.decoder"

    invoke-static {v0}, Lu8/y;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La9/a;-><init>(I)V

    new-instance v0, La9/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La9/c;-><init>(I)V

    iput-object v0, p0, La9/e;->z:La9/c;

    iput p1, p0, La9/e;->I:I

    return-void
.end method


# virtual methods
.method public o()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, La9/a;->x:I

    iget-object v1, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_0
    iget-object v1, p0, La9/e;->H:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_1
    iput-boolean v0, p0, La9/e;->F:Z

    return-void
.end method

.method public final p(I)Ljava/nio/ByteBuffer;
    .locals 5

    const/4 v0, 0x1

    iget v1, p0, La9/e;->I:I

    if-ne v1, v0, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    :goto_0
    new-instance v1, Landroidx/media3/decoder/DecoderInputBuffer$InsufficientCapacityException;

    const-string v2, " < "

    const-string v3, ")"

    const-string v4, "Buffer too small ("

    invoke-static {v0, p1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final q(I)V
    .locals 3

    iget-object v0, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, La9/e;->p(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr p1, v2

    if-lt v1, p1, :cond_1

    iput-object v0, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    return-void

    :cond_1
    invoke-virtual {p0, p1}, La9/e;->p(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    if-lez v2, :cond_2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_2
    iput-object p1, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, La9/e;->E:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_0
    iget-object v0, p0, La9/e;->H:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_1
    return-void
.end method
