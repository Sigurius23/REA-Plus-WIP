.class public final Ln72/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln72/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u001e2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Ln72/d;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/sage/domain/models/SageResponse;",
        "response",
        "Ln72/d$a;",
        "accumulation",
        "c",
        "(Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;",
        "Lcom/whoop/sage/domain/models/SageBottomSheetModel;",
        "model",
        "Lm72/d;",
        "e",
        "(Lcom/whoop/sage/domain/models/SageBottomSheetModel;)Lm72/d;",
        "",
        "hasNavigatedToOnboarding",
        "Lm72/g$c;",
        "h",
        "(Lcom/whoop/sage/domain/models/SageResponse;Z)Lm72/g$c;",
        "viewState",
        "",
        "id",
        "d",
        "(Lm72/g$c;Ljava/lang/String;)Lm72/g$c;",
        "item",
        "g",
        "(Ljava/lang/Object;Ljava/lang/String;)Z",
        "Lec3/l;",
        "Ld72/b;",
        "upstream",
        "Lm72/g;",
        "f",
        "(Lec3/l;)Lec3/l;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "designSystemReducer",
        "sage_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Ln72/d;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln72/c;->f(Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Ln72/d;->a:Ljb1/a;

    return-void
.end method

.method public static final synthetic a(Ln72/d;Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln72/d;->c(Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ln72/d;Lm72/g$c;Ljava/lang/String;)Lm72/g$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln72/d;->d(Lm72/g$c;Ljava/lang/String;)Lm72/g$c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;
    .locals 8

    invoke-virtual {p2}, Ln72/d$a;->c()Z

    move-result v0

    invoke-direct {p0, p1, v0}, Ln72/d;->h(Lcom/whoop/sage/domain/models/SageResponse;Z)Lm72/g$c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageResponse;->getNavigationTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v3, p0, Ln72/d;->a:Ljb1/a;

    invoke-virtual {v3, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    instance-of v3, p1, Lhy0/h1;

    if-eqz v3, :cond_1

    move-object v1, p1

    check-cast v1, Lhy0/h1;

    :cond_1
    move-object v3, v1

    invoke-virtual {v0}, Lm72/g$c;->d()Lm72/a;

    move-result-object v4

    invoke-virtual {v0}, Lm72/g$c;->f()Lm72/c;

    move-result-object v5

    invoke-virtual {v0}, Lm72/g$c;->e()Z

    move-result v6

    invoke-virtual {v0}, Lm72/g$c;->i()Lm72/d;

    move-result-object v7

    new-instance v1, Lm72/g$c;

    invoke-direct/range {v1 .. v7}, Lm72/g$c;-><init>(Ljava/lang/String;Lhy0/h1;Lm72/a;Lm72/c;ZLm72/d;)V

    invoke-virtual {p2}, Ln72/d$a;->c()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lm72/g$c;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    invoke-virtual {p2, v1, p1}, Ln72/d$a;->a(Lm72/g;Z)Ln72/d$a;

    move-result-object p1

    return-object p1
.end method

.method private final d(Lm72/g$c;Ljava/lang/String;)Lm72/g$c;
    .locals 11

    invoke-virtual {p1}, Lm72/g$c;->d()Lm72/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lm72/a;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lm72/i;

    invoke-virtual {v4}, Lm72/i;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lm91/u;

    invoke-direct {p0, v6, p2}, Ln72/d;->g(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v4}, Lm72/i;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    move-object v3, v1

    goto :goto_2

    :cond_3
    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lm72/i;->b(Lm72/i;Ljava/lang/String;Lm72/h;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lm72/i;

    move-result-object v3

    :goto_2
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_3
    move-object v5, v2

    goto :goto_4

    :cond_5
    sget-object v2, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :goto_4
    invoke-virtual {p1}, Lm72/g$c;->d()Lm72/a;

    move-result-object v3

    if-eqz v3, :cond_6

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm72/a;->b(Lm72/a;ZLjava/util/List;Lep0/j;ILjava/lang/Object;)Lm72/a;

    move-result-object v1

    :cond_6
    move-object v5, v1

    const/16 v9, 0x3b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v10}, Lm72/g$c;->c(Lm72/g$c;Ljava/lang/String;Lhy0/h1;Lm72/a;Lm72/c;ZLm72/d;ILjava/lang/Object;)Lm72/g$c;

    move-result-object p1

    return-object p1
.end method

.method private final e(Lcom/whoop/sage/domain/models/SageBottomSheetModel;)Lm72/d;
    .locals 14

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lgz0/m0;->WHOOP_LOGO:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v0

    :goto_1
    if-nez v6, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getDescription()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Ln72/d;->a:Ljb1/a;

    invoke-virtual {v2, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v0

    :goto_3
    instance-of v2, v1, Lhy0/h1;

    if-eqz v2, :cond_4

    move-object v0, v1

    check-cast v0, Lhy0/h1;

    :cond_4
    move-object v11, v0

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getButtonText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v13

    new-instance v7, Lm72/d;

    invoke-direct/range {v7 .. v13}, Lm72/d;-><init>(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lhy0/h1;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v7

    :cond_5
    return-object v0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 1

    instance-of v0, p1, Lc41/p2;

    if-eqz v0, :cond_0

    check-cast p1, Lc41/p2;

    invoke-virtual {p1}, Lc41/p2;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final h(Lcom/whoop/sage/domain/models/SageResponse;Z)Lm72/g$c;
    .locals 34

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getLockedContent()Lcom/whoop/sage/domain/models/LockedContent;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getButtonStyle()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lm72/b;->DEFAULT:Lm72/b;

    invoke-static {}, Lm72/b;->values()[Lm72/b;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v8

    :goto_2
    sget-object v3, Lm72/b;->DEFAULT:Lm72/b;

    if-ne v4, v3, :cond_3

    sget-object v5, Li2/t;->b:Li2/s;

    sget-wide v3, Li2/x;->f:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v7, Li2/x;

    invoke-direct {v7, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v6, v7}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-wide/16 v9, 0x0

    const/16 v11, 0xe

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v11}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v3

    :goto_3
    move-object v8, v3

    goto :goto_4

    :cond_3
    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v3

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getLockedIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getHeaderTextDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getButtonTextDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->getButtonDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    new-instance v4, Lm72/c;

    invoke-direct/range {v4 .. v10}, Lm72/c;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    move-object v9, v4

    goto :goto_5

    :cond_4
    const/4 v9, 0x0

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getNavigationTagDialogContent()Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    move-result-object v1

    invoke-direct {v0, v1}, Ln72/d;->e(Lcom/whoop/sage/domain/models/SageBottomSheetModel;)Lm72/d;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getNavigationTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, v0, Ln72/d;->a:Ljb1/a;

    invoke-virtual {v3, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    goto :goto_6

    :cond_5
    const/4 v1, 0x0

    :goto_6
    instance-of v3, v1, Lhy0/h1;

    if-eqz v3, :cond_6

    check-cast v1, Lhy0/h1;

    move-object v7, v1

    goto :goto_7

    :cond_6
    const/4 v7, 0x0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getUnlockedContent()Lcom/whoop/sage/domain/models/UnlockedContent;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/UnlockedContent;->getHasOnboarded()Z

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/UnlockedContent;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/sage/domain/models/Section;

    invoke-virtual {v8}, Lcom/whoop/sage/domain/models/Section;->getTitleDisplay()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/sage/domain/models/Section;->getTitleStyle()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-static {v12}, Lm72/h;->valueOf(Ljava/lang/String;)Lm72/h;

    move-result-object v12

    if-nez v12, :cond_8

    :cond_7
    sget-object v12, Lm72/h;->LARGE:Lm72/h;

    :cond_8
    invoke-virtual {v8}, Lcom/whoop/sage/domain/models/Section;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8}, Lcom/whoop/sage/domain/models/Section;->getItems()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v2, v15

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v2, v2, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-nez v2, :cond_9

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v14, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v15, v0, Ln72/d;->a:Ljb1/a;

    invoke-virtual {v15, v14}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v14

    instance-of v15, v14, Ly71/o;

    if-eqz v15, :cond_b

    move-object/from16 v16, v14

    check-cast v16, Ly71/o;

    const/16 v32, 0x7bff

    const/16 v33, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v16 .. v33}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v14

    :cond_b
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_c
    new-instance v8, Lm72/i;

    invoke-direct {v8, v10, v12, v13, v2}, Lm72/i;-><init>(Ljava/lang/String;Lm72/h;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/sage/domain/models/SageResponse;->getMetadata()Lcom/whoop/sage/domain/models/MetaData;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v2

    goto :goto_b

    :cond_e
    const/4 v2, 0x0

    :goto_b
    new-instance v1, Lm72/a;

    invoke-direct {v1, v3, v4, v2}, Lm72/a;-><init>(ZLjava/util/List;Lep0/j;)V

    move-object v8, v1

    goto :goto_c

    :cond_f
    const/4 v8, 0x0

    :goto_c
    new-instance v5, Lm72/g$c;

    move/from16 v10, p2

    invoke-direct/range {v5 .. v11}, Lm72/g$c;-><init>(Ljava/lang/String;Lhy0/h1;Lm72/a;Lm72/c;ZLm72/d;)V

    return-object v5
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Ln72/d$a;

    sget-object v1, Lm72/g$b;->b:Lm72/g$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln72/d$a;-><init>(Lm72/g;Z)V

    new-instance v1, Ln72/d$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ln72/d$c;-><init>(Ln72/d;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Ln72/d$b;

    invoke-direct {p1, v2}, Ln72/d$b;-><init>(Lec3/l;)V

    return-object p1
.end method
