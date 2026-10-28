.class public final Lxj0/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxj0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/u0$a;",
        "",
        "<init>",
        "()V",
        "Lfk2/a;",
        "timeStamp",
        "Ljava/nio/ByteBuffer;",
        "b",
        "(Lfk2/a;)Ljava/nio/ByteBuffer;",
        "",
        "SET_ALARM_PACKET_REV",
        "I",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxj0/u0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lxj0/u0$a;Lfk2/a;)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-direct {p0, p1}, Lxj0/u0$a;->b(Lfk2/a;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lfk2/a;)Ljava/nio/ByteBuffer;
    .locals 5

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "order(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    sget-object v1, Luk0/b;->a:Luk0/b;

    invoke-virtual {p1}, Lfk2/a;->f()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Luk0/b;->c(J)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lfk2/a;->e()J

    move-result-wide v2

    long-to-int p1, v2

    int-to-short p1, p1

    invoke-virtual {v1, p1}, Luk0/b;->e(S)I

    move-result p1

    int-to-short p1, p1

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-object v0
.end method
