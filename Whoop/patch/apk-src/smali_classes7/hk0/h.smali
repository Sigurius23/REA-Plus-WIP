.class public final Lhk0/h;
.super Lhk0/m;
.source "SourceFile"

# interfaces
.implements Ldk0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u000f\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010!R\u0016\u0010(\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010!\u00a8\u0006+"
    }
    d2 = {
        "Lhk0/h;",
        "Lhk0/m;",
        "Ldk0/c;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "offset",
        "length",
        "",
        "e0",
        "(II)[B",
        "",
        "d0",
        "()Z",
        "Lhk0/n;",
        "g",
        "Lhk0/n;",
        "b0",
        "()Lhk0/n;",
        "subtype",
        "",
        "h",
        "Ljava/lang/String;",
        "K",
        "()Ljava/lang/String;",
        "packetName",
        "",
        "J",
        "()Ljava/lang/Long;",
        "numPackets",
        "e",
        "()[B",
        "trimPage",
        "w",
        "wrapCount",
        "n",
        "trimPageLittleEndian",
        "z",
        "wrapCountLittleEndian",
        "i",
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
.field public static final i:Lhk0/h$a;


# instance fields
.field private final g:Lhk0/n;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/h;->i:Lhk0/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/m;-><init>(Ljava/nio/ByteBuffer;)V

    sget-object p1, Lhk0/n;->HISTORY_END:Lhk0/n;

    iput-object p1, p0, Lhk0/h;->g:Lhk0/n;

    const-string p1, "Rev2HistoryEndMetadataPacket"

    iput-object p1, p0, Lhk0/h;->h:Ljava/lang/String;

    return-void
.end method

.method private final e0(II)[B
    .locals 4

    invoke-virtual {p0}, Lhk0/h;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-virtual {p0}, Lhk0/m;->a0()Ljava/nio/ByteBuffer;

    move-result-object v2

    add-int v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public J()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lhk0/h;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhk0/m;->a0()Ljava/nio/ByteBuffer;

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

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk0/h;->h:Ljava/lang/String;

    return-object v0
.end method

.method public b0()Lhk0/n;
    .locals 1

    iget-object v0, p0, Lhk0/h;->g:Lhk0/n;

    return-object v0
.end method

.method public d0()Z
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()[B
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, v0}, Lhk0/h;->e0(II)[B

    move-result-object v0

    return-object v0
.end method

.method public n()[B
    .locals 1

    invoke-virtual {p0}, Lhk0/h;->e()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/n;->K0([B)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public w()[B
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lhk0/h;->e0(II)[B

    move-result-object v0

    return-object v0
.end method

.method public z()[B
    .locals 1

    invoke-virtual {p0}, Lhk0/h;->w()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/n;->K0([B)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
