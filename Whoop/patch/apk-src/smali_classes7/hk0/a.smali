.class public final Lhk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxj0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lhk0/a;",
        "Lxj0/a;",
        "<init>",
        "()V",
        "Llt0/a;",
        "command",
        "Ljava/nio/ByteBuffer;",
        "commandPayload",
        "b",
        "(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;",
        "payload",
        "a",
        "(Ljava/nio/ByteBuffer;)Llt0/a;",
        "",
        "d",
        "(Ljava/nio/ByteBuffer;)B",
        "value",
        "Ll83/a0;",
        "c",
        "(Ljava/nio/ByteBuffer;B)V",
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


# static fields
.field public static final b:Lhk0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhk0/a;

    invoke-direct {v0}, Lhk0/a;-><init>()V

    sput-object v0, Lhk0/a;->b:Lhk0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)Llt0/a;
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    const/16 v1, 0x14

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Llt0/a$a;->b(B)Llt0/e;

    move-result-object p1

    return-object p1
.end method

.method public b(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 6

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Llt0/a;->getValue()I

    move-result p1

    if-ltz p1, :cond_0

    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_0

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x17

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    sget-object v4, Lhk0/o;->BLE_COMMAND_FRAMEWORK:Lhk0/o;

    invoke-virtual {v4}, Lhk0/o;->getValue()I

    move-result v4

    int-to-byte v4, v4

    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    sget-object v4, Lhk0/p;->BLE_COMMAND:Lhk0/p;

    invoke-virtual {v4}, Lhk0/p;->getValue()I

    move-result v4

    int-to-short v4, v4

    const/16 v5, 0x11

    invoke-virtual {v0, v5, v4}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    const/16 v4, 0x13

    invoke-virtual {v0, v4, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/16 v3, 0x14

    int-to-short p1, p1

    invoke-virtual {v0, v3, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0

    :cond_0
    const/16 p2, 0x10

    invoke-static {p2}, Lva3/d;->c(I)V

    invoke-static {p1, p2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "commandId must fit in uint16, got 0x"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c(Ljava/nio/ByteBuffer;B)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p2, p2, 0xff

    const/16 v0, 0x9

    invoke-virtual {p1, v0, p2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public d(Ljava/nio/ByteBuffer;)B
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-byte p1, p1

    return p1
.end method
