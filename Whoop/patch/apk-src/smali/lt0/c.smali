.class public abstract Llt0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0005\n\u0002\u0008\u0007\u0008&\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0008R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Llt0/c;",
        "",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "O",
        "()Ljava/lang/String;",
        "toString",
        "a",
        "Ljava/nio/ByteBuffer;",
        "M",
        "()Ljava/nio/ByteBuffer;",
        "b",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "Llt0/c$a;",
        "type",
        "L",
        "()Llt0/c$a;",
        "setPacketType",
        "(Llt0/c$a;)V",
        "packetType",
        "",
        "value",
        "N",
        "()B",
        "P",
        "(B)V",
        "sequenceNumber",
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


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BlePacket "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Llt0/c;->b:Ljava/lang/String;

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public abstract K()Ljava/lang/String;
.end method

.method public final L()Llt0/c$a;
    .locals 3

    sget-object v0, Llt0/c$a;->Companion:Llt0/c$a$a;

    iget-object v1, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Llt0/c$a$a;->a(B)Llt0/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final M()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public N()B
    .locals 2

    iget-object v0, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    return v0
.end method

.method public final O()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    sget-object v1, Luk0/a;->a:Luk0/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Luk0/a;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public P(B)V
    .locals 2

    iget-object v0, p0, Llt0/c;->a:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Llt0/c;->L()Llt0/c$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Llt0/c;->O()Ljava/lang/String;

    move-result-object v1

    const-string v2, " - "

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
