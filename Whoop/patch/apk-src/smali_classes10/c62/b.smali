.class public abstract Lc62/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "recoveryImpactsDesignItemReducer",
        "recovery-impacts-mini-arch_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc31/m;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lc31/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lc62/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;)Ld62/h;
    .locals 0

    invoke-static {p0}, Lc62/b;->g(Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;)Ld62/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc62/b;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc62/b;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lc62/b;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc62/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc62/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc62/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc62/a;-><init>(I)V

    const-class v1, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lc62/b$a;

    invoke-direct {v2, v0}, Lc62/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;)Ld62/h;
    .locals 28

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {v0, v2}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/ImpactModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImpactModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImpactModel;->getBackgroundEnabled()Z

    move-result v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImpactModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImpactModel;->getTrend()Lhy0/b2;

    move-result-object v13

    new-instance v10, Lhy0/c2;

    const/16 v26, 0x7ee0

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v10 .. v27}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Ld62/h;

    invoke-direct/range {v3 .. v9}, Ld62/h;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-object v3
.end method
