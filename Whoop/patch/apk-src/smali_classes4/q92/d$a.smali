.class final Lq92/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq92/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lq92/d$a;",
        "",
        "<init>",
        "()V",
        "Lq92/d;",
        "whoopStrapCommandCallback",
        "Lzj0/h;",
        "commandResponsePacket",
        "Loh3/d;",
        "log",
        "Ll83/a0;",
        "a",
        "(Lq92/d;Lzj0/h;Loh3/d;)V",
        "",
        "Lnk0/a$a;",
        "sequencedPacketRunnables",
        "[Lnk0/a$a;",
        "core_release"
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
    invoke-direct {p0}, Lq92/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq92/d;Lzj0/h;Loh3/d;)V
    .locals 3

    const-string v0, "whoopStrapCommandCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandResponsePacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lzj0/h;->T()B

    move-result p3

    and-int/lit16 p3, p3, 0xff

    invoke-static {}, Lq92/d;->v()[Lnk0/a$a;

    move-result-object v0

    aget-object v0, v0, p3

    if-eqz v0, :cond_0

    invoke-static {}, Lq92/d;->v()[Lnk0/a$a;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v2, v1, p3

    invoke-virtual {v0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object p3

    instance-of p3, p3, Lxj0/b;

    if-eqz p3, :cond_0

    invoke-virtual {v0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.CommandPacket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lxj0/b;

    const/4 v0, 0x1

    invoke-static {p3, v2, v0, v2}, Lvk0/g;->B(Lvk0/g;Lst0/v;ILjava/lang/Object;)Llt0/a;

    move-result-object p3

    invoke-virtual {p2}, Lzj0/h;->Q()Llt0/e;

    move-result-object v0

    if-ne p3, v0, :cond_0

    invoke-static {}, Lq92/d;->u()Llk0/a$a;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Llk0/a$a;->a(Llk0/a;Lzj0/h;)V

    :cond_0
    return-void
.end method
