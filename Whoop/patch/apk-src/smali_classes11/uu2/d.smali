.class public abstract Luu2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Luu2/c;",
        "Luu2/p;",
        "a",
        "(Luu2/c;)Luu2/p;",
        "weightlifting_release"
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
.method public static final a(Luu2/c;)Luu2/p;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Luu2/c$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Luu2/p$d;

    check-cast p0, Luu2/c$d;

    invoke-virtual {p0}, Luu2/c$d;->a()Ljava/lang/String;

    move-result-object p0

    sget-object v2, Lcu2/b;->INTERNAL:Lcu2/b;

    invoke-direct {v0, p0, v2, v1}, Luu2/p$d;-><init>(Ljava/lang/String;Lcu2/b;Ljava/lang/String;)V

    return-object v0

    :cond_0
    sget-object v0, Luu2/c$c;->a:Luu2/c$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Luu2/p$c;->a:Luu2/p$c;

    return-object p0

    :cond_1
    return-object v1
.end method
