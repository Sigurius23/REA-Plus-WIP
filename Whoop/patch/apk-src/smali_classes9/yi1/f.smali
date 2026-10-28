.class public abstract Lyi1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "model",
        "Lyi1/l;",
        "I",
        "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;",
        "",
        "",
        "samples",
        "Lj71/c;",
        "H",
        "(Ljava/util/List;)Lj71/c;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "labradorCardReducer",
        "b",
        "shepherdTileReducer",
        "c",
        "healthHealthReducer",
        "kennel_release"
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

.field private static final b:Ljb1/a;

.field private static final c:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb1/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyi1/f;->a:Ljb1/a;

    new-instance v0, Lyb1/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyi1/f;->b:Ljb1/a;

    new-instance v0, Lyb1/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyi1/f;->c:Ljb1/a;

    return-void
.end method

.method private static final A(Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;)Lyi1/g;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;->getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    move-result-object v0

    invoke-static {v0}, Lyi1/f;->I(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;

    move-result-object v0

    new-instance v1, Lyi1/g;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;->getBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lyi1/g;-><init>(Lyi1/l;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method private static final B(Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;)Lyi1/j;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyi1/j;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, p0}, Lyi1/j;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final C(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->SHEPHERD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v9

    :goto_2
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    :goto_3
    if-ge v6, v7, :cond_4

    aget-object v9, v5, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    move-object v9, v8

    :goto_4
    if-nez v9, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v9

    :goto_5
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    goto :goto_6

    :cond_6
    move-object v0, v8

    :goto_6
    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object v6, p0

    goto :goto_7

    :cond_7
    move-object v6, v8

    :goto_7
    new-instance v1, Lyi1/o;

    invoke-direct/range {v1 .. v6}, Lyi1/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final D(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ld11/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lyi1/f$k;

    invoke-direct {v1}, Lyi1/f$k;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lyb1/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyb1/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyi1/f$l;

    invoke-direct {v3, v0}, Lyi1/f$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lyb1/a;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lyb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyi1/f$m;

    invoke-direct {v2, v0}, Lyi1/f$m;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;)Lyi1/i;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getTrendType()Lhy0/b2;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v6, :cond_1

    aget-object v9, v5, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v9

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getSamples()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lyi1/f;->H(Ljava/util/List;)Lj71/c;

    move-result-object v8

    :cond_3
    move-object v7, v8

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getReadings()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;

    new-instance v1, Lsk1/b;

    invoke-virtual {v0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;->getTrendType()Lhy0/b2;

    move-result-object v0

    invoke-direct {v1, v9, v0}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v1, Lyi1/i;

    invoke-direct/range {v1 .. v8}, Lyi1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Lgz0/m0;Lcom/whoop/navigation/e;Lj71/c;Ljava/util/List;)V

    return-object v1
.end method

.method private static final G(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/q;->p()I

    move-result v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_2
    move v5, v0

    goto :goto_3

    :cond_1
    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Ldc/b;->D(Lx81/d;)I

    move-result v0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    goto :goto_4

    :cond_2
    move-object v1, v0

    :goto_4
    sget-object v6, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object v6, p0

    goto :goto_5

    :cond_3
    move-object v6, v0

    :goto_5
    new-instance v1, Lyi1/o;

    invoke-direct/range {v1 .. v6}, Lyi1/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static final H(Ljava/util/List;)Lj71/c;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)",
            "Lj71/c;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "samples"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x3e4ccccd    # 0.2f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v2, 0x3ecccccd    # 0.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const v3, 0x3f19999a    # 0.6f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const v4, 0x3f4ccccd    # 0.8f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v10

    new-instance v9, Lj61/f;

    const/16 v17, 0x7e

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lj61/h;

    new-instance v7, Lh2/c;

    const v1, 0x3ccccccd    # 0.025f

    const v3, 0x3ca3d70a    # 0.02f

    invoke-direct {v7, v1, v3, v3, v3}, Lh2/c;-><init>(FFFF)V

    const/16 v17, 0x1fcf

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lj71/c;

    const/4 v1, 0x6

    invoke-static {v0, v3, v3, v1, v3}, Lrk1/b;->b(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)Lj71/b$g;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v11, v2

    invoke-direct/range {v10 .. v16}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10
.end method

.method private static final I(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    sget-object v5, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    sget-object v4, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v3, v8

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v4, v3

    :goto_4
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    :goto_5
    move v5, p0

    move-object v3, v0

    goto :goto_6

    :cond_5
    sget-object p0, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    goto :goto_5

    :goto_6
    new-instance v0, Lyi1/l;

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lyi1/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;II)V

    return-object v0
.end method

.method private static final J(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyb1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyb1/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyi1/f$n;

    invoke-direct {v3, v0}, Lyi1/f$n;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lyb1/a;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lyb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyi1/f$o;

    invoke-direct {v2, v0}, Lyi1/f$o;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;)Lyi1/p;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyi1/n;->Companion:Lyi1/n$a;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getAfibState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyi1/n$a;->a(Ljava/lang/String;)Lyi1/n;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getMenuItem()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getMenuItem()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getMenuItem()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lyi1/n;->getIconImage()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    sget-object v2, Lgz0/m0;->SHEPHERD:Lgz0/m0;

    :cond_1
    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/4 v9, 0x0

    if-ge v8, v6, :cond_3

    aget-object v10, v5, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    move-object v10, v9

    :goto_1
    if-nez v10, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v10

    :goto_2
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getMenuItem()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v8, v6

    :goto_3
    if-ge v7, v8, :cond_6

    aget-object v10, v6, v7

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    move-object v10, v9

    :goto_4
    if-nez v10, :cond_7

    goto :goto_5

    :cond_7
    move-object v2, v10

    :goto_5
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getMenuItem()Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    goto :goto_6

    :cond_8
    move-object v1, v9

    :goto_6
    sget-object v2, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    move-object v7, p0

    goto :goto_7

    :cond_9
    move-object v7, v9

    :goto_7
    new-instance v2, Lyi1/o;

    invoke-direct/range {v2 .. v7}, Lyi1/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V

    new-instance p0, Lyi1/p;

    invoke-direct {p0, v2, v0}, Lyi1/p;-><init>(Lyi1/o;Lyi1/n;)V

    return-object p0
.end method

.method private static final M(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->SHEPHERD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v9

    :goto_2
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    :goto_3
    if-ge v6, v7, :cond_4

    aget-object v9, v5, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    move-object v9, v8

    :goto_4
    if-nez v9, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v9

    :goto_5
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    goto :goto_6

    :cond_6
    move-object v0, v8

    :goto_6
    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object v6, p0

    goto :goto_7

    :cond_7
    move-object v6, v8

    :goto_7
    new-instance v1, Lyi1/o;

    invoke-direct/range {v1 .. v6}, Lyi1/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyi1/f;->D(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;)Lhy0/e;
    .locals 0

    invoke-static {p0}, Lyi1/f;->z(Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;)Lhy0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;)Lyi1/p;
    .locals 0

    invoke-static {p0}, Lyi1/f;->L(Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;)Lyi1/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;)Lyi1/m;
    .locals 0

    invoke-static {p0}, Lyi1/f;->x(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;)Lyi1/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyi1/f;->u(Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyi1/f;->t(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;)Lyi1/j;
    .locals 0

    invoke-static {p0}, Lyi1/f;->B(Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;)Lyi1/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 0

    invoke-static {p0}, Lyi1/f;->C(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 0

    invoke-static {p0}, Lyi1/f;->M(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyi1/f;->E(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;)Lyi1/i;
    .locals 0

    invoke-static {p0}, Lyi1/f;->F(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;)Lyi1/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;)Lyi1/a;
    .locals 0

    invoke-static {p0}, Lyi1/f;->v(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;)Lyi1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;)Lyi1/g;
    .locals 0

    invoke-static {p0}, Lyi1/f;->A(Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;)Lyi1/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;
    .locals 0

    invoke-static {p0}, Lyi1/f;->G(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;)Lyi1/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;)Lyi1/h;
    .locals 0

    invoke-static {p0}, Lyi1/f;->y(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;)Lyi1/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyi1/f;->K(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyi1/f;->J(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;)Lyi1/k;
    .locals 0

    invoke-static {p0}, Lyi1/f;->w(Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;)Lyi1/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s()Ljb1/a;
    .locals 1

    sget-object v0, Lyi1/f;->c:Ljb1/a;

    return-object v0
.end method

.method private static final t(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lh51/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lyi1/f$a;

    invoke-direct {v1}, Lyi1/f$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lkx1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lkx1/a;-><init>(Ljb1/b;I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljb1/b;Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyb1/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyi1/f$c;

    invoke-direct {v3, v0}, Lyi1/f$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lyb1/a;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lyb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyi1/f$d;

    invoke-direct {v3, v0}, Lyi1/f$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lyb1/a;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lyb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyi1/f$e;

    invoke-direct {v3, v0}, Lyi1/f$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v0, Lyi1/k;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lyi1/f$b;

    invoke-direct {v2}, Lyi1/f$b;-><init>()V

    invoke-virtual {p0, v0, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lyb1/a;

    const/16 v0, 0xd

    invoke-direct {p0, v0}, Lyb1/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lyi1/f$f;

    invoke-direct {v2, p0}, Lyi1/f$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lyb1/a;

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lyb1/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lyi1/f$g;

    invoke-direct {v2, p0}, Lyi1/f$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lyb1/a;

    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lyb1/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/monitor/medical/domain/model/HeartScreenerIntroModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lyi1/f$h;

    invoke-direct {v2, p0}, Lyi1/f$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lyb1/a;

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lyb1/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/monitor/medical/domain/model/NewFeatureTagModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lyi1/f$i;

    invoke-direct {v2, p0}, Lyi1/f$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lyb1/a;

    const/16 v0, 0x11

    invoke-direct {p0, v0}, Lyb1/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lyi1/f$j;

    invoke-direct {v1, p0}, Lyi1/f$j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;)Lyi1/a;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyi1/a;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthProfileIneligibleModel;->getIconUrl()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v2, v3}, Lyi1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V

    return-object v0
.end method

.method private static final w(Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;)Lyi1/k;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;->getCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CtaTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/whoop/navigation/AppScreen$j5;->w:Lcom/whoop/navigation/AppScreen$j5;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lvi1/a;->Shepherd:Lvi1/a;

    goto :goto_1

    :cond_1
    sget-object v0, Lvi1/a;->Labrador:Lvi1/a;

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;->getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    move-result-object v1

    invoke-static {v1}, Lyi1/f;->I(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;

    move-result-object v1

    new-instance v2, Lyi1/k;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;->getBody()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/OnboardingCardModel;->getCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object p0

    invoke-static {p0}, Llb1/a5;->d0(Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;

    move-result-object p0

    invoke-direct {v2, v0, v1, v3, p0}, Lyi1/k;-><init>(Ljava/lang/Object;Lyi1/l;Lcom/whoop/design/util/TextResource;Ld11/i;)V

    return-object v2
.end method

.method private static final x(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;)Lyi1/m;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    move-result-object v0

    invoke-static {v0}, Lyi1/f;->I(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;

    move-result-object v0

    sget-object v1, Lyi1/f;->b:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lyi1/m;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->getBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object p0

    invoke-direct {v2, v0, p0, v1}, Lyi1/m;-><init>(Lyi1/l;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v2
.end method

.method private static final y(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;)Lyi1/h;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyi1/f;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    move-result-object v1

    invoke-static {v1}, Lyi1/f;->I(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getError()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lyi1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lti1/d;->c:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lyi1/l;->b(Lyi1/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;IIILjava/lang/Object;)Lyi1/l;

    move-result-object v2

    :cond_0
    new-instance v1, Lyi1/h;

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getError()Z

    move-result p0

    invoke-direct {v1, v2, p0, v0}, Lyi1/h;-><init>(Lyi1/l;ZLjava/util/List;)V

    return-object v1
.end method

.method private static final z(Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;)Lhy0/e;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;->getLabel()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, p0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    goto :goto_0

    :goto_2
    new-instance v0, Lhy0/e;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
