.class public abstract Ldc1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldc1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "style",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "theme",
        "Lk61/a;",
        "X",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lk61/a;",
        "y",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;)Lk61/a;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final A(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->g0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j0()J

    move-result-wide v1

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->g0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->o0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final M(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->g0()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final O(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->h0()J

    move-result-wide v1

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final P(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->l0()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->l0()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final Q(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->i0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final R(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->o0()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->o0()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final S(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->m0()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->m0()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final T(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->i0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final U(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final V(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->n0()J

    move-result-wide v1

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->n0()J

    move-result-wide v1

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final W(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final X(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lk61/a;
    .locals 2

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillColor()Ly81/f;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance p0, Lk61/a;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillOpacity()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ldc1/a;->a(Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)F

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v0, p1}, Li91/c;->n(Ly81/e;Ljava/lang/Float;)Li91/a;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    invoke-static {p0}, Ldc1/d;->y(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;)Lk61/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->J(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->N(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->B(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->H(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->W(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->O(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->S(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->D(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->T(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->V(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->K(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->Q(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->z(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->R(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->U(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->I(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->C(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->M(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->P(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->E(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->F(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->A(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->G(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/d;->L(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;)Lk61/a;
    .locals 4

    sget-object v0, Ldc1/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    return-object v1

    :pswitch_0
    new-instance p0, Lk61/a;

    sget-object v0, Ldc1/d$h;->w:Ldc1/d$h;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Ldc1/d$i;->w:Ldc1/d$i;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_1
    new-instance p0, Lk61/a;

    sget-object v0, Ldc1/d$f;->w:Ldc1/d$f;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Ldc1/d$g;->w:Ldc1/d$g;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_2
    new-instance p0, Lk61/a;

    sget-object v0, Ldc1/d$d;->w:Ldc1/d$d;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Ldc1/d$e;->w:Ldc1/d$e;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_3
    new-instance p0, Lk61/a;

    sget-object v0, Ldc1/d$b;->w:Ldc1/d$b;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Ldc1/d$c;->w:Ldc1/d$c;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_4
    new-instance p0, Lk61/a;

    new-instance v2, Lcom/whoop/data/repositories/f;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_5
    new-instance p0, Lk61/a;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    const-wide v1, 0xff413148L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Li91/c;->o(J)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_6
    new-instance p0, Lk61/a;

    new-instance v2, Lcom/whoop/data/repositories/f;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_7
    new-instance p0, Lk61/a;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_8
    new-instance p0, Lk61/a;

    new-instance v0, Ldc1/c;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Ldc1/c;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_9
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_a
    new-instance p0, Lk61/a;

    new-instance v0, Ldc1/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Ldc1/c;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_b
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_c
    new-instance p0, Lk61/a;

    new-instance v0, Ldc1/c;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    const-wide v1, 0xff312445L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Li91/c;->o(J)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_d
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_e
    new-instance p0, Lk61/a;

    new-instance v0, Ldc1/c;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Ldc1/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_f
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_10
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_11
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_12
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_13
    new-instance p0, Lk61/a;

    new-instance v2, Ldc1/c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_14
    new-instance p0, Lk61/a;

    new-instance v2, Lcom/whoop/data/repositories/f;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_15
    new-instance p0, Lk61/a;

    new-instance v2, Lcom/whoop/data/repositories/f;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_16
    new-instance p0, Lk61/a;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final z(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->g0()J

    move-result-wide v1

    const v3, 0x3e99999a    # 0.3f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
