.class public abstract Lc52/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc52/b$a;,
        Lc52/b$b;,
        Lc52/b$c;,
        Lc52/b$d;,
        Lc52/b$e;,
        Lc52/b$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0007\u0008\t\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lc52/b;",
        "",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "c",
        "b",
        "a",
        "d",
        "e",
        "f",
        "Lc52/b$a;",
        "Lc52/b$b;",
        "Lc52/b$c;",
        "Lc52/b$d;",
        "Lc52/b$e;",
        "Lc52/b$f;",
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
    invoke-direct {p0}, Lc52/b;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lc52/b$c;->a:Lc52/b$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "BP.Disconnected"

    return-object v0

    :cond_0
    sget-object v0, Lc52/b$b;->a:Lc52/b$b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "BP.Connecting"

    return-object v0

    :cond_1
    sget-object v0, Lc52/b$a;->a:Lc52/b$a;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "BP.Connected"

    return-object v0

    :cond_2
    sget-object v0, Lc52/b$d;->a:Lc52/b$d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "BP.DiscoveringServices"

    return-object v0

    :cond_3
    sget-object v0, Lc52/b$e;->a:Lc52/b$e;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "BP.ExchangingHello"

    return-object v0

    :cond_4
    sget-object v0, Lc52/b$f;->a:Lc52/b$f;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "BP.Ready"

    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
