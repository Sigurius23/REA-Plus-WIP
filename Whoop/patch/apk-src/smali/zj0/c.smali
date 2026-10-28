.class public abstract Lzj0/c;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000c\u001a\u00020\u00048\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u0010\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\tR\u0017\u0010\u0018\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\t\u001a\u0004\u0008\u0017\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u000bR\u0011\u0010 \u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001b\u00a8\u0006!"
    }
    d2 = {
        "Lzj0/c;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "",
        "offset",
        "<init>",
        "(Ljava/nio/ByteBuffer;I)V",
        "f",
        "I",
        "Y",
        "()I",
        "REVISION_LENGTH",
        "g",
        "EPOCHSECONDS_LENGTH",
        "h",
        "Z",
        "REVISION_OFFSET",
        "i",
        "EPOCHSECONDS_OFFSET",
        "j",
        "SUBSECONDS_OFFSET",
        "k",
        "a0",
        "revision",
        "",
        "X",
        "()J",
        "epochSeconds",
        "b0",
        "subseconds",
        "c0",
        "timeStampMillis",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lzj0/c;->f:I

    const/4 v0, 0x4

    .line 3
    iput v0, p0, Lzj0/c;->g:I

    .line 4
    iget v1, p0, Lzj0/c;->h:I

    add-int/2addr v1, p1

    add-int/2addr v1, p2

    iput v1, p0, Lzj0/c;->i:I

    add-int/2addr v1, v0

    add-int/2addr v1, p2

    .line 5
    iput v1, p0, Lzj0/c;->j:I

    .line 6
    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget p2, p0, Lzj0/c;->h:I

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Lwj0/a;->a(B)I

    move-result p1

    iput p1, p0, Lzj0/c;->k:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lzj0/c;-><init>(Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method private final X()J
    .locals 2

    iget v0, p0, Lzj0/c;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Lzj0/c;->i:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lwj0/a;->c(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private final b0()I
    .locals 2

    iget v0, p0, Lzj0/c;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Lzj0/c;->j:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    invoke-static {v0}, Lwj0/a;->b(S)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final Y()I
    .locals 1

    iget v0, p0, Lzj0/c;->f:I

    return v0
.end method

.method public final Z()I
    .locals 1

    iget v0, p0, Lzj0/c;->h:I

    return v0
.end method

.method public final a0()I
    .locals 1

    iget v0, p0, Lzj0/c;->k:I

    return v0
.end method

.method public final c0()J
    .locals 6

    iget v0, p0, Lzj0/c;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-direct {p0}, Lzj0/c;->X()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    invoke-direct {p0}, Lzj0/c;->b0()I

    move-result v4

    int-to-double v4, v4

    mul-double/2addr v4, v2

    const-wide/high16 v2, 0x40e0000000000000L    # 32768.0

    div-double/2addr v4, v2

    add-double/2addr v4, v0

    invoke-static {v4, v5}, Le93/b;->Y(D)J

    move-result-wide v0

    return-wide v0
.end method
