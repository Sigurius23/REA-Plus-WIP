.class public final Lok0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkt0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lok0/a;",
        "Lkt0/b;",
        "<init>",
        "()V",
        "Lxj0/b;",
        "a",
        "()Lxj0/b;",
        "Lzj0/h;",
        "response",
        "Lkt0/a;",
        "c",
        "(Lzj0/h;)Lkt0/a;",
        "Ljava/time/Clock;",
        "clock",
        "b",
        "(Ljava/time/Clock;)Lxj0/b;",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lxj0/b;
    .locals 1

    new-instance v0, Lxj0/o;

    invoke-direct {v0}, Lxj0/o;-><init>()V

    return-object v0
.end method

.method public b(Ljava/time/Clock;)Lxj0/b;
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lst0/v;->GEN_4:Lst0/v;

    invoke-static {p1, v0}, Lok0/c;->a(Ljava/time/Clock;Lst0/v;)Lxj0/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lzj0/h;)Lkt0/a;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lok0/c;->b(Lzj0/h;)Lkt0/a;

    move-result-object p1

    return-object p1
.end method
