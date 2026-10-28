.class public final Lhk0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzj0/f0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lhk0/s;",
        "Lzj0/f0;",
        "<init>",
        "()V",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "Llt0/a;",
        "a",
        "(Ljava/nio/ByteBuffer;)Llt0/a;",
        "",
        "d",
        "(Ljava/nio/ByteBuffer;)B",
        "Lwj0/b;",
        "b",
        "(Ljava/nio/ByteBuffer;)Lwj0/b;",
        "",
        "c",
        "()I",
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
.field public static final b:Lhk0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhk0/s;

    invoke-direct {v0}, Lhk0/s;-><init>()V

    sput-object v0, Lhk0/s;->b:Lhk0/s;

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

.method public b(Ljava/nio/ByteBuffer;)Lwj0/b;
    .locals 3

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1b

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-byte p1, p1

    invoke-static {}, Lwj0/b;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lwj0/b;

    invoke-virtual {v2}, Lwj0/b;->getByteValue()B

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lwj0/b;

    if-nez v1, :cond_2

    sget-object p1, Lwj0/b;->FAILURE:Lwj0/b;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public c()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public d(Ljava/nio/ByteBuffer;)B
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x16

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-byte p1, p1

    return p1
.end method
