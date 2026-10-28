.class public abstract Lzg0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a+\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a\u001f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "Lzg0/e;",
        "sections",
        "",
        "isLatestTurnComplete",
        "",
        "",
        "a",
        "(Ljava/util/List;Z)Ljava/util/Set;",
        "c",
        "Lec3/l;",
        "Lzg0/i;",
        "b",
        "(Lec3/l;)Lec3/l;",
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
.method public static final a(Ljava/util/List;Z)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzg0/e;",
            ">;Z)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg0/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lzg0/e;

    invoke-virtual {v3}, Lzg0/e;->f()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v4

    sget-object v5, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz p1, :cond_1

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg0/e;

    invoke-virtual {v0}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object p0
.end method

.method public static final b(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzg0/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzg0/l$a;-><init>(Lec3/l;Lq83/d;)V

    new-instance p0, Lec3/s1;

    invoke-direct {p0, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p0
.end method

.method public static final c(Ljava/util/List;Z)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzg0/e;",
            ">;Z)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg0/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lzg0/e;

    invoke-virtual {v3}, Lzg0/e;->c()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzg0/d;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lzg0/d;->e()Lnl0/b;

    move-result-object v5

    sget-object v6, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, Lzg0/d;->c()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v5

    sget-object v6, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v5, v6, :cond_2

    invoke-virtual {v4}, Lzg0/d;->c()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v4

    sget-object v5, Lcom/whoop/bot/models/conversation/AiMessageStatus;->STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v4, v5, :cond_1

    :cond_2
    invoke-virtual {v3}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p1, :cond_1

    :cond_3
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg0/e;

    invoke-virtual {v0}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    return-object p0
.end method
