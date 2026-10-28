.class public final Luh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Ljava/nio/ByteBuffer;

.field public final x:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Luh/b;->w:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    iput p1, p0, Luh/b;->x:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 5

    iget-object v0, p0, Luh/b;->w:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    iget v2, p0, Luh/b;->x:I

    if-ne v1, v2, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    int-to-long v3, v1

    add-long/2addr v3, p2

    long-to-int p2, v3

    if-le p2, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, p2

    :goto_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, v0}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method
