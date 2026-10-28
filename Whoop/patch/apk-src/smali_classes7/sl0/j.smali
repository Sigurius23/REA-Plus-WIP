.class public abstract Lsl0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a)\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a9\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000b2 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "",
        "Lm91/u;",
        "items",
        "",
        "c",
        "(Ljava/util/List;)Ljava/lang/String;",
        "content",
        "b",
        "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;",
        "Lnl0/f;",
        "viewState",
        "Lsl0/w2;",
        "g",
        "(Lnl0/f;)Lsl0/w2;",
        "",
        "hasContentPrefetched",
        "f",
        "(Lnl0/f;Z)Lsl0/w2;",
        "result",
        "Lkotlin/Function3;",
        "Ll83/a0;",
        "onContentLoaded",
        "e",
        "(Lsl0/w2;Lkotlin/jvm/functions/Function3;)V",
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
.method public static synthetic a(Loh0/c;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lsl0/j;->d(Loh0/c;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-static {p1}, Lsl0/j;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, ""

    return-object p0
.end method

.method private static final c(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Loh0/c;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v4, Lsc2/n;

    const/16 p0, 0xb

    invoke-direct {v4, p0}, Lsc2/n;-><init>(I)V

    const/16 v5, 0x1e

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Loh0/c;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Loh0/c;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lsl0/w2;Lkotlin/jvm/functions/Function3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/w2;",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsl0/w2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lsl0/w2;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lsl0/w2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsl0/w2;->d()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, v0, v1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final f(Lnl0/f;Z)Lsl0/w2;
    .locals 8

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance v1, Lsl0/w2;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-string v3, ""

    const-string v4, ""

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lsl0/w2;-><init>(ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lnl0/f;->c()Lnl0/a;

    move-result-object p0

    invoke-virtual {p0}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lnl0/c;

    invoke-virtual {v0}, Lnl0/c;->g()Lnl0/b;

    move-result-object v0

    sget-object v1, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lnl0/c;

    const-string p0, ""

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lsl0/j;->b(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v0

    goto :goto_2

    :cond_4
    :goto_1
    move-object v3, p0

    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, p1

    goto :goto_4

    :cond_6
    :goto_3
    move-object v4, p0

    :goto_4
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_7

    const/4 p0, 0x1

    :goto_5
    move v2, p0

    goto :goto_6

    :cond_7
    const/4 p0, 0x0

    goto :goto_5

    :goto_6
    new-instance v1, Lsl0/w2;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lsl0/w2;-><init>(ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final g(Lnl0/f;)Lsl0/w2;
    .locals 9

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnl0/f;->c()Lnl0/a;

    move-result-object p0

    invoke-virtual {p0}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lnl0/c;

    invoke-virtual {v1}, Lnl0/c;->g()Lnl0/b;

    move-result-object v2

    sget-object v3, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lsl0/j;->b(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lnl0/c;

    const-string p0, ""

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lsl0/j;->b(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    move-object v1, p0

    :cond_3
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v5, v0

    goto :goto_2

    :cond_5
    :goto_1
    move-object v5, p0

    :goto_2
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    const/4 v0, 0x1

    :goto_3
    move v3, v0

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    if-eqz v3, :cond_7

    move-object v4, v1

    goto :goto_5

    :cond_7
    move-object v4, p0

    :goto_5
    new-instance v2, Lsl0/w2;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lsl0/w2;-><init>(ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
