.class public final Lel0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lel0/e;",
        "",
        "<init>",
        "()V",
        "Lnl0/d;",
        "event",
        "Lgl0/b;",
        "a",
        "(Lnl0/d;)Lgl0/b;",
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
.method public final a(Lnl0/d;)Lgl0/b;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnl0/d$g;->a:Lnl0/d$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lgl0/b$a;->a:Lgl0/b$a;

    return-object p1

    :cond_0
    sget-object v0, Lnl0/d$i;->a:Lnl0/d$i;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lgl0/b$a;->a:Lgl0/b$a;

    return-object p1

    :cond_1
    instance-of p1, p1, Lnl0/d$q;

    if-eqz p1, :cond_2

    sget-object p1, Lgl0/b$b;->a:Lgl0/b$b;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
