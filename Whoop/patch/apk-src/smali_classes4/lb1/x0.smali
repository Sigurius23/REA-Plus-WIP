.class public abstract Llb1/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/x0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DesignItemGridModel;",
        "model",
        "Lt51/c;",
        "d",
        "(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;",
        "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
        "Lb2/g;",
        "i",
        "(Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;)Lb2/g;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "h",
        "()Llb1/y0;",
        "designItemGridMapper",
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

    new-instance v0, Llb1/i0;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/x0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/x0;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/x0;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;
    .locals 0

    invoke-static {p0}, Llb1/x0;->f(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getItems()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v4, Lt51/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getColumnWidth()D

    move-result-wide v0

    double-to-float v6, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getMinHorizontalSpacing()D

    move-result-wide v0

    double-to-float v8, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getMinVerticalSpacing()D

    move-result-wide v0

    double-to-float v9, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getMinHorizontalPadding()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getMinVerticalPadding()D

    move-result-wide v1

    double-to-float v1, v1

    new-instance v10, Ll0/l1;

    invoke-direct {v10, v0, v1, v0, v1}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getVerticalAlignment()Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;->CENTER:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    :cond_0
    invoke-static {v0}, Llb1/x0;->i(Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;)Lb2/g;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DesignItemGridModel;->getNumberOfColumns()Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v13}, Lt51/c;-><init>(Ljava/lang/String;FLjava/util/List;FFLl0/k1;Lb2/g;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/DesignItemGridModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/x0$b;

    invoke-direct {v2, v0}, Llb1/x0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/x0;->d(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/x0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;)Lb2/g;
    .locals 1

    sget-object v0, Llb1/x0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lb2/e;->K:Lb2/l;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lb2/e;->L:Lb2/l;

    return-object p0

    :cond_2
    sget-object p0, Lb2/e;->J:Lb2/l;

    return-object p0
.end method
