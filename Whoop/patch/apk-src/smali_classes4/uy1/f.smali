.class public final Luy1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Luy1/f;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Luy1/b;",
        "domainState",
        "Lvy1/d;",
        "a",
        "(Luy1/b;)Lvy1/d;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "mfa_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luy1/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Luy1/b;)Lvy1/d;
    .locals 36

    const-string v0, "domainState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Luy1/b;->i()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lvy1/d$a;->a:Lvy1/d$a;

    return-object v0

    :cond_0
    invoke-virtual {v1}, Luy1/b;->g()Luy1/g;

    move-result-object v0

    sget-object v2, Luy1/g;->EMAIL:Luy1/g;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_1

    move v0, v4

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-virtual {v1}, Luy1/b;->h()Luy1/h;

    move-result-object v2

    sget-object v5, Luy1/h;->CMS_ACCESS:Luy1/h;

    if-ne v2, v5, :cond_2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    iget-object v5, v2, Luy1/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v6, "mobile-mfa-disable-turn-off-mfa"

    invoke-interface {v5, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_1
    move v3, v4

    :cond_3
    new-instance v5, Lvy1/d$b;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    if-eqz v0, :cond_4

    invoke-virtual {v6}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/a;->i()I

    move-result v6

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/k0;->W()I

    move-result v6

    :goto_2
    if-eqz v0, :cond_5

    sget v0, Lpy1/d;->v:I

    :goto_3
    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    move-object v7, v0

    goto :goto_4

    :cond_5
    sget v0, Lpy1/d;->w:I

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Luy1/b;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Luy1/b;->e()Z

    move-result v10

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Luy1/b;->c()Z

    move-result v4

    :cond_6
    move v11, v4

    sget v12, Lpy1/d;->N:I

    invoke-virtual {v1}, Luy1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v13, Lc41/p2;

    sget-object v14, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    sget v0, Lpy1/d;->u:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v18

    sget-object v0, Luy1/f$a;->w:Luy1/f$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v20

    sget-object v0, Luy1/f$b;->w:Luy1/f$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v22

    const v34, 0xffeae

    const/16 v35, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v13 .. v35}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_7
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v1}, Luy1/b;->g()Luy1/g;

    move-result-object v14

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v16}, Lvy1/d$b;-><init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;IZZILc41/p2;Luy1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
