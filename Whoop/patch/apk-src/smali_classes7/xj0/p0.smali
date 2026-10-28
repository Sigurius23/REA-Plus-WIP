.class public final Lxj0/p0;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lxj0/p0;",
        "Lxj0/b;",
        "",
        "enabled",
        "<init>",
        "(Z)V",
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
.method public constructor <init>(Z)V
    .locals 6

    sget-object v1, Llt0/e;->SEND_R10_R11_REALTIME:Llt0/e;

    if-eqz p1, :cond_0

    invoke-static {}, Lxj0/q0;->b()Ljava/nio/ByteBuffer;

    move-result-object p1

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    invoke-static {}, Lxj0/q0;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
