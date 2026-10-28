.class public abstract Lb02/b;
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
        "h",
        "()Ljb1/a;",
        "pdpReducer",
        "native-store_release"
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

    new-instance v0, Lb01/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lb02/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb02/b;->l(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;
    .locals 0

    invoke-static {p0}, Lb02/b;->o(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb02/b;->j(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb02/b;->n(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb02/b;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;
    .locals 0

    invoke-static {p0}, Lb02/b;->k(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;
    .locals 0

    invoke-static {p0}, Lb02/b;->m(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Ljb1/a;
    .locals 1

    sget-object v0, Lb02/b;->a:Ljb1/a;

    return-object v0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lyz1/b;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    invoke-static {}, Lyz1/c;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    invoke-static {}, Lyz1/d;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    invoke-static {}, Lyz1/f;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    invoke-static {}, Lyz1/a;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    invoke-static {}, Lyz1/h;->d()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    new-instance v0, Lb01/f;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lb01/f;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lb01/f;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    const-class v0, Lc41/p2;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lb02/b$e;

    invoke-direct {v1}, Lb02/b$e;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb01/f;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lb02/b$f;

    invoke-direct {v2, v0}, Lb02/b$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyz1/e;->a(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb01/f;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TagSelectorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lb02/b$g;

    invoke-direct {v2, v0}, Lb02/b$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lb02/b;->a:Ljb1/a;

    invoke-static {}, Lb02/g;->a()Ln81/d;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Llb1/r4;->g(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;ILjava/lang/Object;)Ln81/f;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb01/f;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lb01/f;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ItemsCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lb02/b$h;

    invoke-direct {v2, v0}, Lb02/b$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb02/b;->a:Ljb1/a;

    invoke-static {p0, v0}, Llb1/m2;->d(Lcom/whoop/design/models/items/ItemsCardModel;Ljb1/a;)Lv71/i;

    move-result-object v1

    const/4 p0, 0x0

    int-to-float p0, p0

    new-instance v7, Ll0/l1;

    invoke-direct {v7, p0, p0, p0, p0}, Ll0/l1;-><init>(FFFF)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lv71/i;->b(Lv71/i;Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILjava/lang/Object;)Lv71/i;

    move-result-object p0

    return-object p0
.end method
