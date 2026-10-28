.class public final Le02/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Le02/h;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "e",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;)Ljava/util/List;",
        "Lm91/u;",
        "c",
        "(Lm91/u;)Lm91/u;",
        "Lc02/b;",
        "domainResult",
        "Le02/g;",
        "d",
        "(Lc02/b;)Le02/g;",
        "a",
        "Ljb1/a;",
        "native-store_release"
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

    sput v0, Le02/h;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le02/h;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Ldo0/c;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Ldo0/c;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Le02/h;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le02/h;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final c(Lm91/u;)Lm91/u;
    .locals 18

    move-object/from16 v0, p1

    instance-of v1, v0, Lv51/c;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lv51/c;

    sget-object v0, Lp3/r;->x:Lp3/r;

    sget-object v7, Lp3/r;->J:Lp3/r;

    const/16 v16, 0x1fcf

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lv51/c;->b(Lv51/c;Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILjava/lang/Object;)Lv51/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final e(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getSegmentedContentTile()Lcom/whoop/design/models/items/SegmentedContentModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getDivider()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getExpandableContent()Lcom/whoop/design/models/items/ExpandableContentModel;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final d(Lc02/b;)Le02/g;
    .locals 9

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc02/b$c;->a:Lc02/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Le02/g;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Le02/g;-><init>(ZZLe02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    sget-object v0, Lc02/b$a;->a:Lc02/b$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Le02/g;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Le02/g;-><init>(ZZLe02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lc02/b$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Le02/h;->a:Ljb1/a;

    check-cast p1, Lc02/b$b;

    invoke-virtual {p1}, Lc02/b$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;

    move-result-object v1

    invoke-direct {p0, v1}, Le02/h;->e(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    invoke-direct {p0, v2}, Le02/h;->c(Lm91/u;)Lm91/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v2, Le02/g;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Le02/g;-><init>(ZZLe02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    new-instance v3, Le02/g;

    new-instance v6, Le02/a;

    invoke-virtual {p1}, Lc02/b$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lc02/b$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lc02/b$b;->a()Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v0, v2, p1, v1}, Le02/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Le02/g;-><init>(ZZLe02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
