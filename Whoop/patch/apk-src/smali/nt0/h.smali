.class public abstract Lnt0/h;
.super Llt0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnt0/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0019\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u0082\u0001\u0007\u001e\u001f !\"#$\u00a8\u0006%"
    }
    d2 = {
        "Lnt0/h;",
        "Llt0/b;",
        "Llt0/m;",
        "receivedPacket",
        "dataPacket",
        "<init>",
        "(Llt0/m;Llt0/b;)V",
        "",
        "f0",
        "()Z",
        "s",
        "Llt0/m;",
        "t",
        "Llt0/b;",
        "",
        "b0",
        "()I",
        "crcOffset",
        "c0",
        "expectedPacketLength",
        "",
        "e0",
        "()J",
        "timestamp",
        "Ljava/nio/ByteBuffer;",
        "d0",
        "()Ljava/nio/ByteBuffer;",
        "rawData",
        "u",
        "a",
        "Lnt0/a;",
        "Lnt0/b;",
        "Lnt0/c;",
        "Lnt0/d;",
        "Lnt0/e;",
        "Lnt0/f;",
        "Lnt0/g;",
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
.field public static final u:Lnt0/h$a;


# instance fields
.field private final s:Llt0/m;

.field private final t:Llt0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnt0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnt0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnt0/h;->u:Lnt0/h$a;

    return-void
.end method

.method private constructor <init>(Llt0/m;Llt0/b;)V
    .locals 2

    .line 2
    invoke-virtual {p2}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Llt0/k;->a()Lmt0/b;

    move-result-object v1

    invoke-virtual {v1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 3
    invoke-direct {p0, v0, v1}, Llt0/b;-><init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    .line 4
    iput-object p1, p0, Lnt0/h;->s:Llt0/m;

    .line 5
    iput-object p2, p0, Lnt0/h;->t:Llt0/b;

    return-void
.end method

.method public synthetic constructor <init>(Llt0/m;Llt0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnt0/h;-><init>(Llt0/m;Llt0/b;)V

    return-void
.end method

.method private final b0()I
    .locals 1

    invoke-virtual {p0}, Lnt0/h;->c0()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    return v0
.end method


# virtual methods
.method public abstract c0()I
.end method

.method public final d0()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lnt0/h;->s:Llt0/m;

    invoke-virtual {v0}, Llt0/k;->a()Lmt0/b;

    move-result-object v0

    invoke-virtual {v0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lnt0/h;->t:Llt0/b;

    invoke-virtual {v0}, Llt0/b;->X()Lfk2/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfk2/a;->j()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final f0()Z
    .locals 4

    invoke-virtual {p0}, Lnt0/h;->d0()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0}, Lnt0/h;->b0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    invoke-virtual {p0}, Lnt0/h;->d0()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    invoke-virtual {p0}, Lnt0/h;->c0()I

    move-result v3

    if-ne v2, v3, :cond_0

    sget-object v2, Ltt0/c;->a:Ltt0/c;

    iget-object v3, p0, Lnt0/h;->t:Llt0/b;

    invoke-virtual {v3}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Ltt0/c;->a(Ljava/nio/ByteBuffer;J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
