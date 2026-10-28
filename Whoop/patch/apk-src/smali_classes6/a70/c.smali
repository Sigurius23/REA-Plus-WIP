.class public final La70/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "La70/c;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljb1/a;Ltr2/n;)V",
        "Ly60/b;",
        "domainResult",
        "Lb70/e;",
        "a",
        "(Ly60/b;)Lb70/e;",
        "Ljb1/a;",
        "b",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Ljb1/a;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Ljb1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La70/c;->a:Ljb1/a;

    .line 3
    iput-object p2, p0, La70/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    const/4 p4, 0x1

    .line 4
    invoke-static {p1, p4, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "DayZeroSplashViewStateReducer"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, La70/c;-><init>(Ljb1/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ly60/b;)Lb70/e;
    .locals 12

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly60/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lb70/e;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lb70/e;-><init>(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    iget-object v0, p0, La70/c;->a:Ljb1/a;

    invoke-virtual {p1}, Ly60/b;->a()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->getItems()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    sget-object v3, Lm83/y;->w:Lm83/y;

    if-nez v1, :cond_2

    move-object v1, v3

    :cond_2
    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, La70/c;->a:Ljb1/a;

    invoke-virtual {p1}, Ly60/b;->a()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->getFooter()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v1

    :goto_2
    invoke-virtual {v0, v3}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, La70/c;->b:Ltr2/n;

    invoke-virtual {p1}, Ly60/b;->b()Z

    move-result v1

    invoke-virtual {p1}, Ly60/b;->a()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_3

    :cond_5
    move p1, v2

    :goto_3
    const-string v3, ", hasPayload="

    const-string v4, ")"

    const-string v5, "Dismissing Day-0 splash, nothing to render (isError="

    invoke-static {v5, v3, v4, v1, p1}, Lr;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lb70/e;

    const/16 v8, 0x16

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lb70/e;-><init>(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_6
    new-instance v4, Lb70/e;

    invoke-virtual {p1}, Ly60/b;->a()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v2

    :cond_7
    move-object v9, v2

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v11}, Lb70/e;-><init>(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
