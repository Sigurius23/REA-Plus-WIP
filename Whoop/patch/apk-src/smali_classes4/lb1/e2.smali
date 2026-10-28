.class public abstract Llb1/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "model",
        "Lhy0/h0;",
        "h",
        "(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;",
        "Lcom/whoop/design/models/items/ImageCardPickerModel;",
        "Lh21/d;",
        "i",
        "(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "imageUrlMapper",
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

    new-instance v0, Llb1/t1;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/e2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e2;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;
    .locals 0

    invoke-static {p0}, Llb1/e2;->f(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;
    .locals 0

    invoke-static {p0}, Llb1/e2;->g(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/e2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/ImageUrlModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/e2$a;

    invoke-direct {v3, v0}, Llb1/e2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ImageCardPickerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/e2$b;

    invoke-direct {v2, v0}, Llb1/e2$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/e2;->h(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/e2;->i(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/models/items/ImageUrlModel;)Lhy0/h0;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getCaptionDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getAlignment()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lhy0/c0;->values()[Lhy0/c0;

    move-result-object v5

    array-length v6, v5

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v4

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getWidth()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getHeight()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getShape()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lhy0/g0;->values()[Lhy0/g0;

    move-result-object v7

    array-length v9, v7

    :goto_2
    if-ge v2, v9, :cond_3

    aget-object v10, v7, v2

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    move-object v4, v10

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    move-object v7, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageUrlModel;->getInline()Z

    move-result p0

    move-object v2, v1

    new-instance v1, Lhy0/h0;

    move-object v4, v8

    move v8, p0

    invoke-direct/range {v1 .. v8}, Lhy0/h0;-><init>(Lkd1/o;Ljava/lang/String;Lhy0/c0;Ljava/lang/Integer;Ljava/lang/Integer;Lhy0/g0;Z)V

    return-object v1
.end method

.method public static final i(Lcom/whoop/design/models/items/ImageCardPickerModel;)Lh21/d;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageCardPickerModel;->getCards()Ljava/util/List;

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

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ImageCardModel;

    new-instance v3, Lh21/e;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImageCardModel;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImageCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImageCardModel;->getLabel()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lh21/e;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ImageCardPickerModel;->getSelectedCardId()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lh21/d;

    invoke-direct {v0, v1, p0}, Lh21/d;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method
