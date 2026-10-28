.class public final La52/f;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La52/f;",
        "Lxj0/b;",
        "<init>",
        "()V",
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
.method public constructor <init>()V
    .locals 3

    sget-object v0, Llt0/l;->PUFFIN_PROCESS_FW:Llt0/l;

    invoke-static {}, La52/h;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Lst0/v;->PUFFIN:Lst0/v;

    invoke-direct {p0, v0, v1, v2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method
