.class public final Lmt0/g;
.super Llt0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmt0/g;",
        "Llt0/b;",
        "Ljava/nio/ByteBuffer;",
        "rawData",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V",
        "s",
        "Ljava/nio/ByteBuffer;",
        "b0",
        "()Ljava/nio/ByteBuffer;",
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
.field private final s:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "rawData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Llt0/b;-><init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    iput-object p1, p0, Lmt0/g;->s:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final b0()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lmt0/g;->s:Ljava/nio/ByteBuffer;

    return-object v0
.end method
