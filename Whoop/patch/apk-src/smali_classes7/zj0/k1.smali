.class public final Lzj0/k1;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lzj0/k1;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Lzj0/f;",
        "X",
        "()Lzj0/f;",
        "verifyResult",
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


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final X()Lzj0/f;
    .locals 3

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lzj0/f;->UNKNOWN:Lzj0/f;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    sget-object v0, Lzj0/f;->UNKNOWN:Lzj0/f;

    return-object v0

    :cond_1
    sget-object v1, Lzj0/f;->Companion:Lzj0/f$a;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Lwj0/a;->a(B)I

    move-result v0

    invoke-virtual {v1, v0}, Lzj0/f$a;->a(I)Lzj0/f;

    move-result-object v0

    return-object v0
.end method
