.class public abstract Lqt1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lqt1/c;",
        "a",
        "(B)Lqt1/c;",
        "labrador_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(B)Lqt1/c;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lqt1/c$b;->a:Lqt1/c$b;

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    sget-object p0, Lqt1/c$a;->a:Lqt1/c$a;

    return-object p0

    :cond_1
    sget-object p0, Lqt1/c$c;->a:Lqt1/c$c;

    return-object p0
.end method
