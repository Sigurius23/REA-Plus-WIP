.class public Lhk0/b;
.super Llt0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u000fR\u0011\u0010$\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lhk0/b;",
        "Llt0/c;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "c",
        "Ljava/nio/ByteBuffer;",
        "Q",
        "()Ljava/nio/ByteBuffer;",
        "",
        "T",
        "()I",
        "rawPacketCategory",
        "Lhk0/o;",
        "S",
        "()Lhk0/o;",
        "packetCategory",
        "R",
        "flags",
        "Lfk2/a;",
        "X",
        "()Lfk2/a;",
        "timeStamp",
        "",
        "W",
        "()J",
        "sequence",
        "U",
        "rawPacketType",
        "Lhk0/p;",
        "V",
        "()Lhk0/p;",
        "rev2PacketType",
        "d",
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
.field public static final d:Lhk0/b$a;


# instance fields
.field private final c:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/b;->d:Lhk0/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    iput-object p1, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final Q()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final R()I
    .locals 2

    iget-object v0, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final S()Lhk0/o;
    .locals 2

    sget-object v0, Lhk0/o;->Companion:Lhk0/o$a;

    invoke-virtual {p0}, Lhk0/b;->T()I

    move-result v1

    invoke-virtual {v0, v1}, Lhk0/o$a;->a(I)Lhk0/o;

    move-result-object v0

    return-object v0
.end method

.method public final T()I
    .locals 2

    iget-object v0, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final U()I
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    iget-object v1, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    return v0
.end method

.method public final V()Lhk0/p;
    .locals 2

    sget-object v0, Lhk0/p;->Companion:Lhk0/p$a;

    invoke-virtual {p0}, Lhk0/b;->U()I

    move-result v1

    invoke-virtual {v0, v1}, Lhk0/p$a;->a(I)Lhk0/p;

    move-result-object v0

    return-object v0
.end method

.method public final W()J
    .locals 2

    iget-object v0, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final X()Lfk2/a;
    .locals 6

    new-instance v0, Lfk2/a;

    iget-object v1, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Luk0/b;->d(I)J

    move-result-wide v1

    sget-object v3, Luk0/b;->a:Luk0/b;

    iget-object v4, p0, Lhk0/b;->c:Ljava/nio/ByteBuffer;

    const/4 v5, 0x7

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v4

    invoke-virtual {v3, v4}, Luk0/b;->e(S)I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lfk2/a;-><init>(JJ)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lhk0/b;->S()Lhk0/o;

    move-result-object v0

    invoke-virtual {p0}, Lhk0/b;->V()Lhk0/p;

    move-result-object v1

    invoke-virtual {p0}, Llt0/c;->O()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Rev2[category="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "] - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
