.class public final Ljd0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljd0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Ljd0/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Ltr2/n;",
        "logger",
        "Lya0/a;",
        "analyticsHelper",
        "<init>",
        "(Lj02/o0;Leb/a0;Lj02/i0;Ltr2/n;Lya0/a;)V",
        "Lj02/s;",
        "dismissalType",
        "Ll83/a0;",
        "c",
        "(Lj02/s;)V",
        "Lm91/u;",
        "b",
        "(Lm91/u;)V",
        "",
        "d",
        "()Ljava/lang/String;",
        "Lkd0/a$a0;",
        "event",
        "e",
        "(Lkd0/a$a0;)V",
        "a",
        "Lj02/o0;",
        "Leb/a0;",
        "Lj02/i0;",
        "Ltr2/n;",
        "Lya0/a;",
        "f",
        "advanced-labs_release"
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
.field public static final f:Ljd0/c$a;

.field public static final g:I

.field private static final h:Ljava/lang/String;


# instance fields
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Lj02/i0;

.field private final d:Ltr2/n;

.field private final e:Lya0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljd0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljd0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljd0/c;->f:Ljd0/c$a;

    const/16 v0, 0x8

    sput v0, Ljd0/c;->g:I

    const-string v0, "Advanced Labs"

    sput-object v0, Ljd0/c;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lj02/o0;Leb/a0;Lj02/i0;Ltr2/n;Lya0/a;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljd0/c;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Ljd0/c;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Ljd0/c;->c:Lj02/i0;

    .line 5
    iput-object p4, p0, Ljd0/c;->d:Ltr2/n;

    .line 6
    iput-object p5, p0, Ljd0/c;->e:Lya0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lj02/i0;Ltr2/n;Lya0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 7
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 8
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "AdvancedLabsNavigationRouter"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Ljd0/c;-><init>(Lj02/o0;Leb/a0;Lj02/i0;Ltr2/n;Lya0/a;)V

    return-void
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Ljd0/c;->h:Ljava/lang/String;

    return-object v0
.end method

.method private final b(Lm91/u;)V
    .locals 1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljd0/c;->a:Lj02/o0;

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Llf0/d1;

    if-eqz v0, :cond_1

    check-cast p1, Llf0/d1;

    invoke-virtual {p1}, Llf0/d1;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Ljd0/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    :cond_1
    return-void
.end method

.method private final c(Lj02/s;)V
    .locals 3

    iget-object v0, p0, Ljd0/c;->b:Leb/a0;

    invoke-virtual {p1}, Lj02/s;->b()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v1

    invoke-virtual {p1}, Lj02/s;->a()Ljava/lang/Integer;

    move-result-object p1

    iget-object v2, p0, Ljd0/c;->d:Ltr2/n;

    invoke-static {v0, v1, p1, v2}, Lcom/whoop/navigation/d;->d(Leb/a0;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Ltr2/n;)Z

    return-void
.end method

.method private final d()Ljava/lang/String;
    .locals 1

    const-string v0, "android-app://com.whoop/onboardingStoriesFragmentRedesign/ADVANCED_LABS_EARLY_ACCESS_ONBOARDING"

    return-object v0
.end method


# virtual methods
.method public final e(Lkd0/a$a0;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lkd0/a$j;

    if-eqz v2, :cond_0

    iget-object v2, v0, Ljd0/c;->a:Lj02/o0;

    check-cast v1, Lkd0/a$j;

    invoke-virtual {v1}, Lkd0/a$j;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v2, v1, Lkd0/a$d;

    if-eqz v2, :cond_1

    check-cast v1, Lkd0/a$d;

    invoke-virtual {v1}, Lkd0/a$d;->a()Lm91/u;

    move-result-object v1

    invoke-direct {v0, v1}, Ljd0/c;->b(Lm91/u;)V

    return-void

    :cond_1
    instance-of v2, v1, Lkd0/a$h;

    if-eqz v2, :cond_4

    check-cast v1, Lkd0/a$h;

    invoke-virtual {v1}, Lkd0/a$h;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getType()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/models/items/ArticleTileCarouselModelKt;->isVideo(Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Ljd0/c;->a:Lj02/o0;

    new-instance v3, Lj02/m0$g3;

    invoke-virtual {v1}, Lkd0/a$h;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lj02/m0$g3;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    invoke-virtual {v1}, Lkd0/a$h;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, Ljd0/c;->a:Lj02/o0;

    new-instance v4, Lj02/m0$f3;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$h;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    move-object v6, v1

    sget-object v7, Ljd0/c;->h:Ljava/lang/String;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    instance-of v2, v1, Lkd0/a$y;

    if-eqz v2, :cond_5

    iget-object v1, v0, Ljd0/c;->c:Lj02/i0;

    invoke-direct {v0}, Ljd0/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    iget-object v2, v0, Ljd0/c;->b:Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_5
    instance-of v2, v1, Lkd0/a$t;

    if-eqz v2, :cond_6

    iget-object v1, v0, Ljd0/c;->e:Lya0/a;

    sget-object v2, Lkd0/a$z0;->a:Lkd0/a$z0;

    invoke-virtual {v1, v2}, Lya0/a;->e(Lkd0/a$c;)V

    iget-object v1, v0, Ljd0/c;->b:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_6
    instance-of v2, v1, Lkd0/a$i0;

    if-eqz v2, :cond_7

    check-cast v1, Lkd0/a$i0;

    invoke-virtual {v1}, Lkd0/a$i0;->a()Lj02/s;

    move-result-object v1

    invoke-direct {v0, v1}, Ljd0/c;->c(Lj02/s;)V

    return-void

    :cond_7
    instance-of v2, v1, Lkd0/a$z;

    if-eqz v2, :cond_8

    iget-object v2, v0, Ljd0/c;->a:Lj02/o0;

    new-instance v3, Lj02/m0$f5;

    check-cast v1, Lkd0/a$z;

    invoke-virtual {v1}, Lkd0/a$z;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lj02/m0$f5;-><init>(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;IZLcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_8
    instance-of v2, v1, Lkd0/a$h1;

    if-eqz v2, :cond_9

    iget-object v2, v0, Ljd0/c;->a:Lj02/o0;

    new-instance v3, Lj02/m0$z;

    check-cast v1, Lkd0/a$h1;

    invoke-virtual {v1}, Lkd0/a$h1;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v16, 0xffb

    const/16 v17, 0x0

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

    invoke-direct/range {v3 .. v17}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
