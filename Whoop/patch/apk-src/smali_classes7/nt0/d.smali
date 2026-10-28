.class public final Lnt0/d;
.super Lnt0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lnt0/d;",
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
        "c0",
        "()I",
        "expectedPacketLength",
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
.field private final v:I


# direct methods
.method public constructor <init>(Llt0/m;Llt0/b;)V
    .locals 1

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnt0/h;-><init>(Llt0/m;Llt0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 p1, 0x85c

    iput p1, p0, Lnt0/d;->v:I

    return-void
.end method


# virtual methods
.method public c0()I
    .locals 1

    iget v0, p0, Lnt0/d;->v:I

    return v0
.end method
