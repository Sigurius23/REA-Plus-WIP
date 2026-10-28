.class public final Lby0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lby0/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Ltr2/n;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "source",
        "Lm91/u;",
        "itemViewState",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V",
        "a",
        "(Lm91/u;)Lcom/whoop/navigation/e;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "d",
        "(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;Lm91/u;)Lcom/whoop/navigation/NavigationScreenModel;",
        "Lcy0/a$g;",
        "event",
        "c",
        "(Lcy0/a$g;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "Ltr2/n;",
        "deep-dive_release"
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

.field private final b:Leb/a0;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lby0/c;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lby0/c;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lby0/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "DeepDiveNavigationRouter"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lby0/c;-><init>(Lj02/o0;Leb/a0;Ltr2/n;)V

    return-void
.end method

.method private final a(Lm91/u;)Lcom/whoop/navigation/e;
    .locals 3

    instance-of v0, p1, Ls01/d;

    if-eqz v0, :cond_1

    check-cast p1, Ls01/d;

    invoke-virtual {p1}, Ls01/d;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object v0, p0, Lby0/c;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "WhoopCoachVow tapped without a destination"

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V
    .locals 8

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lby0/c;->a:Lj02/o0;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Lby0/c;->d(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;Lm91/u;)Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method

.method private final d(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;Lm91/u;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    instance-of v2, v0, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v2, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/whoop/navigation/CoachScreenModel;

    invoke-static/range {p2 .. p2}, Lxx0/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v18, 0x3ffe

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v19}, Lcom/whoop/navigation/CoachScreenModel;->copy$default(Lcom/whoop/navigation/CoachScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/navigation/CoachScreenModel;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v2, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v2, :cond_1

    move-object v3, v0

    check-cast v3, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-static/range {p2 .. p2}, Lxx0/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v19, 0x7ffb

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v3 .. v20}, Lcom/whoop/navigation/AiCoachChatScreenModel;->copy$default(Lcom/whoop/navigation/AiCoachChatScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZILjava/lang/Object;)Lcom/whoop/navigation/AiCoachChatScreenModel;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v2, v0, Lcom/whoop/navigation/FeatureEducationModel;

    if-eqz v2, :cond_2

    move-object v3, v0

    check-cast v3, Lcom/whoop/navigation/FeatureEducationModel;

    invoke-static/range {p2 .. p2}, Lxx0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p2 .. p2}, Lxx0/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lcom/whoop/navigation/FeatureEducationModel;->copy$default(Lcom/whoop/navigation/FeatureEducationModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/FeatureEducationModel;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v2, v0, Lcom/whoop/navigation/TrendsScreenModel;

    if-eqz v2, :cond_6

    instance-of v2, v1, Lkm2/g;

    if-eqz v2, :cond_3

    move-object v3, v0

    check-cast v3, Lcom/whoop/navigation/TrendsScreenModel;

    invoke-static/range {p2 .. p2}, Lxx0/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x37

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/whoop/navigation/TrendsScreenModel;->copy$default(Lcom/whoop/navigation/TrendsScreenModel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/TrendsScreenModel;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v2, v1, Lc41/i1;

    if-nez v2, :cond_5

    instance-of v1, v1, Lj81/i;

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    check-cast v0, Lcom/whoop/navigation/TrendsScreenModel;

    return-object v0

    :cond_5
    :goto_0
    move-object v1, v0

    check-cast v1, Lcom/whoop/navigation/TrendsScreenModel;

    invoke-static/range {p2 .. p2}, Lxx0/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/navigation/TrendsScreenModel;->copy$default(Lcom/whoop/navigation/TrendsScreenModel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/TrendsScreenModel;

    move-result-object v0

    :cond_6
    return-object v0
.end method


# virtual methods
.method public final c(Lcy0/a$g;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcy0/a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lcy0/a$c;

    invoke-virtual {p1}, Lcy0/a$c;->b()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lcy0/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$c;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lby0/c;->b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcy0/a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcy0/a$b;

    invoke-virtual {p1}, Lcy0/a$b;->a()Lm91/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lby0/c;->a(Lm91/u;)Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lcy0/a$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lby0/c;->b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    return-void

    :cond_1
    instance-of p1, p1, Lcy0/a$e;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lby0/c;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
