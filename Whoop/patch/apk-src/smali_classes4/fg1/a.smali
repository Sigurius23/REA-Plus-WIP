.class public final Lfg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR)\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lfg1/a;",
        "",
        "Loh2/a;",
        "acquisitionInfo",
        "<init>",
        "(Loh2/a;)V",
        "Llt0/m;",
        "receivedPacket",
        "Lot0/b;",
        "eventPacket",
        "Ll83/a0;",
        "a",
        "(Llt0/m;Lot0/b;)V",
        "Loh2/a;",
        "b",
        "()Loh2/a;",
        "",
        "Lg5/b;",
        "Lmt0/b;",
        "Ljava/util/List;",
        "d",
        "()Ljava/util/List;",
        "packets",
        "",
        "c",
        "()I",
        "count",
        "firmware-events_release"
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
.field private final a:Loh2/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg5/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Loh2/a;)V
    .locals 1

    const-string v0, "acquisitionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg1/a;->a:Loh2/a;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lfg1/a;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Llt0/m;Lot0/b;)V
    .locals 2

    const-string v0, "receivedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfg1/a;->b:Ljava/util/List;

    new-instance v1, Lg5/b;

    invoke-virtual {p1}, Llt0/k;->a()Lmt0/b;

    move-result-object p1

    invoke-direct {v1, p2, p1}, Lg5/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()Loh2/a;
    .locals 1

    iget-object v0, p0, Lfg1/a;->a:Loh2/a;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lfg1/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg5/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfg1/a;->b:Ljava/util/List;

    return-object v0
.end method
