.class public final Lug0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lug0/d;",
        "",
        "<init>",
        "()V",
        "Lzg0/g;",
        "event",
        "Lvg0/c;",
        "a",
        "(Lzg0/g;)Lvg0/c;",
        "bot_release"
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
.method public final a(Lzg0/g;)Lvg0/c;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzg0/g$g;

    if-eqz v0, :cond_0

    sget-object p1, Lvg0/c$b;->a:Lvg0/c$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lzg0/g$e;

    if-eqz v0, :cond_1

    new-instance v0, Lvg0/c$a;

    check-cast p1, Lzg0/g$e;

    invoke-virtual {p1}, Lzg0/g$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvg0/c$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
