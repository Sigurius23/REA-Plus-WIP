.class public final Ldk0/d;
.super Ldk0/i;
.source "SourceFile"

# interfaces
.implements Ldk0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u000b\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0019"
    }
    d2 = {
        "Ldk0/d;",
        "Ldk0/i;",
        "Ldk0/c;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "T",
        "()Z",
        "",
        "J",
        "()Ljava/lang/Long;",
        "numPackets",
        "",
        "e",
        "()[B",
        "trimPage",
        "w",
        "wrapCount",
        "n",
        "trimPageLittleEndian",
        "z",
        "wrapCountLittleEndian",
        "a",
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


# static fields
.field public static final e:Ldk0/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldk0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldk0/d;->e:Ldk0/d$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ldk0/i;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public J()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Ldk0/d;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final T()Z
    .locals 2

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0xc

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()[B
    .locals 4

    invoke-virtual {p0}, Ldk0/d;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public n()[B
    .locals 4

    invoke-virtual {p0}, Ldk0/d;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-static {v2}, Lm83/n;->K0([B)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public w()[B
    .locals 4

    invoke-virtual {p0}, Ldk0/d;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x4

    new-array v2, v1, [B

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public z()[B
    .locals 4

    invoke-virtual {p0}, Ldk0/d;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x4

    new-array v2, v1, [B

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-static {v2}, Lm83/n;->K0([B)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
