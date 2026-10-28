.class public final Ld52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Ld52/a;",
        "",
        "Lpk0/c;",
        "commandResponseParser",
        "dataPacketParser",
        "eventPacketParser",
        "<init>",
        "(Lpk0/c;Lpk0/c;Lpk0/c;)V",
        "",
        "data",
        "Llt0/c;",
        "a",
        "([B)Llt0/c;",
        "Llt0/m;",
        "b",
        "([B)Llt0/m;",
        "c",
        "Lpk0/c;",
        "puffin_release"
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
.field private final a:Lpk0/c;

.field private final b:Lpk0/c;

.field private final c:Lpk0/c;


# direct methods
.method public constructor <init>(Lpk0/c;Lpk0/c;Lpk0/c;)V
    .locals 1

    const-string v0, "commandResponseParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacketParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventPacketParser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld52/a;->a:Lpk0/c;

    iput-object p2, p0, Ld52/a;->b:Lpk0/c;

    iput-object p3, p0, Ld52/a;->c:Lpk0/c;

    return-void
.end method


# virtual methods
.method public final a([B)Llt0/c;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld52/a;->a:Lpk0/c;

    sget-object v1, Lst0/v;->PUFFIN:Lst0/v;

    invoke-interface {v0, p1, v1}, Lpk0/c;->a([BLst0/v;)Llt0/m;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b([B)Llt0/m;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld52/a;->b:Lpk0/c;

    sget-object v1, Lst0/v;->PUFFIN:Lst0/v;

    invoke-interface {v0, p1, v1}, Lpk0/c;->a([BLst0/v;)Llt0/m;

    move-result-object p1

    return-object p1
.end method

.method public final c([B)Llt0/c;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld52/a;->c:Lpk0/c;

    sget-object v1, Lst0/v;->PUFFIN:Lst0/v;

    invoke-interface {v0, p1, v1}, Lpk0/c;->a([BLst0/v;)Llt0/m;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
