.class public final Lvg0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvg0/c;",
        "Lvg0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ*\u0010\u000f\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lvg0/d;",
        "Lod1/g;",
        "Lvg0/c;",
        "Lvg0/e;",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lrg0/b;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;Lrg0/b;)V",
        "Lec3/m;",
        "action",
        "accumulator",
        "j",
        "(Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;",
        "h",
        "(Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;",
        "Lvg0/c$a;",
        "g",
        "(Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;",
        "response",
        "",
        "Lvg0/f;",
        "i",
        "(Lcom/whoop/ai/chat/models/AiChatHistoryResponse;)Ljava/util/List;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lrg0/b;",
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


# instance fields
.field private final a:Lcom/whoop/ai/chat/api/AiChatApi;

.field private final b:Ltr2/n;

.field private final c:Lrg0/b;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;Lrg0/b;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg0/d;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    iput-object p2, p0, Lvg0/d;->b:Ltr2/n;

    iput-object p3, p0, Lvg0/d;->c:Lrg0/b;

    return-void
.end method

.method public static final synthetic c(Lvg0/d;)Lcom/whoop/ai/chat/api/AiChatApi;
    .locals 0

    iget-object p0, p0, Lvg0/d;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    return-object p0
.end method

.method public static final synthetic d(Lvg0/d;Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvg0/d;->g(Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvg0/d;Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvg0/d;->h(Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lvg0/d;Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lvg0/d;->j(Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/e;",
            "Lvg0/c$a;",
            "Lq83/d<",
            "-",
            "Lvg0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lvg0/d$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lvg0/d$a;

    iget v1, v0, Lvg0/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg0/d$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lvg0/d$a;

    invoke-direct {v0, p0, p3}, Lvg0/d$a;-><init>(Lvg0/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lvg0/d$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lvg0/d$a;->E:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v10, :cond_2

    iget-object p1, v6, Lvg0/d$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lvg0/c$a;

    iget-object p1, v6, Lvg0/d$a;->w:Ljava/lang/Object;

    check-cast p1, Lvg0/e;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvg0/d;->b:Ltr2/n;

    new-instance v5, Lvg0/d$b;

    invoke-direct {v5, p0, p2, v9}, Lvg0/d$b;-><init>(Lvg0/d;Lvg0/c$a;Lq83/d;)V

    iput-object p1, v6, Lvg0/d$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lvg0/d$a;->x:Ljava/lang/Object;

    iput v10, v6, Lvg0/d$a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_1

    return-object v0

    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_a

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    if-eqz p1, :cond_9

    invoke-virtual {v1}, Lvg0/e;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg0/f;

    invoke-virtual {v0}, Lvg0/f;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/ai/chat/models/AIConversationMetadata;

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lvg0/c$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-static {v0, v9, v3, v10, v9}, Lvg0/f;->b(Lvg0/f;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lvg0/f;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lvg0/f;

    invoke-virtual {p3}, Lvg0/f;->c()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_7

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvg0/e;->b(Lvg0/e;ZZLjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lvg0/e;

    move-result-object p1

    return-object p1

    :cond_9
    return-object v1

    :cond_a
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lvg0/d;->c:Lrg0/b;

    check-cast p3, Lu02/a$b;

    const-string p2, "delete_conversation"

    invoke-virtual {p1, p3, p2}, Lrg0/b;->b(Lu02/a$b;Ljava/lang/String;)V

    return-object v1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lvg0/e;",
            "Lq83/d<",
            "-",
            "Lvg0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lvg0/d$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvg0/d$c;

    iget v3, v2, Lvg0/d$c;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvg0/d$c;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lvg0/d$c;

    invoke-direct {v2, v0, v1}, Lvg0/d$c;-><init>(Lvg0/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lvg0/d$c;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lvg0/d$c;->E:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lvg0/d$c;->x:Ljava/lang/Object;

    check-cast v2, Lvg0/e;

    iget-object v3, v8, Lvg0/d$c;->w:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lvg0/d$c;->x:Ljava/lang/Object;

    check-cast v3, Lvg0/e;

    iget-object v5, v8, Lvg0/d$c;->w:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v3

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v9 .. v15}, Lvg0/e;->b(Lvg0/e;ZZLjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lvg0/e;

    move-result-object v1

    iput-object v6, v8, Lvg0/d$c;->w:Ljava/lang/Object;

    iput-object v9, v8, Lvg0/d$c;->x:Ljava/lang/Object;

    iput v5, v8, Lvg0/d$c;->E:I

    move-object/from16 v3, p1

    invoke-interface {v3, v1, v8}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v9

    :goto_2
    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lvg0/d;->b:Ltr2/n;

    new-instance v7, Lvg0/d$d;

    invoke-direct {v7, v0, v6}, Lvg0/d$d;-><init>(Lvg0/d;Lq83/d;)V

    iput-object v6, v8, Lvg0/d$c;->w:Ljava/lang/Object;

    iput-object v1, v8, Lvg0/d$c;->x:Ljava/lang/Object;

    iput v4, v8, Lvg0/d$c;->E:I

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    move-object v2, v1

    move-object v1, v3

    :goto_4
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$b;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lvg0/d;->c:Lrg0/b;

    check-cast v1, Lu02/a$b;

    const-string v4, "get_conversations"

    invoke-virtual {v3, v1, v4}, Lrg0/b;->b(Lu02/a$b;Ljava/lang/String;)V

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lvg0/e;->b(Lvg0/e;ZZLjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lvg0/e;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_8

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/v0;

    iget-object v1, v1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ai/chat/models/AiChatHistoryResponse;

    if-eqz v1, :cond_7

    invoke-direct {v0, v1}, Lvg0/d;->i(Lcom/whoop/ai/chat/models/AiChatHistoryResponse;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AiChatHistoryResponse;->getNextToken()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v4, v3, v1}, Lvg0/e;->a(ZZLjava/util/List;Ljava/lang/String;)Lvg0/e;

    move-result-object v1

    return-object v1

    :cond_7
    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lvg0/e;->b(Lvg0/e;ZZLjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lvg0/e;

    move-result-object v1

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final i(Lcom/whoop/ai/chat/models/AiChatHistoryResponse;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;",
            ")",
            "Ljava/util/List<",
            "Lvg0/f;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/ai/chat/models/AiChatHistoryResponse;->getConversations()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/ai/chat/models/AiConversationHistorySection;

    new-instance v2, Lvg0/f;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AiConversationHistorySection;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AiConversationHistorySection;->getConversationMetadataList()Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lvg0/f;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final j(Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lvg0/c;",
            "Lvg0/e;",
            "Lq83/d<",
            "-",
            "Lvg0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvg0/c$a;

    if-eqz v0, :cond_0

    check-cast p2, Lvg0/c$a;

    invoke-direct {p0, p3, p2, p4}, Lvg0/d;->g(Lvg0/e;Lvg0/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lvg0/c$b;->a:Lvg0/c$b;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1, p3, p4}, Lvg0/d;->h(Lec3/m;Lvg0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvg0/d$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lvg0/d$e;-><init>(Lec3/l;Lvg0/d;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
