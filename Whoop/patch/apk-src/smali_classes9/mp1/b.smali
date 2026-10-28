.class public final Lmp1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmp1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0013B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lmp1/b;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lj02/o0;",
        "navigator",
        "Ljava/time/Clock;",
        "clock",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lad3/c;",
        "json",
        "<init>",
        "(Landroidx/fragment/app/m0;Lj02/o0;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;Lad3/c;)V",
        "Landroid/net/Uri;",
        "uri",
        "Ll83/a0;",
        "a",
        "(Landroid/net/Uri;)V",
        "event",
        "b",
        "(Ljava/lang/Object;)V",
        "Landroidx/fragment/app/m0;",
        "Lj02/o0;",
        "c",
        "Ljava/time/Clock;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "e",
        "Lor2/y;",
        "f",
        "Lad3/c;",
        "g",
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


# static fields
.field public static final g:Lmp1/b$a;

.field public static final h:I


# instance fields
.field private final a:Landroidx/fragment/app/m0;

.field private final b:Lj02/o0;

.field private final c:Ljava/time/Clock;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final e:Lor2/y;

.field private final f:Lad3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmp1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmp1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmp1/b;->g:Lmp1/b$a;

    const/16 v0, 0x8

    sput v0, Lmp1/b;->h:I

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/m0;Lj02/o0;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;Lad3/c;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    .line 3
    iput-object p2, p0, Lmp1/b;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lmp1/b;->c:Ljava/time/Clock;

    .line 5
    iput-object p4, p0, Lmp1/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 6
    iput-object p5, p0, Lmp1/b;->e:Lor2/y;

    .line 7
    iput-object p6, p0, Lmp1/b;->f:Lad3/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/m0;Lj02/o0;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_0

    .line 8
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p3

    const-string p7, "systemDefaultZone(...)"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lmp1/b;-><init>(Landroidx/fragment/app/m0;Lj02/o0;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;Lad3/c;)V

    return-void
.end method

.method private final a(Landroid/net/Uri;)V
    .locals 2

    const-string v0, "uri"

    const/4 v1, 0x0

    invoke-static {p1, v0, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lmp1/a$a;->a:Lmp1/a$a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-static {v1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v2, v1, Lmp1/a$g;

    if-eqz v2, :cond_1

    iget-object v1, v0, Lmp1/b;->b:Lj02/o0;

    sget-object v2, Lj02/m0$b2;->b:Lj02/m0$b2;

    invoke-interface {v1, v2}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v2, v1, Lmp1/a$h;

    if-eqz v2, :cond_3

    iget-object v1, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-static {v1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-virtual {v1}, Leb/a0;->m()Leb/q;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "refreshSettings"

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-static {v1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_3
    sget-object v2, Lmp1/a$d;->a:Lmp1/a$d;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v1, Lmp1/c;->EDUCATION:Lmp1/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/pregnancySettingsFragment?pregnancyScreen="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lmp1/b;->a(Landroid/net/Uri;)V

    return-void

    :cond_4
    instance-of v2, v1, Lmp1/a$b;

    if-eqz v2, :cond_a

    check-cast v1, Lmp1/a$b;

    invoke-virtual {v1}, Lmp1/a$b;->a()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->VIEW_ALL:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    const-string v4, "requireActivity(...)"

    if-ne v2, v3, :cond_8

    iget-object v2, v0, Lmp1/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "mx-content-search-android"

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$s0;

    invoke-virtual {v1}, Lmp1/a$b;->b()Lcom/whoop/util/TrendKey;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/util/TrendKey;->getTrendName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lj02/m0$s0;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_5
    iget-object v1, v0, Lmp1/b;->e:Lor2/y;

    iget-object v2, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_7

    sget v3, Lnf1/g;->c:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    move-object v6, v2

    goto :goto_2

    :cond_7
    :goto_1
    const-string v2, ""

    goto :goto_0

    :goto_2
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-static/range {v4 .. v9}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_8
    instance-of v2, v2, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz v2, :cond_10

    iget-object v2, v0, Lmp1/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "mx-trends-education-carousel-v2-android"

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lmp1/a$b;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "%26"

    const/4 v4, 0x0

    const-string v5, "&"

    invoke-static {v2, v5, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lmp1/a$b;->b()Lcom/whoop/util/TrendKey;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/util/TrendKey;->getTrendName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lmp1/a$b;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lmp1/a$b;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "&entryPoint="

    const-string v6, "&eventName=Education Tile&contentType="

    const-string v7, "android-app://com.whoop/education?path="

    invoke-static {v7, v2, v5, v3, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&articleId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lmp1/b;->a(Landroid/net/Uri;)V

    return-void

    :cond_9
    iget-object v2, v0, Lmp1/b;->e:Lor2/y;

    iget-object v3, v0, Lmp1/b;->a:Landroidx/fragment/app/m0;

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lmp1/a$b;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getUrl()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_a
    instance-of v2, v1, Lmp1/a$f;

    if-eqz v2, :cond_b

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$z;

    check-cast v1, Lmp1/a$f;

    invoke-virtual {v1}, Lmp1/a$f;->a()Ljava/lang/String;

    move-result-object v6

    sget-object v1, Ljava/time/format/DateTimeFormatter;->ISO_LOCAL_DATE:Ljava/time/format/DateTimeFormatter;

    iget-object v4, v0, Lmp1/b;->c:Ljava/time/Clock;

    invoke-static {v4}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v7

    const/16 v16, 0xff3

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_b
    instance-of v2, v1, Lmp1/a$i;

    if-eqz v2, :cond_c

    check-cast v1, Lmp1/a$i;

    invoke-virtual {v1}, Lmp1/a$i;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->getScreen()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lmp1/a$i;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/postPartumOnboarding?screen="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&id="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lmp1/b;->a(Landroid/net/Uri;)V

    return-void

    :cond_c
    instance-of v2, v1, Lmp1/a$e;

    if-nez v2, :cond_10

    instance-of v2, v1, Lmp1/a$c;

    if-eqz v2, :cond_d

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    check-cast v1, Lmp1/a$c;

    invoke-virtual {v1}, Lmp1/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_d
    instance-of v2, v1, Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_e

    check-cast v1, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v2, v0, Lmp1/b;->f:Lad3/c;

    invoke-static {v1, v2}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_e
    instance-of v2, v1, Lro1/g$e;

    if-eqz v2, :cond_f

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    check-cast v1, Lro1/g$e;

    invoke-virtual {v1}, Lro1/g$e;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_f
    instance-of v2, v1, Lro1/g$f;

    if-eqz v2, :cond_10

    iget-object v2, v0, Lmp1/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$b5;

    check-cast v1, Lro1/g$f;

    invoke-virtual {v1}, Lro1/g$f;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v5, v1, v4, v5}, Lj02/m0$b5;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    :cond_10
    return-void
.end method
