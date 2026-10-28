.class public final Lnt0/e;
.super Lnt0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnt0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0017\n\u0002\u0008\u001a\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0010\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000f\u0010\u000cR\u0017\u0010\u0013\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\n\u001a\u0004\u0008\u0012\u0010\u000cR\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0016\u001a\u0004\u0008\u001e\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\u0018R\u0017\u0010%\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0016\u001a\u0004\u0008$\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0016\u001a\u0004\u0008\'\u0010\u0018R\u001a\u0010+\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008)\u0010\n\u001a\u0004\u0008*\u0010\u000c\u00a8\u0006."
    }
    d2 = {
        "Lnt0/e;",
        "Lnt0/h;",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/b;",
        "dataPacket",
        "<init>",
        "(Llt0/m;Llt0/b;)V",
        "",
        "v",
        "I",
        "g0",
        "()I",
        "accelSamplingFrequency",
        "w",
        "n0",
        "numberOfAccelReadings",
        "x",
        "o0",
        "numberOfGyroReadings",
        "",
        "y",
        "[S",
        "h0",
        "()[S",
        "accelX",
        "z",
        "i0",
        "accelY",
        "A",
        "j0",
        "accelZ",
        "B",
        "k0",
        "gyroX",
        "C",
        "l0",
        "gyroY",
        "D",
        "m0",
        "gyroZ",
        "E",
        "c0",
        "expectedPacketLength",
        "F",
        "a",
        "connectivity-core_release"
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
.field public static final F:Lnt0/e$a;


# instance fields
.field private final A:[S

.field private final B:[S

.field private final C:[S

.field private final D:[S

.field private final E:I

.field private final v:I

.field private final w:I

.field private final x:I

.field private final y:[S

.field private final z:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnt0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnt0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnt0/e;->F:Lnt0/e$a;

    return-void
.end method

.method public constructor <init>(Llt0/m;Llt0/b;)V
    .locals 8

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnt0/h;-><init>(Llt0/m;Llt0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Luk0/b;->a:Luk0/b;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p2

    const/16 v0, 0xe

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p2

    invoke-virtual {p1, p2}, Luk0/b;->e(S)I

    move-result p2

    iput p2, p0, Lnt0/e;->v:I

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p2

    const/16 v0, 0x10

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p2

    invoke-virtual {p1, p2}, Luk0/b;->e(S)I

    move-result v1

    iput v1, p0, Lnt0/e;->w:I

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p2

    const/16 v0, 0x26e

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p2

    invoke-virtual {p1, p2}, Luk0/b;->e(S)I

    move-result p1

    iput p1, p0, Lnt0/e;->x:I

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/16 v0, 0x14

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p2

    iput-object p2, p0, Lnt0/e;->y:[S

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    const/16 v0, 0xdc

    invoke-static/range {v0 .. v5}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p2

    iput-object p2, p0, Lnt0/e;->z:[S

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    const/16 v0, 0x1a4

    invoke-static/range {v0 .. v5}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p2

    iput-object p2, p0, Lnt0/e;->A:[S

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/16 v2, 0x278

    move v3, p1

    invoke-static/range {v2 .. v7}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p1

    iput-object p1, p0, Lnt0/e;->B:[S

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    const/16 v2, 0x340

    invoke-static/range {v2 .. v7}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p1

    iput-object p1, p0, Lnt0/e;->C:[S

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    const/16 v2, 0x408

    invoke-static/range {v2 .. v7}, Lor2/k;->b(IILjava/nio/ByteBuffer;Ltr2/n;ILjava/lang/Object;)[S

    move-result-object p1

    iput-object p1, p0, Lnt0/e;->D:[S

    const/16 p1, 0x4dc

    iput p1, p0, Lnt0/e;->E:I

    return-void
.end method


# virtual methods
.method public c0()I
    .locals 1

    iget v0, p0, Lnt0/e;->E:I

    return v0
.end method

.method public final g0()I
    .locals 1

    iget v0, p0, Lnt0/e;->v:I

    return v0
.end method

.method public final h0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->y:[S

    return-object v0
.end method

.method public final i0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->z:[S

    return-object v0
.end method

.method public final j0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->A:[S

    return-object v0
.end method

.method public final k0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->B:[S

    return-object v0
.end method

.method public final l0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->C:[S

    return-object v0
.end method

.method public final m0()[S
    .locals 1

    iget-object v0, p0, Lnt0/e;->D:[S

    return-object v0
.end method

.method public final n0()I
    .locals 1

    iget v0, p0, Lnt0/e;->w:I

    return v0
.end method

.method public final o0()I
    .locals 1

    iget v0, p0, Lnt0/e;->x:I

    return v0
.end method
