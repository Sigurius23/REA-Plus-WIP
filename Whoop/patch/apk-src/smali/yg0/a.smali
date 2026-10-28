.class public final Lyg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lyg0/a;",
        "",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Lj02/o0;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "b",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;",
        "Lyg0/b;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lyg0/b;)V",
        "Lj02/o0;",
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
.field private final a:Lj02/o0;


# direct methods
.method public constructor <init>(Lj02/o0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyg0/a;->a:Lj02/o0;

    return-void
.end method

.method private final b(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 7

    instance-of v0, p1, Lcom/whoop/navigation/IntegrationsScreenModel;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/whoop/navigation/IntegrationsScreenModel;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v3, "COACH"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/IntegrationsScreenModel;->copy$default(Lcom/whoop/navigation/IntegrationsScreenModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/IntegrationsScreenModel;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final a(Lyg0/b;)V
    .locals 14

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lyg0/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lyg0/b$a;

    invoke-virtual {p1}, Lyg0/b$a;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    iget-object p1, p0, Lyg0/a;->a:Lj02/o0;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-direct {p0, v1}, Lyg0/a;->b(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v2

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lyg0/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lyg0/b$c;

    invoke-virtual {p1}, Lyg0/b$c;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "WHOOP_COACH_RELEASE_NOTES"

    :cond_1
    iget-object v0, p0, Lyg0/a;->a:Lj02/o0;

    new-instance v1, Lj02/m0$v1;

    const-string v2, "AI Coach"

    invoke-direct {v1, p1, v2}, Lj02/m0$v1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lyg0/b$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lyg0/a;->a:Lj02/o0;

    new-instance v1, Lj02/m0$m1;

    new-instance v2, Lcom/whoop/navigation/models/ApiRequest;

    check-cast p1, Lyg0/b$d;

    invoke-virtual {p1}, Lyg0/b$d;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    instance-of v0, p1, Lyg0/b$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lyg0/a;->a:Lj02/o0;

    new-instance v1, Lj02/m0$m1;

    new-instance v2, Lcom/whoop/navigation/models/ApiRequest;

    check-cast p1, Lyg0/b$b;

    invoke-virtual {p1}, Lyg0/b$b;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
