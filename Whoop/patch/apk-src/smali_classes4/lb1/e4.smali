.class public abstract Llb1/e4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SectionModel;",
        "Lk81/e;",
        "g",
        "(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "sectionMapper",
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


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/x3;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/e4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e4;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e4;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;
    .locals 0

    invoke-static {p0}, Llb1/e4;->f(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/e4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SectionModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/e4$a;

    invoke-direct {v2, v0}, Llb1/e4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/e4;->g(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getItems()Ljava/util/List;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v1, v6, v5, v6}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v0, v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getSectionTopPadding()F

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getSectionBottomPadding()F

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getInterItemPadding()F

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->getAlignment()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    sget-object v9, Lk81/a;->LEADING:Lk81/a;

    invoke-static {}, Lk81/a;->values()[Lk81/a;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_2

    aget-object v13, v10, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    move-object v0, v13

    goto :goto_1

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v9, v0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SectionModel;->isVisible()Z

    move-result v10

    new-instance v1, Lk81/e;

    invoke-direct/range {v1 .. v10}, Lk81/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;Z)V

    return-object v1
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    const-class v0, Lny0/h;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Llb1/e4$b;

    invoke-direct {v1}, Llb1/e4$b;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
