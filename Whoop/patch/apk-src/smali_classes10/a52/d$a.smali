.class public final La52/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La52/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u001c\u0010\r\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "La52/d$a;",
        "",
        "<init>",
        "()V",
        "Lfk0/d;",
        "endPacket",
        "La52/d;",
        "b",
        "(Lfk0/d;)La52/d;",
        "a",
        "()La52/d;",
        "Ljava/nio/ByteBuffer;",
        "kotlin.jvm.PlatformType",
        "failurePayload",
        "Ljava/nio/ByteBuffer;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La52/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()La52/d;
    .locals 3

    new-instance v0, La52/d;

    invoke-static {}, La52/d;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v2, "access$getFailurePayload$cp(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, La52/d;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public final b(Lfk0/d;)La52/d;
    .locals 3

    const-string v0, "endPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lfk0/d;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lfk0/d;->w()[B

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    const/16 v1, 0x9

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    sget-object v2, Lwj0/b;->SUCCESS:Lwj0/b;

    invoke-virtual {v2}, Lwj0/b;->getByteValue()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    new-instance p1, La52/d;

    invoke-direct {p1, v1}, La52/d;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1
.end method
