.class public final Lqk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lut0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lqk0/a;",
        "Lut0/a;",
        "Lnj0/f;",
        "protocol",
        "Lpk0/c;",
        "reader",
        "<init>",
        "(Lnj0/f;Lpk0/c;)V",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "Llt0/i;",
        "c",
        "(Ljava/nio/ByteBuffer;)Llt0/i;",
        "Lxj0/b;",
        "packet",
        "",
        "a",
        "(Lxj0/b;)[B",
        "bytes",
        "Lzj0/h;",
        "b",
        "([B)Lzj0/h;",
        "Lnj0/f;",
        "Lpk0/c;",
        "Lst0/v;",
        "Lst0/v;",
        "deviceType",
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


# instance fields
.field private final a:Lnj0/f;

.field private final b:Lpk0/c;

.field private final c:Lst0/v;


# direct methods
.method public constructor <init>(Lnj0/f;Lpk0/c;)V
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqk0/a;->a:Lnj0/f;

    iput-object p2, p0, Lqk0/a;->b:Lpk0/c;

    invoke-static {p1}, Ljk0/i;->a(Lnj0/f;)Lst0/v;

    move-result-object p1

    iput-object p1, p0, Lqk0/a;->c:Lst0/v;

    return-void
.end method

.method private final c(Ljava/nio/ByteBuffer;)Llt0/i;
    .locals 2

    iget-object v0, p0, Lqk0/a;->a:Lnj0/f;

    sget-object v1, Lnj0/f$b$b;->b:Lnj0/f$b$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lmt0/c;

    invoke-direct {v0, p1}, Lmt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    sget-object v1, Lnj0/f$b$c;->b:Lnj0/f$b$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lmt0/e;

    invoke-direct {v0, p1}, Lmt0/e;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_1
    instance-of v0, v0, Lnj0/f$b$a;

    if-eqz v0, :cond_2

    new-instance v0, Lmt0/h;

    invoke-direct {v0, p1}, Lmt0/h;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Lxj0/b;)[B
    .locals 1

    const-string v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, p1}, Lqk0/a;->c(Ljava/nio/ByteBuffer;)Llt0/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object p1

    invoke-virtual {p1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "array(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b([B)Lzj0/h;
    .locals 2

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqk0/a;->b:Lpk0/c;

    iget-object v1, p0, Lqk0/a;->c:Lst0/v;

    invoke-interface {v0, p1, v1}, Lpk0/c;->a([BLst0/v;)Llt0/m;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lzj0/h;

    if-eqz v1, :cond_1

    check-cast p1, Lzj0/h;

    return-object p1

    :cond_1
    return-object v0
.end method
