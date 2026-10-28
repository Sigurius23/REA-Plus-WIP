.class public final Lro1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lro1/i;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "composeNavController",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lor2/y;",
        "externalLinkNavigator",
        "<init>",
        "(Landroidx/fragment/app/m0;Lj02/o0;Leb/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;)V",
        "event",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Object;)V",
        "Landroidx/fragment/app/m0;",
        "b",
        "Lj02/o0;",
        "c",
        "Leb/a0;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "e",
        "Lor2/y;",
        "hormonal-insights_release"
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
.field private final a:Landroidx/fragment/app/m0;

.field private final b:Lj02/o0;

.field private final c:Leb/a0;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final e:Lor2/y;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lj02/o0;Leb/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeNavController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lro1/i;->b:Lj02/o0;

    iput-object p3, p0, Lro1/i;->c:Leb/a0;

    iput-object p4, p0, Lro1/i;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p5, p0, Lro1/i;->e:Lor2/y;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lro1/g$a;->a:Lro1/g$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lro1/i;->c:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lro1/g$c;->a:Lro1/g$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p1

    invoke-virtual {p1}, Lor2/s;->i()Z

    return-void

    :cond_1
    instance-of v0, p1, Lro1/g$b;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "uri"

    if-eqz v0, :cond_6

    check-cast p1, Lro1/g$b;

    invoke-virtual {p1}, Lro1/g$b;->a()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->VIEW_ALL:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    if-ne v0, v4, :cond_5

    iget-object v0, p0, Lro1/i;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "mx-content-search-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lro1/i;->b:Lj02/o0;

    new-instance v1, Lj02/m0$s0;

    invoke-virtual {p1}, Lro1/g$b;->b()Lcom/whoop/util/TrendKey;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/util/TrendKey;->getTrendName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj02/m0$s0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    move-object v0, v2

    iget-object v2, p0, Lro1/i;->e:Lor2/y;

    iget-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v3

    const-string p1, "requireActivity(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_4

    sget v1, Lnf1/g;->c:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move-object v4, p1

    goto :goto_1

    :cond_4
    :goto_0
    move-object v4, v0

    :goto_1
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_5
    instance-of v0, v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lro1/g$b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v2, "%26"

    const/4 v4, 0x0

    const-string v5, "&"

    invoke-static {v0, v5, v2, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lro1/g$b;->b()Lcom/whoop/util/TrendKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/util/TrendKey;->getTrendName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lro1/g$b;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lro1/g$b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v5, "&entryPoint="

    const-string v6, "&eventName=Education Tile&contentType="

    const-string v7, "android-app://com.whoop/education?path="

    invoke-static {v7, v0, v5, v2, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&articleId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/k0;

    invoke-direct {v0, p1, v1, v1}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_6
    move-object v0, v2

    instance-of v2, p1, Lro1/g$g;

    if-eqz v2, :cond_8

    check-cast p1, Lro1/g$g;

    invoke-virtual {p1}, Lro1/g$g;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    move-object v2, v0

    :cond_7
    new-instance v0, Ll83/k;

    const-string v4, "date"

    invoke-direct {v0, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lro1/g$g;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v4, "source"

    invoke-direct {v2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "logCalendar"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/k0;

    invoke-direct {v0, p1, v1, v1}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_8
    instance-of v2, p1, Lro1/g$e;

    if-eqz v2, :cond_9

    iget-object v0, p0, Lro1/i;->b:Lj02/o0;

    check-cast p1, Lro1/g$e;

    invoke-virtual {p1}, Lro1/g$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_9
    sget-object v2, Lro1/g$h;->a:Lro1/g$h;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string p1, "android-app://com.whoop/hormonalSettingsFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v3, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_a
    sget-object v2, Lro1/g$d;->a:Lro1/g$d;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const-string p1, "android-app://com.whoop/mciCycles"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v3, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lro1/i;->a:Landroidx/fragment/app/m0;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_b
    instance-of v2, p1, Lro1/g$f;

    if-eqz v2, :cond_e

    check-cast p1, Lro1/g$f;

    invoke-virtual {p1}, Lro1/g$f;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    move-object p1, v1

    :goto_2
    if-nez p1, :cond_d

    move-object v2, v0

    goto :goto_3

    :cond_d
    move-object v2, p1

    :goto_3
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "SYMPTOMS?analyticsSource="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lro1/i;->c:Leb/a0;

    const/4 v2, 0x6

    invoke-static {v0, p1, v1, v2}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    :cond_e
    return-void
.end method
