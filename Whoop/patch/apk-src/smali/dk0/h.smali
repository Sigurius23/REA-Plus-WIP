.class public final Ldk0/h;
.super Llt0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Ldk0/h;",
        "Llt0/c;",
        "Ljava/nio/ByteBuffer;",
        "rawData",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V",
        "c",
        "Ljava/nio/ByteBuffer;",
        "",
        "d",
        "I",
        "offsetAccelY",
        "e",
        "offsetAccelZ",
        "f",
        "offsetGyroX",
        "g",
        "offsetGyroY",
        "h",
        "offsetGyroZ",
        "i",
        "offsetCrc",
        "S",
        "()I",
        "payloadSize",
        "Q",
        "numberOfAccelReadings",
        "R",
        "numberOfGyroReadings",
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
.field private final c:Ljava/nio/ByteBuffer;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "rawData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    iput-object p1, p0, Ldk0/h;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ldk0/h;->Q()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1c

    iput p1, p0, Ldk0/h;->d:I

    invoke-virtual {p0}, Ldk0/h;->Q()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p1

    iput p2, p0, Ldk0/h;->e:I

    invoke-virtual {p0}, Ldk0/h;->Q()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p2

    iput p1, p0, Ldk0/h;->f:I

    invoke-virtual {p0}, Ldk0/h;->R()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p1

    iput p2, p0, Ldk0/h;->g:I

    invoke-virtual {p0}, Ldk0/h;->R()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p2

    iput p1, p0, Ldk0/h;->h:I

    invoke-virtual {p0}, Ldk0/h;->S()I

    move-result p1

    add-int/lit8 p1, p1, -0x4

    iput p1, p0, Ldk0/h;->i:I

    return-void
.end method


# virtual methods
.method public final Q()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    iget-object v1, p0, Ldk0/h;->c:Ljava/nio/ByteBuffer;

    const/16 v2, 0x18

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method

.method public final R()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    iget-object v1, p0, Ldk0/h;->c:Ljava/nio/ByteBuffer;

    const/16 v2, 0x1a

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method

.method public final S()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    iget-object v1, p0, Ldk0/h;->c:Ljava/nio/ByteBuffer;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method
