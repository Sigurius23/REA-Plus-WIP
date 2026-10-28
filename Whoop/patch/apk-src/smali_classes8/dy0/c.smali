.class public abstract Ldy0/c;
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
        "g",
        "()Ljb1/a;",
        "itemReducer",
        "deep-dive_release"
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

    new-instance v0, Ldo0/c;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ldy0/c;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;)Ld62/d;
    .locals 0

    invoke-static {p0}, Ldy0/c;->l(Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;)Ld62/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;)Lkm2/g;
    .locals 0

    invoke-static {p0}, Ldy0/c;->j(Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;)Lkm2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/a;Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;)Lqu1/d;
    .locals 0

    invoke-static {p0, p1}, Ldy0/c;->k(Ljb1/a;Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;)Lqu1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/a;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldy0/c;->i(Ljb1/a;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/a;Lcom/whoop/design/models/items/ContributorTileModel;)Lc41/i1;
    .locals 0

    invoke-static {p0, p1}, Ldy0/c;->m(Ljb1/a;Lcom/whoop/design/models/items/ContributorTileModel;)Lc41/i1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldy0/c;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Ljb1/a;
    .locals 1

    sget-object v0, Ldy0/c;->a:Ljb1/a;

    return-object v0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    new-instance v1, Ldy0/b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ldy0/b;-><init>(Ljb1/a;I)V

    invoke-virtual {p0, v1}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljb1/a;Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldo0/c;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldy0/c$a;

    invoke-direct {v3, v0}, Ldy0/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldy0/b;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Ldy0/b;-><init>(Ljb1/a;I)V

    const-class v2, Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldy0/c$b;

    invoke-direct {v3, v0}, Ldy0/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldo0/c;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Ldo0/c;-><init>(I)V

    const-class v2, Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldy0/c$c;

    invoke-direct {v3, v0}, Ldy0/c$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldy0/b;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Ldy0/b;-><init>(Ljb1/a;I)V

    const-class p0, Lcom/whoop/design/models/items/ContributorTileModel;

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v1, Ldy0/c$d;

    invoke-direct {v1, v0}, Ldy0/c$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;)Lkm2/g;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkm2/g;

    new-instance v1, Lim2/c;

    new-instance v2, Lim2/c$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lim2/c$a;-><init>(Le31/c;Lim2/a;Lim2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lim2/c;-><init>(Lim2/c$a;Lim2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;->getPath()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-direct {v0, v1, p0}, Lkm2/g;-><init>(Lim2/c;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final k(Ljb1/a;Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;)Lqu1/d;
    .locals 11

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqu1/d;

    invoke-virtual {p1}, Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;->getPath()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    new-instance v2, Lqu1/f;

    invoke-virtual {p1}, Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;->getHeaderSection()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p0

    check-cast v4, Lp31/l;

    new-instance v5, Lqu1/g;

    sget-object p0, Le31/d;->a:Le31/d;

    invoke-virtual {p0}, Le31/d;->a()Le31/c;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lqu1/g;-><init>(Le31/c;Lqu1/c;Lqu1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x5

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lqu1/f;-><init>(Lqu1/h;Lp31/l;Luu1/c;Lqu1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v2}, Lqu1/d;-><init>(Ljava/lang/String;Lqu1/f;)V

    return-object v0
.end method

.method private static final l(Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;)Ld62/d;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;->getPath()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    sget-object v0, Lc62/c$b;->a:Lc62/c$b;

    new-instance v1, Ld62/d;

    invoke-direct {v1, v0, p0}, Ld62/d;-><init>(Lc62/c;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final m(Ljb1/a;Lcom/whoop/design/models/items/ContributorTileModel;)Lc41/i1;
    .locals 9

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.ContributorTileState"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lc41/i1;

    invoke-virtual {v0}, Lc41/i1;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    int-to-float v6, p0

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lc41/i1;->b(Lc41/i1;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm91/u;Ljava/util/List;FILjava/lang/Object;)Lc41/i1;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method
