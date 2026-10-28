.class public abstract Lch0/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lzg0/i;",
        "Lch0/v;",
        "a",
        "(Lzg0/i;)Lch0/v;",
        "bot_release"
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
.method public static final a(Lzg0/i;)Lch0/v;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzg0/i;->f()Lzg0/f;

    move-result-object p0

    invoke-virtual {p0}, Lzg0/f;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lzg0/d;

    invoke-virtual {v2}, Lzg0/d;->e()Lnl0/b;

    move-result-object v3

    sget-object v4, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lzg0/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lzg0/d;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lzg0/d;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_3

    :goto_1
    return-object v1

    :cond_3
    new-instance p0, Lch0/v;

    invoke-virtual {v0}, Lzg0/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lzg0/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lch0/v;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
