.class public final Lah0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lah0/j;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/ai/chat/domain/formwidget/b;",
        "Lah0/i;",
        "b",
        "(Lcom/whoop/ai/chat/domain/formwidget/b;)Lah0/i;",
        "Lcom/whoop/ai/chat/domain/formwidget/d;",
        "domainState",
        "a",
        "(Lcom/whoop/ai/chat/domain/formwidget/d;)Lah0/i;",
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

.method private final b(Lcom/whoop/ai/chat/domain/formwidget/b;)Lah0/i;
    .locals 10

    instance-of v0, p1, Lcom/whoop/ai/chat/domain/formwidget/b$a;

    if-eqz v0, :cond_0

    new-instance v1, Lah0/i;

    new-instance v2, Lah0/i$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lah0/i$a;-><init>(Le31/c;Lah0/g;Lah0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lah0/i;-><init>(Lah0/i$a;Lm91/u;ZZLcom/whoop/ai/chat/domain/formwidget/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcom/whoop/ai/chat/domain/formwidget/b$b;

    if-eqz v0, :cond_1

    new-instance v1, Lah0/i;

    new-instance v2, Lah0/i$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->b()Le31/c;

    move-result-object v3

    sget-object v5, Lah0/e;->NETWORK:Lah0/e;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lah0/i$a;-><init>(Le31/c;Lah0/g;Lah0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lah0/i;-><init>(Lah0/i$a;Lm91/u;ZZLcom/whoop/ai/chat/domain/formwidget/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lcom/whoop/ai/chat/domain/formwidget/b$c;

    if-eqz v0, :cond_2

    new-instance v1, Lah0/i;

    new-instance v2, Lah0/i$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->c()Le31/c;

    move-result-object v0

    new-instance v3, Lah0/g$e;

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/b$c;

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/b$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Lah0/g$e;-><init>(Ljava/lang/String;)V

    sget-object p1, Lah0/e;->SERVER:Lah0/e;

    invoke-direct {v2, v0, v3, p1}, Lah0/i$a;-><init>(Le31/c;Lah0/g;Lah0/e;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lah0/i;-><init>(Lah0/i$a;Lm91/u;ZZLcom/whoop/ai/chat/domain/formwidget/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Lcom/whoop/ai/chat/domain/formwidget/d;)Lah0/i;
    .locals 9

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->c()Lcom/whoop/ai/chat/domain/formwidget/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->c()Lcom/whoop/ai/chat/domain/formwidget/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lah0/j;->b(Lcom/whoop/ai/chat/domain/formwidget/b;)Lah0/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lah0/i;

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->i()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->g()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lah0/d;->a(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;)Lah0/c;

    move-result-object v3

    :cond_2
    move-object v2, v3

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->h()Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object v1

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$d;->a:Lcom/whoop/ai/chat/domain/formwidget/j$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->h()Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object v1

    sget-object v4, Lcom/whoop/ai/chat/domain/formwidget/j$a;->a:Lcom/whoop/ai/chat/domain/formwidget/j$a;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->f()Lcom/whoop/ai/chat/domain/formwidget/i;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->e()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v8}, Lah0/i;-><init>(Lah0/i$a;Lm91/u;ZZLcom/whoop/ai/chat/domain/formwidget/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
